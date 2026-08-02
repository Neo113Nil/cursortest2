package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.R;
import defpackage.agc;
import defpackage.aii0;
import defpackage.awk0;
import defpackage.b64;
import defpackage.bq11;
import defpackage.bts;
import defpackage.cma1;
import defpackage.dgc;
import defpackage.did;
import defpackage.eq11;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.lzr;
import defpackage.mt71;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.p4v;
import defpackage.pa31;
import defpackage.pa90;
import defpackage.q791;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.vqy0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zx40;

/* loaded from: classes15.dex */
public abstract class d1 {
    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var, String str) {
        long j;
        long j2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-418425144);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(507436428);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            btsVar.t(false);
            oz40 c = androidx.compose.foundation.interaction.a.c(zx40Var, btsVar);
            f530 b = q791.b(f530Var, zx40Var, null, false, null, new awk0(0), slsVar, 12);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            ety0 ety0Var = ((bq11) btsVar.m(eq11.a)).k;
            lzr lzrVar = lzr.E;
            if (((Boolean) c.getValue()).booleanValue()) {
                btsVar.e0(699910635);
                j = ((agc) btsVar.m(dgc.a)).a;
            } else {
                btsVar.e0(699911885);
                j = ((agc) btsVar.m(dgc.a)).f;
            }
            btsVar.t(false);
            vqy0.c(str, null, j, 0L, lzrVar, 0L, new sjy0(3), 0L, 0, false, 0, 0, ety0Var, btsVar, (i2 & 14) | 1572864, 0, 129978);
            btsVar = btsVar;
            pa90 m = mt71.m(R.drawable.passport_logout_delete_trailing, 0, btsVar);
            pa31 pa31Var = new pa31(x4c.E);
            if (((Boolean) c.getValue()).booleanValue()) {
                btsVar.e0(699921099);
                j2 = ((agc) btsVar.m(dgc.a)).a;
            } else {
                btsVar.e0(699922349);
                j2 = ((agc) btsVar.m(dgc.a)).f;
            }
            btsVar.t(false);
            p4v.b(m, null, pa31Var, j2, btsVar, 48, 0);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.internal.flags.presentation.o(str, slsVar, f530Var, i, 1);
        }
    }
}
