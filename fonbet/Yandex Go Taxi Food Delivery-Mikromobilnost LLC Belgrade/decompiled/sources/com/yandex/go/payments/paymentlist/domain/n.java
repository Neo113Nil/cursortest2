package com.yandex.go.payments.paymentlist.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.lv90;
import defpackage.n20;
import defpackage.o2y0;
import defpackage.pvn;
import defpackage.tpr;

/* loaded from: classes13.dex */
public final class n {
    public final n20 a;
    public final i b;

    public n(n20 n20Var, i iVar) {
        this.a = n20Var;
        this.b = iVar;
    }

    public final tpr a(lv90 lv90Var, String str) {
        TaxiOrder b;
        o2y0 n = ((com.yandex.go.taxi.order.provider.a) this.a).n(str);
        return (n == null || (b = n.b()) == null) ? pvn.a : kotlinx.coroutines.flow.e.g(new SetSelectedPaymentOptionSuspendableInteractorImpl$setSelectedItem$1(this, lv90Var, b, null));
    }
}
