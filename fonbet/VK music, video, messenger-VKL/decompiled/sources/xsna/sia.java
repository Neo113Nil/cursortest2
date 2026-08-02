package xsna;

import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class sia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ sia(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (CatalogInteractorComponent) this.c.a(fpf0.a(CatalogInteractorComponent.class));
            default:
                return (StorefrontComponent) this.c.a(fpf0.a(StorefrontComponent.class));
        }
    }
}
