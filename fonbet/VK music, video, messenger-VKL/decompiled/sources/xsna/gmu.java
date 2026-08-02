package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: GroupSettingsAnalytics.kt */
/* loaded from: classes4.dex */
public final class gmu {
    public static void a(long j, boolean z, boolean z2) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick(z ? MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.Event.PUSH_ENABLED : MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.Event.PUSH_DISABLED, MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.Label.COMMUNITY_PUSHES_DETAILED, Long.valueOf(j), z2 ? MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.LabelType.ALL : MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.LabelType.SELECTED), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
