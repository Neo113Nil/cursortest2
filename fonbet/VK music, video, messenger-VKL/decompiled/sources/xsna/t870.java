package xsna;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* compiled from: NotificationChannelCompat.java */
/* loaded from: classes11.dex */
public final class t870 {
    public final int a;

    /* compiled from: NotificationChannelCompat.java */
    public static class a {
        public static void a(NotificationChannel notificationChannel) {
            notificationChannel.canBubble();
        }
    }

    /* compiled from: NotificationChannelCompat.java */
    public static class b {
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

    public t870(NotificationChannel notificationChannel) {
        String id = notificationChannel.getId();
        int importance = notificationChannel.getImportance();
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        id.getClass();
        this.a = importance;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        notificationChannel.getName();
        notificationChannel.getDescription();
        notificationChannel.getGroup();
        notificationChannel.canShowBadge();
        notificationChannel.getSound();
        notificationChannel.getAudioAttributes();
        notificationChannel.shouldShowLights();
        notificationChannel.getLightColor();
        notificationChannel.shouldVibrate();
        notificationChannel.getVibrationPattern();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            b.b(notificationChannel);
            b.a(notificationChannel);
        }
        notificationChannel.canBypassDnd();
        notificationChannel.getLockscreenVisibility();
        if (i >= 29) {
            a.a(notificationChannel);
        }
        if (i >= 30) {
            b.c(notificationChannel);
        }
    }
}
