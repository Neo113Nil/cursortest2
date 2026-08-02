package xsna;

/* compiled from: PeekSource.kt */
/* loaded from: classes8.dex */
public final class vs90 implements agk0 {
    public final bn8 b;
    public final vl8 c;
    public m4i0 d;
    public int e;
    public boolean f;
    public long g;

    public vs90(bn8 bn8Var) {
        this.b = bn8Var;
        vl8 C = bn8Var.C();
        this.c = C;
        m4i0 m4i0Var = C.b;
        this.d = m4i0Var;
        this.e = m4i0Var != null ? m4i0Var.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f = true;
    }

    @Override // xsna.agk0
    public final long read(vl8 vl8Var, long j) {
        m4i0 m4i0Var;
        m4i0 m4i0Var2;
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
        }
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        m4i0 m4i0Var3 = this.d;
        vl8 vl8Var2 = this.c;
        if (m4i0Var3 != null && (m4i0Var3 != (m4i0Var2 = vl8Var2.b) || this.e != m4i0Var2.b)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.b.o3(this.g + 1)) {
            return -1L;
        }
        if (this.d == null && (m4i0Var = vl8Var2.b) != null) {
            this.d = m4i0Var;
            this.e = m4i0Var.b;
        }
        long min = Math.min(j, vl8Var2.c - this.g);
        this.c.p(vl8Var, this.g, min);
        this.g += min;
        return min;
    }

    @Override // xsna.agk0
    public final mxo0 timeout() {
        return this.b.timeout();
    }
}
