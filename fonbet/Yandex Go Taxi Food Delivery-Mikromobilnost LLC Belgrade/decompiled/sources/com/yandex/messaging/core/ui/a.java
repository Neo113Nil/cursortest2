package com.yandex.messaging.core.ui;

import androidx.lifecycle.Lifecycle;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.iu30;
import defpackage.n3z;
import defpackage.pey;
import defpackage.tls;
import defpackage.tpr;
import defpackage.wls;
import defpackage.zpn;

/* loaded from: classes6.dex */
public abstract class a {
    public static final void a(tpr tprVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1269702664);
        int i2 = (btsVar.e(tprVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            pey peyVar = (pey) btsVar.m(n3z.a);
            Lifecycle lifecycle = peyVar.getLifecycle();
            btsVar.e0(191832833);
            boolean e = ((i2 & 112) == 32) | btsVar.e(peyVar) | btsVar.e(tprVar);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new ObserveAsEventsKt$ObserveAsEvents$1$1(peyVar, tprVar, tlsVar, null);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            zpn.f(tprVar, lifecycle, (wls) Q, btsVar);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(tprVar, tlsVar, i, 22);
        }
    }
}
