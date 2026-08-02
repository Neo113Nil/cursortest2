package com.yandex.go.superapp.discovery.map.impl.navigation.common;

import defpackage.m230;
import defpackage.p1j0;
import defpackage.rvv0;
import defpackage.tje;
import defpackage.wvv0;
import defpackage.yio0;
import defpackage.yvf0;

/* loaded from: classes14.dex */
public abstract class a extends m230 {
    public final rvv0 E;
    public final boolean F;

    public a(rvv0 rvv0Var) {
        super(null);
        this.E = rvv0Var;
        this.F = true;
    }

    public static void T(a aVar, yvf0 yvf0Var, wvv0 wvv0Var, yio0 yio0Var) {
        tje.N(aVar.o(), null, null, new SuperAppDiscoveryMapBaseModalViewRouter$launchChildRouter$1(aVar, wvv0Var, yvf0Var, yio0Var, p1j0.a, null), 3);
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.F;
    }
}
