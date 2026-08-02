package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import defpackage.btx0;
import defpackage.hgz;
import defpackage.t951;
import defpackage.tqs;
import defpackage.y2x0;
import java.util.UUID;

/* loaded from: classes10.dex */
public class SystemForegroundService extends LifecycleService {
    private static final String TAG = hgz.o("SystemFgService");
    private static SystemForegroundService sForegroundService = null;
    y2x0 mDispatcher;
    private boolean mIsShutdown;
    NotificationManager mNotificationManager;

    public static SystemForegroundService getInstance() {
        return sForegroundService;
    }

    private void initializeDispatcher() {
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        y2x0 y2x0Var = new y2x0(getApplicationContext());
        this.mDispatcher = y2x0Var;
        if (y2x0Var.B != null) {
            hgz.g().e(y2x0.C, "A callback already exists.");
        } else {
            y2x0Var.B = this;
        }
    }

    public void cancelNotification(int i) {
        this.mNotificationManager.cancel(i);
    }

    public void notify(int i, Notification notification) {
        this.mNotificationManager.notify(i, notification);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mDispatcher.e();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.mIsShutdown) {
            hgz.g().h(TAG, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.mDispatcher.e();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        y2x0 y2x0Var = this.mDispatcher;
        y2x0Var.getClass();
        String str = y2x0.C;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            hgz.g().h(str, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            btx0 btx0Var = y2x0Var.b;
            tqs tqsVar = new tqs((Object) y2x0Var, (Object) stringExtra, false, 17);
            btx0Var.getClass();
            ((t951) btx0Var).a.execute(tqsVar);
            y2x0Var.c(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            y2x0Var.c(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            hgz.g().h(str, "Stopping foreground service");
            SystemForegroundService systemForegroundService = y2x0Var.B;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.stop(i2);
            return 3;
        }
        hgz.g().h(str, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        y2x0Var.a.d(UUID.fromString(stringExtra2));
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.mDispatcher.f(i, 2048);
    }

    public void startForeground(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT < 31) {
            startForeground(i, notification, i2);
            return;
        }
        try {
            startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            hgz g = hgz.g();
            String unused2 = TAG;
            g.getClass();
        } catch (SecurityException unused3) {
            hgz g2 = hgz.g();
            String unused4 = TAG;
            g2.getClass();
        }
    }

    public void stop(int i) {
        this.mIsShutdown = true;
        hgz.g().getClass();
        stopForeground(true);
        sForegroundService = null;
        stopSelf(i);
    }

    public void onTimeout(int i, int i2) {
        this.mDispatcher.f(i, i2);
    }
}
