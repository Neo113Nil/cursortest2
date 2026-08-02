package com.yandex.passport.internal.ui.challenge.webview;

import com.yandex.passport.R;
import com.yandex.passport.internal.properties.u;
import defpackage.a7u0;
import defpackage.agc;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bq11;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.dgc;
import defpackage.dmw0;
import defpackage.eq11;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.uo5;
import defpackage.vqy0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z910;

/* loaded from: classes15.dex */
public abstract class m {
    public static final void a(String str, sls slsVar, fid fidVar, int i) {
        String str2;
        sls slsVar2 = slsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2064540694);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.e(slsVar2) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            str2 = str;
        } else {
            k3r k3rVar = ljs0.c;
            a7u0 a7u0Var = dgc.a;
            f530 b = m4m0.b(k3rVar, ((agc) btsVar.m(a7u0Var)).p, qke.q);
            z910 d = pi6.d(x4c.b, false);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar3 = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar3);
            }
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            cj6 cj6Var = cj6.a;
            uo5 uo5Var = x4c.y;
            c530 c530Var = c530.a;
            f530 a = cj6Var.a(c530Var, uo5Var);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int S2 = cma1.S(btsVar);
            r1b0 o2 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, a);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                b64.z(S2, btsVar, S2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            vqy0.c(str, null, ((agc) btsVar.m(a7u0Var)).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar.m(eq11.a)).j, btsVar, i2 & 14, 0, 131066);
            str2 = str;
            btsVar = btsVar;
            u.g((i2 & 112) | 384, 8, btsVar, slsVar, an91.o(c530Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), ohb1.e(btsVar, R.string.passport_reg_try_again), false);
            slsVar2 = slsVar;
            btsVar.t(true);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(str2, slsVar2, i, 14);
        }
    }
}
