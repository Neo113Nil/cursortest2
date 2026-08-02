package xsna;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: PluggedCatalogResponseTransformer.kt */
/* loaded from: classes16.dex */
public final class wfb0 extends xc {
    public final LinkedHashSet c;

    public wfb0(Set<? extends kda> set) {
        Set<? extends kda> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator<T> it = set2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((kda) it.next()) instanceof iig) {
                    L.l(iig.class.getCanonicalName() + " must be internal and placed at the very last position in the plugin list");
                    break;
                }
            }
        }
        this.c = izi0.k(set, new iig());
    }

    @Override // xsna.r1i0
    public final gzs c(CatalogBlock catalogBlock, List list, ArrayList arrayList, bi20 bi20Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            gzs c = ((kda) it.next()).c(catalogBlock, list, arrayList, bi20Var);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    @Override // xsna.ep8
    public final UIBlockAction d(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            UIBlockAction d = ((kda) it.next()).d(catalogButton, bi20Var, catalogExtendedData);
            if (d != null) {
                return d;
            }
        }
        return null;
    }

    @Override // xsna.u1i0
    public final UIBlock e(CatalogSection catalogSection, UIBlock uIBlock, CatalogExtendedData catalogExtendedData) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            uIBlock = ((kda) it.next()).e(catalogSection, uIBlock, catalogExtendedData);
        }
        uIBlock.o = catalogSection.c;
        return uIBlock;
    }

    @Override // xsna.xe7
    public final List f(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List list, oq8 oq8Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            List list2 = list;
            oq8 oq8Var2 = oq8Var;
            List f = ((kda) it.next()).f(catalogBlock2, catalogExtendedData2, bi20Var2, list2, oq8Var2);
            if (f != null) {
                return f;
            }
            catalogBlock = catalogBlock2;
            catalogExtendedData = catalogExtendedData2;
            bi20Var = bi20Var2;
            list = list2;
            oq8Var = oq8Var2;
        }
        return EmptyList.b;
    }

    @Override // xsna.xc
    public final UIBlock h(CatalogSection catalogSection, CatalogExtendedData catalogExtendedData) {
        return e(catalogSection, super.h(catalogSection, catalogExtendedData), catalogExtendedData);
    }
}
