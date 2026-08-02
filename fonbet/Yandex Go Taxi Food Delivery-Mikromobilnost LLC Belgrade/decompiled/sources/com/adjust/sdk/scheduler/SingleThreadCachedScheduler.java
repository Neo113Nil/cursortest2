package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class SingleThreadCachedScheduler implements ThreadScheduler {
    private ThreadPoolExecutor threadPoolExecutor;
    private final List<Runnable> queue = new ArrayList();
    private boolean isThreadProcessing = false;
    private boolean isTeardown = false;

    public class a implements RejectedExecutionHandler {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), this.a);
        }
    }

    /* loaded from: classes10.dex */
    public class b implements Runnable {
        public final /* synthetic */ long a;
        public final /* synthetic */ Runnable b;

        public b(long j, Runnable runnable) {
            this.a = j;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.sleep(this.a);
            } catch (InterruptedException e) {
                AdjustFactory.getLogger().warn("Sleep delay exception: %s", e.getMessage());
            }
            SingleThreadCachedScheduler.this.submit(this.b);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Runnable a;

        public c(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SingleThreadCachedScheduler singleThreadCachedScheduler = SingleThreadCachedScheduler.this;
            Runnable runnable = this.a;
            while (true) {
                singleThreadCachedScheduler.tryExecuteRunnable(runnable);
                synchronized (SingleThreadCachedScheduler.this.queue) {
                    try {
                        if (SingleThreadCachedScheduler.this.isTeardown) {
                            break;
                        }
                        boolean isEmpty = SingleThreadCachedScheduler.this.queue.isEmpty();
                        SingleThreadCachedScheduler singleThreadCachedScheduler2 = SingleThreadCachedScheduler.this;
                        if (isEmpty) {
                            singleThreadCachedScheduler2.isThreadProcessing = false;
                            break;
                        } else {
                            runnable = (Runnable) singleThreadCachedScheduler2.queue.get(0);
                            SingleThreadCachedScheduler.this.queue.remove(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                singleThreadCachedScheduler = SingleThreadCachedScheduler.this;
            }
        }
    }

    public SingleThreadCachedScheduler(String str) {
        this.threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryWrapper(str), new a(str));
    }

    private void processQueue(Runnable runnable) {
        this.threadPoolExecutor.submit(new c(runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryExecuteRunnable(Runnable runnable) {
        try {
            if (this.isTeardown) {
                return;
            }
            runnable.run();
        } catch (Throwable th) {
            AdjustFactory.getLogger().warn("Execution failed: %s", th.getMessage());
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadScheduler
    public void schedule(Runnable runnable, long j) {
        synchronized (this.queue) {
            try {
                if (!this.isTeardown) {
                    this.threadPoolExecutor.submit(new b(j, runnable));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void submit(Runnable runnable) {
        synchronized (this.queue) {
            try {
                if (!this.isTeardown) {
                    if (this.isThreadProcessing) {
                        this.queue.add(runnable);
                    } else {
                        this.isThreadProcessing = true;
                        processQueue(runnable);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void teardown() {
        synchronized (this.queue) {
            this.isTeardown = true;
            this.queue.clear();
            this.threadPoolExecutor.shutdown();
        }
    }
}
