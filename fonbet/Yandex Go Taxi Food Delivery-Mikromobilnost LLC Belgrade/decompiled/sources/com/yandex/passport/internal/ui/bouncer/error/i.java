package com.yandex.passport.internal.ui.bouncer.error;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.internal.report.reporters.q0;
import com.yandex.passport.internal.ui.bouncer.t;
import com.yandex.passport.internal.ui.sloth.f0;
import com.yandex.passport.internal.ui.sloth.webcard.v0;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.ui.a1;
import com.yandex.passport.sloth.ui.o0;
import com.yandex.passport.sloth.v;
import com.yandex.passport.sloth.z0;
import defpackage.n3w;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class i implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final v7p d;

    public i(com.yandex.passport.internal.ui.bouncer.fallback.d dVar, yvf0 yvf0Var, yvf0 yvf0Var2) {
        this.a = 1;
        this.d = dVar;
        this.b = yvf0Var;
        this.c = yvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        v7p v7pVar = this.d;
        yvf0 yvf0Var = this.c;
        yvf0 yvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new h((Activity) yvf0Var2.get(), (d) yvf0Var.get(), (g) ((q0) v7pVar).get());
            case 1:
                return new com.yandex.passport.internal.ui.bouncer.loading.j((com.yandex.passport.internal.ui.bouncer.loading.k) ((com.yandex.passport.internal.ui.bouncer.fallback.d) v7pVar).get(), (t) yvf0Var2.get(), (com.yandex.passport.internal.sloth.l) yvf0Var.get());
            case 2:
                return new v0((com.yandex.passport.internal.ui.sloth.l) yvf0Var2.get(), (f0) ((xvf0) yvf0Var).get(), (com.yandex.passport.sloth.ui.dependencies.o) ((com.yandex.passport.internal.ui.bouncer.f) v7pVar).get());
            case 3:
                return new com.yandex.passport.sloth.command.performers.m((Context) ((com.yandex.passport.sloth.dependencies.c) yvf0Var).get(), (v) yvf0Var2.get(), (SlothParams) ((n3w) v7pVar).a);
            case 4:
                return new a1((z0) yvf0Var2.get(), (v) yvf0Var.get(), (SlothParams) ((n3w) v7pVar).a);
            default:
                return new o0((Activity) ((com.yandex.passport.sloth.ui.dependencies.n) yvf0Var2).get(), (com.yandex.passport.sloth.ui.string.a) ((com.yandex.passport.sloth.ui.dependencies.n) yvf0Var).get(), (com.yandex.passport.sloth.ui.dependencies.o) ((com.yandex.passport.sloth.ui.dependencies.n) v7pVar).get());
        }
    }

    public /* synthetic */ i(yvf0 yvf0Var, yvf0 yvf0Var2, v7p v7pVar, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = v7pVar;
    }

    public i(com.yandex.passport.sloth.dependencies.c cVar, yvf0 yvf0Var, n3w n3wVar) {
        this.a = 3;
        this.c = cVar;
        this.b = yvf0Var;
        this.d = n3wVar;
    }
}
