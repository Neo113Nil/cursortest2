package com.yandex.go.promocodes;

import android.content.Context;
import com.yandex.go.promocodes.view.PromocodesWithActiveOrderDetailsView;
import defpackage.m230;
import defpackage.u45;
import defpackage.w030;

/* loaded from: classes13.dex */
public final class e extends m230 {
    public final Context E;
    public final w030 F;

    public e(w030 w030Var, Context context) {
        super(null);
        this.E = context;
        this.F = w030Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        return new PromocodesWithActiveOrderDetailsView(this.E, new PromocodesWithActiveOrderDetailsRouterImpl$provideModalView$1(0, this, e.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0));
    }
}
