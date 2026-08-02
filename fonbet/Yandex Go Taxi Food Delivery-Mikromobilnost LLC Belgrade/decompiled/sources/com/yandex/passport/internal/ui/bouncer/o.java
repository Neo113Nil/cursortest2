package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.report.zd;
import com.yandex.passport.internal.ui.bouncer.model.middleware.d0;
import com.yandex.passport.internal.usecase.o0;
import com.yandex.passport.internal.usecase.ui.c0;
import com.yandex.passport.internal.usecase.ui.z;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class o implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;

    public /* synthetic */ o(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.g;
        yvf0 yvf0Var2 = this.f;
        yvf0 yvf0Var3 = this.e;
        yvf0 yvf0Var4 = this.d;
        yvf0 yvf0Var5 = this.c;
        yvf0 yvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new BouncerComposeView((u) yvf0Var6.get(), (BouncerActivity) yvf0Var5.get(), ((Boolean) yvf0Var4.get()).booleanValue(), (AppTheme) yvf0Var3.get(), (zd) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.n) yvf0Var.get());
            default:
                return new d0((c0) yvf0Var6.get(), (z) yvf0Var5.get(), (com.yandex.passport.internal.badges.c) yvf0Var4.get(), (com.yandex.passport.internal.badges.f) yvf0Var3.get(), (o0) yvf0Var2.get(), (com.yandex.passport.internal.flags.j) yvf0Var.get());
        }
    }
}
