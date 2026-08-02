package com.yandex.go.scooters.misc.common_dialog;

import android.content.Context;
import defpackage.lf2;
import defpackage.pav;
import defpackage.q7n0;
import defpackage.s7n0;
import defpackage.u7n0;
import defpackage.w030;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final u7n0 G;

    public a(w030 w030Var, u7n0 u7n0Var) {
        super(null);
        this.F = w030Var;
        this.G = u7n0Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        s7n0 s7n0Var = (s7n0) obj;
        ScootersCommonDialogRouterImpl$provideModalView$2 scootersCommonDialogRouterImpl$provideModalView$2 = new ScootersCommonDialogRouterImpl$provideModalView$2(0, this, a.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
        lf2 lf2Var = this.G.a;
        return new ScootersCommonDialogModalView((Context) lf2Var.b.get(), (pav) lf2Var.c.get(), (q7n0) lf2Var.a.a, scootersCommonDialogRouterImpl$provideModalView$2, s7n0Var);
    }
}
