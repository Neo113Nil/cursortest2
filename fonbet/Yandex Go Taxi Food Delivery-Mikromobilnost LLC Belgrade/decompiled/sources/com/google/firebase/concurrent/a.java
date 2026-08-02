package com.google.firebase.concurrent;

/* loaded from: classes.dex */
public final class a implements Runnable {
    public Runnable a;
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r9.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        r9.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        com.google.firebase.concurrent.b.y.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.a, (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (this.b.b) {
                    if (!z) {
                        b bVar = this.b;
                        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState = bVar.c;
                        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState2 = SequentialExecutor$WorkerRunningState.RUNNING;
                        if (sequentialExecutor$WorkerRunningState != sequentialExecutor$WorkerRunningState2) {
                            bVar.w++;
                            bVar.c = sequentialExecutor$WorkerRunningState2;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) this.b.b.poll();
                    this.a = runnable;
                    if (runnable == null) {
                        this.b.c = SequentialExecutor$WorkerRunningState.IDLE;
                    }
                }
                if (!z2) {
                    return;
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Error e) {
            synchronized (this.b.b) {
                this.b.c = SequentialExecutor$WorkerRunningState.IDLE;
                throw e;
            }
        }
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            return "SequentialExecutorWorker{running=" + runnable + "}";
        }
        return "SequentialExecutorWorker{state=" + this.b.c + "}";
    }
}
