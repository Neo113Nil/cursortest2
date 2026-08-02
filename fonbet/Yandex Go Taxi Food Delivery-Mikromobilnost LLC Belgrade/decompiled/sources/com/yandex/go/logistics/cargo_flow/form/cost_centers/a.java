package com.yandex.go.logistics.cargo_flow.form.cost_centers;

import com.yandex.go.payments.paymentlist.data.c;
import defpackage.cda0;
import defpackage.dqe0;
import defpackage.tpr;
import defpackage.zwe;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;

/* loaded from: classes5.dex */
public final class a {
    public final zwe a;
    public final dqe0 b;
    public final cda0 c;

    public a(zwe zweVar, dqe0 dqe0Var, cda0 cda0Var) {
        this.a = zweVar;
        this.b = dqe0Var;
        this.c = cda0Var;
    }

    public final tpr a() {
        return e.t(new m0(((c) this.c).g.C, new n(this.a.c(), new DeliveryCostCentersRepositoryImpl$costCentersFlow$1(2, null)), new DeliveryCostCentersRepositoryImpl$costCentersFlow$2(this, null)));
    }
}
