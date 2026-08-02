package xsna;

import com.vk.catalog.mvi.block.impl.di.CatalogViewComponentImpl;
import com.vk.catalog.mvi.block.music.impl.di.CatalogMusicViewComponentImpl;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import kotlin.Lazy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class uaa implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uaa(Lazy lazy, int i) {
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
                return ((CatalogComponent) r1.getValue()).Ze();
            default:
                qcy<Object>[] qcyVarArr2 = CatalogViewComponentImpl.g;
                return ((CatalogInteractorComponent) r1.getValue()).z0();
        }
    }
}
