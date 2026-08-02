package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.data.network.wa;
import com.yandex.passport.data.network.za;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.push.i0;
import com.yandex.passport.internal.push.m0;
import com.yandex.passport.internal.report.reporters.s0;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class o implements v7p {
    public final /* synthetic */ int a = 0;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final xvf0 i;
    public final yvf0 j;

    public o(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, xvf0 xvf0Var, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.i = xvf0Var;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
        this.h = yvf0Var7;
        this.j = yvf0Var8;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.j;
        xvf0 xvf0Var = this.i;
        yvf0 yvf0Var2 = this.h;
        yvf0 yvf0Var3 = this.g;
        yvf0 yvf0Var4 = this.f;
        yvf0 yvf0Var5 = this.e;
        yvf0 yvf0Var6 = this.d;
        yvf0 yvf0Var7 = this.c;
        yvf0 yvf0Var8 = this.b;
        switch (i) {
            case 0:
                return new n((j) yvf0Var8.get(), (l) yvf0Var7.get(), (DatabaseHelper) yvf0Var6.get(), (b) yvf0Var5.get(), (k) xvf0Var.get(), (c0) yvf0Var4.get(), (com.yandex.passport.common.a) yvf0Var3.get(), (com.yandex.passport.internal.network.mappers.h) yvf0Var2.get(), (com.yandex.passport.internal.storage.i) yvf0Var.get());
            default:
                return new i0((wa) yvf0Var8.get(), (za) yvf0Var7.get(), (com.yandex.passport.internal.database.g) yvf0Var6.get(), (m0) yvf0Var5.get(), (com.yandex.passport.internal.util.j) yvf0Var4.get(), (com.yandex.passport.internal.storage.i) yvf0Var3.get(), (com.yandex.passport.internal.flags.j) yvf0Var2.get(), (s0) xvf0Var.get(), (com.yandex.passport.internal.network.mappers.b) yvf0Var.get());
        }
    }

    public o(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, xvf0 xvf0Var, yvf0 yvf0Var8) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
        this.h = yvf0Var7;
        this.i = xvf0Var;
        this.j = yvf0Var8;
    }
}
