package xsna;

import com.vk.catalog.mvi.block.impl.di.CatalogViewComponentImpl;
import com.vk.catalog.mvi.block.music.impl.di.CatalogMusicViewComponentImpl;
import com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent;
import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import kotlin.Lazy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vaa implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vaa(Lazy lazy, int i) {
        this.b = i;
        this.c = lazy;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = CatalogMusicViewComponentImpl.i;
                return ((CatalogInteractorComponent) r1.getValue()).z0();
            default:
                qcy<Object>[] qcyVarArr2 = CatalogViewComponentImpl.g;
                return ((CatalogLegacyComponent) r1.getValue()).qf();
        }
    }
}
