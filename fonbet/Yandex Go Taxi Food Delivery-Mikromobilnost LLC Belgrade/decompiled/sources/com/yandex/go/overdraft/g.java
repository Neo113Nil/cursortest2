package com.yandex.go.overdraft;

import android.view.ContextThemeWrapper;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import defpackage.a090;
import defpackage.a5y0;
import defpackage.c0g;
import defpackage.ec80;
import defpackage.f28;
import defpackage.gi;
import defpackage.h3y;
import defpackage.h55;
import defpackage.i6r;
import defpackage.j4n;
import defpackage.jy51;
import defpackage.lz80;
import defpackage.m19;
import defpackage.m950;
import defpackage.mz80;
import defpackage.nm10;
import defpackage.oxu0;
import defpackage.pz80;
import defpackage.qz80;
import defpackage.ra00;
import defpackage.rz80;
import defpackage.tje;
import defpackage.tt2;
import defpackage.w030;
import defpackage.w511;
import defpackage.y50;
import defpackage.ycq0;
import defpackage.yj70;
import defpackage.yvf0;
import defpackage.yy80;

/* loaded from: classes8.dex */
public final class g extends h55 implements m950 {
    public final w030 D;
    public final tt2 E;
    public final yy80 F;
    public final h3y G;
    public final a090 H;
    public final nm10 I;
    public final h3y J;
    public final ycq0 K;
    public final h3y L;
    public final h3y M;
    public final oxu0 N;
    public final h3y O;
    public final ec80 P;
    public final m19 Q;
    public final h3y R;
    public final jy51 S;
    public final h3y T;
    public final ra00 U;
    public final yvf0 V;
    public final y50 W;
    public j4n Z;
    public mz80 a0;

    public g(w030 w030Var, tt2 tt2Var, yy80 yy80Var, h3y h3yVar, a090 a090Var, nm10 nm10Var, h3y h3yVar2, ycq0 ycq0Var, h3y h3yVar3, h3y h3yVar4, oxu0 oxu0Var, h3y h3yVar5, ec80 ec80Var, m19 m19Var, h3y h3yVar6, jy51 jy51Var, h3y h3yVar7, ra00 ra00Var, yvf0 yvf0Var, y50 y50Var) {
        super(null);
        this.D = w030Var;
        this.E = tt2Var;
        this.F = yy80Var;
        this.G = h3yVar;
        this.H = a090Var;
        this.I = nm10Var;
        this.J = h3yVar2;
        this.K = ycq0Var;
        this.L = h3yVar3;
        this.M = h3yVar4;
        this.N = oxu0Var;
        this.O = h3yVar5;
        this.P = ec80Var;
        this.Q = m19Var;
        this.R = h3yVar6;
        this.S = jy51Var;
        this.T = h3yVar7;
        this.U = ra00Var;
        this.V = yvf0Var;
        this.W = y50Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.Z = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        mz80 mz80Var;
        rz80 rz80Var = (rz80) obj;
        h3y h3yVar = this.J;
        this.Z = gi.a((i6r) h3yVar.get(), rz80Var.a(), new ContextThemeWrapper(((c0g) ((i6r) h3yVar.get())).n0(), ((ru.yandex.taxi.styling.g) this.N).b().b), new yj70(this));
        boolean z = rz80Var instanceof pz80;
        pz80 pz80Var = z ? (pz80) rz80Var : null;
        int i = 0;
        if (pz80Var == null || (mz80Var = pz80Var.b()) == null) {
            mz80Var = new mz80(0, rz80Var.a(), this);
        }
        this.a0 = mz80Var;
        if (z) {
            pz80 pz80Var2 = (pz80) rz80Var;
            j4n j4nVar = this.Z;
            if (j4nVar != null) {
                f28 o = j4nVar.o();
                ((com.yandex.go.overdraft.domain.g) this.M.get()).f();
                D(o, pz80Var2, new lz80(this, i));
            }
        } else {
            if (!(rz80Var instanceof qz80)) {
                w511.b();
                return;
            }
            this.U.b((m950) this.V.get(), new a5y0("open order payment methods from overdraft", ((qz80) rz80Var).b(), TaxiCardNavigationAction.OPEN_PAYMENT, 24));
        }
        tje.N(o(), null, null, new OverdraftRouterImpl$onLaunch$1(this, null), 3);
    }
}
