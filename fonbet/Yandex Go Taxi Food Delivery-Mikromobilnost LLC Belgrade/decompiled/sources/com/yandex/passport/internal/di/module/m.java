package com.yandex.passport.internal.di.module;

import com.yandex.passport.common.core.Environment;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class m implements v7p {
    public final /* synthetic */ int a;
    public final h b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;

    public /* synthetic */ m(h hVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, int i) {
        this.a = i;
        this.b = hVar;
        this.c = yvf0Var;
        this.d = yvf0Var2;
        this.e = yvf0Var3;
        this.f = yvf0Var4;
        this.g = yvf0Var5;
        this.h = yvf0Var6;
        this.i = yvf0Var7;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.i;
        yvf0 yvf0Var2 = this.h;
        yvf0 yvf0Var3 = this.g;
        yvf0 yvf0Var4 = this.f;
        yvf0 yvf0Var5 = this.e;
        yvf0 yvf0Var6 = this.d;
        yvf0 yvf0Var7 = this.c;
        h hVar = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.common.ui.lang.b bVar = (com.yandex.passport.common.ui.lang.b) yvf0Var7.get();
                com.yandex.passport.common.analytics.f fVar = (com.yandex.passport.common.analytics.f) yvf0Var6.get();
                com.yandex.passport.internal.common.j jVar = (com.yandex.passport.internal.common.j) yvf0Var5.get();
                com.yandex.passport.internal.network.e eVar = (com.yandex.passport.internal.network.e) yvf0Var4.get();
                com.yandex.passport.common.common.a aVar = (com.yandex.passport.common.common.a) yvf0Var3.get();
                com.yandex.passport.internal.credentials.d dVar = (com.yandex.passport.internal.credentials.d) yvf0Var2.get();
                hVar.getClass();
                Environment environment = Environment.RC;
                return new com.yandex.passport.internal.network.client.e(com.yandex.passport.internal.util.p.g(dVar.a, environment), environment, eVar, bVar, fVar, jVar, aVar);
            case 1:
                com.yandex.passport.common.ui.lang.b bVar2 = (com.yandex.passport.common.ui.lang.b) yvf0Var7.get();
                com.yandex.passport.common.analytics.f fVar2 = (com.yandex.passport.common.analytics.f) yvf0Var6.get();
                com.yandex.passport.internal.common.j jVar2 = (com.yandex.passport.internal.common.j) yvf0Var5.get();
                com.yandex.passport.internal.network.e eVar2 = (com.yandex.passport.internal.network.e) yvf0Var4.get();
                com.yandex.passport.common.common.a aVar2 = (com.yandex.passport.common.common.a) yvf0Var3.get();
                com.yandex.passport.internal.credentials.d dVar2 = (com.yandex.passport.internal.credentials.d) yvf0Var2.get();
                hVar.getClass();
                Environment environment2 = Environment.TEAM_PRODUCTION;
                return new com.yandex.passport.internal.network.client.e(com.yandex.passport.internal.util.p.g(dVar2.a, environment2), environment2, eVar2, bVar2, fVar2, jVar2, aVar2);
            case 2:
                com.yandex.passport.common.ui.lang.b bVar3 = (com.yandex.passport.common.ui.lang.b) yvf0Var7.get();
                com.yandex.passport.common.analytics.f fVar3 = (com.yandex.passport.common.analytics.f) yvf0Var6.get();
                com.yandex.passport.internal.common.j jVar3 = (com.yandex.passport.internal.common.j) yvf0Var5.get();
                com.yandex.passport.internal.network.e eVar3 = (com.yandex.passport.internal.network.e) yvf0Var4.get();
                com.yandex.passport.common.common.a aVar3 = (com.yandex.passport.common.common.a) yvf0Var3.get();
                com.yandex.passport.internal.credentials.d dVar3 = (com.yandex.passport.internal.credentials.d) yvf0Var2.get();
                hVar.getClass();
                Environment environment3 = Environment.TEAM_TESTING;
                return new com.yandex.passport.internal.network.client.e(com.yandex.passport.internal.util.p.g(dVar3.a, environment3), environment3, eVar3, bVar3, fVar3, jVar3, aVar3);
            default:
                com.yandex.passport.common.ui.lang.b bVar4 = (com.yandex.passport.common.ui.lang.b) yvf0Var7.get();
                com.yandex.passport.common.analytics.f fVar4 = (com.yandex.passport.common.analytics.f) yvf0Var6.get();
                com.yandex.passport.internal.common.j jVar4 = (com.yandex.passport.internal.common.j) yvf0Var5.get();
                com.yandex.passport.internal.network.e eVar4 = (com.yandex.passport.internal.network.e) yvf0Var4.get();
                com.yandex.passport.common.common.a aVar4 = (com.yandex.passport.common.common.a) yvf0Var3.get();
                com.yandex.passport.internal.credentials.d dVar4 = (com.yandex.passport.internal.credentials.d) yvf0Var2.get();
                hVar.getClass();
                Environment environment4 = Environment.TESTING;
                return new com.yandex.passport.internal.network.client.e(com.yandex.passport.internal.util.p.g(dVar4.a, environment4), environment4, eVar4, bVar4, fVar4, jVar4, aVar4);
        }
    }
}
