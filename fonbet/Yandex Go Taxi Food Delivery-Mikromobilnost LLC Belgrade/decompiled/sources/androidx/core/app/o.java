package androidx.core.app;

import android.app.NotificationChannel;

/* loaded from: classes.dex */
public abstract class o {
    public static String a(NotificationChannel notificationChannel) {
        return notificationChannel.getConversationId();
    }

    public static String b(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static void c(NotificationChannel notificationChannel) {
        notificationChannel.isImportantConversation();
    }
}
