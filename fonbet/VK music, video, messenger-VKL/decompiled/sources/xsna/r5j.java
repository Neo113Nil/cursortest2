package xsna;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ConstrainedExecutorService.java */
/* loaded from: classes.dex */
public class r5j extends AbstractExecutorService implements AutoCloseable {
    public static final /* synthetic */ int i = 0;
    public final Executor c;
    public final LinkedBlockingQueue e;
    public final String b = "SerialExecutor";
    public volatile int d = 1;
    public final a f = new a();
    public final AtomicInteger g = new AtomicInteger(0);
    public final AtomicInteger h = new AtomicInteger(0);

    /* compiled from: ConstrainedExecutorService.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            r5j r5jVar = r5j.this;
            AtomicInteger atomicInteger = r5jVar.g;
            String str = r5jVar.b;
            LinkedBlockingQueue linkedBlockingQueue = r5jVar.e;
            try {
                Runnable runnable = (Runnable) linkedBlockingQueue.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    int i = r5j.i;
                    ahq.f(r5j.class, str, "%s: Worker has nothing to run");
                }
                int decrementAndGet = atomicInteger.decrementAndGet();
                if (!linkedBlockingQueue.isEmpty()) {
                    r5jVar.m();
                } else {
                    int i2 = r5j.i;
                    ahq.g(r5j.class, "%s: worker finished; %d workers left", str, Integer.valueOf(decrementAndGet));
                }
            } catch (Throwable th) {
                int decrementAndGet2 = atomicInteger.decrementAndGet();
                if (linkedBlockingQueue.isEmpty()) {
                    int i3 = r5j.i;
                    ahq.g(r5j.class, "%s: worker finished; %d workers left", str, Integer.valueOf(decrementAndGet2));
                } else {
                    r5jVar.m();
                }
                throw th;
            }
        }
    }

    public r5j(Executor executor, LinkedBlockingQueue linkedBlockingQueue) {
        this.c = executor;
        this.e = linkedBlockingQueue;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        LinkedBlockingQueue linkedBlockingQueue = this.e;
        boolean offer = linkedBlockingQueue.offer(runnable);
        String str = this.b;
        if (!offer) {
            StringBuilder b = ho8.b(str, " queue is full, size=");
            b.append(linkedBlockingQueue.size());
            throw new RejectedExecutionException(b.toString());
        }
        int size = linkedBlockingQueue.size();
        AtomicInteger atomicInteger = this.h;
        int i2 = atomicInteger.get();
        if (size > i2 && atomicInteger.compareAndSet(i2, size)) {
            ahq.g(r5j.class, "%s: max pending work in queue = %d", str, Integer.valueOf(size));
        }
        m();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    public final void m() {
        int i2 = this.g.get();
        while (i2 < this.d) {
            int i3 = i2 + 1;
            if (this.g.compareAndSet(i2, i3)) {
                ahq.h(r5j.class, "%s: starting worker %d of %d", this.b, Integer.valueOf(i3), Integer.valueOf(this.d));
                this.c.execute(this.f);
                return;
            } else {
                ahq.f(r5j.class, this.b, "%s: race in startWorkerIfNeeded; retrying");
                i2 = this.g.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
