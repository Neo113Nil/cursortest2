package xsna;

import bolts.ExecutorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import xsna.h82;
import xsna.wj7;

/* compiled from: Task.java */
/* loaded from: classes12.dex */
public final class e5o0<TResult> {
    public static final ExecutorService g;
    public static final wj7.a h;
    public static final e5o0<Boolean> i;
    public static final e5o0<Boolean> j;
    public boolean b;
    public boolean c;
    public TResult d;
    public Exception e;
    public final Object a = new Object();
    public ArrayList f = new ArrayList();

    static {
        wj7 wj7Var = wj7.d;
        g = wj7Var.a;
        h = wj7Var.c;
        h82.a aVar = h82.b.a;
        new e5o0((Boolean) null);
        i = new e5o0<>(Boolean.TRUE);
        j = new e5o0<>(Boolean.FALSE);
        new e5o0(0);
    }

    public e5o0() {
    }

    public static e5o0 a(Executor executor, Callable callable) {
        vou vouVar = new vou();
        try {
            executor.execute(new q4o0(vouVar, callable));
        } catch (Exception e) {
            vouVar.i(new ExecutorException(e));
        }
        return (e5o0) vouVar.b;
    }

    public static <TResult> e5o0<TResult> b(Exception exc) {
        e5o0<TResult> e5o0Var = new e5o0<>();
        synchronized (e5o0Var.a) {
            try {
                if (e5o0Var.b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                e5o0Var.b = true;
                e5o0Var.e = exc;
                e5o0Var.a.notifyAll();
                e5o0Var.f();
                return e5o0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Exception c() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    public final TResult d() {
        TResult tresult;
        synchronized (this.a) {
            tresult = this.d;
        }
        return tresult;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = c() != null;
        }
        return z;
    }

    public final void f() {
        synchronized (this.a) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                try {
                    ((tpj) it.next()).a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f = null;
        }
    }

    public final boolean g() {
        synchronized (this.a) {
            try {
                if (this.b) {
                    return false;
                }
                this.b = true;
                this.c = true;
                this.a.notifyAll();
                f();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(TResult tresult) {
        synchronized (this.a) {
            try {
                if (this.b) {
                    return false;
                }
                this.b = true;
                this.d = tresult;
                this.a.notifyAll();
                f();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e5o0(Boolean bool) {
        h(bool);
    }

    public e5o0(int i2) {
        g();
    }
}
