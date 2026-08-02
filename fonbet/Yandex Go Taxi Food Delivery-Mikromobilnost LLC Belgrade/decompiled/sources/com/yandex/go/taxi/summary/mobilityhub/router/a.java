package com.yandex.go.taxi.summary.mobilityhub.router;

import com.yandex.go.preorder.navigation.g;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.analytics.HubOpenReason;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.VerticalType;
import defpackage.a2v;
import defpackage.b2v;
import defpackage.bt00;
import defpackage.c0g;
import defpackage.c2v;
import defpackage.ck31;
import defpackage.cyx;
import defpackage.dxu;
import defpackage.flx0;
import defpackage.g1v;
import defpackage.gaq0;
import defpackage.gvr;
import defpackage.h1t;
import defpackage.h3g;
import defpackage.h55;
import defpackage.hxx;
import defpackage.i5m;
import defpackage.i6r;
import defpackage.ipi0;
import defpackage.j2v;
import defpackage.jl40;
import defpackage.kym;
import defpackage.l3g;
import defpackage.m3g;
import defpackage.mum;
import defpackage.n3g;
import defpackage.n3w;
import defpackage.ne31;
import defpackage.nv20;
import defpackage.nw20;
import defpackage.q5z;
import defpackage.rut;
import defpackage.rw20;
import defpackage.sae;
import defpackage.vc31;
import defpackage.ww20;
import defpackage.y1u;
import defpackage.yvf0;
import defpackage.za31;
import java.util.Iterator;
import ru.yandex.taxi.map_common.style.source.e;

/* loaded from: classes14.dex */
public final class a extends h55 {
    public final yvf0 D;
    public final bt00 E;
    public final b F;
    public final nv20 G;
    public final c2v H;
    public final i6r I;
    public final yvf0 J;
    public final mum K;
    public final yvf0 L;
    public n3g M;

    public a(yvf0 yvf0Var, bt00 bt00Var, b bVar, nv20 nv20Var, c2v c2vVar, i6r i6rVar, yvf0 yvf0Var2, mum mumVar, yvf0 yvf0Var3) {
        super(null);
        this.D = yvf0Var;
        this.E = bt00Var;
        this.F = bVar;
        this.G = nv20Var;
        this.H = c2vVar;
        this.I = i6rVar;
        this.J = yvf0Var2;
        this.K = mumVar;
        this.L = yvf0Var3;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.M = null;
        ((e) this.E).b();
        this.G.a.l(HubOpenReason.UNKNOWN);
        c2v c2vVar = this.H;
        c2vVar.getClass();
        c2vVar.a = b2v.c;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        com.yandex.go.coroutines.b.g(o(), null, null, new MobilityHubVerticalRootRouterImpl$onLaunch$1(this, (nw20) obj, null), 3);
        Q(null);
        ((e) this.E).d("default");
    }

    public final n3g P() {
        Object obj;
        String str;
        a2v a2vVar;
        n3g n3gVar = this.M;
        if (n3gVar != null) {
            return n3gVar;
        }
        nw20 nw20Var = (nw20) this.x;
        if (nw20Var == null || (str = nw20Var.b) == null) {
            Iterator it = ((k) ((ck31) this.K.a)).j().a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                za31 za31Var = (za31) obj;
                VerticalType verticalType = za31Var.a.c;
                VerticalType verticalType2 = VerticalType.MIXED;
                if (verticalType == verticalType2 && (verticalType != verticalType2 || !jl40.l(za31Var.d, "transport"))) {
                    break;
                }
            }
            za31 za31Var2 = (za31) obj;
            if (za31Var2 == null || (str = za31Var2.d) == null) {
                str = "hub";
            }
        }
        nw20 nw20Var2 = (nw20) this.x;
        if (nw20Var2 == null || (a2vVar = nw20Var2.c) == null) {
            a2vVar = new a2v(null, null);
        }
        i6r i6rVar = this.I;
        HubOpenReason hubOpenReason = (HubOpenReason) this.G.a.getValue();
        b2v b2vVar = this.H.a;
        i6rVar.getClass();
        hubOpenReason.getClass();
        b2vVar.getClass();
        n3g n3gVar2 = new n3g();
        n3gVar2.q = n3gVar2;
        n3gVar2.l = str;
        n3gVar2.m = i6rVar;
        n3gVar2.n = a2vVar;
        n3gVar2.o = hubOpenReason;
        n3gVar2.p = b2vVar;
        n3gVar2.r = new h3g(i6rVar, 28);
        h3g h3gVar = new h3g(i6rVar, 21);
        int i = 10;
        l3g l3gVar = new l3g(i6rVar, i);
        n3gVar2.s = l3gVar;
        n3gVar2.b = i5m.b(new rut(h3gVar, l3gVar, 5));
        int i2 = 2;
        n3gVar2.t = new l3g(i6rVar, i2);
        int i3 = 18;
        int i4 = 25;
        int i5 = 27;
        n3gVar2.c = i5m.b(new flx0(new l3g(i6rVar, i3), new h3g(i6rVar, i4), i5));
        n3gVar2.u = new h3g(i6rVar, 23);
        int i6 = 15;
        n3gVar2.v = new l3g(i6rVar, i6);
        int i7 = 14;
        n3gVar2.w = new h3g(i6rVar, i7);
        int i8 = 24;
        n3gVar2.x = new h3g(i6rVar, i8);
        n3gVar2.d = i5m.b(gvr.a);
        n3gVar2.y = new l3g(i6rVar, i5);
        n3gVar2.z = new h3g(i6rVar, 9);
        int i9 = 6;
        n3gVar2.A = new h3g(i6rVar, i9);
        n3gVar2.B = new l3g(i6rVar, i9);
        int i10 = 20;
        n3gVar2.C = new l3g(i6rVar, i10);
        n3gVar2.a = n3w.a(str);
        n3gVar2.D = n3w.a(hubOpenReason);
        n3gVar2.F = new l3g(i6rVar, i7);
        int i11 = 3;
        n3gVar2.G = new m3g(i6rVar, i11);
        int i12 = 11;
        n3gVar2.H = new h3g(i6rVar, i12);
        n3gVar2.I = new h3g(i6rVar, i3);
        int i13 = 13;
        n3gVar2.J = new h3g(i6rVar, i13);
        n3gVar2.K = new h3g(i6rVar, i11);
        int i14 = 7;
        n3gVar2.L = new h3g(i6rVar, i14);
        n3gVar2.M = new l3g(i6rVar, i8);
        n3gVar2.N = new h3g(i6rVar, 26);
        n3gVar2.O = new h3g(i6rVar, i);
        int i15 = 16;
        n3gVar2.P = new h3g(i6rVar, i15);
        n3gVar2.e = i5m.b(vc31.a);
        n3gVar2.Q = new l3g(i6rVar, i15);
        n3gVar2.R = new l3g(i6rVar, i12);
        n3gVar2.f = i5m.b(ipi0.a);
        n3gVar2.S = new l3g(i6rVar, 0);
        n3gVar2.T = new h3g(i6rVar, 17);
        h3g h3gVar2 = new h3g(i6rVar, 12);
        n3gVar2.U = h3gVar2;
        int i16 = 22;
        n3gVar2.V = new y1u(h3gVar2, i16);
        n3gVar2.g = i5m.b(new h1t(new l3g(i6rVar, 8), i9));
        int i17 = 1;
        n3gVar2.W = new m3g(i6rVar, i17);
        n3gVar2.X = new h3g(i6rVar, i2);
        n3gVar2.Y = new l3g(i6rVar, 17);
        n3gVar2.Z = new l3g(i6rVar, i4);
        n3gVar2.a0 = new m3g(i6rVar, i2);
        n3gVar2.b0 = new l3g(i6rVar, 29);
        n3gVar2.c0 = new l3g(i6rVar, 19);
        n3gVar2.d0 = new h3g(i6rVar, i6);
        n3gVar2.e0 = new h3g(i6rVar, i16);
        int i18 = 4;
        n3gVar2.f0 = new m3g(i6rVar, i18);
        n3gVar2.g0 = new h3g(i6rVar, i17);
        n3gVar2.h0 = new h3g(i6rVar, 8);
        n3gVar2.h = i5m.b(new gaq0(new h3g(i6rVar, i10), i17));
        n3gVar2.i = i5m.b(ne31.a);
        n3gVar2.i0 = new l3g(i6rVar, i11);
        n3gVar2.j = i5m.b(kym.a);
        n3gVar2.j0 = new h3g(i6rVar, i18);
        n3gVar2.k0 = new l3g(i6rVar, 9);
        n3gVar2.l0 = new h3g(i6rVar, 5);
        n3gVar2.k = i5m.b(g1v.a);
        n3gVar2.m0 = new l3g(i6rVar, 12);
        n3gVar2.n0 = new l3g(i6rVar, 26);
        n3gVar2.o0 = new h3g(i6rVar, 27);
        n3gVar2.p0 = new l3g(i6rVar, 21);
        n3gVar2.E = n3w.a(a2vVar);
        n3gVar2.q0 = new l3g(i6rVar, i18);
        int i19 = 5;
        n3gVar2.r0 = new l3g(i6rVar, i19);
        n3gVar2.s0 = new m3g(i6rVar, i19);
        n3gVar2.t0 = new m3g(i6rVar, 0);
        n3gVar2.u0 = new h3g(i6rVar, 29);
        n3gVar2.v0 = new l3g(i6rVar, i16);
        n3gVar2.w0 = new l3g(i6rVar, 28);
        n3gVar2.x0 = new l3g(i6rVar, i13);
        n3gVar2.y0 = new l3g(i6rVar, i14);
        n3gVar2.z0 = new h3g(i6rVar, 19);
        n3gVar2.A0 = new l3g(i6rVar, i17);
        n3gVar2.B0 = new l3g(i6rVar, 23);
        this.M = n3gVar2;
        return n3gVar2;
    }

    public final void Q(Boolean bool) {
        n3g P = P();
        String str = (String) P.l;
        h3g h3gVar = (h3g) P.r;
        c0g c0gVar = (c0g) ((i6r) P.m);
        com.yandex.go.mainscreen.superapp.impl.fragment.a aVar = (com.yandex.go.mainscreen.superapp.impl.fragment.a) c0gVar.Ng.get();
        q5z.h(aVar);
        sae saeVar = new sae(17, (n3g) P.q);
        dxu dxuVar = (dxu) P.b.get();
        g gVar = (g) c0gVar.G.get();
        q5z.h(gVar);
        l3g l3gVar = (l3g) P.t;
        cyx cyxVar = (cyx) c0gVar.Qc.get();
        q5z.h(cyxVar);
        E(new ww20(str, h3gVar, aVar, saeVar, dxuVar, gVar, l3gVar, cyxVar, P.a()), new j2v(bool), new rw20(this), hxx.a);
    }
}
