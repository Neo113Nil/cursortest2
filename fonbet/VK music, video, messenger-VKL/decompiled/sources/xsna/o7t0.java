package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoChannelOnboardingClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: VideoProfileCreatorOnboardingAnalytics.kt */
/* loaded from: classes6.dex */
public final class o7t0 {
    public static void a(CommonVideoStat$TypeVideoChannelOnboardingClick.EventType eventType, UserId userId) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new CommonVideoStat$TypeVideoChannelOnboardingClick(eventType, Long.valueOf(userId.b)), 2)).q();
    }
}
