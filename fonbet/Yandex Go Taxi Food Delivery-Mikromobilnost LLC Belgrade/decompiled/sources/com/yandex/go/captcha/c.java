package com.yandex.go.captcha;

import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.zy11;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements sls {
    public final /* synthetic */ d a;

    public /* synthetic */ c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        d dVar = this.a;
        pzt0 pzt0Var = dVar.k;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.k = tje.N(dVar.h, null, null, new AuthChallengeActivityListener$onFirstContentfulPaint$1$1$1(dVar, null), 3);
        return zy11.a;
    }
}
