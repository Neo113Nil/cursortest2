package com.yandex.go.payments.porttech.navigation;

import com.yandex.go.payments.porttech.domain.PorttechJsNativeApi;
import com.yandex.go.payments.porttech.domain.SelectPaymentMethodRequest;
import defpackage.cce0;
import defpackage.k52;
import defpackage.tje;
import defpackage.zbe0;

/* loaded from: classes13.dex */
public final class c implements zbe0 {
    public final /* synthetic */ d a;
    public final /* synthetic */ cce0 b;

    public c(d dVar, cce0 cce0Var) {
        this.a = dVar;
        this.b = cce0Var;
    }

    public final void a(String str, SelectPaymentMethodRequest selectPaymentMethodRequest, PorttechJsNativeApi porttechJsNativeApi) {
        tje.N(this.a.o(), null, null, new PorttechWebViewRouter$onLaunch$1$porttechApi$1$onGetSelectedPaymentMethod$1(this.a, str, selectPaymentMethodRequest, porttechJsNativeApi, this.b, null), 3);
    }

    public final void b() {
        d dVar = this.a;
        tje.N(dVar.o(), null, null, new PorttechWebViewRouter$onLaunch$1$porttechApi$1$onRequestHideWebView$1(dVar, null), 3);
    }

    public final void c(String str, SelectPaymentMethodRequest selectPaymentMethodRequest, PorttechJsNativeApi porttechJsNativeApi) {
        tje.N(this.a.o(), null, null, new PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSelectPaymentMethod$1(this.a, str, selectPaymentMethodRequest, porttechJsNativeApi, this.b, null), 3);
    }

    public final void d(k52 k52Var) {
        d dVar = this.a;
        tje.N(dVar.o(), null, null, new PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSendAnalyticsEvent$1(dVar, k52Var, null), 3);
    }

    public final void e() {
        d dVar = this.a;
        tje.N(dVar.o(), null, null, new PorttechWebViewRouter$onLaunch$1$porttechApi$1$onWebViewReady$1(dVar, null), 3);
    }
}
