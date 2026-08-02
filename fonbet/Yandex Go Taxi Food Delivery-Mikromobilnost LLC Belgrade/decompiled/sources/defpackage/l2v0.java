package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public abstract class l2v0 extends oyg implements e2v0 {
    public e2v0 w;
    public long x;

    @Override // defpackage.e2v0
    public final long c(int i) {
        e2v0 e2v0Var = this.w;
        e2v0Var.getClass();
        return e2v0Var.c(i) + this.x;
    }

    @Override // defpackage.oyg
    public final void d() {
        super.d();
        this.w = null;
    }

    @Override // defpackage.e2v0
    public final int g() {
        e2v0 e2v0Var = this.w;
        e2v0Var.getClass();
        return e2v0Var.g();
    }

    @Override // defpackage.e2v0
    public final int h(long j) {
        e2v0 e2v0Var = this.w;
        e2v0Var.getClass();
        return e2v0Var.h(j - this.x);
    }

    @Override // defpackage.e2v0
    public final List i(long j) {
        e2v0 e2v0Var = this.w;
        e2v0Var.getClass();
        return e2v0Var.i(j - this.x);
    }
}
