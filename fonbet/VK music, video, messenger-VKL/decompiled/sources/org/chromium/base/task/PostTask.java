package org.chromium.base.task;

import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.chromium.base.JavaUtils;
import org.chromium.base.Log;
import org.chromium.base.ResettersForTesting;
import org.chromium.base.ThreadUtils;
import xsna.s230;

/* loaded from: classes8.dex */
public class PostTask {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final boolean ENABLE_TASK_ORIGINS = false;
    private static final String TAG = "PostTask";
    private static volatile boolean sDisablePreNativeUiTasks;
    private static volatile boolean sNativeInitialized;
    private static volatile Executor sPrenativeThreadPoolExecutorForTesting;
    static int sTestIterationForTesting;
    private static final Object sPreNativeTaskRunnerLock = new Object();
    private static List<TaskRunnerImpl> sPreNativeTaskRunners = new ArrayList();
    private static ChromeThreadPoolExecutor sPrenativeThreadPoolExecutor = new ChromeThreadPoolExecutor();
    private static final ThreadLocal<TaskOriginException> sTaskOrigin = null;
    private static final TaskRunner[] sTraitsToRunnerMap = new TaskRunner[10];

    public static class TaskOriginRunnable implements Runnable {
        private final TaskOriginException mTaskOrigin;
        private final Runnable mWrappedRunnable;

        public TaskOriginRunnable(TaskOriginException taskOriginException, Runnable runnable) {
            this.mTaskOrigin = taskOriginException;
            this.mWrappedRunnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            ThreadLocal threadLocal = PostTask.sTaskOrigin;
            threadLocal.set(this.mTaskOrigin);
            try {
                this.mWrappedRunnable.run();
            } catch (Throwable th) {
                try {
                    JavaUtils.throwUnchecked(PostTask.maybeAddTaskOrigin(th));
                } finally {
                    threadLocal.remove();
                }
            }
        }
    }

    static {
        resetTaskRunner();
    }

    public static boolean canRunTaskImmediately(int i) {
        return isUiTaskTraits(i) && ThreadUtils.runningOnUiThread() && canRunUiTaskBeforeNativeInit(i);
    }

    public static boolean canRunUiTaskBeforeNativeInit(int i) {
        return i == 9 || !sDisablePreNativeUiTasks;
    }

    public static SequencedTaskRunner createSequencedTaskRunner(int i) {
        return isUiTaskTraits(i) ? (SequencedTaskRunner) sTraitsToRunnerMap[i] : new SequencedTaskRunnerImpl(i);
    }

    public static void disablePreNativeUiTasks(boolean z) {
        sDisablePreNativeUiTasks = z;
    }

    public static void flushJobsAndResetForTesting() throws InterruptedException {
        ChromeThreadPoolExecutor chromeThreadPoolExecutor = sPrenativeThreadPoolExecutor;
        int activeCount = chromeThreadPoolExecutor.getActiveCount() + chromeThreadPoolExecutor.getQueue().size();
        if (activeCount > 0) {
            chromeThreadPoolExecutor.shutdownNow();
            chromeThreadPoolExecutor.awaitTermination(1L, TimeUnit.SECONDS);
            sPrenativeThreadPoolExecutor = new ChromeThreadPoolExecutor();
        }
        synchronized (sPreNativeTaskRunnerLock) {
            try {
                List<TaskRunnerImpl> list = sPreNativeTaskRunners;
                if (list != null) {
                    Iterator<TaskRunnerImpl> it = list.iterator();
                    while (it.hasNext()) {
                        activeCount += it.next().clearTaskQueueForTesting();
                    }
                }
                sTestIterationForTesting++;
            } catch (Throwable th) {
                throw th;
            }
        }
        sPrenativeThreadPoolExecutorForTesting = null;
        if (activeCount > 0) {
            Log.w(TAG, "%d background task(s) existed after test finished.", Integer.valueOf(activeCount));
        }
    }

    public static TaskRunner getBackgroundBestEffortExecutor() {
        return sTraitsToRunnerMap[0];
    }

    public static TaskRunner getBackgroundBestEffortMayBlockExecutor() {
        return sTraitsToRunnerMap[1];
    }

    public static TaskRunner getBackgroundUserBlockingExecutor() {
        return sTraitsToRunnerMap[4];
    }

    public static TaskRunner getBackgroundUserBlockingMayBlockExecutor() {
        return sTraitsToRunnerMap[5];
    }

    public static TaskRunner getBackgroundUserVisibleExecutor() {
        return sTraitsToRunnerMap[2];
    }

    public static Executor getPrenativeThreadPoolExecutor() {
        return sPrenativeThreadPoolExecutorForTesting != null ? sPrenativeThreadPoolExecutorForTesting : sPrenativeThreadPoolExecutor;
    }

    public static Exception getTaskOrigin() {
        if (ENABLE_TASK_ORIGINS) {
            return sTaskOrigin.get();
        }
        return null;
    }

    public static TaskRunner getTaskRunner(int i) {
        return sTraitsToRunnerMap[i];
    }

    public static TaskRunner getUiBestEffortExecutor() {
        return sTraitsToRunnerMap[6];
    }

    public static TaskRunner getUiUserBlockingExecutor() {
        return sTraitsToRunnerMap[8];
    }

    public static TaskRunner getUiUserVisibleExecutor() {
        return sTraitsToRunnerMap[7];
    }

    private static boolean isUiTaskTraits(int i) {
        return i >= 6;
    }

    public static <T extends Throwable> T maybeAddTaskOrigin(T t) {
        Exception taskOrigin = getTaskOrigin();
        if (taskOrigin != null) {
            Throwable th = t;
            while (th.getCause() != null) {
                th = th.getCause();
            }
            try {
                th.initCause(taskOrigin);
            } catch (Exception unused) {
            }
        }
        return t;
    }

    @CalledByNative
    private static void onNativeSchedulerReady() {
        List<TaskRunnerImpl> list;
        if (sNativeInitialized) {
            return;
        }
        sNativeInitialized = true;
        synchronized (sPreNativeTaskRunnerLock) {
            list = sPreNativeTaskRunners;
            sPreNativeTaskRunners = null;
        }
        Iterator<TaskRunnerImpl> it = list.iterator();
        while (it.hasNext()) {
            it.next().initNativeTaskRunner();
        }
    }

    public static Runnable populateTaskOrigin(TaskOriginException taskOriginException, Runnable runnable) {
        return runnable instanceof TaskOriginRunnable ? runnable : new TaskOriginRunnable(taskOriginException, runnable);
    }

    public static void postDelayedTask(int i, Runnable runnable, long j) {
        sTraitsToRunnerMap[i].postDelayedTask(runnable, j);
    }

    public static void postTask(int i, Runnable runnable) {
        postDelayedTask(i, runnable, 0L);
    }

    public static boolean registerPreNativeTaskRunner(TaskRunnerImpl taskRunnerImpl) {
        synchronized (sPreNativeTaskRunnerLock) {
            try {
                List<TaskRunnerImpl> list = sPreNativeTaskRunners;
                if (list == null) {
                    return false;
                }
                list.add(taskRunnerImpl);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CalledByNative
    private static void resetTaskRunner() {
        for (int i = 0; i <= 5; i++) {
            sTraitsToRunnerMap[i] = new TaskRunnerImpl(i);
        }
        for (int i2 = 6; i2 <= 9; i2++) {
            sTraitsToRunnerMap[i2] = new UiThreadTaskRunnerImpl(i2);
        }
    }

    public static void runOrPostTask(int i, Runnable runnable) {
        if (canRunTaskImmediately(i)) {
            runnable.run();
        } else {
            postTask(i, runnable);
        }
    }

    public static <T> T runSynchronously(int i, Callable<T> callable) {
        return (T) runSynchronouslyInternal(i, new FutureTask(callable));
    }

    private static <T> T runSynchronouslyInternal(int i, FutureTask<T> futureTask) {
        runOrPostTask(i, ENABLE_TASK_ORIGINS ? populateTaskOrigin(null, futureTask) : futureTask);
        try {
            return futureTask.get();
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    }

    public static void setPrenativeThreadPoolExecutorForTesting(Executor executor) {
        sPrenativeThreadPoolExecutorForTesting = executor;
        ResettersForTesting.register(new s230(1));
    }

    public static void runSynchronously(int i, Runnable runnable) {
        runSynchronouslyInternal(i, new FutureTask(runnable, null));
    }

    public static void resetUiThreadForTesting() {
    }
}
