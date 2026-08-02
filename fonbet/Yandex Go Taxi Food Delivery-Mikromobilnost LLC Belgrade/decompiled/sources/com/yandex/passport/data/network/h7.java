package com.yandex.passport.data.network;

import android.content.Context;
import com.yandex.passport.internal.database.DatabaseHelper;
import defpackage.qxu0;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class h7 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final Object f;
    public final xvf0 g;

    public h7(yvf0 yvf0Var, yvf0 yvf0Var2, z1 z1Var, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5) {
        this.a = 9;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.g = z1Var;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.f;
        yvf0 yvf0Var = this.e;
        yvf0 yvf0Var2 = this.d;
        xvf0 xvf0Var = this.g;
        yvf0 yvf0Var3 = this.c;
        yvf0 yvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new g7((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (a7) ((m) xvf0Var).get(), (b7) yvf0Var.get(), (f7) ((yvf0) obj).get());
            case 1:
                return new t7((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (o7) yvf0Var.get(), (s7) ((yvf0) obj).get(), (n7) ((m) xvf0Var).get());
            case 2:
                return new com.yandex.passport.data.network.token.f1((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (com.yandex.passport.data.network.token.e1) yvf0Var.get(), (com.yandex.passport.data.network.token.a1) ((nc) xvf0Var).get(), (com.yandex.passport.data.network.core.o) ((yvf0) obj).get());
            case 3:
                return new com.yandex.passport.data.network.token.o1((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (com.yandex.passport.data.network.token.n1) yvf0Var.get(), (com.yandex.passport.data.network.token.j1) ((nc) xvf0Var).get(), (com.yandex.passport.data.network.core.o) ((yvf0) obj).get());
            case 4:
                com.yandex.passport.internal.database.auth_cookie.d dVar = (com.yandex.passport.internal.database.auth_cookie.d) xvf0Var.get();
                com.yandex.passport.common.coroutine.a aVar = (com.yandex.passport.common.coroutine.a) yvf0Var4.get();
                com.yandex.passport.internal.usecase.j jVar = (com.yandex.passport.internal.usecase.j) yvf0Var3.get();
                com.yandex.passport.internal.usecase.k kVar = (com.yandex.passport.internal.usecase.k) yvf0Var2.get();
                com.yandex.passport.internal.flags.j jVar2 = (com.yandex.passport.internal.flags.j) yvf0Var.get();
                ((com.yandex.passport.internal.di.module.e) obj).getClass();
                return new com.yandex.passport.internal.database.auth_cookie.a(dVar, aVar, jVar, kVar, jVar2);
            case 5:
                Context context = (Context) yvf0Var4.get();
                com.yandex.passport.internal.usecase.k kVar2 = (com.yandex.passport.internal.usecase.k) yvf0Var3.get();
                com.yandex.passport.internal.usecase.j jVar3 = (com.yandex.passport.internal.usecase.j) yvf0Var2.get();
                com.yandex.passport.internal.network.mappers.h hVar = (com.yandex.passport.internal.network.mappers.h) ((com.yandex.passport.internal.di.module.c) xvf0Var).get();
                com.yandex.passport.internal.flags.j jVar4 = (com.yandex.passport.internal.flags.j) yvf0Var.get();
                ((com.yandex.passport.internal.di.module.e) obj).getClass();
                return new DatabaseHelper(context, kVar2, jVar3, hVar, jVar4);
            case 6:
                return new com.yandex.passport.internal.flags.experiments.e((m2) yvf0Var4.get(), (com.yandex.passport.internal.flags.experiments.g) yvf0Var3.get(), (k) ((com.yandex.passport.common.coroutine.g) obj).get(), (com.yandex.passport.internal.report.reporters.b0) xvf0Var.get(), (com.yandex.passport.common.analytics.d) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
            case 7:
                return new com.yandex.passport.internal.rotation.c((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.internal.usecase.n0) yvf0Var3.get(), (com.yandex.passport.internal.usecase.f1) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.i0) ((xvf0) obj).get(), (com.yandex.passport.internal.rotation.g) ((mb) xvf0Var).get(), (com.yandex.passport.internal.credentials.d) yvf0Var.get());
            case 8:
                return new com.yandex.passport.internal.usecase.y((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var3.get(), (com.yandex.passport.internal.network.e) yvf0Var2.get(), (s) ((qxu0) xvf0Var).get(), (com.yandex.passport.internal.report.reporters.i) yvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) ((yvf0) obj).get());
            default:
                return new com.yandex.passport.internal.usecase.t1((Context) yvf0Var4.get(), (com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (ae) ((z1) xvf0Var).get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var2.get(), (com.yandex.passport.internal.core.accounts.a) yvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) ((yvf0) obj).get());
        }
    }

    public /* synthetic */ h7(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, v7p v7pVar, yvf0 yvf0Var5, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.g = v7pVar;
        this.f = yvf0Var5;
    }

    public h7(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, m mVar) {
        this.a = 1;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = mVar;
    }

    public h7(yvf0 yvf0Var, yvf0 yvf0Var2, com.yandex.passport.common.coroutine.g gVar, xvf0 xvf0Var, yvf0 yvf0Var3, yvf0 yvf0Var4) {
        this.a = 6;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.f = gVar;
        this.g = xvf0Var;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
    }

    public h7(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, xvf0 xvf0Var, mb mbVar, yvf0 yvf0Var4) {
        this.a = 7;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.f = xvf0Var;
        this.g = mbVar;
        this.e = yvf0Var4;
    }

    public /* synthetic */ h7(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, v7p v7pVar, yvf0 yvf0Var4, yvf0 yvf0Var5, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.g = v7pVar;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
    }

    public h7(com.yandex.passport.internal.di.module.e eVar, xvf0 xvf0Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4) {
        this.a = 4;
        this.f = eVar;
        this.g = xvf0Var;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
    }

    public h7(com.yandex.passport.internal.di.module.e eVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, com.yandex.passport.internal.di.module.c cVar, yvf0 yvf0Var4) {
        this.a = 5;
        this.f = eVar;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.g = cVar;
        this.e = yvf0Var4;
    }
}
