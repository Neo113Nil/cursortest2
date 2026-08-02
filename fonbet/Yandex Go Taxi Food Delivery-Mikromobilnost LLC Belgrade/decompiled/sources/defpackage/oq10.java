package defpackage;

import com.ybsdk.feature.merchant.offers.internal.screens.testSearch.MerchantOffersTestSearchFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class oq10 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ MerchantOffersTestSearchFragment b;

    public /* synthetic */ oq10(MerchantOffersTestSearchFragment merchantOffersTestSearchFragment, int i) {
        this.a = i;
        this.b = merchantOffersTestSearchFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        e7n adapter_delegate$lambda$1;
        zy11 onViewCreated$lambda$2;
        int i = this.a;
        MerchantOffersTestSearchFragment merchantOffersTestSearchFragment = this.b;
        switch (i) {
            case 0:
                adapter_delegate$lambda$1 = MerchantOffersTestSearchFragment.adapter_delegate$lambda$1(merchantOffersTestSearchFragment);
                return adapter_delegate$lambda$1;
            default:
                onViewCreated$lambda$2 = MerchantOffersTestSearchFragment.onViewCreated$lambda$2(merchantOffersTestSearchFragment);
                return onViewCreated$lambda$2;
        }
    }
}
