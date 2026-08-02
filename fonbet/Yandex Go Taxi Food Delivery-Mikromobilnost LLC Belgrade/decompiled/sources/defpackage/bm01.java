package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.TransferMe2MeConfirmFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class bm01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferMe2MeConfirmFragment b;

    public /* synthetic */ bm01(TransferMe2MeConfirmFragment transferMe2MeConfirmFragment, int i) {
        this.a = i;
        this.b = transferMe2MeConfirmFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewBinding$lambda$7$lambda$6$lambda$5;
        zy11 showTooltip$lambda$12;
        int i = this.a;
        TransferMe2MeConfirmFragment transferMe2MeConfirmFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$7$lambda$6$lambda$5 = TransferMe2MeConfirmFragment.getViewBinding$lambda$7$lambda$6$lambda$5(transferMe2MeConfirmFragment);
                return viewBinding$lambda$7$lambda$6$lambda$5;
            default:
                showTooltip$lambda$12 = TransferMe2MeConfirmFragment.showTooltip$lambda$12(transferMe2MeConfirmFragment);
                return showTooltip$lambda$12;
        }
    }
}
