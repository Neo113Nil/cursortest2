package com.yandex.passport.internal.ui.sloth;

import android.app.Activity;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class m implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;

    public m(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, xvf0 xvf0Var, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7) {
        this.a = 2;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.i = xvf0Var;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
        this.h = yvf0Var7;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.h;
        yvf0 yvf0Var2 = this.g;
        yvf0 yvf0Var3 = this.f;
        yvf0 yvf0Var4 = this.i;
        yvf0 yvf0Var5 = this.e;
        yvf0 yvf0Var6 = this.d;
        yvf0 yvf0Var7 = this.c;
        yvf0 yvf0Var8 = this.b;
        switch (i) {
            case 0:
                return new l((Activity) yvf0Var8.get(), (k) yvf0Var7.get(), (com.yandex.passport.common.coroutine.e) yvf0Var6.get(), (g) yvf0Var5.get(), (com.yandex.passport.internal.sloth.l) yvf0Var3.get(), (com.yandex.passport.internal.common.e) yvf0Var2.get(), (h) yvf0Var.get(), (com.yandex.passport.internal.sloth.o) yvf0Var4.get());
            case 1:
                return new com.yandex.passport.internal.ui.sloth.menu.m((Activity) yvf0Var8.get(), (k) yvf0Var7.get(), (com.yandex.passport.common.coroutine.e) yvf0Var6.get(), (g) yvf0Var5.get(), (com.yandex.passport.internal.sloth.l) yvf0Var3.get(), (com.yandex.passport.internal.common.e) yvf0Var2.get(), (h) yvf0Var.get(), (com.yandex.passport.internal.sloth.o) yvf0Var4.get());
            default:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.v((BouncerActivity) yvf0Var8.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.r) yvf0Var7.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.q) yvf0Var6.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.m) yvf0Var5.get(), (com.yandex.passport.internal.ui.bouncer.roundabout.e) ((xvf0) yvf0Var4).get(), (com.yandex.passport.internal.ui.bouncer.t) yvf0Var3.get(), (com.yandex.passport.internal.report.reporters.n) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.l) yvf0Var.get());
        }
    }

    public /* synthetic */ m(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
        this.h = yvf0Var7;
        this.i = yvf0Var8;
    }
}
