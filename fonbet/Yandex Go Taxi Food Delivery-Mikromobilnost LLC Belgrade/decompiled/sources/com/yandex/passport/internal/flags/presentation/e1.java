package com.yandex.passport.internal.flags.presentation;

import com.yandex.passport.common.core.Environment;
import defpackage.agc;
import defpackage.an91;
import defpackage.b64;
import defpackage.bq11;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.dgc;
import defpackage.did;
import defpackage.dmw0;
import defpackage.eq11;
import defpackage.f530;
import defpackage.fid;
import defpackage.g43;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.o7b1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.tls;
import defpackage.vqy0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class e1 implements zls {
    public final /* synthetic */ sls a;
    public final /* synthetic */ tls b;

    public e1(sls slsVar, tls tlsVar) {
        this.a = slsVar;
        this.b = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        if ((((Number) obj3).intValue() & 17) == 16) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        c530 c530Var = c530.a;
        f530 k = an91.k(ljs0.c(c530Var, 1.0f), 16.0f);
        so5 so5Var = x4c.G;
        g43 g43Var = lr20.c;
        sic a = qic.a(g43Var, so5Var, fidVar, 0);
        int S = cma1.S(fidVar);
        bts btsVar2 = (bts) fidVar;
        dmw0 dmw0Var = btsVar2.a;
        r1b0 o = btsVar2.o();
        f530 d = androidx.compose.ui.b.d(fidVar, k);
        ohd.G1.getClass();
        sls slsVar = androidx.compose.ui.node.d.b;
        if (dmw0Var == null) {
            cma1.b0();
            throw null;
        }
        btsVar2.i0();
        if (btsVar2.S) {
            btsVar2.n(slsVar);
        } else {
            btsVar2.r0();
        }
        wls wlsVar = androidx.compose.ui.node.d.f;
        qje.W(fidVar, wlsVar, a);
        wls wlsVar2 = androidx.compose.ui.node.d.e;
        qje.W(fidVar, wlsVar2, o);
        wls wlsVar3 = androidx.compose.ui.node.d.g;
        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
            b64.z(S, btsVar2, S, wlsVar3);
        }
        wls wlsVar4 = androidx.compose.ui.node.d.d;
        qje.W(fidVar, wlsVar4, d);
        vqy0.c("Update network cache. Please select environment to continue.", null, ((agc) btsVar2.m(dgc.a)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar2.m(eq11.a)).k, fidVar, 6, 0, 131066);
        btsVar2.e0(734277949);
        Object Q = btsVar2.Q();
        Object obj4 = did.a;
        if (Q == obj4) {
            Q = androidx.compose.runtime.f.j(Environment.PRODUCTION);
            btsVar2.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        btsVar2.t(false);
        f530 d2 = o7b1.d(c530Var);
        sic a2 = qic.a(g43Var, so5Var, fidVar, 0);
        int S2 = cma1.S(fidVar);
        r1b0 o2 = btsVar2.o();
        f530 d3 = androidx.compose.ui.b.d(fidVar, d2);
        btsVar2.i0();
        if (btsVar2.S) {
            btsVar2.n(slsVar);
        } else {
            btsVar2.r0();
        }
        qje.W(fidVar, wlsVar, a2);
        qje.W(fidVar, wlsVar2, o2);
        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S2))) {
            b64.z(S2, btsVar2, S2, wlsVar3);
        }
        qje.W(fidVar, wlsVar4, d3);
        btsVar2.e0(1288647820);
        for (Object obj5 : scc.g(Environment.PRODUCTION, Environment.TESTING)) {
            boolean z = ((Environment) oz40Var.getValue()) == obj5;
            String obj6 = obj5.toString();
            btsVar2.e0(1864018660);
            boolean k2 = btsVar2.k(obj5);
            Object Q2 = btsVar2.Q();
            if (k2 || Q2 == obj4) {
                Q2 = new l(4, obj5, oz40Var);
                btsVar2.o0(Q2);
            }
            btsVar2.t(false);
            c1.i(0, fidVar, (sls) Q2, null, obj6, z);
        }
        btsVar2.t(false);
        btsVar2.t(true);
        f530 c = ljs0.c(c530Var, 1.0f);
        lhl0 a3 = khl0.a(lr20.b, x4c.D, fidVar, 6);
        int S3 = cma1.S(fidVar);
        r1b0 o3 = btsVar2.o();
        f530 d4 = androidx.compose.ui.b.d(fidVar, c);
        ohd.G1.getClass();
        sls slsVar2 = androidx.compose.ui.node.d.b;
        btsVar2.i0();
        if (btsVar2.S) {
            btsVar2.n(slsVar2);
        } else {
            btsVar2.r0();
        }
        qje.W(fidVar, androidx.compose.ui.node.d.f, a3);
        qje.W(fidVar, androidx.compose.ui.node.d.e, o3);
        wls wlsVar5 = androidx.compose.ui.node.d.g;
        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S3))) {
            b64.z(S3, btsVar2, S3, wlsVar5);
        }
        qje.W(fidVar, androidx.compose.ui.node.d.d, d4);
        btsVar2.e0(1288663839);
        sls slsVar3 = this.a;
        boolean k3 = btsVar2.k(slsVar3);
        Object Q3 = btsVar2.Q();
        if (k3 || Q3 == obj4) {
            Q3 = new k(6, slsVar3);
            btsVar2.o0(Q3);
        }
        btsVar2.t(false);
        j.a.getClass();
        androidx.compose.material3.a.f((sls) Q3, null, false, null, null, null, j.b, fidVar, 805306368, 510);
        btsVar2.e0(1288674827);
        tls tlsVar = this.b;
        boolean k4 = btsVar2.k(tlsVar);
        Object Q4 = btsVar2.Q();
        if (k4 || Q4 == obj4) {
            Q4 = new q(tlsVar, oz40Var, 1);
            btsVar2.o0(Q4);
        }
        btsVar2.t(false);
        androidx.compose.material3.a.f((sls) Q4, null, false, null, null, null, j.c, fidVar, 805306368, 510);
        btsVar2.t(true);
        btsVar2.t(true);
        return zy11.a;
    }
}
