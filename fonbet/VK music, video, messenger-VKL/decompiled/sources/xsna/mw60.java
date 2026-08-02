package xsna;

import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mw60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ mw60(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ProductsMultipickerComponent) this.c.a(fpf0.a(ProductsMultipickerComponent.class));
            default:
                return (DonutVideoComponent) this.c.a(fpf0.a(DonutVideoComponent.class));
        }
    }
}
