package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.v;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;

/* loaded from: classes11.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public final boolean a(Throwable th) {
        if (f.a(this, th)) {
            return true;
        }
        io.reactivex.rxjava3.plugins.a.a(th);
        return false;
    }

    public final void d() {
        Throwable d = f.d(this);
        if (d == null || d == f.a) {
            return;
        }
        io.reactivex.rxjava3.plugins.a.a(d);
    }

    public final void e(io.reactivex.rxjava3.core.c cVar) {
        Throwable d = f.d(this);
        if (d == null) {
            cVar.onComplete();
        } else if (d != f.a) {
            cVar.onError(d);
        }
    }

    public final void f(v<?> vVar) {
        Throwable d = f.d(this);
        if (d == null) {
            vVar.onComplete();
        } else if (d != f.a) {
            vVar.onError(d);
        }
    }

    public final void g(axm0<?> axm0Var) {
        Throwable d = f.d(this);
        if (d == null) {
            axm0Var.onComplete();
        } else if (d != f.a) {
            axm0Var.onError(d);
        }
    }
}
