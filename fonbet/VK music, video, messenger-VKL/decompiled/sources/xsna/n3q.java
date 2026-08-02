package xsna;

import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;

/* compiled from: ExecutorServiceWatchdog.kt */
/* loaded from: classes17.dex */
public class n3q implements ExecutorService, AutoCloseable {
    public static final g8 l = new g8(22);
    public final pep0 b;
    public final b c;
    public final cj4 d;
    public final g7o0 e;
    public final boolean f;
    public volatile boolean g;
    public final AtomicLong h;
    public final ConcurrentHashMap<Long, adx0> i;
    public final ReentrantLock j;
    public final Condition k;

    /* compiled from: ExecutorServiceWatchdog.kt */
    public final class a {
        public final long a;
        public final AtomicBoolean b = new AtomicBoolean(true);
        public long c;

        public a(long j) {
            this.a = j;
            this.c = n3q.n(n3q.this.q(), j);
        }

        public final void a() {
            n3q n3qVar = n3q.this;
            pep0 pep0Var = n3qVar.b;
            if (pep0Var.isTerminated() || pep0Var.isShutdown()) {
                return;
            }
            if (this.b.compareAndSet(true, false)) {
                this.c = n3q.n(n3qVar.q(), this.a);
                try {
                    n3qVar.submit(new she(this, 1));
                } catch (RejectedExecutionException unused) {
                }
            } else if (n3qVar.q() > this.c) {
                this.c = Long.MAX_VALUE;
                List r = n3q.r(n3qVar.i);
                if (r.isEmpty()) {
                    L.e("No active tasks for stuck report");
                } else {
                    n3qVar.c.a(r);
                }
            }
        }
    }

    /* compiled from: ExecutorServiceWatchdog.kt */
    public static final class c<T, V> implements Callable<T> {
        public final Callable<T> b;
        public final v43 c;
        public final qcl d;

        public c(Callable callable, v43 v43Var, qcl qclVar) {
            this.b = callable;
            this.c = v43Var;
            this.d = qclVar;
        }

        @Override // java.util.concurrent.Callable
        public final T call() {
            Object invoke = this.c.invoke();
            T call = this.b.call();
            this.d.invoke(invoke);
            return call;
        }
    }

    /* compiled from: ExecutorServiceWatchdog.kt */
    public static final class d<V> implements Runnable {
        public final Runnable b;
        public final com.vk.movika.sdk.android.defaultplayer.container.e c;
        public final fgh d;

        public d(Runnable runnable, com.vk.movika.sdk.android.defaultplayer.container.e eVar, fgh fghVar) {
            this.b = runnable;
            this.c = eVar;
            this.d = fghVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object invoke = this.c.invoke();
            this.b.run();
            this.d.invoke(invoke);
        }
    }

    public n3q() {
        throw null;
    }

    public n3q(pep0 pep0Var, b bVar, g7o0 g7o0Var, boolean z, int i) {
        cj4 cj4Var = new cj4(21);
        g7o0Var = (i & 16) != 0 ? null : g7o0Var;
        z = (i & 32) != 0 ? true : z;
        this.b = pep0Var;
        this.c = bVar;
        this.d = cj4Var;
        this.e = g7o0Var;
        this.f = z;
        this.h = new AtomicLong(0L);
        this.i = new ConcurrentHashMap<>();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.j = reentrantLock;
        this.k = reentrantLock.newCondition();
        l.invoke(new ja6(this, 5));
    }

    public static long n(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static List r(ConcurrentHashMap concurrentHashMap) {
        Collection values = concurrentHashMap.values();
        int size = concurrentHashMap.size();
        if (size == 0) {
            return EmptyList.b;
        }
        if (size != 1) {
            return new ArrayList(values);
        }
        Iterator it = values.iterator();
        return it.hasNext() ? Collections.singletonList(it.next()) : EmptyList.b;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        pep0 pep0Var;
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = (pep0Var = this.b).isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = pep0Var.awaitTermination(1L, TimeUnit.DAYS);
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
        this.b.execute(v(runnable, m()));
    }

    public final void h(long j) {
        ReentrantLock reentrantLock = this.j;
        reentrantLock.lock();
        try {
            this.i.remove(Long.valueOf(j));
            this.k.signal();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        Collection<? extends Callable<T>> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(s((Callable) it.next(), m()));
        }
        return this.b.invokeAll(arrayList);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        Collection<? extends Callable<T>> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(s((Callable) it.next(), m()));
        }
        return (T) this.b.invokeAny(arrayList);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    public final adx0 m() {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        long q = q();
        return new adx0(name, q, q, null, this.f ? rl3.u0(currentThread.getStackTrace()) : EmptyList.b);
    }

    public final void o() {
        this.g = true;
        ReentrantLock reentrantLock = this.j;
        reentrantLock.lock();
        try {
            this.k.signal();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long p(adx0 adx0Var) {
        g7o0 g7o0Var;
        String str;
        ConcurrentHashMap<Long, adx0> concurrentHashMap = this.i;
        long andIncrement = this.h.getAndIncrement();
        ReentrantLock reentrantLock = this.j;
        reentrantLock.lock();
        try {
            concurrentHashMap.put(Long.valueOf(andIncrement), adx0.a(adx0Var, q(), Thread.currentThread(), 19));
            adx0 adx0Var2 = concurrentHashMap.get(Long.valueOf(andIncrement));
            adx0 a2 = adx0Var2 != null ? adx0.a(adx0Var2, 0L, null, 31) : null;
            if (a2 != null && (g7o0Var = this.e) != null) {
                Thread thread = a2.d;
                if (thread == null || (str = thread.getName()) == null) {
                    str = "";
                }
                long j = a2.c - a2.b;
                if (g7o0Var.a) {
                    int U = rl3.U(erm0.D0(15, str), g7o0Var.b);
                    if (U >= 0) {
                        g7o0Var.c[U].add(Long.valueOf(j));
                    }
                }
            }
            return andIncrement;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long q() {
        return ((Number) this.d.invoke()).longValue();
    }

    public final <V> c<V, Long> s(Callable<V> callable, adx0 adx0Var) {
        return new c<>(callable, new v43(11, this, adx0Var), new qcl(this, 5));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.b.shutdown();
        o();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        List<Runnable> shutdownNow = this.b.shutdownNow();
        ArrayList arrayList = new ArrayList();
        for (Runnable runnable : shutdownNow) {
            if (runnable instanceof d) {
                runnable = ((d) runnable).b;
            }
            arrayList.add(runnable);
        }
        o();
        return arrayList;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.b.submit(s(callable, m()));
    }

    public final d<Long> v(Runnable runnable, adx0 adx0Var) {
        return new d<>(runnable, new com.vk.movika.sdk.android.defaultplayer.container.e(10, this, adx0Var), new fgh(this, 12));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.b.submit(v(runnable, m()), t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.b.submit(v(runnable, m()));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        Collection<? extends Callable<T>> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(s((Callable) it.next(), m()));
        }
        return this.b.invokeAll(arrayList, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        Collection<? extends Callable<T>> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(s((Callable) it.next(), m()));
        }
        return (T) this.b.invokeAny(arrayList, j, timeUnit);
    }

    /* compiled from: ExecutorServiceWatchdog.kt */
    public interface b {
        long b();

        long c();

        default void a(Collection<adx0> collection) {
        }

        default void d(ArrayList arrayList) {
        }
    }
}
