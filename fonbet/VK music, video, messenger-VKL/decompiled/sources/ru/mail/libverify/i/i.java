package ru.mail.libverify.i;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import ru.mail.libverify.R;
import ru.mail.verify.core.utils.FileLog;
import xsna.dd70;
import xsna.drm0;

/* loaded from: classes9.dex */
public final class i {
    public static final j a(Context context) {
        return (Build.VERSION.SDK_INT < 33 || ru.mail.libverify.n0.e.b(context, "android.permission.POST_NOTIFICATIONS")) ? new j(a(context, context.getString(R.string.libverify_high_notification_id))) : new j(false);
    }

    public static boolean a(Context context, String str) {
        try {
            NotificationManager notificationManager = new dd70(context).b;
            if (notificationManager.areNotificationsEnabled() && str != null && !drm0.N(str)) {
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
                if (notificationChannel == null) {
                    return true;
                }
                FileLog.v("NotificationUtils", "Notification channel " + str + " (importance: " + notificationChannel.getImportance() + ')');
                return notificationChannel.getImportance() != 0;
            }
            return false;
        } catch (Throwable th) {
            FileLog.e("NotificationUtils", "Failed to check notification availability", th);
            return true;
        }
    }
}
