package xsna;

import com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;
import com.vk.video.ui.share.api.VideoShareComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bba implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ bba(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (CatalogLegacyComponent) this.c.a(fpf0.a(CatalogLegacyComponent.class));
            case 1:
                return (CatalogLegacyComponent) this.c.a(fpf0.a(CatalogLegacyComponent.class));
            case 2:
                return (StorefrontServicesComponent) this.c.a(fpf0.a(StorefrontServicesComponent.class));
            default:
                return (VideoShareComponent) this.c.a(fpf0.a(VideoShareComponent.class));
        }
    }
}
