package org.chromium.net.urlconnection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.chromium.base.metrics.ScopedSysTraceEvent;

/* loaded from: classes8.dex */
class MessageLoop implements Executor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long INVALID_THREAD_ID = -1;
    private boolean mLoopFailed;
    private boolean mLoopRunning;
    private InterruptedIOException mPriorInterruptedIOException;
    private RuntimeException mPriorRuntimeException;
    private long mThreadId = -1;
    private final BlockingQueue<Runnable> mQueue = new LinkedBlockingQueue();

    private boolean calledOnValidThread() {
        long j = this.mThreadId;
        if (j != -1) {
            return j == Thread.currentThread().getId();
        }
        this.mThreadId = Thread.currentThread().getId();
        return true;
    }

    private Runnable take(boolean z, long j) throws InterruptedIOException {
        try {
            Runnable take = !z ? this.mQueue.take() : this.mQueue.poll(j, TimeUnit.NANOSECONDS);
            if (take != null) {
                return take;
            }
            throw new SocketTimeoutException();
        } catch (InterruptedException e) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) throws RejectedExecutionException {
        if (runnable == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.mQueue.put(runnable);
        } catch (InterruptedException e) {
            throw new RejectedExecutionException(e);
        }
    }

    public boolean hasLoopFailed() {
        return this.mLoopFailed;
    }

    public boolean isRunning() {
        return this.mLoopRunning;
    }

    public void loop() throws IOException {
        loop(0);
    }

    public void quit() {
        this.mLoopRunning = false;
    }

    public void loop(int i) throws IOException {
        Runnable take;
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("Cronet MessageLoop#loop");
        try {
            long nanoTime = System.nanoTime();
            long convert = TimeUnit.NANOSECONDS.convert(i, TimeUnit.MILLISECONDS);
            if (this.mLoopFailed) {
                InterruptedIOException interruptedIOException = this.mPriorInterruptedIOException;
                if (interruptedIOException == null) {
                    throw this.mPriorRuntimeException;
                }
                throw interruptedIOException;
            }
            if (this.mLoopRunning) {
                throw new IllegalStateException("Cannot run loop when it is already running.");
            }
            this.mLoopRunning = true;
            while (this.mLoopRunning) {
                if (i == 0) {
                    try {
                        take = take(false, 0L);
                    } catch (InterruptedIOException e) {
                        this.mLoopRunning = false;
                        this.mLoopFailed = true;
                        this.mPriorInterruptedIOException = e;
                        throw e;
                    } catch (RuntimeException e2) {
                        this.mLoopRunning = false;
                        this.mLoopFailed = true;
                        this.mPriorRuntimeException = e2;
                        throw e2;
                    }
                } else {
                    take = take(true, (convert - System.nanoTime()) + nanoTime);
                }
                ScopedSysTraceEvent scoped2 = ScopedSysTraceEvent.scoped("Cronet MessageLoop#loop running task");
                try {
                    take.run();
                    if (scoped2 != null) {
                        scoped2.close();
                    }
                } catch (Throwable th) {
                    if (scoped2 != null) {
                        try {
                            scoped2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th3) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
