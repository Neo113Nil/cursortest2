package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class au20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ MobileProvidersListFragment b;

    public /* synthetic */ au20(MobileProvidersListFragment mobileProvidersListFragment, int i) {
        this.a = i;
        this.b = mobileProvidersListFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 adapterElements$lambda$15$lambda$14;
        zy11 viewBinding$lambda$6$lambda$5$lambda$3;
        zy11 viewBinding$lambda$6$lambda$5$lambda$4;
        int i = this.a;
        MobileProvidersListFragment mobileProvidersListFragment = this.b;
        switch (i) {
            case 0:
                adapterElements$lambda$15$lambda$14 = MobileProvidersListFragment.setAdapterElements$lambda$15$lambda$14(mobileProvidersListFragment);
                return adapterElements$lambda$15$lambda$14;
            case 1:
                viewBinding$lambda$6$lambda$5$lambda$3 = MobileProvidersListFragment.getViewBinding$lambda$6$lambda$5$lambda$3(mobileProvidersListFragment);
                return viewBinding$lambda$6$lambda$5$lambda$3;
            default:
                viewBinding$lambda$6$lambda$5$lambda$4 = MobileProvidersListFragment.getViewBinding$lambda$6$lambda$5$lambda$4(mobileProvidersListFragment);
                return viewBinding$lambda$6$lambda$5$lambda$4;
        }
    }
}
