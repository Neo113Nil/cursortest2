package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;

/* loaded from: classes.dex */
public final class cl7 {
    public final AtomicReference a;
    public final AtomicReference b;

    public cl7(j18 j18Var, sls slsVar) {
        this.a = new AtomicReference(j18Var);
        this.b = new AtomicReference(slsVar);
    }

    public final void a() {
        sls slsVar = (sls) this.b.getAndSet(null);
        this.a.set(null);
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public final void b(Throwable th) {
        i18 i18Var = (i18) this.a.getAndSet(null);
        if (i18Var == null) {
            xby.d.k(new IllegalStateException(), "Call error after success or error is called");
        } else {
            a();
            i18Var.resumeWith(new Result.Failure(th));
        }
    }

    public final boolean c() {
        return this.a.get() == null;
    }

    public final void d(Object obj) {
        i18 i18Var = (i18) this.a.getAndSet(null);
        if (i18Var == null) {
            xby.d.k(new IllegalStateException(), "Call success after success or error is called");
        } else {
            a();
            i18Var.resumeWith(obj);
        }
    }
}
