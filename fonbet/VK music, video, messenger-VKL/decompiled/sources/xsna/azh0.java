package xsna;

import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.search.ui.stat.SearchContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;

/* compiled from: SearchStatsTracker.kt */
/* loaded from: classes5.dex */
public interface azh0 {
    void a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action, SearchStatsLoggingInfo searchStatsLoggingInfo);

    void b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action, SearchContext searchContext, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen);
}
