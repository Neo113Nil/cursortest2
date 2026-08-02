package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class p {
    public final String a;
    public final int b;

    public p(NotificationChannel notificationChannel) {
        String id = notificationChannel.getId();
        int importance = notificationChannel.getImportance();
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        id.getClass();
        this.a = id;
        this.b = importance;
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
            o.b(notificationChannel);
            o.a(notificationChannel);
        }
        notificationChannel.canBypassDnd();
        notificationChannel.getLockscreenVisibility();
        notificationChannel.canBubble();
        if (i >= 30) {
            o.c(notificationChannel);
        }
    }
}
