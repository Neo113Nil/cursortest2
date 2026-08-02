package com.yandex.payment.divkit.usecases;

import defpackage.pgk0;

/* loaded from: classes2.dex */
public final class i {
    public final pgk0 a;

    public i(pgk0 pgk0Var) {
        this.a = pgk0Var;
    }

    public final kotlinx.coroutines.flow.b a() {
        return kotlinx.coroutines.flow.e.g(new FetchPaymentDetailsUseCaseImpl$fetch$1(this, null));
    }
}
