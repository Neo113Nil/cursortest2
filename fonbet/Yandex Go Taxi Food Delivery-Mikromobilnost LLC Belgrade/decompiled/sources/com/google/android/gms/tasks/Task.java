package com.google.android.gms.tasks;

import defpackage.h3v0;
import defpackage.iy60;
import defpackage.pke;
import defpackage.sx60;
import defpackage.t070;
import defpackage.wx60;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class Task {
    public void a(Executor executor, sx60 sx60Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public void b(wx60 wx60Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void c(Executor executor, wx60 wx60Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract zzw d(iy60 iy60Var);

    public abstract zzw e(Executor executor, iy60 iy60Var);

    public abstract zzw f(t070 t070Var);

    public abstract zzw g(Executor executor, t070 t070Var);

    public Task h(Executor executor, pke pkeVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task i(Executor executor, pke pkeVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception j();

    public abstract Object k();

    public abstract Object l(Class cls);

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public Task p(h3v0 h3v0Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task q(Executor executor, h3v0 h3v0Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
