package xsna;

import com.vk.ecomm.market.api.ctabutton.di.ProductTileCtaButtonComponent;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class xnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ xnh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ProductTileCtaButtonComponent) this.c.a(fpf0.a(ProductTileCtaButtonComponent.class))).v6();
            default:
                return ((StorefrontComponent) this.c.a(fpf0.a(StorefrontComponent.class))).a();
        }
    }
}
