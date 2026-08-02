package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;

/* compiled from: SakNavigationDashboardTracker.kt */
/* loaded from: classes5.dex */
public final class d0h0 {
    public static void a(SchemeStatSak$TypeVkConnectNavigationItem.EventType eventType, String str, String str2) {
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.NOWHERE;
        par0.a.getClass();
        par0.a("<" + eventType + "> " + str + ' ' + schemeStatSak$EventScreen + ' ' + str2);
        new c0h0(schemeStatSak$EventScreen, new SchemeStatSak$TypeVkConnectNavigationItem(eventType, null, null, str, str2, schemeStatSak$EventScreen, null, null, 198, null)).q();
    }
}
