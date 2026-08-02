package defpackage;

import com.yandex.go.transfer_requirement.mvp.TransferRequirementModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class hp01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferRequirementModalView b;

    public /* synthetic */ hp01(TransferRequirementModalView transferRequirementModalView, int i) {
        this.a = i;
        this.b = transferRequirementModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TransferRequirementModalView transferRequirementModalView = this.b;
        switch (i) {
            case 0:
                transferRequirementModalView.onBackPressed();
                break;
            case 1:
                transferRequirementModalView.onCancelInputButtonClicked();
                break;
            default:
                transferRequirementModalView.onSaveInputButtonClicked();
                break;
        }
    }
}
