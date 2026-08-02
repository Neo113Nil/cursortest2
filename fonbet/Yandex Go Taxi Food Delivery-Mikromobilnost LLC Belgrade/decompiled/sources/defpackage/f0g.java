package defpackage;

import android.content.Context;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.route.interactor.b;
import com.yandex.go.shortcuts.impl.interactors.d;
import com.yandex.go.shortcuts.impl.interactors.w;
import com.yandex.go.superapp.order.multi.old.view.g;
import com.yandex.go.taxi.order.map.curtain.floating.button.OrderMapCurtainHideFloatingButtonView;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.experiments.superapp.j;
import ru.yandex.taxi.order.recenter.NextRecenterButtonView;
import ru.yandex.taxi.panorama.l;
import ru.yandex.taxi.sdc.router.e;

/* loaded from: classes5.dex */
public final class f0g implements sw70 {
    public final ph70 A0;
    public xvf0 A6;
    public final xvf0 B;
    public final n3w B0;
    public final n2y0 B1;
    public final xvf0 B2;
    public final n3w B3;
    public f380 B6;
    public final xvf0 C;
    public final xvf0 C0;
    public final xvf0 C1;
    public final xvf0 C2;
    public final yc C3;
    public zi60 C6;
    public final xvf0 D;
    public final rx4 D0;
    public n3w D6;
    public final xvf0 E;
    public final lyh E0;
    public prq E6;
    public final xvf0 F;
    public final x F0;
    public final t4v0 G;
    public final nma G0;
    public final n3w H;
    public final xvf0 H0;
    public final xvf0 H1;
    public final n3w H2;
    public final xvf0 H3;
    public final xvf0 H4;
    public final ia80 I;
    public final fat0 I0;
    public final xvf0 I5;
    public final n3w J;
    public final mz70 J0;
    public final xvf0 J5;
    public final xvf0 K;
    public final fy30 K0;
    public final xvf0 K5;
    public final xvf0 L;
    public final xvf0 L0;
    public final xvf0 L5;
    public final zi60 M;
    public final uc50 M0;
    public final xvf0 M4;
    public final xvf0 M5;
    public final dx9 N;
    public final xvf0 N0;
    public final pab N1;
    public final gaq0 N2;
    public final xvf0 N3;
    public final xvf0 N4;
    public final xvf0 N5;
    public final wvq O;
    public final zi60 O0;
    public final xvf0 O5;
    public final xvf0 P;
    public final n3w P0;
    public final yc P5;
    public final xvf0 Q;
    public final n3w Q0;
    public final jpf0 Q5;
    public final xvf0 R;
    public final xvf0 R0;
    public final n3w R5;
    public final xvf0 S;
    public final zo0 S0;
    public final xvf0 S5;
    public final h0z T;
    public final n3w T0;
    public final xvf0 T1;
    public final t160 T2;
    public final amy T3;
    public final xvf0 T5;
    public final xvf0 U;
    public final xvf0 U5;
    public final flx0 V;
    public final xvf0 V1;
    public final xvf0 V2;
    public final oto0 V3;
    public final xvf0 V5;
    public final e3u W;
    public final xvf0 W5;
    public final xvf0 X1;
    public final xvf0 X2;
    public final xvf0 X4;
    public final xvf0 X5;
    public final xvf0 Y5;
    public final xvf0 Z;
    public final xvf0 Z5;
    public final x980 a;
    public final x a0;
    public final g680 a6;
    public final ow70 b;
    public final xvf0 b0;
    public final xvf0 b6;
    public final lds c;
    public final xvf0 c0;
    public vo3 c6;
    public final qcb d0;
    public eqh d6;
    public final xvf0 e0;
    public xvf0 e6;
    public final njp f0;
    public xvf0 f6;
    public final x g0;
    public xvf0 g6;
    public final xvf0 h0;
    public cta0 h6;
    public final js0 i0;
    public xvf0 i6;
    public final n3w j0;
    public n3w j6;
    public final f9t k0;
    public ibz0 k6;
    public final fmn l0;
    public js0 l6;
    public final p4 m0;
    public kkt m6;
    public final fwc n0;
    public x0z n6;
    public final qcz0 o0;
    public f9t o6;
    public final xvf0 p0;
    public final yc p1;
    public final xvf0 p2;
    public n3w p6;
    public final zni0 q0;
    public xvf0 q6;
    public final zni0 r0;
    public xvf0 r6;
    public final xvf0 s0;
    public npi s6;
    public final s3f0 t0;
    public jc50 t6;
    public final xvf0 u0;
    public xvf0 u6;
    public final xvf0 v0;
    public final c0j v1;
    public final ph70 v2;
    public final xvf0 v3;
    public final xvf0 v4;
    public di20 v6;
    public final zzf w;
    public final sb1 w0;
    public xvf0 w6;
    public final c0g x;
    public final z10 x0;
    public final jc50 x1;
    public final xvf0 x2;
    public xvf0 x6;
    public final e0g y;
    public final zi60 y0;
    public final gpx0 y1;
    public final xvf0 y2;
    public ig7 y6;
    public final js0 z0;
    public n3w z6;
    public final f0g z = this;
    public final xvf0 A = i5m.b(fd80.a);

    /* JADX WARN: Multi-variable type inference failed */
    public f0g(zzf zzfVar, c0g c0gVar, e0g e0gVar, x980 x980Var, lw70 lw70Var, ow70 ow70Var, lds ldsVar, pw70 pw70Var) {
        this.w = zzfVar;
        this.x = c0gVar;
        this.y = e0gVar;
        this.a = x980Var;
        this.b = ow70Var;
        this.c = ldsVar;
        xvf0 xvf0Var = c0gVar.B;
        eqh eqhVar = zzfVar.e6;
        xvf0 xvf0Var2 = c0gVar.C;
        d0g d0gVar = c0gVar.a;
        xvf0 b = i5m.b(new wj0(xvf0Var, eqhVar, xvf0Var2, d0gVar.C, zzfVar.Xa, zzfVar.zn, c0gVar.nx, zzfVar.Pj, 23));
        this.B = b;
        xvf0 b2 = i5m.b(new ahu(this.A, c0gVar.Fs, b, c0gVar.us, zzfVar.cb, 13));
        this.C = b2;
        i5m.b(new uc50(c0gVar.U, b2, 27));
        eqh eqhVar2 = zzfVar.d0;
        int i = 19;
        this.D = i5m.b(new gc(c0gVar.B, zzfVar.X4, zzfVar.S4, (xvf0) zzfVar.B0, zzfVar.J2, (xvf0) zzfVar.Y1, zzfVar.W, (xvf0) d0gVar.s5, (xvf0) new rut(new tl3(eqhVar2, 3), new nb11(eqhVar2, i), i), 18));
        this.E = i5m.b(n1t.a);
        this.F = i5m.b(z980.a);
        this.G = new t4v0(e0gVar.u, this.E, this.D, c0gVar.f95me, 18);
        n3w a = n3w.a(this);
        this.H = a;
        this.I = new ia80(a, c0gVar.pp, a, zzfVar.lh);
        this.J = n3w.a(x980Var);
        int i2 = 10;
        this.K = i5m.b(new wz30(this.H, i2));
        this.L = i5m.b(i760.a);
        eqh eqhVar3 = zzfVar.e6;
        xvf0 xvf0Var3 = zzfVar.Bc;
        xvf0 xvf0Var4 = zzfVar.jr;
        xvf0 xvf0Var5 = zzfVar.ek;
        xvf0 xvf0Var6 = d0gVar.v5;
        xvf0 xvf0Var7 = zzfVar.rl;
        this.M = new zi60(xvf0Var7, evn.a, new lok0(eqhVar3, xvf0Var3, xvf0Var4, xvf0Var5, xvf0Var6, xvf0Var7, c0gVar.l8, 4), 13, false);
        int i3 = 1;
        dx9 dx9Var = new dx9(e0gVar.o, new ncb(c0gVar.U, zzfVar.M3, zzfVar.p3, new peb(zzfVar.d0, i3), c0gVar.lA, c0gVar.T), i2, false);
        this.N = dx9Var;
        this.O = new wvq(zzfVar.J2, zzfVar.bb, zzfVar.I2, zzfVar.n, (v7p) dx9Var, (xvf0) zzfVar.ki, 29);
        this.P = i5m.b(new h0z(zzfVar.w0, dhs0.a(qmz.a), 4));
        xvf0 b3 = i5m.b(new ret(this.P, zzfVar.n, i5m.b(cnz.a), 11));
        this.Q = b3;
        this.R = i5m.b(new ahu(c0gVar.Ul, b3, zzfVar.B2, zzfVar.bb, zzfVar.n, 3));
        this.S = i5m.b(new oto0(c0gVar.mm, zzfVar.n, 19));
        this.T = new h0z(c0gVar.mm, c0gVar.Ul, 3);
        int i4 = 23;
        this.U = i5m.b(new k1w(zzfVar.e6, i4));
        mvy mvyVar = new mvy(zzfVar.d0, 0 == true ? 1 : 0);
        flx0 flx0Var = new flx0(e0gVar.o, new fat0(c0gVar.U, zzfVar.n, i4), 6);
        this.V = flx0Var;
        xvf0 xvf0Var8 = zzfVar.C;
        mvy mvyVar2 = new mvy(xvf0Var8, i3);
        this.W = new e3u((xvf0) mvyVar, (xvf0) new e3u((xvf0) flx0Var, (xvf0) mvyVar2, zzfVar.W, 13, (byte) 0), (xvf0) mvyVar2, 14);
        this.Z = dhs0.a(new jde0(xvf0Var8, 3));
        this.a0 = new x(zzfVar.n, 17);
        this.b0 = i5m.b(new n2y0(this.J, i2));
        this.c0 = i5m.b(new n2y0(this.J, 3));
        xvf0 b4 = i5m.b(new n2y0(this.J, 13));
        xvf0 xvf0Var9 = zzfVar.V4;
        xvf0 xvf0Var10 = zzfVar.I2;
        xvf0 xvf0Var11 = zzfVar.kr;
        cg7 cg7Var = zzfVar.U4;
        x xVar = this.a0;
        xvf0 xvf0Var12 = zzfVar.Ma;
        xvf0 xvf0Var13 = this.Z;
        xvf0 xvf0Var14 = zzfVar.lr;
        xvf0 xvf0Var15 = this.b0;
        xvf0 xvf0Var16 = this.c0;
        qpw qpwVar = ppw.a;
        qcb qcbVar = new qcb(xvf0Var9, xvf0Var10, xvf0Var11, cg7Var, xVar, xvf0Var12, xvf0Var13, xvf0Var14, xvf0Var15, xvf0Var16, b4, qpwVar, 5);
        this.d0 = qcbVar;
        this.e0 = i5m.b(new h0l0(c0gVar.D, xvf0Var13, qcbVar, xvf0Var11, xvf0Var12, e0gVar.o, new gpx0(c0gVar.U, c0gVar.o0, new rbx0(zzfVar.W, 24), 2), d0gVar.y5, c0gVar.Tg, qpwVar));
        this.f0 = new njp(zzfVar.bb, 14);
        this.g0 = new x(zzfVar.n, 17);
        int i5 = 18;
        this.h0 = i5m.b(new ht0((xvf0) zzfVar.j1, (xvf0) c0gVar.wh, e0gVar.o, c0gVar.U, zzfVar.W, (xvf0) new f2b(i5m.b(new wj0(this.g0, zzfVar.V4, zzfVar.U4, zzfVar.I2, zzfVar.j1, zzfVar.q, i5m.b(new n2y0(this.J, 5)), zzfVar.W, 27)), zzfVar.mr, new srb(new peb(zzfVar.d0, 27), i5), i5), (xvf0) xwe.a, 29));
        js0 js0Var = new js0(zzfVar.A9, zzfVar.E9, zzfVar.nr, vea0.a, 12);
        this.i0 = js0Var;
        this.j0 = n3w.a(new lov(new wjm(zzfVar.vj, js0Var, zzfVar.J8, c0gVar.pg, 20)));
        this.k0 = new f9t(zzfVar.o4, c0gVar.cD, 22);
        this.l0 = new fmn(c0gVar.B, zzfVar.bb, this.i0, zzfVar.vj, this.j0, c0gVar.X6, this.k0, c0gVar.Y6, c0gVar.Z6, c0gVar.VA, d0gVar.C3, n3w.a(new nov(new zz7(zzfVar.j1, c0gVar.P6))), zzfVar.nr, zzfVar.ei, c0gVar.aa, c0gVar.l6, zzfVar.Y1, zzfVar.u1, zzfVar.Qo);
        wj0 wj0Var = new wj0(c0gVar.U, zzfVar.n, c0gVar.ot, zzfVar.vn, c0gVar.J9, c0gVar.zu, zzfVar.U, zzfVar.o4, 2);
        xvf0 xvf0Var17 = e0gVar.o;
        this.m0 = new p4((Object) wj0Var, xvf0Var17, 22);
        this.n0 = new fwc(this.H, xvf0Var17, 20);
        this.o0 = new qcz0(zzfVar.d0, 1);
        this.p0 = i5m.b(new s3f0(zzfVar.J2, zzfVar.Bc, c0gVar.im, 3));
        this.q0 = new zni0(zzfVar.W, 26);
        jpj0 jpj0Var = new jpj0(this.q0, i5m.b(new n7i0(zzfVar.c, zzfVar.q, 13)), new n7i0(zzfVar.c, zzfVar.q, 12), 9);
        int i6 = 16;
        zni0 zni0Var = new zni0(zzfVar.d0, i6);
        this.r0 = zni0Var;
        xvf0 b5 = i5m.b(new jpj0(10, jpj0Var, new jzi0(7, zni0Var), zzfVar.n));
        this.s0 = b5;
        this.t0 = new s3f0(c0gVar.B, zzfVar.Wh, b5, i6);
        this.u0 = i5m.b(b480.a);
        xvf0 b6 = i5m.b(new f380(new l180(zzfVar.d, 3), 4));
        this.v0 = b6;
        xvf0 xvf0Var18 = this.u0;
        xvf0 xvf0Var19 = zzfVar.Uh;
        xvf0 xvf0Var20 = zzfVar.z;
        eqh eqhVar4 = zzfVar.o4;
        x2b x2bVar = d0gVar.K0;
        this.w0 = new sb1(xvf0Var18, xvf0Var19, b6, xvf0Var20, eqhVar4, x2bVar, zzfVar.n, 25);
        int i7 = 0;
        f380 f380Var = new f380(new l180(zzfVar.d0, i7), 2);
        this.x0 = new z10(xvf0Var18, f380Var, i7);
        this.y0 = new zi60(xvf0Var18, b6, new ge50((xvf0) new z10(xvf0Var18, f380Var, 1), zzfVar.Ze, c0gVar.J9, zzfVar.Ye, 12, false), 11, false);
        n3w a2 = n3w.a(new z380(new dt20(x2bVar, c0gVar.n0, new uc50(eqhVar4, this.J, 23), c0gVar.B, 16)));
        xvf0 xvf0Var21 = c0gVar.U;
        js0 js0Var2 = new js0(xvf0Var21, c0gVar.t7, c0gVar.J9, zzfVar.n, 11);
        this.z0 = js0Var2;
        this.A0 = new ph70(c0gVar.o0, c0gVar.dj, c0gVar.ej, a2, js0Var2, xvf0Var21);
        this.B0 = n3w.a(new lvk0(new zz7(xvf0Var21, c0gVar.zu)));
        xvf0 b7 = i5m.b(new n2y0(this.J, 0));
        this.C0 = b7;
        n3w a3 = n3w.a(new nvk0(new s6k0(d0gVar.K0, new mz70(zzfVar.n, c0gVar.ot, c0gVar.J9, b7, d0gVar.x1, ivk0.a, 16), zzfVar.U)));
        eqh eqhVar5 = c0gVar.o0;
        this.D0 = new rx4((xvf0) eqhVar5, (xvf0) this.B0, a3, zzfVar.u5, 16);
        eqh eqhVar6 = zzfVar.d0;
        upj upjVar = new upj(eqhVar6, 17);
        rqt rqtVar = zzfVar.vn;
        lyh lyhVar = new lyh(upjVar, rqtVar, 25);
        this.E0 = lyhVar;
        x xVar2 = new x(zzfVar.q3, 15);
        this.F0 = xVar2;
        n3w n3wVar = c0gVar.D;
        xvf0 xvf0Var22 = zzfVar.p3;
        xvf0 xvf0Var23 = zzfVar.D;
        xvf0 xvf0Var24 = d0gVar.B5;
        xvf0 xvf0Var25 = d0gVar.C5;
        nma nmaVar = new nma((v7p) new ci3(n3wVar, lyhVar, xvf0Var22, xvf0Var23, rqtVar, xvf0Var24, xvf0Var25, d0gVar.A5, xVar2), (xvf0) eqhVar5, 26);
        this.G0 = nmaVar;
        xvf0 b8 = i5m.b(new z6x0(c0gVar.B, this.H, new q2p(c0gVar.U, zzfVar.Y, eqhVar6, c0gVar.hg, c0gVar.Fw, zzfVar.S3, zzfVar.kj, xvf0Var22, rqtVar, c0gVar.lh, zzfVar.M3, xvf0Var24, xvf0Var25, d0gVar.D5, d0gVar.E5, d0gVar.F5, d0gVar.G5, d0gVar.H5, d0gVar.I5, d0gVar.J5, c0gVar.cx, nmaVar, 4), c0gVar.T, 5));
        this.H0 = b8;
        fat0 fat0Var = new fat0(b8, d0gVar.M0, 22);
        this.I0 = fat0Var;
        xvf0 xvf0Var26 = c0gVar.U;
        xvf0 xvf0Var27 = zzfVar.Ze;
        xvf0 xvf0Var28 = c0gVar.J9;
        xvf0 xvf0Var29 = zzfVar.n;
        mz70 mz70Var = new mz70(xvf0Var26, xvf0Var27, xvf0Var28, xvf0Var29, zzfVar.M3, zzfVar.uf, 2);
        this.J0 = mz70Var;
        z10 z10Var = this.x0;
        this.K0 = new fy30(this.w0, z10Var, this.y0, this.V, new m580(z10Var, this.A0, d0gVar.L0, this.D0, fat0Var, this.v0, zzfVar.o4, mz70Var, xvf0Var29), c0gVar.B, xvf0Var29, c0gVar.T, 4);
        xvf0 b9 = i5m.b(new n2y0(this.J, 4));
        this.L0 = b9;
        eqh eqhVar7 = zzfVar.o4;
        this.M0 = new uc50(eqhVar7, b9, 29);
        this.N0 = i5m.b(new rs0(zzfVar.n, eqhVar7, this.J0, this.A0, c0gVar.T, 8));
        ig7 ig7Var = new ig7(zzfVar.Wb, 16);
        xvf0 xvf0Var30 = c0gVar.U;
        o10 o10Var = c0gVar.Iu;
        xvf0 xvf0Var31 = c0gVar.t7;
        boolean z = false;
        this.O0 = new zi60(zzfVar.J2, new e840(xvf0Var30, o10Var, xvf0Var31, ig7Var, c0gVar.w7, 20), new zi60(xvf0Var30, xvf0Var31, new wz30(zzfVar.S3, 13), 14, z), 15, z);
        this.P0 = n3w.a(new a08(new zz7(xvf0Var30, zzfVar.uf)));
        this.Q0 = n3w.a(new k08(new c06(new pg5(new wz30(zzfVar.d0, 16), 25), zzfVar.U)));
        xvf0 xvf0Var32 = zzfVar.n;
        xvf0 xvf0Var33 = zzfVar.p3;
        xvf0 xvf0Var34 = zzfVar.W;
        wrh wrhVar = new wrh(xvf0Var32, xvf0Var33, xvf0Var34, 6);
        is70 is70Var = hs70.a;
        xvf0 b10 = i5m.b(new qrb((xvf0) is70Var, (xvf0) wrhVar, zzfVar.M3, xvf0Var34, (xvf0) zzfVar.c, 18, false));
        this.R0 = b10;
        xvf0 xvf0Var35 = zzfVar.W;
        fwc fwcVar = new fwc(b10, xvf0Var35, 21);
        jic jicVar = iic.a;
        xvf0 xvf0Var36 = c0gVar.J9;
        xvf0 xvf0Var37 = zzfVar.n;
        zo0 zo0Var = new zo0(is70Var, jicVar, xvf0Var36, xvf0Var35, xvf0Var37, zzfVar.c, 16);
        this.S0 = zo0Var;
        this.T0 = n3w.a(new vz7(new bu0(this.J, new dx7(rz7.a, new dx9(fwcVar, zo0Var, 18), 1), c0gVar.Zl, zzfVar.o4, zzfVar.Ze, zzfVar.Ye, xvf0Var37, xvf0Var36, d0gVar.K5)));
        n3w a4 = n3w.a(new d08(b08.a));
        xvf0 xvf0Var38 = e0gVar.o;
        n3w n3wVar2 = this.P0;
        n3w n3wVar3 = this.Q0;
        n3w n3wVar4 = this.T0;
        xvf0 xvf0Var39 = zzfVar.Uh;
        o08 o08Var = new o08(xvf0Var38, n3wVar2, n3wVar3, n3wVar4, a4, xvf0Var39, this.z0, 0);
        eqh eqhVar8 = zzfVar.o4;
        xvf0 xvf0Var40 = zzfVar.n;
        this.p1 = new yc((xvf0) o08Var, (xvf0) eqhVar8, xvf0Var39, xvf0Var40, (xvf0) c0gVar.T, d0gVar.K5, 16);
        this.v1 = new c0j(zzfVar.vn, zzfVar.p3, zzfVar.Id, xvf0Var40, 7);
        this.x1 = new jc50(c0gVar.Jw, zzfVar.J2, xvf0Var40, 10);
        n2y0 n2y0Var = new n2y0(zzfVar.Y, 15);
        xvf0 xvf0Var41 = zzfVar.lh;
        this.y1 = new gpx0(xvf0Var40, (xvf0) n2y0Var, xvf0Var41, 5, (byte) 0);
        this.B1 = new n2y0(xvf0Var41, 14);
        xvf0 b11 = i5m.b(new vm80(zzfVar.cg, xvf0Var40, 25));
        this.C1 = b11;
        xvf0 b12 = i5m.b(new vm80(zzfVar.he, b11, 24));
        this.H1 = b12;
        xvf0 b13 = i5m.b(new ahu(b12, this.C1, zzfVar.o4, this.B, zzfVar.n, 23));
        xvf0 xvf0Var42 = zzfVar.n;
        this.N1 = new pab(xvf0Var42, this.K0, this.M0, c0gVar.Is, d0gVar.G5, c0gVar.Ww, this.N0, c0gVar.yE, this.O0, this.p1, c0gVar.Rw, c0gVar.sv, this.D, this.v1, this.J, this.x1, c0gVar.sw, zzfVar.J2, this.y1, zzfVar.oh, this.B1, this.t0, b13, zzfVar.d3, 1);
        n3w a5 = n3w.a(new u3y0(new kob0(c0gVar.Fw, zzfVar.W, this.R0, zzfVar.L6, d0gVar.L5, zzfVar.qr, xvf0Var42)));
        n3w n3wVar5 = c0gVar.D;
        xvf0 xvf0Var43 = zzfVar.f0;
        gk10 gk10Var = zzfVar.pr;
        xvf0 xvf0Var44 = zzfVar.l6;
        qg60 qg60Var = new qg60(n3wVar5, xvf0Var43, gk10Var, a5, xvf0Var44, zzfVar.rr, zzfVar.O, zzfVar.sr, c0gVar.o0);
        xvf0 xvf0Var45 = zzfVar.n;
        eqh eqhVar9 = zzfVar.o4;
        o241 o241Var = zzfVar.m6;
        x7y0 x7y0Var = zzfVar.Y5;
        z7y0 z7y0Var = new z7y0(xvf0Var45, xvf0Var44, n3wVar5, eqhVar9, o241Var, x7y0Var, 0);
        eqh eqhVar10 = c0gVar.T;
        this.T1 = i5m.b(new dx70(e0gVar.u, zzfVar.Ma, eqhVar9, this.D, this.E, c0gVar.L0, this.F, this.G, d0gVar.t5, this.I, this.J, c0gVar.WA, this.K, this.B, zzfVar.e6, this.L, this.M, zzfVar.B2, this.O, c0gVar.sk, this.R, this.S, this.T, c0gVar.vw, this.U, d0gVar.w5, zzfVar.cb, d0gVar.C, this.W, zzfVar.Nl, zzfVar.Xa, d0gVar.x5, this.e0, eqhVar10, this.f0, this.d0, this.h0, this.l0, this.m0, this.n0, this.o0, this.p0, this.t0, this.N1, zzfVar.or, new u6o0(qg60Var, eqhVar10, zzfVar.X5, x7y0Var, z7y0Var, xvf0Var45), d0gVar.M5, zzfVar.lh, zzfVar.oh, this.B1));
        xvf0 b14 = i5m.b(new ig7(fg7.a, 0));
        xvf0 xvf0Var46 = c0gVar.B;
        xvf0 xvf0Var47 = zzfVar.W;
        xvf0 xvf0Var48 = zzfVar.f0;
        xvf0 xvf0Var49 = zzfVar.qi;
        xvf0 xvf0Var50 = zzfVar.n;
        xvf0 xvf0Var51 = zzfVar.p4;
        n3w n3wVar6 = c0gVar.D;
        xvf0 xvf0Var52 = c0gVar.E0;
        xvf0 xvf0Var53 = c0gVar.hg;
        xvf0 xvf0Var54 = zzfVar.s0;
        xvf0 xvf0Var55 = c0gVar.t7;
        xvf0 xvf0Var56 = c0gVar.U;
        xh xhVar = c0gVar.Fw;
        m7q0 m7q0Var = zzfVar.e;
        xvf0 xvf0Var57 = zzfVar.I2;
        xvf0 xvf0Var58 = zzfVar.Lo;
        eqh eqhVar11 = zzfVar.Y0;
        eqh eqhVar12 = zzfVar.X;
        eqh eqhVar13 = zzfVar.Y;
        eqh eqhVar14 = zzfVar.d0;
        xvf0 xvf0Var59 = e0gVar.o;
        this.V1 = i5m.b(new t4v0(c0gVar.Vb, i5m.b(new gpx0((xvf0) new rdt0(xvf0Var46, xvf0Var47, xvf0Var48, xvf0Var49, xvf0Var50, xvf0Var51, n3wVar6, xvf0Var52, xvf0Var53, xvf0Var54, xvf0Var55, xvf0Var56, xhVar, m7q0Var, xvf0Var57, b14, xvf0Var58, eqhVar11, eqhVar12, eqhVar13, eqhVar14, xvf0Var59, zzfVar.p6, zzfVar.o6, zzfVar.J2, c0gVar.T, zzfVar.p3, 1), xvf0Var59, (xvf0) new lu9(eqhVar14, 20), 3, false)), zzfVar.X5, zzfVar.Y5, 9));
        this.X1 = i5m.b(xa80.a);
        this.p2 = dhs0.a(new m7q0(dhs0.a(new d441(zzfVar.Z0, 24)), 27));
        ht0 ht0Var = new ht0((xvf0) c0gVar.Xh, (xvf0) c0gVar.Yh, (xvf0) zzfVar.rm, zzfVar.W, (xvf0) new c1(c0gVar.b0, 21), zzfVar.Bc, (xvf0) c0gVar.yk, 27);
        xvf0 xvf0Var60 = e0gVar.o;
        pl plVar = c0gVar.ct;
        n3w n3wVar7 = this.J;
        ph70 ph70Var = new ph70(xvf0Var60, (xvf0) plVar, (xvf0) n3wVar7, zzfVar.Qb, (xvf0) zzfVar.vh, (xvf0) ht0Var, (int) (0 == true ? 1 : 0));
        this.v2 = ph70Var;
        xvf0 b15 = i5m.b(new gpx0(zzfVar.rl, (xvf0) ph70Var, (xvf0) n3wVar7, 4, (byte) 0));
        this.x2 = b15;
        this.y2 = i5m.b(new vo3(c0gVar.U, c0gVar.B, zzfVar.o4, c0gVar.T, this.B, d0gVar.C5, c0gVar.El, zzfVar.Bc, c0gVar.Vm, d0gVar.C, b15, 1));
        xvf0 b16 = i5m.b(qz70.a);
        this.B2 = b16;
        this.C2 = i5m.b(new mz70(c0gVar.lm, b16, zzfVar.Bc, zzfVar.n, zzfVar.p3, zzfVar.M3, 0));
        n3w a6 = n3w.a(ow70Var);
        this.H2 = a6;
        this.N2 = new gaq0(new sit0(zzfVar.Tq, zzfVar.Y0, zzfVar.n, 2), 24);
        t160 t160Var = new t160(zzfVar.W, 29);
        this.T2 = t160Var;
        this.V2 = i5m.b(new yc(c0gVar.Vb, c0gVar.Mb, t160Var, a6, c0gVar.ph, new wun0(c0gVar.mm, zzfVar.o4, this.B, 19)));
        this.X2 = i5m.b(new e840(zzfVar.z, zzfVar.n, zzfVar.W0, c0gVar.mm, new ivo0(zzfVar.d0, 28), 22));
        this.v3 = dhs0.a(new sb1(c0gVar.U, zzfVar.p3, zzfVar.M3, zzfVar.vr, zzfVar.Uo, zzfVar.n, zzfVar.C, 5));
        this.B3 = n3w.a(pw70Var);
        this.C3 = new yc(zzfVar.n, zzfVar.Bc, zzfVar.o4, new ba9(new ig7(zzfVar.d, 23), 9), c0gVar.Lw, c0gVar.Sh, 20, false);
        xvf0 b17 = i5m.b(p380.a);
        this.H3 = b17;
        xvf0 xvf0Var61 = c0gVar.E0;
        eqh eqhVar15 = zzfVar.o4;
        this.N3 = i5m.b(new z1n0(new ltp0(xvf0Var61, eqhVar15, eqhVar15, c0gVar.Mb, zzfVar.W, this.H2, d0gVar.O5, this.N2, zzfVar.O, zzfVar.Pm, d0gVar.P4, zzfVar.Uo, zzfVar.p3, zzfVar.n, c0gVar.Vb, zzfVar.Dc, e0gVar.e, zzfVar.ur, zzfVar.oi, this.V2, this.Q, zzfVar.un, zzfVar.Y, zzfVar.d0, c0gVar.Gw, zzfVar.D, this.A, zzfVar.Tk, c0gVar.mm, c0gVar.Sb, zzfVar.ii, c0gVar.qh, c0gVar.f95me, this.X2, c0gVar.jm, c0gVar.B, zzfVar.c, zzfVar.U, zzfVar.S3, zzfVar.T, zzfVar.li, this.v3, c0gVar.ph, this.B3, this.C3, c0gVar.J9, zzfVar.Bc, zzfVar.uf, zzfVar.Ze, zzfVar.M3, c0gVar.o0, zzfVar.Ye, zzfVar.w0, zzfVar.q, c0gVar.hm, zzfVar.hj, c0gVar.t7, c0gVar.Sw, c0gVar.im, b17, c0gVar.bo, d0gVar.P5, d0gVar.K0, d0gVar.Q5, c0gVar.n0, d0gVar.R5, d0gVar.S5, c0gVar.T, this.J), 27));
        rut rutVar = new rut(c0gVar.D, new c1(c0gVar.th, 20), 25);
        xvf0 xvf0Var62 = c0gVar.B;
        xvf0 xvf0Var63 = c0gVar.Vb;
        this.T3 = new amy(xvf0Var62, xvf0Var63, e0gVar.e, c0gVar.E0, c0gVar.Af, rutVar, this.v3, zzfVar.ia, zzfVar.ur, c0gVar.Wb, zzfVar.Db, zzfVar.a1, zzfVar.ja, zzfVar.xm, y4s0.a, zzfVar.n, zzfVar.oi, zzfVar.wr, zzfVar.Pm, zzfVar.C, zzfVar.d0, d0gVar.T5, 1);
        this.V3 = new oto0(xvf0Var63, zzfVar.W, 8);
        this.v4 = i5m.b(new rbx0(this.J, 29));
        this.H4 = i5m.b(new rbx0(this.J, 27));
        this.M4 = i5m.b(new n2y0(this.J, 6));
        this.N4 = i5m.b(new n2y0(this.J, 1));
        this.X4 = i5m.b(new n2y0(this.J, 2));
        this.I5 = i5m.b(new n2y0(this.J, 12));
        this.J5 = i5m.b(new n2y0(this.J, 8));
        this.K5 = i5m.b(new n2y0(this.J, 7));
        this.L5 = i5m.b(new n2y0(this.J, 9));
        xvf0 b18 = i5m.b(r8k0.a);
        this.M5 = b18;
        this.N5 = i5m.b(new p8k0(b18, zzfVar.n, zzfVar.b0, i8k0.a, 0));
        this.O5 = i5m.b(new n2y0(this.J, 11));
        n3w a7 = n3w.a(new ufj0(new fcj0(hgj0.a, new s3f0(zzfVar.w0, zzfVar.n, zzfVar.q, 10), c0gVar.O0, c0gVar.g0, zzfVar.W)));
        xvf0 xvf0Var64 = c0gVar.U;
        this.P5 = new yc((xvf0) this.I0, (xvf0) new av4(xvf0Var64, c0gVar.g0, a7, d0gVar.a6, ofj0.a), (xvf0) c0gVar.pw, c0gVar.cb, (xvf0) new jde0(zzfVar.d0, 6), (v7p) c0gVar.T, 1);
        n3w a8 = n3w.a(new iuv(new ho9(xvf0Var64, zzfVar.p3, zzfVar.Ye, zzfVar.Ze)));
        int i8 = 0;
        vu vuVar = new vu(zzfVar.M3, c0gVar.g0, a8, i8);
        jpf0 jpf0Var = new jpf0(c0gVar.ym, (xvf0) new upk0(zzfVar.d0, i8), i8);
        this.Q5 = jpf0Var;
        this.R5 = n3w.a(new jtc(new itc(zzfVar.Ze, c0gVar.Xb, zzfVar.ai, zzfVar.r6, zzfVar.I2, zzfVar.Ye, zzfVar.J1, d0gVar.K3, zzfVar.Dq, zzfVar.Uh, this.P5, vuVar, d0gVar.F5, d0gVar.D5, jpf0Var, this.C1, this.I0, d0gVar.J5, c0gVar.cx)));
        this.S5 = i5m.b(new mz70(zzfVar.Y, zzfVar.G5, zzfVar.xa, vy70.a, c0gVar.cn, ic80.a, 4));
        this.T5 = i5m.b(new p6f(zzfVar.J1, 16));
        this.U5 = i5m.b(new rbx0(this.J, 28));
        this.V5 = dhs0.a(new lk(17, new t160(zzfVar.d0, 24)));
        this.W5 = i5m.b(irq.a);
        this.X5 = i5m.b(bet0.a);
        this.Y5 = i5m.b(y1j0.a);
        this.Z5 = i5m.b(new uc50(zzfVar.Ma, this.F, 19));
        this.a6 = new g680((xvf0) c0gVar.ct, (xvf0) new l180(this.v2, 5), 0);
        this.b6 = dhs0.a(new f9t(dhs0.a(fcu.a), zzfVar.B2, 16));
        h0();
        I0();
        p1(lw70Var);
    }

    @Override // defpackage.h2s0
    public final ylp0 A() {
        return this.x.b6();
    }

    @Override // defpackage.c4s0
    public final a A0() {
        return (a) this.x.g9.get();
    }

    @Override // defpackage.h2s0
    public final mxb D() {
        return (mxb) this.x.Fc.get();
    }

    @Override // defpackage.h2s0
    public final lx4 F() {
        return (lx4) this.w.Y.get();
    }

    @Override // defpackage.h2s0
    public final a9y0 F0() {
        return (a9y0) this.x.Ko.get();
    }

    @Override // defpackage.h2s0
    public final i130 G() {
        return (i130) this.x.g0.get();
    }

    @Override // defpackage.h2s0
    public final j G0() {
        return (j) this.w.E.get();
    }

    @Override // defpackage.h2s0
    public final com.yandex.go.taxi.tariffs.internal.interactor.a H0() {
        return this.x.a.T();
    }

    public final void I0() {
        c0g c0gVar = this.x;
        xvf0 xvf0Var = c0gVar.U;
        zzf zzfVar = this.w;
        if9 if9Var = zzfVar.J1;
        xvf0 xvf0Var2 = this.i6;
        d0g d0gVar = c0gVar.a;
        this.p6 = n3w.a(new jt00(new av6(xvf0Var, if9Var, xvf0Var2, d0gVar.k6, this.n6, this.o6)));
        this.q6 = i5m.b(c0gVar.Zs);
        this.r6 = i5m.b(l680.a);
        xvf0 b = i5m.b(o680.a);
        xvf0 xvf0Var3 = zzfVar.W;
        xvf0 xvf0Var4 = c0gVar.Fm;
        ge50 ge50Var = new ge50(xvf0Var4, (xvf0) c0gVar.Km, (xvf0) new uc50(xvf0Var3, xvf0Var4, 28), (xvf0) new hs30(xvf0Var4, xvf0Var3, c0gVar.Wk, d0gVar.l6, 11), 14, (byte) 0);
        xvf0 xvf0Var5 = this.e6;
        xvf0 xvf0Var6 = this.f6;
        xvf0 xvf0Var7 = this.g6;
        j680 j680Var = i680.a;
        kkt kktVar = this.m6;
        n3w n3wVar = this.p6;
        this.s6 = new npi(xvf0Var5, xvf0Var6, this.a6, xvf0Var7, j680Var, kktVar, n3wVar, zzfVar.Al, zzfVar.Bl, zzfVar.Vm, c0gVar.jd, c0gVar.ui, zzfVar.j2, zzfVar.uf, this.q6, this.r6, b, c0gVar.wi, xvf0Var4, ge50Var, c0gVar.kd, c0gVar.Rf);
        xvf0 xvf0Var8 = this.B;
        jc50 jc50Var = new jc50(c0gVar.D, i5m.b(new so4(this.y.u, zzfVar.Ai, xvf0Var8, n3wVar, this.S5, xvf0Var4, xvf0Var8, d0gVar.m6, zzfVar.Nl, 10)), this.m6, 15);
        this.t6 = jc50Var;
        this.u6 = i5m.b(new zi60(this.s6, zzfVar.rl, jc50Var, 12, false));
        this.v6 = new di20(c0gVar.U, new jc50(this.C, this.L, this.F, 3), this.E, 26);
        xvf0 b2 = i5m.b(new zi60(new ze(py70.a, i5m.b(new q720(zzfVar.C, 24)), 7), zzfVar.n, new y101(zzfVar.e6, dm40.a, d0gVar.o6, 0), 5));
        this.w6 = b2;
        eqh.a(this.d6, i5m.b(new wj0(c0gVar.U, c0gVar.B, this.u6, c0gVar.Fs, this.v6, d0gVar.n6, b2, zzfVar.Xa, 24)));
        this.x6 = i5m.b(new lok0(c0gVar.Kf, c0gVar.Fs, this.E, zzfVar.e6, c0gVar.Jf, this.F, this.B, 7));
        this.y6 = new ig7(c0gVar.Ww, 21);
        xvf0 b3 = i5m.b(this.t6);
        zni0 zni0Var = new zni0(this.r0, 17);
        this.z6 = n3w.a(new w6y0(new z4m0(c0gVar.U, b3, this.H0, zzfVar.J2, zzfVar.Wh, zni0Var, zzfVar.n, 8)));
    }

    @Override // defpackage.h2s0
    public final n170 J() {
        return (n170) this.w.Al.get();
    }

    @Override // defpackage.h2s0
    public final ljd J0() {
        uio0 h = this.y.h();
        zzf zzfVar = this.w;
        return new ljd(h, zzfVar.A1(), (c) zzfVar.Bc.get());
    }

    @Override // defpackage.c4s0
    public final n12 K() {
        return (n12) this.x.a.K4.get();
    }

    @Override // defpackage.h2s0
    public final e K0() {
        return (e) this.x.qk.get();
    }

    public final ru.yandex.taxi.apprate.common.domain.a L() {
        iw2 iw2Var = (iw2) this.V5.get();
        lw2 lw2Var = (lw2) this.w.Na.get();
        c0g c0gVar = this.x;
        return new ru.yandex.taxi.apprate.common.domain.a(iw2Var, lw2Var, ((ku11) c0gVar.G0.get()).a(), (tse) c0gVar.B.get());
    }

    @Override // defpackage.h2s0
    public final abf0 L0() {
        return (abf0) this.w.ek.get();
    }

    @Override // defpackage.c4s0
    public final pdc M() {
        return (pdc) this.w.Ye.get();
    }

    @Override // defpackage.c4s0
    public final ru.yandex.taxi.perf.screen.c M0() {
        return (ru.yandex.taxi.perf.screen.c) this.w.o2.get();
    }

    public final xhm N() {
        zzf zzfVar = this.w;
        return new xhm(new nim((pho) zzfVar.d0.get()), zzfVar.x());
    }

    @Override // defpackage.h2s0
    public final c1f N0() {
        return (c1f) this.w.Bl.get();
    }

    @Override // defpackage.c4s0
    public final gnu0 O() {
        gnu0 gnu0Var = ((tlu0) this.w.dm.get()).m;
        q5z.i(gnu0Var);
        return gnu0Var;
    }

    @Override // defpackage.h2s0
    public final gvh O0() {
        return new gvh((zuh) this.x.a.a.dq.get());
    }

    @Override // defpackage.h2s0
    public final t4l0 P() {
        return new t4l0();
    }

    @Override // defpackage.c4s0
    public final tse P0() {
        return (tse) this.x.B.get();
    }

    @Override // defpackage.h2s0
    public final arv0 Q0() {
        return (arv0) this.w.c9.get();
    }

    @Override // defpackage.h2s0
    public final x1s0 R() {
        return (x1s0) this.w.Vm.get();
    }

    @Override // defpackage.c4s0
    public final pqv R0() {
        return this.x.a.j();
    }

    @Override // defpackage.h2s0
    public final z660 S0() {
        return (z660) this.x.id.get();
    }

    @Override // defpackage.h2s0
    public final ru.yandex.taxi.preorder.source.domain.a T0() {
        return (ru.yandex.taxi.preorder.source.domain.a) this.x.sk.get();
    }

    @Override // defpackage.h2s0
    public final i270 V() {
        return (i270) this.w.Cm.get();
    }

    @Override // defpackage.c4s0
    public final w6r X() {
        return (w6r) this.x.vc.get();
    }

    @Override // defpackage.h2s0
    public final dkv0 X0() {
        return this.x.r6();
    }

    @Override // defpackage.h2s0
    public final l Y() {
        return this.x.Y();
    }

    @Override // defpackage.c4s0
    public final y4k0 Y0() {
        return this.w.n1();
    }

    public final orq Z() {
        zzf zzfVar = this.w;
        return new orq(new o61((pho) zzfVar.d0.get()), new to31((pho) zzfVar.d0.get()), (a52) zzfVar.Ma.get(), new yh70((pho) zzfVar.d0.get()), new kyc((pho) zzfVar.d0.get()));
    }

    @Override // defpackage.h2s0
    public final c9y0 Z0() {
        return (c9y0) this.x.so.get();
    }

    public final tt a() {
        zzf zzfVar = this.w;
        com.yandex.go.taxi.order.provider.a aVar = (com.yandex.go.taxi.order.provider.a) zzfVar.o4.get();
        g gVar = (g) this.y2.get();
        ss21 ss21Var = (ss21) zzfVar.qi.get();
        c0g c0gVar = this.x;
        return new tt(aVar, this.a, gVar, ss21Var, (yk21) c0gVar.dm.get(), s1(), (ci70) zzfVar.Ma.get(), N(), new eg7(), v1(), (iup0) c0gVar.mm.get(), zzfVar.X0(), (ud80) this.X2.get(), (v1y0) this.x2.get());
    }

    @Override // defpackage.c4s0
    public final o3s0 a0() {
        return this.w.w1();
    }

    @Override // defpackage.c4s0, defpackage.ww4
    public final ru.yandex.taxi.widget.c b() {
        return (ru.yandex.taxi.widget.c) this.w.Ze.get();
    }

    @Override // defpackage.c4s0, defpackage.ww4
    public final zuj0 c() {
        return (zuj0) this.w.W.get();
    }

    @Override // defpackage.h2s0
    public final mpc c0() {
        return this.x.G1();
    }

    @Override // defpackage.c4s0, defpackage.ww4
    public final ney d() {
        return (ney) this.x.E0.get();
    }

    @Override // defpackage.c4s0
    public final w d0() {
        return (w) this.x.ec.get();
    }

    @Override // defpackage.c4s0
    public final ck31 d1() {
        return (ck31) this.w.B2.get();
    }

    @Override // defpackage.c4s0, defpackage.ww4
    public final pav e() {
        return (pav) this.w.p3.get();
    }

    @Override // defpackage.c4s0
    public final ru.yandex.taxi.widget.utils.e f() {
        return (ru.yandex.taxi.widget.utils.e) this.x.J9.get();
    }

    @Override // defpackage.h2s0
    public final ru.yandex.taxi.shortcuts.interactors.a f1() {
        return this.x.L1();
    }

    @Override // defpackage.h2s0
    public final b g() {
        return (b) this.w.Qb.get();
    }

    @Override // defpackage.c4s0
    public final t4s0 g0() {
        return (t4s0) this.x.jd.get();
    }

    @Override // defpackage.c4s0
    public final wr00 h() {
        return this.x.a.G();
    }

    public final void h0() {
        c0g c0gVar = this.x;
        swb swbVar = c0gVar.Tf;
        dby0 dby0Var = c0gVar.nd;
        zzf zzfVar = this.w;
        xvf0 xvf0Var = zzfVar.Qb;
        cuo cuoVar = zzfVar.v8;
        d0g d0gVar = c0gVar.a;
        zzg zzgVar = d0gVar.h6;
        ljv0 ljv0Var = kjv0.a;
        this.c6 = new vo3(swbVar, dby0Var, xvf0Var, this.a6, this.b6, cuoVar, zzgVar, ljv0Var, c0gVar.Xs, c0gVar.Fc, d0gVar.i6, 5);
        eqh eqhVar = new eqh();
        this.d6 = eqhVar;
        xvf0 xvf0Var2 = c0gVar.n0;
        eqh eqhVar2 = c0gVar.T9;
        vo3 vo3Var = this.c6;
        xvf0 xvf0Var3 = c0gVar.sk;
        pl plVar = c0gVar.ct;
        xvf0 xvf0Var4 = zzfVar.rl;
        xvf0 xvf0Var5 = zzfVar.B2;
        dld0 dld0Var = zzfVar.fm;
        swo0 swo0Var = zzfVar.qk;
        my0 my0Var = c0gVar.ok;
        xvf0 xvf0Var6 = zzfVar.Cm;
        q7r q7rVar = p7r.a;
        v4l0 v4l0Var = u4l0.a;
        zzg zzgVar2 = c0gVar.Ys;
        swb swbVar2 = c0gVar.Tf;
        xvf0 xvf0Var7 = c0gVar.B;
        eqh eqhVar3 = c0gVar.T;
        xvf0 xvf0Var8 = this.B;
        ph70 ph70Var = this.v2;
        this.e6 = i5m.b(new npi(xvf0Var2, xvf0Var8, eqhVar2, vo3Var, xvf0Var3, plVar, xvf0Var4, ph70Var, ph70Var, xvf0Var5, dld0Var, swo0Var, my0Var, eqhVar, xvf0Var6, q7rVar, v4l0Var, zzgVar2, ljv0Var, swbVar2, xvf0Var7, eqhVar3));
        this.f6 = i5m.b(new uc50(c0gVar.ld, i5m.b(q580.a), 24));
        this.g6 = i5m.b(this.H);
        xvf0 xvf0Var9 = zzfVar.Uh;
        jpf0 jpf0Var = this.Q5;
        this.h6 = new cta0(new ze(jpf0Var, xvf0Var9, 1), new ze(jpf0Var, xvf0Var9, 11), new zfa(xvf0Var9, zzfVar.J1, jpf0Var, 25), new ibz0(xvf0Var9, jpf0Var, 3), this.H1);
        jc50 jc50Var = new jc50(this.N, this.G0, c0gVar.T, 9);
        eqh eqhVar4 = zzfVar.o4;
        xvf0 xvf0Var10 = zzfVar.qi;
        xvf0 xvf0Var11 = c0gVar.dm;
        xvf0 xvf0Var12 = zzfVar.Ma;
        gg7 gg7Var = fg7.a;
        xvf0 xvf0Var13 = c0gVar.mm;
        k220 k220Var = zzfVar.ki;
        n3w n3wVar = this.J;
        xvf0 xvf0Var14 = this.y2;
        ut utVar = new ut(eqhVar4, n3wVar, xvf0Var14, xvf0Var10, xvf0Var11, jc50Var, xvf0Var12, this.E0, gg7Var, this.I0, xvf0Var13, k220Var, this.X2, this.x2);
        nl9 nl9Var = zzfVar.yn;
        xvf0 xvf0Var15 = c0gVar.cb;
        xvf0 xvf0Var16 = c0gVar.Fm;
        ci3 ci3Var = c0gVar.tm;
        xvf0 xvf0Var17 = c0gVar.dn;
        jwx0 jwx0Var = c0gVar.an;
        xpj0 xpj0Var = c0gVar.Vm;
        kxa0 kxa0Var = d0gVar.C;
        dsi dsiVar = csi.a;
        this.i6 = i5m.b(new qx4(n3wVar, nl9Var, this.S5, xvf0Var14, xvf0Var15, xvf0Var16, this.B, utVar, ci3Var, xvf0Var17, jwx0Var, xpj0Var, kxa0Var, dsiVar, c0gVar.Tm));
        this.j6 = n3w.a(new cim(new ho9(zzfVar.z, zzfVar.n, c0gVar.mm, c0gVar.km)));
        this.k6 = new ibz0(zzfVar.p3, zzfVar.c7, 7);
        xvf0 xvf0Var18 = zzfVar.Na;
        bi4 bi4Var = c0gVar.jz;
        xvf0 xvf0Var19 = c0gVar.B;
        this.l6 = new js0(this.V5, xvf0Var18, bi4Var, xvf0Var19, 4);
        eqh eqhVar5 = c0gVar.M8;
        e0g e0gVar = this.y;
        xvf0 a = dhs0.a(new wj0(eqhVar5, e0gVar.o, c0gVar.ij, c0gVar.fj, c0gVar.ej, c0gVar.dj, c0gVar.hj, xvf0Var19, 10));
        ibz0 ibz0Var = new ibz0(zzfVar.I2, zzfVar.J2, 17);
        xvf0 xvf0Var20 = c0gVar.U;
        xvf0 xvf0Var21 = zzfVar.p3;
        rct0 rct0Var = new rct0(xvf0Var20, xvf0Var21, a, ibz0Var, zzfVar.U, 23);
        xvf0 xvf0Var22 = e0gVar.u;
        xvf0 xvf0Var23 = d0gVar.C5;
        this.m6 = new kkt(xvf0Var22, xvf0Var21, xvf0Var23, c0gVar.B, zzfVar.M3, c0gVar.E0, zzfVar.Ze, zzfVar.Rq, zzfVar.Bc, this.h6, d0gVar.G5, this.i6, this.j6, this.k6, this.l6, zzfVar.c7, this.R5, rct0Var, zzfVar.Nl, c0gVar.ym, this.H0, 3);
        this.n6 = new x0z(new zo0(c0gVar.L9, c0gVar.t7, zzfVar.K5, c0gVar.ga, xvf0Var20, c0gVar.g9, 24), dsiVar, c0gVar.Tm, c0gVar.dn, 1);
        this.o6 = new f9t(xvf0Var20, xvf0Var23, 27);
    }

    @Override // defpackage.c4s0
    public final wa90 i0() {
        return (wa90) this.w.We.get();
    }

    @Override // defpackage.c4s0
    public final j800 i1() {
        return (j800) this.x.Zr.get();
    }

    @Override // defpackage.h2s0
    public final d2c j0() {
        return (d2c) this.w.Og.get();
    }

    @Override // defpackage.c4s0
    public final tt2 k() {
        return (tt2) this.w.n.get();
    }

    @Override // defpackage.h2s0
    public final k5i k0() {
        return (k5i) this.x.Ys.get();
    }

    @Override // defpackage.h2s0
    public final ru.yandex.taxi.location.user.c l() {
        return this.x.E6();
    }

    @Override // defpackage.c4s0
    public final jc00 l0() {
        return (jc00) this.w.Xa.get();
    }

    @Override // defpackage.c4s0
    public final rqo l1() {
        return (rqo) this.w.C.get();
    }

    @Override // defpackage.c4s0
    public final b8r m() {
        return this.w.o();
    }

    @Override // defpackage.h2s0
    public final hwe0 m0() {
        zzf zzfVar = this.w;
        return new hwe0(zzfVar.o(), (k) zzfVar.B2.get());
    }

    @Override // defpackage.h2s0
    public final oep0 n() {
        return (oep0) this.x.T.get();
    }

    @Override // defpackage.c4s0
    public final Context n0() {
        return (Context) this.x.U.get();
    }

    @Override // defpackage.c4s0
    public final ms2 n1() {
        return (ms2) this.w.a2.get();
    }

    @Override // defpackage.c4s0
    public final za90 o() {
        return (za90) this.w.o3.get();
    }

    @Override // defpackage.c4s0
    public final xdf o1() {
        return (xdf) this.w.S3.get();
    }

    @Override // defpackage.h2s0
    public final uxr0 p0() {
        return this.x.e6();
    }

    public final void p1(lw70 lw70Var) {
        this.A6 = i5m.b(new n2y0(this.z6, 16));
        c0g c0gVar = this.x;
        xvf0 xvf0Var = c0gVar.J9;
        zzf zzfVar = this.w;
        jc50 jc50Var = new jc50(xvf0Var, zzfVar.S3, zzfVar.W, 14);
        l180 l180Var = new l180(zzfVar.w0, 7);
        eqh eqhVar = zzfVar.o4;
        xvf0 xvf0Var2 = zzfVar.U;
        l9t0 l9t0Var = new l9t0((xvf0) eqhVar, (v7p) jc50Var, xvf0Var2, (v7p) l180Var, 11);
        ig7 ig7Var = new ig7(c0gVar.Ww, 25);
        l180 l180Var2 = new l180(zzfVar.Q4, 6);
        xvf0 xvf0Var3 = zzfVar.Ze;
        t160 t160Var = new t160(xvf0Var3, 21);
        xvf0 xvf0Var4 = c0gVar.U;
        eqh eqhVar2 = c0gVar.o0;
        xvf0 xvf0Var5 = zzfVar.p3;
        i5s0 i5s0Var = c0gVar.zu;
        xvf0 xvf0Var6 = zzfVar.n;
        xvf0 xvf0Var7 = zzfVar.M3;
        xvf0 xvf0Var8 = zzfVar.li;
        xvf0 xvf0Var9 = zzfVar.Ye;
        xvf0 xvf0Var10 = zzfVar.J2;
        e8b0 e8b0Var = c0gVar.ot;
        d0g d0gVar = c0gVar.a;
        this.B6 = new f380(new e840(xvf0Var4, c0gVar.g9, new fy30(l9t0Var, zzfVar.Nl, ig7Var, c0gVar.Uw, l180Var2, xvf0Var6, new y2s0(new ge50(eqhVar2, t160Var, xvf0Var6, new o4f(xvf0Var4, eqhVar2, xvf0Var5, i5s0Var, xvf0Var6, xvf0Var3, xvf0Var7, xvf0Var8, xvf0Var2, xvf0Var9, xvf0Var, xvf0Var10, e8b0Var, d0gVar.K0, 1)), xvf0Var10, new q720(zzfVar.d, 25), 29), c0gVar.T, 6), xvf0Var2, c0gVar.h9, 21), 3);
        eqh eqhVar3 = c0gVar.oq;
        n3w n3wVar = c0gVar.b0;
        this.C6 = new zi60(c0gVar.Yi, new r2i(eqhVar3, n3wVar, this.H, n3wVar, d0gVar.B, 13), new vrt0(xvf0Var4, 16), 4, false);
        this.D6 = n3w.a(lw70Var);
        this.E6 = new prq((xvf0) new c1(zzfVar.d0, 26), (xvf0) zzfVar.Ia, zzfVar.Ma, (xvf0) zzfVar.ta, (xvf0) zzfVar.Aa, 0);
    }

    @Override // defpackage.c4s0
    public final k3s0 q() {
        return (k3s0) this.x.ui.get();
    }

    @Override // defpackage.h2s0
    public final xsv0 q0() {
        return (xsv0) this.w.Uf.get();
    }

    public final NextRecenterButtonView q1() {
        return new NextRecenterButtonView((Context) this.x.U.get(), new com.yandex.go.taxi.order.recenter.c((com.yandex.go.taxi.order.interactors.b) this.C.get(), (h760) this.L.get(), (y980) this.F.get()), (l1t) this.E.get());
    }

    @Override // defpackage.h2s0
    public final fre0 r() {
        return (fre0) this.x.T9.get();
    }

    public final OrderMapCurtainHideFloatingButtonView r1() {
        c0g c0gVar = this.x;
        Context context = (Context) c0gVar.U.get();
        fup0 fup0Var = (fup0) c0gVar.lm.a;
        oz70 oz70Var = (oz70) this.B2.get();
        jln jlnVar = new jln(14, (com.yandex.go.taxi.order.interactors.b) this.C.get());
        zzf zzfVar = this.w;
        return new OrderMapCurtainHideFloatingButtonView(context, new kz70(fup0Var, oz70Var, jlnVar, (ci70) zzfVar.Ma.get(), (tt2) zzfVar.n.get(), (n20) zzfVar.o4.get()));
    }

    @Override // defpackage.h2s0
    public final mqv0 s() {
        return (mqv0) this.w.j2.get();
    }

    public final p370 s1() {
        w030 w030Var = (w030) this.y.o.get();
        c0g c0gVar = this.x;
        Context context = (Context) c0gVar.U.get();
        zzf zzfVar = this.w;
        return new p370(8, new ufb(w030Var, new v920(context, (k7x0) zzfVar.M3.get(), (pav) zzfVar.p3.get(), new rfb((pho) zzfVar.d0.get()), c0gVar.lA, (oep0) c0gVar.T.get())), this.G0, (oep0) c0gVar.T.get());
    }

    @Override // defpackage.c4s0
    public final com.yandex.go.lifecycle.processor.e t() {
        return (com.yandex.go.lifecycle.processor.e) this.x.vz.get();
    }

    @Override // defpackage.c4s0
    public final x7k0 t0() {
        zzf zzfVar = this.x.a.a;
        return new x7k0((wiq0) zzfVar.B2.get(), zzfVar.n1());
    }

    public final gpf0 t1() {
        ipf0 u1 = u1();
        zzf zzfVar = this.w;
        return new gpf0(new cs(u1, (ru.yandex.taxi.communications.data.a) zzfVar.Uh.get()), new cs(u1(), (ru.yandex.taxi.communications.data.a) zzfVar.Uh.get()), new wwf((ru.yandex.taxi.communications.data.a) zzfVar.Uh.get(), (n3h) zzfVar.J1.get(), u1()), new kcz0((ru.yandex.taxi.communications.data.a) zzfVar.Uh.get(), u1()), (wpf0) this.H1.get());
    }

    @Override // defpackage.h2s0
    public final ip11 u() {
        return (ip11) this.w.uf.get();
    }

    @Override // defpackage.c4s0
    public final com.yandex.go.shortcuts.impl.repository.j u0() {
        return (com.yandex.go.shortcuts.impl.repository.j) this.w.Rq.get();
    }

    public final ipf0 u1() {
        return new ipf0((a630) this.x.ym.get(), new u8w((pho) this.w.d0.get()));
    }

    @Override // defpackage.c4s0
    public final s721 v() {
        return (s721) this.x.a.G4.get();
    }

    public final v2y0 v1() {
        return new v2y0(i5m.a(this.H0), i5m.a(this.x.a.M0));
    }

    @Override // defpackage.c4s0
    public final tlw0 w() {
        return new tlw0(new j2s0(this.w.a));
    }

    @Override // defpackage.c4s0
    public final d w0() {
        return this.x.a.i();
    }

    @Override // defpackage.c4s0
    public final jx70 x() {
        return this.x.a.I();
    }

    @Override // defpackage.c4s0
    public final c4r0 x0() {
        return (c4r0) this.w.qk.get();
    }

    @Override // defpackage.h2s0
    public final y50 y0() {
        return (y50) this.x.n0.get();
    }
}
