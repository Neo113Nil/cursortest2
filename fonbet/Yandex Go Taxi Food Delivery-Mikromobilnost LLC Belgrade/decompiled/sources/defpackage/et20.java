package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class et20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ MobilePaymentSelectContactFragment b;

    public /* synthetic */ et20(MobilePaymentSelectContactFragment mobilePaymentSelectContactFragment, int i) {
        this.a = i;
        this.b = mobilePaymentSelectContactFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewBinding$lambda$6$lambda$5;
        zy11 adapterElements$lambda$18$lambda$17;
        int i = this.a;
        MobilePaymentSelectContactFragment mobilePaymentSelectContactFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$6$lambda$5 = MobilePaymentSelectContactFragment.getViewBinding$lambda$6$lambda$5(mobilePaymentSelectContactFragment);
                return viewBinding$lambda$6$lambda$5;
            default:
                adapterElements$lambda$18$lambda$17 = MobilePaymentSelectContactFragment.setAdapterElements$lambda$18$lambda$17(mobilePaymentSelectContactFragment);
                return adapterElements$lambda$18$lambda$17;
        }
    }
}
