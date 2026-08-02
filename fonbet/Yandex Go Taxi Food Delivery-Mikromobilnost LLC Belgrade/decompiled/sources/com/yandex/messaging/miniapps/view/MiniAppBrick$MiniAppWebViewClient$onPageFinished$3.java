package com.yandex.messaging.miniapps.view;

import defpackage.ai91;
import defpackage.hdb1;
import defpackage.jjs0;
import defpackage.pzt0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public /* synthetic */ class MiniAppBrick$MiniAppWebViewClient$onPageFinished$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        hdb1 hdb1Var;
        jjs0 jjs0Var = (jjs0) obj;
        a aVar = (a) this.receiver;
        aVar.K = true;
        aVar.z.c("csat_miniapp_ready", "hasSize", Boolean.valueOf((jjs0Var != null ? jjs0Var.a : null) != null));
        pzt0 pzt0Var = aVar.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.M = null;
        ai91.c(aVar.E, false);
        ai91.f(aVar.D, false);
        if (jjs0Var != null && (hdb1Var = jjs0Var.a) != null && hdb1Var != null) {
            aVar.c.d(jjs0Var);
        }
        return zy11.a;
    }
}
