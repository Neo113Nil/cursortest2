package com.yandex.go.payments.porttech.data;

import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

/* loaded from: classes13.dex */
public final class a {
    public final tt2 a;
    public final ru.yandex.taxi.web.deeplink.a b;

    public a(tt2 tt2Var, ru.yandex.taxi.web.deeplink.a aVar) {
        this.a = tt2Var;
        this.b = aVar;
    }

    public final Object a(WebViewFromDeeplinkExperiment.a aVar, JsNativeApi jsNativeApi, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PorttechWebViewConfigProvider$getConfig$2(jsNativeApi, this, aVar, null), continuation);
    }
}
