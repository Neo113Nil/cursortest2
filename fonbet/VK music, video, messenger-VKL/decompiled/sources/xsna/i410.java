package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import xsna.l310;
import xsna.xn50;

/* compiled from: MarketItemReviewsFragment.kt */
/* loaded from: classes18.dex */
public final class i410 implements h780 {
    public final /* synthetic */ MarketItemReviewsFragment a;

    public i410(MarketItemReviewsFragment marketItemReviewsFragment) {
        this.a = marketItemReviewsFragment;
    }

    @Override // xsna.h780
    public final void a(UserId userId) {
        l310.g.d dVar = new l310.g.d(userId);
        MarketItemReviewsFragment marketItemReviewsFragment = this.a;
        marketItemReviewsFragment.getClass();
        xn50.a.c(marketItemReviewsFragment, dVar);
    }

    @Override // xsna.h780
    public final void b(int i, long j) {
        xn50.a.c(this.a, new l310.m(i, j));
    }

    @Override // xsna.h780
    public final void c(f210 f210Var) {
        xn50.a.c(this.a, new l310.g.c(f210Var));
    }

    @Override // xsna.h780
    public final void d(UserId userId, long j, int i) {
        l310.q.a aVar = new l310.q.a(null, i, userId, Long.valueOf(j));
        MarketItemReviewsFragment marketItemReviewsFragment = this.a;
        marketItemReviewsFragment.getClass();
        xn50.a.c(marketItemReviewsFragment, aVar);
    }

    @Override // xsna.h780
    public final void e() {
        l310.g.a aVar = l310.g.a.b;
        MarketItemReviewsFragment marketItemReviewsFragment = this.a;
        marketItemReviewsFragment.getClass();
        xn50.a.c(marketItemReviewsFragment, aVar);
    }

    @Override // xsna.h780
    public final void f(int i) {
        xn50.a.c(this.a, new l310.c(i));
    }

    @Override // xsna.h780
    public final void g(int i, int i2) {
        xn50.a.c(this.a, new l310.g.b(i, i2));
    }
}
