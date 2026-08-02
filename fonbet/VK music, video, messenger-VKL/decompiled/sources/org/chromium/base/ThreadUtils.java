package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import internal.org.jni_zero.CalledByNative;
import java.util.concurrent.Callable;
import org.chromium.base.task.PostTask;
import xsna.r8l0;
import xsna.yzl;

/* loaded from: classes11.dex */
public class ThreadUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Thread sInstrumentationThreadForTesting;
    private static final Object sLock = new Object();
    private static boolean sThreadAssertsDisabledForTesting;
    private static volatile Handler sUiThreadHandler;
    private static Throwable sUiThreadInitializer;
    private static volatile boolean sWillOverride;

    public static void checkUiThread() {
        if (!sThreadAssertsDisabledForTesting && !runningOnUiThread()) {
            throw new IllegalStateException("Must be called on the UI thread.");
        }
    }

    public static void clearUiThreadForTesting() {
        sWillOverride = false;
        PostTask.resetUiThreadForTesting();
        sUiThreadHandler = null;
        sUiThreadInitializer = null;
    }

    public static Handler getUiThreadHandler() {
        if (sUiThreadHandler != null) {
            return sUiThreadHandler;
        }
        if (sWillOverride) {
            throw new RuntimeException("Did not yet override the UI thread");
        }
        setUiThread(Looper.getMainLooper());
        return sUiThreadHandler;
    }

    public static Looper getUiThreadLooper() {
        return getUiThreadHandler().getLooper();
    }

    public static void hasSubtleSideEffectsSetThreadAssertsDisabledForTesting(boolean z) {
        sThreadAssertsDisabledForTesting = z;
        ResettersForTesting.register(new r8l0(1));
    }

    @CalledByNative
    private static boolean isThreadPriorityAudio(int i) {
        return Process.getThreadPriority(i) == -16;
    }

    public static void postOnUiThread(Runnable runnable) {
        PostTask.postTask(7, runnable);
    }

    public static void postOnUiThreadDelayed(Runnable runnable, long j) {
        PostTask.postDelayedTask(7, runnable, j);
    }

    public static void recordInstrumentationThreadForTesting() {
        sInstrumentationThreadForTesting = Thread.currentThread();
    }

    public static void runOnUiThread(Runnable runnable) {
        PostTask.runOrPostTask(7, runnable);
    }

    public static void runOnUiThreadBlocking(Runnable runnable) {
        PostTask.runSynchronously(7, runnable);
    }

    public static boolean runningOnInstrumentationThread() {
        Thread thread = sInstrumentationThreadForTesting;
        return thread != null && thread == Thread.currentThread();
    }

    public static boolean runningOnUiThread() {
        return getUiThreadHandler().getLooper() == Looper.myLooper();
    }

    @Deprecated
    public static void setThreadAssertsDisabledForTesting(boolean z) {
        sThreadAssertsDisabledForTesting = z;
        ResettersForTesting.register(new yzl(1));
    }

    @CalledByNative
    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }

    public static void setUiThread(Looper looper) {
        synchronized (sLock) {
            try {
                if (sUiThreadHandler == null) {
                    sUiThreadHandler = new Handler(looper);
                    TraceEvent.onUiThreadReady();
                } else if (sUiThreadHandler.getLooper() != looper) {
                    throw new RuntimeException("UI thread looper is already set to " + String.valueOf(sUiThreadHandler.getLooper()) + " (Main thread looper is " + String.valueOf(Looper.getMainLooper()) + "), cannot set to new looper " + String.valueOf(looper));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setWillOverrideUiThread() {
        sWillOverride = true;
    }

    public static <T> T runOnUiThreadBlocking(Callable<T> callable) {
        return (T) PostTask.runSynchronously(7, callable);
    }

    public static class ThreadChecker {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Thread mThread;

        public ThreadChecker() {
            resetThreadId();
        }

        public void assertOnValidOrInstrumentationThread() {
            assertOnValidThreadHelper(true);
        }

        public void assertOnValidThread() {
            assertOnValidThreadHelper(false);
        }

        public void resetThreadId() {
        }

        private void assertOnValidThreadHelper(boolean z) {
        }
    }

    public static void assertOnBackgroundThread() {
    }

    public static void assertOnUiThread() {
    }
}
