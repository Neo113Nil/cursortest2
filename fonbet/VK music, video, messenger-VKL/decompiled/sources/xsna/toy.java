package xsna;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;
import xsna.er9;
import xsna.q630;

/* compiled from: LayoutNodeDrawScope.kt */
/* loaded from: classes11.dex */
public final class toy implements oio, ggj {
    public final er9 b = new er9();
    public lio c;

    /* compiled from: LayoutNodeDrawScope.kt */
    public static final class a extends Lambda implements izs<oio, s3q0> {
        final /* synthetic */ izs<oio, s3q0> $block;
        final /* synthetic */ lio $currentDrawNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(lio lioVar, izs<? super oio, s3q0> izsVar) {
            super(1);
            this.$currentDrawNode = lioVar;
            this.$block = izsVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(oio oioVar) {
            a aVar;
            oio oioVar2 = oioVar;
            toy toyVar = toy.this;
            lio lioVar = toyVar.c;
            er9 er9Var = toyVar.b;
            toyVar.c = this.$currentDrawNode;
            try {
                azl b = oioVar2.a0().b();
                LayoutDirection c = oioVar2.a0().c();
                yq9 a = oioVar2.a0().a();
                long d = oioVar2.a0().d();
                mdu mduVar = oioVar2.a0().b;
                izs<oio, s3q0> izsVar = this.$block;
                azl b2 = er9Var.c.b();
                LayoutDirection c2 = er9Var.c.c();
                yq9 a2 = er9Var.c.a();
                long d2 = er9Var.c.d();
                try {
                    er9.b bVar = er9Var.c;
                    try {
                        mdu mduVar2 = bVar.b;
                        bVar.f(b);
                        bVar.g(c);
                        bVar.e(a);
                        bVar.h(d);
                        bVar.b = mduVar;
                        a.e();
                        try {
                            izsVar.invoke(toyVar);
                            a.a();
                            er9.b bVar2 = er9Var.c;
                            bVar2.f(b2);
                            bVar2.g(c2);
                            bVar2.e(a2);
                            bVar2.h(d2);
                            bVar2.b = mduVar2;
                            toy.this.c = lioVar;
                            return s3q0.a;
                        } catch (Throwable th) {
                            aVar = this;
                            lioVar = lioVar;
                            try {
                                a.a();
                                er9.b bVar3 = er9Var.c;
                                bVar3.f(b2);
                                bVar3.g(c2);
                                bVar3.e(a2);
                                bVar3.h(d2);
                                bVar3.b = mduVar2;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                toy.this.c = lioVar;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        aVar = this;
                        lioVar = lioVar;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    lioVar = lioVar;
                    aVar = this;
                    toy.this.c = lioVar;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // xsna.oio
    public final void B1(Path path, yk8 yk8Var, float f, qio qioVar, d6g d6gVar, int i) {
        this.b.B1(path, yk8Var, f, qioVar, d6gVar, i);
    }

    @Override // xsna.oio
    public final void C(yk8 yk8Var, float f, long j, long j2, frm0 frm0Var) {
        this.b.C(yk8Var, f, j, j2, frm0Var);
    }

    @Override // xsna.oio
    public final void D0(long j, float f, float f2, long j2, long j3, float f3, qio qioVar) {
        this.b.D0(j, f, f2, j2, j3, f3, qioVar);
    }

    @Override // xsna.azl
    public final long E(long j) {
        return this.b.E(j);
    }

    @Override // xsna.oio
    public final void G(long j, long j2, qio qioVar) {
        this.b.G(j, j2, qioVar);
    }

    @Override // xsna.azl
    public final long I(int i) {
        return this.b.I(i);
    }

    @Override // xsna.azl
    public final float I0(float f) {
        return this.b.getDensity() * f;
    }

    @Override // xsna.azl
    public final long J(float f) {
        return this.b.J(f);
    }

    @Override // xsna.oio
    public final void M1(agw agwVar, long j, long j2, long j3, long j4, float f, qio qioVar, d6g d6gVar, int i, int i2) {
        this.b.M1(agwVar, j, j2, j3, j4, f, qioVar, d6gVar, i, i2);
    }

    @Override // xsna.oio
    public final void N1(long j, izs izsVar, mdu mduVar) {
        mduVar.e(this, getLayoutDirection(), j, new a(this.c, izsVar));
    }

    @Override // xsna.azl
    public final float O0(long j) {
        return this.b.O0(j);
    }

    @Override // xsna.oio
    public final void T0(yk8 yk8Var, long j, long j2, long j3, float f, qio qioVar, d6g d6gVar, int i) {
        this.b.T0(yk8Var, j, j2, j3, f, qioVar, d6gVar, i);
    }

    @Override // xsna.oio
    public final void U1(long j, float f, long j2, float f2, qio qioVar, d6g d6gVar, int i) {
        this.b.U1(j, f, j2, f2, qioVar, d6gVar, i);
    }

    @Override // xsna.oio
    public final void V(Path path, long j, float f, qio qioVar) {
        this.b.V(path, j, f, qioVar);
    }

    @Override // xsna.oio
    public final void V0(yk8 yk8Var, long j, long j2, float f, float f2) {
        this.b.V0(yk8Var, j, j2, f, f2);
    }

    @Override // xsna.oio
    public final er9.b a0() {
        return this.b.c;
    }

    @Override // xsna.oio
    public final void b1(float f, int i, int i2, long j, long j2, long j3) {
        this.b.b1(f, i, i2, j, j2, j3);
    }

    public final void c(yq9 yq9Var, long j, androidx.compose.ui.node.o oVar, lio lioVar, mdu mduVar) {
        lio lioVar2 = this.c;
        this.c = lioVar;
        LayoutDirection layoutDirection = oVar.q.A;
        er9 er9Var = this.b;
        azl b = er9Var.c.b();
        er9.b bVar = er9Var.c;
        LayoutDirection c = bVar.c();
        yq9 a2 = bVar.a();
        long d = bVar.d();
        mdu mduVar2 = bVar.b;
        bVar.f(oVar);
        bVar.g(layoutDirection);
        bVar.e(yq9Var);
        bVar.h(j);
        bVar.b = mduVar;
        yq9Var.e();
        try {
            lioVar.v(this);
            yq9Var.a();
            bVar.f(b);
            bVar.g(c);
            bVar.e(a2);
            bVar.h(d);
            bVar.b = mduVar2;
            this.c = lioVar2;
        } catch (Throwable th) {
            yq9Var.a();
            bVar.f(b);
            bVar.g(c);
            bVar.e(a2);
            bVar.h(d);
            bVar.b = mduVar2;
            throw th;
        }
    }

    @Override // xsna.oio
    public final long d() {
        return this.b.d();
    }

    @Override // xsna.oio
    public final void d0(long j, long j2, long j3, float f, qio qioVar, d6g d6gVar, int i) {
        this.b.d0(j, j2, j3, f, qioVar, d6gVar, i);
    }

    @Override // xsna.oio
    public final void e0(agw agwVar, long j, float f, qio qioVar, d6g d6gVar, int i) {
        this.b.e0(agwVar, j, f, qioVar, d6gVar, i);
    }

    @Override // xsna.azl
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return this.b.getFontScale();
    }

    @Override // xsna.oio
    public final LayoutDirection getLayoutDirection() {
        return this.b.b.b;
    }

    @Override // xsna.azl
    public final long i0(float f) {
        return this.b.i0(f);
    }

    @Override // xsna.azl
    public final float j1(int i) {
        return this.b.j1(i);
    }

    @Override // xsna.azl
    public final float k1(float f) {
        return f / this.b.getDensity();
    }

    @Override // xsna.oio
    public final long n1() {
        return this.b.n1();
    }

    @Override // xsna.azl
    public final long p1(long j) {
        return this.b.p1(j);
    }

    @Override // xsna.azl
    public final int r0(float f) {
        return this.b.r0(f);
    }

    @Override // xsna.ggj
    public final void s1() {
        er9 er9Var = this.b;
        yq9 a2 = er9Var.c.a();
        lio lioVar = this.c;
        if (lioVar == null) {
            throw pm0.f("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        q630.c cVar = lioVar.z().g;
        if (cVar != null && (cVar.e & 4) != 0) {
            while (cVar != null) {
                int i = cVar.d;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    cVar = cVar.g;
                }
            }
        }
        cVar = null;
        if (cVar == null) {
            androidx.compose.ui.node.o d = itl.d(lioVar, 4);
            if (d.D1() == lioVar.z()) {
                d = d.t;
            }
            d.Z1(a2, er9Var.c.b);
            return;
        }
        ci50 ci50Var = null;
        while (cVar != null) {
            if (cVar instanceof lio) {
                lio lioVar2 = (lio) cVar;
                mdu mduVar = er9Var.c.b;
                androidx.compose.ui.node.o d2 = itl.d(lioVar2, 4);
                long w = pli.w(d2.d);
                LayoutNode layoutNode = d2.q;
                layoutNode.getClass();
                voy.a(layoutNode).getSharedDrawScope().c(a2, w, d2, lioVar2, mduVar);
            } else if ((cVar.d & 4) != 0 && (cVar instanceof ytl)) {
                int i2 = 0;
                for (q630.c cVar2 = ((ytl) cVar).q; cVar2 != null; cVar2 = cVar2.g) {
                    if ((cVar2.d & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            cVar = cVar2;
                        } else {
                            if (ci50Var == null) {
                                ci50Var = new ci50(new q630.c[16]);
                            }
                            if (cVar != null) {
                                ci50Var.b(cVar);
                                cVar = null;
                            }
                            ci50Var.b(cVar2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            cVar = itl.b(ci50Var);
        }
    }

    @Override // xsna.oio
    public final void t0(yk8 yk8Var, long j, long j2, float f, qio qioVar, d6g d6gVar, int i) {
        this.b.t0(yk8Var, j, j2, f, qioVar, d6gVar, i);
    }

    @Override // xsna.azl
    public final float u0(long j) {
        return this.b.u0(j);
    }

    @Override // xsna.oio
    public final void w0(long j, long j2, long j3, long j4, qio qioVar, int i) {
        this.b.w0(j, j2, j3, j4, qioVar, i);
    }
}
