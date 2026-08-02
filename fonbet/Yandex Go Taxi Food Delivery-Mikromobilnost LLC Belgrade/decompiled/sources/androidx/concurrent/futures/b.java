package androidx.concurrent.futures;

import defpackage.gl7;
import defpackage.hsj0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {
    public Object a;
    public gl7 b;
    public hsj0 c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        hsj0 hsj0Var = this.c;
        if (hsj0Var != null) {
            hsj0Var.c(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.d = true;
        gl7 gl7Var = this.b;
        boolean z = gl7Var != null && gl7Var.b.k(obj);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void c() {
        this.d = true;
        gl7 gl7Var = this.b;
        if (gl7Var == null || !gl7Var.b.cancel(true)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean d(Throwable th) {
        this.d = true;
        gl7 gl7Var = this.b;
        boolean z = gl7Var != null && gl7Var.b.l(th);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        hsj0 hsj0Var;
        gl7 gl7Var = this.b;
        if (gl7Var != null && !gl7Var.b.isDone()) {
            final String str = "The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a;
            gl7Var.a(new Throwable(str) { // from class: androidx.concurrent.futures.CallbackToFutureAdapter$FutureGarbageCollectedException
                @Override // java.lang.Throwable
                public final synchronized Throwable fillInStackTrace() {
                    return this;
                }
            });
        }
        if (this.d || (hsj0Var = this.c) == null) {
            return;
        }
        hsj0Var.k(null);
    }
}
