package xsna;

import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class yb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ yb8(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (NewsfeedRouterComponent) this.c.a(fpf0.a(NewsfeedRouterComponent.class));
            default:
                return (CartComponent) this.c.a(fpf0.a(CartComponent.class));
        }
    }
}
