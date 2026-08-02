package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: ClipsGridSearchClickTracker.kt */
/* loaded from: classes17.dex */
public final class iee implements jce {
    public final SearchStatsLoggingInfo a;

    public iee(SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = searchStatsLoggingInfo;
    }

    @Override // xsna.jce
    public final void a(boolean z) {
        if (z) {
            d(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT);
        } else {
            d(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT);
        }
    }

    @Override // xsna.jce
    public final void b() {
        d(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT);
    }

    @Override // xsna.jce
    public final void c() {
        d(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT);
    }

    public final void d(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action) {
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.a;
        SchemeStat$TypeClick Ab = searchStatsLoggingInfo.Ab(action, searchStatsLoggingInfo.f);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, Ab, uzp0Var.a).q();
    }
}
