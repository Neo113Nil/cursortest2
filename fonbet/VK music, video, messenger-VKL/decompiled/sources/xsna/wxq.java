package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedViewAuthors;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: FeedCoownersAnalytics.kt */
/* loaded from: classes4.dex */
public class wxq {
    public static void a(Long l, Long l2, String str, MobileOfficialAppsFeedStat$TypeFeedViewAuthors.EntryPoint entryPoint) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l, l2, null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedViewAuthors(entryPoint), 2)).q();
    }
}
