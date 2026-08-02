package com.yandex.passport.internal.ui.bouncer.fallback;

import com.yandex.passport.internal.flags.presentation.v0;
import com.yandex.passport.internal.report.reporters.n;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.bouncer.t;
import com.yandex.passport.internal.ui.bouncer.v;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.kla1;
import defpackage.o430;
import defpackage.tls;
import defpackage.wls;
import defpackage.yd00;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void a(v vVar, w1 w1Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(922071603);
        if ((((btsVar.k(vVar) ? 4 : 2) | i | (btsVar.e(w1Var) ? 32 : 16)) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            t wishSource = vVar.getWishSource();
            n reporter = vVar.getReporter();
            b bVar = new b();
            btsVar.e0(1484403656);
            boolean e = btsVar.e(reporter) | btsVar.e(w1Var) | btsVar.e(wishSource);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new v0(2, reporter, w1Var, wishSource);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            yd00 e2 = kla1.e(bVar, (tls) Q, btsVar, 0);
            btsVar.e0(1484418730);
            boolean e3 = btsVar.e(reporter) | btsVar.e(w1Var) | btsVar.e(e2);
            Object Q2 = btsVar.Q();
            if (e3 || Q2 == o430Var) {
                Q2 = new FallbackContentKt$FallbackContent$1$1(reporter, w1Var, e2, null);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            zpn.e(btsVar, (wls) Q2, zy11.a);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(vVar, w1Var, i, 8);
        }
    }
}
