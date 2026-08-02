package com.yandex.go.taxi.order.details.v2.domain;

import com.yandex.go.payments.api.acceptance.AcceptancePaymentOrderContext;
import defpackage.de;
import defpackage.je;
import defpackage.o2y0;
import defpackage.tje;
import defpackage.tse;
import defpackage.yvf0;
import defpackage.zek0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class a {
    public final je a;
    public final yvf0 b;
    public de c;

    public a(je jeVar, yvf0 yvf0Var) {
        this.a = jeVar;
        this.b = yvf0Var;
    }

    public final void a(tse tseVar, o2y0 o2y0Var, zek0 zek0Var, zek0 zek0Var2) {
        tje.N(tseVar, null, null, new AcceptancePaymentRideInteractor$observeScreenState$1(this, zek0Var, zek0Var2, null), 3);
        tje.N(tseVar, null, null, new AcceptancePaymentRideInteractor$observeOrderState$1(o2y0Var, this, null), 3);
        ((com.yandex.go.payments.acceptance.domain.c) this.a).h(o2y0Var.c() == DriveState.COMPLETE ? AcceptancePaymentOrderContext.COMPLETE : AcceptancePaymentOrderContext.TRANSPORTING);
    }
}
