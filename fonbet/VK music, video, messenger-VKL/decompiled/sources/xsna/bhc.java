package xsna;

import com.vk.catalog2.common.dto.api.market.CatalogMarketCategory;
import com.vk.dto.common.Image;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClassifiedsNavigationTabDelegates.kt */
/* loaded from: classes16.dex */
public final class bhc {
    public static final MarketBridgeCategory a(CatalogMarketCategory catalogMarketCategory) {
        List list;
        CatalogMarketCategory.CategoryView categoryView = catalogMarketCategory.f;
        boolean z = (categoryView != null ? categoryView.b : null) == CatalogMarketCategory.CategoryView.ViewType.TAB_ROOT;
        int i = catalogMarketCategory.b;
        String str = catalogMarketCategory.c;
        Image image = catalogMarketCategory.d;
        List<CatalogMarketCategory> list2 = catalogMarketCategory.e;
        if (list2 != null) {
            List<CatalogMarketCategory> list3 = list2;
            list = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                list.add(a((CatalogMarketCategory) it.next()));
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = EmptyList.b;
        }
        MarketBridgeCategory.CategoryView.Type type = z ? MarketBridgeCategory.CategoryView.Type.TAB_ROOT : MarketBridgeCategory.CategoryView.Type.SIMPLE;
        CatalogMarketCategory.CategoryView categoryView2 = catalogMarketCategory.f;
        return new MarketBridgeCategory(i, str, image, list, new MarketBridgeCategory.CategoryView(type, categoryView2 != null ? categoryView2.c : null));
    }
}
