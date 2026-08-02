package com.yandex.go.safety.center.instructions;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import defpackage.hrl0;
import defpackage.k7x0;
import defpackage.lsl0;
import defpackage.msl0;
import defpackage.p95;
import defpackage.psl0;
import defpackage.pwy0;
import defpackage.qu;
import defpackage.ssl0;
import defpackage.tje;

/* loaded from: classes13.dex */
public final class a extends p95 {
    public final k7x0 A;
    public final pwy0 B;
    public final SafetyCenterExperiment C;
    public final psl0 x;
    public final com.yandex.go.safety.center.analytics.a y;
    public final hrl0 z;

    public a(psl0 psl0Var, com.yandex.go.safety.center.analytics.a aVar, hrl0 hrl0Var, k7x0 k7x0Var, pwy0 pwy0Var, SafetyCenterExperiment safetyCenterExperiment) {
        super(lsl0.class);
        this.x = psl0Var;
        this.y = aVar;
        this.z = hrl0Var;
        this.A = k7x0Var;
        this.B = pwy0Var;
        this.C = safetyCenterExperiment;
    }

    @Override // defpackage.ad5, defpackage.zc5
    /* renamed from: Kg, reason: merged with bridge method [inline-methods] */
    public final void Bg(lsl0 lsl0Var) {
        super.Bg(lsl0Var);
        tje.N(Jg(), null, null, new SafetyCenterInstructionsPresenter$renderModalContent$1(this, null), 3);
        msl0 msl0Var = new msl0(this, 0);
        hrl0 hrl0Var = this.z;
        hrl0Var.c(msl0Var, false);
        hrl0Var.b(new msl0(this, 1));
    }

    @Override // defpackage.p95
    public final void onBackPressed() {
        ssl0 ssl0Var = this.x.a;
        if (ssl0Var.u()) {
            ssl0Var.r(new qu(9));
        }
    }
}
