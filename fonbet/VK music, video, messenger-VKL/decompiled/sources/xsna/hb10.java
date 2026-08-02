package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.market.catalog.CatalogMarketCategoryContext;
import com.vk.dto.market.catalog.CatalogMarketDeliveryTypeDto;
import com.vk.dto.market.catalog.CatalogMarketDistanceOption;
import com.vk.dto.market.catalog.CatalogMarketFilter;
import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import com.vk.ecomm.market.api.search.filters.dto.MarketDeliveryType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.dv00;
import xsna.kr80;

/* compiled from: MarketProductFiltersRouterImpl.kt */
/* loaded from: classes18.dex */
public final class hb10 implements fb10 {
    public final dhc a;

    public hb10(dhc dhcVar) {
        this.a = dhcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0251 A[ADDED_TO_REGION, EDGE_INSN: B:85:0x0251->B:72:0x0251 BREAK  A[LOOP:5: B:66:0x0242->B:70:0x024a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e5  */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.util.ArrayList] */
    @Override // xsna.fb10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kr80 kr80Var) {
        boolean z;
        Object obj;
        MarketBridgeCategory a;
        MarketCatalogFilterVM.d dVar;
        Iterator it;
        Object obj2;
        CatalogMarketCategoryContext catalogMarketCategoryContext;
        MarketBridgeCategory marketBridgeCategory;
        MarketBridgeCategory a2;
        List list;
        MarketCatalogFilterVM.a aVar;
        Iterator it2;
        List<CatalogMarketStatusOption> list2;
        CatalogMarketStatusOption catalogMarketStatusOption;
        int i;
        MarketDeliveryType marketDeliveryType;
        MarketDeliveryType marketDeliveryType2;
        Context context;
        boolean z2;
        FragmentActivity fragmentActivity;
        Object obj3;
        CatalogMarketFilter catalogMarketFilter = kr80Var.b;
        List<CatalogMarketCategoryContext> list3 = catalogMarketFilter.g;
        int i2 = 0;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                if (((CatalogMarketCategoryContext) it3.next()).b == CatalogMarketCategoryContext.Context.MARKET) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        ?? r4 = kr80Var.c;
        ArrayList arrayList = kr80Var.d;
        kr80.b bVar = kr80Var.e;
        List<CatalogMarketCategoryContext> list4 = catalogMarketFilter.g;
        MarketCatalogFilterVM.FilterContextType a3 = dv00.a(catalogMarketFilter.b);
        dz00 dz00Var = bVar != null ? new dz00(bVar.a, bVar.b, bVar.c) : null;
        if (!z) {
            a3 = MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS;
        }
        MarketCatalogFilterVM.FilterContextType filterContextType = a3;
        MarketCatalogFilterVM.FilterContextType filterContextType2 = z ? MarketCatalogFilterVM.FilterContextType.MARKET : MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS;
        List<CatalogMarketCategoryContext> list5 = list4;
        Iterator it4 = list5.iterator();
        while (true) {
            if (it4.hasNext()) {
                obj = it4.next();
                if (((CatalogMarketCategoryContext) obj).b == CatalogMarketCategoryContext.Context.MARKET) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CatalogMarketCategoryContext catalogMarketCategoryContext2 = (CatalogMarketCategoryContext) obj;
        if (catalogMarketCategoryContext2 != null) {
            MarketBridgeCategory marketBridgeCategory2 = (MarketBridgeCategory) r4.get(catalogMarketCategoryContext2.c);
            if (marketBridgeCategory2 == null) {
                marketBridgeCategory2 = null;
            } else {
                Integer num = catalogMarketCategoryContext2.d;
                if (num != null && (a = marketBridgeCategory2.a(num.intValue())) != null) {
                    marketBridgeCategory2 = a;
                }
            }
            if (marketBridgeCategory2 != null) {
                Integer num2 = catalogMarketCategoryContext2.e;
                dVar = new MarketCatalogFilterVM.d(marketBridgeCategory2, num2 != null ? marketBridgeCategory2.a(num2.intValue()) : null);
                it = list5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = it.next();
                        if (((CatalogMarketCategoryContext) obj2).b == CatalogMarketCategoryContext.Context.CLASSIFIEDS) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                catalogMarketCategoryContext = (CatalogMarketCategoryContext) obj2;
                if (catalogMarketCategoryContext != null) {
                    MarketBridgeCategory marketBridgeCategory3 = (MarketBridgeCategory) r4.get(catalogMarketCategoryContext.c);
                    if (marketBridgeCategory3 == null) {
                        marketBridgeCategory = null;
                    } else {
                        Integer num3 = catalogMarketCategoryContext.d;
                        marketBridgeCategory = (num3 == null || (a2 = marketBridgeCategory3.a(num3.intValue())) == null) ? marketBridgeCategory3 : a2;
                    }
                    if (marketBridgeCategory != null) {
                        Integer num4 = catalogMarketCategoryContext.e;
                        MarketBridgeCategory a4 = num4 != null ? marketBridgeCategory.a(num4.intValue()) : null;
                        Integer num5 = catalogMarketFilter.h;
                        Integer num6 = catalogMarketFilter.i;
                        List<CatalogMarketDistanceOption> list6 = catalogMarketFilter.j;
                        if (list6 != null) {
                            List<CatalogMarketDistanceOption> list7 = list6;
                            list = new ArrayList(c5g.u(list7, 10));
                            for (CatalogMarketDistanceOption catalogMarketDistanceOption : list7) {
                                list.add(new MarketCatalogFilterVM.b(catalogMarketDistanceOption.b, catalogMarketDistanceOption.c));
                            }
                        } else {
                            list = EmptyList.b;
                        }
                        aVar = new MarketCatalogFilterVM.a(marketBridgeCategory, a4, num5, num6, list);
                        Long l = catalogMarketFilter.c;
                        Long l2 = catalogMarketFilter.d;
                        String str = catalogMarketFilter.e.d;
                        EnumMap enumMap = new EnumMap(MarketCatalogFilterVM.FilterContextType.class);
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            kr80.a aVar2 = (kr80.a) it2.next();
                            MarketCatalogFilterVM.FilterContextType a5 = dv00.a(aVar2.a);
                            Object obj4 = enumMap.get(a5);
                            if (obj4 == null) {
                                obj4 = new EnumMap(MarketCatalogFilterVM.FilterContextType.class);
                                enumMap.put((EnumMap) a5, (MarketCatalogFilterVM.FilterContextType) obj4);
                            }
                            Map map = (Map) obj4;
                            MarketCatalogFilterVM.FilterContextType a6 = dv00.a(aVar2.b);
                            Object obj5 = map.get(a6);
                            if (obj5 == null) {
                                obj5 = new HashMap();
                                map.put(a6, obj5);
                            }
                            Map map2 = (Map) obj5;
                            Iterator it5 = aVar2.c.iterator();
                            while (it5.hasNext()) {
                                List list8 = (List) it5.next();
                                map2.put(list8.get(0), list8.get(1));
                            }
                        }
                        list2 = catalogMarketFilter.l;
                        if (list2 != null) {
                            Iterator it6 = list2.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    obj3 = it6.next();
                                    if (epx.f(((CatalogMarketStatusOption) obj3).c, catalogMarketFilter.k)) {
                                        break;
                                    }
                                } else {
                                    obj3 = null;
                                    break;
                                }
                            }
                            catalogMarketStatusOption = (CatalogMarketStatusOption) obj3;
                        } else {
                            catalogMarketStatusOption = null;
                        }
                        List<CatalogMarketStatusOption> list9 = catalogMarketFilter.l;
                        Boolean bool = catalogMarketFilter.m;
                        Boolean bool2 = catalogMarketFilter.n;
                        Boolean bool3 = catalogMarketFilter.o;
                        Boolean bool4 = catalogMarketFilter.p;
                        Boolean bool5 = catalogMarketFilter.q;
                        CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto = catalogMarketFilter.r;
                        i = catalogMarketDeliveryTypeDto == null ? -1 : dv00.a.$EnumSwitchMapping$0[catalogMarketDeliveryTypeDto.ordinal()];
                        if (i == 1) {
                            marketDeliveryType = MarketDeliveryType.ANY;
                        } else if (i == 2) {
                            marketDeliveryType = MarketDeliveryType.COURIER;
                        } else {
                            if (i != 3) {
                                marketDeliveryType2 = null;
                                MarketCatalogFilterVM marketCatalogFilterVM = new MarketCatalogFilterVM(filterContextType, filterContextType2, dVar, aVar, dz00Var, l, l2, str, catalogMarketStatusOption, list9, bool, bool2, bool3, bool4, bool5, marketDeliveryType2, enumMap);
                                gb10 gb10Var = new gb10(i2, this, kr80Var);
                                jjx jjxVar = new jjx(this, kr80Var);
                                Context context2 = kr80Var.a;
                                context = context2;
                                while (true) {
                                    z2 = context instanceof FragmentActivity;
                                    if (!z2 || !(context instanceof ContextWrapper)) {
                                        break;
                                    } else {
                                        context = ((ContextWrapper) context).getBaseContext();
                                    }
                                }
                                fragmentActivity = (FragmentActivity) (!z2 ? (Activity) context : null);
                                if (fragmentActivity != null) {
                                    return;
                                }
                                qy00 qy00Var = new qy00(context2, marketCatalogFilterVM, z);
                                int i3 = ify.a;
                                if (!ify.e(ify.c)) {
                                    cv00.b.a(fragmentActivity, marketCatalogFilterVM, qy00Var, jjxVar, gb10Var);
                                    return;
                                } else {
                                    ify.a(new bv00(fragmentActivity, marketCatalogFilterVM, qy00Var, jjxVar, gb10Var));
                                    mhy.b(fragmentActivity);
                                    return;
                                }
                            }
                            marketDeliveryType = MarketDeliveryType.PICKUP;
                        }
                        marketDeliveryType2 = marketDeliveryType;
                        MarketCatalogFilterVM marketCatalogFilterVM2 = new MarketCatalogFilterVM(filterContextType, filterContextType2, dVar, aVar, dz00Var, l, l2, str, catalogMarketStatusOption, list9, bool, bool2, bool3, bool4, bool5, marketDeliveryType2, enumMap);
                        gb10 gb10Var2 = new gb10(i2, this, kr80Var);
                        jjx jjxVar2 = new jjx(this, kr80Var);
                        Context context22 = kr80Var.a;
                        context = context22;
                        while (true) {
                            z2 = context instanceof FragmentActivity;
                            if (!z2) {
                                break;
                            } else {
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                        fragmentActivity = (FragmentActivity) (!z2 ? (Activity) context : null);
                        if (fragmentActivity != null) {
                        }
                    }
                }
                aVar = null;
                Long l3 = catalogMarketFilter.c;
                Long l22 = catalogMarketFilter.d;
                String str2 = catalogMarketFilter.e.d;
                EnumMap enumMap2 = new EnumMap(MarketCatalogFilterVM.FilterContextType.class);
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                }
                list2 = catalogMarketFilter.l;
                if (list2 != null) {
                }
                List<CatalogMarketStatusOption> list92 = catalogMarketFilter.l;
                Boolean bool6 = catalogMarketFilter.m;
                Boolean bool22 = catalogMarketFilter.n;
                Boolean bool32 = catalogMarketFilter.o;
                Boolean bool42 = catalogMarketFilter.p;
                Boolean bool52 = catalogMarketFilter.q;
                CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto2 = catalogMarketFilter.r;
                if (catalogMarketDeliveryTypeDto2 == null) {
                }
                if (i == 1) {
                }
                marketDeliveryType2 = marketDeliveryType;
                MarketCatalogFilterVM marketCatalogFilterVM22 = new MarketCatalogFilterVM(filterContextType, filterContextType2, dVar, aVar, dz00Var, l3, l22, str2, catalogMarketStatusOption, list92, bool6, bool22, bool32, bool42, bool52, marketDeliveryType2, enumMap2);
                gb10 gb10Var22 = new gb10(i2, this, kr80Var);
                jjx jjxVar22 = new jjx(this, kr80Var);
                Context context222 = kr80Var.a;
                context = context222;
                while (true) {
                    z2 = context instanceof FragmentActivity;
                    if (!z2) {
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                fragmentActivity = (FragmentActivity) (!z2 ? (Activity) context : null);
                if (fragmentActivity != null) {
                }
            }
        }
        dVar = null;
        it = list5.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        catalogMarketCategoryContext = (CatalogMarketCategoryContext) obj2;
        if (catalogMarketCategoryContext != null) {
        }
        aVar = null;
        Long l32 = catalogMarketFilter.c;
        Long l222 = catalogMarketFilter.d;
        String str22 = catalogMarketFilter.e.d;
        EnumMap enumMap22 = new EnumMap(MarketCatalogFilterVM.FilterContextType.class);
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
        }
        list2 = catalogMarketFilter.l;
        if (list2 != null) {
        }
        List<CatalogMarketStatusOption> list922 = catalogMarketFilter.l;
        Boolean bool62 = catalogMarketFilter.m;
        Boolean bool222 = catalogMarketFilter.n;
        Boolean bool322 = catalogMarketFilter.o;
        Boolean bool422 = catalogMarketFilter.p;
        Boolean bool522 = catalogMarketFilter.q;
        CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto22 = catalogMarketFilter.r;
        if (catalogMarketDeliveryTypeDto22 == null) {
        }
        if (i == 1) {
        }
        marketDeliveryType2 = marketDeliveryType;
        MarketCatalogFilterVM marketCatalogFilterVM222 = new MarketCatalogFilterVM(filterContextType, filterContextType2, dVar, aVar, dz00Var, l32, l222, str22, catalogMarketStatusOption, list922, bool62, bool222, bool322, bool422, bool522, marketDeliveryType2, enumMap22);
        gb10 gb10Var222 = new gb10(i2, this, kr80Var);
        jjx jjxVar222 = new jjx(this, kr80Var);
        Context context2222 = kr80Var.a;
        context = context2222;
        while (true) {
            z2 = context instanceof FragmentActivity;
            if (!z2) {
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        fragmentActivity = (FragmentActivity) (!z2 ? (Activity) context : null);
        if (fragmentActivity != null) {
        }
    }
}
