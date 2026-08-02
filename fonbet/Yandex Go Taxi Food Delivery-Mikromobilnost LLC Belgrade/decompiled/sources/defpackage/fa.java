package defpackage;

import java.util.Locale;
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

/* loaded from: classes11.dex */
public abstract class fa implements euy {
    public static final boolean w = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger x = Logger.getLogger(fa.class.getName());
    public static final wha1 y;
    public static final Object z;
    public volatile Object a;
    public volatile x9 b;
    public volatile da c;

    static {
        wha1 baVar;
        try {
            baVar = new z9(AtomicReferenceFieldUpdater.newUpdater(da.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(da.class, da.class, "b"), AtomicReferenceFieldUpdater.newUpdater(fa.class, da.class, "c"), AtomicReferenceFieldUpdater.newUpdater(fa.class, x9.class, "b"), AtomicReferenceFieldUpdater.newUpdater(fa.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            baVar = new ba();
        }
        y = baVar;
        if (th != null) {
            x.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        z = new Object();
    }

    public static void b(fa faVar) {
        da daVar;
        x9 x9Var;
        x9 x9Var2;
        x9 x9Var3;
        do {
            daVar = faVar.c;
        } while (!y.f(faVar, daVar, da.c));
        while (true) {
            x9Var = null;
            if (daVar == null) {
                break;
            }
            Thread thread = daVar.a;
            if (thread != null) {
                daVar.a = null;
                LockSupport.unpark(thread);
            }
            daVar = daVar.b;
        }
        do {
            x9Var2 = faVar.b;
        } while (!y.d(faVar, x9Var2, x9.d));
        while (true) {
            x9Var3 = x9Var;
            x9Var = x9Var2;
            if (x9Var == null) {
                break;
            }
            x9Var2 = x9Var.c;
            x9Var.c = x9Var3;
        }
        while (x9Var3 != null) {
            x9 x9Var4 = x9Var3.c;
            e(x9Var3.a, x9Var3.b);
            x9Var3 = x9Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            x.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof u9) {
            Throwable th = ((u9) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof w9) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == z) {
            return null;
        }
        return obj;
    }

    public static Object g(fa faVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = faVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object g = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g == this ? "this future" : String.valueOf(g));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // defpackage.euy
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        x9 x9Var = this.b;
        x9 x9Var2 = x9.d;
        if (x9Var != x9Var2) {
            x9 x9Var3 = new x9(runnable, executor);
            do {
                x9Var3.c = x9Var;
                if (y.d(this, x9Var, x9Var3)) {
                    return;
                } else {
                    x9Var = this.b;
                }
            } while (x9Var != x9Var2);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!y.e(this, obj, w ? new u9(new CancellationException("Future.cancel() was called."), z2) : z2 ? u9.b : u9.c)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        da daVar = da.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            da daVar2 = this.c;
            if (daVar2 != daVar) {
                da daVar3 = new da();
                do {
                    wha1 wha1Var = y;
                    wha1Var.h(daVar3, daVar2);
                    if (wha1Var.f(this, daVar2, daVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(daVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(daVar3);
                    } else {
                        daVar2 = this.c;
                    }
                } while (daVar2 != daVar);
            }
            return f(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String faVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        StringBuilder w2 = unr0.w(j, "Waited ", " ");
        w2.append(timeUnit.toString().toLowerCase(locale));
        String sb = w2.toString();
        if (nanos + 1000 < 0) {
            String concat = sb.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str = concat + convert + " " + lowerCase;
                if (z2) {
                    str = str.concat(",");
                }
                concat = str.concat(" ");
            }
            if (z2) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            sb = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(g8e.p(sb, " for ", faVar));
    }

    public final void h(da daVar) {
        daVar.a = null;
        while (true) {
            da daVar2 = this.c;
            if (daVar2 == da.c) {
                return;
            }
            da daVar3 = null;
            while (daVar2 != null) {
                da daVar4 = daVar2.b;
                if (daVar2.a != null) {
                    daVar3 = daVar2;
                } else if (daVar3 != null) {
                    daVar3.b = daVar4;
                    if (daVar3.a == null) {
                        break;
                    }
                } else if (!y.f(this, daVar2, daVar4)) {
                    break;
                }
                daVar2 = daVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof u9;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof u9) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                x4e.C(sb, "PENDING, info=[", str, "]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        da daVar = da.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return f(obj2);
            }
            da daVar2 = this.c;
            if (daVar2 != daVar) {
                da daVar3 = new da();
                do {
                    wha1 wha1Var = y;
                    wha1Var.h(daVar3, daVar2);
                    if (wha1Var.f(this, daVar2, daVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                h(daVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    daVar2 = this.c;
                } while (daVar2 != daVar);
            }
            return f(this.a);
        }
        throw new InterruptedException();
    }
}
