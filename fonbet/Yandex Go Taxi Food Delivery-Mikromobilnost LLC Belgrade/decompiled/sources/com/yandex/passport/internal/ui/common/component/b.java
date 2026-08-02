package com.yandex.passport.internal.ui.common.component;

import androidx.compose.ui.node.d;
import com.yandex.passport.R;
import defpackage.agc;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.dgc;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.mt71;
import defpackage.ohd;
import defpackage.p4v;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yo2;
import defpackage.z910;

/* loaded from: classes2.dex */
public abstract class b {
    public static final void a(boolean z, f530 f530Var, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1168546822);
        if ((i & 6) == 0) {
            i3 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(null) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            btsVar.e0(-457271416);
            btsVar.t(false);
            z910 d = pi6.d(x4c.y, false);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var);
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
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            if (z) {
                btsVar.e0(1475413922);
                p4v.b(mt71.m(R.drawable.passport_logout_radio_checked, 0, btsVar), null, null, ((agc) btsVar.m(dgc.a)).a, btsVar, 48, 4);
                btsVar.t(false);
            } else {
                btsVar.e0(1475647011);
                p4v.b(mt71.m(R.drawable.passport_logout_radio_normal, 0, btsVar), null, null, ((agc) btsVar.m(dgc.a)).A, btsVar, 48, 4);
                btsVar.t(false);
            }
            btsVar.t(true);
        }
        f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yo2(z, f530Var2, i, i2, 2);
        }
    }
}
