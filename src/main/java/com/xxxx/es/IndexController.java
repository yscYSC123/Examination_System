package com.xxxx.es;

import com.xxxx.es.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController{

    /**
     * 系统登录页面
     */
    @RequestMapping("index")
    public String index(){
        return "index";
    }

    /**
     * 系统欢迎页面
     */
    @RequestMapping("welcome")
    public String welcome(){
        return "welcome";
    }

    /**
     * 后端管理主页面
     */
    @RequestMapping("main")
    public String main(){
        return "main";
    }


}
