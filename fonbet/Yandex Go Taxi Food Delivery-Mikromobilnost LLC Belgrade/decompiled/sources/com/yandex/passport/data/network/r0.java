package com.yandex.passport.data.network;

import android.content.Context;
import com.yandex.passport.internal.database.DatabaseHelper;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class r0 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;

    public /* synthetic */ r0(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new q0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.network.m) this.c.get(), (com.yandex.passport.data.network.core.p) this.d.get(), (com.yandex.passport.data.network.core.h) this.e.get());
            case 1:
                return new com.yandex.passport.internal.network.r((Context) this.b.get(), (com.yandex.passport.common.analytics.f) this.c.get(), (com.yandex.passport.internal.helper.g) this.d.get(), (com.yandex.passport.common.common.a) this.e.get());
            case 2:
                return new com.yandex.passport.internal.push.c0((Context) this.b.get(), (com.yandex.passport.common.common.a) this.c.get(), (com.yandex.passport.common.analytics.d) this.d.get(), (com.yandex.passport.internal.flags.j) this.e.get());
            case 3:
                return new com.yandex.passport.internal.sloth.p((com.yandex.passport.common.analytics.f) this.b.get(), (com.yandex.passport.common.common.a) this.c.get(), (com.yandex.passport.internal.report.g) this.d.get(), (com.yandex.passport.internal.properties.p) this.e.get());
            case 4:
                return new com.yandex.passport.internal.sloth.performers.g((Context) this.b.get(), (com.yandex.passport.internal.smsretriever.a) this.c.get(), (com.yandex.passport.internal.analytics.b0) this.d.get(), (com.yandex.passport.common.coroutine.e) this.e.get());
            case 5:
                return new com.yandex.passport.internal.sso.k((com.yandex.passport.internal.sso.g) this.b.get(), (com.yandex.passport.internal.sso.announcing.a) this.c.get(), (com.yandex.passport.internal.report.reporters.b1) this.d.get(), (com.yandex.passport.internal.network.mappers.h) this.e.get());
            case 6:
                return new com.yandex.passport.internal.upgrader.k((com.yandex.passport.internal.core.accounts.d) this.b.get(), (y0) this.c.get(), (com.yandex.passport.internal.network.mappers.b) this.d.get(), (com.yandex.passport.internal.e) this.e.get());
            case 7:
                return new com.yandex.passport.internal.usecase.t0((Context) this.b.get(), (com.yandex.passport.common.coroutine.a) this.c.get(), (com.yandex.passport.common.c) this.d.get(), (com.yandex.passport.internal.report.reporters.o0) this.e.get());
            case 8:
                return new com.yandex.passport.internal.usecase.b1((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) this.c.get(), (DatabaseHelper) this.d.get(), (com.yandex.passport.internal.report.reporters.b1) this.e.get());
            case 9:
                return new com.yandex.passport.internal.usecase.j1((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.d) this.c.get(), (com.yandex.passport.internal.account.b) this.d.get(), (com.yandex.passport.internal.analytics.c0) this.e.get());
            case 10:
                return new com.yandex.passport.internal.usecase.ui.r((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.z) this.c.get(), (com.yandex.passport.internal.analytics.c0) this.d.get(), (DatabaseHelper) this.e.get());
            case 11:
                return new com.yandex.passport.internal.usecase.ui.p0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.network.r) this.c.get(), (com.yandex.passport.internal.usecase.y) this.d.get(), (com.yandex.passport.common.ui.lang.b) this.e.get());
            default:
                return new com.yandex.passport.internal.usecase.ui.t0((com.yandex.passport.internal.account.c) this.b.get(), (com.yandex.passport.internal.ui.g) this.c.get(), (com.yandex.passport.internal.usecase.n1) this.d.get(), (com.yandex.passport.common.coroutine.a) this.e.get());
        }
    }
}
