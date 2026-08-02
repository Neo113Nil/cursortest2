package com.yandex.messaging.activity;

import android.content.Context;
import defpackage.fcg;
import defpackage.mt11;
import defpackage.onp0;
import defpackage.q5z;
import defpackage.sae;
import defpackage.sls;
import defpackage.tje;
import defpackage.ub61;
import defpackage.vse;
import defpackage.z8g;

/* loaded from: classes15.dex */
public final /* synthetic */ class c implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        Context context = onp0.a;
        Context context2 = mt11.a;
        if (context2 == null) {
            context2 = null;
        }
        sae saeVar = new sae(19, ((z8g) onp0.a(context2)).b);
        fcg fcgVar = new fcg(saeVar);
        ub61 ub61Var = ub61.a;
        ub61.b = (com.yandex.messaging.internal.avatar.b) fcgVar.d.get();
        vse v = saeVar.v();
        q5z.h(v);
        tje.N(v.c(false), null, null, new UiSdkComponentHolder$init$1$1(fcgVar, null), 3);
        return fcgVar;
    }
}
