package defpackage;

/* loaded from: classes10.dex */
public final class bx40 implements y9t0 {
    public final /* synthetic */ cx40 a;

    public bx40(cx40 cx40Var) {
        this.a = cx40Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        cx40 cx40Var = this.a;
        if (jl40.l(cx40Var.z, this)) {
            cx40Var.z = null;
        }
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return 0L;
        }
        cx40 cx40Var = this.a;
        if (!jl40.l(cx40Var.z, this)) {
            ny61.r("closed");
            return 0L;
        }
        long a = cx40Var.a(j);
        if (a == 0) {
            return -1L;
        }
        return cx40Var.a.read(yp6Var, a);
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return this.a.a.timeout();
    }
}
