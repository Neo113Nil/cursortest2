package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$SocialProofAuthorType;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedShowInlineComment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;

/* compiled from: InlineCommentAnalytics.kt */
/* loaded from: classes4.dex */
public final class yzw {
    public static void a(NewsEntry newsEntry, int i, String str, String str2, Integer num, Boolean bool) {
        UiTracker uiTracker = UiTracker.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.FEED_ITEM, Long.valueOf(di60.n(newsEntry)), Long.valueOf(k9q0.o(newsEntry).b), null, newsEntry.Cb().b, null, 40, null), str, str2, Integer.valueOf(i), new MobileOfficialAppsFeedStat$TypeFeedShowInlineComment(num, epx.f(bool, Boolean.TRUE) ? MobileOfficialAppsFeedStat$SocialProofAuthorType.FROM_FRIEND : epx.f(bool, Boolean.FALSE) ? MobileOfficialAppsFeedStat$SocialProofAuthorType.FROM_NON_FRIEND : null))).q();
    }

    public static void b(NewsEntry newsEntry, int i, String str, String str2) {
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.FEED_ITEM;
        long j = k9q0.o(newsEntry).b;
        new bvt0(c, SchemeStat$TypeView.a.a(new SchemeStat$EventItem(type, Long.valueOf(di60.n(newsEntry)), Long.valueOf(j), null, newsEntry.Cb().b, null, 40, null), str, str2, Integer.valueOf(i), new com.vk.stat.scheme.b0())).q();
    }
}
