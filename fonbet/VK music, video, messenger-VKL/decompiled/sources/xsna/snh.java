package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class snh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ snh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).h8();
            case 1:
                return (CartComponent) this.c.a(fpf0.a(CartComponent.class));
            default:
                return ((ModerationComponent) this.c.mo408a(fpf0.a(ModerationComponent.class))).bd();
        }
    }
}
