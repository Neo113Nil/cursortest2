package com.yandex.passport.data.network;

import android.content.Context;
import com.yandex.passport.common.core.Environment;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class j4 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final Object g;
    public final Object h;

    public j4(mb mbVar, com.yandex.passport.internal.report.reporters.p pVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5) {
        this.a = 10;
        this.g = mbVar;
        this.h = pVar;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.f;
        yvf0 yvf0Var2 = this.e;
        yvf0 yvf0Var3 = this.d;
        yvf0 yvf0Var4 = this.c;
        yvf0 yvf0Var5 = this.b;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new i4((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var4.get(), (com.yandex.passport.internal.network.c) yvf0Var3.get(), (d4) yvf0Var2.get(), (h4) yvf0Var.get(), (c4) ((m) obj).get(), (com.yandex.passport.data.network.core.o) ((yvf0) obj2).get());
            case 1:
                return new o9((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var4.get(), (com.yandex.passport.internal.network.c) yvf0Var3.get(), (j9) yvf0Var2.get(), (n9) yvf0Var.get(), (i9) ((m) obj).get(), (com.yandex.passport.data.network.core.o) ((yvf0) obj2).get());
            case 2:
                return new lb((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var4.get(), (com.yandex.passport.internal.network.c) yvf0Var3.get(), (jb) yvf0Var2.get(), (kb) yvf0Var.get(), (ib) ((mb) obj).get(), (com.yandex.passport.data.network.core.o) ((yvf0) obj2).get());
            case 3:
                return new com.yandex.passport.data.network.token.h((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var4.get(), (com.yandex.passport.internal.network.c) yvf0Var3.get(), (com.yandex.passport.data.network.token.c) yvf0Var2.get(), (com.yandex.passport.data.network.token.g) yvf0Var.get(), (com.yandex.passport.data.network.token.b) ((nc) obj).get(), (com.yandex.passport.data.network.core.o) ((yvf0) obj2).get());
            case 4:
                return new com.yandex.passport.data.network.token.t((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var4.get(), (com.yandex.passport.internal.network.c) yvf0Var3.get(), (com.yandex.passport.data.network.token.o) yvf0Var2.get(), (com.yandex.passport.data.network.token.s) yvf0Var.get(), (com.yandex.passport.data.network.token.n) ((nc) obj).get(), (com.yandex.passport.data.network.core.o) ((yvf0) obj2).get());
            case 5:
                return new com.yandex.passport.data.network.token.f0((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var4.get(), (com.yandex.passport.internal.network.c) yvf0Var3.get(), (com.yandex.passport.data.network.token.a0) yvf0Var2.get(), (com.yandex.passport.data.network.token.e0) yvf0Var.get(), (com.yandex.passport.data.network.token.z) ((nc) obj).get(), (com.yandex.passport.data.network.core.o) ((yvf0) obj2).get());
            case 6:
                return new com.yandex.passport.data.network.token.r0((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var4.get(), (com.yandex.passport.internal.network.c) yvf0Var3.get(), (com.yandex.passport.data.network.token.m0) yvf0Var2.get(), (com.yandex.passport.data.network.token.q0) yvf0Var.get(), (com.yandex.passport.data.network.token.l0) ((nc) obj).get(), (com.yandex.passport.data.network.core.o) ((yvf0) obj2).get());
            case 7:
                com.yandex.passport.common.ui.lang.b bVar = (com.yandex.passport.common.ui.lang.b) yvf0Var5.get();
                com.yandex.passport.common.analytics.f fVar = (com.yandex.passport.common.analytics.f) yvf0Var4.get();
                com.yandex.passport.internal.common.j jVar = (com.yandex.passport.internal.common.j) ((xvf0) obj).get();
                com.yandex.passport.internal.network.e eVar = (com.yandex.passport.internal.network.e) yvf0Var3.get();
                com.yandex.passport.common.common.a aVar = (com.yandex.passport.common.common.a) yvf0Var2.get();
                com.yandex.passport.internal.credentials.d dVar = (com.yandex.passport.internal.credentials.d) yvf0Var.get();
                ((com.yandex.passport.internal.di.module.h) obj2).getClass();
                Environment environment = Environment.PRODUCTION;
                return new com.yandex.passport.internal.network.client.e(com.yandex.passport.internal.util.p.g(dVar.a, environment), environment, eVar, bVar, fVar, jVar, aVar);
            case 8:
                Context context = (Context) yvf0Var5.get();
                com.yandex.passport.common.analytics.f fVar2 = (com.yandex.passport.common.analytics.f) yvf0Var4.get();
                com.yandex.passport.internal.core.accounts.j jVar2 = (com.yandex.passport.internal.core.accounts.j) yvf0Var3.get();
                com.yandex.passport.internal.core.accounts.d dVar2 = (com.yandex.passport.internal.core.accounts.d) yvf0Var2.get();
                com.yandex.passport.internal.flags.experiments.g gVar = (com.yandex.passport.internal.flags.experiments.g) yvf0Var.get();
                com.yandex.passport.internal.network.mappers.h hVar = (com.yandex.passport.internal.network.mappers.h) ((yvf0) obj2).get();
                ((com.yandex.passport.internal.di.module.n) obj).getClass();
                return new com.yandex.passport.internal.util.e(context.getPackageName(), context.getPackageManager(), fVar2, jVar2, dVar2, gVar, hVar);
            case 9:
                Context context2 = (Context) yvf0Var5.get();
                com.yandex.passport.common.a aVar2 = (com.yandex.passport.common.a) yvf0Var4.get();
                com.yandex.passport.internal.flags.experiments.f fVar3 = (com.yandex.passport.internal.flags.experiments.f) yvf0Var3.get();
                com.yandex.passport.internal.report.reporters.a0 a0Var = (com.yandex.passport.internal.report.reporters.a0) yvf0Var2.get();
                com.yandex.passport.internal.report.g gVar2 = (com.yandex.passport.internal.report.g) yvf0Var.get();
                com.yandex.passport.internal.flags.experiments.b bVar2 = (com.yandex.passport.internal.flags.experiments.b) ((xvf0) obj).get();
                ((com.yandex.passport.internal.di.module.n) obj2).getClass();
                return new com.yandex.passport.internal.flags.experiments.g(aVar2, context2.getSharedPreferences("experiments", 0), fVar3, a0Var, gVar2, bVar2);
            default:
                return new com.yandex.passport.internal.sloth.performers.webcard.k((com.yandex.passport.internal.sloth.performers.webcard.a) ((mb) obj2).get(), (com.yandex.passport.internal.sloth.performers.webcard.b) ((com.yandex.passport.internal.report.reporters.p) obj).get(), (com.yandex.passport.internal.sloth.performers.d) yvf0Var5.get(), (com.yandex.passport.internal.sloth.performers.m) yvf0Var4.get(), (com.yandex.passport.internal.sloth.performers.b) yvf0Var3.get(), (com.yandex.passport.internal.sloth.performers.k) yvf0Var2.get(), (com.yandex.passport.internal.sloth.performers.p) yvf0Var.get());
        }
    }

    public /* synthetic */ j4(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, v7p v7pVar, yvf0 yvf0Var6, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.h = v7pVar;
        this.g = yvf0Var6;
    }

    public j4(com.yandex.passport.internal.di.module.h hVar, yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5) {
        this.a = 7;
        this.g = hVar;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.h = xvf0Var;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
    }

    public j4(com.yandex.passport.internal.di.module.n nVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, xvf0 xvf0Var) {
        this.a = 9;
        this.g = nVar;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.h = xvf0Var;
    }

    public j4(com.yandex.passport.internal.di.module.n nVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6) {
        this.a = 8;
        this.h = nVar;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
    }
}
