package com.yandex.go.call_order_fallback.ui;

import defpackage.aii0;
import defpackage.bgc;
import defpackage.bts;
import defpackage.cx20;
import defpackage.did;
import defpackage.fid;
import defpackage.mj5;
import defpackage.o430;
import defpackage.sls;
import defpackage.sp5;
import defpackage.tj7;
import defpackage.tls;
import defpackage.tnb1;
import defpackage.wg0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(tj7 tj7Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1516638510);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(tj7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new bgc(12);
                btsVar.o0(Q);
            }
            cx20.a(null, null, tnb1.e(null, (sls) Q, btsVar, 5), null, null, false, false, wwg.S(-1960692932, true, new wg0(3, tlsVar), btsVar), wwg.S(1518923524, true, new sp5(6, tlsVar, tj7Var), btsVar), btsVar, 113246208, HProv.PP_PASSWD_TERM);
            boolean z = (i3 & 112) == 32;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new CallOrderFallbackScreenKt$CallOrderFallbackScreen$4$1(tlsVar, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, zy11.a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(tj7Var, tlsVar, i, 12);
        }
    }
}
