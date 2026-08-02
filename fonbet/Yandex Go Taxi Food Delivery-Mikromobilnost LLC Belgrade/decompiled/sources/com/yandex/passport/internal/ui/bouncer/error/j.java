package com.yandex.passport.internal.ui.bouncer.error;

import com.yandex.passport.internal.ui.bouncer.model.b1;
import com.yandex.passport.internal.ui.bouncer.model.e1;
import com.yandex.passport.internal.ui.bouncer.model.h1;
import com.yandex.passport.internal.ui.bouncer.model.p2;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.roundabout.d0;
import com.yandex.passport.internal.ui.bouncer.roundabout.e0;
import com.yandex.passport.internal.ui.bouncer.roundabout.r;
import com.yandex.passport.internal.ui.bouncer.roundabout.s;
import com.yandex.passport.internal.ui.bouncer.t;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class j implements v7p {
    public final /* synthetic */ int a = 0;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final xvf0 g;

    public j(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, xvf0 xvf0Var) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.f;
        xvf0 xvf0Var = this.g;
        yvf0 yvf0Var2 = this.e;
        yvf0 yvf0Var3 = this.d;
        yvf0 yvf0Var4 = this.c;
        yvf0 yvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new a((h) xvf0Var.get(), (t) yvf0Var5.get(), (com.yandex.passport.common.common.a) yvf0Var4.get(), (com.yandex.passport.common.analytics.d) yvf0Var3.get(), (com.yandex.passport.internal.clipboard.a) yvf0Var2.get(), (com.yandex.passport.internal.properties.p) yvf0Var.get());
            case 1:
                h1 h1Var = (h1) yvf0Var5.get();
                com.yandex.passport.internal.ui.bouncer.model.middleware.a aVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.a) yvf0Var4.get();
                com.yandex.passport.internal.ui.bouncer.model.middleware.b bVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.b) yvf0Var3.get();
                p2 p2Var = (p2) yvf0Var2.get();
                b1 b1Var = (b1) yvf0Var.get();
                return new e1((s1) xvf0Var.get(), h1Var, aVar, bVar, p2Var, b1Var.c, b1Var);
            default:
                return new r((s) yvf0Var5.get(), (t) yvf0Var4.get(), (d0) yvf0Var3.get(), (e0) yvf0Var2.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.b) xvf0Var.get(), (com.yandex.passport.internal.properties.p) yvf0Var.get());
        }
    }

    public j(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, xvf0 xvf0Var, yvf0 yvf0Var5) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.g = xvf0Var;
        this.f = yvf0Var5;
    }

    public j(xvf0 xvf0Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5) {
        this.g = xvf0Var;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
    }
}
