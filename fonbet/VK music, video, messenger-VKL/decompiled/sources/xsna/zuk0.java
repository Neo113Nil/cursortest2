package xsna;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: StatefulProducerRunnable.kt */
/* loaded from: classes12.dex */
public abstract class zuk0<T> implements Runnable {
    public final AtomicInteger b = new AtomicInteger(0);
    public final l7j<T> c;
    public final yhd0 d;
    public final uhd0 e;
    public final String f;

    public zuk0(l7j<T> l7jVar, yhd0 yhd0Var, uhd0 uhd0Var, String str) {
        this.c = l7jVar;
        this.d = yhd0Var;
        this.e = uhd0Var;
        this.f = str;
        yhd0Var.k(uhd0Var, str);
    }

    public final void a() {
        if (this.b.compareAndSet(0, 2)) {
            e();
        }
    }

    public abstract void b(Object obj);

    public Map<String, String> c(T t) {
        return null;
    }

    public abstract Object d() throws Exception;

    public void e() {
        yhd0 yhd0Var = this.d;
        uhd0 uhd0Var = this.e;
        String str = this.f;
        yhd0Var.i(uhd0Var, str);
        yhd0Var.g(uhd0Var, str);
        this.c.a();
    }

    public void f(Exception exc) {
        yhd0 yhd0Var = this.d;
        uhd0 uhd0Var = this.e;
        String str = this.f;
        yhd0Var.i(uhd0Var, str);
        yhd0Var.b(uhd0Var, str, exc, null);
        this.c.onFailure(exc);
    }

    public void g(T t) {
        yhd0 yhd0Var = this.d;
        uhd0 uhd0Var = this.e;
        String str = this.f;
        yhd0Var.f(uhd0Var, str, yhd0Var.i(uhd0Var, str) ? c(t) : null);
        this.c.b(1, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.b;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object d = d();
                atomicInteger.set(3);
                try {
                    g(d);
                } finally {
                    b(d);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                f(e);
            }
        }
    }
}
