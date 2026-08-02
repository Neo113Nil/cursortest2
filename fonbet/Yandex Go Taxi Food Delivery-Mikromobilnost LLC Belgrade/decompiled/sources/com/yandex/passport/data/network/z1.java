package com.yandex.passport.data.network;

import android.content.Context;
import com.yandex.passport.internal.database.DatabaseHelper;
import defpackage.eqh;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class z1 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;

    public z1(yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var, yvf0 yvf0Var3, fa faVar) {
        this.a = 18;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.e = xvf0Var;
        this.d = yvf0Var3;
        this.f = faVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.e;
        yvf0 yvf0Var2 = this.d;
        yvf0 yvf0Var3 = this.c;
        yvf0 yvf0Var4 = this.f;
        yvf0 yvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new y1((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (u1) ((m) yvf0Var4).get(), (com.yandex.passport.data.network.core.o) yvf0Var.get());
            case 1:
                return new m2((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (i2) yvf0Var.get(), (h2) ((m) yvf0Var4).get());
            case 2:
                return new e3((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (x2) yvf0Var.get(), (w2) ((m) yvf0Var4).get());
            case 3:
                return new z4((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (v4) ((m) yvf0Var4).get(), (com.yandex.passport.data.network.core.o) yvf0Var.get());
            case 4:
                return new n6((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (a6) yvf0Var.get(), (z5) ((m) yvf0Var4).get());
            case 5:
                return new v6((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (r6) ((m) yvf0Var4).get(), (com.yandex.passport.data.network.core.o) yvf0Var.get());
            case 6:
                return new d8((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (z7) ((m) yvf0Var4).get(), (com.yandex.passport.data.network.core.o) yvf0Var.get());
            case 7:
                return new u8((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (n8) yvf0Var.get(), (m8) ((m) yvf0Var4).get());
            case 8:
                return new d9((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (c9) yvf0Var.get(), (y8) ((e9) yvf0Var4).get());
            case 9:
                return new oa((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (ja) ((m) yvf0Var4).get(), (na) yvf0Var.get());
            case 10:
                return new wa((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (va) ((m) yvf0Var4).get(), (com.yandex.passport.data.network.core.o) yvf0Var.get());
            case 11:
                return new gb((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (com.yandex.passport.biometric.ui.verification.a) ((fa) yvf0Var).get(), (cb) ((m) yvf0Var4).get());
            case 12:
                return new dc((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (cc) yvf0Var.get(), (yb) ((m) yvf0Var4).get());
            case 13:
                return new mc((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (lc) yvf0Var.get(), (hc) ((nc) yvf0Var4).get());
            case 14:
                return new zc((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (rc) ((nc) yvf0Var4).get(), (yc) yvf0Var.get());
            case 15:
                return new ae((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (wd) ((nc) yvf0Var4).get(), (com.yandex.passport.data.network.core.o) yvf0Var.get());
            case 16:
                return new ke((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.common.network.l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (je) yvf0Var.get(), (fe) ((nc) yvf0Var4).get());
            case 17:
                return new com.yandex.passport.internal.core.accounts.e((com.yandex.passport.internal.core.accounts.g) yvf0Var5.get(), (com.yandex.passport.internal.core.accounts.n) ((eqh) yvf0Var4).get(), (com.yandex.passport.internal.analytics.c0) yvf0Var3.get(), (com.yandex.passport.internal.flags.j) yvf0Var2.get(), (com.yandex.passport.internal.network.mappers.h) yvf0Var.get());
            case 18:
                return new com.yandex.passport.internal.core.announcing.g((Context) yvf0Var5.get(), (com.yandex.passport.common.a) yvf0Var3.get(), (com.yandex.passport.internal.report.reporters.g) ((xvf0) yvf0Var).get(), (com.yandex.passport.common.analytics.d) yvf0Var2.get(), (com.yandex.passport.internal.config.a) ((fa) yvf0Var4).get());
            case 19:
                return new com.yandex.passport.internal.network.l((com.yandex.passport.internal.properties.q) yvf0Var5.get(), (com.yandex.passport.internal.config.h) yvf0Var3.get(), (com.yandex.passport.internal.flags.j) yvf0Var2.get(), (com.yandex.passport.common.resources.a) yvf0Var.get(), (com.yandex.passport.internal.config.template.g) ((com.yandex.passport.common.coroutine.g) yvf0Var4).get());
            case 20:
                return new com.yandex.passport.internal.usecase.p((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.internal.usecase.t) yvf0Var3.get(), (com.yandex.passport.internal.report.reporters.b1) yvf0Var2.get(), (DatabaseHelper) yvf0Var.get(), (com.yandex.passport.common.ui.lang.b) yvf0Var4.get());
            default:
                return new com.yandex.passport.internal.usecase.ui.j((com.yandex.passport.common.coroutine.a) yvf0Var5.get(), (com.yandex.passport.internal.network.r) ((r0) yvf0Var4).get(), (com.yandex.passport.internal.core.tokens.b) yvf0Var3.get(), (com.yandex.passport.internal.usecase.y) yvf0Var2.get(), (com.yandex.passport.common.ui.lang.b) yvf0Var.get());
        }
    }

    public /* synthetic */ z1(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, v7p v7pVar, yvf0 yvf0Var4, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.f = v7pVar;
        this.e = yvf0Var4;
    }

    public /* synthetic */ z1(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
    }

    public /* synthetic */ z1(yvf0 yvf0Var, v7p v7pVar, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.f = v7pVar;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
    }
}
