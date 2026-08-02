package com.yandex.go.flex.common.facade.routers;

import android.content.Context;
import com.yandex.go.flex.common.facade.routers.views.SlidableFlexView;
import defpackage.e2x0;
import defpackage.fkr;
import defpackage.nir;
import defpackage.qhr;
import defpackage.u45;
import defpackage.w030;
import defpackage.yhr;

/* loaded from: classes12.dex */
public final class b extends fkr {
    public final Context G;
    public final w030 H;
    public final yhr I;
    public final e2x0 J;

    public b(Context context, w030 w030Var, yhr yhrVar, e2x0 e2x0Var) {
        this.G = context;
        this.H = w030Var;
        this.I = yhrVar;
        this.J = e2x0Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.H;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        qhr qhrVar = (qhr) obj;
        return new SlidableFlexView(this.G, qhrVar, ((nir) this.I).a(qhrVar), this.J, new SlidableFlexModalViewRouter$provideModalView$1(0, this, b.class, "goBackIfAttached", "goBackIfAttached()V", 0));
    }
}
