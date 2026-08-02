package xsna;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.style.CatalogTabStyle;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MusicAndroidAutoCatalogResponseTransformerPlugin.kt */
/* loaded from: classes16.dex */
public final class y940 implements kda {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new l63(23));

    @Override // xsna.r1i0
    public final gzs c(CatalogBlock catalogBlock, List list, ArrayList arrayList, bi20 bi20Var) {
        return null;
    }

    @Override // xsna.ep8
    public final UIBlockAction d(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
        return null;
    }

    @Override // xsna.u1i0
    public final UIBlock e(CatalogSection catalogSection, UIBlock uIBlock, CatalogExtendedData catalogExtendedData) {
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList == null) {
            return uIBlock;
        }
        String str = uIBlockList.b;
        String str2 = catalogSection.o;
        return uIBlockList.Qb(str, str2 != null ? new CatalogTabStyle.Icon(str2) : null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xe7
    public final List f(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List list, oq8 oq8Var) {
        return ((xe7) this.b.getValue()).f(catalogBlock, catalogExtendedData, bi20Var, list, oq8Var);
    }
}
