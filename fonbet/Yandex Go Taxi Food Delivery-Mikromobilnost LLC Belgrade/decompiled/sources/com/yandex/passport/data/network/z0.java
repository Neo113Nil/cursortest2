package com.yandex.passport.data.network;

import android.content.Context;
import com.yandex.passport.internal.core.auth.Authenticator;
import com.yandex.passport.internal.database.DatabaseHelper;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class z0 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final xvf0 f;

    public z0(yvf0 yvf0Var, xvf0 xvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4) {
        this.a = 3;
        this.b = yvf0Var;
        this.f = xvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        yvf0 yvf0Var = this.e;
        yvf0 yvf0Var2 = this.d;
        yvf0 yvf0Var3 = this.c;
        yvf0 yvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new y0((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (u0) yvf0Var.get(), (com.yandex.passport.data.network.core.s) xvf0Var.get());
            case 1:
                return new wb((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (sb) yvf0Var.get(), (com.yandex.passport.data.network.core.s) xvf0Var.get());
            case 2:
                return new com.yandex.passport.internal.badges.g((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.internal.badges.b) yvf0Var3.get(), (e3) xvf0Var.get(), (com.yandex.passport.internal.report.reporters.l) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
            case 3:
                return new Authenticator((Context) yvf0Var4.get(), (com.yandex.passport.internal.usecase.g1) xvf0Var.get(), (DatabaseHelper) yvf0Var3.get(), (com.yandex.passport.internal.core.announcing.c) yvf0Var2.get(), (com.yandex.passport.internal.account.b) yvf0Var.get());
            case 4:
                return new com.yandex.passport.internal.push.k0((Context) yvf0Var4.get(), (com.yandex.passport.internal.properties.p) yvf0Var3.get(), (com.yandex.passport.common.permission.c) yvf0Var2.get(), (com.yandex.passport.internal.flags.j) yvf0Var.get(), (com.yandex.passport.internal.push.t0) xvf0Var.get());
            case 5:
                return new com.yandex.passport.internal.report.diary.k((com.yandex.passport.internal.flags.j) yvf0Var4.get(), (com.yandex.passport.common.a) yvf0Var3.get(), (com.yandex.passport.internal.report.diary.c) yvf0Var2.get(), (com.yandex.passport.internal.report.diary.b) xvf0Var.get(), (com.yandex.passport.common.coroutine.a) yvf0Var.get());
            case 6:
                return new com.yandex.passport.internal.report.diary.o((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.internal.flags.j) yvf0Var3.get(), (com.yandex.passport.internal.report.diary.n) xvf0Var.get(), (com.yandex.passport.common.a) yvf0Var2.get(), (com.yandex.passport.internal.report.diary.l) yvf0Var.get());
            case 7:
                return new com.yandex.passport.internal.usecase.d((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var3.get(), (z) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.v) xvf0Var.get());
            case 8:
                return new com.yandex.passport.internal.usecase.f((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var3.get(), (i0) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.v) yvf0Var.get());
            case 9:
                return new com.yandex.passport.internal.usecase.j0((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var3.get(), (v6) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.r) xvf0Var.get());
            case 10:
                return new com.yandex.passport.internal.usecase.y0((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var3.get(), (oa) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.v) yvf0Var.get());
            case 11:
                return new com.yandex.passport.internal.usecase.n1((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.common.ui.lang.b) yvf0Var3.get(), (hd) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.a1) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
            case 12:
                return new com.yandex.passport.internal.usecase.p1((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (qd) yvf0Var3.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.h0) xvf0Var.get());
            case 13:
                return new com.yandex.passport.internal.usecase.ui.l((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.internal.usecase.n) yvf0Var3.get(), (com.yandex.passport.data.network.token.r0) xvf0Var.get(), (com.yandex.passport.internal.credentials.d) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
            default:
                return new com.yandex.passport.internal.usecase.ui.j0((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.internal.usecase.y) yvf0Var3.get(), (com.yandex.passport.common.ui.lang.b) yvf0Var2.get(), (com.yandex.passport.internal.core.tokens.b) yvf0Var.get(), (com.yandex.passport.internal.usecase.ui.m0) xvf0Var.get());
        }
    }

    public /* synthetic */ z0(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, xvf0 xvf0Var, yvf0 yvf0Var4, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.f = xvf0Var;
        this.e = yvf0Var4;
    }

    public /* synthetic */ z0(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = xvf0Var;
    }

    public /* synthetic */ z0(yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var, yvf0 yvf0Var3, yvf0 yvf0Var4, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.f = xvf0Var;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
    }
}
