package com.yandex.passport.internal.ui.bouncer.loading;

import androidx.core.app.a1;
import com.yandex.passport.R;
import com.yandex.passport.common.ui.progress.p;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.ui.bouncer.model.a2;
import com.yandex.passport.internal.ui.bouncer.q;
import com.yandex.passport.internal.ui.bouncer.t;
import com.yandex.passport.internal.ui.bouncer.v;
import com.yandex.passport.sloth.ui.r;
import defpackage.a7u0;
import defpackage.agc;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bq11;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.dgc;
import defpackage.did;
import defpackage.eq11;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.o430;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.vqy0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zpn;

/* loaded from: classes2.dex */
public abstract class h {
    public static final void a(v vVar, a2 a2Var, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-301773506);
        int i2 = i | (btsVar.k(vVar) ? 4 : 2) | (btsVar.k(a2Var) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            t wishSource = vVar.getWishSource();
            r networkObserver = vVar.getNetworkObserver();
            com.yandex.passport.common.ui.progress.g progressProperties = vVar.getProgressProperties();
            Object[] objArr = new Object[0];
            btsVar.e0(-1597186988);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new a1(16);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            oz40 oz40Var = (oz40) cvw.V(objArr, (sls) Q, btsVar, 48);
            btsVar.e0(-1597185161);
            boolean k = ((i2 & 112) == 32) | btsVar.k(oz40Var);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new WaitConnectionContentKt$WaitConnectionContent$1$1(a2Var, oz40Var, null);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            zpn.e(btsVar, (wls) Q2, a2Var);
            btsVar.e0(-1597177867);
            boolean e = btsVar.e(networkObserver) | btsVar.e(wishSource);
            Object Q3 = btsVar.Q();
            if (e || Q3 == o430Var) {
                Q3 = new WaitConnectionContentKt$WaitConnectionContent$2$1(networkObserver, wishSource, null);
                btsVar.o0(Q3);
            }
            btsVar.t(false);
            zpn.e(btsVar, (wls) Q3, vVar);
            k3r k3rVar = ljs0.c;
            a7u0 a7u0Var = dgc.a;
            f530 b = m4m0.b(k3rVar, ((agc) btsVar.m(a7u0Var)).n, qke.q);
            sic a = qic.a(lr20.e, x4c.H, btsVar, 54);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b);
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
            c530 c530Var = c530.a;
            f530 o2 = an91.o(c530Var, 0.0f, 0.0f, 0.0f, 2.0f, 7);
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            p.c(progressProperties, o2, btsVar, 48, 0);
            vqy0.c(ohb1.e(btsVar, R.string.passport_webview_coonection_lost_error_text), an91.o(c530Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), ((agc) btsVar.m(a7u0Var)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar.m(eq11.a)).k, btsVar, 48, 0, 131064);
            btsVar = btsVar;
            btsVar.e0(-760467766);
            if (!((Boolean) oz40Var.getValue()).booleanValue() || a2Var.a) {
                z = false;
            } else {
                String e2 = ohb1.e(btsVar, R.string.passport_webview_back_button_text);
                btsVar.e0(-760461787);
                boolean e3 = btsVar.e(wishSource);
                Object Q4 = btsVar.Q();
                if (e3 || Q4 == o430Var) {
                    Q4 = new q(wishSource, 3);
                    btsVar.o0(Q4);
                }
                z = false;
                btsVar.t(false);
                u.g(384, 8, btsVar, (sls) Q4, ljs0.e(c530Var, 48.0f), e2, false);
            }
            btsVar.t(z);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(vVar, a2Var, i, 9);
        }
    }
}
