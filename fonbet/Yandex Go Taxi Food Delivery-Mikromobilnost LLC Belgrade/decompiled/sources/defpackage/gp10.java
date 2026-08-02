package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;

/* loaded from: classes3.dex */
public final class gp10 extends RecyclerView.g {
    public final /* synthetic */ MerchantOffersFragment a;

    public gp10(MerchantOffersFragment merchantOffersFragment) {
        this.a = merchantOffersFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        gzk gzkVar;
        e7n recyclerAdapter;
        MerchantOffersFragment merchantOffersFragment = this.a;
        gzkVar = merchantOffersFragment.offerListReporter;
        recyclerAdapter = merchantOffersFragment.getRecyclerAdapter();
        gzkVar.a(recyclerView, recyclerAdapter.b.f);
    }
}
