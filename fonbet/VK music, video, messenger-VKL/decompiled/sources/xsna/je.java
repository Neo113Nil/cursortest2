package xsna;

import androidx.credentials.provider.CredentialEntry;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: AbstractFuture.java */
/* loaded from: classes13.dex */
public abstract class je<V> extends vgx implements ugz<V> {
    public static final boolean e;
    public static final cwy f;
    public static final a g;
    public static final Object h;
    public volatile Object b;
    public volatile d c;
    public volatile k d;

    /* compiled from: AbstractFuture.java */
    public static abstract class a {
        public abstract boolean a(je<?> jeVar, d dVar, d dVar2);

        public abstract boolean b(je<?> jeVar, Object obj, Object obj2);

        public abstract boolean c(je<?> jeVar, k kVar, k kVar2);

        public abstract d d(je<?> jeVar, d dVar);

        public abstract k e(je jeVar);

        public abstract void f(k kVar, k kVar2);

        public abstract void g(k kVar, Thread thread);
    }

    /* compiled from: AbstractFuture.java */
    public static final class b {
        public static final b c;
        public static final b d;
        public final boolean a;
        public final Throwable b;

        static {
            if (je.e) {
                d = null;
                c = null;
            } else {
                d = new b(false, null);
                c = new b(true, null);
            }
        }

        public b(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    public static final class c {
        public static final c b = new c(new a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        /* compiled from: AbstractFuture.java */
        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            th.getClass();
            this.a = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    public static final class e extends a {
        public final AtomicReferenceFieldUpdater<k, Thread> a;
        public final AtomicReferenceFieldUpdater<k, k> b;
        public final AtomicReferenceFieldUpdater<? super je<?>, k> c;
        public final AtomicReferenceFieldUpdater<? super je<?>, d> d;
        public final AtomicReferenceFieldUpdater<? super je<?>, Object> e;

        public e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<? super je<?>, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<? super je<?>, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<? super je<?>, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // xsna.je.a
        public final boolean a(je<?> jeVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<? super je<?>, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(jeVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(jeVar) == dVar);
            return false;
        }

        @Override // xsna.je.a
        public final boolean b(je<?> jeVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super je<?>, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(jeVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(jeVar) == obj);
            return false;
        }

        @Override // xsna.je.a
        public final boolean c(je<?> jeVar, k kVar, k kVar2) {
            AtomicReferenceFieldUpdater<? super je<?>, k> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(jeVar, kVar, kVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(jeVar) == kVar);
            return false;
        }

        @Override // xsna.je.a
        public final d d(je<?> jeVar, d dVar) {
            return this.d.getAndSet(jeVar, dVar);
        }

        @Override // xsna.je.a
        public final k e(je jeVar) {
            return this.c.getAndSet(jeVar, k.c);
        }

        @Override // xsna.je.a
        public final void f(k kVar, k kVar2) {
            this.b.lazySet(kVar, kVar2);
        }

        @Override // xsna.je.a
        public final void g(k kVar, Thread thread) {
            this.a.lazySet(kVar, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    public static final class f<V> implements Runnable {
        public final di b;
        public final ugz<? extends V> c;

        public f(di diVar, lzi0 lzi0Var) {
            this.b = diVar;
            this.c = lzi0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.b != this) {
                return;
            }
            if (je.g.b(this.b, this, je.h(this.c))) {
                je.e(this.b, false);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    public static final class g extends a {
        @Override // xsna.je.a
        public final boolean a(je<?> jeVar, d dVar, d dVar2) {
            synchronized (jeVar) {
                try {
                    if (jeVar.c != dVar) {
                        return false;
                    }
                    jeVar.c = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.je.a
        public final boolean b(je<?> jeVar, Object obj, Object obj2) {
            synchronized (jeVar) {
                try {
                    if (jeVar.b != obj) {
                        return false;
                    }
                    jeVar.b = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.je.a
        public final boolean c(je<?> jeVar, k kVar, k kVar2) {
            synchronized (jeVar) {
                try {
                    if (jeVar.d != kVar) {
                        return false;
                    }
                    jeVar.d = kVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.je.a
        public final d d(je<?> jeVar, d dVar) {
            d dVar2;
            synchronized (jeVar) {
                try {
                    dVar2 = jeVar.c;
                    if (dVar2 != dVar) {
                        jeVar.c = dVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar2;
        }

        @Override // xsna.je.a
        public final k e(je jeVar) {
            k kVar;
            k kVar2 = k.c;
            synchronized (jeVar) {
                try {
                    kVar = jeVar.d;
                    if (kVar != kVar2) {
                        jeVar.d = kVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return kVar;
        }

        @Override // xsna.je.a
        public final void f(k kVar, k kVar2) {
            kVar.b = kVar2;
        }

        @Override // xsna.je.a
        public final void g(k kVar, Thread thread) {
            kVar.a = thread;
        }
    }

    /* compiled from: AbstractFuture.java */
    public interface h<V> extends ugz<V> {
    }

    /* compiled from: AbstractFuture.java */
    public static abstract class i<V> extends je<V> implements h<V> {
        @Override // xsna.je, java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.b instanceof b;
        }
    }

    /* compiled from: AbstractFuture.java */
    public static final class j extends a {
        public static final Unsafe a;
        public static final long b;
        public static final long c;
        public static final long d;
        public static final long e;
        public static final long f;

        /* compiled from: AbstractFuture.java */
        public class a implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                return a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                c = unsafe.objectFieldOffset(je.class.getDeclaredField("d"));
                b = unsafe.objectFieldOffset(je.class.getDeclaredField("c"));
                d = unsafe.objectFieldOffset(je.class.getDeclaredField("b"));
                e = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // xsna.je.a
        public final boolean a(je<?> jeVar, d dVar, d dVar2) {
            return le.a(a, jeVar, b, dVar, dVar2);
        }

        @Override // xsna.je.a
        public final boolean b(je<?> jeVar, Object obj, Object obj2) {
            return me.a(a, jeVar, d, obj, obj2);
        }

        @Override // xsna.je.a
        public final boolean c(je<?> jeVar, k kVar, k kVar2) {
            return ke.a(a, jeVar, c, kVar, kVar2);
        }

        @Override // xsna.je.a
        public final d d(je<?> jeVar, d dVar) {
            d dVar2;
            do {
                dVar2 = jeVar.c;
                if (dVar == dVar2) {
                    break;
                }
            } while (!a(jeVar, dVar2, dVar));
            return dVar2;
        }

        @Override // xsna.je.a
        public final k e(je jeVar) {
            k kVar;
            k kVar2 = k.c;
            do {
                kVar = jeVar.d;
                if (kVar2 == kVar) {
                    break;
                }
            } while (!c(jeVar, kVar, kVar2));
            return kVar;
        }

        @Override // xsna.je.a
        public final void f(k kVar, k kVar2) {
            a.putObject(kVar, f, kVar2);
        }

        @Override // xsna.je.a
        public final void g(k kVar, Thread thread) {
            a.putObject(kVar, e, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    public static final class k {
        public static final k c = new k();
        public volatile Thread a;
        public volatile k b;

        public k() {
            je.g.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        a gVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", CredentialEntry.FALSE_STRING));
        } catch (SecurityException unused) {
            z = false;
        }
        e = z;
        f = new cwy(je.class);
        Throwable th2 = null;
        try {
            gVar = new j();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(je.class, k.class, "d"), AtomicReferenceFieldUpdater.newUpdater(je.class, d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(je.class, Object.class, "b"));
            } catch (Error | Exception e3) {
                th2 = e3;
                gVar = new g();
            }
        }
        g = gVar;
        if (th2 != null) {
            cwy cwyVar = f;
            Logger a2 = cwyVar.a();
            Level level = Level.SEVERE;
            a2.log(level, "UnsafeAtomicHelper is broken!", th);
            cwyVar.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    public static void e(je<?> jeVar, boolean z) {
        d dVar = null;
        while (true) {
            for (k e2 = g.e(jeVar); e2 != null; e2 = e2.b) {
                Thread thread = e2.a;
                if (thread != null) {
                    e2.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            jeVar.c();
            d dVar2 = dVar;
            d d2 = g.d(jeVar, d.d);
            d dVar3 = dVar2;
            while (d2 != null) {
                d dVar4 = d2.c;
                d2.c = dVar3;
                dVar3 = d2;
                d2 = dVar4;
            }
            while (dVar3 != null) {
                dVar = dVar3.c;
                Runnable runnable = dVar3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    jeVar = fVar.b;
                    if (jeVar.b == fVar) {
                        if (g.b(jeVar, fVar, h(fVar.c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVar3.b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                dVar3 = dVar;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            f.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(ugz<?> ugzVar) {
        Object obj;
        Throwable a2;
        if (ugzVar instanceof h) {
            Object obj2 = ((je) ugzVar).b;
            if (obj2 instanceof b) {
                b bVar = (b) obj2;
                if (bVar.a) {
                    obj2 = bVar.b != null ? new b(false, bVar.b) : b.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((ugzVar instanceof vgx) && (a2 = ((vgx) ugzVar).a()) != null) {
            return new c(a2);
        }
        boolean isCancelled = ugzVar.isCancelled();
        boolean z = true;
        if ((!e) && isCancelled) {
            b bVar2 = b.d;
            Objects.requireNonNull(bVar2);
            return bVar2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = ugzVar.get();
                        break;
                    } catch (Error e2) {
                        e = e2;
                        return new c(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | Exception e3) {
                e = e3;
                return new c(e);
            } catch (CancellationException e4) {
                if (isCancelled) {
                    return new b(false, e4);
                }
                return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + ugzVar, e4));
            } catch (ExecutionException e5) {
                if (!isCancelled) {
                    return new c(e5.getCause());
                }
                return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ugzVar, e5));
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? h : obj;
        }
        return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ugzVar));
    }

    @Override // xsna.vgx
    public final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.b;
        if (obj instanceof c) {
            return ((c) obj).a;
        }
        return null;
    }

    @Override // xsna.ugz
    public void addListener(Runnable runnable, Executor executor) {
        d dVar;
        fxc0.t(runnable, "Runnable was null.");
        fxc0.t(executor, "Executor was null.");
        if (!isDone() && (dVar = this.c) != d.d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.c = dVar;
                if (g.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.c;
                }
            } while (dVar != d.d);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append(X3.j.e);
                return;
            } catch (Exception e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        d(sb, v);
        sb.append(X3.j.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z) {
        b bVar;
        Object obj = this.b;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (e) {
            bVar = new b(z, new CancellationException("Future.cancel() was called."));
        } else {
            bVar = z ? b.c : b.d;
            Objects.requireNonNull(bVar);
        }
        je<V> jeVar = this;
        boolean z2 = false;
        while (true) {
            if (g.b(jeVar, obj, bVar)) {
                e(jeVar, z);
                if (!(obj instanceof f)) {
                    break;
                }
                ugz<? extends V> ugzVar = ((f) obj).c;
                if (!(ugzVar instanceof h)) {
                    ugzVar.cancel(z);
                    break;
                }
                jeVar = (je) ugzVar;
                obj = jeVar.b;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z2 = true;
            } else {
                obj = jeVar.b;
                if (!(obj instanceof f)) {
                    return z2;
                }
            }
        }
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z;
        long j3;
        k kVar = k.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.b;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) g(obj);
        }
        long j4 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar2 = this.d;
            if (kVar2 != kVar) {
                k kVar3 = new k();
                z = true;
                while (true) {
                    a aVar = g;
                    aVar.f(kVar3, kVar2);
                    if (aVar.c(this, kVar2, kVar3)) {
                        j3 = j4;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                j(kVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.b;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) g(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(kVar3);
                    } else {
                        long j5 = j4;
                        kVar2 = this.d;
                        if (kVar2 == kVar) {
                            break;
                        }
                        j4 = j5;
                    }
                }
            }
            Object obj3 = this.b;
            Objects.requireNonNull(obj3);
            return (V) g(obj3);
        }
        z = true;
        j3 = 0;
        while (nanos > j3) {
            Object obj4 = this.b;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof f))) {
                return (V) g(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String jeVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        StringBuilder b2 = fp.b(j2, "Waited ", " ");
        b2.append(timeUnit.toString().toLowerCase(locale));
        String sb = b2.toString();
        if (nanos + 1000 < j3) {
            String a2 = fo8.a(sb, " (plus ");
            long j6 = -nanos;
            long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(convert);
            boolean z2 = (convert == j3 || nanos2 > 1000) ? z : false;
            if (convert > j3) {
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
        throw new TimeoutException(pzl.b(sb, " for ", jeVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof f)) & (this.b != null);
    }

    public final void j(k kVar) {
        kVar.a = null;
        while (true) {
            k kVar2 = this.d;
            if (kVar2 == k.c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.b;
                if (kVar2.a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.b = kVar4;
                    if (kVar3.a == null) {
                        break;
                    }
                } else if (!g.c(this, kVar2, kVar4)) {
                    break;
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    public boolean k(V v) {
        if (v == null) {
            v = (V) h;
        }
        if (!g.b(this, null, v)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!g.b(this, null, new c(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r3.isEmpty() != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.b;
            if (obj instanceof f) {
                sb.append(", setFuture=[");
                ugz<? extends V> ugzVar = ((f) obj).c;
                try {
                    if (ugzVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(ugzVar);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                    sb.append(X3.j.e);
                    if (isDone()) {
                    }
                    sb.append(X3.j.e);
                    return sb.toString();
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                    sb.append(X3.j.e);
                    if (isDone()) {
                    }
                    sb.append(X3.j.e);
                    return sb.toString();
                }
                sb.append(X3.j.e);
            } else {
                try {
                    str = i();
                    if (str != null) {
                    }
                    str = null;
                } catch (Exception | StackOverflowError e4) {
                    str = "Exception thrown from implementation: " + e4.getClass();
                }
                if (str != null) {
                    jh.f(sb, ", info=[", str, X3.j.e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                b(sb);
            }
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    /* compiled from: AbstractFuture.java */
    public static final class d {
        public static final d d = new d();
        public final Runnable a;
        public final Executor b;
        public d c;

        public d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }

        public d() {
            this.a = null;
            this.b = null;
        }
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        k kVar = k.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.b;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) g(obj2);
            }
            k kVar2 = this.d;
            if (kVar2 != kVar) {
                k kVar3 = new k();
                do {
                    a aVar = g;
                    aVar.f(kVar3, kVar2);
                    if (aVar.c(this, kVar2, kVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.b;
                            } else {
                                j(kVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) g(obj);
                    }
                    kVar2 = this.d;
                } while (kVar2 != kVar);
            }
            Object obj3 = this.b;
            Objects.requireNonNull(obj3);
            return (V) g(obj3);
        }
        throw new InterruptedException();
    }
}
