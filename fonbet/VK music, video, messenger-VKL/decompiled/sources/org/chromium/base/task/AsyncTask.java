package org.chromium.base.task;

import android.os.Binder;
import android.os.Process;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.Log;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.metrics.RecordHistogram;
import org.chromium.base.task.AsyncTask;
import xsna.fw3;
import xsna.kz3;
import xsna.n30;
import xsna.si0;

/* loaded from: classes8.dex */
public abstract class AsyncTask<Result> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String GET_STATUS_UMA_HISTOGRAM = "Android.Jank.AsyncTaskGetOnUiThreadStatus";
    private static final String TAG = "AsyncTask";
    private final AsyncTask<Result>.NamedFutureTask mFuture;
    private final Callable<Result> mWorker;
    public static final Executor THREAD_POOL_EXECUTOR = new kz3();
    public static final Executor SERIAL_EXECUTOR = new SerialExecutor();
    private static final StealRunnableHandler STEAL_RUNNABLE_HANDLER = new StealRunnableHandler(0);
    private volatile int mStatus = 0;
    private final AtomicBoolean mCancelled = new AtomicBoolean();
    private final AtomicBoolean mTaskInvoked = new AtomicBoolean();
    private final int mIterationIdForTesting = PostTask.sTestIterationForTesting;

    public class NamedFutureTask extends FutureTask<Result> {
        public NamedFutureTask(Callable<Result> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                AsyncTask.this.postResultIfNotInvoked(get());
            } catch (InterruptedException e) {
                Log.w(AsyncTask.TAG, e.toString());
            } catch (CancellationException unused) {
                AsyncTask.this.postResultIfNotInvoked(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            }
        }

        public Class getBlamedClass() {
            return AsyncTask.this.getClass();
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            try {
                TraceEvent scoped = TraceEvent.scoped("AsyncTask.run: ".concat(AsyncTask.this.mFuture.getBlamedClass().getName()));
                try {
                    super.run();
                    if (scoped != null) {
                        scoped.close();
                    }
                } finally {
                }
            } finally {
                Thread.interrupted();
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
        public static final int FINISHED = 2;
        public static final int NUM_ENTRIES = 3;
        public static final int PENDING = 0;
        public static final int RUNNING = 1;
    }

    public static class StealRunnableHandler implements RejectedExecutionHandler {
        public /* synthetic */ StealRunnableHandler(int i) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$rejectedExecution$0(Runnable runnable) {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            try {
                runnable.run();
            } finally {
                Process.setThreadPriority(Process.myTid(), threadPriority);
            }
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(final Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: org.chromium.base.task.a
                @Override // java.lang.Runnable
                public final void run() {
                    AsyncTask.StealRunnableHandler.lambda$rejectedExecution$0(runnable);
                }
            });
        }

        private StealRunnableHandler() {
        }
    }

    public AsyncTask() {
        n30 n30Var = new n30(this, 1);
        this.mWorker = n30Var;
        this.mFuture = new NamedFutureTask(n30Var);
    }

    private void executionPreamble() {
        if (this.mStatus != 0) {
            int i = this.mStatus;
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.mStatus = 1;
        onPreExecute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void lambda$postResult$2(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.mStatus = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$1() throws Exception {
        Result result;
        this.mTaskInvoked.set(true);
        try {
            result = doInBackground();
            try {
                Binder.flushPendingCommands();
                return result;
            } catch (Throwable th) {
                th = th;
                try {
                    this.mCancelled.set(true);
                    throw th;
                } finally {
                    postResult(result);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            result = null;
        }
    }

    private void postResult(Result result) {
        if (this instanceof BackgroundOnlyAsyncTask) {
            this.mStatus = 2;
        } else if (this.mIterationIdForTesting == PostTask.sTestIterationForTesting) {
            ThreadUtils.postOnUiThread(new si0(1, this, result));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postResultIfNotInvoked(Result result) {
        if (this.mTaskInvoked.get()) {
            return;
        }
        postResult(result);
    }

    public static void takeOverAndroidThreadPool() {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        if (threadPoolExecutor.isShutdown()) {
            return;
        }
        threadPoolExecutor.setRejectedExecutionHandler(STEAL_RUNNABLE_HANDLER);
        threadPoolExecutor.shutdown();
    }

    public final boolean cancel(boolean z) {
        this.mCancelled.set(true);
        return this.mFuture.cancel(z);
    }

    public abstract Result doInBackground();

    public final AsyncTask<Result> executeOnExecutor(Executor executor) {
        executionPreamble();
        executor.execute(this.mFuture);
        return this;
    }

    public final AsyncTask<Result> executeOnTaskRunner(TaskRunner taskRunner) {
        executionPreamble();
        taskRunner.execute(this.mFuture);
        return this;
    }

    public final AsyncTask<Result> executeWithTaskTraits(int i) {
        executionPreamble();
        PostTask.postTask(i, this.mFuture);
        return this;
    }

    public final Result get() throws InterruptedException, ExecutionException {
        int umaStatus = getUmaStatus();
        if (umaStatus == 2 || !ThreadUtils.runningOnUiThread()) {
            return this.mFuture.get();
        }
        RecordHistogram.recordEnumeratedHistogram(GET_STATUS_UMA_HISTOGRAM, umaStatus, 3);
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        TraceEvent scoped = TraceEvent.scoped((stackTrace.length > 1 ? fw3.c(stackTrace[1].getClassName(), ".", stackTrace[1].getMethodName(), ".") : "") + "AsyncTask.get");
        try {
            Result result = this.mFuture.get();
            if (scoped != null) {
                scoped.close();
            }
            return result;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final int getStatus() {
        return this.mStatus;
    }

    public final int getUmaStatus() {
        if (this.mStatus != 1 || this.mTaskInvoked.get()) {
            return this.mStatus;
        }
        return 0;
    }

    public final boolean isCancelled() {
        return this.mCancelled.get();
    }

    public void onCancelled() {
    }

    public abstract void onPostExecute(Result result);

    public void onCancelled(Result result) {
        onCancelled();
    }

    public void onPreExecute() {
    }

    public final Result get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        String str;
        int umaStatus = getUmaStatus();
        if (umaStatus != 2 && ThreadUtils.runningOnUiThread()) {
            RecordHistogram.recordEnumeratedHistogram(GET_STATUS_UMA_HISTOGRAM, umaStatus, 3);
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                str = fw3.c(stackTrace[1].getClassName(), ".", stackTrace[1].getMethodName(), ".");
            } else {
                str = "";
            }
            TraceEvent scoped = TraceEvent.scoped(str + "AsyncTask.get");
            try {
                Result result = this.mFuture.get(j, timeUnit);
                if (scoped != null) {
                    scoped.close();
                }
                return result;
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return this.mFuture.get(j, timeUnit);
    }
}
