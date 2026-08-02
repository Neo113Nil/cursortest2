package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.subscription.api.di.SubscriptionComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ qnh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).Le();
            default:
                return ((SubscriptionComponent) this.c.mo408a(fpf0.a(SubscriptionComponent.class))).h0();
        }
    }
}
