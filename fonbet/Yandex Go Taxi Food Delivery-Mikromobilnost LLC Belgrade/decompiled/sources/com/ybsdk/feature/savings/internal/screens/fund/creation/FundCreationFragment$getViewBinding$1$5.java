package com.ybsdk.feature.savings.internal.screens.fund.creation;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class FundCreationFragment$getViewBinding$1$5 extends FunctionReferenceImpl implements sls {
    public FundCreationFragment$getViewBinding$1$5(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onScreenPrimaryClick", "onScreenPrimaryClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        aVar.C.f0.M(SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton.OPEN_TOPUP_FUND, null);
        aVar.c0();
        return zy11.a;
    }
}
