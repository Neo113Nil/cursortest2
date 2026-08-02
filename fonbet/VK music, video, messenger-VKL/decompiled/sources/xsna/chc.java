package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.market.CatalogClassifiedYoulaCity;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategory;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategoryMappings;
import com.vk.catalog2.common.dto.ui.market.UIBlockNavigationTab;
import com.vk.dto.market.catalog.CatalogMarketFilter;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import xsna.kr80;

/* compiled from: ClassifiedsNavigationTabDelegates.kt */
/* loaded from: classes16.dex */
public final class chc implements kz50 {
    public final Context a;
    public final fb10 b;
    public final String c;

    public chc(Context context, fb10 fb10Var, String str) {
        this.a = context;
        this.b = fb10Var;
        this.c = str;
    }

    @Override // xsna.kz50
    public final void a(UIBlockNavigationTab uIBlockNavigationTab) {
        CatalogMarketFilter catalogMarketFilter = uIBlockNavigationTab.y.k;
        if (catalogMarketFilter == null) {
            return;
        }
        Set<Map.Entry<Integer, CatalogMarketCategory>> entrySet = uIBlockNavigationTab.z.entrySet();
        ArrayList arrayList = new ArrayList(c5g.u(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(entry.getKey(), bhc.a((CatalogMarketCategory) entry.getValue())));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        Map k = pn00.k((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        if (k.isEmpty()) {
            L.l("Attempt to open filters without any category trees");
            return;
        }
        List<CatalogMarketCategoryMappings> list = uIBlockNavigationTab.A;
        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
        for (CatalogMarketCategoryMappings catalogMarketCategoryMappings : list) {
            arrayList2.add(new kr80.a(catalogMarketCategoryMappings.d, catalogMarketCategoryMappings.e, catalogMarketCategoryMappings.f));
        }
        CatalogClassifiedYoulaCity catalogClassifiedYoulaCity = uIBlockNavigationTab.B;
        this.b.a(new kr80(this.a, catalogMarketFilter, k, arrayList2, catalogClassifiedYoulaCity != null ? new kr80.b(catalogClassifiedYoulaCity.c, catalogClassifiedYoulaCity.d, catalogClassifiedYoulaCity.e) : null, this.c, uIBlockNavigationTab.b));
    }
}
