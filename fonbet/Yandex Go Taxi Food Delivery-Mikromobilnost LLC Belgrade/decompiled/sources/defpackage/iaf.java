package defpackage;

import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class iaf implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreditDepositFragment b;

    public /* synthetic */ iaf(CreditDepositFragment creditDepositFragment, int i) {
        this.a = i;
        this.b = creditDepositFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 showTooltip$lambda$41;
        zy11 onViewCreated$lambda$14$lambda$2;
        zy11 onViewCreated$lambda$14$lambda$3;
        zy11 onViewCreated$lambda$14$lambda$8$lambda$7;
        int i = this.a;
        CreditDepositFragment creditDepositFragment = this.b;
        switch (i) {
            case 0:
                showTooltip$lambda$41 = CreditDepositFragment.showTooltip$lambda$41(creditDepositFragment);
                return showTooltip$lambda$41;
            case 1:
                onViewCreated$lambda$14$lambda$2 = CreditDepositFragment.onViewCreated$lambda$14$lambda$2(creditDepositFragment);
                return onViewCreated$lambda$14$lambda$2;
            case 2:
                onViewCreated$lambda$14$lambda$3 = CreditDepositFragment.onViewCreated$lambda$14$lambda$3(creditDepositFragment);
                return onViewCreated$lambda$14$lambda$3;
            default:
                onViewCreated$lambda$14$lambda$8$lambda$7 = CreditDepositFragment.onViewCreated$lambda$14$lambda$8$lambda$7(creditDepositFragment);
                return onViewCreated$lambda$14$lambda$8$lambda$7;
        }
    }
}
