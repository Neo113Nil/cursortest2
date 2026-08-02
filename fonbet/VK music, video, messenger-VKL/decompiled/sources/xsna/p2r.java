package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedFollowClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenUserClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedUnfollowClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: FeedPostHeaderAnalytics.kt */
/* loaded from: classes4.dex */
public final class p2r extends wxq {
    public static void b(Long l, Long l2, String str, MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint, Long l3) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l, l2, null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedFollowClick(new MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint(entryPoint), l3), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public static void c(Long l, Long l2, Long l3, String str, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l, l2, null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick(new MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint(entryPoint), l3), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public static void d(Long l, Long l2, String str, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint, Integer num, Long l3) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l, l2, null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick(new MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint(entryPoint), l3.longValue(), num != null ? num.intValue() : 0), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public static void e(Long l, Long l2, String str, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint, Integer num, Long l3) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l, l2, null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick(new MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint(entryPoint), l3.longValue(), num != null ? num.intValue() : 0), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public static void f(Long l, Long l2, Long l3, String str, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l, l2, null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenUserClick(new MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint(entryPoint), l3), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public static void g(Long l, Long l2, String str, MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint entryPoint, Long l3) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l, l2, null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedUnfollowClick(new MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint(entryPoint), l3), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
