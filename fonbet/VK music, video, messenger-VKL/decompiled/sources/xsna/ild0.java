package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.ecomm.market.good.a;
import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelSubtype;
import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.ejd0;
import xsna.tkd0;

/* compiled from: ProductCardMainInfoActor.kt */
/* loaded from: classes18.dex */
public final class ild0 extends al50<nmd0, ejd0.f, on50, smd0, xld0, tkd0> {
    public final sj50<nmd0, on50, smd0, xld0, tkd0> c;

    public ild0(sj50<nmd0, on50, smd0, xld0, tkd0> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    public final void m() {
        uqd0 uqd0Var;
        Integer num;
        sj50 sj50Var;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        e(new bmd0(true));
        sj50 sj50Var2 = this.b;
        pld0 pld0Var = ((nmd0) sj50Var2.getCurrentState()).l;
        if (pld0Var == null || (uqd0Var = pld0Var.e) == null || (num = uqd0Var.b) == null) {
            return;
        }
        int intValue = num.intValue();
        if (pld0Var.k && intValue <= 0) {
            c(new tkd0.d.b(((nmd0) sj50Var2.getCurrentState()).c, ((nmd0) sj50Var2.getCurrentState()).b));
            return;
        }
        if (intValue <= 0) {
            c(new tkd0.e());
            return;
        }
        long j = ((nmd0) sj50Var2.getCurrentState()).c;
        UserId userId = ((nmd0) sj50Var2.getCurrentState()).b;
        GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = ((nmd0) sj50Var2.getCurrentState()).e;
        MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams = null;
        if (goodFragmentAnalyticsParams == null || (mobileOfficialAppsCoreNavStat$EventScreen = ((nmd0) sj50Var2.getCurrentState()).h) == null) {
            sj50Var = sj50Var2;
        } else {
            sj50Var = sj50Var2;
            marketCtaButtonAnalyticsParams = new MarketCtaButtonAnalyticsParams(MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK, ((nmd0) sj50Var2.getCurrentState()).c, ((nmd0) sj50Var2.getCurrentState()).b, goodFragmentAnalyticsParams.f, null, mobileOfficialAppsCoreNavStat$EventScreen, goodFragmentAnalyticsParams.g, goodFragmentAnalyticsParams.b, goodFragmentAnalyticsParams.c, goodFragmentAnalyticsParams.e, goodFragmentAnalyticsParams.d, "", goodFragmentAnalyticsParams.h, null, null, null, null, goodFragmentAnalyticsParams.l, goodFragmentAnalyticsParams.m, null, null, 1695760, null);
        }
        c(new tkd0.d.C3754d(j, userId, marketCtaButtonAnalyticsParams, ((nmd0) sj50Var.getCurrentState()).g));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    @Override // xsna.qj50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(lj50 lj50Var) {
        Map<String, lpd0> map;
        lpd0 lpd0Var;
        lpd0 lpd0Var2;
        mpd0 mpd0Var;
        Map.Entry entry;
        kkd0 kkd0Var;
        ejd0.f fVar = (ejd0.f) lj50Var;
        boolean equals = fVar.equals(ejd0.f.b.b);
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (equals) {
            pld0 pld0Var = ((nmd0) sj50Var.getCurrentState()).l;
            if (pld0Var == null || (kkd0Var = ((nmd0) sj50Var.getCurrentState()).k) == null) {
                return;
            }
            c(new tkd0.d.f(new a.b(new MarketFavable(((nmd0) sj50Var.getCurrentState()).c, ((nmd0) sj50Var.getCurrentState()).b, pld0Var.h, kkd0Var.g, pld0Var.f), ((nmd0) sj50Var.getCurrentState()).d, ((nmd0) sj50Var.getCurrentState()).e)));
            return;
        }
        if (fVar instanceof ejd0.f.a) {
            e(new zld0(((ejd0.f.a) fVar).b));
            return;
        }
        if (!(fVar instanceof ejd0.f.d)) {
            if (fVar instanceof ejd0.f.c) {
                String str = ((ejd0.f.c) fVar).b;
                if (epx.f(str, "review_unique_id")) {
                    m();
                    return;
                }
                pld0 pld0Var2 = ((nmd0) sj50Var.getCurrentState()).l;
                if (pld0Var2 == null || (map = pld0Var2.i) == null || (lpd0Var = map.get(str)) == null) {
                    return;
                }
                c(new tkd0.d.a(lpd0Var));
                return;
            }
            if (fVar instanceof ejd0.f.e) {
                m();
                return;
            }
            if (fVar instanceof ejd0.f.C2819f) {
                c(new tkd0.d.c(((ejd0.f.C2819f) fVar).b));
                return;
            } else if (fVar instanceof ejd0.f.h) {
                e(new amd0(((ejd0.f.h) fVar).b));
                return;
            } else {
                if (!(fVar instanceof ejd0.f.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        pld0 pld0Var3 = ((nmd0) sj50Var.getCurrentState()).l;
        Map<String, lpd0> map2 = pld0Var3 != null ? pld0Var3.i : null;
        if (map2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, lpd0> entry2 : map2.entrySet()) {
                if (entry2.getValue().a == ProductLabelType.OZON && entry2.getValue().b == ProductLabelSubtype.CART_PRICE) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            Set entrySet = linkedHashMap.entrySet();
            if (entrySet != null && (entry = (Map.Entry) j5g.Z(entrySet)) != null) {
                lpd0Var2 = (lpd0) entry.getValue();
                Object obj = lpd0Var2 == null ? lpd0Var2.f : null;
                mpd0Var = obj instanceof mpd0 ? (mpd0) obj : null;
                if (mpd0Var == null) {
                    c(new tkd0.d.e(mpd0Var));
                    return;
                }
                return;
            }
        }
        lpd0Var2 = null;
        if (lpd0Var2 == null) {
        }
        if (obj instanceof mpd0) {
        }
        if (mpd0Var == null) {
        }
    }
}
