package com.yandex.go.intercity.flex.dashboard.presentation;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.intercity.flex.dashboard.view.IntercityDashboardFlexSdkView;
import defpackage.ney;
import defpackage.qc5;
import defpackage.sew;
import defpackage.tje;
import defpackage.tt2;
import defpackage.wdw;
import defpackage.wgr;
import defpackage.y8w;

/* loaded from: classes12.dex */
public final class h extends qc5 {
    public final flex.engine.a A;
    public final g B;
    public final tt2 C;
    public final com.yandex.div.core.expression.variables.a D;
    public final wgr E;
    public final sew F;

    public h(flex.engine.a aVar, g gVar, tt2 tt2Var, com.yandex.div.core.expression.variables.a aVar2, wgr wgrVar, Lifecycle lifecycle) {
        super(wdw.class, new ney(lifecycle));
        this.A = aVar;
        this.B = gVar;
        this.C = tt2Var;
        this.D = aVar2;
        this.E = wgrVar;
        this.F = new sew(this);
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        sew sewVar = this.F;
        sewVar.getClass();
        sewVar.b = Lifecycle.State.STARTED;
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        sew sewVar = this.F;
        sewVar.getClass();
        sewVar.b = Lifecycle.State.RESUMED;
        y8w y8wVar = sewVar.a;
        if (y8wVar != null) {
            sewVar.a(y8wVar);
        }
    }

    public final void Mg(IntercityDashboardFlexSdkView intercityDashboardFlexSdkView) {
        Bg(intercityDashboardFlexSdkView);
        tje.N(Jg(), null, null, new IntercityDashboardFlexSdkPresenter$attachView$1(this, null), 3);
        tje.N(Jg(), null, null, new IntercityDashboardFlexSdkPresenter$attachView$2(this, null), 3);
    }
}
