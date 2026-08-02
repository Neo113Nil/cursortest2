package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: NewsfeedRouterAnalytics.kt */
/* loaded from: classes4.dex */
public final class kw60 {
    public static void a(Long l, Long l2, String str, MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal.EntryPoint entryPoint) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l, l2, null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal(entryPoint), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
