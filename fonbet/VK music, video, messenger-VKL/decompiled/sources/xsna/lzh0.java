package xsna;

import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;

/* compiled from: SearchTrackerComposite.kt */
/* loaded from: classes5.dex */
public final class lzh0 {
    public final azh0 a;
    public final SearchStatsLoggingInfo b;

    public lzh0(azh0 azh0Var, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = azh0Var;
        this.b = searchStatsLoggingInfo;
    }

    public final void a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action) {
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.b;
        if (searchStatsLoggingInfo != null) {
            this.a.a(action, searchStatsLoggingInfo);
        }
    }

    public final void b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action, String str) {
        if (str != null) {
            SearchStatsLoggingInfo searchStatsLoggingInfo = this.b;
            if (str.equals(searchStatsLoggingInfo != null ? searchStatsLoggingInfo.f : null)) {
                a(action);
            }
        }
    }
}
