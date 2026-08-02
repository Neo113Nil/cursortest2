package com.yandex.go.vault.router;

import android.content.Context;
import com.yandex.go.vault.ui.PrizeModalView;
import defpackage.i331;
import defpackage.k7x0;
import defpackage.l331;
import defpackage.pav;
import defpackage.q4f0;
import defpackage.w030;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final Context F;
    public final w030 G;
    public final q4f0 H;
    public final k7x0 I;
    public final pav J;
    public final i331 K;

    public a(Context context, w030 w030Var, q4f0 q4f0Var, k7x0 k7x0Var, pav pavVar, i331 i331Var) {
        super(null);
        this.F = context;
        this.G = w030Var;
        this.H = q4f0Var;
        this.I = k7x0Var;
        this.J = pavVar;
        this.K = i331Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.G;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return false;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        PrizeModalViewRouter$provideModalView$2 prizeModalViewRouter$provideModalView$2 = new PrizeModalViewRouter$provideModalView$2(0, this, a.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
        pav pavVar = this.J;
        i331 i331Var = this.K;
        return new PrizeModalView(this.F, (l331) obj, prizeModalViewRouter$provideModalView$2, this.H, this.I, pavVar, i331Var);
    }
}
