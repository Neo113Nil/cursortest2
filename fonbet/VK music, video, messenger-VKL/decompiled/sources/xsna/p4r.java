package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedInteractionItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedItemMenuAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedItemTrackCode;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostExpandText;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostTextAction;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.LazyThreadSafetyMode;

/* compiled from: FeedStatEvents.kt */
/* loaded from: classes4.dex */
public final class p4r {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new nh(11));

    /* compiled from: FeedStatEvents.kt */
    public static final class a extends vk6<SchemeStat$TypeAction> {
    }

    public static void a(MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick.Subtype subtype, String str, UserId userId, Integer num) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, Long.valueOf(num.intValue()), Long.valueOf(userId.b), null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick(subtype), 2)).q();
    }

    public static void b(UserId userId, Integer num, Integer num2, String str) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(num.intValue()), Long.valueOf(userId.b), null, str, null, 40, null), num2, new com.vk.stat.scheme.a0())).q();
    }

    public static void c(MobileOfficialAppsFeedStat$TypeFeedPostExpandText.Source source, UserId userId, Integer num, String str, Integer num2) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(num.intValue()), Long.valueOf(userId.b), null, str, null, 40, null), num2, new MobileOfficialAppsFeedStat$TypeFeedPostExpandText(source))).q();
    }

    public static void d(MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action action, UserId userId, Integer num, String str, Integer num2) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(num.intValue()), Long.valueOf(userId.b), null, str, null, 40, null), num2, new MobileOfficialAppsFeedStat$TypeFeedItemMenuAction(action))).q();
    }

    public static void e(int i, String str, String str2, String str3) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), Integer.valueOf(i), new MobileOfficialAppsFeedStat$TypeFeedInteractionItem(MobileOfficialAppsFeedStat$TypeFeedInteractionItem.Item.GEO_ATTACHMENT, new MobileOfficialAppsFeedStat$TypeFeedItemTrackCode(str, str2), str3))).q();
    }

    public static void f(MobileOfficialAppsFeedStat$TypeFeedInteractionItem.Item item, String str, String str2, int i, String str3) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), Integer.valueOf(i), new MobileOfficialAppsFeedStat$TypeFeedInteractionItem(item, new MobileOfficialAppsFeedStat$TypeFeedItemTrackCode(str, str2), str3))).q();
    }

    public static void g(int i, UserId userId, Integer num, String str, MobileOfficialAppsFeedStat$TypeFeedOpenItem.Source source) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(num.intValue()), Long.valueOf(userId.b), null, str, null, 40, null), Integer.valueOf(i), new MobileOfficialAppsFeedStat$TypeFeedOpenItem(source))).q();
    }

    public static void i(String str, UserId userId, Integer num, MobileOfficialAppsFeedStat$TypeFeedPostTextAction.Subtype subtype) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.FEED_ITEM, Long.valueOf(num.intValue()), Long.valueOf(userId.b), null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedPostTextAction(subtype), 2)).q();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void h(String str, Integer num, UserId userId, MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost.Subtype subtype) {
        a aVar = (a) this.a.getValue();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, Long.valueOf(num.intValue()), userId != null ? Long.valueOf(userId.b) : null, null, str, null, 32, null), null, new MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost(subtype), 2);
        aVar.f = c;
        aVar.g = b;
        aVar.q();
    }
}
