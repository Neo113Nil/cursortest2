package xsna;

import com.vk.catalog.mvi.section.screen.api.CatalogSectionScreenComponent;
import com.vk.di.component.app.AppContextDiComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u3a implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ u3a(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (CatalogSectionScreenComponent) this.c.c(fpf0.a(CatalogSectionScreenComponent.class));
            default:
                return (AppContextDiComponent) this.c.a(fpf0.a(AppContextDiComponent.class));
        }
    }
}
