package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.shop_conditions.api.di.MarketShopConditionsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class k63 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ k63(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).H2();
            case 1:
                return ((MarketShopConditionsComponent) this.c.mo408a(fpf0.a(MarketShopConditionsComponent.class))).a();
            default:
                return (CartComponent) this.c.a(fpf0.a(CartComponent.class));
        }
    }
}
