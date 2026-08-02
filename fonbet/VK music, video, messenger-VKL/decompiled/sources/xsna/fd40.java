package xsna;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MusicCatalogResponseTransformerPlugin.kt */
/* loaded from: classes16.dex */
public final class fd40 implements kda {
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public fd40() {
        e20 e20Var = new e20(18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, e20Var);
        this.c = msy.a(lazyThreadSafetyMode, new f20(24));
        this.d = msy.a(lazyThreadSafetyMode, new wb1(27));
        this.e = msy.a(lazyThreadSafetyMode, new dv2(25));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.r1i0
    public final gzs c(CatalogBlock catalogBlock, List list, ArrayList arrayList, bi20 bi20Var) {
        return ((r1i0) this.e.getValue()).c(catalogBlock, list, arrayList, bi20Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ep8
    public final UIBlockAction d(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
        return ((ep8) this.c.getValue()).d(catalogButton, bi20Var, catalogExtendedData);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.u1i0
    public final UIBlock e(CatalogSection catalogSection, UIBlock uIBlock, CatalogExtendedData catalogExtendedData) {
        return ((u1i0) this.d.getValue()).e(catalogSection, uIBlock, catalogExtendedData);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xe7
    public final List f(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List list, oq8 oq8Var) {
        return ((xe7) this.b.getValue()).f(catalogBlock, catalogExtendedData, bi20Var, list, oq8Var);
    }
}
