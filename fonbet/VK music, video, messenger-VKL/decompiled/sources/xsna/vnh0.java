package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: SearchCommunitiesOnMapAnalyticsTracker.kt */
/* loaded from: classes5.dex */
public final class vnh0 {
    public final SearchStatsLoggingInfo a;

    public vnh0(SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = searchStatsLoggingInfo;
    }

    public final void a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action) {
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.a;
        if (searchStatsLoggingInfo == null) {
            return;
        }
        String str = searchStatsLoggingInfo.f;
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.GROUP;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, null, null, null, str, null, 46, null), new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, null, null, 30, null), 2);
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
