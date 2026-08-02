package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: CatalogViewHolderFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class xia implements wia {
    public final List<n5a> a;

    public xia(n5a... n5aVarArr) {
        this.a = Arrays.asList(n5aVarArr);
    }

    @Override // xsna.wia
    public final CatalogViewHolder a(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, z4a z4aVar) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            SearchSpellcheckVh a = ((n5a) it.next()).a(catalogDataType, catalogViewType, z4aVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }
}
