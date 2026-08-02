package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.search.ui.stat.SearchContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: SearchStatsTrackerImpl.kt */
/* loaded from: classes5.dex */
public final class bzh0 implements azh0 {
    public static final bzh0 a = new bzh0();

    @Override // xsna.azh0
    public final void a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        b(action, new SearchContext(searchStatsLoggingInfo.b, searchStatsLoggingInfo.c, searchStatsLoggingInfo.d, searchStatsLoggingInfo.e, searchStatsLoggingInfo.f, searchStatsLoggingInfo.h), searchStatsLoggingInfo.g);
    }

    @Override // xsna.azh0
    public final void b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action, SearchContext searchContext, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        String str = searchContext.b;
        String str2 = str == null ? "" : str;
        String str3 = searchContext.g;
        SchemeStat$TypeClick a2 = SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(searchContext.d, Long.valueOf(searchContext.e), null, null, searchContext.f, null, 44, null), Integer.valueOf(searchContext.c), new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, str2, null, str3 == null ? "" : str3, mobileOfficialAppsCoreNavStat$EventScreen, 4, null));
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, a2, uzp0Var.a).q();
    }
}
