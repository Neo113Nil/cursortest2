package defpackage;

import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.s;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class c1y implements qam {
    public final k28 a;
    public pam b;

    public c1y(int i) {
        this.a = new k28();
    }

    @Override // defpackage.qam
    public final void B0(long j, long j2, long j3, float f, wec wecVar, int i) {
        this.a.B0(j, j2, j3, f, wecVar, i);
    }

    @Override // defpackage.qam
    public final void C(l8v l8vVar, long j, long j2, long j3, long j4, float f, wec wecVar, int i, int i2) {
        this.a.C(l8vVar, j, j2, j3, j4, f, wecVar, i, i2);
    }

    @Override // defpackage.qam
    public final void F(long j, float f, float f2, boolean z, long j2, long j3, ram ramVar, int i) {
        this.a.F(j, f, f2, z, j2, j3, ramVar, i);
    }

    @Override // defpackage.fwi
    public final float H(int i) {
        return this.a.H(i);
    }

    @Override // defpackage.fwi
    public final float I(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.qam
    public final void J(long j, float f, long j2, float f2, ram ramVar, int i) {
        this.a.J(j, f, j2, f2, ramVar, i);
    }

    @Override // defpackage.qam
    public final void L(long j, long j2, long j3, long j4, ram ramVar, int i) {
        this.a.L(j, j2, j3, j4, ramVar, i);
    }

    @Override // defpackage.qam
    public final nfh N() {
        return this.a.b;
    }

    @Override // defpackage.qam
    public final long P() {
        return this.a.P();
    }

    @Override // defpackage.fwi
    public final long R(long j) {
        return this.a.R(j);
    }

    @Override // defpackage.fwi
    public final long W(float f) {
        return this.a.W(f);
    }

    public final void a() {
        k28 k28Var = this.a;
        i28 q = k28Var.b.q();
        pam pamVar = this.b;
        if (pamVar == null) {
            throw x4e.v("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        e530 child$ui = pamVar.getNode().getChild$ui();
        if (child$ui != null && (child$ui.getAggregateChildKindSet$ui() & 4) != 0) {
            while (child$ui != null && (child$ui.getKindSet$ui() & 2) == 0) {
                if ((child$ui.getKindSet$ui() & 4) != 0) {
                    break;
                } else {
                    child$ui = child$ui.getChild$ui();
                }
            }
        }
        child$ui = null;
        if (child$ui == null) {
            s N = qje.N(pamVar, 4);
            if (N.b1() == pamVar.getNode()) {
                N = N.J;
            }
            N.q1(q, (a) k28Var.b.b);
            return;
        }
        wz40 wz40Var = null;
        while (child$ui != null) {
            if (child$ui instanceof pam) {
                pam pamVar2 = (pam) child$ui;
                a aVar = (a) k28Var.b.b;
                s N2 = qje.N(pamVar2, 4);
                long a0 = rzo.a0(N2.c);
                LayoutNode layoutNode = N2.I;
                layoutNode.getClass();
                d1y.a(layoutNode).getSharedDrawScope().b(q, a0, N2, pamVar2, aVar);
            } else if ((child$ui.getKindSet$ui() & 4) != 0 && (child$ui instanceof lqh)) {
                int i = 0;
                for (e530 e530Var = ((lqh) child$ui).b; e530Var != null; e530Var = e530Var.getChild$ui()) {
                    if ((e530Var.getKindSet$ui() & 4) != 0) {
                        i++;
                        if (i == 1) {
                            child$ui = e530Var;
                        } else {
                            if (wz40Var == null) {
                                wz40Var = new wz40(new e530[16]);
                            }
                            if (child$ui != null) {
                                wz40Var.b(child$ui);
                                child$ui = null;
                            }
                            wz40Var.b(e530Var);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            child$ui = qje.c(wz40Var);
        }
    }

    @Override // defpackage.qam
    public final void a0(rq90 rq90Var, long j, ram ramVar) {
        this.a.a0(rq90Var, j, ramVar);
    }

    public final void b(i28 i28Var, long j, s sVar, pam pamVar, a aVar) {
        pam pamVar2 = this.b;
        this.b = pamVar;
        LayoutDirection layoutDirection = sVar.I.S;
        k28 k28Var = this.a;
        fwi r = k28Var.b.r();
        nfh nfhVar = k28Var.b;
        LayoutDirection t = nfhVar.t();
        i28 q = nfhVar.q();
        long v = nfhVar.v();
        a aVar2 = (a) nfhVar.b;
        nfhVar.B(sVar);
        nfhVar.D(layoutDirection);
        nfhVar.A(i28Var);
        nfhVar.E(j);
        nfhVar.b = aVar;
        i28Var.save();
        try {
            pamVar.d(this);
            i28Var.n();
            nfhVar.B(r);
            nfhVar.D(t);
            nfhVar.A(q);
            nfhVar.E(v);
            nfhVar.b = aVar2;
            this.b = pamVar2;
        } catch (Throwable th) {
            i28Var.n();
            nfhVar.B(r);
            nfhVar.D(t);
            nfhVar.A(q);
            nfhVar.E(v);
            nfhVar.b = aVar2;
            throw th;
        }
    }

    @Override // defpackage.qam
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.qam
    public final void c0(ml6 ml6Var, long j, long j2, float f, ram ramVar, int i) {
        this.a.c0(ml6Var, j, j2, f, ramVar, i);
    }

    @Override // defpackage.fwi
    public final long f(long j) {
        return this.a.f(j);
    }

    @Override // defpackage.fwi
    public final int f0(float f) {
        return this.a.f0(f);
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.qam
    public final LayoutDirection getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // defpackage.qam
    public final void h(long j, long j2, long j3, float f, int i, kb2 kb2Var) {
        this.a.h(j, j2, j3, f, i, kb2Var);
    }

    @Override // defpackage.fwi
    public final float i(long j) {
        return this.a.i(j);
    }

    @Override // defpackage.fwi
    public final float i0(long j) {
        return this.a.i0(j);
    }

    @Override // defpackage.qam
    public final void k(long j, long j2, long j3, ram ramVar) {
        this.a.k(j, j2, j3, ramVar);
    }

    @Override // defpackage.fwi
    public final long n(float f) {
        return this.a.n(f);
    }

    @Override // defpackage.qam
    public final void q0(rq90 rq90Var, ml6 ml6Var, float f, ram ramVar, int i) {
        this.a.q0(rq90Var, ml6Var, f, ramVar, i);
    }

    @Override // defpackage.qam
    public final void r(ml6 ml6Var, long j, float f) {
        this.a.r(ml6Var, j, f);
    }

    @Override // defpackage.qam
    public final void s(zfr0 zfr0Var, float f, float f2, long j, long j2, jvu0 jvu0Var) {
        this.a.s(zfr0Var, f, f2, j, j2, jvu0Var);
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.a.u0();
    }

    @Override // defpackage.qam
    public final void v0(ml6 ml6Var, long j, long j2, long j3, float f, ram ramVar) {
        this.a.v0(ml6Var, j, j2, j3, f, ramVar);
    }

    @Override // defpackage.fwi
    public final float w0(float f) {
        return this.a.getDensity() * f;
    }

    public c1y() {
        this(0);
    }
}
