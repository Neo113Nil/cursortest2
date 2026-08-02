package com.yandex.payment.divkit.select;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.ds31;
import defpackage.eeq0;
import defpackage.ryj0;
import defpackage.tje;
import defpackage.uv90;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class c implements ryj0 {
    public final /* synthetic */ h a;

    public c(h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.ryj0
    public final void i(Object obj) {
        r0 r0Var = this.a.P;
        eeq0 eeq0Var = new eeq0((PaymentKitError) obj);
        r0Var.getClass();
        r0Var.m(null, eeq0Var);
    }

    @Override // defpackage.ryj0
    public final void onSuccess(Object obj) {
        h hVar = this.a;
        tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$loadPaymentDetails$1$onSuccess$1(hVar, (uv90) obj, null), 3);
    }
}
