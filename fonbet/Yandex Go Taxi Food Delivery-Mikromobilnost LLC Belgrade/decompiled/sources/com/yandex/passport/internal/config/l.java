package com.yandex.passport.internal.config;

import android.content.Context;
import com.yandex.passport.data.network.u8;
import com.yandex.passport.data.network.zc;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.push.k0;
import com.yandex.passport.internal.report.reporters.v;
import com.yandex.passport.internal.usecase.d0;
import com.yandex.passport.internal.usecase.l1;
import com.yandex.passport.internal.usecase.y;
import defpackage.cma1;
import defpackage.i5m;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class l implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final xvf0 f;
    public final yvf0 g;

    public l(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, xvf0 xvf0Var, yvf0 yvf0Var5) {
        this.a = 1;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = xvf0Var;
        this.g = yvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.g;
        yvf0 yvf0Var2 = this.e;
        xvf0 xvf0Var = this.f;
        yvf0 yvf0Var3 = this.d;
        yvf0 yvf0Var4 = this.c;
        yvf0 yvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new k((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (u8) xvf0Var.get(), (com.yandex.passport.internal.report.reporters.q) yvf0Var4.get(), (f) yvf0Var3.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var2.get(), (a) yvf0Var.get());
            case 1:
                return new com.yandex.passport.internal.core.announcing.c((com.yandex.passport.internal.core.announcing.g) yvf0Var5.get(), (com.yandex.passport.internal.core.accounts.b) yvf0Var4.get(), (k0) yvf0Var3.get(), (com.yandex.passport.internal.core.announcing.d) yvf0Var2.get(), (com.yandex.passport.internal.sso.announcing.c) xvf0Var.get(), (com.yandex.passport.internal.helper.a) yvf0Var.get());
            case 2:
                return new com.yandex.passport.internal.sso.announcing.c((Context) yvf0Var5.get(), (com.yandex.passport.internal.sso.g) yvf0Var4.get(), (com.yandex.passport.internal.sso.l) yvf0Var3.get(), (c0) yvf0Var2.get(), (com.yandex.passport.internal.sso.j) yvf0Var.get(), i5m.a(cma1.i(xvf0Var)));
            case 3:
                return new com.yandex.passport.internal.ui.challenge.n((com.yandex.passport.internal.network.e) yvf0Var5.get(), (d0) yvf0Var4.get(), (y) yvf0Var3.get(), (com.yandex.passport.common.ui.lang.b) yvf0Var2.get(), (com.yandex.passport.internal.flags.j) yvf0Var.get(), (com.yandex.passport.internal.report.reporters.o) xvf0Var.get());
            case 4:
                return new l1((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.internal.core.accounts.d) yvf0Var4.get(), (zc) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var3.get(), (j) yvf0Var2.get(), (v) yvf0Var.get());
            default:
                return new com.yandex.passport.internal.usecase.authorize.d((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.internal.usecase.h) yvf0Var4.get(), (com.yandex.passport.internal.usecase.n) yvf0Var3.get(), (com.yandex.passport.data.network.token.h) xvf0Var.get(), (com.yandex.passport.internal.credentials.d) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
        }
    }

    public /* synthetic */ l(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.g = yvf0Var5;
        this.f = xvf0Var;
    }

    public l(yvf0 yvf0Var, xvf0 xvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5) {
        this.a = 0;
        this.b = yvf0Var;
        this.f = xvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.g = yvf0Var5;
    }

    public l(yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5) {
        this.a = 4;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.f = xvf0Var;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.g = yvf0Var5;
    }

    public l(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, xvf0 xvf0Var, yvf0 yvf0Var4, yvf0 yvf0Var5) {
        this.a = 5;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.f = xvf0Var;
        this.e = yvf0Var4;
        this.g = yvf0Var5;
    }
}
