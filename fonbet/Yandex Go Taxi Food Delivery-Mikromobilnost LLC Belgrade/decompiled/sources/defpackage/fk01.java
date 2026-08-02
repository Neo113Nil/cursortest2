package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.result.TransferMainResultFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class fk01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferMainResultFragment b;

    public /* synthetic */ fk01(TransferMainResultFragment transferMainResultFragment, int i) {
        this.a = i;
        this.b = transferMainResultFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 ensureWeb3dsView$lambda$35$lambda$31;
        zy11 ensureWeb3dsView$lambda$35$lambda$32;
        e7n widgetsAdapter_delegate$lambda$1;
        qa3 quickActionsAdapter_delegate$lambda$3;
        zy11 onViewCreated$lambda$9$lambda$6;
        int i = this.a;
        TransferMainResultFragment transferMainResultFragment = this.b;
        switch (i) {
            case 0:
                ensureWeb3dsView$lambda$35$lambda$31 = TransferMainResultFragment.ensureWeb3dsView$lambda$35$lambda$31(transferMainResultFragment);
                return ensureWeb3dsView$lambda$35$lambda$31;
            case 1:
                ensureWeb3dsView$lambda$35$lambda$32 = TransferMainResultFragment.ensureWeb3dsView$lambda$35$lambda$32(transferMainResultFragment);
                return ensureWeb3dsView$lambda$35$lambda$32;
            case 2:
                widgetsAdapter_delegate$lambda$1 = TransferMainResultFragment.widgetsAdapter_delegate$lambda$1(transferMainResultFragment);
                return widgetsAdapter_delegate$lambda$1;
            case 3:
                quickActionsAdapter_delegate$lambda$3 = TransferMainResultFragment.quickActionsAdapter_delegate$lambda$3(transferMainResultFragment);
                return quickActionsAdapter_delegate$lambda$3;
            default:
                onViewCreated$lambda$9$lambda$6 = TransferMainResultFragment.onViewCreated$lambda$9$lambda$6(transferMainResultFragment);
                return onViewCreated$lambda$9$lambda$6;
        }
    }
}
