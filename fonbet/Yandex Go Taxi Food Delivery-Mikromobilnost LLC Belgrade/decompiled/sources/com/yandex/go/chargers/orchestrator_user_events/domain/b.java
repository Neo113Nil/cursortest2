package com.yandex.go.chargers.orchestrator_user_events.domain;

import com.yandex.go.chargers.orchestrator_user_events.api.ChargersOrchestratorUserEventType;
import defpackage.bo5;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.qhw0;
import defpackage.saa;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes12.dex */
public final class b implements saa {
    public final a a;
    public final bo5 b;
    public final ike c;

    public b(tt2 tt2Var, a aVar, bo5 bo5Var) {
        this.a = aVar;
        this.b = bo5Var;
        qhw0 a = jl40.a();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.c = bvf0.a(cvw.U(a, mdh.b));
    }

    public final void a(ChargersOrchestratorUserEventType chargersOrchestratorUserEventType) {
        tje.N(this.c, null, null, new ChargersOrchestratorUserEventsInteractorImpl$sendUserEvent$1(this, chargersOrchestratorUserEventType, null), 3);
    }
}
