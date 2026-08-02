package com.google.ar.core;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class d0 {
    public Context b;
    public com.google.ar.core.dependencies.h c;
    public BroadcastReceiver e;
    public InstallActivity f;
    public PackageInstaller g;
    public PackageInstaller.SessionCallback h;
    public final ArrayDeque a = new ArrayDeque();
    public volatile int i = 1;
    public final ServiceConnection d = new y(this);

    public static void e(Activity activity, c0 c0Var) {
        boolean z;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core"));
            q qVar = q.m;
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && activityInfo.name.equals("com.sec.android.app.samsungapps.MainForChina")) {
                    z = true;
                    break;
                }
            }
            qVar.d = !z;
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            c0Var.b(new FatalException("Failed to launch installer.", e));
        }
    }

    public final synchronized void a(Context context) {
        this.b = context;
        if (context.bindService(new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending"), this.d, 1)) {
            this.i = 2;
            return;
        }
        this.i = 1;
        this.b = null;
        context.unbindService(this.d);
    }

    public final synchronized void b() {
        try {
            int i = this.i;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1 || i2 == 2) {
                this.b.unbindService(this.d);
                this.b = null;
                this.i = 1;
            }
            BroadcastReceiver broadcastReceiver = this.e;
            if (broadcastReceiver != null) {
                this.f.unregisterReceiver(broadcastReceiver);
            }
            PackageInstaller.SessionCallback sessionCallback = this.h;
            if (sessionCallback != null) {
                this.g.unregisterSessionCallback(sessionCallback);
                this.h = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Context context, l lVar) {
        try {
            d(new h(this, context, lVar));
        } catch (ag unused) {
            Log.e("ARCore-InstallService", "Play Store install service could not be bound.");
            lVar.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    public final synchronized void d(Runnable runnable) {
        int i = this.i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw new ag("InstallService not bound");
        }
        if (i2 == 1) {
            this.a.offer(runnable);
        } else {
            if (i2 != 2) {
                return;
            }
            runnable.run();
        }
    }
}
