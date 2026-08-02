package com.yandex.go.rida.bids.ui;

import defpackage.aq5;
import defpackage.bms;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.l95;
import defpackage.nq5;
import defpackage.oq5;
import defpackage.oz40;
import defpackage.pq5;
import defpackage.pz40;
import defpackage.sls;
import defpackage.sq5;
import defpackage.tls;
import defpackage.tq5;
import defpackage.tx40;
import defpackage.u4y;
import defpackage.vq5;
import defpackage.w511;
import defpackage.wls;
import defpackage.z5;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes13.dex */
public final class e implements bms {
    public final /* synthetic */ List a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ vq5 w;

    public e(List list, tls tlsVar, pz40 pz40Var, vq5 vq5Var) {
        this.a = list;
        this.b = tlsVar;
        this.c = pz40Var;
        this.w = vq5Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        float f;
        u4y u4yVar = (u4y) obj;
        int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= fidVar.c(intValue) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(i & 1, (i & 147) != 146);
        zy11 zy11Var = zy11.a;
        if (!V) {
            btsVar.Y();
            return zy11Var;
        }
        tq5 tq5Var = (tq5) this.a.get(intValue);
        btsVar.e0(-1389583911);
        f530 a = u4y.a(u4yVar, c530.a, 2);
        Object obj5 = this.b;
        boolean k = btsVar.k(obj5) | btsVar.k(tq5Var);
        Object Q = btsVar.Q();
        Object obj6 = did.a;
        if (k || Q == obj6) {
            Q = new z5(6, obj5, tq5Var);
            btsVar.o0(Q);
        }
        sls slsVar = (sls) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == obj6) {
            Q2 = androidx.compose.runtime.f.f(0.0f);
            btsVar.o0(Q2);
        }
        tx40 tx40Var = (tx40) Q2;
        Object Q3 = btsVar.Q();
        if (Q3 == obj6) {
            Q3 = androidx.compose.runtime.f.j(Boolean.FALSE);
            btsVar.o0(Q3);
        }
        oz40 oz40Var = (oz40) Q3;
        Boolean valueOf = Boolean.valueOf(tq5Var.c);
        boolean k2 = btsVar.k(tq5Var);
        Object Q4 = btsVar.Q();
        if (k2 || Q4 == obj6) {
            Q4 = new l95(14, tq5Var);
            btsVar.o0(Q4);
        }
        sls slsVar2 = (sls) Q4;
        boolean k3 = btsVar.k(slsVar);
        Object Q5 = btsVar.Q();
        if (k3 || Q5 == obj6) {
            Q5 = new BidsListKt$removeAnimation$2$1(tx40Var, oz40Var, slsVar, null);
            btsVar.o0(Q5);
        }
        wls wlsVar = (wls) Q5;
        boolean k4 = btsVar.k(slsVar);
        Object Q6 = btsVar.Q();
        if (k4 || Q6 == obj6) {
            Q6 = new nq5(0, slsVar, oz40Var);
            btsVar.o0(Q6);
        }
        com.yandex.go.rida.bids.utils.a.a(valueOf, slsVar2, wlsVar, (sls) Q6, btsVar, 0);
        Object Q7 = btsVar.Q();
        if (Q7 == obj6) {
            Q7 = new aq5(tx40Var, 1);
            btsVar.o0(Q7);
        }
        f530 a2 = androidx.compose.ui.graphics.d.a(a, (tls) Q7);
        pz40 pz40Var = this.c;
        boolean e = btsVar.e(pz40Var) | btsVar.k(tq5Var);
        Object Q8 = btsVar.Q();
        if (e || Q8 == obj6) {
            Q8 = new pq5(pz40Var, tq5Var, 0);
            btsVar.o0(Q8);
        }
        sls slsVar3 = (sls) Q8;
        boolean e2 = btsVar.e(pz40Var) | btsVar.k(tq5Var);
        Object Q9 = btsVar.Q();
        if (e2 || Q9 == obj6) {
            Q9 = new pq5(pz40Var, tq5Var, 1);
            btsVar.o0(Q9);
        }
        sls slsVar4 = (sls) Q9;
        Object Q10 = btsVar.Q();
        if (Q10 == obj6) {
            boolean booleanValue = ((Boolean) slsVar3.invoke()).booleanValue();
            if (booleanValue) {
                f = 1.0f;
            } else {
                if (booleanValue) {
                    w511.b();
                    return null;
                }
                f = 0.0f;
            }
            Q10 = androidx.compose.runtime.f.f(f);
            btsVar.o0(Q10);
        }
        tx40 tx40Var2 = (tx40) Q10;
        Object Q11 = btsVar.Q();
        if (Q11 == obj6) {
            Q11 = androidx.compose.runtime.f.j(Boolean.FALSE);
            btsVar.o0(Q11);
        }
        oz40 oz40Var2 = (oz40) Q11;
        Object Q12 = btsVar.Q();
        if (Q12 == obj6) {
            Q12 = new oq5(tx40Var2, 0);
            btsVar.o0(Q12);
        }
        sls slsVar5 = (sls) Q12;
        boolean k5 = btsVar.k(slsVar4);
        Object Q13 = btsVar.Q();
        if (k5 || Q13 == obj6) {
            Q13 = new BidsListKt$appearAnimation$2$1(tx40Var2, oz40Var2, slsVar4, null);
            btsVar.o0(Q13);
        }
        wls wlsVar2 = (wls) Q13;
        boolean k6 = btsVar.k(slsVar4);
        Object Q14 = btsVar.Q();
        if (k6 || Q14 == obj6) {
            Q14 = new nq5(1, slsVar4, oz40Var2);
            btsVar.o0(Q14);
        }
        com.yandex.go.rida.bids.utils.a.a(zy11Var, slsVar5, wlsVar2, (sls) Q14, btsVar, 54);
        Object Q15 = btsVar.Q();
        if (Q15 == obj6) {
            Q15 = new aq5(tx40Var2, 2);
            btsVar.o0(Q15);
        }
        sq5.d(tq5Var, this.w.b, androidx.compose.ui.graphics.d.a(a2, (tls) Q15), this.b, btsVar, 0);
        btsVar.t(false);
        return zy11Var;
    }
}
