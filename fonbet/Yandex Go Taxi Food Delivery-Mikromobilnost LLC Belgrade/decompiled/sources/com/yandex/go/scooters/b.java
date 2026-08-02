package com.yandex.go.scooters;

import com.yandex.go.layers.api.model.LayersCondition$Endpoint;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.scooters.discovery.m;
import defpackage.abb1;
import defpackage.ah00;
import defpackage.ahn;
import defpackage.bvf0;
import defpackage.byx;
import defpackage.c0o0;
import defpackage.c430;
import defpackage.clo0;
import defpackage.cyx;
import defpackage.dpb;
import defpackage.e4p0;
import defpackage.emo0;
import defpackage.epb;
import defpackage.ewn0;
import defpackage.fcj0;
import defpackage.fva0;
import defpackage.glo0;
import defpackage.gmo0;
import defpackage.h55;
import defpackage.hlo0;
import defpackage.i4o0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jlo0;
import defpackage.jpn0;
import defpackage.jst;
import defpackage.kdx;
import defpackage.khn;
import defpackage.l1j0;
import defpackage.ljn0;
import defpackage.llo0;
import defpackage.m4p0;
import defpackage.m950;
import defpackage.mlo0;
import defpackage.mxm0;
import defpackage.nao0;
import defpackage.nin0;
import defpackage.nlo0;
import defpackage.o4o0;
import defpackage.o6n0;
import defpackage.olo0;
import defpackage.p3w;
import defpackage.p4o0;
import defpackage.ph70;
import defpackage.pxm0;
import defpackage.rx4;
import defpackage.rxn0;
import defpackage.s6k0;
import defpackage.sin0;
import defpackage.sls;
import defpackage.sy60;
import defpackage.tje;
import defpackage.u2b1;
import defpackage.u6o0;
import defpackage.vgn;
import defpackage.wlo0;
import defpackage.wnt;
import defpackage.wun0;
import defpackage.xnt;
import defpackage.xv8;
import defpackage.xvf0;
import defpackage.yko0;
import defpackage.yvf0;
import defpackage.zk2;
import defpackage.zko0;
import defpackage.zmm0;
import defpackage.zzs;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes13.dex */
public final class b extends h55 {
    public final wnt D;
    public final ah00 E;
    public final fva0 F;
    public final ewn0 G;
    public final yvf0 H;
    public final yvf0 I;
    public final cyx J;
    public final yvf0 K;
    public final yvf0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final yvf0 O;
    public final s6k0 P;
    public final p4o0 Q;
    public final ljn0 R;
    public final yvf0 S;
    public final rxn0 T;
    public final sin0 U;
    public final mxm0 V;
    public final sin0 W;
    public final yvf0 Z;
    public final jlo0 a0;
    public final a b0;
    public com.yandex.go.scooters.parking.b c0;
    public m d0;
    public m4p0 e0;
    public gmo0 f0;
    public c0o0 g0;
    public com.yandex.go.scooters.offer_on_camera.b h0;
    public i4o0 i0;
    public clo0 j0;
    public vgn k0;
    public khn l0;

    public b(wnt wntVar, ah00 ah00Var, fva0 fva0Var, ewn0 ewn0Var, xv8 xv8Var, u6o0 u6o0Var, cyx cyxVar, zk2 zk2Var, zmm0 zmm0Var, xvf0 xvf0Var, rx4 rx4Var, jpn0 jpn0Var, s6k0 s6k0Var, p4o0 p4o0Var, ljn0 ljn0Var, ph70 ph70Var, rxn0 rxn0Var, sin0 sin0Var, mxm0 mxm0Var, sin0 sin0Var2, wun0 wun0Var) {
        super(null);
        this.D = wntVar;
        this.E = ah00Var;
        this.F = fva0Var;
        this.G = ewn0Var;
        this.H = xv8Var;
        this.I = u6o0Var;
        this.J = cyxVar;
        this.K = zk2Var;
        this.L = zmm0Var;
        this.M = xvf0Var;
        this.N = rx4Var;
        this.O = jpn0Var;
        this.P = s6k0Var;
        this.Q = p4o0Var;
        this.R = ljn0Var;
        this.S = ph70Var;
        this.T = rxn0Var;
        this.U = sin0Var;
        this.V = mxm0Var;
        this.W = sin0Var2;
        this.Z = wun0Var;
        this.a0 = new jlo0();
        this.b0 = new a(this);
    }

    public static final Object P(b bVar, clo0 clo0Var, o4o0 o4o0Var, sls slsVar, ContinuationImpl continuationImpl) {
        List A = j73.A(new h55[]{bVar.d0, bVar.f0, bVar.i0});
        bVar.d0 = null;
        bVar.f0 = null;
        i4o0 i4o0Var = bVar.i0;
        if (i4o0Var == null) {
            i4o0Var = (i4o0) bVar.S.get();
            bVar.i0 = i4o0Var;
        }
        i4o0 i4o0Var2 = i4o0Var;
        o6n0 o6n0Var = new o6n0(bvf0.c(o4o0Var));
        llo0 llo0Var = new llo0(bVar, clo0Var, o4o0Var, slsVar);
        h55[] h55VarArr = (h55[]) A.toArray(new h55[0]);
        return com.yandex.go.navigation.base.a.a(bVar, i4o0Var2, o6n0Var, llo0Var, new l1j0((m950[]) Arrays.copyOf(h55VarArr, h55VarArr.length)), continuationImpl);
    }

    public static final void Q(b bVar, clo0 clo0Var) {
        ahn ahnVar;
        khn khnVar = bVar.l0;
        if (khnVar == null) {
            vgn vgnVar = bVar.k0;
            khnVar = vgnVar != null ? vgnVar.a : null;
            bVar.l0 = khnVar;
        }
        char c = 1;
        if (khnVar != null) {
            bVar.z(khnVar, new glo0(bVar, c == true ? 1 : 0));
            vgn vgnVar2 = bVar.k0;
            if (vgnVar2 != null && (ahnVar = vgnVar2.b) != null) {
                zko0 zko0Var = clo0Var instanceof zko0 ? (zko0) clo0Var : null;
                if (zko0Var != null ? zko0Var.b : false) {
                    tje.N(bVar.o(), null, null, new ScootersPreorderRouter$notifyEboks$1(ahnVar, null), 3);
                }
            }
        } else {
            jst.e.a(15, "Scooters", new IllegalStateException("Eboks objects must be enabled in scooters preorder"), null);
        }
        boolean z = clo0Var instanceof zko0;
        zko0 zko0Var2 = z ? (zko0) clo0Var : null;
        boolean z2 = zko0Var2 != null && zko0Var2.b;
        zko0 zko0Var3 = z ? (zko0) clo0Var : null;
        zzs zzsVar = zko0Var3 != null ? zko0Var3.c : null;
        cyx cyxVar = bVar.J;
        kdx kdxVar = new kdx();
        abb1.c(kdxVar, "autoselect", Boolean.valueOf(z2));
        if (zzsVar != null) {
            kdxVar.b("destination", ((xnt) bVar.D).a(zzsVar, zzs.Companion.serializer()));
        }
        cyxVar.b(new byx(Screen.DISCOVERY, new c430(Mode.SCOOTERS, (kotlinx.serialization.json.b) null, new p3w("scooters", kdxVar.a())), Collections.singletonList(LayersCondition$Endpoint.POLYGONS)));
    }

    public static final void R(b bVar, fcj0 fcj0Var, sls slsVar) {
        khn khnVar = bVar.l0;
        if (khnVar != null) {
            bVar.j(new epb(khnVar));
            bVar.l0 = null;
        }
        m4p0 m4p0Var = bVar.e0;
        if (m4p0Var == null) {
            m4p0Var = (m4p0) bVar.L.get();
            bVar.e0 = m4p0Var;
        }
        bVar.A(m4p0Var, new e4p0(fcj0Var), new olo0(bVar, fcj0Var, slsVar));
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        clo0 clo0Var = (clo0) obj;
        this.j0 = clo0Var;
        this.T.a.offer(this.b0);
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new ScootersPreorderRouter$onAttach$1(clo0Var, this, null), 1);
        this.G.c();
        z((m950) this.Z.get(), sy60.Q2);
        this.U.a.a(sin0.c(clo0Var));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.j0 = null;
        this.V.a = null;
        this.V.b = false;
        j(dpb.a);
        this.T.a.pollLast();
        this.G.b();
        ljn0 ljn0Var = this.R;
        if (jl40.l(ljn0Var.a, this.k0)) {
            ljn0Var.a = null;
        }
        this.l0 = null;
        this.k0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
    }

    public final void S(yko0 yko0Var) {
        T(yko0Var.b, new nao0(2, this, yko0Var), new hlo0(this, 0));
    }

    public final void T(wlo0 wlo0Var, sls slsVar, sls slsVar2) {
        this.a0.a = wlo0Var;
        List A = j73.A(new h55[]{this.i0, this.d0});
        this.i0 = null;
        this.d0 = null;
        gmo0 gmo0Var = this.f0;
        if (gmo0Var == null) {
            gmo0Var = (gmo0) this.M.get();
            this.f0 = gmo0Var;
        }
        Object emo0Var = new emo0(wlo0Var, u2b1.c(wlo0Var));
        sy60 mlo0Var = new mlo0(this, slsVar, slsVar2);
        h55[] h55VarArr = (h55[]) A.toArray(new h55[0]);
        B(gmo0Var, emo0Var, mlo0Var, new l1j0((m950[]) Arrays.copyOf(h55VarArr, h55VarArr.length)));
    }

    public final void U(pxm0 pxm0Var, zko0 zko0Var) {
        fva0.f(this.F, "ScootersDiscovery", PerformanceAnalytics$Type.Loading, 0L, 4);
        this.W.a.b(sin0.a(zko0Var != null ? zko0Var.d : null));
        m mVar = this.d0;
        if (mVar == null) {
            mVar = (m) this.K.get();
            this.d0 = mVar;
        }
        A(mVar, new nin0(pxm0Var, zko0Var != null ? zko0Var.d : null), new nlo0(this, pxm0Var));
    }
}
