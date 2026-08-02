package com.yandex.passport.data.network;

import android.content.Context;
import com.yandex.passport.internal.database.DatabaseHelper;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class e9 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;

    public /* synthetic */ e9(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.d;
        yvf0 yvf0Var2 = this.c;
        yvf0 yvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new y8((com.yandex.passport.data.network.core.p) yvf0Var3.get(), (com.yandex.passport.data.network.core.h) yvf0Var2.get(), (com.yandex.passport.data.network.core.l) yvf0Var.get());
            case 1:
                return new com.yandex.passport.internal.core.accounts.k((com.yandex.passport.internal.core.accounts.g) yvf0Var3.get(), (com.yandex.passport.internal.network.client.c) yvf0Var2.get(), (com.yandex.passport.internal.analytics.c0) yvf0Var.get());
            case 2:
                return new com.yandex.passport.internal.core.tokens.b((DatabaseHelper) yvf0Var3.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var2.get(), (com.yandex.passport.internal.core.tokens.a) yvf0Var.get());
            case 3:
                Context context = (Context) yvf0Var3.get();
                com.yandex.passport.common.coroutine.e eVar = (com.yandex.passport.common.coroutine.e) yvf0Var2.get();
                com.yandex.passport.common.coroutine.a aVar = (com.yandex.passport.common.coroutine.a) yvf0Var.get();
                com.yandex.passport.internal.flags.experiments.o oVar = new com.yandex.passport.internal.flags.experiments.o();
                oVar.a = context;
                oVar.b = eVar;
                oVar.c = aVar;
                return oVar;
            case 4:
                return new com.yandex.passport.internal.helper.a((DatabaseHelper) yvf0Var3.get(), (com.yandex.passport.common.a) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.h) yvf0Var.get());
            case 5:
                return new com.yandex.passport.internal.helper.b((com.yandex.passport.internal.network.client.c) yvf0Var2.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var.get());
            case 6:
                return new com.yandex.passport.internal.methods.performer.h1((Context) yvf0Var3.get(), (com.yandex.passport.internal.usecase.vpn.b) yvf0Var2.get(), (com.yandex.passport.internal.config.o) yvf0Var.get());
            case 7:
                return new com.yandex.passport.internal.report.reporters.n((com.yandex.passport.internal.report.j) yvf0Var3.get(), (com.yandex.passport.internal.features.a) yvf0Var2.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var.get());
            case 8:
                return new com.yandex.passport.internal.report.reporters.u((Context) yvf0Var3.get(), (com.yandex.passport.internal.report.j) yvf0Var2.get(), (com.yandex.passport.internal.flags.j) yvf0Var.get());
            case 9:
                return new com.yandex.passport.internal.sso.g((Context) yvf0Var3.get(), (com.yandex.passport.internal.config.a) yvf0Var2.get(), (com.yandex.passport.internal.analytics.c0) yvf0Var.get());
            case 10:
                return new com.yandex.passport.internal.sso.h((com.yandex.passport.internal.sso.g) yvf0Var3.get(), (com.yandex.passport.internal.sso.announcing.c) yvf0Var2.get(), (com.yandex.passport.internal.sso.announcing.a) yvf0Var.get());
            case 11:
                return new com.yandex.passport.internal.sso.j((Context) yvf0Var3.get(), (com.yandex.passport.internal.analytics.c0) yvf0Var2.get(), (com.yandex.passport.internal.sso.g) yvf0Var.get());
            case 12:
                return new com.yandex.passport.internal.ui.challenge.vpn.o((com.yandex.passport.internal.usecase.vpn.b) yvf0Var3.get(), (com.yandex.passport.internal.config.p) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.g1) yvf0Var.get());
            case 13:
                return new com.yandex.passport.internal.usecase.b((com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (com.yandex.passport.internal.usecase.p) yvf0Var2.get(), (com.yandex.passport.internal.core.accounts.e) yvf0Var.get());
            case 14:
                com.yandex.passport.internal.usecase.r0 r0Var = (com.yandex.passport.internal.usecase.r0) yvf0Var3.get();
                return new com.yandex.passport.internal.usecase.j((com.yandex.passport.internal.flags.j) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.w) yvf0Var2.get(), r0Var);
            case 15:
                return new com.yandex.passport.internal.usecase.n((com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (com.yandex.passport.internal.usecase.p) yvf0Var2.get(), (com.yandex.passport.internal.core.accounts.e) yvf0Var.get());
            case 16:
                return new com.yandex.passport.internal.usecase.r1((com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (com.yandex.passport.internal.credentials.d) yvf0Var2.get(), (com.yandex.passport.internal.core.accounts.j) yvf0Var.get());
            case 17:
                return new com.yandex.passport.internal.usecase.ui.v((com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (com.yandex.passport.internal.usecase.j0) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.i1) yvf0Var.get());
            case 18:
                return new com.yandex.passport.internal.usecase.ui.x((com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (com.yandex.passport.internal.core.accounts.t) yvf0Var2.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var.get());
            case 19:
                return new com.yandex.passport.internal.usecase.ui.m0((com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (com.yandex.passport.common.ui.lang.b) yvf0Var2.get(), (com.yandex.passport.internal.network.e) yvf0Var.get());
            default:
                return new com.yandex.passport.internal.usecase.vpn.e((com.yandex.passport.internal.usecase.vpn.b) yvf0Var3.get(), (com.yandex.passport.internal.common.h) yvf0Var2.get(), (com.yandex.passport.internal.flags.j) yvf0Var.get());
        }
    }
}
