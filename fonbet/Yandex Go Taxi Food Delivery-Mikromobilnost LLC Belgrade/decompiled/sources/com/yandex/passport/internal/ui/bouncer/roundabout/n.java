package com.yandex.passport.internal.ui.bouncer.roundabout;

import com.yandex.passport.R;
import com.yandex.passport.api.AccountListShowMode;
import com.yandex.passport.internal.flags.presentation.s0;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import defpackage.aii0;
import defpackage.bts;
import defpackage.cma1;
import defpackage.did;
import defpackage.fid;
import defpackage.k3r;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.mhe;
import defpackage.mt71;
import defpackage.pa90;
import defpackage.rfc;
import defpackage.tls;

/* loaded from: classes2.dex */
public abstract class n {
    public static final void a(com.yandex.passport.internal.ui.bouncer.v vVar, y1 y1Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1389825057);
        int i2 = (btsVar.k(vVar) ? 4 : 2) | i | (btsVar.e(y1Var) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(-331034859);
            boolean e = ((i2 & 14) == 4) | btsVar.e(y1Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new s0(13, vVar, y1Var);
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            btsVar.t(false);
            k3r k3rVar = ljs0.c;
            btsVar.e0(-331011495);
            pa90 m = y1Var.a.getVisualProperties().getAccountListProperties().getShowMode() == AccountListShowMode.FULLSCREEN ? mt71.m(R.drawable.passport_background_main, 0, btsVar) : new rfc(ldc.l);
            btsVar.t(false);
            androidx.compose.ui.viewinterop.b.a(tlsVar, cma1.j0(k3rVar, m, null, mhe.g, 0.0f, null, 54), null, btsVar, 0, 4);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(vVar, y1Var, i, 10);
        }
    }
}
