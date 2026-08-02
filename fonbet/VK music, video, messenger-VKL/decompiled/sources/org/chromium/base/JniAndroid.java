package org.chromium.base;

import internal.org.jni_zero.CalledByNative;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.d4k;
import xsna.y370;
import xsna.zr;

/* loaded from: classes8.dex */
public final class JniAndroid {
    private static final String TAG = "JniAndroid";
    static boolean sSimulateOomInSanitizedStacktraceForTesting;

    public static class UncaughtExceptionException extends RuntimeException {
        public UncaughtExceptionException(String str, Throwable th) {
            super(zr.a("Native stack trace:", System.lineSeparator(), str), th);
        }
    }

    private JniAndroid() {
    }

    @CalledByNative
    private static Throwable handleException(Throwable th, String str) {
        try {
            Log.e(TAG, "Handling uncaught Java exception", th);
            UncaughtExceptionException uncaughtExceptionException = new UncaughtExceptionException(str, th);
            AtomicBoolean atomicBoolean = d4k.a;
            y370.a.uncaughtException(Thread.currentThread(), uncaughtExceptionException);
            Log.e(TAG, "Global uncaught exception handler did not terminate the process.");
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th2) {
            Log.e(TAG, "Exception in uncaught exception handler.", th2);
            return th2;
        }
    }

    @CalledByNative
    private static String sanitizedStacktraceForUnhandledException(Throwable th) {
        if (sSimulateOomInSanitizedStacktraceForTesting) {
            return null;
        }
        try {
            try {
                return PiiElider.sanitizeStacktrace(Log.getStackTraceString(th));
            } catch (Throwable th2) {
                return "Error while getting stack trace: " + Log.getStackTraceString(th2);
            }
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }
}
