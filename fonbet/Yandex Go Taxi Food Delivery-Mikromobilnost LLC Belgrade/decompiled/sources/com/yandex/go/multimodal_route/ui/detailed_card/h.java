package com.yandex.go.multimodal_route.ui.detailed_card;

import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.ljs0;
import defpackage.lv90;
import defpackage.m1a0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.t240;
import defpackage.tls;
import defpackage.unr0;
import defpackage.vqy;
import defpackage.x4c;
import defpackage.xr40;
import defpackage.yr40;
import defpackage.z0a0;
import defpackage.z910;
import defpackage.zr40;

/* loaded from: classes12.dex */
public abstract class h {
    public static final void a(zr40 zr40Var, z0a0 z0a0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(7098226);
        int i2 = i | (btsVar.e(zr40Var) ? 4 : 2) | (btsVar.k(z0a0Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 o = an91.o(ljs0.b, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, o);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o2);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            if (zr40Var instanceof yr40) {
                btsVar.e0(785778561);
                yr40 yr40Var = (yr40) zr40Var;
                lv90 lv90Var = yr40Var.b;
                m1a0 m1a0Var = yr40Var.a;
                f530 a = cj6.a.a(c530.a, x4c.y);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (Q == o430Var) {
                    Q = MultimodalRoutePaymentButtonKt$MultimodalRoutePaymentButton$1$1$1.a;
                    btsVar.o0(Q);
                }
                tls tlsVar2 = (tls) Q;
                boolean e = ((i2 & 896) == 256) | ((i2 & 112) == 32) | btsVar.e(m1a0Var) | btsVar.e(lv90Var);
                Object Q2 = btsVar.Q();
                if (e || Q2 == o430Var) {
                    vqy vqyVar = new vqy(m1a0Var, z0a0Var, tlsVar, lv90Var, 8);
                    btsVar.o0(vqyVar);
                    Q2 = vqyVar;
                }
                androidx.compose.ui.viewinterop.b.a(tlsVar2, a, (tls) Q2, btsVar, 6, 0);
                btsVar.t(false);
            } else {
                if (!jl40.l(zr40Var, xr40.a)) {
                    throw unr0.y(1687913526, btsVar, false);
                }
                btsVar.e0(786390036);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240((Object) zr40Var, (Object) z0a0Var, tlsVar, i, 14);
        }
    }
}
