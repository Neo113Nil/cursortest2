package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.agc;
import defpackage.b64;
import defpackage.bms;
import defpackage.bq11;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.dgc;
import defpackage.eq11;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.uh6;
import defpackage.vqy0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public final class a implements bms {
    public final /* synthetic */ List a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;

    public a(float f, int i, List list) {
        this.a = list;
        this.b = f;
        this.c = i;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 48) == 0) {
            intValue2 |= fidVar.c(intValue) ? 32 : 16;
        }
        if ((intValue2 & 145) == 144) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        com.yandex.passport.internal.entities.k kVar = (com.yandex.passport.internal.entities.k) this.a.get(intValue);
        so5 so5Var = x4c.H;
        c530 c530Var = c530.a;
        float f = this.b;
        f530 q = ljs0.q(c530Var, f);
        sic a = qic.a(lr20.c, so5Var, fidVar, 48);
        int S = cma1.S(fidVar);
        bts btsVar2 = (bts) fidVar;
        r1b0 o = btsVar2.o();
        f530 d = androidx.compose.ui.b.d(fidVar, q);
        ohd.G1.getClass();
        sls slsVar = androidx.compose.ui.node.d.b;
        if (btsVar2.a == null) {
            cma1.b0();
            throw null;
        }
        btsVar2.i0();
        if (btsVar2.S) {
            btsVar2.n(slsVar);
        } else {
            btsVar2.r0();
        }
        qje.W(fidVar, androidx.compose.ui.node.d.f, a);
        qje.W(fidVar, androidx.compose.ui.node.d.e, o);
        wls wlsVar = androidx.compose.ui.node.d.g;
        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
            b64.z(S, btsVar2, S, wlsVar);
        }
        qje.W(fidVar, androidx.compose.ui.node.d.d, d);
        c.a(kVar.g, ljs0.m(c530Var, f), kVar.h.contains("has_plus"), fidVar, this.c, 0);
        oeb1.c(fidVar, ljs0.m(c530Var, 8.0f));
        String str = kVar.e;
        if (str == null) {
            str = "";
        }
        vqy0.c(str, null, ((agc) btsVar2.m(dgc.a)).a, uh6.E(12), null, 0L, null, uh6.E(14), 2, false, 1, 0, ((bq11) btsVar2.m(eq11.a)).l, fidVar, HProv.ALG_CLASS_DATA_ENCRYPT, 25008, 108522);
        btsVar2.t(true);
        return zy11.a;
    }
}
