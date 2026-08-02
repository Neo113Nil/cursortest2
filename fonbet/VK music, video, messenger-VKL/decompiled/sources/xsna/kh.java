package xsna;

import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractResolvableFuture.java */
/* loaded from: classes.dex */
public abstract class kh<V> implements ugz<V> {
    public static final boolean e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", CredentialEntry.FALSE_STRING));
    public static final Logger f = Logger.getLogger(kh.class.getName());
    public static final a g;
    public static final Object h;

    @Nullable
    public volatile Object b;

    @Nullable
    public volatile d c;

    @Nullable
    public volatile h d;

    /* compiled from: AbstractResolvableFuture.java */
    public static abstract class a {
        public abstract boolean a(kh<?> khVar, d dVar, d dVar2);

        public abstract boolean b(kh<?> khVar, Object obj, Object obj2);

        public abstract boolean c(kh<?> khVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class b {
        public static final b c;
        public static final b d;
        public final boolean a;

        @Nullable
        public final Throwable b;

        static {
            if (kh.e) {
                d = null;
                c = null;
            } else {
                d = new b(false, null);
                c = new b(true, null);
            }
        }

        public b(boolean z, @Nullable Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class c {
        public final Throwable a;

        /* compiled from: AbstractResolvableFuture.java */
        /* loaded from: classes11.dex */
        public class a extends Throwable {
            public a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new a());
        }

        public c(Throwable th) {
            boolean z = kh.e;
            th.getClass();
            this.a = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class d {
        public static final d d = new d(null, null);
        public final Runnable a;
        public final Executor b;

        @Nullable
        public d c;

        public d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class e extends a {
        public final AtomicReferenceFieldUpdater<h, Thread> a;
        public final AtomicReferenceFieldUpdater<h, h> b;
        public final AtomicReferenceFieldUpdater<kh, h> c;
        public final AtomicReferenceFieldUpdater<kh, d> d;
        public final AtomicReferenceFieldUpdater<kh, Object> e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<kh, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<kh, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<kh, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // xsna.kh.a
        public final boolean a(kh<?> khVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<kh, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(khVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(khVar) == dVar);
            return false;
        }

        @Override // xsna.kh.a
        public final boolean b(kh<?> khVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<kh, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(khVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(khVar) == obj);
            return false;
        }

        @Override // xsna.kh.a
        public final boolean c(kh<?> khVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<kh, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(khVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(khVar) == hVar);
            return false;
        }

        @Override // xsna.kh.a
        public final void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // xsna.kh.a
        public final void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes11.dex */
    public static final class g extends a {
        @Override // xsna.kh.a
        public final boolean a(kh<?> khVar, d dVar, d dVar2) {
            synchronized (khVar) {
                try {
                    if (khVar.c != dVar) {
                        return false;
                    }
                    khVar.c = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.kh.a
        public final boolean b(kh<?> khVar, Object obj, Object obj2) {
            synchronized (khVar) {
                try {
                    if (khVar.b != obj) {
                        return false;
                    }
                    khVar.b = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.kh.a
        public final boolean c(kh<?> khVar, h hVar, h hVar2) {
            synchronized (khVar) {
                try {
                    if (khVar.d != hVar) {
                        return false;
                    }
                    khVar.d = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.kh.a
        public final void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // xsna.kh.a
        public final void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class h {
        public static final h c = new h();

        @Nullable
        public volatile Thread a;

        @Nullable
        public volatile h b;

        public h() {
            kh.g.e(this, Thread.currentThread());
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(kh.class, h.class, "d"), AtomicReferenceFieldUpdater.newUpdater(kh.class, d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(kh.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        g = gVar;
        if (th != null) {
            f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static void d(kh<?> khVar) {
        h hVar;
        d dVar;
        do {
            hVar = khVar.d;
        } while (!g.c(khVar, hVar, h.c));
        while (hVar != null) {
            Thread thread = hVar.a;
            if (thread != null) {
                hVar.a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.b;
        }
        khVar.c();
        do {
            dVar = khVar.c;
        } while (!g.a(khVar, dVar, d.d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.c;
            dVar.c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.c;
            Runnable runnable = dVar2.a;
            if (runnable instanceof f) {
                ((f) runnable).getClass();
                throw null;
            }
            e(runnable, dVar2.b);
            dVar2 = dVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    public static <V> V g(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public final void a(StringBuilder sb) {
        try {
            Object g2 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g2 == this ? "this future" : String.valueOf(g2));
            sb.append(X3.j.e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(X3.j.e);
        }
    }

    @Override // xsna.ugz
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.c;
        d dVar2 = d.d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.c = dVar;
                if (g.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.c;
                }
            } while (dVar != dVar2);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.b;
        if ((obj == null) | (obj instanceof f)) {
            b bVar = e ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.c : b.d;
            while (!g.b(this, obj, bVar)) {
                obj = this.b;
                if (!(obj instanceof f)) {
                }
            }
            d(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z;
        h hVar = h.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.b;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar2 = this.d;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                z = true;
                do {
                    a aVar = g;
                    aVar.d(hVar3, hVar2);
                    if (aVar.c(this, hVar2, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.b;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(hVar3);
                    } else {
                        hVar2 = this.d;
                    }
                } while (hVar2 != hVar);
            }
            return (V) f(this.b);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.b;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof f))) {
                return (V) f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String khVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        StringBuilder b2 = fp.b(j, "Waited ", " ");
        b2.append(timeUnit.toString().toLowerCase(locale));
        String sb = b2.toString();
        if (nanos + 1000 < 0) {
            String a2 = fo8.a(sb, " (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z2 = (convert == 0 || nanos2 > 1000) ? z : false;
            if (convert > 0) {
                String str = a2 + convert + " " + lowerCase;
                if (z2) {
                    str = fo8.a(str, StringUtils.COMMA);
                }
                a2 = fo8.a(str, " ");
            }
            if (z2) {
                a2 = a2 + nanos2 + " nanoseconds ";
            }
            sb = fo8.a(a2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(fo8.a(sb, " but future completed as timeout expired"));
        }
        throw new TimeoutException(pzl.b(sb, " for ", khVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public String h() {
        Object obj = this.b;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ((f) obj).getClass();
            sb.append("null");
            sb.append(X3.j.e);
            return sb.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.d;
            if (hVar2 == h.c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.b;
                if (hVar2.a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.b = hVar4;
                    if (hVar3.a == null) {
                        break;
                    }
                } else if (!g.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.b != null);
    }

    public boolean j(@Nullable V v) {
        if (v == null) {
            v = (V) h;
        }
        if (!g.b(this, null, v)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!g.b(this, null, new c(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.b instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                jh.f(sb, "PENDING, info=[", str, X3.j.e);
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        h hVar = h.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.b;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) f(obj2);
            }
            h hVar2 = this.d;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                do {
                    a aVar = g;
                    aVar.d(hVar3, hVar2);
                    if (aVar.c(this, hVar2, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.b;
                            } else {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) f(obj);
                    }
                    hVar2 = this.d;
                } while (hVar2 != hVar);
            }
            return (V) f(this.b);
        }
        throw new InterruptedException();
    }
}
