package com.yandex.go.chargers;

import com.yandex.go.chargers.order.ChargersOrderStationOpenReason;
import defpackage.gpa;
import defpackage.qu;
import defpackage.rca;
import defpackage.s2a;
import defpackage.tje;
import defpackage.tsa;
import defpackage.zca;

/* loaded from: classes12.dex */
public final class d implements zca {
    public final /* synthetic */ e a;
    public final /* synthetic */ s2a b;
    public final /* synthetic */ rca c;

    public d(e eVar, s2a s2aVar, rca rcaVar) {
        this.a = eVar;
        this.b = s2aVar;
        this.c = rcaVar;
    }

    @Override // defpackage.zca
    public final void K0() {
        this.a.V(this.b);
    }

    @Override // defpackage.zca
    public final void M() {
        this.a.V(this.b);
    }

    @Override // defpackage.zca
    public final void O0(tsa tsaVar, ChargersOrderStationOpenReason chargersOrderStationOpenReason) {
        e eVar = this.a;
        tje.N(eVar.o(), null, null, new ChargersRouterImpl$startOrderRouter$1$onOpenStationDetails$1(eVar, this.b, tsaVar, chargersOrderStationOpenReason, null), 3);
    }

    @Override // defpackage.zca
    public final void R() {
        e eVar = this.a;
        eVar.S(new gpa(0, eVar, this.b, this.c));
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.zca
    public final void e1() {
        e.P(this.a, this.b);
    }

    @Override // defpackage.zca
    public final void i() {
        this.a.U(this.b);
    }
}
