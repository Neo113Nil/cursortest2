package com.yandex.passport.internal.di.module;

import android.content.Context;
import defpackage.v7p;
import defpackage.yvf0;
import io.appmetrica.analytics.IReporterYandex;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class k implements v7p {
    public final /* synthetic */ int a;
    public final h b;
    public final yvf0 c;
    public final yvf0 d;

    public /* synthetic */ k(h hVar, yvf0 yvf0Var, yvf0 yvf0Var2, int i) {
        this.a = i;
        this.b = hVar;
        this.c = yvf0Var;
        this.d = yvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.d;
        yvf0 yvf0Var2 = this.c;
        h hVar = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.common.coroutine.a aVar = (com.yandex.passport.common.coroutine.a) yvf0Var2.get();
                OkHttpClient okHttpClient = (OkHttpClient) yvf0Var.get();
                hVar.getClass();
                return new com.yandex.passport.common.network.m(aVar, okHttpClient);
            case 1:
                IReporterYandex iReporterYandex = (IReporterYandex) yvf0Var2.get();
                Context context = (Context) yvf0Var.get();
                hVar.getClass();
                return com.yandex.passport.common.util.a.c(context) ? new com.yandex.passport.internal.sloth.credentialmanager.e(iReporterYandex) : new com.yandex.passport.internal.sloth.credentialmanager.h();
            default:
                Context context2 = (Context) yvf0Var2.get();
                com.yandex.passport.internal.flags.j jVar = (com.yandex.passport.internal.flags.j) yvf0Var.get();
                hVar.getClass();
                return com.yandex.passport.common.util.a.c(context2) ? new com.yandex.passport.internal.sloth.webauthn.a(jVar) : new com.yandex.passport.internal.sloth.webauthn.b();
        }
    }
}
