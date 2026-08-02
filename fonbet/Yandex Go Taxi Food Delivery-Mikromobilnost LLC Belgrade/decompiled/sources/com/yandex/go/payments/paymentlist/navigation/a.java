package com.yandex.go.payments.paymentlist.navigation;

import defpackage.ghs;
import defpackage.wgs;

/* loaded from: classes13.dex */
public final class a implements wgs {
    public final ghs a;
    public final /* synthetic */ f b;

    public a(f fVar, ghs ghsVar) {
        this.b = fVar;
        this.a = ghsVar;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    @Override // defpackage.wgs
    public final void f1() {
        f fVar = this.b;
        f.U(fVar, new PaymentMethodsListRouter$DeletePaymentAlertExitListenerImpl$deletePayment$1(this, fVar, null));
    }
}
