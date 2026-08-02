package defpackage;

import android.view.View;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class laf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreditDepositFragment b;

    public /* synthetic */ laf(CreditDepositFragment creditDepositFragment, int i) {
        this.a = i;
        this.b = creditDepositFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        CreditDepositFragment creditDepositFragment = this.b;
        switch (i) {
            case 0:
                CreditDepositFragment.renderOperationDialog$lambda$29$lambda$26(creditDepositFragment, view);
                break;
            case 1:
                CreditDepositFragment.renderOperationDialog$lambda$29$lambda$28(creditDepositFragment, view);
                break;
            case 2:
                CreditDepositFragment.renderCreditInfoBottomSheet$lambda$40(creditDepositFragment, view);
                break;
            case 3:
                CreditDepositFragment.renderOperationDialogResult$lambda$33$lambda$30(creditDepositFragment, view);
                break;
            case 4:
                CreditDepositFragment.renderOperationDialogResult$lambda$33$lambda$31(creditDepositFragment, view);
                break;
            case 5:
                CreditDepositFragment.renderOperationDialogResult$lambda$33$lambda$32(creditDepositFragment, view);
                break;
            default:
                CreditDepositFragment.onViewCreated$lambda$14$lambda$1(creditDepositFragment, view);
                break;
        }
    }
}
