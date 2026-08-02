package xsna;

import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class e1h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ e1h(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((LinksBridgeComponent) this.c.a(fpf0.a(LinksBridgeComponent.class))).p().e();
            case 1:
                return ((ClipsConfigViewersComponent) this.c.a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            default:
                return (StorefrontComponent) this.c.a(fpf0.a(StorefrontComponent.class));
        }
    }
}
