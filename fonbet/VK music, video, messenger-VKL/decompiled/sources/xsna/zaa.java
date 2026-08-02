package xsna;

import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.clips.precache.api.di.ClipsPrecacheComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class zaa implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ zaa(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (CatalogComponent) this.c.a(fpf0.a(CatalogComponent.class));
            case 1:
                return (CatalogComponent) this.c.a(fpf0.a(CatalogComponent.class));
            default:
                return (ClipsPrecacheComponent) this.c.a(fpf0.a(ClipsPrecacheComponent.class));
        }
    }
}
