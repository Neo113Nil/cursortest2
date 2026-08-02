package org.chromium.base;

import android.os.DeadSystemException;
import internal.org.jni_zero.CalledByNative;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.JniAndroid;
import xsna.d4k;
import xsna.y370;

/* loaded from: classes8.dex */
public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mCrashAfterReport;
    private boolean mHandlingException;
    private final Thread.UncaughtExceptionHandler mParent;

    public interface Natives {
        void reportJavaException(boolean z, Throwable th);

        void reportJavaStackTrace(String str);
    }

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.mParent = uncaughtExceptionHandler;
        this.mCrashAfterReport = z;
    }

    @CalledByNative
    private static void installHandler(boolean z) {
        AtomicBoolean atomicBoolean = d4k.a;
        d4k.a(new JavaExceptionReporter(y370.a, z));
    }

    public static void reportException(Throwable th) {
        JavaExceptionReporterJni.get().reportJavaException(false, th);
    }

    public static void reportStackTrace(String str) {
        JavaExceptionReporterJni.get().reportJavaStackTrace(PiiElider.sanitizeStacktrace(str));
    }

    public static boolean shouldReportThrowable(Throwable th) {
        return !(th instanceof DeadSystemException);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (!this.mHandlingException && shouldReportThrowable(th)) {
            this.mHandlingException = true;
            JavaExceptionReporterJni.get().reportJavaException(this.mCrashAfterReport, th instanceof JniAndroid.UncaughtExceptionException ? th.getCause() : th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mParent;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
