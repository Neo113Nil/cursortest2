package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class s0 {
    public static String d;
    public static NotificationManagerCompat$SideChannelManager g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public s0(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, String str) {
        this.b.cancel(str, i);
    }

    public final void b(NotificationChannel notificationChannel) {
        this.b.createNotificationChannel(notificationChannel);
    }

    public final void c(String str) {
        this.b.deleteNotificationChannel(str);
    }

    public final void d(String str, int i, Notification notification) {
        Bundle d2 = t.d(notification);
        if (d2 == null || !d2.getBoolean("android.support.useSideChannel")) {
            this.b.notify(str, i, notification);
            return;
        }
        o0 o0Var = new o0(this.a.getPackageName(), i, str, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new NotificationManagerCompat$SideChannelManager(this.a.getApplicationContext());
                }
                g.queueTask(o0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.cancel(str, i);
    }
}
