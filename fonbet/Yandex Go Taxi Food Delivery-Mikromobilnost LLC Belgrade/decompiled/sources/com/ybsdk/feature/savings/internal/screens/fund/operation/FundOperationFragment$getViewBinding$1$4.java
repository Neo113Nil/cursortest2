package com.ybsdk.feature.savings.internal.screens.fund.operation;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountButtonClickType;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class FundOperationFragment$getViewBinding$1$4 extends FunctionReferenceImpl implements sls {
    public FundOperationFragment$getViewBinding$1$4(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onCloseClick", "onCloseClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        aVar.C.f0.F(SavingsEvents$SavingsAccountCloseAccountButtonClickButton.CANCEL_CLOSE, SavingsEvents$SavingsAccountCloseAccountButtonClickType.FUND, null, aVar.B.getType());
        aVar.F.e();
        return zy11.a;
    }
}
