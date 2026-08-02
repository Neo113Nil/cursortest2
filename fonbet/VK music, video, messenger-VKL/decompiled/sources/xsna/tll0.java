package xsna;

import com.vk.ecomm.market.api.ctabutton.di.ProductTileCtaButtonComponent;
import com.vk.ecomm.market.api.di.MarketComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tll0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ tll0(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((MarketComponent) this.c.a(fpf0.a(MarketComponent.class))).C3();
            default:
                return ((ProductTileCtaButtonComponent) this.c.a(fpf0.a(ProductTileCtaButtonComponent.class))).v6();
        }
    }
}
