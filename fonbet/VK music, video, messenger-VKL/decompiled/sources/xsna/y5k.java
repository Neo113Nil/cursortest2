package xsna;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* loaded from: classes.dex */
public final class y5k implements Thread.UncaughtExceptionHandler {
    public final q4k a;
    public final k1j0 b;
    public final f5k c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public y5k(q4k q4kVar, k1j0 k1j0Var, f5k f5kVar) {
        this.a = q4kVar;
        this.b = k1j0Var;
        this.c = f5kVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        AtomicBoolean atomicBoolean = this.d;
        atomicBoolean.set(true);
        try {
            if (thread == null) {
                Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            } else if (th == null) {
                Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            } else if (!this.c.c()) {
                this.a.a(this.b, thread, th);
            }
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
        } finally {
            atomicBoolean.set(false);
        }
    }
}
