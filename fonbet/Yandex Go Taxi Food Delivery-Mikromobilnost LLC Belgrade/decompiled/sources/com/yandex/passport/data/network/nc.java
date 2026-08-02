package com.yandex.passport.data.network;

import android.content.Context;
import com.yandex.passport.internal.database.DatabaseHelper;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class nc implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;

    public /* synthetic */ nc(yvf0 yvf0Var, yvf0 yvf0Var2, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new hc((com.yandex.passport.data.network.core.p) this.b.get(), (com.yandex.passport.data.network.core.h) this.c.get());
            case 1:
                return new rc((com.yandex.passport.data.network.core.p) this.b.get(), (com.yandex.passport.data.network.core.h) this.c.get());
            case 2:
                return new dd((com.yandex.passport.data.network.core.p) this.b.get(), (com.yandex.passport.data.network.core.h) this.c.get());
            case 3:
                return new kd((com.yandex.passport.data.network.core.p) this.b.get(), (com.yandex.passport.data.network.core.h) this.c.get());
            case 4:
                return new wd((com.yandex.passport.data.network.core.p) this.b.get(), (com.yandex.passport.data.network.core.h) this.c.get());
            case 5:
                return new fe((com.yandex.passport.data.network.core.p) this.b.get(), (com.yandex.passport.data.network.core.h) this.c.get());
            case 6:
                return new com.yandex.passport.data.network.core.s((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.data.network.core.o) this.c.get());
            case 7:
                return new com.yandex.passport.data.network.token.b((com.yandex.passport.data.network.core.p) this.b.get(), (com.yandex.passport.data.network.core.h) this.c.get());
            case 8:
                return new com.yandex.passport.data.network.token.n((com.yandex.passport.data.network.core.p) this.b.get(), (com.yandex.passport.data.network.core.h) this.c.get());
            case 9:
                return new com.yandex.passport.data.network.token.z((com.yandex.passport.data.network.core.p) this.b.get(), (com.yandex.passport.data.network.core.h) this.c.get());
            case 10:
                return new com.yandex.passport.data.network.token.l0((com.yandex.passport.data.network.core.p) this.b.get(), (com.yandex.passport.data.network.core.h) this.c.get());
            case 11:
                return new com.yandex.passport.data.network.token.a1((com.yandex.passport.data.network.core.p) this.b.get(), (com.yandex.passport.data.network.core.h) this.c.get());
            case 12:
                return new com.yandex.passport.data.network.token.j1((com.yandex.passport.data.network.core.p) this.b.get(), (com.yandex.passport.data.network.core.h) this.c.get());
            case 13:
                return new com.yandex.passport.internal.account.a((com.yandex.passport.internal.core.accounts.d) this.b.get(), (com.yandex.passport.internal.account.b) this.c.get());
            case 14:
                return new com.yandex.passport.internal.authsdk.b((com.yandex.passport.internal.core.accounts.d) this.b.get(), (com.yandex.passport.internal.filter.i) this.c.get());
            case 15:
                return new com.yandex.passport.internal.common.e((Context) this.b.get(), (com.yandex.passport.internal.properties.p) this.c.get());
            case 16:
                return new com.yandex.passport.internal.core.accounts.l((DatabaseHelper) this.b.get(), (com.yandex.passport.internal.network.mappers.h) this.c.get());
            case 17:
                return new com.yandex.passport.internal.core.tokens.a((DatabaseHelper) this.b.get(), (com.yandex.passport.internal.analytics.c0) this.c.get());
            case 18:
                return new com.yandex.passport.internal.filter.l((Context) this.b.get(), (com.yandex.passport.internal.report.reporters.z0) this.c.get());
            case 19:
                return new com.yandex.passport.internal.core.accounts.p((com.yandex.passport.internal.flags.experiments.k) this.b.get(), (com.yandex.passport.internal.flags.j) this.c.get());
            case 20:
                return new com.yandex.passport.internal.methods.performer.q((Context) this.b.get(), (com.yandex.passport.internal.core.accounts.n) this.c.get());
            case 21:
                return new com.yandex.passport.internal.push.z((Context) this.b.get(), (com.yandex.passport.internal.network.e) this.c.get());
            case 22:
                return new com.yandex.passport.internal.push.m0((com.yandex.passport.common.a) this.b.get(), (com.yandex.passport.internal.flags.j) this.c.get());
            case 23:
                return new com.yandex.passport.internal.report.reporters.f((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 24:
                return new com.yandex.passport.internal.report.reporters.g((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 25:
                return new com.yandex.passport.internal.report.reporters.h((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 26:
                return new com.yandex.passport.internal.report.reporters.i((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 27:
                return new com.yandex.passport.internal.report.reporters.j((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 28:
                return new com.yandex.passport.internal.report.reporters.k((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            default:
                return new com.yandex.passport.internal.report.reporters.m((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
        }
    }
}
