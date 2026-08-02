package com.yandex.passport.internal.report.diary;

import android.content.Context;
import com.yandex.passport.internal.core.accounts.t;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.report.reporters.d1;
import com.yandex.passport.internal.report.reporters.e0;
import com.yandex.passport.internal.report.reporters.e1;
import com.yandex.passport.internal.report.reporters.g1;
import com.yandex.passport.internal.report.reporters.j0;
import com.yandex.passport.internal.report.reporters.j1;
import com.yandex.passport.internal.report.reporters.q;
import com.yandex.passport.internal.report.reporters.r;
import com.yandex.passport.internal.report.reporters.s;
import com.yandex.passport.internal.report.reporters.u0;
import com.yandex.passport.internal.report.reporters.v;
import com.yandex.passport.internal.report.reporters.v0;
import com.yandex.passport.internal.report.reporters.y;
import com.yandex.passport.internal.report.reporters.z0;
import com.yandex.passport.internal.usecase.f1;
import com.yandex.passport.internal.usecase.o0;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class m implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;

    public /* synthetic */ m(yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.b;
        switch (i) {
            case 0:
                return new l((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 1:
                return new com.yandex.passport.internal.report.reporters.a((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 2:
                return new com.yandex.passport.internal.report.reporters.b((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 3:
                return new com.yandex.passport.internal.report.reporters.c((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 4:
                return new com.yandex.passport.internal.report.reporters.l((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 5:
                return new q((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 6:
                return new r((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 7:
                return new s((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 8:
                return new v((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 9:
                return new y((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 10:
                return new e0((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 11:
                return new j0((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 12:
                return new u0((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 13:
                return new v0((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 14:
                return new z0((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 15:
                return new d1((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 16:
                return new e1((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 17:
                return new g1((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 18:
                return new j1((com.yandex.passport.internal.report.j) yvf0Var.get());
            case 19:
                return new com.yandex.passport.internal.sloth.c((Context) yvf0Var.get());
            case 20:
                return new com.yandex.passport.internal.sloth.e((com.yandex.passport.internal.usecase.authorize.b) yvf0Var.get());
            case 21:
                return new com.yandex.passport.internal.sloth.f((com.yandex.passport.internal.network.e) yvf0Var.get());
            case 22:
                return new com.yandex.passport.internal.sloth.performers.a((Context) yvf0Var.get());
            case 23:
                return new com.yandex.passport.internal.sloth.performers.b((com.yandex.passport.internal.sloth.k) yvf0Var.get());
            case 24:
                return new com.yandex.passport.internal.sloth.performers.d((Context) yvf0Var.get());
            case 25:
                return new com.yandex.passport.internal.sloth.performers.h((p) yvf0Var.get());
            case 26:
                return new com.yandex.passport.internal.storage.i((Context) yvf0Var.get());
            case 27:
                return new com.yandex.passport.internal.ui.bouncer.model.sloth.a((com.yandex.passport.internal.sloth.performers.j) yvf0Var.get());
            case 28:
                return new o0((t) yvf0Var.get());
            default:
                return new com.yandex.passport.internal.usecase.g1((f1) yvf0Var.get());
        }
    }
}
