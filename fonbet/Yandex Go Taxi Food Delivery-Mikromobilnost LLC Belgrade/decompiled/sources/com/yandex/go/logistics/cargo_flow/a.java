package com.yandex.go.logistics.cargo_flow;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.logistics.cargo_flow.form.address.c;
import com.yandex.go.route.interactor.b;
import defpackage.amh;
import defpackage.b51;
import defpackage.bb0;
import defpackage.bwb;
import defpackage.bzh;
import defpackage.c4r0;
import defpackage.c51;
import defpackage.cwi;
import defpackage.d51;
import defpackage.dwh;
import defpackage.dyh;
import defpackage.ew8;
import defpackage.fki;
import defpackage.gki;
import defpackage.gyh;
import defpackage.h3y;
import defpackage.h55;
import defpackage.hu0;
import defpackage.hxx;
import defpackage.iu0;
import defpackage.jei;
import defpackage.ju0;
import defpackage.kei;
import defpackage.kr0;
import defpackage.lbi;
import defpackage.m950;
import defpackage.md6;
import defpackage.n3h;
import defpackage.nsi;
import defpackage.oo0;
import defpackage.oyh;
import defpackage.qha1;
import defpackage.qyh;
import defpackage.ru0;
import defpackage.ryh;
import defpackage.s9e;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.udc0;
import defpackage.uu0;
import defpackage.uyh;
import defpackage.vp21;
import defpackage.vu0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wnt;
import defpackage.xxh;
import defpackage.yu8;
import defpackage.yvf0;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes12.dex */
public final class a extends h55 {
    public final sls D;
    public final ConcurrentHashMap E;
    public final amh F;
    public final yvf0 G;
    public final h3y H;
    public final yvf0 I;
    public final yvf0 J;
    public final yvf0 K;
    public final yvf0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final ew8 O;
    public final c P;
    public final zuj0 Q;
    public final yvf0 R;
    public final h3y S;
    public final yvf0 T;
    public final h3y U;
    public final yvf0 V;
    public final yu8 W;
    public final b Z;
    public final wnt a0;
    public final vp21 b0;
    public final wiq0 c0;
    public final c4r0 d0;
    public final com.yandex.go.logistics.cargo_flow.route_selector.a e0;
    public final com.yandex.go.logistics.cargo_flow.interactor.a f0;
    public final dwh g0;
    public final cwi h0;
    public final h3y i0;
    public final yvf0 j0;
    public final xxh k0;
    public final n3h l0;
    public final dyh m0;
    public final kr0 n0;
    public final ryh o0;
    public final oyh p0;
    public final qyh q0;
    public md6 r0;
    public gyh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yvf0 yvf0Var, h3y h3yVar, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, ew8 ew8Var, c cVar, zuj0 zuj0Var, yvf0 yvf0Var9, h3y h3yVar2, yvf0 yvf0Var10, h3y h3yVar3, yvf0 yvf0Var11, yu8 yu8Var, b bVar, wnt wntVar, vp21 vp21Var, wiq0 wiq0Var, c4r0 c4r0Var, com.yandex.go.logistics.cargo_flow.route_selector.a aVar, com.yandex.go.logistics.cargo_flow.interactor.a aVar2, dwh dwhVar, cwi cwiVar, h3y h3yVar4, yvf0 yvf0Var12, xxh xxhVar, n3h n3hVar, dyh dyhVar, kr0 kr0Var) {
        super(null);
        DeliveryCargoFlowRouterImpl$1 deliveryCargoFlowRouterImpl$1 = new DeliveryCargoFlowRouterImpl$1(0, yvf0Var7, yvf0.class, "get", "get()Ljava/lang/Object;", 0);
        this.D = deliveryCargoFlowRouterImpl$1;
        this.E = new ConcurrentHashMap();
        this.F = new amh(7, this);
        this.G = yvf0Var;
        this.H = h3yVar;
        this.I = yvf0Var2;
        this.J = yvf0Var3;
        this.K = yvf0Var4;
        this.L = yvf0Var5;
        this.M = yvf0Var6;
        this.N = yvf0Var8;
        this.O = ew8Var;
        this.P = cVar;
        this.Q = zuj0Var;
        this.R = yvf0Var9;
        this.S = h3yVar2;
        this.T = yvf0Var10;
        this.U = h3yVar3;
        this.V = yvf0Var11;
        this.W = yu8Var;
        this.Z = bVar;
        this.a0 = wntVar;
        this.b0 = vp21Var;
        this.c0 = wiq0Var;
        this.d0 = c4r0Var;
        this.e0 = aVar;
        this.f0 = aVar2;
        this.g0 = dwhVar;
        this.h0 = cwiVar;
        this.i0 = h3yVar4;
        this.j0 = yvf0Var12;
        this.k0 = xxhVar;
        this.l0 = n3hVar;
        this.m0 = dyhVar;
        this.n0 = kr0Var;
        this.o0 = new ryh(0, this);
        this.p0 = new oyh(this);
        this.q0 = new qyh(this);
    }

    public static final void P(a aVar, ju0 ju0Var, Address address, d51 d51Var) {
        Object value;
        dwh dwhVar = aVar.g0;
        dwhVar.getClass();
        if (d51Var instanceof b51) {
            int index = ju0Var.getIndex();
            boolean z = index == 0;
            oo0 k = qha1.k(address, z);
            jei jeiVar = dwhVar.a;
            if (!z) {
                jeiVar.a.a(index - 1, k);
                return;
            }
            r0 r0Var = jeiVar.a.a;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, kei.a((kei) value, k, null, null, 13)));
            return;
        }
        if (!(d51Var instanceof c51)) {
            w511.b();
            return;
        }
        b bVar = dwhVar.b;
        boolean z2 = ju0Var.getIndex() == 0;
        int a = ju0Var.a();
        if (ju0Var instanceof hu0) {
            if (z2) {
                bVar.m(new ZoneAddress(address, 2), null);
                return;
            } else {
                bVar.b(a, address);
                return;
            }
        }
        if (!(ju0Var instanceof iu0)) {
            w511.b();
            return;
        }
        if (!z2) {
            ArrayList arrayList = new ArrayList(bVar.c().b);
            arrayList.add(a, address);
            bVar.o(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList(bVar.c().b);
            Address h = bVar.c().h();
            if (h != null) {
                arrayList2.add(0, h);
            }
            bVar.m(new ZoneAddress(address, 2), null);
            bVar.o(arrayList2);
        }
    }

    public static final s9e Q(a aVar, boolean z, s9e s9eVar) {
        String str;
        String Og = ((h) aVar.b0).Og();
        if (z) {
            String str2 = s9eVar != null ? s9eVar.b : null;
            if ((str2 == null || str2.length() == 0) && Og.length() != 0) {
                if (s9eVar == null || (str = s9eVar.a) == null) {
                    str = "";
                }
                return new s9e(str, Og);
            }
        }
        return s9eVar;
    }

    public static void S(a aVar, ju0 ju0Var, tls tlsVar, vu0 vu0Var, d51 d51Var, int i) {
        nsi nsiVar;
        d51 d51Var2 = (i & 8) != 0 ? c51.a : d51Var;
        boolean z = (i & 16) == 0;
        boolean z2 = (i & 32) != 0;
        aVar.getClass();
        if (vu0Var instanceof uu0) {
            uu0 uu0Var = (uu0) vu0Var;
            nsiVar = new nsi(uu0Var.a, uu0Var.b, uu0Var.c, null, uu0Var.d);
        } else if (vu0Var instanceof ru0) {
            ru0 ru0Var = (ru0) vu0Var;
            nsiVar = new nsi(ru0Var.a, ru0Var.b, null, ru0Var.e, true);
        } else {
            nsiVar = new nsi(null, null, null, null, true);
        }
        boolean z3 = vu0Var instanceof ru0;
        ru0 ru0Var2 = z3 ? (ru0) vu0Var : null;
        String str = ru0Var2 != null ? ru0Var2.c : null;
        ru0 ru0Var3 = z3 ? (ru0) vu0Var : null;
        bwb bwbVar = ru0Var3 != null ? ru0Var3.d : null;
        boolean z4 = (str == null || str.length() == 0 || bwbVar == null) ? false : true;
        int index = ju0Var.getIndex();
        lbi lbiVar = new lbi(index == 0 ? gki.a : new fki(index - 1), ju0Var, nsiVar.a, nsiVar.b, nsiVar.c, z4, nsiVar.e, nsiVar.d, 1);
        aVar.E((m950) aVar.L.get(), lbiVar, new uyh(z4, bwbVar, str, lbiVar, aVar, z2, ju0Var, d51Var2, tlsVar, z), hxx.a);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ((udc0) ((com.yandex.go.places.impl.navigation.a) this.i0.get()).e.getValue()).i();
        this.r0 = null;
        this.s0 = null;
        this.h0.a();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        gyh gyhVar = (gyh) obj;
        this.s0 = gyhVar;
        tje.N(o(), null, null, new DeliveryCargoFlowRouterImpl$onLaunch$1(gyhVar, this, null), 3);
        this.h0.b();
    }

    public final void R() {
        gyh gyhVar;
        md6 md6Var = this.r0;
        if (md6Var == null || (gyhVar = this.s0) == null) {
            return;
        }
        A((m950) this.G.get(), new bzh(md6Var, gyhVar.k), new bb0(this, 26));
    }
}
