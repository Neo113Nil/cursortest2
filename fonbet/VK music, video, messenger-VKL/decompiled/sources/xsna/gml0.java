package xsna;

import android.content.Context;
import com.vk.dto.common.Image;
import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: StorefrontFilterHelper.kt */
/* loaded from: classes18.dex */
public final class gml0 implements pcr<MarketCatalogFilterVM> {
    public final Context a;
    public final MarketCatalogFilterVM b;
    public MarketCatalogFilterVM c;

    public gml0(Context context, MarketCatalogFilterVM marketCatalogFilterVM) {
        this.a = context;
        this.b = marketCatalogFilterVM;
        this.c = marketCatalogFilterVM;
    }

    public static ArrayList c(Context context, List list, zkk zkkVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MarketBridgeCategory marketBridgeCategory = (MarketBridgeCategory) it.next();
            int i = marketBridgeCategory.b;
            String str = marketBridgeCategory.c;
            Image image = marketBridgeCategory.d;
            ArrayList c = c(context, marketBridgeCategory.e, zkkVar);
            if (!c.isEmpty()) {
                c.add(0, new wqd0(marketBridgeCategory.b, 101, context.getString(R.string.market_all_products_in_category)));
            }
            wqd0 wqd0Var = new wqd0(i, 100, str, image, c);
            zkkVar.invoke(wqd0Var);
            arrayList.add(wqd0Var);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
    
        if (xsna.epx.f(r7, (r8 == null || (r8 = r8.b) == null) ? null : java.lang.Long.valueOf(r8.intValue())) == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c7  */
    @Override // xsna.pcr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(List<? extends vcr<?>> list) {
        MarketCatalogFilterVM.c cVar;
        CatalogMarketStatusOption catalogMarketStatusOption;
        CatalogMarketStatusOption catalogMarketStatusOption2;
        Integer num;
        Integer num2;
        Integer num3;
        MarketBridgeCategory b;
        HashMap r = p4g.r(list, new vsq(29));
        rka rkaVar = (rka) r.get(fpf0.a(rka.class));
        MarketCatalogFilterVM marketCatalogFilterVM = this.c;
        MarketCatalogFilterVM.c b2 = marketCatalogFilterVM.b(marketCatalogFilterVM.a);
        Integer valueOf = (b2 == null || (b = b2.b()) == null) ? null : Integer.valueOf(b.b);
        wqd0 wqd0Var = rkaVar.e;
        boolean z = !epx.f(valueOf, wqd0Var != null ? Integer.valueOf(wqd0Var.a) : null);
        MarketCatalogFilterVM marketCatalogFilterVM2 = this.c;
        MarketCatalogFilterVM.c b3 = marketCatalogFilterVM2.b(marketCatalogFilterVM2.a);
        if (b3 != null) {
            wqd0 wqd0Var2 = rkaVar.e;
            cVar = b3.c(wqd0Var2 != null ? rkaVar.l.a(wqd0Var2.a) : null);
        } else {
            cVar = null;
        }
        MarketCatalogFilterVM marketCatalogFilterVM3 = this.c;
        MarketCatalogFilterVM.FilterContextType filterContextType = marketCatalogFilterVM3.a;
        Pair pair = new Pair(filterContextType == MarketCatalogFilterVM.FilterContextType.MARKET ? cVar instanceof MarketCatalogFilterVM.d ? (MarketCatalogFilterVM.d) cVar : null : marketCatalogFilterVM3.c, filterContextType == MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS ? cVar instanceof MarketCatalogFilterVM.a ? (MarketCatalogFilterVM.a) cVar : null : marketCatalogFilterVM3.d);
        MarketCatalogFilterVM.d dVar = (MarketCatalogFilterVM.d) pair.d();
        MarketCatalogFilterVM.a aVar = (MarketCatalogFilterVM.a) pair.g();
        Object obj = r.get(fpf0.a(wzk0.class));
        wzk0 wzk0Var = obj instanceof wzk0 ? (wzk0) obj : null;
        if (!epx.f(this.c.i, wzk0Var != null ? wzk0Var.f : null)) {
            z = true;
        }
        n6d0 n6d0Var = (n6d0) r.get(fpf0.a(n6d0.class));
        Long l = this.c.f;
        p6d0 p6d0Var = n6d0Var.f;
        if (epx.f(l, (p6d0Var == null || (num3 = p6d0Var.a) == null) ? null : Long.valueOf(num3.intValue()))) {
            Long l2 = this.c.g;
            p6d0 p6d0Var2 = n6d0Var.f;
        }
        z = true;
        Object obj2 = r.get(fpf0.a(znd0.class));
        znd0 znd0Var = obj2 instanceof znd0 ? (znd0) obj2 : null;
        if (!epx.f(this.c.l, znd0Var != null ? znd0Var.h : null)) {
            z = true;
        }
        Object obj3 = r.get(fpf0.a(wod0.class));
        wod0 wod0Var = obj3 instanceof wod0 ? (wod0) obj3 : null;
        if (!epx.f(this.c.n, wod0Var != null ? wod0Var.h : null)) {
            z = true;
        }
        Object obj4 = r.get(fpf0.a(xod0.class));
        xod0 xod0Var = obj4 instanceof xod0 ? (xod0) obj4 : null;
        if (!epx.f(this.c.o, xod0Var != null ? xod0Var.h : null)) {
            z = true;
        }
        if (!z) {
            return false;
        }
        MarketCatalogFilterVM marketCatalogFilterVM4 = this.c;
        p6d0 p6d0Var3 = n6d0Var.f;
        Long valueOf2 = (p6d0Var3 == null || (num2 = p6d0Var3.a) == null) ? null : Long.valueOf(num2.intValue());
        p6d0 p6d0Var4 = n6d0Var.f;
        Long valueOf3 = (p6d0Var4 == null || (num = p6d0Var4.b) == null) ? null : Long.valueOf(num.intValue());
        if (wzk0Var == null || (catalogMarketStatusOption2 = wzk0Var.f) == null) {
            if (wzk0Var == null) {
                catalogMarketStatusOption = null;
                this.c = MarketCatalogFilterVM.a(marketCatalogFilterVM4, null, dVar, aVar, null, valueOf2, valueOf3, catalogMarketStatusOption, wzk0Var == null ? wzk0Var.h : null, null, znd0Var == null ? znd0Var.h : null, null, wod0Var == null ? wod0Var.h : null, xod0Var != null ? xod0Var.h : null, null, 103571);
                return true;
            }
            catalogMarketStatusOption2 = wzk0Var.g;
        }
        catalogMarketStatusOption = catalogMarketStatusOption2;
        this.c = MarketCatalogFilterVM.a(marketCatalogFilterVM4, null, dVar, aVar, null, valueOf2, valueOf3, catalogMarketStatusOption, wzk0Var == null ? wzk0Var.h : null, null, znd0Var == null ? znd0Var.h : null, null, wod0Var == null ? wod0Var.h : null, xod0Var != null ? xod0Var.h : null, null, 103571);
        return true;
    }

    @Override // xsna.pcr
    public final MarketCatalogFilterVM b() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // xsna.pcr
    public final ListBuilder getFields() {
        MarketBridgeCategory a;
        List<MarketBridgeCategory> list;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        MarketCatalogFilterVM marketCatalogFilterVM = this.c;
        MarketCatalogFilterVM.c b = marketCatalogFilterVM.b(marketCatalogFilterVM.a);
        MarketBridgeCategory a2 = b != null ? b.a() : null;
        Context context = this.a;
        ArrayList c = (a2 == null || (list = a2.e) == null) ? null : c(context, list, new zkk(this, ref$ObjectRef, a2, ref$ObjectRef2, 5));
        ListBuilder e = e43.e();
        MarketCatalogFilterVM marketCatalogFilterVM2 = this.c;
        MarketCatalogFilterVM.c b2 = marketCatalogFilterVM2.b(marketCatalogFilterVM2.a);
        if (b2 != null && (a = b2.a()) != null) {
            e.add(new rka((wqd0) ref$ObjectRef.element, (wqd0) ref$ObjectRef2.element, context.getString(R.string.market_search_choose_a_category), context.getString(R.string.market_search_filter_category_title), c, a, 160));
        }
        List<CatalogMarketStatusOption> list2 = this.c.j;
        if (list2 != null) {
            e.add(new wzk0(context.getString(R.string.market_storefront_status), !epx.f(this.c.i, j5g.Y(list2)) ? this.c.i : null, (CatalogMarketStatusOption) j5g.Y(list2), list2));
        }
        String str = context.getString(R.string.market_search_filter_price_title) + ", " + this.c.h;
        Long l = this.c.f;
        Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
        Long l2 = this.c.g;
        Integer valueOf2 = l2 != null ? Integer.valueOf((int) l2.longValue()) : null;
        e.add(new n6d0(str, (valueOf == null && valueOf2 == null) ? null : new p6d0(valueOf, valueOf2), 12));
        ListBuilder e2 = e43.e();
        MarketCatalogFilterVM marketCatalogFilterVM3 = this.b;
        Boolean bool = marketCatalogFilterVM3.l;
        Boolean bool2 = marketCatalogFilterVM3.o;
        Boolean bool3 = marketCatalogFilterVM3.n;
        if (bool != null) {
            e2.add(new znd0(this.c.l));
        }
        if (bool3 != null || bool2 != null) {
            e2.add(new yod0(tq.h(tlo0.Companion, R.string.market_filter_additional_header)));
        }
        if (bool3 != null) {
            e2.add(new wod0(this.c.n));
        }
        if (bool2 != null) {
            e2.add(new xod0(this.c.o));
        }
        ListBuilder g = e2.g();
        boolean isEmpty = g.isEmpty();
        ListBuilder listBuilder = g;
        if (!isEmpty) {
            listBuilder = j5g.u0(g, Collections.singletonList(new esd0(iah0.a(12))));
        }
        e.addAll(listBuilder);
        return e.g();
    }
}
