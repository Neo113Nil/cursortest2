package com.yandex.passport.internal.di.module;

import com.yandex.passport.internal.report.nd;
import defpackage.sbx;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes8.dex */
public final class r implements v7p {
    public final /* synthetic */ int a;
    public final n b;
    public final xvf0 c;

    public /* synthetic */ r(n nVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = nVar;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        n nVar = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.internal.provider.communication.k kVar = (com.yandex.passport.internal.provider.communication.k) xvf0Var.get();
                nVar.getClass();
                return kVar;
            case 1:
                nd ndVar = (nd) xvf0Var.get();
                nVar.getClass();
                return ndVar;
            default:
                sbx sbxVar = (sbx) xvf0Var.get();
                nVar.getClass();
                return new com.yandex.passport.data.mapper.a(sbxVar);
        }
    }
}
