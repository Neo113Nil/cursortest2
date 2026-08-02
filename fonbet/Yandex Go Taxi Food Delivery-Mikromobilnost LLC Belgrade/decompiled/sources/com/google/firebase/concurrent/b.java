package com.google.firebase.concurrent;

import defpackage.cpl0;
import defpackage.cvw;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class b implements Executor {
    public static final Logger y = Logger.getLogger(b.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public SequentialExecutor$WorkerRunningState c = SequentialExecutor$WorkerRunningState.IDLE;
    public long w = 0;
    public final a x = new a(this);

    public b(Executor executor) {
        cvw.l(executor);
        this.a = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0064 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void execute(Runnable runnable) {
        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState;
        cvw.l(runnable);
        synchronized (this.b) {
            SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState2 = this.c;
            if (sequentialExecutor$WorkerRunningState2 != SequentialExecutor$WorkerRunningState.RUNNING && sequentialExecutor$WorkerRunningState2 != (sequentialExecutor$WorkerRunningState = SequentialExecutor$WorkerRunningState.QUEUED)) {
                long j = this.w;
                boolean z = true;
                cpl0 cpl0Var = new cpl0(1, runnable);
                this.b.add(cpl0Var);
                SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState3 = SequentialExecutor$WorkerRunningState.QUEUING;
                this.c = sequentialExecutor$WorkerRunningState3;
                try {
                    this.a.execute(this.x);
                    if (this.c != sequentialExecutor$WorkerRunningState3) {
                        return;
                    }
                    synchronized (this.b) {
                        try {
                            if (this.w == j && this.c == sequentialExecutor$WorkerRunningState3) {
                                this.c = sequentialExecutor$WorkerRunningState;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.b) {
                        try {
                            SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState4 = this.c;
                            if (sequentialExecutor$WorkerRunningState4 != SequentialExecutor$WorkerRunningState.IDLE) {
                                if (sequentialExecutor$WorkerRunningState4 == SequentialExecutor$WorkerRunningState.QUEUING) {
                                }
                                z = false;
                                if ((e instanceof RejectedExecutionException) || z) {
                                    throw e;
                                }
                                return;
                            }
                            if (this.b.removeLastOccurrence(cpl0Var)) {
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
            this.b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
