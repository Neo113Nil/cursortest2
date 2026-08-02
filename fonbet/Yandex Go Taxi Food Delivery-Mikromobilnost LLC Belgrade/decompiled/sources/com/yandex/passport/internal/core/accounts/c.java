package com.yandex.passport.internal.core.accounts;

import android.content.Context;
import com.yandex.passport.data.network.lb;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.push.a0;
import com.yandex.passport.internal.push.i0;
import com.yandex.passport.internal.push.k0;
import com.yandex.passport.internal.report.reporters.b1;
import com.yandex.passport.internal.report.reporters.o0;
import com.yandex.passport.internal.usecase.f1;
import com.yandex.passport.internal.usecase.r1;
import defpackage.cma1;
import defpackage.i5m;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class c implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;
    public final yvf0 j;

    public /* synthetic */ c(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
        this.h = yvf0Var7;
        this.i = yvf0Var8;
        this.j = yvf0Var9;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.j;
        yvf0 yvf0Var2 = this.i;
        yvf0 yvf0Var3 = this.h;
        yvf0 yvf0Var4 = this.g;
        yvf0 yvf0Var5 = this.f;
        yvf0 yvf0Var6 = this.e;
        yvf0 yvf0Var7 = this.d;
        yvf0 yvf0Var8 = this.c;
        yvf0 yvf0Var9 = this.b;
        switch (i) {
            case 0:
                return new b((j) yvf0Var9.get(), (l) yvf0Var8.get(), (DatabaseHelper) yvf0Var7.get(), (com.yandex.passport.internal.core.sync.a) yvf0Var6.get(), i5m.a(cma1.i(yvf0Var5)), (com.yandex.passport.internal.storage.i) yvf0Var4.get(), (c0) yvf0Var3.get(), (com.yandex.passport.internal.properties.p) yvf0Var2.get(), (com.yandex.passport.internal.flags.j) yvf0Var.get());
            case 1:
                return new o0((Context) yvf0Var9.get(), (j) yvf0Var8.get(), (d) yvf0Var7.get(), (a0) yvf0Var6.get(), (com.yandex.passport.data.network.core.o) yvf0Var5.get(), (com.yandex.passport.internal.network.l) yvf0Var4.get(), (com.yandex.passport.internal.report.j) yvf0Var3.get(), (com.yandex.passport.internal.features.a) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.h) yvf0Var.get());
            default:
                return new f1((com.yandex.passport.common.coroutine.a) yvf0Var9.get(), (lb) yvf0Var8.get(), (r1) yvf0Var7.get(), (com.yandex.passport.internal.credentials.d) yvf0Var6.get(), (b1) yvf0Var5.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var4.get(), (com.yandex.passport.internal.core.tokens.a) yvf0Var3.get(), (i0) yvf0Var2.get(), (k0) yvf0Var.get());
        }
    }
}
