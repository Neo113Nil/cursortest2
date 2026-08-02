package com.yandex.go.scooters.newbie;

import android.content.Context;
import defpackage.g2o0;
import defpackage.l7g;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.qwo0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u1o0;
import defpackage.w030;
import defpackage.wfd;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final class d extends pgd {
    public final Context F;
    public final w030 G;
    public final tt2 H;
    public final qwo0 I;
    public final com.yandex.go.scooters.domain.b J;
    public final ru.yandex.taxi.scooters.data.h K;
    public final l7g L;
    public final u1o0 M;
    public final mu5 N;

    public d(g2o0 g2o0Var, f fVar, Context context, w030 w030Var, tt2 tt2Var, qwo0 qwo0Var, com.yandex.go.scooters.domain.b bVar, ru.yandex.taxi.scooters.data.h hVar, l7g l7gVar, u1o0 u1o0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = tt2Var;
        this.I = qwo0Var;
        this.J = bVar;
        this.K = hVar;
        this.L = l7gVar;
        this.M = u1o0Var;
        this.N = new mu5(new a(this, g2o0Var, fVar));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        tje.N(o(), null, null, new ScootersNewbieRouter$onAttach$1(this, (zy11) obj, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.N;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
