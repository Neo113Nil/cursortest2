package defpackage;

import com.ybsdk.feature.split.deposit.internal.ui.deposit.SplitDepositFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class ltt0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SplitDepositFragment b;

    public /* synthetic */ ltt0(SplitDepositFragment splitDepositFragment, int i) {
        this.a = i;
        this.b = splitDepositFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$5$lambda$3;
        zy11 onViewCreated$lambda$5$lambda$4;
        zy11 render$lambda$7$lambda$6;
        int i = this.a;
        SplitDepositFragment splitDepositFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$5$lambda$3 = SplitDepositFragment.onViewCreated$lambda$5$lambda$3(splitDepositFragment);
                return onViewCreated$lambda$5$lambda$3;
            case 1:
                onViewCreated$lambda$5$lambda$4 = SplitDepositFragment.onViewCreated$lambda$5$lambda$4(splitDepositFragment);
                return onViewCreated$lambda$5$lambda$4;
            default:
                render$lambda$7$lambda$6 = SplitDepositFragment.render$lambda$7$lambda$6(splitDepositFragment);
                return render$lambda$7$lambda$6;
        }
    }
}
