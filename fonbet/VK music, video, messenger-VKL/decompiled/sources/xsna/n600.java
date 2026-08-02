package xsna;

/* compiled from: LookaheadLayoutCoordinates.kt */
/* loaded from: classes11.dex */
public final class n600 implements tny {
    public final m600 b;

    public n600(m600 m600Var) {
        this.b = m600Var;
    }

    @Override // xsna.tny
    public final long D(long j) {
        return this.b.q.D(ov70.f(j, b()));
    }

    @Override // xsna.tny
    public final long F(long j) {
        return ov70.f(this.b.q.F(j), b());
    }

    @Override // xsna.tny
    public final long S(tny tnyVar, long j) {
        boolean z = tnyVar instanceof n600;
        m600 m600Var = this.b;
        if (!z) {
            m600 n = up2.n(m600Var);
            n600 n600Var = n.t;
            tny tnyVar2 = n.q;
            long S = S(n600Var, j);
            long j2 = n.r;
            long e = ov70.e(S, (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            tny b0 = tnyVar2.b0();
            if (b0 != null) {
                tnyVar2 = b0;
            }
            return ov70.f(e, ((androidx.compose.ui.node.o) tnyVar2).S(tnyVar, 0L));
        }
        m600 m600Var2 = ((n600) tnyVar).b;
        androidx.compose.ui.node.o oVar = m600Var2.q;
        oVar.R1();
        m600 w1 = m600Var.q.q1(oVar).w1();
        if (w1 != null) {
            long c = h9x.c(h9x.d(m600Var2.i1(w1, false), n34.A(j)), m600Var.i1(w1, false));
            return (Float.floatToRawIntBits((int) (c >> 32)) << 32) | (Float.floatToRawIntBits((int) (c & 4294967295L)) & 4294967295L);
        }
        m600 n2 = up2.n(m600Var2);
        long d = h9x.d(h9x.d(m600Var2.i1(n2, false), n2.r), n34.A(j));
        m600 n3 = up2.n(m600Var);
        long c2 = h9x.c(d, h9x.d(m600Var.i1(n3, false), n3.r));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (c2 >> 32));
        return n3.q.u.S(n2.q.u, (Float.floatToRawIntBits((int) (c2 & 4294967295L)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    @Override // xsna.tny
    public final void T(tny tnyVar, float[] fArr) {
        this.b.q.T(tnyVar, fArr);
    }

    @Override // xsna.tny
    public final long U(long j) {
        return this.b.q.U(ov70.f(j, b()));
    }

    @Override // xsna.tny
    public final long a() {
        m600 m600Var = this.b;
        return (m600Var.b << 32) | (m600Var.c & 4294967295L);
    }

    public final long b() {
        m600 m600Var = this.b;
        m600 n = up2.n(m600Var);
        return ov70.e(S(n.t, 0L), m600Var.q.S(n.q, 0L));
    }

    @Override // xsna.tny
    public final tny b0() {
        m600 w1;
        if (!e()) {
            uzw.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        androidx.compose.ui.node.o oVar = this.b.q.u;
        if (oVar == null || (w1 = oVar.w1()) == null) {
            return null;
        }
        return w1.t;
    }

    @Override // xsna.tny
    public final boolean e() {
        return this.b.q.D1().o;
    }

    @Override // xsna.tny
    public final long k(long j) {
        return this.b.q.k(ov70.f(0L, b()));
    }

    @Override // xsna.tny
    public final void k0(float[] fArr) {
        this.b.q.k0(fArr);
    }

    @Override // xsna.tny
    public final long p(long j) {
        return ov70.f(this.b.q.p(j), b());
    }

    @Override // xsna.tny
    public final long w(tny tnyVar, long j) {
        return S(tnyVar, j);
    }

    @Override // xsna.tny
    public final tny y() {
        m600 w1;
        if (!e()) {
            uzw.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        androidx.compose.ui.node.o oVar = this.b.q.q.G.d.u;
        if (oVar == null || (w1 = oVar.w1()) == null) {
            return null;
        }
        return w1.t;
    }

    @Override // xsna.tny
    public final zhf0 z(tny tnyVar, boolean z) {
        return this.b.q.z(tnyVar, z);
    }
}
