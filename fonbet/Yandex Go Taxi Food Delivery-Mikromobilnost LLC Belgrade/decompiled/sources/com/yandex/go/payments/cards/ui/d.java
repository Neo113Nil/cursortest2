package com.yandex.go.payments.cards.ui;

import defpackage.biw0;
import defpackage.f3e;
import defpackage.tje;

/* loaded from: classes13.dex */
public final class d {
    public final /* synthetic */ ConfirmPaymentMethodViewImpl a;

    public d(ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl) {
        this.a = confirmPaymentMethodViewImpl;
    }

    public final void a(biw0 biw0Var) {
        c cVar;
        cVar = this.a.presenter;
        ((f3e) cVar.Dg()).rf(true);
        tje.N(cVar.Kg(), null, null, new ConfirmCardPresenter$confirmCvn$1(cVar, biw0Var, null), 3);
    }
}
