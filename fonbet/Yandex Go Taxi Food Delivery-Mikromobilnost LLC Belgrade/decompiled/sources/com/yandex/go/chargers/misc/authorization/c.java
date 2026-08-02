package com.yandex.go.chargers.misc.authorization;

import defpackage.h55;
import defpackage.i3y;
import defpackage.ju8;
import defpackage.qu;
import defpackage.tje;
import defpackage.yvf0;

/* loaded from: classes12.dex */
public final class c extends h55 {
    public final yvf0 D;
    public final yvf0 E;
    public final a F;
    public final i3y G;

    public c(yvf0 yvf0Var, yvf0 yvf0Var2, a aVar) {
        super(null);
        this.D = yvf0Var;
        this.E = yvf0Var2;
        this.F = aVar;
        this.G = kotlin.a.a(new ju8(19, this));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        if (this.F.b.b()) {
            r(new qu(9));
        } else {
            tje.N(o(), null, null, new ChargersAuthorizationRouterImpl$launchLogin$1(this, null), 3);
        }
    }
}
