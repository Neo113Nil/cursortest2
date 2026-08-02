package com.yandex.go.flex.common.facade.routers;

import android.content.Context;
import com.yandex.go.flex.common.facade.routers.views.FullscreenFlexView;
import defpackage.cgl0;
import defpackage.e2x0;
import defpackage.fkr;
import defpackage.nhr;
import defpackage.nir;
import defpackage.rmr;
import defpackage.u45;
import defpackage.w030;
import defpackage.yhr;

/* loaded from: classes12.dex */
public final class a extends fkr {
    public final Context G;
    public final w030 H;
    public final yhr I;
    public final e2x0 J;
    public rmr K;

    public a(Context context, w030 w030Var, yhr yhrVar, e2x0 e2x0Var) {
        this.G = context;
        this.H = w030Var;
        this.I = yhrVar;
        this.J = e2x0Var;
    }

    @Override // defpackage.fkr, defpackage.h55
    public final void I(Object obj) {
        this.F = null;
        this.K = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.K = ((nhr) obj).l;
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
        nhr nhrVar = (nhr) obj;
        return new FullscreenFlexView(this.G, nhrVar, ((nir) this.I).a(nhrVar), this.J, new FullscreenFlexModalViewRouter$provideModalView$1(0, this, a.class, "goBackIfAttached", "goBackIfAttached()V", 0));
    }

    @Override // defpackage.fkr
    public final void T(cgl0 cgl0Var) {
        rmr rmrVar = this.K;
        if (rmrVar != null) {
            rmrVar.b();
        }
        super.T(cgl0Var);
    }
}
