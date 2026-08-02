package xsna;

import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketViewItemItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.hzp0;

/* compiled from: ClassifiedsUiTimeListener.kt */
/* loaded from: classes16.dex */
public final class ihc extends d680<fhc> {
    public final MarketAnalyticsParams b;
    public final dha c;
    public final qdh0 d;
    public final s1v e;

    public ihc(MarketAnalyticsParams marketAnalyticsParams, dha dhaVar, qdh0 qdh0Var) {
        s1v s1vVar = new s1v();
        this.b = marketAnalyticsParams;
        this.c = dhaVar;
        this.d = qdh0Var;
        this.e = s1vVar;
    }

    @Override // xsna.d680
    public final List j(fhc fhcVar) {
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
        UIBlock uIBlock = fhcVar.b;
        if (uIBlock instanceof UIBlockMarketItem) {
            UIBlockMarketItem uIBlockMarketItem = (UIBlockMarketItem) uIBlock;
            return o(uIBlock.b, uIBlockMarketItem.z, Collections.singletonList(uIBlockMarketItem.y), uIBlock.u - 1, null);
        }
        boolean z = uIBlock instanceof UIBlockMarketGroupInfoItem;
        MarketAnalyticsParams marketAnalyticsParams = this.b;
        if (!z) {
            if (!(uIBlock instanceof UIBlockGroup)) {
                return EmptyList.b;
            }
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, Long.valueOf(((UIBlockGroup) uIBlock).y.c.b), s1v.f(uIBlock), this.e.e(uIBlock), null, 34, null);
            UiTrackingScreen b = UiTracker.j.b();
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = b != null ? b.a : null;
            if (marketAnalyticsParams == null || (commonMarketStat$TypeRefSource = marketAnalyticsParams.d) == null) {
                commonMarketStat$TypeRefSource = this.d != null ? CommonMarketStat$TypeRefSource.SEARCH_GOODS : null;
            }
            return Collections.singletonList(new hzp0.g0(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView.a.b(mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, marketAnalyticsParams != null ? marketAnalyticsParams.j : null, new MobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem(uIBlock.b), 16), null));
        }
        String str = uIBlock.b;
        UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem = (UIBlockMarketGroupInfoItem) uIBlock;
        String str2 = uIBlockMarketGroupInfoItem.B;
        SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, Long.valueOf(uIBlockMarketGroupInfoItem.z.c.b), null, null, str2 == null ? "" : str2, null, 44, null);
        UiTrackingScreen b2 = UiTracker.j.b();
        List singletonList = Collections.singletonList(new hzp0.g0(schemeStat$EventItem2, MobileOfficialAppsMarketStat$TypeMarketView.a.b(b2 != null ? b2.a : null, null, marketAnalyticsParams != null ? marketAnalyticsParams.j : null, new MobileOfficialAppsMarketStat$TypeMarketplaceMarketViewItem(str), 20), null));
        String str3 = uIBlock.b;
        if (str2 == null) {
            str2 = "";
        }
        List<Good> list = uIBlockMarketGroupInfoItem.A;
        int i = uIBlock.u - 1;
        List<CatalogLink> list2 = uIBlockMarketGroupInfoItem.y.e;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((CatalogLink) it.next()).e);
        }
        return j5g.u0(o(str3, str2, list, i, arrayList), singletonList);
    }

    public final ArrayList o(String str, String str2, List list, int i, ArrayList arrayList) {
        MobileOfficialAppsMarketStat$TypeMarketView.b mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
        String str3;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            Good good = (Good) obj;
            String str4 = (arrayList == null || (str3 = (String) j5g.b0(i2, arrayList)) == null) ? "" : str3;
            String a = cqm0.a(str2);
            String str5 = (a == null && (a = good.d0) == null) ? "" : a;
            int i4 = i + i2;
            MarketAnalyticsParams marketAnalyticsParams = this.b;
            if ((marketAnalyticsParams != null ? marketAnalyticsParams.d : null) != CommonMarketStat$TypeRefSource.MARKETPLACE) {
                int i5 = (int) good.b;
                long j = good.c.b;
                int i6 = i4 + 1;
                mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem = new MobileOfficialAppsMarketStat$TypeMarketViewItemItem(Integer.valueOf(i5), Long.valueOf(j), null, Integer.valueOf(i6), marketAnalyticsParams != null ? marketAnalyticsParams.e : null, marketAnalyticsParams != null ? marketAnalyticsParams.f : null, marketAnalyticsParams != null ? marketAnalyticsParams.g : null, null, null, null, 896, null);
            } else {
                mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem = new MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem(str, Integer.valueOf(i4 + 1));
            }
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(good.b), Long.valueOf(good.c.b), str4, str5, null, 32, null);
            UiTrackingScreen b = UiTracker.j.b();
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = b != null ? b.a : null;
            if (marketAnalyticsParams == null || (commonMarketStat$TypeRefSource = marketAnalyticsParams.d) == null) {
                commonMarketStat$TypeRefSource = this.d != null ? CommonMarketStat$TypeRefSource.SEARCH_GOODS : null;
            }
            MobileOfficialAppsMarketStat$TypeMarketView b2 = MobileOfficialAppsMarketStat$TypeMarketView.a.b(mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, marketAnalyticsParams != null ? marketAnalyticsParams.j : null, mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem, 16);
            dha dhaVar = this.c;
            arrayList2.add(new hzp0.g0(schemeStat$EventItem, b2, dhaVar != null ? dhaVar.a() : null));
            i2 = i3;
        }
        return arrayList2;
    }
}
