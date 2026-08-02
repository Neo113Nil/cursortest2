package defpackage;

import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class bp10 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ MerchantOffersFragment b;

    public /* synthetic */ bp10(MerchantOffersFragment merchantOffersFragment, int i) {
        this.a = i;
        this.b = merchantOffersFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 recyclerAdapter_delegate$lambda$3$lambda$2;
        wo10 bannersAdapter_delegate$lambda$0;
        e7n recyclerAdapter_delegate$lambda$3;
        zy11 lastItemScrollListener$lambda$4;
        int i = this.a;
        MerchantOffersFragment merchantOffersFragment = this.b;
        switch (i) {
            case 0:
                recyclerAdapter_delegate$lambda$3$lambda$2 = MerchantOffersFragment.recyclerAdapter_delegate$lambda$3$lambda$2(merchantOffersFragment);
                return recyclerAdapter_delegate$lambda$3$lambda$2;
            case 1:
                bannersAdapter_delegate$lambda$0 = MerchantOffersFragment.bannersAdapter_delegate$lambda$0(merchantOffersFragment);
                return bannersAdapter_delegate$lambda$0;
            case 2:
                recyclerAdapter_delegate$lambda$3 = MerchantOffersFragment.recyclerAdapter_delegate$lambda$3(merchantOffersFragment);
                return recyclerAdapter_delegate$lambda$3;
            default:
                lastItemScrollListener$lambda$4 = MerchantOffersFragment.lastItemScrollListener$lambda$4(merchantOffersFragment);
                return lastItemScrollListener$lambda$4;
        }
    }
}
