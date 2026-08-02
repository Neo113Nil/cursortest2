package com.ybsdk.feature.savings.internal.screens.lock;

import com.ybsdk.feature.savings.internal.helpers.a;
import defpackage.c7m0;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountLockFragment$getViewBinding$1$1 extends FunctionReferenceImpl implements sls {
    public SavingsAccountLockFragment$getViewBinding$1$1(uc5 uc5Var) {
        super(0, uc5Var, c7m0.class, "onPrimaryButtonClick", "onPrimaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        c7m0 c7m0Var = (c7m0) this.receiver;
        c7m0Var.D.f0.a.a("savings.account.lock_money.agree", null);
        ((a) c7m0Var.E).b(c7m0Var.B.getAgreementId(), c7m0Var.b.i("IDEMPOTENCY_KEY_FOR_LOCK"), true);
        return zy11.a;
    }
}
