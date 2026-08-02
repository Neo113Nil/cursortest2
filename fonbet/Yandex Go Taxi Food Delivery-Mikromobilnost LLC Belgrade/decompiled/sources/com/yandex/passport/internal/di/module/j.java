package com.yandex.passport.internal.di.module;

import com.yandex.passport.internal.analytics.t;
import com.yandex.passport.internal.analytics.x;
import com.yandex.passport.internal.network.requester.ImageLoadingClient;
import defpackage.v7p;
import defpackage.yvf0;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class j implements v7p {
    public final /* synthetic */ int a;
    public final h b;
    public final yvf0 c;

    public /* synthetic */ j(h hVar, yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = hVar;
        this.c = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.c;
        h hVar = this.b;
        switch (i) {
            case 0:
                t tVar = (t) yvf0Var.get();
                hVar.getClass();
                return new x(tVar);
            case 1:
                com.yandex.passport.internal.report.g gVar = (com.yandex.passport.internal.report.g) yvf0Var.get();
                hVar.getClass();
                return gVar;
            case 2:
                OkHttpClient okHttpClient = (OkHttpClient) yvf0Var.get();
                hVar.getClass();
                return new ImageLoadingClient(okHttpClient);
            default:
                com.yandex.passport.internal.properties.p pVar = (com.yandex.passport.internal.properties.p) yvf0Var.get();
                hVar.getClass();
                OkHttpClient.a aVar = pVar.j;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                aVar.b(30L, timeUnit);
                aVar.g(30L, timeUnit);
                aVar.i(30L);
                return new OkHttpClient(aVar);
        }
    }
}
