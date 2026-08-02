package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;

/* loaded from: classes10.dex */
public abstract class l0 {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.canPostPromotedNotifications();
    }

    public static void b(Notification.Builder builder, String str) {
        builder.setShortCriticalText(str);
    }
}
