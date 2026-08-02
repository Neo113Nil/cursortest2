package com.yandex.passport.data.network;

import android.content.Context;
import defpackage.dxf0;
import defpackage.ku2;
import defpackage.v7p;
import defpackage.yvf0;
import io.appmetrica.analytics.IReporterYandex;

/* loaded from: classes8.dex */
public final class fa implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;

    public /* synthetic */ fa(yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.b;
        switch (i) {
            case 0:
                return new z9((com.yandex.passport.common.a) yvf0Var.get());
            case 1:
                return new com.yandex.passport.biometric.ui.verification.a(1, (com.yandex.passport.common.a) yvf0Var.get());
            case 2:
                return new com.yandex.passport.data.network.core.l((com.yandex.passport.internal.network.d) yvf0Var.get());
            case 3:
                return new com.yandex.passport.internal.account.b((com.yandex.passport.internal.storage.i) yvf0Var.get());
            case 4:
                return new com.yandex.passport.internal.analytics.u((com.yandex.passport.internal.analytics.t) yvf0Var.get());
            case 5:
                return new com.yandex.passport.internal.analytics.v((com.yandex.passport.internal.analytics.t) yvf0Var.get());
            case 6:
                return new com.yandex.passport.internal.analytics.b0((com.yandex.passport.internal.analytics.t) yvf0Var.get());
            case 7:
                return new com.yandex.passport.internal.analytics.e0((com.yandex.passport.internal.analytics.t) yvf0Var.get());
            case 8:
                return new com.yandex.passport.internal.analytics.f0((com.yandex.passport.internal.analytics.t) yvf0Var.get());
            case 9:
                return new com.yandex.passport.internal.badges.f(((com.yandex.passport.common.coroutine.b) ((com.yandex.passport.common.coroutine.a) yvf0Var.get())).c);
            case 10:
                return new com.yandex.passport.internal.common.f((Context) yvf0Var.get());
            case 11:
                return new com.yandex.passport.internal.common.h((Context) yvf0Var.get());
            case 12:
                return new com.yandex.passport.internal.config.a((Context) yvf0Var.get());
            case 13:
                return new com.yandex.passport.internal.config.b((com.yandex.passport.internal.config.e) yvf0Var.get());
            case 14:
                return new com.yandex.passport.internal.config.e((Context) yvf0Var.get());
            case 15:
                return new com.yandex.passport.internal.config.j((Context) yvf0Var.get());
            case 16:
                return new com.yandex.passport.internal.config.p((com.yandex.passport.internal.config.e) yvf0Var.get());
            case 17:
                return new com.yandex.passport.internal.config.q((Context) yvf0Var.get());
            case 18:
                return new com.yandex.passport.internal.core.announcing.d((Context) yvf0Var.get());
            case 19:
                return new com.yandex.passport.internal.credentials.d((com.yandex.passport.internal.properties.p) yvf0Var.get());
            case 20:
                return (com.yandex.passport.common.coroutine.b) yvf0Var.get();
            case 21:
                Context context = (Context) yvf0Var.get();
                return androidx.datastore.core.b.b(com.yandex.passport.internal.storage.m.a, new dxf0(new com.yandex.passport.common.network.t(6)), new ku2(context, 20));
            case 22:
                Context context2 = (Context) yvf0Var.get();
                return androidx.datastore.core.b.b(com.yandex.passport.internal.config.template.h.a, new dxf0(new com.yandex.passport.common.network.t(7)), new ku2(context2, 22));
            case 23:
                return new com.yandex.passport.internal.flags.experiments.k((Context) yvf0Var.get());
            case 24:
                return new com.yandex.passport.internal.network.mappers.a((com.yandex.passport.data.mapper.a) yvf0Var.get());
            case 25:
                return new com.yandex.passport.internal.properties.q((com.yandex.passport.internal.properties.p) yvf0Var.get());
            case 26:
                return new com.yandex.passport.internal.provider.communication.h((com.yandex.passport.internal.provider.communication.e) yvf0Var.get());
            case 27:
                return new com.yandex.passport.internal.push.a0((Context) yvf0Var.get());
            case 28:
                return new com.yandex.passport.internal.push.d0((com.yandex.passport.internal.report.reporters.s0) yvf0Var.get());
            default:
                return new com.yandex.passport.internal.report.h((IReporterYandex) yvf0Var.get());
        }
    }
}
