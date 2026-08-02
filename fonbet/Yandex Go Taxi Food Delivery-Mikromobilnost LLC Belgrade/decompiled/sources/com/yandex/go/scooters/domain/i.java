package com.yandex.go.scooters.domain;

import defpackage.s66;
import defpackage.tje;
import defpackage.tse;
import defpackage.yo40;

/* loaded from: classes8.dex */
public final class i {
    public final tse a;
    public final com.yandex.go.scooters.payments.domain.a b;
    public final s66 c;
    public final yo40 d;

    public i(tse tseVar, com.yandex.go.scooters.payments.domain.a aVar, s66 s66Var, yo40 yo40Var) {
        this.a = tseVar;
        this.b = aVar;
        this.c = s66Var;
        this.d = yo40Var;
    }

    public final void a() {
        tje.N(this.a, null, null, new ScootersCompositePaymentInteractorImpl$toggleCompositePayment$1(this, null), 3);
    }
}
