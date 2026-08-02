package xsna;

import com.vk.cachecontrol.api.CacheComponent;
import com.vk.profile.community.catalog.api.di.CommunitiesCatalogComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class gc8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ gc8(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (CacheComponent) this.c.a(fpf0.a(CacheComponent.class));
            default:
                return (CommunitiesCatalogComponent) this.c.a(fpf0.a(CommunitiesCatalogComponent.class));
        }
    }
}
