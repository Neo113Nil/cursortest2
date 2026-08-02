package com.yandex.go.scooters.passes;

import defpackage.ggo0;
import defpackage.gyc;
import defpackage.h55;
import defpackage.m950;
import defpackage.oeo0;
import defpackage.tje;
import defpackage.weo0;

/* loaded from: classes13.dex */
public final class i extends h55 implements m950 {
    public final gyc D;
    public final oeo0 E;

    public i(gyc gycVar, oeo0 oeo0Var) {
        super(null);
        this.D = gycVar;
        this.E = oeo0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ggo0 ggo0Var = ((weo0) obj).a;
        tje.N(o(), null, null, new ScootersPassesRouterImpl$onLaunch85eR80$$inlined$collectIn$1(kotlinx.coroutines.flow.e.c(this.E.a), null, this), 3);
        tje.N(o(), null, null, new ScootersPassesRouterImpl$onLaunch$2(this, ggo0Var, null), 3);
    }
}
