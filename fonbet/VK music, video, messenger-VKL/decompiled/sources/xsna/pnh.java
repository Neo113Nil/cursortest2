package xsna;

import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class pnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ pnh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((NewsFeedComponent) this.c.a(fpf0.a(NewsFeedComponent.class))).N0();
            default:
                return ((MarketComponent) this.c.a(fpf0.a(MarketComponent.class))).Z0();
        }
    }
}
