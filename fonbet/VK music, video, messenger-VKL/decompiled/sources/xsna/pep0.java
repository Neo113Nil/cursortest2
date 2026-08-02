package xsna;

import android.os.Trace;
import com.vk.metrics.tracing.ConsumedRejectedExecutionException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: TracingExecutors.kt */
/* loaded from: classes.dex */
public class pep0 implements ExecutorService, AutoCloseable {
    public final ExecutorService b;

    public pep0(ExecutorService executorService) {
        this.b = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return m().awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            m().execute(prw.e(runnable));
        } catch (RejectedExecutionException e) {
            if (!m().isShutdown() && !m().isTerminated()) {
                throw e;
            }
            throw new ConsumedRejectedExecutionException(e.getMessage(), e.getCause());
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        ArrayList arrayList;
        try {
            ExecutorService m = m();
            if (collection != null) {
                Collection<? extends Callable<T>> collection2 = collection;
                arrayList = new ArrayList(c5g.u(collection2, 10));
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    arrayList.add(prw.f((Callable) it.next()));
                }
            } else {
                arrayList = null;
            }
            return m.invokeAll(arrayList);
        } catch (RejectedExecutionException e) {
            if (m().isShutdown() || m().isTerminated()) {
                throw new ConsumedRejectedExecutionException(e.getMessage(), e.getCause());
            }
            throw e;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        ArrayList arrayList;
        try {
            ExecutorService m = m();
            if (collection != null) {
                Collection<? extends Callable<T>> collection2 = collection;
                arrayList = new ArrayList(c5g.u(collection2, 10));
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    arrayList.add(prw.f((Callable) it.next()));
                }
            } else {
                arrayList = null;
            }
            return (T) m.invokeAny(arrayList);
        } catch (RejectedExecutionException e) {
            if (m().isShutdown() || m().isTerminated()) {
                throw new ConsumedRejectedExecutionException(e.getMessage(), e.getCause());
            }
            throw e;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return m().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return m().isTerminated();
    }

    public ExecutorService m() {
        return this.b;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        Trace.beginSection(ndp0.f("ExecutorServiceshutdown"));
        try {
            m().shutdown();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        Trace.beginSection(ndp0.f("ExecutorServiceshutdownNow"));
        try {
            return m().shutdownNow();
        } finally {
            Trace.endSection();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        try {
            return m().submit(prw.f(callable));
        } catch (RejectedExecutionException e) {
            if (m().isShutdown() || m().isTerminated()) {
                throw new ConsumedRejectedExecutionException(e.getMessage(), e.getCause());
            }
            throw e;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        try {
            return m().submit(prw.e(runnable));
        } catch (RejectedExecutionException e) {
            if (!m().isShutdown() && !m().isTerminated()) {
                throw e;
            }
            throw new ConsumedRejectedExecutionException(e.getMessage(), e.getCause());
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        try {
            return m().submit(prw.e(runnable), t);
        } catch (RejectedExecutionException e) {
            if (!m().isShutdown() && !m().isTerminated()) {
                throw e;
            }
            throw new ConsumedRejectedExecutionException(e.getMessage(), e.getCause());
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        ArrayList arrayList;
        try {
            ExecutorService m = m();
            if (collection != null) {
                Collection<? extends Callable<T>> collection2 = collection;
                arrayList = new ArrayList(c5g.u(collection2, 10));
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    arrayList.add(prw.f((Callable) it.next()));
                }
            } else {
                arrayList = null;
            }
            return m.invokeAll(arrayList, j, timeUnit);
        } catch (RejectedExecutionException e) {
            if (!m().isShutdown() && !m().isTerminated()) {
                throw e;
            }
            throw new ConsumedRejectedExecutionException(e.getMessage(), e.getCause());
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        ArrayList arrayList;
        try {
            ExecutorService m = m();
            if (collection != null) {
                Collection<? extends Callable<T>> collection2 = collection;
                arrayList = new ArrayList(c5g.u(collection2, 10));
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    arrayList.add(prw.f((Callable) it.next()));
                }
            } else {
                arrayList = null;
            }
            return (T) m.invokeAny(arrayList, j, timeUnit);
        } catch (RejectedExecutionException e) {
            if (!m().isShutdown() && !m().isTerminated()) {
                throw e;
            }
            throw new ConsumedRejectedExecutionException(e.getMessage(), e.getCause());
        }
    }
}
