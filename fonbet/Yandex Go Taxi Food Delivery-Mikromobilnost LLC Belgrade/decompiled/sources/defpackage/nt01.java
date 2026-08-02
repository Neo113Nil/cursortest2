package defpackage;

import com.ybsdk.feature.transfer.internal.screens.targets.presentation.TransferTargetsFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class nt01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferTargetsFragment b;

    public /* synthetic */ nt01(TransferTargetsFragment transferTargetsFragment, int i) {
        this.a = i;
        this.b = transferTargetsFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewBinding$lambda$5$lambda$3;
        zy11 viewBinding$lambda$5$lambda$4;
        zy11 scrollToTop$lambda$15;
        int i = this.a;
        TransferTargetsFragment transferTargetsFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$5$lambda$3 = TransferTargetsFragment.getViewBinding$lambda$5$lambda$3(transferTargetsFragment);
                return viewBinding$lambda$5$lambda$3;
            case 1:
                viewBinding$lambda$5$lambda$4 = TransferTargetsFragment.getViewBinding$lambda$5$lambda$4(transferTargetsFragment);
                return viewBinding$lambda$5$lambda$4;
            default:
                scrollToTop$lambda$15 = TransferTargetsFragment.scrollToTop$lambda$15(transferTargetsFragment);
                return scrollToTop$lambda$15;
        }
    }
}
