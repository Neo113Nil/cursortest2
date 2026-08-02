package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.ecomm.products_selection.api.model.SelectionProductId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.htd0;
import xsna.jtd0;
import xsna.jw00;
import xsna.ltd0;

/* compiled from: ProductsSelectionFeature.kt */
/* loaded from: classes18.dex */
public final class ktd0 extends wk50<ptd0, otd0, htd0, ltd0> {
    public final b9m f;
    public final kw00 g;
    public final lt00 h;
    public final f4z i;

    public ktd0(mtd0 mtd0Var, fy00 fy00Var, b9m b9mVar, kw00 kw00Var, lt00 lt00Var) {
        super(htd0.a.b, mtd0Var);
        this.f = b9mVar;
        this.g = kw00Var;
        this.h = lt00Var;
        this.e.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fy00Var.a(), new s101()).subscribe(new jsv(new bbw(this, 25), 18)));
        kw00Var.a("cart_key", new jw00.d[]{jw00.a.c}, new qz40(this, 15));
        this.i = new f4z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5 A[EDGE_INSN: B:60:0x00f5->B:54:0x00f5 BREAK  A[LOOP:2: B:48:0x00df->B:59:?], SYNTHETIC] */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(otd0 otd0Var, htd0 htd0Var) {
        Object obj;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        String str;
        Iterator<T> it;
        kei0 kei0Var;
        otd0 otd0Var2 = otd0Var;
        htd0 htd0Var2 = htd0Var;
        Map<Long, String> map = otd0Var2.i;
        List<SelectionProductId> list = otd0Var2.f;
        List<kei0> list2 = otd0Var2.g;
        if (htd0Var2 instanceof htd0.a) {
            U(list);
            return;
        }
        boolean z = htd0Var2 instanceof htd0.h;
        f4z f4zVar = this.i;
        if (z) {
            f4zVar.b(new jtd0.c(otd0Var2.h, otd0Var2.b));
            return;
        }
        if (htd0Var2 instanceof htd0.j) {
            htd0.j jVar = (htd0.j) htd0Var2;
            List<kei0> list3 = list2;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            for (kei0 kei0Var2 : list3) {
                arrayList.add(kei0Var2.a.equals(jVar.b) ? kei0.a(kei0Var2, jVar.c, 1919) : kei0.a(kei0Var2, false, 2047));
            }
            T(new ltd0.d(arrayList));
            return;
        }
        if (htd0Var2 instanceof htd0.i) {
            T(new ltd0.c(((htd0.i) htd0Var2).b));
            return;
        }
        Object obj2 = null;
        if (!(htd0Var2 instanceof htd0.g)) {
            if (htd0Var2 instanceof htd0.f) {
                SelectionProductId selectionProductId = ((htd0.f) htd0Var2).b;
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((kei0) obj).a.equals(selectionProductId)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                kei0 kei0Var3 = (kei0) obj;
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Long, String> entry : map.entrySet()) {
                        if (entry.getKey().longValue() == selectionProductId.b) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Collection values = linkedHashMap.values();
                    if (values != null) {
                        obj2 = (String) j5g.Z(values);
                    }
                }
                String str2 = obj2;
                if (kei0Var3 != null) {
                    SelectionProductId selectionProductId2 = kei0Var3.a;
                    String str3 = kei0Var3.j;
                    if (str3 == null || drm0.N(str3)) {
                        f4zVar.b(new jtd0.d(selectionProductId2.b, selectionProductId2.c, otd0Var2.b, otd0Var2.d, otd0Var2.e, otd0Var2.c, str2));
                        return;
                    }
                    f4zVar.b(new jtd0.e(str3));
                    MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType = MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK;
                    long j = selectionProductId2.b;
                    UserId userId = selectionProductId2.c;
                    String str4 = kei0Var3.k;
                    UiTrackingScreen b = UiTracker.j.b();
                    if (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) {
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
                    }
                    this.h.f(new MarketCtaButtonAnalyticsParams(eventType, j, userId, str4, otd0Var2.b, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, null, null, null, otd0Var2.d, otd0Var2.e, otd0Var2.c, null, null, null, null, 1982400, null));
                    return;
                }
                return;
            }
            if (htd0Var2 instanceof htd0.d) {
                htd0.d dVar = (htd0.d) htd0Var2;
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (((kei0) next).a.equals(dVar.b)) {
                        obj2 = next;
                        break;
                    }
                }
                kei0 kei0Var4 = (kei0) obj2;
                if (kei0Var4 != null) {
                    f4zVar.b(new jtd0.b(kei0Var4));
                    return;
                }
                return;
            }
            if (htd0Var2 instanceof htd0.e) {
                htd0.e eVar = (htd0.e) htd0Var2;
                List<kei0> list4 = list2;
                ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                for (kei0 kei0Var5 : list4) {
                    arrayList2.add(kei0Var5.a.equals(eVar.c) ? kei0.a(kei0Var5, eVar.b, 1919) : kei0.a(kei0Var5, false, 2047));
                }
                T(new ltd0.d(arrayList2));
                return;
            }
            if (htd0Var2 instanceof htd0.c) {
                U(list);
                return;
            }
            if (!(htd0Var2 instanceof htd0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            htd0.b bVar = (htd0.b) htd0Var2;
            Iterator<T> it4 = list2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next2 = it4.next();
                if (((kei0) next2).a.equals(bVar.b)) {
                    obj2 = next2;
                    break;
                }
            }
            kei0 kei0Var6 = (kei0) obj2;
            if (kei0Var6 != null) {
                SelectionProductId selectionProductId3 = kei0Var6.a;
                long j2 = selectionProductId3.b;
                long j3 = selectionProductId3.c.b;
                lt00.h(this.h, Long.valueOf(j2), Long.valueOf(j3), null, otd0Var2.b, kei0Var6.k, otd0Var2.d, otd0Var2.e, otd0Var2.c, 4);
                return;
            }
            return;
        }
        SelectionProductId selectionProductId4 = ((htd0.g) htd0Var2).b;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<Long, String> entry2 : map.entrySet()) {
                if (entry2.getKey().longValue() == selectionProductId4.b) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            Collection values2 = linkedHashMap2.values();
            if (values2 != null) {
                str = (String) j5g.Z(values2);
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next3 = it.next();
                    if (((kei0) next3).a.equals(selectionProductId4)) {
                        obj2 = next3;
                        break;
                    }
                }
                kei0Var = (kei0) obj2;
                if (kei0Var == null) {
                    SelectionProductId selectionProductId5 = kei0Var.a;
                    f4zVar.b(new jtd0.d(selectionProductId5.b, selectionProductId5.c, otd0Var2.b, otd0Var2.d, otd0Var2.e, otd0Var2.c, str));
                    return;
                }
                return;
            }
        }
        str = null;
        it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        kei0Var = (kei0) obj2;
        if (kei0Var == null) {
        }
    }

    public final void U(List<SelectionProductId> list) {
        List<SelectionProductId> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (SelectionProductId selectionProductId : list2) {
            StringBuilder sb = new StringBuilder();
            sb.append(selectionProductId.c);
            sb.append('_');
            sb.append(selectionProductId.b);
            arrayList.add(sb.toString());
        }
        T(ltd0.b.b);
        a7f0.a.f(this, rsg0.w0(yfb.x(xd10.j((yd10) this.f.b, arrayList, 14))).l(new aad0(new xht(24), 1)).l(new i630(new f6w(20), 11)), new e2s(this, 23), new yr00(this, 23), 1);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.g.b("cart_key");
    }
}
