package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes15.dex */
public final class h implements v7p {
    public final /* synthetic */ int a;
    public final d b;
    public final xvf0 c;

    public /* synthetic */ h(d dVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = dVar;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                p pVar = (p) xvf0Var.get();
                dVar.getClass();
                return pVar;
            default:
                LoginProperties loginProperties = (LoginProperties) xvf0Var.get();
                dVar.getClass();
                return new com.yandex.passport.internal.ui.sloth.n(loginProperties.getHeaders());
        }
    }
}
