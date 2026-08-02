package com.yandex.passport.data.network;

import android.content.Context;
import defpackage.cma1;
import defpackage.i5m;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class k8 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final xvf0 c;
    public final yvf0 d;

    public k8(xvf0 xvf0Var, yvf0 yvf0Var, yvf0 yvf0Var2) {
        this.a = 9;
        this.c = xvf0Var;
        this.b = yvf0Var;
        this.d = yvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.d;
        xvf0 xvf0Var = this.c;
        yvf0 yvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new f8((com.yandex.passport.data.network.core.p) yvf0Var2.get(), (com.yandex.passport.data.network.core.h) yvf0Var.get(), (com.yandex.passport.data.network.core.l) xvf0Var.get());
            case 1:
                return new com.yandex.passport.internal.config.f((com.yandex.passport.internal.config.e) yvf0Var2.get(), (com.yandex.passport.common.c) xvf0Var.get(), (com.yandex.passport.common.common.a) yvf0Var.get());
            case 2:
                return new com.yandex.passport.internal.config.o((com.yandex.passport.internal.config.e) yvf0Var2.get(), (com.yandex.passport.common.common.a) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.g1) xvf0Var.get());
            case 3:
                return new com.yandex.passport.internal.network.n((com.yandex.passport.internal.storage.datastore.a) yvf0Var2.get(), (com.yandex.passport.common.common.a) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.c1) xvf0Var.get());
            case 4:
                return new com.yandex.passport.internal.push.y((com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (com.yandex.passport.internal.storage.i) yvf0Var.get(), i5m.a(cma1.i(xvf0Var)));
            case 5:
                return new com.yandex.passport.internal.report.j((com.yandex.passport.internal.report.sd) yvf0Var2.get(), (com.yandex.passport.internal.report.g) yvf0Var.get(), (com.yandex.passport.internal.features.a) xvf0Var.get());
            case 6:
                return new com.yandex.passport.internal.report.diary.c((com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (com.yandex.passport.internal.database.diary.d) yvf0Var.get(), (com.yandex.passport.internal.report.diary.l) xvf0Var.get());
            case 7:
                return new com.yandex.passport.internal.sloth.performers.p((com.yandex.passport.internal.sloth.webauthn.c) yvf0Var2.get(), (com.yandex.passport.internal.properties.p) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.j1) xvf0Var.get());
            case 8:
                return new com.yandex.passport.internal.usecase.h((com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (com.yandex.passport.internal.config.m) xvf0Var.get(), (com.yandex.passport.internal.config.h) yvf0Var.get());
            case 9:
                return new com.yandex.passport.internal.usecase.k((com.yandex.passport.internal.flags.j) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.w) yvf0Var.get(), (com.yandex.passport.internal.usecase.r0) xvf0Var.get());
            case 10:
                return new com.yandex.passport.internal.usecase.s0((Context) yvf0Var2.get(), (com.yandex.passport.common.coroutine.a) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.u) xvf0Var.get());
            case 11:
                return new com.yandex.passport.internal.usecase.ui.q((com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (f1) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
            default:
                return new com.yandex.passport.internal.usecase.ui.t((com.yandex.passport.common.coroutine.a) yvf0Var2.get(), (y1) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
        }
    }

    public /* synthetic */ k8(yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.d = yvf0Var2;
        this.c = xvf0Var;
    }

    public /* synthetic */ k8(yvf0 yvf0Var, xvf0 xvf0Var, yvf0 yvf0Var2, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = xvf0Var;
        this.d = yvf0Var2;
    }
}
