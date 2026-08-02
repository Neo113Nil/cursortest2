package xsna;

import one.video.exo.preload.PreloadException;
import xsna.j1d0;
import xsna.q1d0;

/* compiled from: PreloadManager.kt */
/* loaded from: classes8.dex */
public final class k1d0 implements q1d0.c {
    public final /* synthetic */ j1d0 a;

    public k1d0(j1d0 j1d0Var) {
        this.a = j1d0Var;
    }

    @Override // xsna.q1d0.c
    public final void a(PreloadException preloadException, q1d0 q1d0Var) {
        j1d0 j1d0Var = this.a;
        new Exception(preloadException.getMessage(), preloadException.getCause());
        e1d0 e1d0Var = j1d0Var.g;
        synchronized (e1d0Var) {
            if (e1d0Var.b.get(q1d0Var) != null) {
                j1d0Var.d.post(new g1d0());
                s3q0 s3q0Var = s3q0.a;
            }
        }
        j1d0.b(this.a, q1d0Var);
    }

    @Override // xsna.q1d0.c
    public final void b(q1d0 q1d0Var) {
        j1d0.b(this.a, q1d0Var);
    }

    @Override // xsna.q1d0.c
    public final boolean c(q1d0 q1d0Var) {
        j1d0 j1d0Var = this.a;
        if (j1d0.a(j1d0Var, q1d0Var) != null) {
            return true;
        }
        j1d0.b(j1d0Var, q1d0Var);
        return false;
    }

    @Override // xsna.q1d0.c
    public final boolean d(q1d0 q1d0Var, long j) {
        j1d0.b a = j1d0.a(this.a, q1d0Var);
        long j0 = y2r0.j0(j);
        if (a == null) {
            j1d0.b(this.a, q1d0Var);
            return false;
        }
        j1d0 j1d0Var = this.a;
        e1d0 e1d0Var = j1d0Var.g;
        synchronized (e1d0Var) {
            if (e1d0Var.b.get(q1d0Var) != null) {
                j1d0Var.d.post(new h1d0());
                s3q0 s3q0Var = s3q0.a;
            }
        }
        if (j0 >= 0 && j0 < a.a) {
            return true;
        }
        j1d0 j1d0Var2 = this.a;
        e1d0 e1d0Var2 = j1d0Var2.g;
        synchronized (e1d0Var2) {
            sht0 sht0Var = e1d0Var2.b.get(q1d0Var);
            if (sht0Var != null) {
                j1d0Var2.d.post(new d8h(5, j1d0Var2, sht0Var));
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
        j1d0.b(this.a, q1d0Var);
        return false;
    }

    @Override // xsna.q1d0.c
    public final void e(q1d0 q1d0Var) {
        j1d0 j1d0Var = this.a;
        e1d0 e1d0Var = j1d0Var.g;
        synchronized (e1d0Var) {
            sht0 sht0Var = e1d0Var.b.get(q1d0Var);
            if (sht0Var != null) {
                j1d0Var.d.post(new d8h(5, j1d0Var, sht0Var));
                s3q0 s3q0Var = s3q0.a;
            }
        }
        j1d0.b(j1d0Var, q1d0Var);
    }

    @Override // xsna.q1d0.c
    public final boolean f(q1d0 q1d0Var) {
        j1d0 j1d0Var = this.a;
        if (j1d0.a(j1d0Var, q1d0Var) != null) {
            return true;
        }
        j1d0.b(j1d0Var, q1d0Var);
        return false;
    }
}
