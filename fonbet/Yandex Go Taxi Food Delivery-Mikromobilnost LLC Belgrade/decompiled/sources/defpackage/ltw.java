package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class ltw implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ InternetPaymentSelectProviderFragment b;

    public /* synthetic */ ltw(InternetPaymentSelectProviderFragment internetPaymentSelectProviderFragment, int i) {
        this.a = i;
        this.b = internetPaymentSelectProviderFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewBinding$lambda$6$lambda$5$lambda$3;
        zy11 viewBinding$lambda$6$lambda$5$lambda$4;
        zy11 adapterElements$lambda$16$lambda$15;
        int i = this.a;
        InternetPaymentSelectProviderFragment internetPaymentSelectProviderFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$6$lambda$5$lambda$3 = InternetPaymentSelectProviderFragment.getViewBinding$lambda$6$lambda$5$lambda$3(internetPaymentSelectProviderFragment);
                return viewBinding$lambda$6$lambda$5$lambda$3;
            case 1:
                viewBinding$lambda$6$lambda$5$lambda$4 = InternetPaymentSelectProviderFragment.getViewBinding$lambda$6$lambda$5$lambda$4(internetPaymentSelectProviderFragment);
                return viewBinding$lambda$6$lambda$5$lambda$4;
            default:
                adapterElements$lambda$16$lambda$15 = InternetPaymentSelectProviderFragment.setAdapterElements$lambda$16$lambda$15(internetPaymentSelectProviderFragment);
                return adapterElements$lambda$16$lambda$15;
        }
    }
}
