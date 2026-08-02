package com.yandex.go.information.presentation;

import defpackage.aii0;
import defpackage.apn0;
import defpackage.bts;
import defpackage.cdd;
import defpackage.cx20;
import defpackage.did;
import defpackage.fid;
import defpackage.jxq0;
import defpackage.ouv;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.ytv;
import defpackage.zpn;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class b {
    public static final void a(jxq0 jxq0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1636469975);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(jxq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ytv ytvVar = jxq0Var.h;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ServiceScreenKt$ServiceScreen$1$1(jxq0Var, tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, ytvVar);
            cdd.a.getClass();
            cx20.a(null, null, null, null, null, false, false, cdd.b, wwg.S(-1462539255, true, new ouv(jxq0Var, tlsVar, i3), btsVar), btsVar, 113246208, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(jxq0Var, tlsVar, i, 14);
        }
    }
}
