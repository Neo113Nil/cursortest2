package com.yandex.go.chargers.payments.domain;

import defpackage.hbp0;
import defpackage.tt2;
import defpackage.u2a;

/* loaded from: classes12.dex */
public final class e implements u2a {
    public final com.yandex.go.chargers.payments.data.a a;
    public final hbp0 b;

    public e(tt2 tt2Var, com.yandex.go.chargers.payments.data.a aVar) {
        this.a = aVar;
        this.b = new hbp0(new ChargersPaymentMethodsPreloadInteractor$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
    }

    @Override // defpackage.u2a
    public final void a() {
        hbp0 hbp0Var = this.b;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new ChargersPaymentMethodsPreloadInteractor$onAttach$1(this, null), 3);
    }

    @Override // defpackage.u2a
    public final void onDetach() {
        this.b.b();
        ((d) this.a.c).c().a();
    }
}
