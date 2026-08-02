package com.yandex.passport.internal.report.reporters;

import android.content.Context;
import com.yandex.passport.internal.report.sd;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class p implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;

    public /* synthetic */ p(yvf0 yvf0Var, yvf0 yvf0Var2, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new o((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 1:
                return new t((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 2:
                return new b0((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 3:
                return new c0((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 4:
                return new d0((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 5:
                return new h0((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 6:
                return new i0((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 7:
                return new r0((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 8:
                return new s0((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 9:
                return new t0((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 10:
                return new w0((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 11:
                return new x0((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 12:
                return new y0((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 13:
                return new a1((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 14:
                return new b1((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 15:
                return new c1((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 16:
                return new f1((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 17:
                return new h1((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 18:
                return new i1((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 19:
                return new k1((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 20:
                return new com.yandex.passport.internal.sloth.k((Context) this.b.get(), (com.yandex.passport.internal.properties.p) this.c.get());
            case 21:
                return new com.yandex.passport.internal.sloth.m((sd) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 22:
                return new com.yandex.passport.internal.sloth.performers.l((com.yandex.passport.internal.properties.p) this.b.get(), (com.yandex.passport.common.analytics.f) this.c.get());
            case 23:
                return new com.yandex.passport.internal.sloth.performers.webcard.b((com.yandex.passport.internal.sloth.performers.webcard.g) this.b.get(), (com.yandex.passport.internal.flags.j) this.c.get());
            case 24:
                return new com.yandex.passport.internal.smsretriever.a((Context) this.b.get(), (com.yandex.passport.internal.storage.i) this.c.get());
            case 25:
                return new com.yandex.passport.internal.sso.l((com.yandex.passport.internal.properties.p) this.b.get(), (com.yandex.passport.internal.flags.j) this.c.get());
            case 26:
                return new com.yandex.passport.internal.ui.lang.a((Context) this.b.get(), (com.yandex.passport.internal.helper.g) this.c.get());
            case 27:
                return new com.yandex.passport.internal.upgrader.n((com.yandex.passport.internal.core.accounts.g) this.b.get(), (com.yandex.passport.common.a) this.c.get());
            case 28:
                return new com.yandex.passport.internal.usecase.m((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.storage.i) this.c.get());
            default:
                return new com.yandex.passport.internal.usecase.q((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.d) this.c.get());
        }
    }
}
