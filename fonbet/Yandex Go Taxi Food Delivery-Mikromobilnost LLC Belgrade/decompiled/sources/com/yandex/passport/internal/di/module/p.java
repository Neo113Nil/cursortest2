package com.yandex.passport.internal.di.module;

import android.content.Context;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class p implements v7p {
    public final /* synthetic */ int a = 1;
    public final n b;
    public final yvf0 c;
    public final xvf0 d;
    public final yvf0 e;

    public p(n nVar, yvf0 yvf0Var, xvf0 xvf0Var, yvf0 yvf0Var2) {
        this.b = nVar;
        this.c = yvf0Var;
        this.d = xvf0Var;
        this.e = yvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.e;
        xvf0 xvf0Var = this.d;
        yvf0 yvf0Var2 = this.c;
        n nVar = this.b;
        switch (i) {
            case 0:
                Context context = (Context) yvf0Var2.get();
                com.yandex.passport.common.coroutine.a aVar = (com.yandex.passport.common.coroutine.a) xvf0Var.get();
                nVar.getClass();
                return new com.yandex.passport.common.analytics.d(context, aVar);
            default:
                Context context2 = (Context) yvf0Var2.get();
                com.yandex.passport.common.analytics.d dVar = (com.yandex.passport.common.analytics.d) xvf0Var.get();
                com.yandex.passport.internal.properties.p pVar = (com.yandex.passport.internal.properties.p) yvf0Var.get();
                nVar.getClass();
                return new com.yandex.passport.common.analytics.f(context2, dVar, pVar.g, pVar.f);
        }
    }

    public p(n nVar, yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var) {
        this.b = nVar;
        this.c = yvf0Var;
        this.e = yvf0Var2;
        this.d = xvf0Var;
    }
}
