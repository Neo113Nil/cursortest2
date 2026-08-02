package com.yandex.passport.data.network.core;

import android.content.Context;
import com.yandex.passport.data.network.dc;
import com.yandex.passport.data.network.gb;
import com.yandex.passport.data.network.i4;
import com.yandex.passport.internal.core.accounts.t;
import com.yandex.passport.internal.core.accounts.z;
import com.yandex.passport.internal.push.t0;
import com.yandex.passport.internal.push.y;
import com.yandex.passport.internal.report.nd;
import com.yandex.passport.internal.report.reporters.o0;
import com.yandex.passport.internal.usecase.n0;
import com.yandex.passport.internal.usecase.u0;
import com.yandex.passport.internal.usecase.ui.g0;
import com.yandex.passport.internal.usecase.ui.r0;
import com.yandex.passport.internal.usecase.z0;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;
import io.appmetrica.analytics.IReporterYandex;

/* loaded from: classes8.dex */
public final class i implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final xvf0 e;

    public /* synthetic */ i(yvf0 yvf0Var, xvf0 xvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.e = xvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.d;
        yvf0 yvf0Var2 = this.c;
        xvf0 xvf0Var = this.e;
        yvf0 yvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new h((com.yandex.passport.common.analytics.d) yvf0Var3.get(), (com.yandex.passport.common.common.a) yvf0Var2.get(), (com.yandex.passport.common.a) yvf0Var.get(), (com.yandex.passport.internal.report.g) xvf0Var.get());
            case 1:
                return new com.yandex.passport.internal.badges.b((Context) yvf0Var3.get(), (com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (com.yandex.passport.common.c) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.l) xvf0Var.get());
            case 2:
                return new z((com.yandex.passport.internal.core.accounts.g) yvf0Var3.get(), (t) xvf0Var.get(), (com.yandex.passport.internal.core.accounts.n) yvf0Var2.get(), (com.yandex.passport.internal.flags.j) yvf0Var.get());
            case 3:
                return new com.yandex.passport.internal.flags.j((com.yandex.passport.internal.flags.d) yvf0Var3.get(), (com.yandex.passport.internal.flags.experiments.g) yvf0Var2.get(), (com.yandex.passport.internal.flags.experiments.k) xvf0Var.get(), (com.yandex.passport.internal.flags.experiments.b) yvf0Var.get());
            case 4:
                return new com.yandex.passport.internal.helper.c((Context) yvf0Var3.get(), (com.yandex.passport.internal.storage.i) yvf0Var2.get(), (com.yandex.passport.internal.sso.h) xvf0Var.get(), (com.yandex.passport.internal.sso.l) yvf0Var.get());
            case 5:
                return new com.yandex.passport.internal.helper.f((com.yandex.passport.internal.network.client.c) yvf0Var3.get(), (com.yandex.passport.internal.properties.p) yvf0Var2.get(), (com.yandex.passport.internal.account.c) yvf0Var.get(), (g0) xvf0Var.get());
            case 6:
                return new t0((Context) yvf0Var3.get(), (com.yandex.passport.common.coroutine.e) yvf0Var2.get(), (com.yandex.passport.common.coroutine.a) yvf0Var.get(), (y) xvf0Var.get());
            case 7:
                return new nd((Context) yvf0Var3.get(), (com.yandex.passport.internal.report.g) yvf0Var2.get(), (IReporterYandex) yvf0Var.get(), (com.yandex.passport.common.analytics.f) xvf0Var.get());
            case 8:
                return new com.yandex.passport.internal.upgrader.c((com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (com.yandex.passport.internal.upgrader.k) xvf0Var.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.f) yvf0Var.get());
            case 9:
                return new n0((com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (com.yandex.passport.internal.properties.p) yvf0Var2.get(), (i4) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
            case 10:
                return new u0((Context) yvf0Var3.get(), (com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (com.yandex.passport.common.c) yvf0Var.get(), (o0) xvf0Var.get());
            case 11:
                return new z0((com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (com.yandex.passport.internal.config.a) yvf0Var2.get(), (com.yandex.passport.internal.core.accounts.j) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.b) xvf0Var.get());
            case 12:
                return new g0((com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (gb) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var2.get(), (com.yandex.passport.data.mapper.a) yvf0Var.get());
            default:
                return new r0((com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (dc) xvf0Var.get(), (com.yandex.passport.common.common.a) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
        }
    }

    public /* synthetic */ i(yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var, yvf0 yvf0Var3, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.e = xvf0Var;
        this.d = yvf0Var3;
    }

    public /* synthetic */ i(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = xvf0Var;
    }
}
