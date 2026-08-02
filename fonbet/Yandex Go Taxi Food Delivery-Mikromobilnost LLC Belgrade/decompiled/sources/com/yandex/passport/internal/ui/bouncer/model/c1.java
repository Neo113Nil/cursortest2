package com.yandex.passport.internal.ui.bouncer.model;

import android.app.Activity;
import com.yandex.passport.internal.report.zd;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class c1 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final xvf0 c;

    public c1(xvf0 xvf0Var, yvf0 yvf0Var) {
        this.a = 4;
        this.c = xvf0Var;
        this.b = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        yvf0 yvf0Var = this.b;
        switch (i) {
            case 0:
                return new b1((a) yvf0Var.get(), (zd) xvf0Var.get());
            case 1:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.p1((com.yandex.passport.internal.ui.bouncer.model.sloth.b) yvf0Var.get(), (b1) xvf0Var.get());
            case 2:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.s((Activity) yvf0Var.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.l) xvf0Var.get());
            case 3:
                return new com.yandex.passport.internal.ui.sloth.authsdk.f0((com.yandex.passport.internal.ui.sloth.l) yvf0Var.get(), (com.yandex.passport.internal.ui.sloth.f0) xvf0Var.get());
            case 4:
                return new com.yandex.passport.internal.ui.sloth.menu.q((com.yandex.passport.internal.ui.sloth.menu.h) xvf0Var.get(), (com.yandex.passport.sloth.ui.string.a) yvf0Var.get());
            case 5:
                return new com.yandex.passport.internal.ui.sloth.webcard.z0((Activity) yvf0Var.get(), (com.yandex.passport.internal.ui.sloth.webcard.v0) xvf0Var.get());
            default:
                return new com.yandex.passport.sloth.command.performers.i((com.yandex.passport.sloth.v) yvf0Var.get(), (com.yandex.passport.sloth.command.performers.h) xvf0Var.get());
        }
    }

    public /* synthetic */ c1(yvf0 yvf0Var, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = xvf0Var;
    }
}
