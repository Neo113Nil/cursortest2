package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.CatalogButtonClearRecent;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.SearchSuggestion;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: CatalogWithRecentResponseTransformer.kt */
/* loaded from: classes16.dex */
public final class dja {
    public final String a;
    public final bpn0 b = new bpn0(new ek(4));

    public dja(String str) {
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(CatalogSection catalogSection, CatalogExtendedData catalogExtendedData, fgg0 fgg0Var) {
        List<CatalogBlock> list = catalogSection.i;
        String str = catalogSection.b;
        CatalogViewType catalogViewType = CatalogViewType.HEADER_LARGE;
        UserId userId = UserId.d;
        bpn0 bpn0Var = this.b;
        CatalogLayout catalogLayout = new CatalogLayout(catalogViewType, userId, (String) bpn0Var.getValue(), "", null, false, null, null, null, 496, null);
        CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_NONE;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String string = context.getString(R.string.music_button_clear);
        ArrayList arrayList = new ArrayList(c5g.u(fgg0Var, 10));
        Iterator<T> it = fgg0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()) + '_');
        }
        String str2 = this.a;
        StringBuilder e = fw3.e(str2);
        e.append((String) bpn0Var.getValue());
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        Map map4 = null;
        list.add(0, new CatalogBlock(this.a, catalogDataType, null, str, null, null, null, catalogLayout, e43.a(new CatalogButtonClearRecent("clear_recent_groups", null, string, j5g.u0(e43.l(e.toString(), str2), arrayList), null, null, 48, null)), null, new ArrayList(), new CatalogBlockItemsData(catalogDataType, new ArrayList(), null, map, map4, null, map2, map3, null, null, null, null, 4092, null), null, null, null, null, null, null, null, null, null, 2088964, null));
        List<CatalogBlock> list2 = catalogSection.i;
        String str3 = catalogSection.b;
        CatalogLayout catalogLayout2 = new CatalogLayout(CatalogViewType.LIST, UserId.d, "", "", null, false, null, null, null, 496, null);
        CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_MUSIC_SEARCH_SUGGESTION;
        list2.add(1, new CatalogBlock(this.a, catalogDataType2, null, str3, null, null, null, catalogLayout2, new ArrayList(), null, new ArrayList(), new CatalogBlockItemsData(catalogDataType2, new ArrayList(fgg0Var), null, null, null, null, map, map4, null, map2, map3, 0 == true ? 1 : 0, 4092, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, 2088964, null));
        int e2 = on00.e(c5g.u(fgg0Var, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (Object obj : fgg0Var) {
            linkedHashMap.put(obj, new SearchSuggestion("", (String) obj, "", "", "", SearchSuggestion.Type.RecentWithoutClear, null, null, null, "", 448, null));
        }
        catalogExtendedData.zb(new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LinkedHashMap(linkedHashMap), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, 7, null));
    }

    public final void b(hda hdaVar, List list) {
        CatalogExtendedData catalogExtendedData = hdaVar.b;
        Object obj = hdaVar.a;
        if (list.isEmpty()) {
            return;
        }
        fgg0 fgg0Var = new fgg0(list);
        if (obj instanceof CatalogSection) {
            a((CatalogSection) obj, catalogExtendedData, fgg0Var);
            return;
        }
        if (obj instanceof CatalogCatalog) {
            CatalogCatalog catalogCatalog = (CatalogCatalog) obj;
            if (!catalogCatalog.b.isEmpty()) {
                CatalogSection catalogSection = (CatalogSection) j5g.a0(catalogCatalog.b);
                if (catalogSection != null) {
                    a(catalogSection, catalogExtendedData, fgg0Var);
                    return;
                }
                return;
            }
        }
        if (BuildInfo.h()) {
            throw new IllegalArgumentException("Unknown item<" + obj.getClass().getCanonicalName() + ", can't cast to CatalogSection");
        }
    }
}
