package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdTrialAction;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdTrialClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdTrialUi;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: VideoAdsSuspendStatsTracker.kt */
/* loaded from: classes6.dex */
public final class n0s0 {
    public static void a(String str, boolean z) {
        b(MobileOfficialAppsVideoStat$TypeVideoAdTrialAction.EventType.TRIGGER, z ? MobileOfficialAppsVideoStat$TypeVideoAdTrialAction.EventSubtype.SHOW : MobileOfficialAppsVideoStat$TypeVideoAdTrialAction.EventSubtype.HIDE, str);
    }

    public static void b(MobileOfficialAppsVideoStat$TypeVideoAdTrialAction.EventType eventType, MobileOfficialAppsVideoStat$TypeVideoAdTrialAction.EventSubtype eventSubtype, String str) {
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypeVideoAdTrialAction(eventType, eventSubtype, str), 3)).q();
    }

    public static void c(MobileOfficialAppsVideoStat$TypeVideoAdTrialClick.EventType eventType, MobileOfficialAppsVideoStat$TypeVideoAdTrialUi mobileOfficialAppsVideoStat$TypeVideoAdTrialUi, String str, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoAdTrialClick(eventType, mobileOfficialAppsVideoStat$TypeVideoAdTrialUi, str, mobileOfficialAppsVideoStat$TypeScreenMode), 2)).q();
    }
}
