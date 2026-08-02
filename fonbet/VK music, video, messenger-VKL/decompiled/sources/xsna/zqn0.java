package xsna;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: SystemNotificationsHelper.kt */
/* loaded from: classes.dex */
public final class zqn0 {
    public static Application b;
    public static boolean f;
    public static final zqn0 a = new zqn0();
    public static final a c = new a();
    public static final b d = new b();
    public static final bpn0 e = new bpn0(new nb8(18));
    public static final CopyOnWriteArraySet<c> g = new CopyOnWriteArraySet<>();

    /* compiled from: SystemNotificationsHelper.kt */
    public static final class a extends ja0 {
        @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            zqn0.a(null);
        }

        @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            zqn0.a(activity);
        }
    }

    /* compiled from: SystemNotificationsHelper.kt */
    public static final class b extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            zqn0.a(null);
        }
    }

    public static final void a(Activity activity) {
        Iterator<c> it = g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (activity != null) {
                next.b();
            }
            next.a();
        }
    }

    public final synchronized void b(c cVar) {
        c();
        CopyOnWriteArraySet<c> copyOnWriteArraySet = g;
        int size = copyOnWriteArraySet.size();
        copyOnWriteArraySet.add(cVar);
        int size2 = copyOnWriteArraySet.size();
        if (size == 0 && size2 > 0) {
            Application application = b;
            Application application2 = null;
            if (application == null) {
                application = null;
            }
            application.registerActivityLifecycleCallbacks(c);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.app.action.APP_BLOCK_STATE_CHANGED");
            intentFilter.addAction("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED");
            intentFilter.addAction("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED");
            Application application3 = b;
            if (application3 != null) {
                application2 = application3;
            }
            application2.registerReceiver(d, intentFilter);
        }
    }

    public final synchronized void c() {
        if (!f) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final boolean d(String str) {
        c();
        return (gz80.a(26) ? ((NotificationManager) e.getValue()).getNotificationChannel(str) : null) != null;
    }

    public final boolean e(String str) {
        c();
        return u370.d((NotificationManager) e.getValue(), str) != null;
    }

    public final boolean f() {
        c();
        Application application = b;
        if (application == null) {
            application = null;
        }
        return new dd70(application.getApplicationContext()).b.areNotificationsEnabled();
    }

    public final void g(String str) {
        try {
            c();
            Application application = b;
            if (application == null) {
                application = null;
            }
            Context applicationContext = application.getApplicationContext();
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", applicationContext.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", str);
            intent.addFlags(268435456);
            applicationContext.startActivity(intent);
        } catch (Throwable unused) {
            cvk.u(R.string.error, false);
        }
    }

    public final void h() {
        c();
        Application application = b;
        if (application == null) {
            application = null;
        }
        Context applicationContext = application.getApplicationContext();
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", applicationContext.getPackageName());
        intent.putExtra("app_package", applicationContext.getPackageName());
        intent.putExtra("app_uid", applicationContext.getApplicationInfo().uid);
        intent.addFlags(268435456);
        applicationContext.startActivity(intent);
    }

    public final void i() {
        try {
            h();
        } catch (Throwable unused) {
            cvk.u(R.string.error, false);
        }
    }

    public final synchronized void j(c cVar) {
        c();
        CopyOnWriteArraySet<c> copyOnWriteArraySet = g;
        int size = copyOnWriteArraySet.size();
        copyOnWriteArraySet.remove(cVar);
        int size2 = copyOnWriteArraySet.size();
        if (size > 0 && size2 == 0) {
            Application application = b;
            Application application2 = null;
            if (application == null) {
                application = null;
            }
            application.unregisterActivityLifecycleCallbacks(c);
            Application application3 = b;
            if (application3 != null) {
                application2 = application3;
            }
            application2.unregisterReceiver(d);
        }
    }

    /* compiled from: SystemNotificationsHelper.kt */
    public interface c {
        void a();

        default void b() {
        }
    }
}
