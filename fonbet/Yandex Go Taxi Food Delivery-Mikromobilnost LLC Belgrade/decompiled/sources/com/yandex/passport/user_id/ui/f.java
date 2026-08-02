package com.yandex.passport.user_id.ui;

import android.webkit.WebView;
import com.yandex.passport.internal.social.esia.k;
import com.yandex.passport.internal.ui.bouncer.error.n;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.x4c;
import defpackage.ymb1;

/* loaded from: classes2.dex */
public abstract class f {
    public static final void a(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2046431095);
        if ((((btsVar.k(f530Var) ? 4 : 2) | i) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 k = f530Var.k(ljs0.c);
            sic a = qic.a(lr20.e, x4c.H, btsVar, 54);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, k);
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
            btsVar.e0(-1493638442);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new c(0);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            androidx.compose.ui.viewinterop.b.a((tls) Q, ljs0.e(ljs0.q(c530.a, 80.0f), 80.0f), null, btsVar, 54, 4);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new n(f530Var, i, 7);
        }
    }

    public static final void b(f530 f530Var, WebView webView, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-459185950);
        if ((((btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.e(webView) ? 32 : 16)) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(404107065);
            boolean e = btsVar.e(webView);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new k(webView, 5);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            androidx.compose.ui.viewinterop.b.a((tls) Q, ymb1.m(f530Var), null, btsVar, 0, 4);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(f530Var, webView, i, 17);
        }
    }
}
