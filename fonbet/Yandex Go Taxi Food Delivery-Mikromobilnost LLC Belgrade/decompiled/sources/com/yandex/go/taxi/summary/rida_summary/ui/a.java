package com.yandex.go.taxi.summary.rida_summary.ui;

import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.dpa1;
import defpackage.fid;
import defpackage.mr1;
import defpackage.tls;
import defpackage.u7k0;
import defpackage.wls;
import defpackage.yt40;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(u7k0 u7k0Var, boolean z, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1924158671);
        int i2 = (btsVar.k(u7k0Var) ? 4 : 2) | i | (btsVar.a(z) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            dpa1.a(u7k0Var, com.yandex.go.design.compose.modal.utils.a.a(z, null, btsVar, (i2 >> 3) & 14, 6), tlsVar, btsVar, i2 & 910);
            b(tlsVar, btsVar, (i2 >> 6) & 14);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(u7k0Var, z, tlsVar, i, 20);
        }
    }

    public static final void b(tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1359627792);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new RidaSummaryScreenKt$TrackScreenScopeEffect$1$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yt40(i, 1, tlsVar);
        }
    }
}
