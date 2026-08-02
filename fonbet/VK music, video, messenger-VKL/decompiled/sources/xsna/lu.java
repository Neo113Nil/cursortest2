package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.action_button.ActionButtonDonutGoal;
import com.vk.dto.action_button.ActionButtonDonutLevel;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.CommonFeedStat$TypeActionButtonTypeItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeActionButtonClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ActionButtonAnalytics.kt */
/* loaded from: classes4.dex */
public final class lu {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new jb(1));

    /* compiled from: ActionButtonAnalytics.kt */
    public static final class a extends vk6<SchemeStat$TypeAction> {
    }

    public static void a(NewsEntry newsEntry, ActionButtonAttachment actionButtonAttachment, int i) {
        MobileOfficialAppsFeedStat$TypeActionButtonClick mobileOfficialAppsFeedStat$TypeActionButtonClick;
        Object obj;
        Iterator<E> it = CommonFeedStat$TypeActionButtonTypeItem.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (brm0.w(actionButtonAttachment.f, ((CommonFeedStat$TypeActionButtonTypeItem) obj).name(), true)) {
                    break;
                }
            }
        }
        CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem = (CommonFeedStat$TypeActionButtonTypeItem) obj;
        if (commonFeedStat$TypeActionButtonTypeItem == null) {
            mobileOfficialAppsFeedStat$TypeActionButtonClick = null;
        } else {
            ActionButtonDonutLevel actionButtonDonutLevel = actionButtonAttachment.k;
            Long valueOf = actionButtonDonutLevel != null ? Long.valueOf(actionButtonDonutLevel.b) : null;
            ActionButtonDonutGoal actionButtonDonutGoal = actionButtonAttachment.j;
            mobileOfficialAppsFeedStat$TypeActionButtonClick = new MobileOfficialAppsFeedStat$TypeActionButtonClick(commonFeedStat$TypeActionButtonTypeItem, valueOf, actionButtonDonutGoal != null ? Long.valueOf(actionButtonDonutGoal.b) : null);
        }
        if (mobileOfficialAppsFeedStat$TypeActionButtonClick == null) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(di60.n(newsEntry)), Long.valueOf(k9q0.o(newsEntry).b), null, newsEntry.Cb().b, null, 40, null), Integer.valueOf(i), mobileOfficialAppsFeedStat$TypeActionButtonClick)).q();
    }
}
