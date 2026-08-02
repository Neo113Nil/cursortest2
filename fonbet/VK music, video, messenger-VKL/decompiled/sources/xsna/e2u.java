package xsna;

import com.vk.catalog2.common.dto.api.search.CatalogGetMarketSearchRequestFactory;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: GlobalSearchMarketStatsLoggingInfoProvider.kt */
/* loaded from: classes16.dex */
public final class e2u implements izs<hwh0, SearchStatsLoggingInfo> {
    public final CatalogGetMarketSearchRequestFactory b;
    public final cq6 c;
    public final onh0 d = new onh0();

    public e2u(CatalogGetMarketSearchRequestFactory catalogGetMarketSearchRequestFactory, cq6 cq6Var) {
        this.b = catalogGetMarketSearchRequestFactory;
        this.c = cq6Var;
    }

    @Override // xsna.izs
    public final SearchStatsLoggingInfo invoke(hwh0 hwh0Var) {
        hwh0 hwh0Var2 = hwh0Var;
        String str = this.b.e;
        Integer num = hwh0Var2.b;
        return new SearchStatsLoggingInfo(str, num != null ? num.intValue() : -1, SchemeStat$EventItem.Type.MARKET_ITEM, 0L, this.d.e(hwh0Var2.a), (MobileOfficialAppsCoreNavStat$EventScreen) this.c.invoke(), null, false, true, 72, null);
    }
}
