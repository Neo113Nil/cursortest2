package com.yandex.payment.divkit.usecases;

import com.yandex.payment.sdk.core.data.PaymentToken;
import defpackage.ey4;
import defpackage.m3v;

/* loaded from: classes2.dex */
public final class b {
    public final PaymentToken a;
    public final m3v b;

    public b(PaymentToken paymentToken, m3v m3vVar) {
        this.a = paymentToken;
        this.b = m3vVar;
    }

    public final ey4 a() {
        return new ey4(kotlinx.coroutines.flow.e.g(new CoordinatorUseCaseImpl$startPolling$1(this, null)), 4);
    }
}
