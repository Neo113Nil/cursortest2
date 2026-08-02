package xsna;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: QueueExecutorFactory.kt */
/* loaded from: classes.dex */
public final class hre0 implements izs<String, ExecutorService> {

    /* compiled from: QueueExecutorFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a extends LinkedTransferQueue<Runnable> {
        @Override // java.util.concurrent.LinkedTransferQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof Runnable) {
                return super.contains((Runnable) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.LinkedTransferQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public final boolean offer(Object obj) {
            return tryTransfer((Runnable) obj);
        }

        @Override // java.util.concurrent.LinkedTransferQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof Runnable) {
                return super.remove((Runnable) obj);
            }
            return false;
        }
    }

    /* compiled from: QueueExecutorFactory.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ThreadFactory {
        public final String b;
        public final AtomicInteger c = new AtomicInteger();

        public b(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            String str = this.b;
            Thread thread = new Thread(new ThreadGroup(str), runnable, "im-tasks-pool-" + str + '-' + this.c.getAndIncrement());
            thread.setUncaughtExceptionHandler(new ire0());
            return thread;
        }
    }

    public static ThreadPoolExecutor a(String str) {
        if (str != null) {
            return brm0.B(str, "im-attach-download", false) ? c(2, str) : str.equals("im-attach-prefetch-upload") ? c(4, str) : c(1, str);
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() * 4;
        if (availableProcessors > 16) {
            availableProcessors = 16;
        }
        return c(availableProcessors, "cached");
    }

    public static ThreadPoolExecutor c(int i, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, i, 10L, TimeUnit.SECONDS, new a(), new b(str));
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: xsna.gre0
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                try {
                    threadPoolExecutor2.getQueue().put(runnable);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("Illegal pool state interruption in QueueExecutorFactory", e));
                }
            }
        });
        return threadPoolExecutor;
    }

    @Override // xsna.izs
    public final /* bridge */ /* synthetic */ ExecutorService invoke(String str) {
        return a(str);
    }
}
