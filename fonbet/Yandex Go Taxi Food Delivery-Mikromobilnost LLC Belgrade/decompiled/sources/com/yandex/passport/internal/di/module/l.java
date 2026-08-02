package com.yandex.passport.internal.di.module;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.network.u;
import com.yandex.passport.internal.analytics.w;
import defpackage.v7p;
import defpackage.yvf0;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class l implements v7p {
    public final /* synthetic */ int a;
    public final h b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;
    public final yvf0 j;

    public /* synthetic */ l(h hVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, int i) {
        this.a = i;
        this.b = hVar;
        this.c = yvf0Var;
        this.d = yvf0Var2;
        this.e = yvf0Var3;
        this.f = yvf0Var4;
        this.g = yvf0Var5;
        this.h = yvf0Var6;
        this.i = yvf0Var7;
        this.j = yvf0Var8;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.j;
        yvf0 yvf0Var2 = this.i;
        yvf0 yvf0Var3 = this.h;
        yvf0 yvf0Var4 = this.g;
        yvf0 yvf0Var5 = this.f;
        yvf0 yvf0Var6 = this.e;
        yvf0 yvf0Var7 = this.d;
        yvf0 yvf0Var8 = this.c;
        h hVar = this.b;
        switch (i) {
            case 0:
                OkHttpClient okHttpClient = (OkHttpClient) yvf0Var8.get();
                com.yandex.passport.internal.network.e eVar = (com.yandex.passport.internal.network.e) yvf0Var7.get();
                com.yandex.passport.internal.network.a aVar = (com.yandex.passport.internal.network.a) yvf0Var6.get();
                w wVar = (w) yvf0Var5.get();
                com.yandex.passport.common.analytics.f fVar = (com.yandex.passport.common.analytics.f) yvf0Var4.get();
                com.yandex.passport.internal.e eVar2 = (com.yandex.passport.internal.e) yvf0Var3.get();
                com.yandex.passport.common.common.a aVar2 = (com.yandex.passport.common.common.a) yvf0Var2.get();
                com.yandex.passport.internal.credentials.d dVar = (com.yandex.passport.internal.credentials.d) yvf0Var.get();
                hVar.getClass();
                Environment environment = Environment.RC;
                return new com.yandex.passport.internal.network.client.a(okHttpClient, new u(environment, eVar), com.yandex.passport.internal.util.p.g(dVar.a, environment), aVar, wVar, fVar, eVar2, aVar2);
            case 1:
                OkHttpClient okHttpClient2 = (OkHttpClient) yvf0Var8.get();
                com.yandex.passport.internal.network.e eVar3 = (com.yandex.passport.internal.network.e) yvf0Var7.get();
                com.yandex.passport.internal.network.a aVar3 = (com.yandex.passport.internal.network.a) yvf0Var6.get();
                w wVar2 = (w) yvf0Var5.get();
                com.yandex.passport.common.analytics.f fVar2 = (com.yandex.passport.common.analytics.f) yvf0Var4.get();
                com.yandex.passport.internal.e eVar4 = (com.yandex.passport.internal.e) yvf0Var3.get();
                com.yandex.passport.common.common.a aVar4 = (com.yandex.passport.common.common.a) yvf0Var2.get();
                com.yandex.passport.internal.credentials.d dVar2 = (com.yandex.passport.internal.credentials.d) yvf0Var.get();
                hVar.getClass();
                Environment environment2 = Environment.TEAM_PRODUCTION;
                return new com.yandex.passport.internal.network.client.a(okHttpClient2, new u(environment2, eVar3), com.yandex.passport.internal.util.p.g(dVar2.a, environment2), aVar3, wVar2, fVar2, eVar4, aVar4);
            case 2:
                OkHttpClient okHttpClient3 = (OkHttpClient) yvf0Var8.get();
                com.yandex.passport.internal.network.e eVar5 = (com.yandex.passport.internal.network.e) yvf0Var7.get();
                com.yandex.passport.internal.network.a aVar5 = (com.yandex.passport.internal.network.a) yvf0Var6.get();
                w wVar3 = (w) yvf0Var5.get();
                com.yandex.passport.common.analytics.f fVar3 = (com.yandex.passport.common.analytics.f) yvf0Var4.get();
                com.yandex.passport.internal.e eVar6 = (com.yandex.passport.internal.e) yvf0Var3.get();
                com.yandex.passport.common.common.a aVar6 = (com.yandex.passport.common.common.a) yvf0Var2.get();
                com.yandex.passport.internal.credentials.d dVar3 = (com.yandex.passport.internal.credentials.d) yvf0Var.get();
                hVar.getClass();
                Environment environment3 = Environment.TEAM_TESTING;
                return new com.yandex.passport.internal.network.client.a(okHttpClient3, new u(environment3, eVar5), com.yandex.passport.internal.util.p.g(dVar3.a, environment3), aVar5, wVar3, fVar3, eVar6, aVar6);
            default:
                OkHttpClient okHttpClient4 = (OkHttpClient) yvf0Var8.get();
                com.yandex.passport.internal.network.e eVar7 = (com.yandex.passport.internal.network.e) yvf0Var7.get();
                com.yandex.passport.internal.network.a aVar7 = (com.yandex.passport.internal.network.a) yvf0Var6.get();
                w wVar4 = (w) yvf0Var5.get();
                com.yandex.passport.common.analytics.f fVar4 = (com.yandex.passport.common.analytics.f) yvf0Var4.get();
                com.yandex.passport.internal.e eVar8 = (com.yandex.passport.internal.e) yvf0Var3.get();
                com.yandex.passport.common.common.a aVar8 = (com.yandex.passport.common.common.a) yvf0Var2.get();
                com.yandex.passport.internal.credentials.d dVar4 = (com.yandex.passport.internal.credentials.d) yvf0Var.get();
                hVar.getClass();
                Environment environment4 = Environment.TESTING;
                return new com.yandex.passport.internal.network.client.a(okHttpClient4, new u(environment4, eVar7), com.yandex.passport.internal.util.p.g(dVar4.a, environment4), aVar7, wVar4, fVar4, eVar8, aVar8);
        }
    }
}
