package com.yandex.go.payments.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.dw90;
import defpackage.ew90;
import defpackage.kw90;
import defpackage.lw90;
import defpackage.qea0;
import defpackage.s6h;
import defpackage.tea0;
import defpackage.xhq0;

/* loaded from: classes13.dex */
public final class k {
    public final qea0 a;
    public final lw90 b;
    public final xhq0 c;
    public final tea0 d;

    public k(qea0 qea0Var, lw90 lw90Var, xhq0 xhq0Var, tea0 tea0Var) {
        this.a = qea0Var;
        this.b = lw90Var;
        this.c = xhq0Var;
        this.d = tea0Var;
    }

    public final kotlinx.coroutines.flow.m0 a(TaxiOrder taxiOrder) {
        this.b.getClass();
        kw90 kw90Var = new kw90(new dw90(taxiOrder), new ew90(), new s6h());
        return new kotlinx.coroutines.flow.m0(((j0) this.a).a(kw90Var), this.c.a, new ChangeOrderPaymentMethodInteractor$getOrderPaymentOptionsFlow$1(this, kw90Var, null));
    }
}
