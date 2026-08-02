package xsna;

import com.vk.api.generated.market.dto.MarketGetRecommendedItemsFeatureTypeDto;
import com.vk.dto.discover.carousel.products.ProductCarousel;
import com.vk.dto.discover.carousel.products.ProductCarouselItem;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Collection;

/* compiled from: ProductsCarouselPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class psd0 extends de {
    public final yd10 b = new yd10();
    public final dqu c = new dqu();

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        ?? r2;
        NewsEntry newsEntry = u1c0Var.a;
        ProductCarousel productCarousel = newsEntry instanceof ProductCarousel ? (ProductCarousel) newsEntry : null;
        if (productCarousel == null || (r2 = productCarousel.o) == 0) {
            return 0;
        }
        return r2.size();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        ?? r3;
        ProductCarouselItem productCarouselItem;
        Photo photo;
        NewsEntry newsEntry = u1c0Var.a;
        ProductCarousel productCarousel = newsEntry instanceof ProductCarousel ? (ProductCarousel) newsEntry : null;
        if (productCarousel == null || (r3 = productCarousel.o) == 0 || (productCarouselItem = (ProductCarouselItem) j5g.b0(i, r3)) == null || (photo = productCarouselItem.g) == null) {
            return null;
        }
        return photo.s;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        if (newsEntry instanceof ProductCarousel) {
            ProductCarousel productCarousel = (ProductCarousel) newsEntry;
            if (((Collection) productCarousel.o).isEmpty()) {
                dz2 x = yfb.x(xd10.e(this.b, 20, null, MarketGetRecommendedItemsFeatureTypeDto.PORTLET, 6));
                x.n = true;
                return rsg0.y0(x, null, null, 3).U(new rj4(new yu1(22, this, productCarousel), 29));
            }
        }
        return null;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.b);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}
