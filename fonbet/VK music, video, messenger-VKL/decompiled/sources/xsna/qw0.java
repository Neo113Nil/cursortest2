package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogLinkDto;
import com.vk.api.generated.classifieds.dto.ClassifiedsYoulaCityDto;
import com.vk.api.generated.market.dto.MarketGroupCatalogItemDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryMappingDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryTreeDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsInfoBlockCatalogDto;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.market.CatalogClassifiedYoulaCity;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategoryMappings;
import com.vk.catalog2.common.dto.api.market.CatalogMarketGroupInfo;
import com.vk.catalog2.common.dto.api.market.MarketInfo;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: AdsItemEndOverlayClickHandler.kt */
/* loaded from: classes17.dex */
public final class qw0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public qw0(cb cbVar, bb bbVar, bb bbVar2, ey0 ey0Var, eb ebVar) {
        this.a = cbVar;
        this.b = bbVar;
        this.c = bbVar2;
        this.d = ey0Var;
        this.e = ebVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    public static LinkedHashMap d(List list) {
        List list2;
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MarketGroupCatalogItemDto marketGroupCatalogItemDto : list) {
            String id = marketGroupCatalogItemDto.getId();
            String id2 = marketGroupCatalogItemDto.getId();
            CatalogLink a = q8a.a(marketGroupCatalogItemDto.e());
            String url = marketGroupCatalogItemDto.getUrl();
            if (url == null) {
                url = "";
            }
            String str = url;
            List<CatalogCatalogLinkDto> f = marketGroupCatalogItemDto.f();
            List list3 = 0;
            if (f != null) {
                List<CatalogCatalogLinkDto> list4 = f;
                list2 = new ArrayList(c5g.u(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    list2.add(q8a.a((CatalogCatalogLinkDto) it.next()));
                }
            } else {
                list2 = 0;
            }
            if (list2 == 0) {
                list2 = EmptyList.b;
            }
            CatalogCatalogLinkDto d = marketGroupCatalogItemDto.d();
            CatalogLink a2 = d != null ? q8a.a(d) : null;
            List<CatalogCatalogLinkDto> g = marketGroupCatalogItemDto.g();
            if (g != null) {
                List<CatalogCatalogLinkDto> list5 = g;
                list3 = new ArrayList(c5g.u(list5, 10));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    list3.add(q8a.a((CatalogCatalogLinkDto) it2.next()));
                }
            }
            if (list3 == 0) {
                list3 = EmptyList.b;
            }
            linkedHashMap.put(id, new CatalogMarketGroupInfo(id2, a, str, list2, a2, list3));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap f(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Good c = b210.c((MarketMarketItemDto) it.next());
            Pair pair = new Pair(c.Ab(), c);
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public ArrayList a(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        w8a w8aVar = (w8a) this.c.getValue();
        for (MarketMarketCategoryMappingDto marketMarketCategoryMappingDto : list) {
            w8aVar.getClass();
            arrayList.add(new CatalogMarketCategoryMappings(marketMarketCategoryMappingDto.e(), marketMarketCategoryMappingDto.d()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public LinkedHashMap b(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        v8a v8aVar = (v8a) this.b.getValue();
        for (MarketMarketCategoryTreeDto marketMarketCategoryTreeDto : list) {
            linkedHashMap.put(String.valueOf(marketMarketCategoryTreeDto.getId()), v8aVar.a(marketMarketCategoryTreeDto));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public LinkedHashMap c(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        k3a k3aVar = (k3a) this.d.getValue();
        for (ClassifiedsYoulaCityDto classifiedsYoulaCityDto : list) {
            String id = classifiedsYoulaCityDto.getId();
            k3aVar.getClass();
            linkedHashMap.put(id, new CatalogClassifiedYoulaCity(classifiedsYoulaCityDto.getId(), classifiedsYoulaCityDto.f(), Double.parseDouble(classifiedsYoulaCityDto.d()), Double.parseDouble(classifiedsYoulaCityDto.e())));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public LinkedHashMap e(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a9a a9aVar = (a9a) this.e.getValue();
        for (MarketIntegrationsInfoBlockCatalogDto marketIntegrationsInfoBlockCatalogDto : list) {
            String valueOf = String.valueOf(marketIntegrationsInfoBlockCatalogDto.g());
            a9aVar.getClass();
            String j = marketIntegrationsInfoBlockCatalogDto.j();
            MarketIntegrationsInfoBlockCatalogDto.TypeDto k = marketIntegrationsInfoBlockCatalogDto.k();
            MarketInfo.MarketInfoType.a aVar = MarketInfo.MarketInfoType.Companion;
            String i = k.i();
            aVar.getClass();
            MarketInfo.MarketInfoType a = MarketInfo.MarketInfoType.a.a(i);
            MarketIntegrationsInfoBlockCatalogDto.SubtypeDto i2 = marketIntegrationsInfoBlockCatalogDto.i();
            MarketInfo.MarketInfoSubtype.a aVar2 = MarketInfo.MarketInfoSubtype.Companion;
            Image image = null;
            String i3 = i2 != null ? i2.i() : null;
            aVar2.getClass();
            MarketInfo.MarketInfoSubtype a2 = MarketInfo.MarketInfoSubtype.a.a(i3);
            Integer g = marketIntegrationsInfoBlockCatalogDto.g();
            BaseImageDto f = marketIntegrationsInfoBlockCatalogDto.f();
            Image a3 = f != null ? a9a.a(f) : null;
            BaseImageDto e = marketIntegrationsInfoBlockCatalogDto.e();
            if (e != null) {
                image = a9a.a(e);
            }
            linkedHashMap.put(valueOf, new MarketInfo(j, a, a2, g, a3, image, marketIntegrationsInfoBlockCatalogDto.d()));
        }
        return linkedHashMap;
    }

    public qw0(ne6 ne6Var) {
        this.a = ne6Var;
        s5 s5Var = new s5(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, s5Var);
        this.c = msy.a(lazyThreadSafetyMode, new ml7(1));
        this.d = msy.a(lazyThreadSafetyMode, new qo0(3));
        this.e = msy.a(lazyThreadSafetyMode, new uw3(6));
    }
}
