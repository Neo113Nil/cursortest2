package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class agg implements wfg {
    public final ExecutorService a;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public final AtomicBoolean c = new AtomicBoolean(false);

    public agg(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // defpackage.wfg
    public final void a(wt7 wt7Var) {
        this.b.add(wt7Var);
        this.a.execute(new zfg(this, 0));
    }

    public final void b() {
        ExecutorService executorService = this.a;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                atomicBoolean.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    executorService.execute(new zfg(this, 1));
                }
            }
        }
    }
}
