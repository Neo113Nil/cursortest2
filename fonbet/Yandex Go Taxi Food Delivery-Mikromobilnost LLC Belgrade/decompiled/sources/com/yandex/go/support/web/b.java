package com.yandex.go.support.web;

import defpackage.fi7;
import defpackage.sls;
import defpackage.tls;
import defpackage.wnt;
import defpackage.zjw0;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.web.WebContentView;
import ru.yandex.taxi.web.calljsinterface.CallJsInterfaceApi;

/* loaded from: classes14.dex */
public final class b extends fi7 {
    public final zjw0 a;
    public final wnt b;
    public final sls c;
    public final tls d;

    public b(zjw0 zjw0Var, wnt wntVar, sls slsVar, tls tlsVar) {
        this.a = zjw0Var;
        this.b = wntVar;
        this.c = slsVar;
        this.d = tlsVar;
    }

    @Override // defpackage.fi7
    public final void a(WebContentView webContentView, CallJsInterfaceApi callJsInterfaceApi) {
        callJsInterfaceApi.addMethod("requestHideWebView", new CommonSupportCallJsInterfaceFactory$applyPlugins$1(2, this, b.class, "hideWebView", "hideWebView(Ljava/lang/String;)Lru/yandex/taxi/web/calljsinterface/CallJsInterfaceApi$MethodResult;", 4));
        callJsInterfaceApi.addMethod("updateUnreadCount", new CommonSupportCallJsInterfaceFactory$applyPlugins$2(2, this, b.class, "updateUnreadMessages", "updateUnreadMessages(Ljava/lang/String;)Lru/yandex/taxi/web/calljsinterface/CallJsInterfaceApi$MethodResult;", 4));
        callJsInterfaceApi.addMethod("sendAnalyticsEvent", new CommonSupportCallJsInterfaceFactory$applyPlugins$3(2, this, b.class, "sendAnalyticsEvent", "sendAnalyticsEvent(Ljava/lang/String;)Lru/yandex/taxi/web/calljsinterface/CallJsInterfaceApi$MethodResult;", 4));
        callJsInterfaceApi.addMethod(ConfigConstants.CONFIG, new CommonSupportCallJsInterfaceFactory$applyPlugins$4(2, this, b.class, ConfigConstants.CONFIG, "config(Ljava/lang/String;)Lru/yandex/taxi/web/calljsinterface/CallJsInterfaceApi$MethodResult;", 4));
    }
}
