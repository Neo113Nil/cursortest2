package defpackage;

import android.content.SharedPreferences;
import com.ybsdk.core.common.utils.preferences.LazySharedPreferences;
import java.lang.Thread;

/* loaded from: classes8.dex */
public final class dy51 implements Thread.UncaughtExceptionHandler {
    public final lb7 a;
    public final Thread.UncaughtExceptionHandler b;

    public dy51(lb7 lb7Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = lb7Var;
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        SharedPreferences.Editor edit = ((LazySharedPreferences) this.a.c).edit();
        edit.putBoolean("crash_detected", true);
        edit.commit();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
        if (uncaughtExceptionHandler == null) {
            Runtime.getRuntime().exit(0);
        }
    }
}
