package com.yandex.go.safety.center.contacts;

import defpackage.drl0;
import defpackage.h55;
import defpackage.itl0;
import defpackage.ng11;
import defpackage.rpl0;
import defpackage.tje;
import defpackage.w030;
import defpackage.yvf0;

/* loaded from: classes13.dex */
public final class b extends h55 {
    public final ng11 D;
    public final yvf0 E;
    public final drl0 F;
    public final w030 G;
    public final rpl0 H;

    public b(ng11 ng11Var, yvf0 yvf0Var, drl0 drl0Var, w030 w030Var) {
        super(null);
        this.D = ng11Var;
        this.E = yvf0Var;
        this.F = drl0Var;
        this.G = w030Var;
        this.H = new rpl0(w030Var);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.H.a();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new SafetyCenterContactsRouter$onLaunch$1(this, (itl0) obj, null), 3);
    }
}
