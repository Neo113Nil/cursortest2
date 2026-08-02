package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.api.ConnectionResult;
import com.vk.api.generated.market.dto.MarketCatalogFilterDto;
import com.vk.api.generated.market.dto.MarketCatalogSortingDto;
import com.vk.api.generated.market.dto.MarketCatalogStatusOptionDto;
import com.vk.api.generated.market.dto.MarketCurrencyDto;
import com.vk.api.generated.market.dto.MarketDeliveryTypeDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryTreeDto;
import com.vk.api.generated.market.dto.MarketMarketSortingOptionDto;
import com.vk.api.generated.market.dto.MarketMarketSortingOptionIdDto;
import com.vk.dto.common.Image;
import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import com.vk.ecomm.market.api.search.filters.dto.MarketDeliveryType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.hml0;
import xsna.ifk0;

/* compiled from: StorefrontFilterDelegate.kt */
/* loaded from: classes18.dex */
public final class fml0 implements cz00, w8i {
    public dw20 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // xsna.cz00
    public final void a(Context context, MarketCatalogSortingDto marketCatalogSortingDto, wd3 wd3Var) {
        ?? r2;
        dw20.a i;
        List<MarketMarketSortingOptionDto> e = marketCatalogSortingDto.e();
        if (e != null) {
            List<MarketMarketSortingOptionDto> list = e;
            r2 = new ArrayList(c5g.u(list, 10));
            for (MarketMarketSortingOptionDto marketMarketSortingOptionDto : list) {
                MarketMarketSortingOptionIdDto d = marketCatalogSortingDto.d();
                r2.add(new ifk0.a(epx.f(d != null ? d.i() : null, marketMarketSortingOptionDto.d().i()), marketMarketSortingOptionDto.d().i(), marketMarketSortingOptionDto.getTitle()));
            }
        } else {
            r2 = EmptyList.b;
        }
        i = new dw20.b(context, null).i(new hfk0(r2, new whi0(3, wd3Var, this)), (r3 & 2) == 0, false);
        this.b = ((dw20.b) i).I(true).I0(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01dd  */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    @Override // xsna.cz00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Context context, MarketCatalogFilterDto marketCatalogFilterDto, evh0 evh0Var) {
        boolean z;
        ArrayList arrayList;
        MarketDeliveryType marketDeliveryType;
        MarketDeliveryType marketDeliveryType2;
        List<MarketMarketCategoryTreeDto> f;
        MarketMarketCategoryTreeDto marketMarketCategoryTreeDto;
        List<MarketMarketCategoryTreeDto> f2;
        List list;
        Integer G;
        List<MarketMarketCategoryTreeDto> f3;
        Iterator it;
        Object obj;
        MarketMarketCategoryTreeDto marketMarketCategoryTreeDto2;
        List list2;
        CatalogMarketStatusOption catalogMarketStatusOption;
        eb10<?> eb10Var;
        Object obj2;
        List<MarketMarketCategoryTreeDto> d;
        String f4;
        Object obj3;
        Context context2 = context;
        while (true) {
            z = context2 instanceof FragmentActivity;
            if (z || !(context2 instanceof ContextWrapper)) {
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) context2 : null);
        if (fragmentActivity == null) {
            return;
        }
        List<MarketCatalogStatusOptionDto> R = marketCatalogFilterDto.R();
        if (R != null) {
            List<MarketCatalogStatusOptionDto> list3 = R;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            for (MarketCatalogStatusOptionDto marketCatalogStatusOptionDto : list3) {
                arrayList2.add(new CatalogMarketStatusOption(marketCatalogStatusOptionDto.getTitle(), marketCatalogStatusOptionDto.d().i()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        MarketDeliveryTypeDto j = marketCatalogFilterDto.j();
        int i = j == null ? -1 : hml0.a.$EnumSwitchMapping$0[j.ordinal()];
        if (i == 1) {
            marketDeliveryType = MarketDeliveryType.ANY;
        } else if (i == 2) {
            marketDeliveryType = MarketDeliveryType.PICKUP;
        } else {
            if (i != 3) {
                marketDeliveryType2 = null;
                MarketCatalogFilterVM.FilterContextType filterContextType = MarketCatalogFilterVM.FilterContextType.MARKET;
                f = marketCatalogFilterDto.f();
                if (f == null) {
                    Iterator it2 = f.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it2.next();
                        int id = ((MarketMarketCategoryTreeDto) obj3).getId();
                        Integer G2 = marketCatalogFilterDto.G();
                        if (G2 != null && id == G2.intValue()) {
                            break;
                        }
                    }
                    marketMarketCategoryTreeDto = (MarketMarketCategoryTreeDto) obj3;
                } else {
                    marketMarketCategoryTreeDto = null;
                }
                int i2 = ConnectionResult.NETWORK_ERROR;
                int id2 = marketMarketCategoryTreeDto == null ? marketMarketCategoryTreeDto.getId() : 9000;
                if (marketMarketCategoryTreeDto != null || (r7 = marketMarketCategoryTreeDto.f()) == null) {
                    String string = context.getString(R.string.community_market_main_all_goods_tab);
                }
                String str = string;
                new ne6();
                Image a = ne6.a(marketMarketCategoryTreeDto == null ? marketMarketCategoryTreeDto.e() : null);
                f2 = marketCatalogFilterDto.f();
                if (f2 == null) {
                    List<MarketMarketCategoryTreeDto> list4 = f2;
                    list = new ArrayList(c5g.u(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        list.add(hml0.a((MarketMarketCategoryTreeDto) it3.next()));
                    }
                } else {
                    list = EmptyList.b;
                }
                MarketBridgeCategory marketBridgeCategory = new MarketBridgeCategory(id2, str, a, list, null);
                G = marketCatalogFilterDto.G();
                if (G != null) {
                    i2 = G.intValue();
                }
                f3 = marketCatalogFilterDto.f();
                if (f3 == null) {
                    f3 = EmptyList.b;
                }
                it = f3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        if (((MarketMarketCategoryTreeDto) obj).getId() == i2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                marketMarketCategoryTreeDto2 = (MarketMarketCategoryTreeDto) obj;
                String str2 = (marketMarketCategoryTreeDto2 != null || (f4 = marketMarketCategoryTreeDto2.f()) == null) ? "" : f4;
                new ne6();
                Image a2 = ne6.a(marketMarketCategoryTreeDto2 == null ? marketMarketCategoryTreeDto2.e() : null);
                if (marketMarketCategoryTreeDto2 != null || (d = marketMarketCategoryTreeDto2.d()) == null) {
                    list2 = EmptyList.b;
                } else {
                    List<MarketMarketCategoryTreeDto> list5 = d;
                    list2 = new ArrayList(c5g.u(list5, 10));
                    Iterator it4 = list5.iterator();
                    while (it4.hasNext()) {
                        list2.add(hml0.a((MarketMarketCategoryTreeDto) it4.next()));
                    }
                }
                MarketCatalogFilterVM.d dVar = new MarketCatalogFilterVM.d(marketBridgeCategory, new MarketBridgeCategory(i2, str2, a2, list2, null));
                Long valueOf = marketCatalogFilterDto.F() == null ? Long.valueOf(r1.intValue()) : null;
                Long valueOf2 = marketCatalogFilterDto.D() == null ? Long.valueOf(r1.intValue()) : null;
                MarketCurrencyDto C = marketCatalogFilterDto.C();
                String title = C == null ? C.getTitle() : null;
                String str3 = title != null ? "" : title;
                if (arrayList == null) {
                    Iterator it5 = arrayList.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj2 = it5.next();
                            if (epx.f(((CatalogMarketStatusOption) obj2).c, marketCatalogFilterDto.M())) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    catalogMarketStatusOption = (CatalogMarketStatusOption) obj2;
                } else {
                    catalogMarketStatusOption = null;
                }
                gml0 gml0Var = new gml0(context, new MarketCatalogFilterVM(filterContextType, filterContextType, dVar, null, null, valueOf, valueOf2, str3, catalogMarketStatusOption, arrayList, marketCatalogFilterDto.B(), marketCatalogFilterDto.k(), marketCatalogFilterDto.K(), marketCatalogFilterDto.p(), marketCatalogFilterDto.u(), marketDeliveryType2, jgp.b));
                eb10<?> T2 = ((MarketProductFilterComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MarketProductFilterComponent.class))).T2();
                eb10Var = T2 != null ? T2 : null;
                if (eb10Var == null) {
                    mcr<?> a3 = eb10Var.a(fragmentActivity);
                    a3.a(new ry00(fragmentActivity, gml0Var, new xv2(1, a3, mcr.class, "updateFields", "updateFields(Ljava/util/List;)V", 0, 14), new b810(evh0Var, 29), null));
                    return;
                }
                return;
            }
            marketDeliveryType = MarketDeliveryType.COURIER;
        }
        marketDeliveryType2 = marketDeliveryType;
        MarketCatalogFilterVM.FilterContextType filterContextType2 = MarketCatalogFilterVM.FilterContextType.MARKET;
        f = marketCatalogFilterDto.f();
        if (f == null) {
        }
        int i22 = ConnectionResult.NETWORK_ERROR;
        if (marketMarketCategoryTreeDto == null) {
        }
        if (marketMarketCategoryTreeDto != null) {
        }
        String string2 = context.getString(R.string.community_market_main_all_goods_tab);
        String str4 = string2;
        new ne6();
        Image a4 = ne6.a(marketMarketCategoryTreeDto == null ? marketMarketCategoryTreeDto.e() : null);
        f2 = marketCatalogFilterDto.f();
        if (f2 == null) {
        }
        MarketBridgeCategory marketBridgeCategory2 = new MarketBridgeCategory(id2, str4, a4, list, null);
        G = marketCatalogFilterDto.G();
        if (G != null) {
        }
        f3 = marketCatalogFilterDto.f();
        if (f3 == null) {
        }
        it = f3.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        marketMarketCategoryTreeDto2 = (MarketMarketCategoryTreeDto) obj;
        if (marketMarketCategoryTreeDto2 != null) {
        }
        new ne6();
        Image a22 = ne6.a(marketMarketCategoryTreeDto2 == null ? marketMarketCategoryTreeDto2.e() : null);
        if (marketMarketCategoryTreeDto2 != null) {
        }
        list2 = EmptyList.b;
        MarketCatalogFilterVM.d dVar2 = new MarketCatalogFilterVM.d(marketBridgeCategory2, new MarketBridgeCategory(i22, str2, a22, list2, null));
        if (marketCatalogFilterDto.F() == null) {
        }
        if (marketCatalogFilterDto.D() == null) {
        }
        MarketCurrencyDto C2 = marketCatalogFilterDto.C();
        if (C2 == null) {
        }
        if (title != null) {
        }
        if (arrayList == null) {
        }
        gml0 gml0Var2 = new gml0(context, new MarketCatalogFilterVM(filterContextType2, filterContextType2, dVar2, null, null, valueOf, valueOf2, str3, catalogMarketStatusOption, arrayList, marketCatalogFilterDto.B(), marketCatalogFilterDto.k(), marketCatalogFilterDto.K(), marketCatalogFilterDto.p(), marketCatalogFilterDto.u(), marketDeliveryType2, jgp.b));
        eb10<?> T22 = ((MarketProductFilterComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MarketProductFilterComponent.class))).T2();
        if (T22 != null) {
        }
        if (eb10Var == null) {
        }
    }
}
