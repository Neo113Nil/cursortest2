package xsna;

import com.vk.attachpicker.di.AttachPickerComponent;
import com.vk.catalog.mvi.api.di.CatalogMviLegacyComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class v3a implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ v3a(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (CatalogMviLegacyComponent) this.c.c(fpf0.a(CatalogMviLegacyComponent.class));
            default:
                return (AttachPickerComponent) this.c.a(fpf0.a(AttachPickerComponent.class));
        }
    }
}
