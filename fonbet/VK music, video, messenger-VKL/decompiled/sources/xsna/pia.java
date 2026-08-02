package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class pia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ pia(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class));
            default:
                return (StorefrontServicesComponent) this.c.a(fpf0.a(StorefrontServicesComponent.class));
        }
    }
}
