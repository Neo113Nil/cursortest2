package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes5.dex */
public abstract class dn1 {
    public static final long a = ldc.b(rzo.d(1291845632), 0.3f, 0.0f, 0.0f, 0.0f, 14);
    public static final long b = ldc.b(rzo.d(1090519039), 0.25f, 0.0f, 0.0f, 0.0f, 14);
    public static final long c = rzo.f(4280624167L);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
    
        if (defpackage.jl40.l(r10.Q(), java.lang.Integer.valueOf(r14)) == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(CharSequence charSequence, sls slsVar, sls slsVar2, sls slsVar3, int i, boolean z, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1903515183);
        dmw0 dmw0Var = btsVar.a;
        int i4 = i2 | (btsVar.e(charSequence) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(slsVar2) ? 256 : 128) | (btsVar.e(slsVar3) ? 2048 : 1024) | (btsVar.c(i) ? 16384 : 8192) | (btsVar.a(z) ? 131072 : 65536);
        if (btsVar.V(i4 & 1, (74899 & i4) != 74898)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 0.0f, 0.0f, 34.0f, 7);
            sic a2 = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar4 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar4);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            wls wlsVar3 = d.g;
            if (btsVar.S) {
                i3 = i4;
            } else {
                i3 = i4;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            if (charSequence == null) {
                btsVar.e0(-911603367);
                btsVar.t(false);
            } else {
                btsVar.e0(-911603366);
                g(charSequence, btsVar, i3 & 14);
                btsVar.t(false);
            }
            f530 m = an91.m(n.e(c530Var, 12.0f, btsVar, c530Var, 1.0f), 16.0f, 0.0f, 2);
            lhl0 a3 = khl0.a(lr20.g, x4c.E, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar4);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            e(slsVar3, wzg0.ic_delivery_smartcam_flashlight, wwg.S(1989540104, true, new vm1(i, 0), btsVar), btsVar, ((i3 >> 9) & 14) | 384, 0);
            d(slsVar2, z, btsVar, ((i3 >> 6) & 14) | ((i3 >> 12) & 112));
            e(slsVar, wzg0.ic_delivery_smartcam_gallery, null, btsVar, (i3 >> 3) & 14, 4);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(charSequence, slsVar, slsVar2, slsVar3, i, z, i2);
        }
    }

    public static final void b(bj6 bj6Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1070941259);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            uo5 uo5Var = x4c.y;
            c530 c530Var = c530.a;
            f530 m = ljs0.m(sm91.e(bj6Var.a(c530Var, uo5Var), 6.0f, 6.0f), 12.0f);
            byk0 byk0Var = cyk0.a;
            pi6.a(m4m0.b(m, a, byk0Var), btsVar, 0);
            f530 b2 = m4m0.b(ljs0.m(sm91.e(bj6Var.a(c530Var, uo5Var), 6.0f, 6.0f), 10.0f), ldc.f, byk0Var);
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            m5b1.b("A", null, new ety0(ldc.b, uh6.E(8), lzr.G, null, null, null, 0L, 0, 0L, null, null, 16777208), null, 0, false, 0, 0, null, null, btsVar, 390, 1018);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xm1(bj6Var, i, 0);
        }
    }

    public static final void c(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1899925428);
        if (btsVar.V(i & 1, i != 0)) {
            k3r k3rVar = ljs0.c;
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new j01(15);
                btsVar.o0(Q);
            }
            qeb1.a(54, btsVar, (tls) Q, k3rVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zbd(i, 11);
        }
    }

    public static final void d(sls slsVar, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-709561550);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.a(z) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 m = ljs0.m(c530Var, 88.0f);
            byk0 byk0Var = cyk0.a;
            long j = dl51.N;
            f530 l = ymb1.l(ibb1.c(m, 52.0f, byk0Var, j, j, 4), byk0Var);
            boolean z2 = (i2 & 14) == 4;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new jc0(6, slsVar);
                btsVar2.o0(Q);
            }
            f530 d = q791.d(l, z, null, null, (sls) Q, 14);
            uo5 uo5Var = x4c.y;
            z910 d2 = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = b.d(btsVar2, d);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, d2);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d3);
            f530 b2 = m4m0.b(ymb1.l(ljs0.m(c530Var, 64.0f), byk0Var), a, qke.q);
            z910 d4 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d5 = b.d(btsVar2, b2);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, d4);
            qje.W(btsVar2, wlsVar2, o2);
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar2, hashCode2, wlsVar3);
            }
            qje.W(btsVar2, wlsVar4, d5);
            c(btsVar2, 0);
            btsVar = btsVar2;
            s3b1.f(new cuj0(wzg0.ic_delivery_smartcam, null, null, new zez0(ldc.f), 22), ljs0.m(c530Var, 32.0f), null, btsVar, 48, 4);
            btsVar.t(true);
            k3r k3rVar = ljs0.c;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new cs0(b, 3);
                btsVar.o0(Q2);
            }
            qeb1.a(54, btsVar, (tls) Q2, k3rVar);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wm1(i, 0, slsVar, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(sls slsVar, int i, zls zlsVar, fid fidVar, int i2, int i3) {
        int i4;
        zls zlsVar2;
        zls zlsVar3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1392413786);
        if ((i2 & 6) == 0) {
            i4 = (btsVar.e(slsVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar.c(i) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            zlsVar2 = zlsVar;
            i4 |= btsVar.e(zlsVar2) ? 256 : 128;
            if (btsVar.V(i4 & 1, (i4 & 147) == 146)) {
                btsVar.Y();
                zlsVar3 = zlsVar2;
            } else {
                zlsVar3 = i5 != 0 ? null : zlsVar2;
                f530 m = ljs0.m(c530.a, 52.0f);
                byk0 byk0Var = cyk0.a;
                long j = dl51.N;
                f530 b2 = m4m0.b(ymb1.l(ibb1.c(m, 48.0f, byk0Var, j, j, 4), byk0Var), a, qke.q);
                boolean z = (i4 & 14) == 4;
                Object Q = btsVar.Q();
                if (z || Q == did.a) {
                    Q = new jc0(5, slsVar);
                    btsVar.o0(Q);
                }
                f530 d = q791.d(b2, false, null, null, (sls) Q, 15);
                z910 d2 = pi6.d(x4c.y, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d3 = b.d(btsVar, d);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                if (btsVar.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar2);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, d2);
                qje.W(btsVar, d.e, o);
                wls wlsVar = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar);
                }
                qje.W(btsVar, d.d, d3);
                c(btsVar, 0);
                s3b1.f(new cuj0(i, null, null, new zez0(ldc.f), 22), null, null, btsVar, 0, 6);
                if (zlsVar3 != null) {
                    btsVar.e0(81276571);
                    ly3.x(((i4 >> 3) & 112) | 6, zlsVar3, cj6.a, btsVar, false);
                } else {
                    btsVar.e0(81314050);
                    btsVar.t(false);
                }
                btsVar.t(true);
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new bn1(slsVar, i, zlsVar3, i2, i3, 0);
                return;
            }
            return;
        }
        zlsVar2 = zlsVar;
        if (btsVar.V(i4 & 1, (i4 & 147) == 146)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void f(bj6 bj6Var, int i, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-200697981);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(bj6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.c(i) ? 32 : 16;
        }
        if (!btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            btsVar.Y();
        } else if (i == 0) {
            btsVar.e0(-398685833);
            b(bj6Var, btsVar, i3 & 14);
            btsVar.t(false);
        } else if (i != 2) {
            btsVar.e0(-398641441);
            btsVar.t(false);
        } else {
            btsVar.e0(-398946853);
            pi6.a(m4m0.b(ljs0.e(ljs0.c(ira1.i(c530.a, 45.0f), 1.0f), 0.7f), ldc.f, qke.q), btsVar, 6);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new an1(bj6Var, i, i2, 0);
        }
    }

    public static final void g(CharSequence charSequence, fid fidVar, int i) {
        int i2;
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1750220506);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 o = an91.o(an91.k(m4m0.b(ymb1.l(tra1.b(c530.a, 0.6f), new yub(3)), c, qke.q), 12.0f), 0.0f, 0.0f, 0.0f, 6.0f, 7);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o2);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            charSequence2 = charSequence;
            zgb1.a(charSequence2, null, 0, false, null, null, false, null, btsVar, i2 & 14, 254);
            btsVar.t(true);
        } else {
            charSequence2 = charSequence;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cn1(charSequence2, i, 0, (byte) 0);
        }
    }

    public static final void h(int i, fid fidVar, sls slsVar, sls slsVar2, f530 f530Var) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-531983208);
        int i2 = 2;
        int i3 = 32;
        int i4 = 256;
        int i5 = i | (btsVar2.k(f530Var) ? 4 : 2) | (btsVar2.e(slsVar) ? 32 : 16) | (btsVar2.e(slsVar2) ? 256 : 128);
        if (btsVar2.V(i5 & 1, (i5 & 147) != 146)) {
            String e = ohb1.e(btsVar2, qxh0.cargoform_smart_camera_done_button_title);
            String e2 = ohb1.e(btsVar2, qxh0.cargoform_smart_camera_cancel_button_title);
            f530 o = an91.o(ljs0.c(f530Var, 1.0f), 0.0f, 0.0f, 0.0f, 34.0f, 7);
            lhl0 a2 = khl0.a(lr20.g, x4c.E, btsVar2, 54);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = b.d(btsVar2, o);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar3);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a2);
            qje.W(btsVar2, d.e, o2);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            btsVar2.e0(2140144279);
            int i6 = 0;
            while (i6 < i2) {
                f530 e3 = ljs0.e(an91.m(c530.a, 16.0f, 0.0f, i2), 40.0f);
                byk0 c2 = cyk0.c(100.0f);
                long g = ((el51) btsVar2.m(gl51.a)).g();
                boolean c3 = ((i5 & 896) == i4) | btsVar2.c(i6) | ((i5 & 112) == i3);
                Object Q = btsVar2.Q();
                if (c3 || Q == did.a) {
                    Q = new p61(i6, slsVar2, slsVar);
                    btsVar2.o0(Q);
                }
                bts btsVar3 = btsVar2;
                a.b((sls) Q, e3, c2, g, 0L, null, null, null, false, null, null, null, wwg.S(1077229733, true, new wkb0(i6, 1, e, e2), btsVar2), btsVar3, 0, 384, 4080);
                i6++;
                btsVar2 = btsVar3;
                e = e;
                e2 = e2;
                i5 = i5;
                i4 = 256;
                i2 = 2;
                i3 = 32;
            }
            btsVar = btsVar2;
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zm1(f530Var, slsVar, slsVar2, i, 0);
        }
    }
}
