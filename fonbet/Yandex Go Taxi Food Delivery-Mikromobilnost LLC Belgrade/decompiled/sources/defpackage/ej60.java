package defpackage;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import androidx.core.app.s0;
import androidx.core.app.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class ej60 {
    public final s0 a;
    public final NotificationManager b;

    public ej60(Application application) {
        this.a = new s0(application);
        this.b = (NotificationManager) application.getSystemService(NotificationManager.class);
    }

    public final void a(int i, String str) {
        StatusBarNotification[] statusBarNotificationArr;
        NotificationManager notificationManager = this.b;
        if (notificationManager == null || (statusBarNotificationArr = notificationManager.getActiveNotifications()) == null) {
            statusBarNotificationArr = new StatusBarNotification[0];
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
            if (statusBarNotification.getId() != i || !jl40.l(statusBarNotification.getTag(), str)) {
                arrayList.add(statusBarNotification);
            }
        }
        b(arrayList);
        unr0.C(new Object[]{str, Integer.valueOf(i)}, 2, "cancel [%s|%d]", jst.e);
        this.a.a(i, str);
    }

    public final void b(ArrayList arrayList) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (t.e(((StatusBarNotification) obj2).getNotification())) {
                arrayList2.add(obj2);
            }
        }
        int d = gw00.d(tcc.n(arrayList2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((StatusBarNotification) next).getNotification().getGroup(), next);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            StatusBarNotification statusBarNotification = (StatusBarNotification) entry.getValue();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                StatusBarNotification statusBarNotification2 = (StatusBarNotification) obj;
                if (jl40.l(statusBarNotification2.getNotification().getGroup(), str) && !t.e(statusBarNotification2.getNotification())) {
                    break;
                }
            }
            if (obj == null) {
                unr0.C(new Object[]{str}, 1, "cancel group summary [%s]", jst.e);
                this.a.a(statusBarNotification.getId(), statusBarNotification.getTag());
            }
        }
    }

    public final void c(int i) {
        StatusBarNotification statusBarNotification;
        NotificationManager notificationManager = this.b;
        StatusBarNotification[] activeNotifications = notificationManager != null ? notificationManager.getActiveNotifications() : null;
        if (activeNotifications != null) {
            int length = activeNotifications.length;
            for (int i2 = 0; i2 < length; i2++) {
                statusBarNotification = activeNotifications[i2];
                if (statusBarNotification.getId() == i && jl40.l(statusBarNotification.getTag(), null)) {
                    break;
                }
            }
        }
        statusBarNotification = null;
        if (statusBarNotification == null || !statusBarNotification.isOngoing()) {
            return;
        }
        this.a.a(i, null);
        Notification notification = statusBarNotification.getNotification();
        if (notification != null) {
            notification.flags &= -3;
            d(null, i, notification);
        }
    }

    public final void d(String str, int i, Notification notification) {
        s0 s0Var = this.a;
        if (str == null) {
            unr0.C(new Object[]{Integer.valueOf(i)}, 1, "notify [%d]", jst.e);
            s0Var.d(null, i, notification);
        } else {
            unr0.C(new Object[]{str, Integer.valueOf(i)}, 2, "notify [%s|%d]", jst.e);
            s0Var.d(str, i, notification);
        }
    }
}
