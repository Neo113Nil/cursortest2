package com.yandex.payment.divkit.usecases;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.NewCard;
import defpackage.pgk0;

/* loaded from: classes2.dex */
public final class q {
    public final pgk0 a;

    public q(pgk0 pgk0Var) {
        this.a = pgk0Var;
    }

    public final kotlinx.coroutines.flow.b a(NewCard newCard, PaymentMethod paymentMethod, String str) {
        return kotlinx.coroutines.flow.e.g(new PayByCardUseCaseImpl$pay$1(paymentMethod, newCard, this, str, null));
    }
}
