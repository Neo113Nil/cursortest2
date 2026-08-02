package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.external_service.view.ExternalServiceModalView;
import ru.yandex.taxi.deeplinks.a;
import ru.yandex.taxi.deeplinks.b;

/* loaded from: classes12.dex */
public final class p2p extends m230 {
    public final i6r E;
    public final yvf0 F;
    public final yvf0 G;
    public final yvf0 H;
    public final yvf0 I;
    public final yvf0 J;
    public final yi7 K;
    public final yvf0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final yvf0 O;
    public final h3y P;
    public final yvf0 Q;
    public final yvf0 R;
    public final yvf0 S;
    public final kdn T;
    public final yvf0 U;
    public final rit V;
    public final kwq0 W;
    public final b Z;
    public final yvf0 a0;
    public final edn b0;
    public final w030 c0;
    public final boolean d0;
    public final j1p e0;
    public i1p f0;

    public p2p(i6r i6rVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yi7 yi7Var, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, h3y h3yVar, yvf0 yvf0Var10, yvf0 yvf0Var11, yvf0 yvf0Var12, kdn kdnVar, yvf0 yvf0Var13, rit ritVar, kwq0 kwq0Var, b bVar, yvf0 yvf0Var14, edn ednVar) {
        super(null);
        this.E = i6rVar;
        this.F = yvf0Var;
        this.G = yvf0Var2;
        this.H = yvf0Var3;
        this.I = yvf0Var4;
        this.J = yvf0Var5;
        this.K = yi7Var;
        this.L = yvf0Var6;
        this.M = yvf0Var7;
        this.N = yvf0Var8;
        this.O = yvf0Var9;
        this.P = h3yVar;
        this.Q = yvf0Var10;
        this.R = yvf0Var11;
        this.S = yvf0Var12;
        this.T = kdnVar;
        this.U = yvf0Var13;
        this.V = ritVar;
        this.W = kwq0Var;
        this.Z = bVar;
        this.a0 = yvf0Var14;
        this.b0 = ednVar;
        c0g c0gVar = (c0g) i6rVar;
        this.c0 = c0gVar.C2();
        this.d0 = true;
        this.e0 = (j1p) c0gVar.A.a.I2.get();
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        f2p f2pVar = (f2p) obj;
        i1p i1pVar = this.f0;
        if (i1pVar != null) {
            ((t2p) ((uzf) i1pVar).q.get()).a = hwu0.a;
            this.e0.a.d(f2pVar.b.a, i1pVar);
        }
        this.f0 = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        h1p h1pVar = ((f2p) obj).b.a;
        a.c(o(), this.Z, new com.yandex.go.external_service.router.a(this, h1pVar));
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.c0;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        f2p f2pVar = (f2p) obj;
        i1p i1pVar = this.f0;
        if (i1pVar != null) {
            uzf uzfVar = (uzf) i1pVar;
            T(uzfVar.b);
            ExternalServiceModalView externalServiceModalView = (ExternalServiceModalView) uzfVar.f0.get();
            uzfVar.a.a = f2pVar.a;
            externalServiceModalView.fixReused();
            return externalServiceModalView;
        }
        x6w0 x6w0Var = f2pVar.b;
        i1p i1pVar2 = (i1p) this.e0.a.e(x6w0Var.a);
        if (i1pVar2 != null) {
            T(((uzf) i1pVar2).b);
        } else {
            y3p y3pVar = (y3p) this.U.get();
            kwq0 kwq0Var = this.W;
            rvq0 rvq0Var = new rvq0(kwq0Var.a, kwq0Var.b);
            T(rvq0Var);
            bp90 bp90Var = (bp90) this.a0.get();
            i6r i6rVar = this.E;
            i6rVar.getClass();
            y3pVar.getClass();
            bp90Var.getClass();
            i1pVar2 = new uzf(i6rVar, x6w0Var, y3pVar, rvq0Var, bp90Var);
        }
        this.f0 = i1pVar2;
        uzf uzfVar2 = (uzf) i1pVar2;
        ((t2p) uzfVar2.q.get()).a = new o2p(this, x6w0Var);
        x1p x1pVar = (x1p) uzfVar2.g.get();
        o950 lifecycle = getLifecycle();
        if (x1pVar.c != null) {
            xby.t(jst.e, "SUPERAPP:EXTERNAL_SERVICE:LIFECYCLE", null, "Already has lifecycle observer", 6);
        }
        l30 l30Var = x1pVar.c;
        if (l30Var != null) {
            l30Var.cancel();
        }
        x1pVar.c = null;
        if (lifecycle.w != Lifecycle.State.DESTROYED) {
            w1p w1pVar = new w1p(x1pVar);
            lifecycle.a(w1pVar);
            x1pVar.c = new l30(5, lifecycle, w1pVar);
        }
        ExternalServiceModalView externalServiceModalView2 = (ExternalServiceModalView) uzfVar2.f0.get();
        uzfVar2.a.a = f2pVar.a;
        externalServiceModalView2.fixReused();
        return externalServiceModalView2;
    }

    public final void T(rvq0 rvq0Var) {
        gdn gdnVar = this.V.b;
        gdn gdnVar2 = rvq0Var.c;
        gdnVar2.a();
        gdnVar2.a.putAll(kotlin.collections.b.t(gdnVar.a));
        if (gdnVar.b) {
            gdnVar2.b = true;
        }
        String str = gdnVar.d;
        if (str != null) {
            gdnVar2.d = str;
        }
        gdnVar2.c = gdnVar.c;
        gdnVar.a();
    }

    @Override // defpackage.h55
    public final boolean q() {
        return this.d0;
    }
}
