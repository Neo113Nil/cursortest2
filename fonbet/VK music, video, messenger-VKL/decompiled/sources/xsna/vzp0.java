package xsna;

import com.vk.dto.common.Good;
import com.vk.dto.common.OtherGoods;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.a5u;
import xsna.kjf0;

/* compiled from: UiOtherItemsBuilder.kt */
/* loaded from: classes18.dex */
public final class vzp0 extends d76 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [xsna.nuf] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    @Override // xsna.d76
    public final void b(ezp0 ezp0Var) {
        cxo cxoVar;
        ?? r0;
        ?? r4;
        ArrayList arrayList;
        String str;
        String str2;
        a5u.a aVar = ezp0Var.c;
        List list = null;
        a(kjf0.a.a(22, null));
        a(kjf0.a.a(23, null));
        ArrayList arrayList2 = new ArrayList();
        duk dukVar = ezp0Var.b;
        cxo cxoVar2 = ezp0Var.a;
        Good good = dukVar.a;
        List<OtherGoods> list2 = good.s;
        if (list2 != null) {
            for (OtherGoods otherGoods : list2) {
                String str3 = otherGoods.c;
                if (str3 == null || str3.length() == 0) {
                    cxoVar = cxoVar2;
                    r0 = list;
                } else {
                    cxoVar = cxoVar2;
                    r0 = new nuf(this, cxoVar, aVar, cxoVar2.a, str3);
                }
                String str4 = otherGoods.b;
                if (str4 != null) {
                    arrayList2.add(kjf0.a.a(18, new k8u(str4, r0)));
                }
                ArrayList<Good> arrayList3 = otherGoods.g;
                if (arrayList3 != null) {
                    r4 = new ArrayList(c5g.u(arrayList3, 10));
                    for (Good good2 : arrayList3) {
                        r4.add(new a090(new k7u(good2, list), ao8.s(good2)));
                    }
                } else {
                    r4 = EmptyList.b;
                }
                if (otherGoods.f == 2) {
                    int size = 4 > r4.size() ? r4.size() : 4;
                    if (size < 0) {
                        throw new IllegalArgumentException("Argument 'from' must be less or equal to argument 'to'");
                    }
                    ArrayList arrayList4 = new ArrayList();
                    if (size == r4.size()) {
                        arrayList4.addAll(r4);
                    } else {
                        for (int i = 0; i < size; i++) {
                            arrayList4.add(r4.get(i));
                        }
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = r4;
                }
                int i2 = otherGoods.f;
                long j = good.b;
                MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = otherGoods.e;
                ArrayList arrayList5 = arrayList2;
                long j2 = good.c.b;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = aVar.c;
                GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = cxoVar.g;
                e090 e090Var = new e090(j, mobileOfficialAppsMarketStat$ReferrerItemType, j2, commonMarketStat$TypeRefSource, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null);
                h010 h010Var = cxoVar.f;
                b090 b090Var = new b090(arrayList, i2, e090Var, (h010Var == null || (str2 = h010Var.e) == null) ? "" : str2, (h010Var == null || (str = h010Var.f) == null) ? "" : str);
                cxoVar.S = b090Var;
                arrayList5.add(kjf0.a.a(15, b090Var));
                cxoVar2 = cxoVar;
                arrayList2 = arrayList5;
                list = null;
            }
        }
        this.b.addAll(arrayList2);
    }
}
