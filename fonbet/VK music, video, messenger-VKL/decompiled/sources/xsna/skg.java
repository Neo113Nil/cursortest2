package xsna;

import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class skg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ skg(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((NewsFeedComponent) this.c.a(fpf0.a(NewsFeedComponent.class))).G2();
            case 1:
                return ((ReviewsComponent) this.c.a(fpf0.a(ReviewsComponent.class))).U3();
            case 2:
                return ((ClassifiedsComponent) this.c.a(fpf0.a(ClassifiedsComponent.class))).dc();
            default:
                return ((MarketComponent) this.c.a(fpf0.a(MarketComponent.class))).U1();
        }
    }
}
