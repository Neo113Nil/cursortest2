package com.yandex.go.taxi.order.chat.navigation;

import defpackage.hbp0;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.qg60;
import defpackage.s350;
import defpackage.tls;
import defpackage.tt2;

/* loaded from: classes14.dex */
public final class a {
    public final qg60 a;
    public final oep0 b;
    public final s350 c;
    public final com.yandex.go.taxi.order.chat.experiments.b d;
    public final com.yandex.go.taxi.order.chat.web_preloading.b e;
    public final tt2 f;
    public final hbp0 g;

    public a(qg60 qg60Var, oep0 oep0Var, s350 s350Var, com.yandex.go.taxi.order.chat.experiments.b bVar, com.yandex.go.taxi.order.chat.web_preloading.b bVar2, tt2 tt2Var) {
        this.a = qg60Var;
        this.b = oep0Var;
        this.c = s350Var;
        this.d = bVar;
        this.e = bVar2;
        this.f = tt2Var;
        this.g = new hbp0(new TaxiOrderMessengerNavigator$scopeDelegate$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
    }

    public final void a(tls tlsVar) {
        hbp0 hbp0Var = this.g;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new TaxiOrderMessengerNavigator$attachWebPreloader$1(this, tlsVar, null), 3);
    }

    public final void b(o2y0 o2y0Var, String str) {
        hbp0.e(this.g, null, null, new TaxiOrderMessengerNavigator$openChat$1(this, o2y0Var, str, null), 3);
    }
}
