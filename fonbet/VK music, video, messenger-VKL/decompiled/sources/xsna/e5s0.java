package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: VideoBannerTrapStatTracker.kt */
/* loaded from: classes7.dex */
public final class e5s0 {
    public static void a() {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick(MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventType.SUBSCRIBE, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.BANNER_DISCOVER, null, null, 12, null), 2)).q();
    }

    public static void b() {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose(MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.BANNER_DISCOVER, null, 2, null), 2)).q();
    }
}
