package xsna;

import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class vnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ vnh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((CommunityNewsfeedComponent) this.c.mo408a(fpf0.a(CommunityNewsfeedComponent.class))).ba();
            case 1:
                return ((CartComponent) this.c.a(fpf0.a(CartComponent.class))).f8();
            default:
                return ((MarketComponent) this.c.a(fpf0.a(MarketComponent.class))).Ob();
        }
    }
}
