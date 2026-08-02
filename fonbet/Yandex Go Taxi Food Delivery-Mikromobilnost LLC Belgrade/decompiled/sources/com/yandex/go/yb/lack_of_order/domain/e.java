package com.yandex.go.yb.lack_of_order.domain;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.yb.lack_of_order.experiments.MoneyNotEnoughExperiment;
import defpackage.b630;
import defpackage.g92;
import defpackage.k7x0;
import defpackage.o2y0;
import defpackage.pdc;
import defpackage.qn11;
import defpackage.tpr;
import kotlinx.coroutines.flow.o;

/* loaded from: classes8.dex */
public final class e implements b630 {
    public final pdc a;
    public final k7x0 b;
    public final l c;

    public e(pdc pdcVar, k7x0 k7x0Var, l lVar) {
        this.a = pdcVar;
        this.b = k7x0Var;
        this.c = lVar;
    }

    public final tpr a(o2y0 o2y0Var) {
        OrderStatusInfo V = o2y0Var.b().V();
        MoneyNotEnoughExperiment.Companion.getClass();
        qn11 a = com.yandex.go.yb.lack_of_order.experiments.a.a();
        qn11 b = V.b(MoneyNotEnoughExperiment.class);
        if (b != null) {
            a = b;
        }
        MoneyNotEnoughExperiment moneyNotEnoughExperiment = (MoneyNotEnoughExperiment) a;
        Object obj = null;
        if (!moneyNotEnoughExperiment.b) {
            return new g92(2, obj);
        }
        l lVar = this.c;
        return new d(new o(kotlinx.coroutines.flow.e.X(lVar.a.c().t, new TaxiOrderMoneyLackIntentInteractor$special$$inlined$flatMapLatest$1(null, lVar)), new TaxiOrderMoneyLackIntentInteractor$intentFlow$2()), moneyNotEnoughExperiment, this);
    }
}
