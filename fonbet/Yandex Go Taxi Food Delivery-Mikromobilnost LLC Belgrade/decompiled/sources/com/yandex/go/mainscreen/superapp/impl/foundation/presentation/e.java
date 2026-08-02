package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import android.os.SystemClock;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.v;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.j;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.flex.FeedScrollUpButton;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.MainSidePager;
import com.yandex.go.zone.repository.o;
import defpackage.a6s0;
import defpackage.a941;
import defpackage.ajr;
import defpackage.bae0;
import defpackage.bk1;
import defpackage.c151;
import defpackage.cay0;
import defpackage.epb;
import defpackage.ezw;
import defpackage.g2w0;
import defpackage.gep0;
import defpackage.h7w0;
import defpackage.hay0;
import defpackage.iir;
import defpackage.isf0;
import defpackage.jd;
import defpackage.k2w0;
import defpackage.l3w0;
import defpackage.l880;
import defpackage.lhw0;
import defpackage.lx4;
import defpackage.ms2;
import defpackage.ney;
import defpackage.o2y0;
import defpackage.o31;
import defpackage.o4w0;
import defpackage.os2;
import defpackage.pzt0;
import defpackage.q1w0;
import defpackage.qc5;
import defpackage.qcw0;
import defpackage.qv10;
import defpackage.qz1;
import defpackage.qz10;
import defpackage.r3w0;
import defpackage.ri1;
import defpackage.ry70;
import defpackage.t9f0;
import defpackage.tig0;
import defpackage.tt2;
import defpackage.u45;
import defpackage.u900;
import defpackage.v2w0;
import defpackage.vc00;
import defpackage.vd2;
import defpackage.x770;
import defpackage.y3w0;
import defpackage.znj;
import defpackage.zww0;
import defpackage.zzv0;
import java.util.HashSet;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.altpins.order.i;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.order.l;
import ru.yandex.taxi.perf.Milestone;

/* loaded from: classes.dex */
public final class e extends qc5 {
    public final ry70 A;
    public final tt2 B;
    public final v C;
    public final j D;
    public final iir E;
    public final t9f0 F;
    public final l3w0 G;
    public final zzv0 H;
    public final l I;
    public final l880 J;
    public final c151 K;
    public final o L;
    public final znj M;
    public final qcw0 N;
    public final bk1 O;
    public final g2w0 P;
    public final qz1 Q;
    public final h7w0 R;
    public final com.yandex.go.network.connectivity.a S;
    public final ney T;
    public final ms2 U;
    public final y3w0 V;
    public final r3w0 W;
    public final ru.yandex.taxi.banners.c Z;
    public final bae0 a0;
    public final zww0 b0;
    public final jd c0;
    public final a6s0 d0;
    public final q1w0 e0;
    public final v2w0 f0;
    public final hay0 g0;
    public final com.yandex.go.flex.main_screen.presentation.feed.e h0;
    public final h i0;
    public final com.yandex.go.preload.e j0;
    public final gep0 k0;
    public final vc00 l0;
    public final com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a m0;
    public final o31 n0;
    public final com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.e o0;
    public pzt0 p0;
    public pzt0 q0;
    public pzt0 r0;
    public final a s0;
    public final vd2 t0;

    public e(ry70 ry70Var, tt2 tt2Var, v vVar, j jVar, iir iirVar, t9f0 t9f0Var, l3w0 l3w0Var, zzv0 zzv0Var, l lVar, l880 l880Var, c151 c151Var, o oVar, znj znjVar, qcw0 qcw0Var, bk1 bk1Var, g2w0 g2w0Var, qz1 qz1Var, h7w0 h7w0Var, com.yandex.go.network.connectivity.a aVar, ney neyVar, ms2 ms2Var, y3w0 y3w0Var, r3w0 r3w0Var, ru.yandex.taxi.banners.c cVar, bae0 bae0Var, zww0 zww0Var, jd jdVar, a6s0 a6s0Var, q1w0 q1w0Var, v2w0 v2w0Var, hay0 hay0Var, com.yandex.go.flex.main_screen.presentation.feed.e eVar, h hVar, com.yandex.go.preload.e eVar2, gep0 gep0Var, vc00 vc00Var, com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a aVar2, o31 o31Var, lhw0 lhw0Var, ezw ezwVar, ajr ajrVar, com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.e eVar3) {
        super(k2w0.class, neyVar);
        this.A = ry70Var;
        this.B = tt2Var;
        this.C = vVar;
        this.D = jVar;
        this.E = iirVar;
        this.F = t9f0Var;
        this.G = l3w0Var;
        this.H = zzv0Var;
        this.I = lVar;
        this.J = l880Var;
        this.K = c151Var;
        this.L = oVar;
        this.M = znjVar;
        this.N = qcw0Var;
        this.O = bk1Var;
        this.P = g2w0Var;
        this.Q = qz1Var;
        this.R = h7w0Var;
        this.S = aVar;
        this.T = neyVar;
        this.U = ms2Var;
        this.V = y3w0Var;
        this.W = r3w0Var;
        this.Z = cVar;
        this.a0 = bae0Var;
        this.b0 = zww0Var;
        this.c0 = jdVar;
        this.d0 = a6s0Var;
        this.e0 = q1w0Var;
        this.f0 = v2w0Var;
        this.g0 = hay0Var;
        this.h0 = eVar;
        this.i0 = hVar;
        this.j0 = eVar2;
        this.k0 = gep0Var;
        this.l0 = vc00Var;
        this.m0 = aVar2;
        this.n0 = o31Var;
        this.o0 = eVar3;
        this.s0 = new a(this);
        this.t0 = new vd2(2, this);
    }

    public static void Og(e eVar, FeedScrollUpButton feedScrollUpButton) {
        u900 P = eVar.o0.f.P();
        if (P != null) {
            P.U(null, feedScrollUpButton);
        }
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((i) this.Q).d.b();
        r0 r0Var = this.G.a;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        pzt0 pzt0Var = this.p0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        j jVar = this.D;
        pzt0 pzt0Var2 = jVar.f;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        jVar.f = null;
        jVar.b.d.b();
        this.K.e.b = kotlin.collections.b.f();
        tig0 tig0Var = this.V.a;
        ((x770) tig0Var.b).d();
        ((ru.yandex.taxi.analytics.j) ((lx4) tig0Var.a)).n("SuperappMain.Disappear");
        r0 r0Var2 = this.f0.a;
        r0Var2.getClass();
        r0Var2.m(null, bool);
        Mg();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        l lVar = this.I;
        lVar.d = false;
        lVar.a();
        this.Z.b(this.t0);
        h hVar = this.i0;
        hVar.o.remove(this.s0);
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        l lVar = this.I;
        lVar.d = true;
        lVar.a();
        h7w0 h7w0Var = this.R;
        for (o2y0 o2y0Var : ((com.yandex.go.taxi.order.provider.a) h7w0Var.a).l()) {
            if (o2y0Var.b().l.getY() && !o2y0Var.b().l.getA()) {
                ri1 ri1Var = h7w0Var.c;
                String str = o2y0Var.b().a;
                HashSet hashSet = ri1Var.b;
                if (hashSet.contains(str)) {
                    ri1Var.a = null;
                    hashSet.clear();
                }
                h7w0Var.b.g(o2y0Var.b().a);
            }
        }
        this.J.a(new qz10(13));
        h hVar = this.i0;
        a aVar = this.s0;
        hVar.o.add(aVar);
        isf0 isf0Var = hVar.s;
        if (isf0Var != null) {
            aVar.accept(isf0Var);
        }
        this.Z.c(this.t0);
    }

    @Override // defpackage.qc5
    public final void Lg() {
        pzt0 pzt0Var = this.q0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    public final void Mg() {
        com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.e eVar = this.o0;
        o4w0 o4w0Var = eVar.f;
        pzt0 pzt0Var = eVar.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        o4w0Var.j(new epb(eVar.a));
        o4w0Var.e0 = null;
    }

    public final void Ng(u45 u45Var) {
        boolean c;
        boolean z = u45Var != null;
        qv10.B(z, this.f0.a, null);
        vc00 vc00Var = this.l0;
        if (z) {
            vc00Var.a();
            return;
        }
        boolean z2 = vc00Var.d;
        if (vc00Var.c) {
            vc00Var.c = false;
            c = vc00Var.c(false);
        } else {
            c = false;
        }
        if (z2 || c) {
            com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a aVar = this.m0;
            vc00 vc00Var2 = aVar.b;
            MainSidePager mainSidePager = aVar.h;
            if (mainSidePager == null) {
                return;
            }
            if (!mainSidePager.isOnSidePage()) {
                vc00Var2.d = false;
                return;
            }
            a941 b = aVar.b(mainSidePager);
            if (b == null) {
                return;
            }
            b.e();
            vc00Var2.d = false;
        }
    }

    @Override // defpackage.qc5
    public final void onStart() {
        ((cay0) this.k0).b();
        Milestone milestone = Milestone.MainScreenData;
        ms2 ms2Var = this.U;
        ms2Var.getClass();
        ((os2) ms2Var).d(milestone, SystemClock.elapsedRealtime());
        this.q0 = com.yandex.go.coroutines.b.g(Jg(), null, null, new SuperAppMainScreenPresenter$listenToUserLocation$1(this, null), 3);
    }
}
