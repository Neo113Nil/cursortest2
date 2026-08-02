package defpackage;

import android.content.Context;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.data.a;
import com.yandex.messaging.data.e;
import com.yandex.messaging.internal.authorized.chat.i;
import com.yandex.passport.sloth.ui.dependencies.m;

/* loaded from: classes15.dex */
public final class m8g implements s020 {
    public final n3w A;
    public final xvf0 A0;
    public final n3w B;
    public final xvf0 B0;
    public final n3w C;
    public final xvf0 C0;
    public final n3w D;
    public final xvf0 D0;
    public final n3w E;
    public final xvf0 E0;
    public final n3w F;
    public final xvf0 F0;
    public final n3w G;
    public final xvf0 G0;
    public final xvf0 H;
    public final xvf0 H0;
    public final xvf0 I;
    public final xvf0 J;
    public final xvf0 K;
    public final rs0 L;
    public final xvf0 M;
    public final mu7 N;
    public final xvf0 O;
    public final xvf0 P;
    public final xvf0 Q;
    public final xvf0 R;
    public final xvf0 S;
    public final xvf0 T;
    public final xvf0 U;
    public final xvf0 V;
    public final xvf0 W;
    public final xvf0 X;
    public final xvf0 Y;
    public final xvf0 Z;
    public final o1b0 a;
    public final xvf0 a0;
    public final z8g b;
    public final xvf0 b0;
    public final p8g c;
    public final xvf0 c0;
    public final d9g d;
    public final xvf0 d0;
    public final n3w e;
    public final nb11 e0;
    public final alx0 f;
    public final xvf0 f0;
    public final alx0 g;
    public final xvf0 g0;
    public final eqh h;
    public final xvf0 h0;
    public final xvf0 i;
    public final xvf0 i0;
    public final xvf0 j;
    public final xvf0 j0;
    public final xvf0 k;
    public final xvf0 k0;
    public final br10 l;
    public final xvf0 l0;
    public final uc50 m;
    public final xvf0 m0;
    public final peb n;
    public final xvf0 n0;
    public final q150 o;
    public final xvf0 o0;
    public final xvf0 p;
    public final xvf0 p0;
    public final xvf0 q;
    public final xvf0 q0;
    public final wvq r;
    public final xvf0 r0;
    public final xvf0 s;
    public final xvf0 s0;
    public final xvf0 t;
    public final xvf0 t0;
    public final xvf0 u;
    public final xvf0 u0;
    public final sb1 v;
    public final xvf0 v0;
    public final xvf0 w;
    public final xvf0 w0;
    public final xvf0 x;
    public final xvf0 x0;
    public final br10 y;
    public final xvf0 y0;
    public final n3w z;
    public final xvf0 z0;

    public m8g(z8g z8gVar, p8g p8gVar, d9g d9gVar, o1b0 o1b0Var, ChatRequest chatRequest) {
        this.b = z8gVar;
        this.c = p8gVar;
        this.d = d9gVar;
        this.a = o1b0Var;
        n3w a = n3w.a(o1b0Var);
        this.e = a;
        eqh eqhVar = p8gVar.z;
        eqh eqhVar2 = p8gVar.H;
        this.f = new alx0(a, eqhVar, eqhVar2, z8gVar.N, 3);
        this.g = new alx0(a, eqhVar, eqhVar2, z8gVar.e, 2);
        eqh eqhVar3 = new eqh();
        this.h = eqhVar3;
        this.i = i5m.b(new sln(this.g, z8gVar.d, p8gVar.z, eqhVar3, d9gVar.s, p8gVar.f1));
        int i = 19;
        this.j = i5m.b(new js0(this.g, d9gVar.E, this.h, p8gVar.f1, i));
        this.k = i5m.b(new hs30(d9gVar.s, d9gVar.E, this.g, p8gVar.z, i));
        this.l = new br10(z8gVar.y, 5);
        h420 h420Var = z8gVar.k;
        d4c d4cVar = c4c.a;
        this.m = new uc50(h420Var, d4cVar, 6);
        eqh eqhVar4 = p8gVar.z;
        peb pebVar = new peb(eqhVar4, 0);
        this.n = pebVar;
        n3w n3wVar = this.e;
        q150 q150Var = new q150((xvf0) h420Var, (xvf0) n3wVar, (xvf0) eqhVar4, (v7p) pebVar, (xvf0) p8gVar.D0, (xvf0) p8gVar.A0, p8gVar.B0, 0);
        this.o = q150Var;
        xvf0 b = i5m.b(new f2b(n3wVar, q150Var, p8gVar.q1, 1));
        this.p = b;
        int i2 = 7;
        xvf0 b2 = i5m.b(new zfa(this.e, b, p8gVar.u1, i2));
        this.q = b2;
        k0n k0nVar = new k0n(p8gVar.B1, z8gVar.f, 24);
        h420 h420Var2 = z8gVar.k;
        wvq wvqVar = new wvq((xvf0) h420Var2, (xvf0) this.o, (xvf0) this.e, z8gVar.p, (xvf0) z8gVar.v0, (xvf0) k0nVar, 27, false);
        this.r = wvqVar;
        this.s = i5m.b(new gc((xvf0) h420Var2, (xvf0) this.m, b2, this.p, (xvf0) wvqVar, (xvf0) p8gVar.u1, (xvf0) z8gVar.u0, (xvf0) z8gVar.e, p8gVar.C1, 9));
        h420 h420Var3 = z8gVar.k;
        njp njpVar = d9gVar.Q0;
        xvf0 xvf0Var = d9gVar.R0;
        this.t = i5m.b(new k4((xvf0) h420Var3, (xvf0) d9gVar.y, (xvf0) p8gVar.z, (xvf0) vu10.a, (xvf0) new ret(h420Var3, njpVar, xvf0Var, 14), (xvf0) new zfa(h420Var3, njpVar, xvf0Var, 16), p8gVar.F1, (xvf0) this.e, (xvf0) z8gVar.e, p8gVar.G1, p8gVar.j0, 16, false));
        xvf0 b3 = i5m.b(new m7q0(d4cVar, 12));
        this.u = b3;
        this.v = new sb1(this.t, b3, this.e, p8gVar.z, p8gVar.H, p8gVar.B0, p8gVar.A0, 23);
        this.w = i5m.b(new uc50(z8gVar.i, z8gVar.I, i2));
        xvf0 b4 = i5m.b(new ahu(this.o, this.e, p8gVar.z, p8gVar.j0, p8gVar.E0, 11));
        this.x = b4;
        h420 h420Var4 = z8gVar.k;
        br10 br10Var = new br10(h420Var4, 8);
        this.y = br10Var;
        this.z = n3w.a(new i4f0(new bu0(h420Var4, z8gVar.u0, this.o, b4, p8gVar.s1, this.r, p8gVar.t1, br10Var, this.e)));
        this.A = n3w.a(new gyy0(new eo61(z8gVar.k, z8gVar.u0, this.o, this.x, this.y, this.r, p8gVar.t1, p8gVar.s1, this.e, d9gVar.H, m090.a)));
        this.B = n3w.a(new xxy0(new m(z8gVar.k, z8gVar.u0, this.o, this.x, this.y, this.r, p8gVar.t1, p8gVar.s1, this.e, d9gVar.H)));
        this.C = n3w.a(new d2u(new gv1(z8gVar.u0, z8gVar.k, this.o, this.x, p8gVar.s1, p8gVar.t1, this.r, this.y, this.e)));
        this.D = n3w.a(new hh10(new ho9(z8gVar.k, z8gVar.u0, this.o, this.x)));
        this.E = n3w.a(new li9(new ki9(z8gVar.k, z8gVar.u0, this.o, this.x, this.y)));
        this.F = n3w.a(new jzg(new ho9(z8gVar.k, z8gVar.u0, this.o, this.x)));
        this.G = n3w.a(new wj11(new vx0(z8gVar.k, this.o, this.x)));
        xvf0 b5 = i5m.b(new qg60(this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, n3w.a(new alt0(new dt9(z8gVar.k))), 0));
        this.H = b5;
        xvf0 b6 = i5m.b(new so4(z8gVar.k, this.e, this.s, this.q, z8gVar.i, this.o, this.v, b5, p8gVar.u, 5));
        this.I = b6;
        this.J = i5m.b(new vh9(z8gVar.T, z8gVar.k, d4cVar, this.e, p8gVar.H, p8gVar.u1, z8gVar.y, p8gVar.r1, this.s, p8gVar.k1, o6b.a, gpp0.a, p8gVar.e, p8gVar.D1, this.v, p8gVar.i, z8gVar.I, this.w, this.q, this.p, z8gVar.i, b6, this.u, this.H, p8gVar.s1, p8gVar.t1, p8gVar.u, z8gVar.f));
        this.K = i5m.b(new sb1(this.g, p8gVar.H, d9gVar.s, this.h, p8gVar.S0, z8gVar.h0, z8gVar.y, 9));
        xvf0 b7 = i5m.b(new sb1(this.g, d9gVar.s, z8gVar.d, p8gVar.H, this.e, z8gVar.h0, z8gVar.y, 17));
        rs0 rs0Var = new rs0(p8gVar.H, p8gVar.z, this.e, vi20.a, z8gVar.h0, 17);
        this.L = rs0Var;
        this.M = i5m.b(new xea(this.K, (xvf0) this.f, b7, (xvf0) rs0Var, 14, false));
        this.N = new mu7(p8gVar.V, n3w.a(chatRequest), 26);
        this.O = i5m.b(new jc50(this.e, p8gVar.z, z8gVar.d, 21));
        xvf0 b8 = i5m.b(new so4(z8gVar.f, p8gVar.q, i5m.b(new y101(this.e, d9gVar.E, z8gVar.f, 2)), p8gVar.e1, p8gVar.H, this.e, d9gVar.s, z8gVar.y, z8gVar.h0, 21));
        this.P = b8;
        eqh.a(this.h, i5m.b(new pab(d9gVar.y, this.e, z8gVar.d, p8gVar.H, this.f, d9gVar.D0, d9gVar.k0, d9gVar.M, this.i, this.j, this.k, p8gVar.T, this.l, this.J, p8gVar.K, this.M, this.L, this.N, this.O, this.K, p8gVar.f1, b8, d9gVar.Q, z8gVar.y, 0)));
        this.Q = i5m.b(new y101(this.e, z8gVar.X, d4cVar, 3));
        this.R = i5m.b(new hs30(z8gVar.X, d4cVar, this.e, d9gVar.F, 14));
        this.S = i5m.b(v8b.a);
        xvf0 b9 = i5m.b(new zo0(z8gVar.f, p8gVar.H, d9gVar.l, this.e, z8gVar.J, p8gVar.z, 9));
        this.T = b9;
        this.U = i5m.b(new so4(this.S, p8gVar.H1, p8gVar.z, p8gVar.H, z8gVar.d, d9gVar.l, this.e, b9, z8gVar.y, 2));
        this.V = i5m.b(new rs0(this.g, d9gVar.A, p8gVar.H, p8gVar.e, z8gVar.y, 11));
        i5m.b(new js0(this.e, p8gVar.K, p8gVar.H, this.T, 18));
        this.W = i5m.b(new xea(z8gVar.d, p8gVar.K, (xvf0) new ze(this.g, p8gVar.H, 5), this.T, 13, false));
        this.X = i5m.b(new mu7(this.e, d9gVar.v0, 23));
        this.Y = i5m.b(new jde0(p8gVar.e, 17));
        this.Z = i5m.b(new wi7(this.e, p8gVar.T0, d9gVar.l, d9gVar.y0, d9gVar.S0, d9gVar.z0, d9gVar.T0, new up41(z8gVar.y, 1), z8gVar.e, z8gVar.l0, z8gVar.f, p8gVar.J1));
        xvf0 xvf0Var2 = z8gVar.y;
        xvf0 xvf0Var3 = p8gVar.K1;
        xvf0 xvf0Var4 = p8gVar.i;
        this.a0 = i5m.b(new uw11(this.e, xvf0Var4, xvf0Var3, d9gVar.y, p8gVar.z, new y101(xvf0Var2, xvf0Var3, xvf0Var4, 20), 8));
        this.b0 = i5m.b(new h0z(this.e, p8gVar.H, 13));
        this.c0 = i5m.b(jm50.a);
        this.d0 = i5m.b(new so4(z8gVar.k, this.e, p8gVar.H, d9gVar.R0, d9gVar.Q0, p8gVar.N1, p8gVar.D0, p8gVar.O1, p8gVar.P1, 9));
        xvf0 xvf0Var5 = z8gVar.y;
        nb11 nb11Var = new nb11(xvf0Var5, 6);
        this.e0 = nb11Var;
        this.f0 = i5m.b(new xv8(z8gVar.d, this.e, p8gVar.z, p8gVar.H, d9gVar.f0, p8gVar.e, p8gVar.K, d4cVar, this.O, xvf0Var5, this.f, d9gVar.e0, nb11Var, 1));
        this.g0 = i5m.b(new mu7(this.e, d9gVar.w, 24));
        this.h0 = i5m.b(new wj0(d9gVar.l, this.g, this.h, p8gVar.H, z8gVar.e, z8gVar.f, p8gVar.f1, z8gVar.l0, 18));
        h420 h420Var5 = z8gVar.k;
        n3w n3wVar2 = this.e;
        eqh eqhVar5 = p8gVar.z;
        xvf0 xvf0Var6 = p8gVar.K;
        this.i0 = i5m.b(new g6(z8gVar.d, xvf0Var6, p8gVar.D1, n3wVar2, new wj0(h420Var5, n3wVar2, eqhVar5, xvf0Var6, this.n, p8gVar.D0, p8gVar.A0, p8gVar.B0, 21), 26));
        xvf0 xvf0Var7 = z8gVar.y;
        n3w n3wVar3 = d9gVar.y;
        n3w n3wVar4 = p8gVar.f;
        int i3 = 19;
        s90 s90Var = new s90(xvf0Var7, n3wVar3, n3wVar4, i3);
        xvf0 xvf0Var8 = p8gVar.g0;
        r2i r2iVar = p8gVar.o0;
        xvf0 xvf0Var9 = z8gVar.W;
        this.j0 = i5m.b(new nt0((xvf0) this.e, p8gVar.i, (xvf0) n3wVar3, (xvf0) d9gVar.k, xvf0Var9, (xvf0) p8gVar.H, (xvf0) s90Var, z8gVar.d, (xvf0) new wj0(xvf0Var8, r2iVar, xvf0Var9, n3wVar4, p8gVar.h0, z8gVar.N, p8gVar.f0, p8gVar.r, 4), (xvf0) d9gVar.N0, 4, false));
        this.k0 = i5m.b(new rs0(this.g, p8gVar.H, d9gVar.s, z8gVar.e, p8gVar.e, 15));
        xvf0 b10 = i5m.b(new hs30(this.g, d9gVar.s, z8gVar.f, z8gVar.h0, 26));
        this.l0 = b10;
        int i4 = 29;
        this.m0 = i5m.b(new jde0(b10, i4));
        this.n0 = i5m.b(new jde0(this.l0, 28));
        this.o0 = i5m.b(new ahu(z8gVar.f, this.g, this.m0, this.n0, i5m.b(new s3f0(this.g, p8gVar.H, p8gVar.q, 5)), 24));
        i5m.b(new rs0(d9gVar.l, this.g, p8gVar.H, p8gVar.y1, p8gVar.x1, 14));
        this.p0 = i5m.b(new wj0(p8gVar.K, p8gVar.H, this.g, this.e, this.T, d9gVar.A0, z8gVar.f, z8gVar.e, 6));
        this.q0 = i5m.b(new js0(this.e, d9gVar.s, z8gVar.d, p8gVar.H, 14));
        this.r0 = i5m.b(new sb1(z8gVar.d, d9gVar.s, p8gVar.H, this.g, this.h, z8gVar.y, p8gVar.e, 16));
        this.s0 = i5m.b(new jc50(this.g, this.h, d9gVar.s, 4));
        this.t0 = i5m.b(new zfa(this.e, p8gVar.H, this.h, 9));
        i5m.b(new mz70(d9gVar.l, p8gVar.z, p8gVar.H, this.S, z8gVar.d, z8gVar.y, 17));
        i5m.b(new sb1(d9gVar.l, p8gVar.z, p8gVar.H, this.e, this.S, z8gVar.d, z8gVar.y, 6));
        i5m.b(new vm80(d9gVar.v, this.e, i3));
        this.u0 = i5m.b(new c0j(p8gVar.H, p8gVar.z, d9gVar.l, this.e, 26));
        xvf0 b11 = i5m.b(new gc((xvf0) this.g, (xvf0) p8gVar.H, (xvf0) this.e, (xvf0) d9gVar.s, (xvf0) d9gVar.E, (xvf0) d4cVar, z8gVar.y, (v7p) new jde0(this.f, i3), (xvf0) p8gVar.e1, 25));
        this.v0 = b11;
        this.w0 = i5m.b(new mz70(z8gVar.y, d9gVar.s, this.g, b11, p8gVar.S1, p8gVar.T1, 13));
        this.x0 = i5m.b(new hs30(d9gVar.s, p8gVar.m1, d9gVar.K0, p8gVar.q, 23));
        this.y0 = i5m.b(new c0j(d9gVar.s, this.e, p8gVar.H, p8gVar.Q1, 25));
        this.z0 = i5m.b(new zfa(this.e, d9gVar.s, p8gVar.H, 14));
        n3w n3wVar5 = this.e;
        this.A0 = i5m.b(new m580(p8gVar.R1, p8gVar.U1, z8gVar.z0, vp60.a, new rs0(n3wVar5, d9gVar.s, z8gVar.N, z8gVar.y, p8gVar.z, 7), d9gVar.z0, z8gVar.f, p8gVar.q, n3wVar5));
        xvf0 b12 = i5m.b(new wj0(this.e, p8gVar.q, z8gVar.e, d9gVar.s, d9gVar.R, z8gVar.e0, p8gVar.t0, i5m.b(new lu9(z8gVar.y, i4)), 9));
        this.B0 = b12;
        this.C0 = i5m.b(new s90(this.e, this.A0, b12, 16));
        this.D0 = i5m.b(new ahu(this.e, this.O, d9gVar.y, p8gVar.H, p8gVar.z, 19));
        this.E0 = i5m.b(new sb1(d9gVar.V0, this.e, p8gVar.H, z8gVar.f0, z8gVar.f, d9gVar.l, z8gVar.e, 7));
        this.F0 = i5m.b(new fwc(p8gVar.z, z8gVar.d, 23));
        this.G0 = i5m.b(new js0(p8gVar.K, p8gVar.H, this.e, z8gVar.f, 20));
        this.H0 = i5m.b(new zo0(z8gVar.d, this.e, d9gVar.s, this.e0, p8gVar.m0, p8gVar.z, 10));
    }

    public final bc a() {
        return new bc(this.a, this.d.e(), h(), (jwa0) this.c.S0.get(), (x22) this.b.y.get());
    }

    public final v0b b() {
        return new v0b(this.a, (wf4) this.c.s0.get());
    }

    public final cb6 c() {
        n5t0 e = this.d.e();
        z8g z8gVar = this.b;
        return new cb6(this.a, e, (Moshi) z8gVar.N.get(), (x22) z8gVar.y.get(), (at2) this.c.z.get());
    }

    public final oab d() {
        return (oab) this.h.get();
    }

    public final i e() {
        p8g p8gVar = this.c;
        return new i(this.a, (sb7) p8gVar.K.get(), new r1s(17, (at2) p8gVar.z.get(), i(), f()));
    }

    public final naz0 f() {
        p8g p8gVar = this.c;
        at2 at2Var = (at2) p8gVar.z.get();
        k020 k020Var = (k020) p8gVar.H.get();
        lqo lqoVar = this.b.a.d;
        q5z.i(lqoVar);
        return new naz0(this.a, at2Var, k020Var, lqoVar);
    }

    public final zbz0 g() {
        z8g z8gVar = this.b;
        h3y a = i5m.a(z8gVar.d);
        vcz0 h = h();
        oab oabVar = (oab) this.h.get();
        naz0 f = f();
        vcz0 h2 = h();
        naz0 f2 = f();
        p8g p8gVar = this.c;
        oy80 oy80Var = new oy80(15, f2, (at2) p8gVar.z.get());
        k020 k020Var = (k020) p8gVar.H.get();
        MessengerEnvironment messengerEnvironment = (MessengerEnvironment) p8gVar.i.get();
        r1s r1sVar = new r1s(18, (p220) z8gVar.n.get(), (q220) z8gVar.x0.get(), (MessengerEnvironment) p8gVar.i.get());
        lqo lqoVar = z8gVar.a.d;
        q5z.i(lqoVar);
        return new zbz0(a, h, oabVar, new du10(f, h2, oy80Var, k020Var, messengerEnvironment, r1sVar, lqoVar, b(), (a) p8gVar.Q1.get(), new izy0((com.yandex.messaging.internal.backendconfig.a) p8gVar.t0.get()), (e) z8gVar.f0.get(), (tyf0) z8gVar.y0.get()));
    }

    public final vcz0 h() {
        p8g p8gVar = this.c;
        return new vcz0(this.a, (at2) p8gVar.z.get(), (k020) p8gVar.H.get(), (Moshi) this.b.N.get());
    }

    public final p150 i() {
        Context context = this.b.a.a;
        q5z.i(context);
        p8g p8gVar = this.c;
        return new p150(context, this.a, (at2) p8gVar.z.get(), new oeb((at2) p8gVar.z.get()), p8gVar.h(), p8gVar.l(), i5m.a(p8gVar.B0));
    }
}
