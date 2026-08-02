package xsna;

import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.shop_conditions.api.di.MarketShopConditionsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ nnh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ReviewsComponent) this.c.a(fpf0.a(ReviewsComponent.class))).m1();
            default:
                return ((MarketShopConditionsComponent) this.c.mo408a(fpf0.a(MarketShopConditionsComponent.class))).a();
        }
    }
}
