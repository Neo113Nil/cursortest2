package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import defpackage.cv2;
import defpackage.cvw;
import defpackage.gp91;
import defpackage.kp50;
import defpackage.udq0;
import defpackage.vm91;
import defpackage.wlh;
import defpackage.yvi0;
import defpackage.zj91;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e {
    public static volatile e g;
    public final ExecutorService a;
    public final yvi0 b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public volatile zzcr f;

    public e(Context context, Bundle bundle) {
        wlh wlhVar = new wlh(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), wlhVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new yvi0(this);
        this.c = new ArrayList();
        try {
            if (udq0.Y(context, kp50.X(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, e.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new zj91(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new zzfa(this));
    }

    public static e c(Context context, Bundle bundle) {
        cvw.l(context);
        if (g == null) {
            synchronized (e.class) {
                try {
                    if (g == null) {
                        g = new e(context, bundle);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final void a(gp91 gp91Var) {
        this.a.execute(gp91Var);
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (!z && z2) {
            a(new vm91(this, "Error with data collection. Data lost.", exc));
        }
    }

    public final void d(cv2 cv2Var) {
        ArrayList arrayList = this.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (cv2Var.equals(((Pair) arrayList.get(i)).first)) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzes zzesVar = new zzes(cv2Var);
            arrayList.add(new Pair(cv2Var, zzesVar));
            if (this.f != null) {
                try {
                    this.f.registerOnMeasurementEventListener(zzesVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            a(new c(this, zzesVar));
        }
    }
}
