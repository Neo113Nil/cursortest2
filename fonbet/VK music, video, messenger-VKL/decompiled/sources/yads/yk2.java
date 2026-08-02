package yads;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import xsna.pft0;
import xsna.pu50;

/* loaded from: classes10.dex */
public final class yk2 implements sj0 {
    public final Executor a;
    public final u30 b;
    public final rr c;
    public final bs d;
    public rj0 e;
    public volatile xk2 f;
    public volatile boolean g;

    public yk2(gn1 gn1Var, qr qrVar, Executor executor) {
        this.a = (Executor) ni.a(executor);
        ni.a(gn1Var.c);
        u30 a = new t30().a(gn1Var.c.a).a(gn1Var.c.e).a(4).a();
        this.b = a;
        rr a2 = qrVar.a();
        this.c = a2;
        this.d = new bs(a2, a, null, new pu50(this, 22));
    }

    @Override // yads.sj0
    public final void a(rj0 rj0Var) {
        this.e = rj0Var;
        this.f = new xk2(this);
        try {
            if (!this.g) {
                this.a.execute(this.f);
                try {
                    xk2 xk2Var = this.f;
                    xk2Var.c.a();
                    xk2Var.c();
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i = mc3.a;
                    throw cause;
                }
            }
        } finally {
            this.f.c.b();
        }
    }

    @Override // yads.sj0
    public final void cancel() {
        this.g = true;
        xk2 xk2Var = this.f;
        if (xk2Var != null) {
            xk2Var.cancel(true);
        }
    }

    @Override // yads.sj0
    public final void remove() {
        rr rrVar = this.c;
        nr nrVar = rrVar.a;
        yr yrVar = rrVar.e;
        u30 u30Var = this.b;
        ((pft0) yrVar).getClass();
        ((zz2) nrVar).c(yr.b(u30Var));
    }

    public final void a(long j, long j2, long j3) {
        rj0 rj0Var = this.e;
        if (rj0Var == null) {
            return;
        }
        ((mj0) rj0Var).a(j, j2, (j == -1 || j == 0) ? -1.0f : (j2 * 100.0f) / j);
    }
}
