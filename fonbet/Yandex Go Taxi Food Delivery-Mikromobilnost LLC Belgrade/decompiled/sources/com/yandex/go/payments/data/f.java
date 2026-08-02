package com.yandex.go.payments.data;

import defpackage.cne0;
import defpackage.dne0;
import defpackage.ffx;
import defpackage.wnt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class f {
    public final wnt a;
    public final cne0 b;
    public final n0 c = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public f(wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = dne0Var.a("com.yandex.go.payments.payment_name_preferences");
    }

    public final kotlinx.coroutines.flow.n a() {
        return new kotlinx.coroutines.flow.n(this.c, new PaymentMethodNameRepository$getPaymentMethodNameChangedFlow$1(2, null));
    }
}
