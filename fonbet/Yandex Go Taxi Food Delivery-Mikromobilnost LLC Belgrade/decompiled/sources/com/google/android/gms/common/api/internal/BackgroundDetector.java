package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import defpackage.gtq0;
import defpackage.zg4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final BackgroundDetector zza = new BackgroundDetector();
    private final AtomicBoolean zzb = new AtomicBoolean();
    private final AtomicBoolean zzc = new AtomicBoolean();
    private final ArrayList zzd = new ArrayList();
    private boolean zze = false;

    private BackgroundDetector() {
    }

    public static BackgroundDetector getInstance() {
        return zza;
    }

    public static void initialize(Application application) {
        BackgroundDetector backgroundDetector = zza;
        synchronized (backgroundDetector) {
            try {
                if (!backgroundDetector.zze) {
                    application.registerActivityLifecycleCallbacks(backgroundDetector);
                    application.registerComponentCallbacks(backgroundDetector);
                    backgroundDetector.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zza(boolean z) {
        synchronized (zza) {
            try {
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    ((zg4) it.next()).a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addListener(zg4 zg4Var) {
        synchronized (zza) {
            this.zzd.add(zg4Var);
        }
    }

    public boolean isInBackground() {
        return this.zzb.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.zzc;
        boolean compareAndSet = this.zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            zza(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.zzc;
        boolean compareAndSet = this.zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            zza(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.zzb.compareAndSet(false, true)) {
            this.zzc.set(true);
            zza(true);
        }
    }

    public boolean readCurrentStateIfPossible(boolean z) {
        AtomicBoolean atomicBoolean = this.zzc;
        if (!atomicBoolean.get()) {
            Boolean bool = gtq0.p;
            if (bool == null) {
                bool = Boolean.valueOf(Process.isIsolated());
                gtq0.p = bool;
            }
            if (bool.booleanValue()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.zzb.set(true);
            }
        }
        return isInBackground();
    }
}
