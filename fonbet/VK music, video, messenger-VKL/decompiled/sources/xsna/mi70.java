package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsNotificationsStat$TypeNotificationViews;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.LinkedHashSet;

/* compiled from: NotificationViewAnalytics.kt */
/* loaded from: classes4.dex */
public final class mi70 {
    public final LinkedHashSet<String> a = new LinkedHashSet<>();
    public final LinkedHashSet<String> b = new LinkedHashSet<>();

    public final void a() {
        LinkedHashSet<String> linkedHashSet = this.a;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        new bvt0(MobileOfficialAppsCoreNavStat$EventScreen.NOTIFICATIONS, SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.NOTIFICATIONS, null, null, null, null, null, 62, null), valueOf, valueOf, null, new MobileOfficialAppsNotificationsStat$TypeNotificationViews(j5g.O0(linkedHashSet)), 8)).q();
        linkedHashSet.clear();
    }
}
