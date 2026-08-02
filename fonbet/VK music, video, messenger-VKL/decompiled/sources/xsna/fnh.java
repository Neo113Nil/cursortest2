package xsna;

import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.fave.di.FaveComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class fnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ fnh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((CartComponent) this.c.a(fpf0.a(CartComponent.class))).f8();
            default:
                return (FaveComponent) this.c.mo408a(fpf0.a(FaveComponent.class));
        }
    }
}
