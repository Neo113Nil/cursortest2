package com.yandex.passport.internal.provider;

import com.yandex.passport.data.network.i4;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.config.o;
import com.yandex.passport.internal.core.accounts.d;
import com.yandex.passport.internal.core.accounts.g;
import com.yandex.passport.internal.core.accounts.t;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.database.n;
import com.yandex.passport.internal.flags.experiments.k;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.helper.h;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.properties.q;
import com.yandex.passport.internal.push.i0;
import com.yandex.passport.internal.push.k0;
import com.yandex.passport.internal.report.reporters.b1;
import com.yandex.passport.internal.report.reporters.g1;
import com.yandex.passport.internal.storage.i;
import com.yandex.passport.internal.usecase.h0;
import com.yandex.passport.internal.usecase.m;
import com.yandex.passport.internal.usecase.v0;
import com.yandex.passport.internal.util.e;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class c implements v7p {
    public final /* synthetic */ int a = 1;
    public final yvf0 b;
    public final yvf0 c;
    public final xvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;
    public final yvf0 j;
    public final yvf0 k;

    public c(yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = xvf0Var;
        this.e = yvf0Var3;
        this.f = yvf0Var4;
        this.g = yvf0Var5;
        this.h = yvf0Var6;
        this.i = yvf0Var7;
        this.j = yvf0Var8;
        this.k = yvf0Var9;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.k;
        yvf0 yvf0Var2 = this.j;
        xvf0 xvf0Var = this.d;
        yvf0 yvf0Var3 = this.i;
        yvf0 yvf0Var4 = this.h;
        yvf0 yvf0Var5 = this.g;
        yvf0 yvf0Var6 = this.f;
        yvf0 yvf0Var7 = this.e;
        yvf0 yvf0Var8 = this.c;
        yvf0 yvf0Var9 = this.b;
        switch (i) {
            case 0:
                i iVar = (i) yvf0Var9.get();
                d dVar = (d) yvf0Var8.get();
                g gVar = (g) yvf0Var7.get();
                com.yandex.passport.internal.network.client.c cVar = (com.yandex.passport.internal.network.client.c) yvf0Var6.get();
                com.yandex.passport.internal.core.tokens.a aVar = (com.yandex.passport.internal.core.tokens.a) yvf0Var5.get();
                return new b(iVar, dVar, gVar, cVar, aVar, (e) yvf0Var3.get(), (h) yvf0Var2.get(), (com.yandex.passport.internal.helper.b) xvf0Var.get(), (k) yvf0Var.get());
            case 1:
                return new h0((com.yandex.passport.common.coroutine.a) yvf0Var9.get(), (p) yvf0Var8.get(), (n) xvf0Var.get(), (g) yvf0Var7.get(), (i4) yvf0Var6.get(), (DatabaseHelper) yvf0Var5.get(), (k0) yvf0Var4.get(), (b1) yvf0Var3.get(), (i0) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
            case 2:
                return new v0((com.yandex.passport.common.coroutine.a) yvf0Var9.get(), (d) yvf0Var8.get(), (com.yandex.passport.internal.core.tokens.a) yvf0Var7.get(), (com.yandex.passport.internal.account.b) yvf0Var6.get(), (c0) yvf0Var5.get(), (m) xvf0Var.get(), (t) yvf0Var4.get(), (j) yvf0Var3.get(), (i0) yvf0Var2.get(), (k0) yvf0Var.get());
            default:
                return new com.yandex.passport.internal.usecase.vpn.b((com.yandex.passport.common.coroutine.a) yvf0Var9.get(), (com.yandex.passport.common.coroutine.e) yvf0Var8.get(), (com.yandex.passport.internal.usecase.vpn.d) yvf0Var7.get(), (com.yandex.passport.internal.common.h) yvf0Var6.get(), (o) yvf0Var5.get(), (j) yvf0Var4.get(), (com.yandex.passport.internal.account.b) yvf0Var3.get(), (com.yandex.passport.internal.sloth.c) xvf0Var.get(), (q) yvf0Var2.get(), (g1) yvf0Var.get());
        }
    }

    public c(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, xvf0 xvf0Var, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.e = yvf0Var3;
        this.f = yvf0Var4;
        this.g = yvf0Var5;
        this.d = xvf0Var;
        this.h = yvf0Var6;
        this.i = yvf0Var7;
        this.j = yvf0Var8;
        this.k = yvf0Var9;
    }

    public c(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, xvf0 xvf0Var, yvf0 yvf0Var8, yvf0 yvf0Var9) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.e = yvf0Var3;
        this.f = yvf0Var4;
        this.g = yvf0Var5;
        this.h = yvf0Var6;
        this.i = yvf0Var7;
        this.d = xvf0Var;
        this.j = yvf0Var8;
        this.k = yvf0Var9;
    }

    public c(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, xvf0 xvf0Var, yvf0 yvf0Var9) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.e = yvf0Var3;
        this.f = yvf0Var4;
        this.g = yvf0Var5;
        this.h = yvf0Var6;
        this.i = yvf0Var7;
        this.j = yvf0Var8;
        this.d = xvf0Var;
        this.k = yvf0Var9;
    }
}
