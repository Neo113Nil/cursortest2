package defpackage;

import android.util.Log;
import com.google.firebase.crashlytics.internal.settings.a;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j3f implements Thread.UncaughtExceptionHandler {
    public final vit a;
    public final a b;
    public final Thread.UncaughtExceptionHandler c;
    public final y2f d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public j3f(vit vitVar, a aVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, y2f y2fVar) {
        this.a = vitVar;
        this.b = aVar;
        this.c = uncaughtExceptionHandler;
        this.d = y2fVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.d.b()) {
            return true;
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    this.a.m(this.b, thread, th);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                }
                if (uncaughtExceptionHandler != null) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
                if (uncaughtExceptionHandler != null) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                Log.isLoggable("FirebaseCrashlytics", 3);
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                Log.isLoggable("FirebaseCrashlytics", 3);
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
