package xsna;

import com.vk.ecomm.categories.api.MarketBridgeCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.sja;
import xsna.z890;

/* compiled from: CategoriesReducer.kt */
/* loaded from: classes18.dex */
public final class tja implements bm50<cka, sja> {
    public static ArrayList c(List list) {
        List<MarketBridgeCategory> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (MarketBridgeCategory marketBridgeCategory : list2) {
            arrayList.add(new z890.d(marketBridgeCategory, marketBridgeCategory.c, marketBridgeCategory.d));
        }
        return arrayList;
    }

    public static z890 d(MarketBridgeCategory marketBridgeCategory) {
        MarketBridgeCategory.CategoryView categoryView = marketBridgeCategory.f;
        List<MarketBridgeCategory> list = marketBridgeCategory.e;
        String str = marketBridgeCategory.c;
        if ((categoryView != null ? categoryView.b : null) != MarketBridgeCategory.CategoryView.Type.TAB_ROOT) {
            return new z890.b(str, c(list));
        }
        List<MarketBridgeCategory> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (MarketBridgeCategory marketBridgeCategory2 : list2) {
            arrayList.add(new z890.e(marketBridgeCategory2.c, c(marketBridgeCategory2.e)));
        }
        return new z890.c(str, 0, arrayList);
    }

    @Override // xsna.bm50
    public final cka a(cka ckaVar, sja sjaVar) {
        cka ckaVar2 = ckaVar;
        sja sjaVar2 = sjaVar;
        int i = ckaVar2.b;
        List<MarketBridgeCategory> list = ckaVar2.c;
        if (sjaVar2.equals(sja.a.a)) {
            if (list.size() <= 1) {
                throw new IllegalStateException("Check failed.");
            }
            List T = j5g.T(1, list);
            return new cka(i - 1, T, d((MarketBridgeCategory) j5g.i0(T)));
        }
        if (sjaVar2 instanceof sja.b) {
            MarketBridgeCategory marketBridgeCategory = ((sja.b) sjaVar2).a;
            return new cka(i + 1, j5g.v0(marketBridgeCategory, list), d(marketBridgeCategory));
        }
        if (!(sjaVar2 instanceof sja.c)) {
            throw new NoWhenBranchMatchedException();
        }
        z890 z890Var = ckaVar2.d;
        if (!(z890Var instanceof z890.c)) {
            throw new IllegalStateException("Check failed.");
        }
        z890.c cVar = (z890.c) z890Var;
        return new cka(i, list, new z890.c(cVar.b, ((sja.c) sjaVar2).a, cVar.d));
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(sja sjaVar) {
        return true;
    }
}
