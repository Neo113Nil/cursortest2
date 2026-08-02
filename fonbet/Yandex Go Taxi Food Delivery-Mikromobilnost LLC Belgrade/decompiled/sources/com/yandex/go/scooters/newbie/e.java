package com.yandex.go.scooters.newbie;

import defpackage.bts;
import defpackage.cx20;
import defpackage.cz20;
import defpackage.did;
import defpackage.f2o0;
import defpackage.fid;
import defpackage.m94;
import defpackage.o430;
import defpackage.sls;
import defpackage.tls;
import defpackage.tnb1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.z9b;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final class e implements wls {
    public final /* synthetic */ tls a;
    public final /* synthetic */ f2o0 b;

    public e(tls tlsVar, f2o0 f2o0Var) {
        this.a = tlsVar;
        this.b = f2o0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fid fidVar = (fid) obj;
        int intValue = ((Number) obj2).intValue();
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(intValue & 1, (intValue & 3) != 2);
        zy11 zy11Var = zy11.a;
        if (!V) {
            btsVar.Y();
            return zy11Var;
        }
        btsVar.e0(-1930811611);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = m94.R;
            btsVar.o0(Q);
        }
        cz20 e = tnb1.e(null, (sls) Q, btsVar, 5);
        f2o0 f2o0Var = this.b;
        tls tlsVar = this.a;
        cx20.a(null, null, e, null, null, false, false, null, wwg.S(-1602768029, true, new z9b(14, f2o0Var, tlsVar), btsVar), btsVar, 100859904, 219);
        boolean k = btsVar.k(tlsVar);
        Object Q2 = btsVar.Q();
        if (k || Q2 == o430Var) {
            Q2 = new ScootersNewbieScreenKt$ScootersNewbieScreen$1$3$1(tlsVar, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, zy11Var);
        btsVar.t(false);
        return zy11Var;
    }
}
