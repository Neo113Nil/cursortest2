package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.ybsdk.api.YBSdkVisualParams;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.common.domain.entities.BuildFlavor;
import com.ybsdk.di.modules.features.CardFeatureModule;
import com.ybsdk.di.modules.features.x;
import com.ybsdk.navigation.d;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.initial.InitialFragment;
import com.ybsdk.screens.menu.presentation.MenuFragment;
import com.ybsdk.screens.notice.presentation.TopupNoticeDeprecatedFragment;
import com.ybsdk.screens.notice.presentation.TopupNoticeFragment;
import com.ybsdk.screens.spoilerOnboarding.SpoilerOnboardingFragment;
import com.ybsdk.screens.transaction.presentation.a;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h9g implements tw51 {
    public final srb A;
    public final xvf0 A0;
    public final xvf0 A1;
    public final xvf0 B;
    public final xvf0 B0;
    public final n3w B1;
    public final xvf0 C;
    public final xvf0 C0;
    public final xvf0 C1;
    public final p6f D;
    public final xvf0 D0;
    public final xvf0 D1;
    public final xvf0 E;
    public final xvf0 E0;
    public final xvf0 E1;
    public final n3w F;
    public final xvf0 F0;
    public final xvf0 F1;
    public final n3w G;
    public final xvf0 G0;
    public final xvf0 G1;
    public final xvf0 H;
    public final xvf0 H0;
    public final xvf0 I;
    public final xvf0 I0;
    public final xvf0 J;
    public final xvf0 J0;
    public final u800 K;
    public final xvf0 K0;
    public final xvf0 L;
    public final xvf0 L0;
    public final xvf0 M;
    public final xvf0 M0;
    public final ze N;
    public final xvf0 N0;
    public final xvf0 O;
    public final mam0 O0;
    public final n3w P;
    public final cys0 P0;
    public final p6f Q;
    public final oti Q0;
    public final xvf0 R;
    public final flx0 R0;
    public final eqh S;
    public final jpf0 S0;
    public final n3w T;
    public final mvy T0;
    public final t160 U;
    public final jde0 U0;
    public final xvf0 V;
    public final g680 V0;
    public final qx5 W;
    public final g680 W0;
    public final ibz0 X;
    public final c4p X0;
    public final v8c0 Y;
    public final p6f Y0;
    public final v8c0 Z;
    public final p4 Z0;
    public final gsl a;
    public final nb11 a0;
    public final xvf0 a1;
    public final fjg b;
    public final nb11 b0;
    public final br10 b1;
    public final YBSdkVisualParams c;
    public final xvf0 c0;
    public final tl3 c1;
    public final FragmentActivity d;
    public final ret d0;
    public final n2y0 d1;
    public final i5 e;
    public final mg11 e0;
    public final dx7 e1;
    public final qg6 f;
    public final n3w f0;
    public final xvf0 f1;
    public final mu31 g;
    public final eqh g0;
    public final xvf0 g1;
    public final CardFeatureModule h;
    public final xvf0 h0;
    public final xvf0 h1;
    public final wu4 i;
    public final cys0 i0;
    public final k1w i1;
    public final uu01 j;
    public final xat j0;
    public final vqa0 j1;
    public final kh90 k;
    public final xvf0 k0;
    public final xvf0 k1;
    public final ri90 l;
    public final xvf0 l0;
    public final xvf0 l1;
    public final yli0 m;
    public final xvf0 m0;
    public final m7q0 m1;
    public final BuildFlavor n;
    public final xvf0 n0;
    public final z0s0 n1;
    public final k6v o;
    public final xvf0 o0;
    public final vqa0 o1;
    public final n2h p;
    public final xvf0 p0;
    public final qcz0 p1;
    public final htt0 q;
    public final xvf0 q0;
    public final jde0 q1;
    public final ihm0 r;
    public final xvf0 r0;
    public final l180 r1;
    public final d9u0 s;
    public final xvf0 s0;
    public final cys0 s1;
    public final lqs t;
    public final xvf0 t0;
    public final ig7 t1;
    public final v5c0 u;
    public final xvf0 u0;
    public final xvf0 u1;
    public final x8g v;
    public final xvf0 v0;
    public final xvf0 v1;
    public final h9g w = this;
    public final xvf0 w0;
    public final xvf0 w1;
    public final n3w x;
    public final xvf0 x0;
    public final xvf0 x1;
    public final n3w y;
    public final xvf0 y0;
    public final xvf0 y1;
    public final wif z;
    public final xvf0 z0;
    public final xvf0 z1;

    /* JADX WARN: Multi-variable type inference failed */
    public h9g(x8g x8gVar, vzt vztVar, tp41 tp41Var, s39 s39Var, i5 i5Var, u400 u400Var, k6v k6vVar, CardFeatureModule cardFeatureModule, wu4 wu4Var, i3d0 i3d0Var, kh90 kh90Var, ri90 ri90Var, uu01 uu01Var, h7u h7uVar, yli0 yli0Var, s0h s0hVar, lqs lqsVar, ihm0 ihm0Var, d9u0 d9u0Var, gsl gslVar, fjg fjgVar, cpn cpnVar, htt0 htt0Var, du2 du2Var, luq0 luq0Var, pt11 pt11Var, q59 q59Var, n2h n2hVar, jxs jxsVar, dxj0 dxj0Var, wdp0 wdp0Var, v5c0 v5c0Var, YBSdkVisualParams yBSdkVisualParams, FragmentActivity fragmentActivity, mu31 mu31Var, y750 y750Var, qg6 qg6Var, BuildFlavor buildFlavor) {
        this.v = x8gVar;
        this.a = gslVar;
        this.b = fjgVar;
        this.c = yBSdkVisualParams;
        this.d = fragmentActivity;
        this.e = i5Var;
        this.f = qg6Var;
        this.g = mu31Var;
        this.h = cardFeatureModule;
        this.i = wu4Var;
        this.j = uu01Var;
        this.k = kh90Var;
        this.l = ri90Var;
        this.m = yli0Var;
        this.n = buildFlavor;
        this.o = k6vVar;
        this.p = n2hVar;
        this.q = htt0Var;
        this.r = ihm0Var;
        this.s = d9u0Var;
        this.t = lqsVar;
        this.u = v5c0Var;
        this.x = n3w.a(mu31Var);
        n3w a = n3w.a(this);
        this.y = a;
        wif wifVar = new wif(fjgVar, a, 2);
        this.z = wifVar;
        this.A = new srb(fjgVar, wifVar, 25);
        n3w n3wVar = y2r0.c;
        ArrayList arrayList = new ArrayList(2);
        List list = Collections.EMPTY_LIST;
        arrayList.add(nsp0.a);
        arrayList.add(this.A);
        xvf0 b = i5m.b(new jpn0(x8gVar.k, x8gVar.u, (xvf0) x8gVar.j, x8gVar.q, (xvf0) x8gVar.M1, x8gVar.A, (xvf0) new y2r0(arrayList, list), x8gVar.w0, 5));
        this.B = b;
        this.C = i5m.b(new d(this.x, x8gVar.S, b));
        p6f p6fVar = new p6f(s0hVar, this.y, 19);
        this.D = p6fVar;
        this.E = i5m.b(new srb(s0hVar, p6fVar, 29));
        this.F = n3w.a(wdp0Var);
        this.G = n3w.a(dxj0Var);
        this.H = i5m.b(oop0.a);
        xvf0 b2 = i5m.b(wru.a);
        this.I = b2;
        this.J = i5m.b(new oto0(this.H, b2, 16));
        ArrayList arrayList2 = new ArrayList(2);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(x8gVar.N);
        u800 u800Var = new u800(x8gVar.b, g8e.g(arrayList2, this.J, arrayList2, list2), x8gVar.O);
        this.K = u800Var;
        this.L = i5m.b(new gzn0(x8gVar.t, x8gVar.u, (xvf0) u800Var, 21));
        this.M = i5m.b(new up41(tp41Var, this.y));
        n3w n3wVar2 = x8gVar.o;
        n3w n3wVar3 = this.y;
        this.N = new ze(n3wVar2, n3wVar3, 15);
        this.O = i5m.b(new vqa0(n3wVar3, 11));
        this.P = n3w.a(yBSdkVisualParams);
        this.Q = new p6f(s0hVar, this.D, 20);
        this.R = i5m.b(new njp(this.y, 3));
        this.S = new eqh();
        this.T = n3w.a(y750Var);
        this.U = new t160(x8gVar.A, 12);
        xvf0 b3 = i5m.b(yra0.a);
        this.V = b3;
        n3w n3wVar4 = this.F;
        xvf0 xvf0Var = this.E;
        t160 t160Var = this.U;
        eqh eqhVar = this.S;
        zo0 zo0Var = new zo0(n3wVar4, xvf0Var, t160Var, b3, eqhVar, x8gVar.F, 22);
        n3w n3wVar5 = this.G;
        eqh eqhVar2 = x8gVar.T;
        xvf0 xvf0Var2 = this.L;
        xvf0 xvf0Var3 = this.M;
        xvf0 xvf0Var4 = x8gVar.A;
        xvf0 xvf0Var5 = x8gVar.q;
        ze zeVar = this.N;
        xvf0 xvf0Var6 = this.O;
        xvf0 xvf0Var7 = x8gVar.N1;
        n3w n3wVar6 = this.P;
        xvf0 xvf0Var8 = x8gVar.G;
        p6f p6fVar2 = this.Q;
        xvf0 xvf0Var9 = this.R;
        lwv lwvVar = kwv.a;
        xvf0 xvf0Var10 = x8gVar.V;
        xvf0 xvf0Var11 = this.C;
        xvf0 xvf0Var12 = this.B;
        xvf0 xvf0Var13 = x8gVar.F1;
        xvf0 xvf0Var14 = x8gVar.w;
        n3w n3wVar7 = this.T;
        n3w n3wVar8 = x8gVar.j;
        tqc tqcVar = new tqc();
        tqcVar.a = n3wVar4;
        tqcVar.b = n3wVar5;
        tqcVar.c = eqhVar2;
        tqcVar.d = xvf0Var2;
        tqcVar.e = xvf0Var3;
        tqcVar.f = xvf0Var4;
        tqcVar.g = xvf0Var5;
        tqcVar.h = zeVar;
        tqcVar.i = xvf0Var6;
        tqcVar.j = xvf0Var7;
        tqcVar.k = n3wVar6;
        tqcVar.l = xvf0Var8;
        tqcVar.m = xvf0Var;
        tqcVar.n = p6fVar2;
        tqcVar.o = xvf0Var9;
        tqcVar.p = lwvVar;
        tqcVar.q = eqhVar;
        tqcVar.r = xvf0Var10;
        tqcVar.s = xvf0Var11;
        tqcVar.t = xvf0Var12;
        tqcVar.u = xvf0Var13;
        tqcVar.v = xvf0Var14;
        tqcVar.w = n3wVar7;
        tqcVar.x = zo0Var;
        tqcVar.y = b3;
        tqcVar.z = n3wVar8;
        int i = 4;
        this.W = new qx5(n3w.a(new pwv(tqcVar)), this.N, i);
        int i2 = 6;
        ibz0 ibz0Var = new ibz0(x8gVar.t, x8gVar.H, i2);
        this.X = ibz0Var;
        int i3 = 26;
        this.Y = new v8c0(n3w.a(new xxz0(new hlx0(this.S, ibz0Var, x8gVar.q, x8gVar.T0, this.E, 4))), i3);
        int i4 = 27;
        this.Z = new v8c0(n3w.a(new ayz0(new ho9(x8gVar.q, this.E, this.S, this.X))), i4);
        n3w n3wVar9 = this.y;
        this.a0 = new nb11(n3wVar9, 12);
        this.b0 = new nb11(n3wVar9, 11);
        xvf0 b4 = i5m.b(new uc50(x8gVar.V0, n3wVar9, 3));
        this.c0 = b4;
        n3w n3wVar10 = this.y;
        xvf0 xvf0Var15 = x8gVar.A;
        int i5 = 17;
        this.d0 = new ret(n3wVar10, xvf0Var15, b4, i5);
        this.e0 = new mg11(new nb11(xvf0Var15, 25), x8gVar.q, i3);
        this.f0 = n3w.a(fragmentActivity);
        eqh eqhVar3 = new eqh();
        this.g0 = eqhVar3;
        int i6 = 9;
        xvf0 b5 = i5m.b(new jpn0(this.f0, x8gVar.j, x8gVar.A, this.S, x8gVar.O1, new eu0(eqhVar3, i6), this.x, x8gVar.h0));
        this.h0 = b5;
        rct0 rct0Var = new rct0(x8gVar.q, (xvf0) this.S, b5, this.E, (xvf0) new fat0(x8gVar.j, x8gVar.A, 7), 5);
        int i7 = 10;
        this.i0 = new cys0((xvf0) this.e0, (xvf0) rct0Var, i7);
        eqh eqhVar4 = this.g0;
        ar00 ar00Var = new ar00(7);
        ar00Var.Eg(InitialFragment.class, this.W);
        ar00Var.Eg(TopupNoticeDeprecatedFragment.class, this.Y);
        ar00Var.Eg(TopupNoticeFragment.class, this.Z);
        ar00Var.Eg(UpgradeFragment.class, this.a0);
        ar00Var.Eg(UpgradeEditFragment.class, this.b0);
        ar00Var.Eg(MenuFragment.class, this.d0);
        ar00Var.Eg(SpoilerOnboardingFragment.class, this.i0);
        eqh.a(eqhVar4, ar00Var.Hg());
        xat xatVar = new xat(this.g0, i4);
        this.j0 = xatVar;
        eqh.a(this.S, i5m.b(new ivo0(i5m.b(new qd21(this.C, this.E, xatVar, x8gVar.l, this.T, 12)), i3)));
        this.k0 = i5m.b(ygk.a);
        int i8 = 1;
        this.l0 = i5m.b(new njp(this.y, i8));
        this.m0 = i5m.b(new c7n(cpnVar, this.y));
        this.n0 = i5m.b(new zfa(x8gVar.q, x8gVar.V, this.x, i5));
        this.o0 = i5m.b(f7a0.a);
        this.p0 = i5m.b(new nb11(tp41Var, x8gVar.X, 29));
        this.q0 = i5m.b(new c0j(x8gVar.A, this.M, x8gVar.G, x8gVar.w, 3));
        this.r0 = i5m.b(new c7n(x8gVar.Q1, i7));
        this.s0 = i5m.b(new wrh(this.S, this.M, this.E, 11));
        this.t0 = i5m.b(new c7n(this.M, i6));
        this.u0 = i5m.b(chk.a);
        this.v0 = i5m.b(q7g0.a);
        n3w n3wVar11 = x8gVar.j;
        xvf0 xvf0Var16 = x8gVar.u;
        this.w0 = i5m.b(new lq40(i7, new di20(x8gVar.V0, new lq40(i6, new di20(x8gVar.H1, new jc50(n3wVar11, xvf0Var16, x8gVar.h, 25), n3wVar11, 28)), xvf0Var16, 29)));
        i5m.b(new f9t(14, this.y, x8gVar.o, h7uVar));
        this.x0 = i5m.b(new s90(x8gVar.b0, x8gVar.a0, x8gVar.q, 0));
        this.y0 = i5m.b(new ibz0(x8gVar.r1, this.y, i7));
        this.z0 = i5m.b(new ivo0(x8gVar.o, i4));
        this.A0 = i5m.b(new oto0(this.f0, i5m.b(new p4((xvf0) x8gVar.o, (xvf0) new c1(x8gVar.A, 24), 11)), i5));
        this.B0 = i5m.b(new uc50(x8gVar.V0, this.c0, i));
        int i9 = 13;
        this.C0 = i5m.b(new m7q0(luq0Var, this.y, i9));
        this.D0 = i5m.b(new njp(x8gVar.j, i6));
        this.E0 = i5m.b(new vm80(i3d0Var, x8gVar.o, this.y));
        this.F0 = i5m.b(new p8k0(x8gVar.j, x8gVar.q, x8gVar.n, x8gVar.k, 19));
        this.G0 = i5m.b(new zo0(cardFeatureModule, x8gVar.t, x8gVar.u, x8gVar.T, this.L, x8gVar.X, this.K));
        this.H0 = i5m.b(new ig7(cardFeatureModule, x8gVar.Q1, i2));
        this.I0 = i5m.b(new z0s0(this.L, i6));
        this.J0 = i5m.b(new upk0(x8gVar.A, 15));
        this.K0 = i5m.b(new s3f0(this.S, this.M, this.E, 19));
        this.L0 = i5m.b(new upk0(x8gVar.K0, 16));
        this.M0 = i5m.b(new jde0(this.y, 12));
        this.N0 = i5m.b(new njp(this.y, 2));
        n3w n3wVar12 = this.y;
        this.O0 = new mam0(ihm0Var, n3wVar12, i);
        this.P0 = new cys0(d9u0Var, n3wVar12, i9);
        this.Q0 = new oti((Object) gslVar, (xvf0) n3wVar12, i7, (boolean) (0 == true ? 1 : 0));
        this.R0 = new flx0(uu01Var, n3wVar12, 25);
        this.S0 = new jpf0(yli0Var, n3wVar12, 11);
        this.T0 = new mvy(n3wVar12, 29);
        this.U0 = new jde0(n3wVar12, i9);
        this.V0 = new g680(kh90Var, n3wVar12, i2);
        this.W0 = new g680(ri90Var, n3wVar12, i6);
        this.X0 = new c4p(lqsVar, n3wVar12, 25);
        this.Y0 = new p6f(n3wVar12, i8);
        this.Z0 = new p4(i5Var, n3wVar12, i8);
        this.a1 = i5m.b(new c1(n3wVar12, 3));
        n3w n3wVar13 = this.y;
        this.b1 = new br10(n3wVar13, i8);
        this.c1 = new tl3(n3wVar13, 5);
        int i10 = 23;
        this.d1 = new n2y0(n3wVar13, i10);
        this.e1 = new dx7(cardFeatureModule, n3wVar13, i);
        this.f1 = i5m.b(new ig7(s39Var, n3wVar13, i9));
        this.g1 = i5m.b(new k1w(this.y, 21));
        this.h1 = i5m.b(new c7n(this.y, 8));
        n3w n3wVar14 = this.y;
        this.i1 = new k1w(n3wVar14, i4);
        this.j1 = new vqa0((xvf0) n3wVar14, (int) (0 == true ? 1 : 0));
        this.k1 = i5m.b(new upk0(n3wVar14, 17));
        int i11 = 18;
        this.l1 = i5m.b(new qcz0(this.y, i11));
        n3w n3wVar15 = this.y;
        this.m1 = new m7q0(n3wVar15, i11);
        this.n1 = new z0s0(n3wVar15, i10);
        this.o1 = new vqa0(n3wVar15, 5);
        this.p1 = new qcz0(this.g0, 3);
        this.q1 = new jde0(n3wVar15, i10);
        this.r1 = new l180(n3wVar15, 29);
        this.s1 = new cys0(htt0Var, n3wVar15, i2);
        this.t1 = new ig7(n3wVar15, 17);
        this.u1 = i5m.b(new s90(q59Var, x8gVar.o, n3wVar15, x8gVar.T1, 22));
        tig0 tig0Var = new tig0(45, 0);
        tig0Var.d(this.N0);
        tig0Var.d(this.O0);
        tig0Var.d(this.P0);
        tig0Var.d(this.Q0);
        tig0Var.d(this.R0);
        tig0Var.d(this.S0);
        tig0Var.d(this.T0);
        tig0Var.d(this.U0);
        tig0Var.d(this.V0);
        tig0Var.d(this.W0);
        tig0Var.d(this.R);
        tig0Var.d(this.X0);
        tig0Var.d(this.Y0);
        tig0Var.d(this.Z0);
        tig0Var.d(this.a1);
        tig0Var.d(this.b1);
        tig0Var.d(this.N);
        tig0Var.d(this.c1);
        tig0Var.d(this.d1);
        tig0Var.d(this.e1);
        tig0Var.d(this.f1);
        tig0Var.d(this.g1);
        tig0Var.d(this.h1);
        tig0Var.d(this.i1);
        tig0Var.d(x8gVar.R1);
        tig0Var.d(this.c0);
        tig0Var.d(this.j1);
        tig0Var.d(this.O);
        tig0Var.d(this.E0);
        tig0Var.d(this.M0);
        tig0Var.d(this.k1);
        tig0Var.d(this.l1);
        tig0Var.d(this.m1);
        tig0Var.d(this.n1);
        tig0Var.d(this.y0);
        tig0Var.d(this.o1);
        tig0Var.d(this.M);
        tig0Var.d(this.j0);
        tig0Var.d(this.p1);
        tig0Var.d(this.q1);
        tig0Var.d(this.z);
        tig0Var.d(this.r1);
        tig0Var.d(this.s1);
        tig0Var.d(this.t1);
        tig0Var.d(this.u1);
        this.v1 = i5m.b(new og50(tig0Var.e(), 1));
        this.w1 = i5m.b(new fhm0(3, uu01Var));
        this.x1 = i5m.b(new pmn0(x8gVar.j, this.f0, x8gVar.A, x8gVar.q, x8gVar.e0, 9));
        this.y1 = i5m.b(new qcz0(uu01Var, this.C, 20));
        this.z1 = i5m.b(new p8k0(x8gVar.j, x8gVar.h0, x8gVar.A, x8gVar.u, 18));
        this.A1 = i5m.b(new zfa(x8gVar.u, x8gVar.v1, x8gVar.q, 26));
        this.B1 = n3w.a(new lhk(new q4g(ihk.a, new faj(x8gVar.V1, 11), this.Q, new faj(x8gVar.q, i10), this.k0, 10)));
        this.C1 = i5m.b(new nb11(pt11Var, this.y, i));
        this.D1 = i5m.b(new p6f(s0hVar, this.C, i11));
        this.E1 = i5m.b(new jde0(x8gVar.p1, 22));
        this.F1 = i5m.b(new xat(vztVar, i5m.b(new b55(20, vztVar))));
        this.G1 = i5m.b(new pmn0(x8gVar.q, this.F0, x8gVar.t, x8gVar.u, x8gVar.A, 13));
    }

    public final if8 A() {
        return new if8((b) this.v.A.get());
    }

    public final x B() {
        x8g x8gVar = this.v;
        return new x((f) x8gVar.G.get(), (ppp0) x8gVar.w.get(), (AppAnalyticsReporter) x8gVar.q.get(), (ppp0) x8gVar.w.get());
    }

    public final Map C() {
        y5e.i(7, "expectedSize");
        ImmutableMap.a aVar = new ImmutableMap.a(7);
        aVar.b(InitialFragment.class, this.W);
        aVar.b(TopupNoticeDeprecatedFragment.class, this.Y);
        aVar.b(TopupNoticeFragment.class, this.Z);
        aVar.b(UpgradeFragment.class, this.a0);
        aVar.b(UpgradeEditFragment.class, this.b0);
        aVar.b(MenuFragment.class, this.d0);
        aVar.b(SpoilerOnboardingFragment.class, this.i0);
        return aVar.a();
    }

    public final j8g D() {
        j8g j8gVar = new j8g();
        x8g x8gVar = this.v;
        mvy mvyVar = new mvy(x8gVar.b2, 28);
        n3w n3wVar = x8gVar.j;
        h9g h9gVar = this.w;
        j8gVar.a = i5m.b(new gc((xvf0) n3wVar, (xvf0) h9gVar.P, x8gVar.G, x8gVar.w, h9gVar.E, (xvf0) h9gVar.Q, x8gVar.q, (xvf0) mvyVar, x8gVar.A, 23));
        return j8gVar;
    }

    public final cu2 a() {
        cu2 cu2Var = (cu2) this.v.e.w.invoke(this);
        q5z.i(cu2Var);
        return cu2Var;
    }

    public final a b() {
        x8g x8gVar = this.v;
        return new a(new com.ybsdk.common.domain.b((com.ybsdk.common.repositiories.balance.a) x8gVar.J.get(), (com.ybsdk.common.repositiories.agreements.a) x8gVar.H.get()), (r6a0) x8gVar.Q.get(), (nbp0) x8gVar.u.get());
    }

    public final com.ybsdk.screens.upgrade.a c() {
        tfl0 tfl0Var = (tfl0) this.S.get();
        x8g x8gVar = this.v;
        return new com.ybsdk.screens.upgrade.a(tfl0Var, (AppAnalyticsReporter) x8gVar.q.get(), (k03) this.L.get(), (nbp0) x8gVar.u.get(), (nvd) x8gVar.Q1.get(), (b) x8gVar.A.get(), this.E, (kbo) this.h1.get());
    }

    public final AppAnalyticsReporter d() {
        return (AppAnalyticsReporter) this.v.q.get();
    }

    public final com.ybsdk.common.a e() {
        return (com.ybsdk.common.a) this.n0.get();
    }

    public final r501 f() {
        return new r501(17, this.v.e, (qa60) this.c0.get());
    }

    public final j0g g() {
        x8g x8gVar = this.v;
        return new j0g((b) x8gVar.A.get(), x8gVar.a);
    }

    public final j3h h() {
        return (j3h) this.E.get();
    }

    public final j0g i() {
        x8g x8gVar = this.v;
        return new j0g((w4o) x8gVar.i.get(), (b) x8gVar.A.get());
    }

    public final eci0 j() {
        eci0 eci0Var = ((e7a0) this.o0.get()).b;
        q5z.i(eci0Var);
        return eci0Var;
    }

    public final uzt k() {
        return (uzt) this.F1.get();
    }

    public final com.ybsdk.screens.initial.a l() {
        return new com.ybsdk.screens.initial.a(C());
    }

    public final tv3 m() {
        return new tv3((b) this.v.A.get());
    }

    public final g3d0 n() {
        return (g3d0) this.E0.get();
    }

    public final com.ybsdk.utils.poller.b o() {
        ImmutableSet l = ImmutableSet.l(2, new com.ybsdk.utils.poller.f(), (yyd0) this.J.get());
        x8g x8gVar = this.v;
        return new com.ybsdk.utils.poller.b(l, new qyd0((b) x8gVar.A.get(), new o370((b) x8gVar.A.get()), (AppAnalyticsReporter) x8gVar.q.get()));
    }

    public final a7i0 p() {
        x8g x8gVar = this.v;
        kg51 kg51Var = x8gVar.e;
        a7i0 a7i0Var = (a7i0) kg51Var.p.invoke(new d7i0(), this.d);
        q5z.i(a7i0Var);
        return a7i0Var;
    }

    public final b q() {
        return (b) this.v.A.get();
    }

    public final AppAnalyticsReporter r() {
        return (AppAnalyticsReporter) this.v.q.get();
    }

    public final t0k0 s() {
        return (t0k0) this.v.s.get();
    }

    public final tfl0 t() {
        return (tfl0) this.S.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b3z u() {
        ayf ayfVar = new ayf(this, 29);
        byf byfVar = new byf(this, 1);
        ayf ayfVar2 = new ayf(this, 28);
        ayf ayfVar3 = new ayf(this, 27);
        ayf ayfVar4 = new ayf(this, 24);
        int i = 25;
        epf epfVar = new epf(byfVar, ayfVar2, ayfVar, ayfVar3, new wif((Object) ayfVar4, (xvf0) new ayf(this, 26), 6), new f2b(new byf(this, 0), ayfVar3, ayfVar4, i), new ayf(this, i), 2);
        a3h a3hVar = (a3h) this.v.T0.get();
        q5z.h(a3hVar);
        AppAnalyticsReporter d = d();
        q5z.h(d);
        return new b3z(epfVar, a3hVar, new xjg(d, new m501(18), 0 == true ? 1 : 0, 2));
    }

    public final cjm0 v() {
        return new cjm0(20, this.c, this.v.a);
    }

    public final y1r0 w() {
        return (y1r0) this.v.R.get();
    }

    public final com.ybsdk.widgets.common.shimmer.b x() {
        return new com.ybsdk.widgets.common.shimmer.b(new bwb0((b) this.v.A.get()));
    }

    public final x4x0 y() {
        tfl0 tfl0Var = (tfl0) this.S.get();
        x8g x8gVar = this.v;
        return new x4x0(tfl0Var, (AppAnalyticsReporter) x8gVar.q.get(), (b) x8gVar.A.get(), (j3h) this.E.get());
    }

    public final mj31 z() {
        AppAnalyticsReporter r = r();
        q5z.h(r);
        x8g x8gVar = this.v;
        dj51 dj51Var = (dj51) x8gVar.P1.get();
        q5z.h(dj51Var);
        return new mj31(3, r, dj51Var, new eg01((w4o) x8gVar.i.get()));
    }
}
