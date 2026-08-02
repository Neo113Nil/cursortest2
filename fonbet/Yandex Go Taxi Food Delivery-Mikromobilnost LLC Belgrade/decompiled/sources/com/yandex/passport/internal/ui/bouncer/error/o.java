package com.yandex.passport.internal.ui.bouncer.error;

import com.yandex.passport.R;
import com.yandex.passport.internal.ui.bouncer.q;
import com.yandex.passport.internal.ui.bouncer.t;
import com.yandex.passport.internal.ui.bouncer.v;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.vfc;
import defpackage.wls;
import defpackage.x4c;

/* loaded from: classes2.dex */
public abstract class o {
    public static final void a(v vVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1010336273);
        if ((((btsVar.k(vVar) ? 4 : 2) | i) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            t wishSource = vVar.getWishSource();
            k3r k3rVar = ljs0.c;
            sic a = qic.a(lr20.e, x4c.G, btsVar, 6);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, k3rVar);
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
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            btsVar.e0(1532196637);
            boolean e = btsVar.e(wishSource);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new q(wishSource, 2);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            com.yandex.passport.internal.ui.common.screen.c.b(true, (sls) Q, vfc.j(x4c.H, ljs0.c(c530.a, 1.0f)), ohb1.e(btsVar, R.string.passport_error_login_not_available), ohb1.e(btsVar, R.string.passport_am_choose_another_account), btsVar, 6, 0);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new n(vVar, i, 0);
        }
    }
}
