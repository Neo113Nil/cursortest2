package com.yandex.passport.internal.di.module;

import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes8.dex */
public final class b implements v7p {
    public final /* synthetic */ int a;
    public final a b;
    public final xvf0 c;

    public /* synthetic */ b(a aVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = aVar;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.internal.common.b bVar = (com.yandex.passport.internal.common.b) xvf0Var.get();
                aVar.getClass();
                return bVar;
            case 1:
                com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) xvf0Var.get();
                aVar.getClass();
                return eVar;
            case 2:
                com.yandex.passport.internal.common.f fVar = (com.yandex.passport.internal.common.f) xvf0Var.get();
                aVar.getClass();
                return fVar;
            case 3:
                com.yandex.passport.internal.common.h hVar = (com.yandex.passport.internal.common.h) xvf0Var.get();
                aVar.getClass();
                return hVar;
            default:
                com.yandex.passport.internal.ui.lang.a aVar2 = (com.yandex.passport.internal.ui.lang.a) xvf0Var.get();
                aVar.getClass();
                return aVar2;
        }
    }
}
