package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import xsna.snw;
import xsna.ub9;

/* compiled from: HandlerScheduledExecutorService.java */
/* loaded from: classes11.dex */
public final class mtu extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {
    public final Handler b;

    /* compiled from: HandlerScheduledExecutorService.java */
    public class a extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        public final ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return xo9.t();
            }
            if (Looper.myLooper() != null) {
                return new mtu(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* compiled from: HandlerScheduledExecutorService.java */
    public class b implements Callable<Void> {
        public final /* synthetic */ Runnable b;

        public b(Runnable runnable) {
            this.b = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            this.b.run();
            return null;
        }
    }

    static {
        new a();
    }

    public mtu(@NonNull Handler handler) {
        this.b = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(mtu.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
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
    public final void execute(@NonNull Runnable runnable) {
        Handler handler = this.b;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        return schedule(new b(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NonNull
    public final ScheduledFuture<?> scheduleAtFixedRate(@NonNull Runnable runnable, long j, long j2, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(mtu.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NonNull
    public final ScheduledFuture<?> scheduleWithFixedDelay(@NonNull Runnable runnable, long j, long j2, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(mtu.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(mtu.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(mtu.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    /* compiled from: HandlerScheduledExecutorService.java */
    public static class c<V> implements RunnableScheduledFuture<V> {
        public final AtomicReference<ub9.a<V>> b = new AtomicReference<>(null);
        public final long c;
        public final Callable<V> d;
        public final ub9.d e;

        /* compiled from: HandlerScheduledExecutorService.java */
        public class a implements ub9.c<V> {
            public final /* synthetic */ Handler b;
            public final /* synthetic */ Callable c;

            /* compiled from: HandlerScheduledExecutorService.java */
            /* renamed from: xsna.mtu$c$a$a, reason: collision with other inner class name */
            public class RunnableC3370a implements Runnable {
                public RunnableC3370a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    if (c.this.b.getAndSet(null) != null) {
                        aVar.b.removeCallbacks(c.this);
                    }
                }
            }

            public a(Handler handler, Callable callable) {
                this.b = handler;
                this.c = callable;
            }

            @Override // xsna.ub9.c
            public final Object attachCompleter(@NonNull ub9.a<V> aVar) throws RejectedExecutionException {
                aVar.a(new RunnableC3370a(), xo9.g());
                c.this.b.set(aVar);
                return "HandlerScheduledFuture-" + this.c.toString();
            }
        }

        public c(Handler handler, long j, Callable<V> callable) {
            this.c = j;
            this.d = callable;
            this.e = ub9.a(new a(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return this.e.cancel(z);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) this.e.c.get();
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.c - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.e.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.e.c.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public final boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
            ub9.a andSet = this.b.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.b(this.d.call());
                } catch (Exception e) {
                    andSet.d(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public final V get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) this.e.c.get(j, timeUnit);
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NonNull
    public final <V> ScheduledFuture<V> schedule(@NonNull Callable<V> callable, long j, @NonNull TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.b;
        c cVar = new c(handler, convert, callable);
        if (handler.postAtTime(cVar, convert)) {
            return cVar;
        }
        return new snw.b(new RejectedExecutionException(handler + " is shutting down"));
    }
}
