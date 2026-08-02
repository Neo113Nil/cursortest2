package com.yandex.go.scooters.subscription.upsale_on_book.info;

import androidx.compose.ui.node.d;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.j4b1;
import defpackage.lr20;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.wxo0;
import defpackage.x4c;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final class b implements zls {
    public final /* synthetic */ tls a;
    public final /* synthetic */ wxo0 b;

    public b(tls tlsVar, wxo0 wxo0Var) {
        this.a = tlsVar;
        this.b = wxo0Var;
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
        sls slsVar = d.b;
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
        qje.W(btsVar, d.f, a);
        qje.W(btsVar, d.e, o);
        qje.W(btsVar, d.g, Integer.valueOf(hashCode));
        qje.M(btsVar, d.h);
        qje.W(btsVar, d.d, d);
        wxo0 wxo0Var = this.b;
        j4b1.b(wxo0Var, btsVar, 0);
        tls tlsVar = this.a;
        j4b1.a(wxo0Var, tlsVar, btsVar, 0);
        btsVar.t(true);
        boolean k = btsVar.k(tlsVar);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new ScootersSubscriptionPurchaseInfoScreenKt$ScootersSubscriptionPurchaseInfoScreen$1$1$2$1(tlsVar, null);
            btsVar.o0(Q);
        }
        zpn.e(btsVar, (wls) Q, zy11Var);
        return zy11Var;
    }
}
