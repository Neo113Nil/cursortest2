package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryTreeDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryTreeViewDto;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategory;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CatalogMarketCategoryMapper.kt */
/* loaded from: classes16.dex */
public final class v8a {
    public final ne6 a;

    public v8a(ne6 ne6Var) {
        this.a = ne6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.vk.catalog2.common.dto.api.market.CatalogMarketCategory$CategoryView] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.vk.catalog2.common.dto.api.market.CatalogMarketCategory$CategoryView] */
    public final CatalogMarketCategory a(MarketMarketCategoryTreeDto marketMarketCategoryTreeDto) {
        ArrayList arrayList;
        int id = marketMarketCategoryTreeDto.getId();
        String f = marketMarketCategoryTreeDto.f();
        List<BaseImageDto> e = marketMarketCategoryTreeDto.e();
        if (e == null) {
            e = EmptyList.b;
        }
        this.a.getClass();
        Image a = ne6.a(e);
        List<MarketMarketCategoryTreeDto> d = marketMarketCategoryTreeDto.d();
        if (d != null) {
            List<MarketMarketCategoryTreeDto> list = d;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a((MarketMarketCategoryTreeDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        MarketMarketCategoryTreeViewDto g = marketMarketCategoryTreeDto.g();
        if (g != null) {
            CatalogMarketCategory.CategoryView.ViewType.a aVar = CatalogMarketCategory.CategoryView.ViewType.Companion;
            MarketMarketCategoryTreeViewDto.TypeDto e2 = g.e();
            r4 = e2 != null ? e2.i() : null;
            aVar.getClass();
            r4 = new CatalogMarketCategory.CategoryView(CatalogMarketCategory.CategoryView.ViewType.a.a(r4), g.d());
        }
        return new CatalogMarketCategory(id, f, a, arrayList, r4);
    }

    public v8a() {
        this(new ne6());
    }
}
