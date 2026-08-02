package com.google.firebase.crashlytics.internal.concurrency;

import android.util.Log;
import defpackage.k3f;
import defpackage.l3f;
import defpackage.udq0;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class a {
    public static final l3f d = new l3f();
    public final k3f a;
    public final k3f b;
    public final k3f c;

    public a(ExecutorService executorService, ExecutorService executorService2) {
        this.a = new k3f(executorService);
        this.b = new k3f(executorService);
        udq0.p(null);
        this.c = new k3f(executorService2);
    }

    public static final void a() {
        if (((Boolean) new CrashlyticsWorkers$Companion$checkBackgroundThread$1(0, d, l3f.class, "isBackgroundThread", "isBackgroundThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public static final void b() {
        if (((Boolean) new CrashlyticsWorkers$Companion$checkBlockingThread$1(0, d, l3f.class, "isBlockingThread", "isBlockingThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public static final void c() {
        if (((Boolean) new CrashlyticsWorkers$Companion$checkNotMainThread$1(0, d, l3f.class, "isNotMainThread", "isNotMainThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
        Log.isLoggable("FirebaseCrashlytics", 3);
    }
}
