package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.ecomm.reviews.impl.allreviews.presentation.MarketAllReviewsTabTypes;
import com.vk.ecomm.reviews.impl.view.tabs.MarketAllReviewsTabView;
import com.vkontakte.android.R;

/* compiled from: MarketAllReviewsTabsViewHolder.kt */
/* loaded from: classes18.dex */
public final class it00 extends vfz<gt00> {
    public final ds00<cs00> l;
    public final View m;
    public final View n;
    public final MarketAllReviewsTabView o;
    public final MarketAllReviewsTabView p;

    /* JADX WARN: Multi-variable type inference failed */
    public it00(ViewGroup viewGroup, ds00<? super cs00> ds00Var) {
        super(R.layout.market_all_reviews_tabs_view_holder, viewGroup);
        this.l = ds00Var;
        this.m = this.itemView.findViewById(R.id.view_holder_title);
        this.n = this.itemView.findViewById(R.id.tab_content_view);
        MarketAllReviewsTabView marketAllReviewsTabView = (MarketAllReviewsTabView) this.itemView.findViewById(R.id.good_reviews_tab);
        this.o = marketAllReviewsTabView;
        MarketAllReviewsTabView marketAllReviewsTabView2 = (MarketAllReviewsTabView) this.itemView.findViewById(R.id.community_reviews_tab);
        this.p = marketAllReviewsTabView2;
        marketAllReviewsTabView.setOnClickListener(new bn1(this, 7));
        marketAllReviewsTabView2.setOnClickListener(new v9b(this, 6));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(gt00 gt00Var) {
        gt00 gt00Var2 = gt00Var;
        bwt0.p0(this.m, gt00Var2.b);
        this.n.setBackgroundResource(gt00Var2.c);
        String str = gt00Var2.d;
        MarketAllReviewsTabView marketAllReviewsTabView = this.o;
        marketAllReviewsTabView.d.setText(str);
        marketAllReviewsTabView.c.setText(marketAllReviewsTabView.getContext().getString(R.string.market_all_reviews_tabs_good));
        marketAllReviewsTabView.a(R.string.market_all_reviews_tabs_good, str, false);
        String str2 = gt00Var2.e;
        MarketAllReviewsTabView marketAllReviewsTabView2 = this.p;
        marketAllReviewsTabView2.d.setText(str2);
        marketAllReviewsTabView2.c.setText(marketAllReviewsTabView2.getContext().getString(R.string.market_all_reviews_tabs_community));
        marketAllReviewsTabView2.a(R.string.market_all_reviews_tabs_community, str2, false);
        MarketAllReviewsTabTypes marketAllReviewsTabTypes = gt00Var2.f;
        marketAllReviewsTabView.a(R.string.market_all_reviews_tabs_good, str, marketAllReviewsTabTypes == MarketAllReviewsTabTypes.MARKET_ITEM);
        marketAllReviewsTabView2.a(R.string.market_all_reviews_tabs_community, str2, marketAllReviewsTabTypes == MarketAllReviewsTabTypes.COMMUNITY);
    }
}
