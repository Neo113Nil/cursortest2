package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchFragment;

/* loaded from: classes3.dex */
public final class bq10 extends RecyclerView.g {
    public final /* synthetic */ MerchantOffersSearchFragment a;

    public bq10(MerchantOffersSearchFragment merchantOffersSearchFragment) {
        this.a = merchantOffersSearchFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1 || i == 2) {
            this.a.clearFocusAndHideKeyboard();
        }
    }
}
