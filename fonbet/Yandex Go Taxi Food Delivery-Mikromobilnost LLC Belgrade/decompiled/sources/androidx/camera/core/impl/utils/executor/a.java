package androidx.camera.core.impl.utils.executor;

/* loaded from: classes10.dex */
public final class a implements Runnable {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r3.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        defpackage.sgb1.e("SequentialExecutor", "Exception while executing runnable " + r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r1 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
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
                synchronized (this.a.a) {
                    if (!z) {
                        b bVar = this.a;
                        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState = bVar.w;
                        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState2 = SequentialExecutor$WorkerRunningState.RUNNING;
                        if (sequentialExecutor$WorkerRunningState != sequentialExecutor$WorkerRunningState2) {
                            bVar.x++;
                            bVar.w = sequentialExecutor$WorkerRunningState2;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) this.a.a.poll();
                    if (runnable == null) {
                        this.a.w = SequentialExecutor$WorkerRunningState.IDLE;
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
            synchronized (this.a.a) {
                this.a.w = SequentialExecutor$WorkerRunningState.IDLE;
                throw e;
            }
        }
    }
}
