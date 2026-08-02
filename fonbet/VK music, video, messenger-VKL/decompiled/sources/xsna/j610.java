package xsna;

import androidx.viewpager2.widget.ViewPager2;
import com.vk.common.view.DotsIndicatorView;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.MarketItemsForReviewView;
import xsna.m610;

/* compiled from: MarketItemsForReviewView.kt */
/* loaded from: classes18.dex */
public final class j610 extends ViewPager2.g {
    public final /* synthetic */ MarketItemsForReviewView d;

    public j610(MarketItemsForReviewView marketItemsForReviewView) {
        this.d = marketItemsForReviewView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        MarketItemsForReviewView marketItemsForReviewView = this.d;
        DotsIndicatorView dotsIndicatorView = marketItemsForReviewView.c;
        if (dotsIndicatorView == null) {
            dotsIndicatorView = null;
        }
        dotsIndicatorView.setSelectedPosition(i);
        marketItemsForReviewView.f.onNext(new m610.a(i));
    }
}
