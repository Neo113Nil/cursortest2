package xsna;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class g25 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ g25(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (MultiAccountComponent) this.c.a(fpf0.a(MultiAccountComponent.class));
            case 1:
                return (CatalogComponent) this.c.a(fpf0.a(CatalogComponent.class));
            case 2:
                return (AuthBridgeComponent) this.c.a(fpf0.a(AuthBridgeComponent.class));
            default:
                return (NewsfeedRouterComponent) this.c.a(fpf0.a(NewsfeedRouterComponent.class));
        }
    }
}
