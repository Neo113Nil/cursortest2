package xsna;

import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.ecomm.contentproducts.di.ContentProductsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class fc8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ fc8(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ClipsConfigViewersComponent) this.c.a(fpf0.a(ClipsConfigViewersComponent.class));
            default:
                return (ContentProductsComponent) this.c.a(fpf0.a(ContentProductsComponent.class));
        }
    }
}
