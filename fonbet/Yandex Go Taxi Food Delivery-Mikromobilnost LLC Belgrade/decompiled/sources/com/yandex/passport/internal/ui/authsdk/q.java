package com.yandex.passport.internal.ui.authsdk;

import android.app.Activity;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class q implements v7p {
    public final /* synthetic */ int a = 0;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final xvf0 e;
    public final yvf0 f;

    public q(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, xvf0 xvf0Var, yvf0 yvf0Var4) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = xvf0Var;
        this.f = yvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.f;
        xvf0 xvf0Var = this.e;
        yvf0 yvf0Var2 = this.d;
        yvf0 yvf0Var3 = this.c;
        yvf0 yvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new p((Activity) yvf0Var4.get(), (com.yandex.passport.internal.ui.bouncer.error.h) xvf0Var.get(), (com.yandex.passport.common.common.a) yvf0Var3.get(), (com.yandex.passport.common.analytics.d) yvf0Var2.get(), (com.yandex.passport.internal.clipboard.a) yvf0Var.get());
            default:
                return new com.yandex.passport.internal.ui.bouncer.sloth.g((com.yandex.passport.internal.ui.sloth.l) yvf0Var4.get(), (com.yandex.passport.internal.ui.bouncer.sloth.a) yvf0Var3.get(), (com.yandex.passport.internal.ui.bouncer.sloth.i) yvf0Var2.get(), (com.yandex.passport.sloth.ui.dependencies.p) xvf0Var.get(), (com.yandex.passport.internal.properties.p) yvf0Var.get());
        }
    }

    public q(yvf0 yvf0Var, xvf0 xvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4) {
        this.b = yvf0Var;
        this.e = xvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.f = yvf0Var4;
    }
}
