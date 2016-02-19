package org.domeos.api.controller.global;

import org.domeos.basemodel.HttpResponseTemp;
import org.domeos.basemodel.ResultStat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by feiliu206363 on 2016/1/18.
 */
@Controller
@RequestMapping("/api/global/version")
public class DomeosController {
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET)
    HttpResponseTemp<?> listGitConfigs() {
        return ResultStat.OK.wrap("0.1");
    }
}
