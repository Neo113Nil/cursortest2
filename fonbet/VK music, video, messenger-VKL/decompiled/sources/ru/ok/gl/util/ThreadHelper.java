package ru.ok.gl.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import xsna.asu0;

/* loaded from: classes9.dex */
public final class ThreadHelper {
    public static final int DEFAULT_THREAD_POOL_SIZE = Math.max(1, Runtime.getRuntime().availableProcessors() - 1);
    private static final String TAG = "ThreadHelper";

    public static final class BackgroundExecutorHolder {
        static final ExecutorService EXECUTOR = asu0.B(ThreadHelper.DEFAULT_THREAD_POOL_SIZE, new NamedPriorityThreadFactory(ThreadHelper.TAG, 10));

        private BackgroundExecutorHolder() {
        }
    }

    public static final class MainThreadHandlerHolder {
        static final Handler HANDLER = new Handler(Looper.getMainLooper());

        private MainThreadHandlerHolder() {
        }
    }

    private ThreadHelper() {
    }

    public static void executeInBackground(@NonNull Runnable runnable) {
        if (isMainThread()) {
            BackgroundExecutorHolder.EXECUTOR.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static void executeOnMain(@NonNull Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            queueOnMain(runnable);
        }
    }

    public static void executeOnWorkerThread(@NonNull Runnable runnable) {
        BackgroundExecutorHolder.EXECUTOR.execute(runnable);
    }

    public static Handler getMainThreadHandler() {
        return MainThreadHandlerHolder.HANDLER;
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void queueOnMain(@NonNull Runnable runnable, long j) {
        getMainThreadHandler().postDelayed(runnable, j);
    }

    public static void throwIfMainThread() {
        if (isMainThread()) {
            throw new RuntimeException("Background thread expected");
        }
    }

    public static void throwIfNotMainThread() {
        if (!isMainThread()) {
            throw new RuntimeException("Main (aka UI) thread expected");
        }
    }

    public static void queueOnMain(@NonNull Runnable runnable) {
        queueOnMain(runnable, 0L);
    }
}
