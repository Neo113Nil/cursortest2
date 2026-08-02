package com.ybsdk.feature.savings.internal.screens.lock;

import defpackage.c7m0;
import defpackage.sls;
import defpackage.uc5;
import defpackage.z6m0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountLockFragment$getViewBinding$1$2 extends FunctionReferenceImpl implements sls {
    public SavingsAccountLockFragment$getViewBinding$1$2(uc5 uc5Var) {
        super(0, uc5Var, c7m0.class, "onSecondaryButtonClick", "onSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        c7m0 c7m0Var = (c7m0) this.receiver;
        c7m0Var.D.f0.a.a("savings.account.lock_money.later", null);
        if (!((z6m0) c7m0Var.X()).c) {
            c7m0Var.C.e();
        }
        return zy11.a;
    }
}
