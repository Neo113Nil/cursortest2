package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.live.api.base.LiveAnalyticsHandler;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: LiveSearchAnalyticsHandler.kt */
/* loaded from: classes14.dex */
public final class dlz implements LiveAnalyticsHandler {
    public final SearchStatsLoggingInfo a;
    public final gzs<Integer> b;

    public dlz(SearchStatsLoggingInfo searchStatsLoggingInfo, gzs<Integer> gzsVar) {
        this.a = searchStatsLoggingInfo;
        this.b = gzsVar;
    }

    public final void a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action) {
        if (this.b.invoke().intValue() != 0) {
            return;
        }
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.a;
        SchemeStat$TypeClick a = SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(searchStatsLoggingInfo.d, null, null, null, searchStatsLoggingInfo.f, null, 32, null), null, new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, null, searchStatsLoggingInfo.g));
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, a, uzp0Var.a).q();
    }
}
