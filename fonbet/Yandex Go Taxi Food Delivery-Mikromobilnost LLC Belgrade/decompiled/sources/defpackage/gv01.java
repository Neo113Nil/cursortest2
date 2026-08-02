package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class gv01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransfersDashboardFragment b;

    public /* synthetic */ gv01(TransfersDashboardFragment transfersDashboardFragment, int i) {
        this.a = i;
        this.b = transfersDashboardFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        hw2 navigator_delegate$lambda$0;
        zy11 initSlideSubscription$lambda$17$lambda$15;
        zy11 viewBinding$lambda$3$lambda$1;
        int i = this.a;
        TransfersDashboardFragment transfersDashboardFragment = this.b;
        switch (i) {
            case 0:
                navigator_delegate$lambda$0 = TransfersDashboardFragment.navigator_delegate$lambda$0(transfersDashboardFragment);
                return navigator_delegate$lambda$0;
            case 1:
                initSlideSubscription$lambda$17$lambda$15 = TransfersDashboardFragment.initSlideSubscription$lambda$17$lambda$15(transfersDashboardFragment);
                return initSlideSubscription$lambda$17$lambda$15;
            default:
                viewBinding$lambda$3$lambda$1 = TransfersDashboardFragment.getViewBinding$lambda$3$lambda$1(transfersDashboardFragment);
                return viewBinding$lambda$3$lambda$1;
        }
    }
}
