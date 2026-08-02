package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;

/* loaded from: classes3.dex */
public final class hp10 extends RecyclerView.g {
    public final /* synthetic */ MerchantOffersFragment a;

    public hp10(MerchantOffersFragment merchantOffersFragment) {
        this.a = merchantOffersFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z;
        MerchantOffersFragment merchantOffersFragment = this.a;
        z = merchantOffersFragment.shouldExpandAppBarOnIdleScrolling;
        if (z && i == 0) {
            merchantOffersFragment.shouldExpandAppBarOnIdleScrolling = false;
            MerchantOffersFragment.access$getBinding(merchantOffersFragment).c.setExpanded(true);
        }
    }
}
