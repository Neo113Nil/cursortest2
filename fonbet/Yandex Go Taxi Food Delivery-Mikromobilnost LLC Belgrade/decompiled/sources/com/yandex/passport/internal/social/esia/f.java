package com.yandex.passport.internal.social.esia;

import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class f implements wls {
    public final /* synthetic */ EsiaBindActivity a;

    public f(EsiaBindActivity esiaBindActivity) {
        this.a = esiaBindActivity;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        i0 viewModel;
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        EsiaBindActivity esiaBindActivity = this.a;
        viewModel = esiaBindActivity.getViewModel();
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(2112207855);
        boolean e = btsVar2.e(esiaBindActivity);
        Object Q = btsVar2.Q();
        o430 o430Var = did.a;
        if (e || Q == o430Var) {
            Q = new b(esiaBindActivity, 1);
            btsVar2.o0(Q);
        }
        tls tlsVar = (tls) Q;
        btsVar2.t(false);
        btsVar2.e0(2112211107);
        boolean e2 = btsVar2.e(esiaBindActivity);
        Object Q2 = btsVar2.Q();
        if (e2 || Q2 == o430Var) {
            EsiaBindActivity$onCreate$1$1$2$1 esiaBindActivity$onCreate$1$1$2$1 = new EsiaBindActivity$onCreate$1$1$2$1(1, esiaBindActivity, EsiaBindActivity.class, "finishActivityWithResult", "finishActivityWithResult(Lcom/yandex/passport/internal/social/esia/EsiaBindViewModel$Result;)V", 0);
            btsVar2.o0(esiaBindActivity$onCreate$1$1$2$1);
            Q2 = esiaBindActivity$onCreate$1$1$2$1;
        }
        btsVar2.t(false);
        tls tlsVar2 = (tls) ((tfx) Q2);
        btsVar2.e0(2112212962);
        boolean e3 = btsVar2.e(esiaBindActivity);
        Object Q3 = btsVar2.Q();
        if (e3 || Q3 == o430Var) {
            EsiaBindActivity$onCreate$1$1$3$1 esiaBindActivity$onCreate$1$1$3$1 = new EsiaBindActivity$onCreate$1$1$3$1(1, esiaBindActivity, EsiaBindActivity.class, "finishActivityWithError", "finishActivityWithError(Ljava/lang/Throwable;)V", 0);
            btsVar2.o0(esiaBindActivity$onCreate$1$1$3$1);
            Q3 = esiaBindActivity$onCreate$1$1$3$1;
        }
        btsVar2.t(false);
        tls tlsVar3 = (tls) ((tfx) Q3);
        btsVar2.e0(2112215342);
        boolean e4 = btsVar2.e(esiaBindActivity);
        Object Q4 = btsVar2.Q();
        if (e4 || Q4 == o430Var) {
            Q4 = new a(esiaBindActivity, 3);
            btsVar2.o0(Q4);
        }
        sls slsVar = (sls) Q4;
        btsVar2.t(false);
        btsVar2.e0(2112225185);
        boolean e5 = btsVar2.e(esiaBindActivity);
        Object Q5 = btsVar2.Q();
        if (e5 || Q5 == o430Var) {
            Q5 = new a(esiaBindActivity, 4);
            btsVar2.o0(Q5);
        }
        btsVar2.t(false);
        m.a(viewModel, tlsVar, tlsVar2, tlsVar3, slsVar, (sls) Q5, btsVar2, 0);
        return zy11.a;
    }
}
