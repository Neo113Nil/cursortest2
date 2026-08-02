package com.yandex.go.scooters.parking;

import defpackage.bco0;
import defpackage.bpn0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cco0;
import defpackage.cma1;
import defpackage.did;
import defpackage.dqt;
import defpackage.eco0;
import defpackage.f530;
import defpackage.fid;
import defpackage.lr20;
import defpackage.o430;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.z5;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final class c implements zls {
    public final /* synthetic */ tls a;
    public final /* synthetic */ eco0 b;
    public final /* synthetic */ dqt c;

    public c(tls tlsVar, eco0 eco0Var, dqt dqtVar) {
        this.a = tlsVar;
        this.b = eco0Var;
        this.c = dqtVar;
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
        eco0 eco0Var = this.b;
        d.h(eco0Var.a, btsVar, 0);
        cco0 cco0Var = eco0Var.d;
        bco0 bco0Var = cco0Var instanceof bco0 ? (bco0) cco0Var : null;
        if (bco0Var != null) {
            btsVar.e0(-103835079);
            d.d(bco0Var.b, wwg.S(-1114878982, true, new bpn0(6, bco0Var, this.c), btsVar), btsVar, 48);
            btsVar.t(false);
        } else {
            btsVar.e0(-103696695);
            btsVar.t(false);
        }
        d.g(eco0Var.c, btsVar, 0);
        String str = (String) eco0Var.b.b;
        tls tlsVar = this.a;
        boolean k = btsVar.k(tlsVar) | btsVar.e(eco0Var);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (k || Q == o430Var) {
            Q = new z5(22, tlsVar, eco0Var);
            btsVar.o0(Q);
        }
        d.a(str, (sls) Q, btsVar, 0);
        btsVar.t(true);
        boolean k2 = btsVar.k(tlsVar) | btsVar.e(eco0Var);
        Object Q2 = btsVar.Q();
        if (k2 || Q2 == o430Var) {
            Q2 = new ScootersParkingScreenKt$ScootersParkingScreen$1$1$2$1(tlsVar, eco0Var, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, zy11Var);
        return zy11Var;
    }
}
