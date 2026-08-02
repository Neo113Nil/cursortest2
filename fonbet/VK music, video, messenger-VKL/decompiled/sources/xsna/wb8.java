package xsna;

import com.navigation.vk.RouterComponent;
import com.vk.profile.community.catalog.api.di.CommunitiesCatalogComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class wb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ wb8(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (CommunitiesCatalogComponent) this.c.a(fpf0.a(CommunitiesCatalogComponent.class));
            default:
                return (RouterComponent) this.c.a(fpf0.a(RouterComponent.class));
        }
    }
}
