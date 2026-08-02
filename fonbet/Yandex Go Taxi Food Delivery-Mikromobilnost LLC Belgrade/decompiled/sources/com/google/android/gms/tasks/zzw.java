package com.google.android.gms.tasks;

import defpackage.ch91;
import defpackage.cvw;
import defpackage.dtx0;
import defpackage.ew2;
import defpackage.h3v0;
import defpackage.iy60;
import defpackage.o3a1;
import defpackage.pke;
import defpackage.qsb1;
import defpackage.sx60;
import defpackage.t070;
import defpackage.wx60;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzw extends Task {
    public final Object a = new Object();
    public final ew2 b = new ew2();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(Executor executor, sx60 sx60Var) {
        this.b.e(new o3a1(executor, sx60Var));
        v();
    }

    @Override // com.google.android.gms.tasks.Task
    public final void b(wx60 wx60Var) {
        this.b.e(new o3a1(dtx0.a, wx60Var));
        v();
    }

    @Override // com.google.android.gms.tasks.Task
    public final void c(Executor executor, wx60 wx60Var) {
        this.b.e(new o3a1(executor, wx60Var));
        v();
    }

    @Override // com.google.android.gms.tasks.Task
    public final zzw d(iy60 iy60Var) {
        e(dtx0.a, iy60Var);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final zzw e(Executor executor, iy60 iy60Var) {
        this.b.e(new o3a1(executor, iy60Var));
        v();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final zzw f(t070 t070Var) {
        g(dtx0.a, t070Var);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final zzw g(Executor executor, t070 t070Var) {
        this.b.e(new o3a1(executor, t070Var));
        v();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task h(Executor executor, pke pkeVar) {
        zzw zzwVar = new zzw();
        this.b.e(new ch91(executor, pkeVar, zzwVar, 0));
        v();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task i(Executor executor, pke pkeVar) {
        zzw zzwVar = new zzw();
        this.b.e(new ch91(executor, pkeVar, zzwVar, 1));
        v();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception j() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object k() {
        Object obj;
        synchronized (this.a) {
            try {
                cvw.n("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object l(Class cls) {
        Object obj;
        synchronized (this.a) {
            try {
                cvw.n("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                boolean isInstance = cls.isInstance(this.f);
                Exception exc = this.f;
                if (isInstance) {
                    throw ((Throwable) cls.cast(exc));
                }
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        return this.d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean o() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task p(h3v0 h3v0Var) {
        qsb1 qsb1Var = dtx0.a;
        zzw zzwVar = new zzw();
        this.b.e(new o3a1(qsb1Var, h3v0Var, zzwVar));
        v();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task q(Executor executor, h3v0 h3v0Var) {
        zzw zzwVar = new zzw();
        this.b.e(new o3a1(executor, h3v0Var, zzwVar));
        v();
        return zzwVar;
    }

    public final void r(Exception exc) {
        cvw.m(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                throw DuplicateTaskCompletionException.a(this);
            }
            this.c = true;
            this.f = exc;
        }
        this.b.f(this);
    }

    public final void s(Object obj) {
        synchronized (this.a) {
            if (this.c) {
                throw DuplicateTaskCompletionException.a(this);
            }
            this.c = true;
            this.e = obj;
        }
        this.b.f(this);
    }

    public final void t() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.f(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.f(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
