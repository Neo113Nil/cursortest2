package defpackage;

import androidx.concurrent.futures.a;
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

/* loaded from: classes.dex */
public abstract class ga implements euy {
    public static final boolean w = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger x = Logger.getLogger(ga.class.getName());
    public static final qke y;
    public static final Object z;
    public volatile Object a;
    public volatile y9 b;
    public volatile ea c;

    static {
        qke caVar;
        try {
            caVar = new aa(AtomicReferenceFieldUpdater.newUpdater(ea.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(ea.class, ea.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ga.class, ea.class, "c"), AtomicReferenceFieldUpdater.newUpdater(ga.class, y9.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ga.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            caVar = new ca();
        }
        y = caVar;
        if (th != null) {
            x.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        z = new Object();
    }

    public static void e(ga gaVar) {
        ea eaVar;
        y9 y9Var;
        y9 y9Var2;
        y9 y9Var3;
        do {
            eaVar = gaVar.c;
        } while (!y.f(gaVar, eaVar, ea.c));
        while (true) {
            y9Var = null;
            if (eaVar == null) {
                break;
            }
            Thread thread = eaVar.a;
            if (thread != null) {
                eaVar.a = null;
                LockSupport.unpark(thread);
            }
            eaVar = eaVar.b;
        }
        gaVar.b();
        do {
            y9Var2 = gaVar.b;
        } while (!y.d(gaVar, y9Var2, y9.d));
        while (true) {
            y9Var3 = y9Var;
            y9Var = y9Var2;
            if (y9Var == null) {
                break;
            }
            y9Var2 = y9Var.c;
            y9Var.c = y9Var3;
        }
        while (y9Var3 != null) {
            y9 y9Var4 = y9Var3.c;
            f(y9Var3.a, y9Var3.b);
            y9Var3 = y9Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            x.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object g(Object obj) {
        if (obj instanceof v9) {
            Throwable th = ((v9) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof a) {
            throw new ExecutionException(((a) obj).a);
        }
        if (obj == z) {
            return null;
        }
        return obj;
    }

    public static Object h(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
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
            Object h = h(this);
            sb.append("SUCCESS, result=[");
            sb.append(h == this ? "this future" : String.valueOf(h));
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

    public void b() {
    }

    @Override // defpackage.euy
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        y9 y9Var = this.b;
        y9 y9Var2 = y9.d;
        if (y9Var != y9Var2) {
            y9 y9Var3 = new y9(runnable, executor);
            do {
                y9Var3.c = y9Var;
                if (y.d(this, y9Var, y9Var3)) {
                    return;
                } else {
                    y9Var = this.b;
                }
            } while (y9Var != y9Var2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.a;
        if (obj == null) {
            if (y.e(this, obj, w ? new v9(new CancellationException("Future.cancel() was called."), z2) : z2 ? v9.c : v9.d)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        ea eaVar = ea.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return g(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ea eaVar2 = this.c;
            if (eaVar2 != eaVar) {
                ea eaVar3 = new ea();
                do {
                    qke qkeVar = y;
                    qkeVar.x(eaVar3, eaVar2);
                    if (qkeVar.f(this, eaVar2, eaVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(eaVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(eaVar3);
                    } else {
                        eaVar2 = this.c;
                    }
                } while (eaVar2 != eaVar);
            }
            return g(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String gaVar = toString();
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
        throw new TimeoutException(g8e.p(sb, " for ", gaVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof v9;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final void j(ea eaVar) {
        eaVar.a = null;
        while (true) {
            ea eaVar2 = this.c;
            if (eaVar2 == ea.c) {
                return;
            }
            ea eaVar3 = null;
            while (eaVar2 != null) {
                ea eaVar4 = eaVar2.b;
                if (eaVar2.a != null) {
                    eaVar3 = eaVar2;
                } else if (eaVar3 != null) {
                    eaVar3.b = eaVar4;
                    if (eaVar3.a == null) {
                        break;
                    }
                } else if (!y.f(this, eaVar2, eaVar4)) {
                    break;
                }
                eaVar2 = eaVar4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = z;
        }
        if (!y.e(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!y.e(this, null, new a(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof v9) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = i();
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
        ea eaVar = ea.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return g(obj2);
            }
            ea eaVar2 = this.c;
            if (eaVar2 != eaVar) {
                ea eaVar3 = new ea();
                do {
                    qke qkeVar = y;
                    qkeVar.x(eaVar3, eaVar2);
                    if (qkeVar.f(this, eaVar2, eaVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                j(eaVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    eaVar2 = this.c;
                } while (eaVar2 != eaVar);
            }
            return g(this.a);
        }
        throw new InterruptedException();
    }
}
