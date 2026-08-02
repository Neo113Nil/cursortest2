package defpackage;

import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;
import com.ybsdk.widgets.common.Tooltip$DismissReason;

/* loaded from: classes3.dex */
public final /* synthetic */ class jaf implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreditDepositFragment b;

    public /* synthetic */ jaf(CreditDepositFragment creditDepositFragment, int i) {
        this.a = i;
        this.b = creditDepositFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 renderPaymentMethodsBottomSheet$lambda$38;
        zy11 render$lambda$18$lambda$17;
        zy11 renderCreditInfoBottomSheet$lambda$39;
        zy11 showTooltip$lambda$42;
        int i = this.a;
        CreditDepositFragment creditDepositFragment = this.b;
        switch (i) {
            case 0:
                renderPaymentMethodsBottomSheet$lambda$38 = CreditDepositFragment.renderPaymentMethodsBottomSheet$lambda$38(creditDepositFragment, ((Boolean) obj).booleanValue());
                return renderPaymentMethodsBottomSheet$lambda$38;
            case 1:
                render$lambda$18$lambda$17 = CreditDepositFragment.render$lambda$18$lambda$17(creditDepositFragment, (String) obj);
                return render$lambda$18$lambda$17;
            case 2:
                renderCreditInfoBottomSheet$lambda$39 = CreditDepositFragment.renderCreditInfoBottomSheet$lambda$39(creditDepositFragment, ((Boolean) obj).booleanValue());
                return renderCreditInfoBottomSheet$lambda$39;
            default:
                showTooltip$lambda$42 = CreditDepositFragment.showTooltip$lambda$42(creditDepositFragment, (Tooltip$DismissReason) obj);
                return showTooltip$lambda$42;
        }
    }
}
