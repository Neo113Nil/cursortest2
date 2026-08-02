package com.yandex.go.superapp.discovery.map.impl.navigation.taxi;

import defpackage.ayv0;
import defpackage.f09;
import defpackage.g09;
import defpackage.h55;
import defpackage.tje;
import defpackage.y2s0;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes14.dex */
public final class a extends h55 {
    public final g09 D;
    public final f09 E;
    public final ayv0 F;
    public final y2s0 G;

    public a(g09 g09Var, f09 f09Var, ayv0 ayv0Var, y2s0 y2s0Var) {
        super(null);
        this.D = g09Var;
        this.E = f09Var;
        this.F = ayv0Var;
        this.G = y2s0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new SuperAppDiscoveryMapTaxiRouter$onLaunch$1(this, null), 1);
    }
}
