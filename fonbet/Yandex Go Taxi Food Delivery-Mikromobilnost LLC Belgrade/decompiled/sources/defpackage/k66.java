package defpackage;

import android.app.NotificationManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class k66 implements lz60 {
    public final /* synthetic */ int a;
    public final Context b;
    public final Object c;

    public /* synthetic */ k66(Context context, int i, Object obj) {
        this.a = i;
        this.b = context;
        this.c = obj;
    }

    @Override // defpackage.lz60
    public final void g() {
        int i = this.a;
        Object obj = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                yaj yajVar = (yaj) obj;
                BluetoothAdapter r = qje.r(context);
                boolean isEnabled = (r != null ? new vit(8, r) : qje.a).isEnabled();
                yajVar.getClass();
                HashMap hashMap = new HashMap();
                yajVar.a.a("DeviceInfo.Bluetooth", hashMap, 1, x4e.r(isEnabled, hashMap, BackendConfig.Restrictions.ENABLED));
                break;
            default:
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                StatusBarNotification[] activeNotifications = notificationManager != null ? notificationManager.getActiveNotifications() : null;
                if (activeNotifications == null) {
                    activeNotifications = new StatusBarNotification[0];
                }
                ng60 ng60Var = (ng60) obj;
                ng60Var.getClass();
                ArrayList arrayList = new ArrayList(activeNotifications.length);
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    arrayList.add(b.i(new Pair("id", String.valueOf(statusBarNotification.getId())), new Pair("tag", statusBarNotification.getTag()), new Pair("channel", statusBarNotification.getNotification().getChannelId()), new Pair("is_ongoing", String.valueOf(statusBarNotification.isOngoing())), new Pair("package", statusBarNotification.getPackageName()), new Pair("category", statusBarNotification.getNotification().category)));
                }
                p0g0 p0g0Var = ng60Var.d;
                p0g0Var.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("notifications", arrayList);
                p0g0Var.a.a("Push.CurrentlyShowing", hashMap2, 1, new HashMap());
                break;
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        switch (this.a) {
            case 0:
                return "bluetooth-info";
            default:
                return "CurrentNotificationsAnalyticsInteractor";
        }
    }
}
