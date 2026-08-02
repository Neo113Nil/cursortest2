package com.ybsdk.feature.autotopup.internal.presentation.instruction;

import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class AutoTopupInstructionFragment$getViewBinding$1$2 extends FunctionReferenceImpl implements sls {
    public AutoTopupInstructionFragment$getViewBinding$1$2(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onPrimaryButtonClick", "onPrimaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        aVar.G.a.e.a.a("auto_topup.binding_payment.started", null);
        aVar.c0(null);
        return zy11.a;
    }
}
