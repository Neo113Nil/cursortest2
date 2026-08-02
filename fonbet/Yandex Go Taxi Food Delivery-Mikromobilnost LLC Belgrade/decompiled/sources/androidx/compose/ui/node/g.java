package androidx.compose.ui.node;

import defpackage.d1y;
import defpackage.e530;
import defpackage.eb2;
import defpackage.i28;
import defpackage.k6w;
import defpackage.kt1;
import defpackage.ldc;
import defpackage.noz;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.qy40;
import defpackage.tls;
import defpackage.v0y;
import defpackage.w0y;
import defpackage.xcb1;
import defpackage.z5w;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class g extends s {
    public static final eb2 s0;
    public v0y q0;
    public w0y r0;

    static {
        eb2 eb2Var = new eb2();
        eb2Var.f(ldc.i);
        eb2Var.m(1.0f);
        eb2Var.n(1);
        s0 = eb2Var;
    }

    public g(LayoutNode layoutNode, v0y v0yVar) {
        super(layoutNode);
        this.q0 = v0yVar;
        this.r0 = layoutNode.A != null ? new w0y(this) : null;
        if ((v0yVar.getNode().getKindSet$ui() & 512) == 0) {
            return;
        }
        ny61.u();
        throw null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int C0(kt1 kt1Var) {
        w0y w0yVar = this.r0;
        if (w0yVar == null) {
            return xcb1.a(this, kt1Var);
        }
        qy40 qy40Var = w0yVar.N;
        int d = qy40Var.d(kt1Var);
        if (d >= 0) {
            return qy40Var.c[d];
        }
        return Integer.MIN_VALUE;
    }

    public final void D1() {
        if (this.C) {
            return;
        }
        m1();
        s sVar = this.J;
        sVar.D = this.D;
        J0().c();
        sVar.D = false;
    }

    public final void E1(v0y v0yVar) {
        if (v0yVar.equals(this.q0) || (v0yVar.getNode().getKindSet$ui() & 512) == 0) {
            this.q0 = v0yVar;
        } else {
            nzs.j(v0yVar);
            throw null;
        }
    }

    @Override // defpackage.x910
    public final int V(int i) {
        return this.q0.l0(this, this.J, i);
    }

    @Override // androidx.compose.ui.node.s
    public final void W0() {
        if (this.r0 == null) {
            this.r0 = new w0y(this);
        }
    }

    @Override // androidx.compose.ui.node.s
    public final noz Z0() {
        return this.r0;
    }

    @Override // androidx.compose.ui.node.s
    public final e530 b1() {
        return this.q0.getNode();
    }

    @Override // defpackage.x910
    public final int e0(int i) {
        return this.q0.b(this, this.J, i);
    }

    @Override // defpackage.x910
    public final int k0(int i) {
        return this.q0.O(this, this.J, i);
    }

    @Override // defpackage.x910
    public final androidx.compose.ui.layout.o l0(long j) {
        z0(j);
        u1(this.q0.e(this, this.J, j));
        l1();
        return this;
    }

    @Override // androidx.compose.ui.node.s
    public final void q1(i28 i28Var, androidx.compose.ui.graphics.layer.a aVar) {
        s sVar;
        this.J.U0(i28Var, aVar);
        if (!d1y.a(this.I).getShowLayoutBounds() || (sVar = this.J) == null) {
            return;
        }
        if (k6w.a(this.c, sVar.c) && z5w.a(sVar.T, 0L)) {
            return;
        }
        long j = this.c;
        i28Var.i(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - 0.5f, s0);
    }

    @Override // androidx.compose.ui.layout.o
    public final void s0(long j, float f, tls tlsVar) {
        r1(j, f, tlsVar, null);
        D1();
    }

    @Override // androidx.compose.ui.node.s, androidx.compose.ui.layout.o
    public final void x0(long j, float f, androidx.compose.ui.graphics.layer.a aVar) {
        r1(j, f, null, aVar);
        D1();
    }

    @Override // defpackage.x910
    public final int y(int i) {
        return this.q0.v(this, this.J, i);
    }
}
