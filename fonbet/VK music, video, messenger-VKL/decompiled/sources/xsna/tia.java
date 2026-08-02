package xsna;

import com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class tia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ tia(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (CatalogLegacyComponent) this.c.a(fpf0.a(CatalogLegacyComponent.class));
            default:
                return (TabbarSettingsComponent) this.c.a(fpf0.a(TabbarSettingsComponent.class));
        }
    }
}
