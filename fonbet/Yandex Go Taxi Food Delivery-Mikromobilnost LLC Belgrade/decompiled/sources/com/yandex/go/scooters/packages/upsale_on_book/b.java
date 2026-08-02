package com.yandex.go.scooters.packages.upsale_on_book;

import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.lr20;
import defpackage.ohd;
import defpackage.pao0;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yao0;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final class b implements zls {
    public final /* synthetic */ tls a;
    public final /* synthetic */ yao0 b;

    public b(tls tlsVar, yao0 yao0Var) {
        this.a = tlsVar;
        this.b = yao0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(intValue & 1, (intValue & 17) != 16);
        zy11 zy11Var = zy11.a;
        if (!V) {
            btsVar.Y();
            return zy11Var;
        }
        sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
        int hashCode = Long.hashCode(btsVar.T);
        r1b0 o = btsVar.o();
        f530 d = androidx.compose.ui.b.d(btsVar, c530.a);
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
        qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
        qje.M(btsVar, androidx.compose.ui.node.d.h);
        qje.W(btsVar, androidx.compose.ui.node.d.d, d);
        yao0 yao0Var = this.b;
        tls tlsVar = this.a;
        pao0.j(yao0Var, tlsVar, btsVar, 0);
        pao0.b(yao0Var, tlsVar, btsVar, 0);
        btsVar.t(true);
        boolean k = btsVar.k(tlsVar);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new ScootersPackagesUpsaleOnBookScreenKt$ScootersPackagesUpsaleOnBookScreen$1$2$2$1(tlsVar, null);
            btsVar.o0(Q);
        }
        zpn.e(btsVar, (wls) Q, zy11Var);
        return zy11Var;
    }
}
