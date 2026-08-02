package xsna;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: MusicNotificationChannelControllerImpl.kt */
/* loaded from: classes.dex */
public final class jp40 implements w8i {
    public final bpn0 b = new bpn0(new vb8(this, 4));
    public io.reactivex.rxjava3.disposables.c c = EmptyDisposable.INSTANCE;

    public final void a(String str) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (gz80.a(26) && c(context, str)) {
            bn40.f("Clearing notification channel ".concat(str));
            ((NotificationManager) context.getSystemService("notification")).deleteNotificationChannel(str);
        }
    }

    public final void b(int i, String str) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (!gz80.a(26) || c(context, str)) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i), 2);
        notificationChannel.setLockscreenVisibility(1);
        if (str.equals("audio_playback_channel")) {
            notificationChannel.setSound(null, null);
        }
        notificationChannel.setShowBadge(false);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(notificationChannel);
    }

    @TargetApi(26)
    public final boolean c(Context context, String str) {
        return ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str) != null;
    }
}
