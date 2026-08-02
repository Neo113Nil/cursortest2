package xsna;

import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class f1h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ f1h(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((StorefrontComponent) this.c.a(fpf0.a(StorefrontComponent.class))).a();
            case 1:
                return ((ClipsEntryPointsComponent) this.c.mo408a(fpf0.a(ClipsEntryPointsComponent.class))).E6();
            default:
                return ((InfoBridgeComponent) this.c.a(fpf0.a(InfoBridgeComponent.class))).t().b();
        }
    }
}
