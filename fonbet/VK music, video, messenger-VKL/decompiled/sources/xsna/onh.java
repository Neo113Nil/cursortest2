package xsna;

import com.vk.ecomm.market.api.ctabutton.di.ProductTileCtaButtonComponent;
import com.vk.tabbar.core.api.di.TabbarCoreComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class onh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ onh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((TabbarCoreComponent) this.c.a(fpf0.a(TabbarCoreComponent.class))).y8();
            default:
                return ((ProductTileCtaButtonComponent) this.c.a(fpf0.a(ProductTileCtaButtonComponent.class))).v6();
        }
    }
}
