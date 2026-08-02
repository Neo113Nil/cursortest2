package com.yandex.go.taxi.order.cancel.v3.ui;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.a4d;
import defpackage.a7y;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.az7;
import defpackage.bj0;
import defpackage.bts;
import defpackage.bz7;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cx20;
import defpackage.cx7;
import defpackage.cyk0;
import defpackage.cz7;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.hob1;
import defpackage.i43;
import defpackage.i8i0;
import defpackage.i9a1;
import defpackage.jeb1;
import defpackage.khl0;
import defpackage.ky7;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lu5;
import defpackage.m8i0;
import defpackage.mhe;
import defpackage.mj5;
import defpackage.mqg0;
import defpackage.o430;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.ovi0;
import defpackage.pa31;
import defpackage.pi6;
import defpackage.q0v;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.sp5;
import defpackage.tls;
import defpackage.tnb1;
import defpackage.up2;
import defpackage.v0b1;
import defpackage.vfc;
import defpackage.vqr;
import defpackage.w04;
import defpackage.wk6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xx8;
import defpackage.xy7;
import defpackage.xya1;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import defpackage.zy7;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class a {
    public static final void a(zy7 zy7Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(796196729);
        dmw0 dmw0Var = btsVar.a;
        int i3 = (btsVar.k(zy7Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = bzk0.c(ljs0.e(an91.m(c530Var, 2.0f, 0.0f, 2), 40.0f), zy7Var.f, cyk0.c(13.0f));
            awk0 awk0Var = new awk0(0);
            boolean z = (i3 & 112) == 32;
            int i4 = i3 & 14;
            boolean z2 = z | (i4 == 4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new lu5(27, tlsVar, zy7Var);
                btsVar.o0(Q);
            }
            f530 b = q791.b(c, null, null, true, null, awk0Var, (sls) Q, 8);
            boolean z3 = i4 == 4;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new cx7(2, zy7Var);
                btsVar.o0(Q2);
            }
            f530 a = fnq0.a(b, (tls) Q2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 a2 = cj6.a.a(an91.o(c530Var, 10.0f, 0.0f, 14.0f, 0.0f, 10), x4c.y);
            lhl0 a3 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, a2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            ovi0 ovi0Var = zy7Var.c;
            if (ovi0Var == null) {
                btsVar.e0(88578532);
                btsVar.t(false);
            } else {
                btsVar.e0(88578533);
                f530 m = ljs0.m(an91.o(c530Var, 0.0f, 0.0f, 6.0f, 0.0f, 11), 20.0f);
                a4d.a.getClass();
                v0b1.a(ovi0Var, m, null, a4d.b, null, null, null, mhe.g, 0.0f, 0, btsVar, 12586032, 884);
                btsVar.t(false);
            }
            pa31 pa31Var = new pa31(x4c.E);
            String str = zy7Var.d;
            if (str == null) {
                str = "";
            }
            jeb1.f(str, pa31Var, zy7Var.e, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar).h.a, btsVar, 805306368, 48, 13816);
            btsVar = btsVar;
            i2 = 1;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            i2 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(zy7Var, tlsVar, i, i2);
        }
    }

    public static final void b(cz7 cz7Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1304357367);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(cz7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new CancelReasonsV3ModalKt$CancelReasonsV3Modal$1$1(cz7Var, tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            cx20.a(null, null, tnb1.e(null, null, btsVar, 5), null, null, false, false, null, wwg.S(195562007, true, new sp5(8, cz7Var, tlsVar), btsVar), btsVar, 100663296, 251);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(cz7Var, tlsVar, i, 14);
        }
    }

    public static final void c(xy7 xy7Var, tls tlsVar, fid fidVar, int i) {
        String str;
        bts btsVar = (bts) fidVar;
        btsVar.g0(9177135);
        int i2 = (btsVar.k(xy7Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = bzk0.c(an91.l(c530Var, 16.0f, 8.0f), AppColor$Palette.BgMinor, cyk0.c(16.0f));
            awk0 awk0Var = new awk0(0);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new lu5(29, tlsVar, xy7Var);
                btsVar.o0(Q);
            }
            f530 d = q791.d(c, false, null, awk0Var, (sls) Q, 11);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d3);
            f530 c2 = ljs0.c(an91.l(c530Var, 16.0f, 19.5f), 1.0f);
            String str2 = xy7Var.b;
            if (str2 == null) {
                str = xy7Var.a;
                if (str == null) {
                    str = "";
                }
            } else {
                str = str2;
            }
            jeb1.f(str, c2, str2 != null ? AppColor$Palette.Text : AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, null, btsVar, 805306416, 48, 30200);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(xy7Var, tlsVar, i, 3);
        }
    }

    public static final void d(x2y x2yVar, cz7 cz7Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1052310078);
        int i2 = i | (btsVar.k(x2yVar) ? 4 : 2) | (btsVar.k(cz7Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new w04(24, cz7Var, tlsVar);
                btsVar.o0(Q);
            }
            adb1.a(x2yVar, a, null, null, null, null, false, null, (tls) Q, btsVar, i2 & 14, 508);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(x2yVar, cz7Var, tlsVar, i, 20);
        }
    }

    public static final void e(cz7 cz7Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1502886544);
        int i2 = 2;
        int i3 = (btsVar.k(cz7Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530 c = ljs0.c(i9a1.d(an91.k(c530.a, 8.0f)), 1.0f);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new lu5(28, tlsVar, cz7Var);
                btsVar.o0(Q);
            }
            ohb1.b(c, false, null, (sls) Q, wwg.S(-1781946077, true, new bj0(21, cz7Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(cz7Var, tlsVar, i, i2);
        }
    }

    public static final void f(bz7 bz7Var, tls tlsVar, fid fidVar, int i) {
        bz7 bz7Var2;
        c530 c530Var;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1607281127);
        int i2 = i | (btsVar.k(bz7Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(c530Var2, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            String str = bz7Var.b;
            if (str == null) {
                btsVar.e0(-292864112);
                btsVar.t(false);
                c530Var = c530Var2;
                z = false;
            } else {
                btsVar.e0(-292864111);
                f530 l = an91.l(c530Var2, 16.0f, 12.0f);
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new wk6(22);
                    btsVar.o0(Q);
                }
                c530Var = c530Var2;
                z = false;
                jeb1.f(str, fnq0.b(l, false, (tls) Q), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.b, btsVar, 384, 0, 16376);
                btsVar = btsVar;
                btsVar.t(false);
            }
            bz7Var2 = bz7Var;
            vqr.c(ljs0.c(an91.o(an91.m(c530Var, 14.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 14.0f, 7), 1.0f), null, new i43(4.0f, true, new quz(11)), null, 0, 0, wwg.S(-1590703038, true, new sp5(7, bz7Var2, tlsVar), btsVar), btsVar, 1573254, 58);
            az7 az7Var = bz7Var2.d;
            if (az7Var == null) {
                btsVar.e0(-292268168);
                btsVar.t(z);
            } else {
                btsVar.e0(-292268167);
                g(az7Var, tlsVar, btsVar, i2 & 112);
                btsVar.t(z);
            }
            btsVar.t(true);
        } else {
            bz7Var2 = bz7Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(bz7Var2, tlsVar, i, 29);
        }
    }

    public static final void g(az7 az7Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        c530 c530Var;
        so5 so5Var = x4c.H;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2011153370);
        int i3 = i | (btsVar.k(az7Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(c530Var2, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            String str = az7Var.a;
            if (str == null) {
                btsVar.e0(2139966100);
                btsVar.t(false);
                c530Var = c530Var2;
                i2 = 0;
            } else {
                btsVar.e0(2139966101);
                c530Var = c530Var2;
                i2 = 0;
                jeb1.f(str, vfc.j(so5Var, an91.m(c530Var2, 0.0f, 10.0f, 1)), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, 384, 0, 16376);
                btsVar = btsVar;
                btsVar.t(false);
            }
            f530 j = vfc.j(so5Var, an91.o(c530Var, 0.0f, 0.0f, 0.0f, 14.0f, 7));
            int i4 = az7Var.b;
            m8i0 m8i0Var = new m8i0(new i8i0(new up2(hob1.a(btsVar, mqg0.component_amber_toxic))), 29);
            int i5 = ((i3 & 14) == 4 ? 1 : i2) | ((i3 & 112) == 32 ? 1 : i2);
            Object Q = btsVar.Q();
            if (i5 != 0 || Q == did.a) {
                Q = new w04(25, tlsVar, az7Var);
                btsVar.o0(Q);
            }
            com.yandex.go.design.compose.ratingbar.a.a(j, i4, 0, m8i0Var, (tls) Q, btsVar, 0);
            btsVar.t(true);
        } else {
            i2 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(az7Var, tlsVar, i, i2);
        }
    }
}
