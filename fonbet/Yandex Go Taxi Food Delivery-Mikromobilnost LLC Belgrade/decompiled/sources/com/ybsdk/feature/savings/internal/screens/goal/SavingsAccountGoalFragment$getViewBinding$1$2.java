package com.ybsdk.feature.savings.internal.screens.goal;

import com.ybsdk.feature.savings.internal.helpers.a;
import defpackage.i6m0;
import defpackage.p6m0;
import defpackage.pz40;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountGoalFragment$getViewBinding$1$2 extends FunctionReferenceImpl implements sls {
    public SavingsAccountGoalFragment$getViewBinding$1$2(uc5 uc5Var) {
        super(0, uc5Var, p6m0.class, "onSecondaryButtonClick", "onSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        p6m0 p6m0Var = (p6m0) this.receiver;
        pz40 Y = p6m0Var.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, i6m0.a((i6m0) value, null, null, null, null, null, null, false, true, 1535)));
        ((a) p6m0Var.E).a(p6m0Var.B.getAgreementId(), p6m0Var.b.i("IDEMPOTENCY_KEY_FOR_GOAL"), null, null);
        return zy11.a;
    }
}
