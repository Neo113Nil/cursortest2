package com.yandex.passport.data.network;

import android.content.Context;
import com.yandex.passport.internal.database.DatabaseHelper;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class ea implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final xvf0 h;

    public ea(yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6) {
        this.a = 2;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.h = xvf0Var;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.g;
        xvf0 xvf0Var = this.h;
        yvf0 yvf0Var2 = this.f;
        yvf0 yvf0Var3 = this.e;
        yvf0 yvf0Var4 = this.d;
        yvf0 yvf0Var5 = this.c;
        yvf0 yvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new da((com.yandex.passport.common.coroutine.a) yvf0Var6.get(), (com.yandex.passport.common.network.l0) yvf0Var5.get(), (com.yandex.passport.internal.network.c) yvf0Var4.get(), (z9) yvf0Var3.get(), (ca) yvf0Var2.get(), (w9) yvf0Var.get(), (com.yandex.passport.data.network.core.s) xvf0Var.get());
            case 1:
                return new qd((com.yandex.passport.common.coroutine.a) yvf0Var6.get(), (com.yandex.passport.common.network.l0) yvf0Var5.get(), (com.yandex.passport.internal.network.c) yvf0Var4.get(), (kd) yvf0Var3.get(), (od) yvf0Var2.get(), (pd) yvf0Var.get(), (com.yandex.passport.data.network.core.s) xvf0Var.get());
            case 2:
                return new com.yandex.passport.internal.analytics.y((Context) yvf0Var6.get(), (com.yandex.passport.internal.storage.i) yvf0Var5.get(), (com.yandex.passport.internal.account.a) xvf0Var.get(), (DatabaseHelper) yvf0Var4.get(), (com.yandex.passport.internal.analytics.c0) yvf0Var3.get(), (com.yandex.passport.internal.properties.p) yvf0Var2.get(), (com.yandex.passport.common.a) yvf0Var.get());
            case 3:
                return new com.yandex.passport.internal.core.accounts.a((Context) yvf0Var6.get(), (com.yandex.passport.internal.core.accounts.j) yvf0Var5.get(), (com.yandex.passport.internal.core.accounts.u) yvf0Var4.get(), (com.yandex.passport.internal.core.accounts.k) yvf0Var3.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var2.get(), (com.yandex.passport.internal.analytics.f0) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.h) yvf0Var.get());
            case 4:
                return new com.yandex.passport.internal.sloth.o((com.yandex.passport.internal.usecase.y) yvf0Var6.get(), (com.yandex.passport.internal.usecase.ui.i) yvf0Var5.get(), (com.yandex.passport.internal.usecase.ui.o0) yvf0Var4.get(), (com.yandex.passport.internal.usecase.ui.j0) yvf0Var3.get(), (com.yandex.passport.internal.usecase.ui.m0) yvf0Var2.get(), (com.yandex.passport.internal.usecase.ui.e0) xvf0Var.get(), (com.yandex.passport.internal.network.r) yvf0Var.get());
            case 5:
                return new com.yandex.passport.internal.upgrader.j((com.yandex.passport.common.coroutine.a) yvf0Var6.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var5.get(), (y0) yvf0Var4.get(), (com.yandex.passport.internal.e) yvf0Var3.get(), (com.yandex.passport.internal.upgrader.n) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.f) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
            case 6:
                return new com.yandex.passport.internal.usecase.t((com.yandex.passport.common.coroutine.a) yvf0Var6.get(), (da) yvf0Var5.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var4.get(), (com.yandex.passport.internal.flags.j) yvf0Var3.get(), (com.yandex.passport.internal.rotation.c) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var2.get(), (com.yandex.passport.data.mapper.a) yvf0Var.get());
            case 7:
                return new com.yandex.passport.internal.usecase.d0((com.yandex.passport.common.coroutine.a) yvf0Var6.get(), (s3) yvf0Var5.get(), (com.yandex.passport.internal.network.e) yvf0Var4.get(), (com.yandex.passport.internal.usecase.q) yvf0Var3.get(), (com.yandex.passport.internal.usecase.h0) xvf0Var.get(), (com.yandex.passport.common.common.a) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
            case 8:
                return new com.yandex.passport.internal.usecase.authorize.b((com.yandex.passport.common.coroutine.a) yvf0Var6.get(), (com.yandex.passport.internal.usecase.h) yvf0Var5.get(), (com.yandex.passport.internal.usecase.n) yvf0Var4.get(), (com.yandex.passport.data.network.token.t) xvf0Var.get(), (com.yandex.passport.internal.report.reporters.b1) yvf0Var3.get(), (com.yandex.passport.internal.credentials.d) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
            case 9:
                return new com.yandex.passport.internal.usecase.authorize.j((com.yandex.passport.common.coroutine.a) yvf0Var6.get(), (com.yandex.passport.internal.usecase.b1) yvf0Var5.get(), (l) yvf0Var4.get(), (com.yandex.passport.internal.report.reporters.i) yvf0Var3.get(), (com.yandex.passport.internal.properties.p) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get(), (com.yandex.passport.internal.network.mappers.a) xvf0Var.get());
            case 10:
                return new com.yandex.passport.internal.usecase.ui.g((com.yandex.passport.common.coroutine.a) yvf0Var6.get(), (com.yandex.passport.internal.usecase.h) yvf0Var5.get(), (com.yandex.passport.internal.usecase.n) yvf0Var4.get(), (t7) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var3.get(), (com.yandex.passport.internal.credentials.d) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.b1) yvf0Var.get());
            default:
                return new com.yandex.passport.internal.usecase.ui.v0((com.yandex.passport.internal.account.c) yvf0Var6.get(), (com.yandex.passport.internal.ui.g) yvf0Var5.get(), (com.yandex.passport.internal.usecase.ui.r0) yvf0Var4.get(), (com.yandex.passport.common.coroutine.a) yvf0Var3.get(), (com.yandex.passport.internal.usecase.n1) yvf0Var2.get(), (ke) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
        }
    }

    public /* synthetic */ ea(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, xvf0 xvf0Var, yvf0 yvf0Var5, yvf0 yvf0Var6, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.h = xvf0Var;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
    }

    public /* synthetic */ ea(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, xvf0 xvf0Var, yvf0 yvf0Var6, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.h = xvf0Var;
        this.g = yvf0Var6;
    }

    public /* synthetic */ ea(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
        this.h = xvf0Var;
    }

    public /* synthetic */ ea(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, xvf0 xvf0Var, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.h = xvf0Var;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
    }
}
