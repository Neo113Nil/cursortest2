package com.yandex.messaging.core.ui.utils;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.ic0;
import defpackage.n;
import defpackage.o430;
import defpackage.oz40;
import defpackage.qrm;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zpn;

/* loaded from: classes15.dex */
public abstract class a {
    public static final void a(tse tseVar, qrm qrmVar, sls slsVar) {
        tje.N(tseVar, null, null, new DsModalUtilsKt$dismissModalWithAnimation$2(qrmVar, null), 3).w(new ic0(19, slsVar));
    }

    public static final oz40 b(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(1833803877);
        Configuration configuration = (Configuration) btsVar.m(AndroidCompositionLocals_androidKt.a);
        btsVar.e0(-582002421);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = n.f(configuration.orientation == 2, btsVar);
        }
        oz40 oz40Var = (oz40) Q;
        btsVar.t(false);
        btsVar.e0(-581997841);
        boolean e = btsVar.e(configuration);
        Object Q2 = btsVar.Q();
        if (e || Q2 == o430Var) {
            Q2 = new LandscapeStateKt$isLandscapeState$1$1(configuration, oz40Var, null);
            btsVar.o0(Q2);
        }
        btsVar.t(false);
        zpn.e(btsVar, (wls) Q2, configuration);
        btsVar.t(false);
        return oz40Var;
    }
}
