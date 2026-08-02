package com.yandex.go.chargers.subscription;

import com.yandex.go.chargers.subscription.domain.b;
import com.yandex.go.chargers.subscription.domain.c;
import defpackage.aua;
import defpackage.bua;
import defpackage.cua;
import defpackage.dua;
import defpackage.g6;
import defpackage.gma;
import defpackage.h55;
import defpackage.jl40;
import defpackage.m950;
import defpackage.tje;
import defpackage.w511;
import defpackage.yua;
import defpackage.yvf0;
import defpackage.zua;

/* loaded from: classes12.dex */
public final class a extends h55 implements m950 {
    public final b D;
    public final yvf0 E;
    public final yvf0 F;
    public final c G;
    public final yvf0 H;
    public final g6 I;

    public a(b bVar, yvf0 yvf0Var, yvf0 yvf0Var2, c cVar, yvf0 yvf0Var3, g6 g6Var) {
        super(null);
        this.D = bVar;
        this.E = yvf0Var;
        this.F = yvf0Var2;
        this.G = cVar;
        this.H = yvf0Var3;
        this.I = g6Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        dua duaVar = (dua) obj;
        tje.N(o(), null, null, new ChargersSubscriptionRouterImpl$onLaunch$1(this, null), 3);
        if (jl40.l(duaVar, aua.a)) {
            z((m950) this.E.get(), new yua(this, 1));
            tje.N(o(), null, null, new ChargersSubscriptionRouterImpl$chooseAndOpenSubscriptionByStatus$2(this, null), 3);
        } else if (duaVar instanceof bua) {
            A((m950) this.F.get(), new gma(((bua) duaVar).a), new yua(this, 0));
        } else if (jl40.l(duaVar, cua.a)) {
            z((m950) this.H.get(), new zua(this));
        } else {
            w511.b();
        }
    }
}
