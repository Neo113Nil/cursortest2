package com.yandex.go.scooters.ignition.panel;

import com.yandex.go.design.compose.badge.BadgeSize;
import defpackage.acd;
import defpackage.aii0;
import defpackage.am4;
import defpackage.an91;
import defpackage.apn0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cx20;
import defpackage.cyk0;
import defpackage.did;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.jrn0;
import defpackage.k3r;
import defpackage.ljs0;
import defpackage.mhe;
import defpackage.mja1;
import defpackage.mm4;
import defpackage.ohd;
import defpackage.ovi0;
import defpackage.pi6;
import defpackage.q791;
import defpackage.qeg0;
import defpackage.qgy;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.tls;
import defpackage.uo5;
import defpackage.up2;
import defpackage.urn0;
import defpackage.v0b1;
import defpackage.vrn0;
import defpackage.wk4;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xrn0;
import defpackage.xya1;
import defpackage.y740;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zp2;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes13.dex */
public abstract class d {
    public static final void a(vrn0 vrn0Var, sls slsVar, f530 f530Var, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1018893249);
        int i2 = i | (btsVar.k(vrn0Var) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 d = q791.d(ymb1.l(ljs0.e(f530Var, 216.0f), cyk0.c(24.0f)), false, null, null, slsVar, 15);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d3);
            ovi0 a = mja1.a(vrn0Var.b, null, 6);
            k3r k3rVar = ljs0.c;
            acd.a.getClass();
            v0b1.a(a, k3rVar, null, acd.b, null, null, null, mhe.a, 0.0f, 0, btsVar, 12586032, 884);
            CharSequence charSequence = vrn0Var.c;
            c530 c530Var = c530.a;
            f530 o2 = an91.o(c530Var, 16.0f, 0.0f, 16.0f, 16.0f, 2);
            uo5 uo5Var = x4c.A;
            cj6 cj6Var = cj6.a;
            f530 a2 = cj6Var.a(o2, uo5Var);
            ety0 ety0Var = xya1.e(btsVar).g.c;
            long j = zp2.a;
            qgy.b(charSequence, null, a2, new up2(j), 0L, 0L, null, 0L, 0, 0, 0, ety0Var, null, btsVar, 0, 0, 12274);
            btsVar = btsVar;
            urn0 urn0Var = vrn0Var.f;
            if (urn0Var != null) {
                wp2 wp2Var = urn0Var.b;
                btsVar.e0(-583757045);
                CharSequence charSequence2 = urn0Var.a;
                z = true;
                wk4.a(BadgeSize.M, new mm4(wp2Var, new up2(j), new am4(wp2Var)), an91.d(6.0f, 0.0f, 6.0f, 2.0f, 2), cj6Var.a(an91.k(c530Var, 16.0f), x4c.w), wwg.S(363410840, true, new jrn0(charSequence2, xya1.e(btsVar).h.b, 0), btsVar), btsVar, 196998);
                btsVar.t(false);
            } else {
                z = true;
                btsVar.e0(-583428197);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(vrn0Var, slsVar, f530Var, i, 18);
        }
    }

    public static final void b(xrn0 xrn0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1692237756);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(xrn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            cx20.a(null, null, null, null, null, false, false, null, wwg.S(-1075519150, true, new y740(21, xrn0Var, tlsVar), btsVar), btsVar, 100663296, 255);
            boolean z = (i3 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ScootersIgnitionPanelScreenKt$ScootersIgnitionPanelScreen$2$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(xrn0Var, tlsVar, i, 3);
        }
    }
}
