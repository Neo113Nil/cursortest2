package com.ybsdk.feature.savings.internal.screens.fund.operation;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountButtonClickType;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class FundOperationFragment$getViewBinding$1$6 extends FunctionReferenceImpl implements tls {
    public FundOperationFragment$getViewBinding$1$6(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onScreenLegalClick", "onScreenLegalClick(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        a aVar = (a) this.receiver;
        aVar.C.f0.F(SavingsEvents$SavingsAccountCloseAccountButtonClickButton.LEGAL, SavingsEvents$SavingsAccountCloseAccountButtonClickType.FUND, str, aVar.B.getType());
        aVar.D.b(str);
        return zy11.a;
    }
}
