package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.common.view.DotsIndicatorView;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.MarketItemsForReviewView;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.viewpager.model.MarketItemReviewsProductOfferItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: MarketAllReviewsItemsForReviewViewHolder.kt */
/* loaded from: classes18.dex */
public final class vs00 extends vfz<us00> {
    public final f5z l;
    public final io.reactivex.rxjava3.disposables.c m;
    public final ConstraintLayout n;
    public final TextView o;
    public final MarketItemsForReviewView p;

    public vs00(ViewGroup viewGroup, f5z f5zVar, ds00<? super cs00> ds00Var) {
        super(R.layout.market_all_reviews_items_for_review_view_holder, viewGroup);
        this.l = f5zVar;
        this.n = (ConstraintLayout) this.itemView.findViewById(R.id.title_cl);
        this.o = (TextView) this.itemView.findViewById(R.id.view_holder_count);
        MarketItemsForReviewView marketItemsForReviewView = (MarketItemsForReviewView) this.itemView.findViewById(R.id.items_for_review_view);
        this.p = marketItemsForReviewView;
        this.m = marketItemsForReviewView.f.subscribe(new skz(new wcj(ds00Var, 21), 1));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(us00 us00Var) {
        us00 us00Var2 = us00Var;
        StringBuilder sb = new StringBuilder();
        sb.append(b6().getString(R.string.market_all_reviews_offers_view_holder_title));
        sb.append(" ");
        String str = us00Var2.b;
        sb.append(str);
        this.n.setContentDescription(sb.toString());
        this.o.setText(str);
        h610 h610Var = us00Var2.c;
        MarketItemsForReviewView marketItemsForReviewView = this.p;
        marketItemsForReviewView.getClass();
        int i = h610Var.a;
        List<a610> list = h610Var.b;
        l610 l610Var = marketItemsForReviewView.d;
        if (l610Var == null) {
            l610Var = null;
        }
        marketItemsForReviewView.e.getClass();
        ListBuilder e = e43.e();
        List<a610> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (a610 a610Var : list2) {
            arrayList.add(new MarketItemReviewsProductOfferItem(a610Var.c, a610Var.a, a610Var.d, a610Var.e, a610Var.f, a610Var.h, a610Var.g));
        }
        e.addAll(arrayList);
        l610Var.setItems(e.g());
        DotsIndicatorView dotsIndicatorView = marketItemsForReviewView.c;
        if (dotsIndicatorView == null) {
            dotsIndicatorView = null;
        }
        dotsIndicatorView.setCount(list.size());
        DotsIndicatorView dotsIndicatorView2 = marketItemsForReviewView.c;
        if (dotsIndicatorView2 == null) {
            dotsIndicatorView2 = null;
        }
        bwt0.p0(dotsIndicatorView2, list.size() > 1);
        ViewPager2 viewPager2 = marketItemsForReviewView.b;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        viewPager2.e(i, true);
        DotsIndicatorView dotsIndicatorView3 = marketItemsForReviewView.c;
        (dotsIndicatorView3 == null ? null : dotsIndicatorView3).setSelectedPosition(i);
    }
}
