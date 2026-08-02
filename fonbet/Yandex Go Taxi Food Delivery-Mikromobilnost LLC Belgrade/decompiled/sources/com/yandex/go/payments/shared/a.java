package com.yandex.go.payments.shared;

import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.cw6;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.vnr0;
import java.util.List;

/* loaded from: classes8.dex */
public final class a {
    public final vnr0 a;
    public final tt2 b;
    public final cw6 c;
    public final tse d;

    public a(vnr0 vnr0Var, tt2 tt2Var, cw6 cw6Var, tse tseVar) {
        this.a = vnr0Var;
        this.b = tt2Var;
        this.c = cw6Var;
        this.d = tseVar;
    }

    public final void a(List list) {
        if (this.c.b.get()) {
            return;
        }
        tje.N(this.d, null, null, new BusinessAccountAnalyticInteractor$setPaymentMethodsShown$1(this, SharedPaymentsOpenReason.PAYMENT_SUMMARY, list, null), 3);
    }
}
