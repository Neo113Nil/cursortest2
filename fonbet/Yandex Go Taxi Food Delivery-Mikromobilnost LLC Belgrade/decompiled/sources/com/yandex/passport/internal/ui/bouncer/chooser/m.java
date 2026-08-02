package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.middleware.c1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.r1;
import com.yandex.passport.internal.usecase.h0;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class m implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;

    public /* synthetic */ m(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.e;
        yvf0 yvf0Var2 = this.d;
        yvf0 yvf0Var3 = this.c;
        yvf0 yvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new l((BouncerActivity) yvf0Var4.get(), (com.yandex.passport.internal.ui.bouncer.t) yvf0Var3.get(), (a) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.s) yvf0Var.get());
            case 1:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.a0((h0) yvf0Var4.get(), (com.yandex.passport.internal.usecase.ui.x) yvf0Var3.get(), (com.yandex.passport.internal.usecase.ui.g) yvf0Var2.get(), (com.yandex.passport.internal.flags.j) yvf0Var.get());
            case 2:
                return new c1((com.yandex.passport.internal.properties.p) yvf0Var4.get(), (com.yandex.passport.internal.flags.j) yvf0Var3.get(), (com.yandex.passport.internal.report.reporters.m) yvf0Var2.get(), (com.yandex.passport.internal.core.accounts.n) yvf0Var.get());
            case 3:
                return new r1((com.yandex.passport.internal.flags.j) yvf0Var4.get(), (com.yandex.passport.internal.network.e) yvf0Var3.get(), (com.yandex.passport.internal.account.a) yvf0Var2.get(), (com.yandex.passport.internal.filter.i) yvf0Var.get());
            default:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.e((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.l) yvf0Var3.get(), (com.yandex.passport.internal.report.reporters.n) yvf0Var2.get(), (com.yandex.passport.internal.flags.j) yvf0Var.get());
        }
    }
}
