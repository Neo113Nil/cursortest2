package com.yandex.passport.internal.di.module;

import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes8.dex */
public final class i implements v7p {
    public final /* synthetic */ int a;
    public final h b;
    public final xvf0 c;

    public /* synthetic */ i(h hVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = hVar;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        h hVar = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.internal.report.reporters.i iVar = (com.yandex.passport.internal.report.reporters.i) xvf0Var.get();
                hVar.getClass();
                return iVar;
            default:
                com.yandex.passport.internal.network.n nVar = (com.yandex.passport.internal.network.n) xvf0Var.get();
                hVar.getClass();
                return nVar;
        }
    }
}
