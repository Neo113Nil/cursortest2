package com.yandex.go.taxi.order.details.v2.domain.plugins;

import defpackage.bvf0;
import defpackage.hbp0;
import defpackage.jqr;
import defpackage.tpr;
import defpackage.tt2;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public abstract class a {
    public final hbp0 a;
    public final r0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Object obj, tt2 tt2Var) {
        this.a = new hbp0(new RideCardAbstractStateAdapter$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
        this.b = bvf0.c(obj);
    }

    public abstract tpr a();

    public final void b() {
        hbp0 hbp0Var = this.a;
        hbp0Var.f();
        e.H(hbp0Var, new jqr(a(), new RideCardAbstractStateAdapter$startStateUpdates$1(this, null), 3));
    }
}
