package defpackage;

import com.yandex.go.payments.sbp.ui.opening_bank_dialog.OpeningBankDialogModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class ka70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OpeningBankDialogModalView b;

    public /* synthetic */ ka70(OpeningBankDialogModalView openingBankDialogModalView, int i) {
        this.a = i;
        this.b = openingBankDialogModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        OpeningBankDialogModalView openingBankDialogModalView = this.b;
        switch (i) {
            case 0:
                openingBankDialogModalView.onBackPressed();
                break;
            default:
                OpeningBankDialogModalView.onAttachedToWindow$lambda$0(openingBankDialogModalView);
                break;
        }
    }
}
