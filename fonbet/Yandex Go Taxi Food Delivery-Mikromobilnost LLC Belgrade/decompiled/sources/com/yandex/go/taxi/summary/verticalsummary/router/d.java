package com.yandex.go.taxi.summary.verticalsummary.router;

import android.content.Context;
import com.yandex.go.summary.interactor.core.t;
import com.yandex.go.taxi.summary.verticalsummary.interactor.g;
import com.yandex.go.yb.data.u;
import defpackage.ah00;
import defpackage.biv0;
import defpackage.bov0;
import defpackage.c1x0;
import defpackage.ck31;
import defpackage.d49;
import defpackage.djx0;
import defpackage.dqe0;
import defpackage.ec31;
import defpackage.eit0;
import defpackage.epj0;
import defpackage.fcj0;
import defpackage.fh31;
import defpackage.fov0;
import defpackage.fpv0;
import defpackage.fux;
import defpackage.gh00;
import defpackage.h3y;
import defpackage.h580;
import defpackage.hi31;
import defpackage.hpv0;
import defpackage.i130;
import defpackage.i3y;
import defpackage.jy51;
import defpackage.kdr;
import defpackage.li31;
import defpackage.mu5;
import defpackage.n3h;
import defpackage.n3o;
import defpackage.noe;
import defpackage.pgd;
import defpackage.pzt0;
import defpackage.qh31;
import defpackage.qpt0;
import defpackage.rft0;
import defpackage.rgt0;
import defpackage.s0g;
import defpackage.set0;
import defpackage.suh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uet0;
import defpackage.vpv0;
import defpackage.vqv0;
import defpackage.w030;
import defpackage.wfd;
import defpackage.wif;
import defpackage.wiq0;
import defpackage.y50;
import defpackage.yvf0;
import defpackage.z880;
import defpackage.zy11;

/* loaded from: classes14.dex */
public final class d extends pgd {
    public final yvf0 A0;
    public final yvf0 B0;
    public final wif C0;
    public final jy51 D0;
    public final u E0;
    public final Context F;
    public final fux F0;
    public final ah00 G;
    public final fov0 G0;
    public final n3h H;
    public final eit0 H0;
    public final dqe0 I;
    public final yvf0 I0;
    public final s0g J;
    public pzt0 J0;
    public final tt2 K;
    public com.yandex.go.common.a K0;
    public final y50 L;
    public final i3y L0;
    public final yvf0 M;
    public final mu5 M0;
    public final ck31 N;
    public final noe O;
    public final z880 P;
    public final c1x0 Q;
    public final yvf0 R;
    public final wiq0 S;
    public final com.yandex.go.route.interactor.c T;
    public final yvf0 U;
    public final qh31 V;
    public final com.yandex.go.route.interactor.b W;
    public final n3o Z;
    public final vqv0 a0;
    public final djx0 b0;
    public final fcj0 c0;
    public final biv0 d0;
    public final suh e0;
    public final rft0 f0;
    public final epj0 g0;
    public final i130 h0;
    public final h3y i0;
    public final g j0;
    public final kdr k0;
    public final yvf0 l0;
    public final li31 m0;
    public final h580 n0;
    public final hi31 o0;
    public final uet0 p0;
    public final rgt0 q0;
    public final set0 r0;
    public final qpt0 s0;
    public final t t0;
    public final d49 u0;
    public final vpv0 v0;
    public final yvf0 w0;
    public final yvf0 x0;
    public final yvf0 y0;
    public final yvf0 z0;

    public d(Context context, ah00 ah00Var, n3h n3hVar, dqe0 dqe0Var, s0g s0gVar, tt2 tt2Var, y50 y50Var, yvf0 yvf0Var, ck31 ck31Var, noe noeVar, z880 z880Var, c1x0 c1x0Var, yvf0 yvf0Var2, wiq0 wiq0Var, com.yandex.go.route.interactor.c cVar, yvf0 yvf0Var3, qh31 qh31Var, com.yandex.go.route.interactor.b bVar, n3o n3oVar, vqv0 vqv0Var, djx0 djx0Var, fcj0 fcj0Var, biv0 biv0Var, suh suhVar, rft0 rft0Var, epj0 epj0Var, i130 i130Var, h3y h3yVar, g gVar, kdr kdrVar, yvf0 yvf0Var4, li31 li31Var, h580 h580Var, hi31 hi31Var, uet0 uet0Var, rgt0 rgt0Var, set0 set0Var, qpt0 qpt0Var, t tVar, d49 d49Var, vpv0 vpv0Var, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, yvf0 yvf0Var10, wif wifVar, jy51 jy51Var, u uVar, fux fuxVar, fov0 fov0Var, eit0 eit0Var, yvf0 yvf0Var11) {
        super(0);
        this.F = context;
        this.G = ah00Var;
        this.H = n3hVar;
        this.I = dqe0Var;
        this.J = s0gVar;
        this.K = tt2Var;
        this.L = y50Var;
        this.M = yvf0Var;
        this.N = ck31Var;
        this.O = noeVar;
        this.P = z880Var;
        this.Q = c1x0Var;
        this.R = yvf0Var2;
        this.S = wiq0Var;
        this.T = cVar;
        this.U = yvf0Var3;
        this.V = qh31Var;
        this.W = bVar;
        this.Z = n3oVar;
        this.a0 = vqv0Var;
        this.b0 = djx0Var;
        this.c0 = fcj0Var;
        this.d0 = biv0Var;
        this.e0 = suhVar;
        this.f0 = rft0Var;
        this.g0 = epj0Var;
        this.h0 = i130Var;
        this.i0 = h3yVar;
        this.j0 = gVar;
        this.k0 = kdrVar;
        this.l0 = yvf0Var4;
        this.m0 = li31Var;
        this.n0 = h580Var;
        this.o0 = hi31Var;
        this.p0 = uet0Var;
        this.q0 = rgt0Var;
        this.r0 = set0Var;
        this.s0 = qpt0Var;
        this.t0 = tVar;
        this.u0 = d49Var;
        this.v0 = vpv0Var;
        this.w0 = yvf0Var5;
        this.x0 = yvf0Var6;
        this.y0 = yvf0Var7;
        this.z0 = yvf0Var8;
        this.A0 = yvf0Var9;
        this.B0 = yvf0Var10;
        this.C0 = wifVar;
        this.D0 = jy51Var;
        this.E0 = uVar;
        this.F0 = fuxVar;
        this.G0 = fov0Var;
        this.H0 = eit0Var;
        this.I0 = yvf0Var11;
        this.L0 = kotlin.a.a(new ec31(3, this));
        this.M0 = new mu5(new fh31(this, 0));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((zy11) obj);
        biv0 biv0Var = this.d0;
        bov0 a = biv0Var.a();
        if (a == null) {
            a = bov0.e;
        }
        biv0Var.d(new hpv0(a));
        this.J0 = tje.N(o(), null, null, new VerticalSummaryComposeRouter$onAttach$1(this, a, null), 3);
        qh31 qh31Var = this.V;
        ((gh00) qh31Var.a).e(qh31Var.d);
        biv0Var.e();
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((zy11) obj);
        this.d0.d(fpv0.a);
        this.t0.b();
        pzt0 pzt0Var = this.J0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.J0 = null;
        qh31 qh31Var = this.V;
        ((gh00) qh31Var.a).u(qh31Var.d);
        qh31Var.b.t4("VerticalSummaryOverlay");
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.M0;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final String R() {
        return "VerticalSummary";
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.h0.a();
    }
}
