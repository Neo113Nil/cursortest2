package xsna;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: NotificationUtil.java */
@SuppressLint({"InlinedApi"})
/* loaded from: classes12.dex */
public final class gi70 {
    public static void a(Service service, String str, int i) {
        NotificationManager notificationManager = (NotificationManager) service.getSystemService("notification");
        notificationManager.getClass();
        notificationManager.createNotificationChannel(new NotificationChannel(str, service.getString(i), 2));
    }

    public static void b(Context context, int i, @Nullable Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        notificationManager.notify(i, notification);
    }
}
