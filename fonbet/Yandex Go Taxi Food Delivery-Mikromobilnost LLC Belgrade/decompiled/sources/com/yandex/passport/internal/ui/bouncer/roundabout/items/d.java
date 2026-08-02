package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import com.yandex.passport.internal.ui.sloth.f0;
import com.yandex.passport.sloth.ui.c1;
import com.yandex.passport.sloth.ui.g2;
import com.yandex.passport.sloth.ui.o0;
import com.yandex.passport.sloth.ui.t0;
import com.yandex.passport.sloth.z0;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class d implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final xvf0 d;

    public /* synthetic */ d(yvf0 yvf0Var, xvf0 xvf0Var, yvf0 yvf0Var2, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.d = xvf0Var;
        this.c = yvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.c;
        xvf0 xvf0Var = this.d;
        yvf0 yvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new c((Activity) yvf0Var2.get(), (com.yandex.passport.internal.ui.bouncer.t) yvf0Var.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.a) xvf0Var.get());
            case 1:
                return new u((Activity) yvf0Var2.get(), (com.yandex.passport.internal.ui.bouncer.t) yvf0Var.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.a) xvf0Var.get());
            case 2:
                return new com.yandex.passport.internal.ui.sloth.a0((com.yandex.passport.internal.ui.sloth.l) yvf0Var2.get(), (f0) yvf0Var.get(), (com.yandex.passport.sloth.ui.dependencies.o) xvf0Var.get());
            case 3:
                return new com.yandex.passport.internal.ui.sloth.menu.h((com.yandex.passport.internal.ui.sloth.menu.p) yvf0Var2.get(), (Activity) yvf0Var.get(), (com.yandex.passport.sloth.ui.string.a) xvf0Var.get());
            case 4:
                return new com.yandex.passport.internal.ui.sloth.menu.p((com.yandex.passport.internal.ui.sloth.menu.m) yvf0Var2.get(), (com.yandex.passport.internal.ui.bouncer.sloth.a) yvf0Var.get(), (com.yandex.passport.internal.ui.sloth.menu.u) xvf0Var.get());
            case 5:
                return new com.yandex.passport.sloth.command.f((com.yandex.passport.sloth.command.k) yvf0Var2.get(), (com.yandex.passport.sloth.command.p) xvf0Var.get(), (z0) yvf0Var.get());
            case 6:
                return new t0((o0) yvf0Var2.get(), (com.yandex.passport.sloth.ui.string.a) yvf0Var.get(), (c1) xvf0Var.get());
            default:
                return new com.yandex.passport.internal.ui.challenge.vpn.o((t0) yvf0Var2.get(), (g2) xvf0Var.get(), (c1) yvf0Var.get());
        }
    }

    public /* synthetic */ d(yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = xvf0Var;
    }
}
