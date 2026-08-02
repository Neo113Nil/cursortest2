package com.yandex.go.payments.paymentlist.domain;

import defpackage.bre0;
import defpackage.cda0;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes13.dex */
public final class o implements bre0 {
    public final cda0 a;
    public final hit b;
    public final tt2 c;

    public o(cda0 cda0Var, hit hitVar, tt2 tt2Var) {
        this.a = cda0Var;
        this.b = hitVar;
        this.c = tt2Var;
    }

    @Override // defpackage.bre0
    public final void b() {
        hbp0 hbp0Var = this.b.a;
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, mdh.b, null, new UpdatePaymentMethodsInteractor$requestPaymentMethodsIfDefaultNotSelected$1(this, null), 2);
    }
}
