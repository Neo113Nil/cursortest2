package com.yandex.passport.internal.helper;

import com.yandex.passport.data.network.g7;
import com.yandex.passport.data.network.wb;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.t;
import com.yandex.passport.internal.core.accounts.n;
import com.yandex.passport.internal.core.accounts.z;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.report.reporters.t0;
import com.yandex.passport.internal.sso.j;
import com.yandex.passport.internal.sso.l;
import com.yandex.passport.internal.storage.i;
import com.yandex.passport.internal.usecase.y;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class e implements v7p {
    public final /* synthetic */ int a = 2;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final xvf0 h;
    public final yvf0 i;

    public e(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, xvf0 xvf0Var, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.h = xvf0Var;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
        this.i = yvf0Var7;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.i;
        yvf0 yvf0Var2 = this.g;
        yvf0 yvf0Var3 = this.f;
        yvf0 yvf0Var4 = this.e;
        xvf0 xvf0Var = this.h;
        yvf0 yvf0Var5 = this.d;
        yvf0 yvf0Var6 = this.c;
        yvf0 yvf0Var7 = this.b;
        switch (i) {
            case 0:
                return new d((com.yandex.passport.internal.core.accounts.d) yvf0Var6.get(), (wb) yvf0Var5.get(), (g7) yvf0Var4.get(), (t0) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var3.get(), (t) yvf0Var2.get(), (com.yandex.passport.internal.credentials.d) yvf0Var.get());
            case 1:
                return new h((com.yandex.passport.internal.core.accounts.d) yvf0Var7.get(), (com.yandex.passport.internal.network.client.c) yvf0Var6.get(), (com.yandex.passport.internal.core.accounts.a) yvf0Var5.get(), (i) yvf0Var4.get(), (com.yandex.passport.common.a) yvf0Var3.get(), (com.yandex.passport.internal.e) yvf0Var2.get(), (f1) xvf0Var.get(), (y) yvf0Var.get());
            default:
                return new com.yandex.passport.internal.sso.announcing.a((com.yandex.passport.internal.core.accounts.e) yvf0Var7.get(), (z) yvf0Var6.get(), (n) yvf0Var5.get(), (a) xvf0Var.get(), (j) yvf0Var4.get(), (l) yvf0Var3.get(), (c0) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.h) yvf0Var.get());
        }
    }

    public e(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, xvf0 xvf0Var, yvf0 yvf0Var7) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
        this.h = xvf0Var;
        this.i = yvf0Var7;
    }

    public e(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, xvf0 xvf0Var, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.h = xvf0Var;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
        this.i = yvf0Var7;
    }
}
