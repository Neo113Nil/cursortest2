package com.yandex.go.charity.js;

import defpackage.fi7;
import defpackage.hza;
import defpackage.sh41;
import ru.yandex.taxi.web.WebContentView;
import ru.yandex.taxi.web.calljsinterface.CallJsInterfaceApi;

/* loaded from: classes12.dex */
public final class a extends fi7 {
    public final sh41 a;

    public a(sh41 sh41Var) {
        this.a = sh41Var;
    }

    @Override // defpackage.fi7
    public final void a(WebContentView webContentView, CallJsInterfaceApi callJsInterfaceApi) {
        new ru.yandex.taxi.web.calljsinterface.a(webContentView).a(callJsInterfaceApi);
        callJsInterfaceApi.addMethod("sendAnalyticsEvent", new CharityCallApiJsPlugin$apply$1(2, new hza(this.a), hza.class, "sendAnalyticsEvent", "sendAnalyticsEvent(Ljava/lang/String;)Lru/yandex/taxi/web/calljsinterface/CallJsInterfaceApi$MethodResult;", 4));
    }
}
