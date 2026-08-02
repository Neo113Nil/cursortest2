package com.yandex.go.navigator.main_screen.ui;

import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.n;
import defpackage.a7y;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.dbb1;
import defpackage.dc0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.gi0;
import defpackage.h6b1;
import defpackage.hbb1;
import defpackage.he91;
import defpackage.i71;
import defpackage.igr0;
import defpackage.j71;
import defpackage.jeb1;
import defpackage.jl40;
import defpackage.k71;
import defpackage.khl0;
import defpackage.kiu;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m3u0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.ooi;
import defpackage.oz40;
import defpackage.pa31;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.qor;
import defpackage.r1b0;
import defpackage.r2z0;
import defpackage.sb2;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.uo5;
import defpackage.vfc;
import defpackage.vs9;
import defpackage.wls;
import defpackage.x4c;
import defpackage.x700;
import defpackage.xm91;
import defpackage.y7m;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zpn;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(f530 f530Var, boolean z, x700 x700Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z2;
        qor g;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1635295262);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(x700Var) : btsVar.e(x700Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            k71 k71Var = x700Var.i;
            i71 i71Var = k71Var instanceof i71 ? (i71) k71Var : null;
            List list = i71Var != null ? i71Var.a : null;
            b a = a7y.a(0, 3, btsVar);
            Boolean valueOf = Boolean.valueOf(z);
            boolean k = ((i2 & 112) == 32) | btsVar.k(a);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new MainModalCardContentKt$CardContent$1$1(z, a, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, valueOf);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(new y7m(90.0f));
                btsVar.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            fwi fwiVar = (fwi) btsVar.m(j.h);
            boolean k2 = btsVar.k(fwiVar);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == o430Var) {
                Q3 = new ooi(fwiVar, oz40Var, 3);
                btsVar.o0(Q3);
            }
            f530 b = xm91.b(c530.a, (tls) Q3);
            f530 l = ymb1.l(f530Var, cyk0.e(40.0f, 40.0f, 0.0f, 0.0f, 12));
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar = d.b;
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf2 = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf2);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            int i3 = i2 & 7168;
            he91.b(a, x700Var.c, x700Var.b, tlsVar, list, ((y7m) oz40Var.getValue()).a, btsVar, i3 | 32768);
            igr0 b2 = dbb1.b(btsVar);
            btsVar.e0(-1589695624);
            if (((Boolean) btsVar.m(n.a)).booleanValue()) {
                btsVar.e0(1982130604);
                Object Q4 = btsVar.Q();
                if (Q4 == o430Var) {
                    Q4 = jeb1.g(f.d(new vs9(a, 17)));
                    btsVar.o0(Q4);
                }
                g = (qor) Q4;
                btsVar.t(false);
                btsVar.t(false);
                z2 = false;
            } else {
                btsVar.e0(1982251690);
                btsVar.t(false);
                z2 = false;
                m3u0 b3 = androidx.compose.animation.core.b.b(a.e() ? 1.0f : 0.0f, sb2.K(200, 0, null, 6), "Scroll animation effect", null, btsVar, 3120, 20);
                btsVar = btsVar;
                g = jeb1.g(b3);
                btsVar.t(false);
            }
            f530 c = hbb1.c(b, b2, false, 24.0f, g, 2);
            z910 d3 = pi6.d(uo5Var, z2);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d4);
            boolean z3 = i3 == 2048;
            Object Q5 = btsVar.Q();
            if (z3 || Q5 == o430Var) {
                tlsVar2 = tlsVar;
                Q5 = new kiu(8, tlsVar2);
                btsVar.o0(Q5);
            } else {
                tlsVar2 = tlsVar;
            }
            h6b1.a((sls) Q5, btsVar, 0);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(f530Var, z, x700Var, tlsVar2, i, 13);
        }
    }

    public static final void b(f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-321791969);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            byk0 c = cyk0.c(40.0f);
            c530 c530Var = c530.a;
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(an91.k(c530Var, 12.0f), 1.0f), 64.0f), c, false, null, null, null, false, btsVar, 6, 252);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            com.yandex.go.design.compose.loading.b.a(ljs0.m(an91.m(c530Var, 8.0f, 0.0f, 2), 40.0f), null, false, null, null, null, false, btsVar, 6, 254);
            com.yandex.go.design.compose.loading.b.a(ljs0.c(ljs0.b(ljs0.e(an91.o(c530Var, 0.0f, 0.0f, 12.0f, 0.0f, 11).k(new pa31(x4c.E)), 16.0f), 16.0f, 0.0f, 2), 1.0f), null, false, null, null, null, false, btsVar, 0, 254);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dc0(f530Var, i, 12);
        }
    }

    public static final void c(f530 f530Var, boolean z, x700 x700Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(364998422);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.a(z) ? 32 : 16) | (btsVar.e(x700Var) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (!btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.Y();
        } else if (jl40.l(x700Var.i, j71.a)) {
            btsVar.e0(-1188979383);
            b(f530Var, btsVar, i2 & 14);
            btsVar.t(false);
        } else {
            btsVar.e0(-1188929876);
            a(f530Var, z, x700Var, tlsVar, btsVar, (i2 & 7168) | (i2 & HProv.PP_DELETE_SAVED_PASSWD) | 512 | (i2 & 896));
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(f530Var, z, x700Var, tlsVar, i, 10);
        }
    }
}
