package androidx.camera.core.impl.utils.executor;

import defpackage.h30;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes10.dex */
public final class b implements Executor {
    public final Executor b;
    public final ArrayDeque a = new ArrayDeque();
    public final a c = new a(this);
    public SequentialExecutor$WorkerRunningState w = SequentialExecutor$WorkerRunningState.IDLE;
    public long x = 0;

    public b(Executor executor) {
        executor.getClass();
        this.b = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0064 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void execute(Runnable runnable) {
        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState;
        runnable.getClass();
        synchronized (this.a) {
            SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState2 = this.w;
            if (sequentialExecutor$WorkerRunningState2 != SequentialExecutor$WorkerRunningState.RUNNING && sequentialExecutor$WorkerRunningState2 != (sequentialExecutor$WorkerRunningState = SequentialExecutor$WorkerRunningState.QUEUED)) {
                long j = this.x;
                boolean z = true;
                h30 h30Var = new h30(1, runnable);
                this.a.add(h30Var);
                SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState3 = SequentialExecutor$WorkerRunningState.QUEUING;
                this.w = sequentialExecutor$WorkerRunningState3;
                try {
                    this.b.execute(this.c);
                    if (this.w != sequentialExecutor$WorkerRunningState3) {
                        return;
                    }
                    synchronized (this.a) {
                        try {
                            if (this.x == j && this.w == sequentialExecutor$WorkerRunningState3) {
                                this.w = sequentialExecutor$WorkerRunningState;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.a) {
                        try {
                            SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState4 = this.w;
                            if (sequentialExecutor$WorkerRunningState4 != SequentialExecutor$WorkerRunningState.IDLE) {
                                if (sequentialExecutor$WorkerRunningState4 == SequentialExecutor$WorkerRunningState.QUEUING) {
                                }
                                z = false;
                                if ((e instanceof RejectedExecutionException) || z) {
                                    throw e;
                                }
                                return;
                            }
                            if (this.a.removeLastOccurrence(h30Var)) {
                                if (e instanceof RejectedExecutionException) {
                                }
                                throw e;
                            }
                            z = false;
                            if (e instanceof RejectedExecutionException) {
                            }
                            throw e;
                        } finally {
                        }
                    }
                }
            }
            this.a.add(runnable);
        }
    }
}
