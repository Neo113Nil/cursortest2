package com.yandex.go.safety.center.car.crash.status;

import com.yandex.go.safety.center.api.AccidentsResponse;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import defpackage.fql0;
import defpackage.k7x0;
import defpackage.ndl0;
import defpackage.p95;
import defpackage.ppl0;
import defpackage.pwy0;
import defpackage.qql0;
import defpackage.qu;
import defpackage.tje;
import defpackage.tse0;
import defpackage.tt2;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class a extends p95 {
    public final com.yandex.go.safety.center.analytics.a A;
    public final AccidentsResponse.Accident B;
    public final j C;
    public final k7x0 D;
    public final pwy0 E;
    public boolean F;
    public final SafetyCenterExperiment x;
    public final tt2 y;
    public final ndl0 z;

    public a(SafetyCenterExperiment safetyCenterExperiment, tt2 tt2Var, ndl0 ndl0Var, com.yandex.go.safety.center.analytics.a aVar, AccidentsResponse.Accident accident, j jVar, k7x0 k7x0Var, pwy0 pwy0Var) {
        super(fql0.class);
        this.x = safetyCenterExperiment;
        this.y = tt2Var;
        this.z = ndl0Var;
        this.A = aVar;
        this.B = accident;
        this.C = jVar;
        this.D = k7x0Var;
        this.E = pwy0Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    /* renamed from: Kg, reason: merged with bridge method [inline-methods] */
    public final void Bg(fql0 fql0Var) {
        super.Bg(fql0Var);
        tje.N(Jg(), null, null, new SafetyCenterCarCrashStatusAnswerPresenter$renderModalContent$1(this, null), 3);
        ppl0 ppl0Var = this.A.a;
        ppl0Var.a.a("SafetyCenter.CarCrash.StatusCardShown", tse0.o(ppl0Var), 1, new HashMap());
        this.F = true;
        int i = this.x.f.c;
        if (i > 0) {
            tje.N(Jg(), null, null, new SafetyCenterCarCrashStatusAnswerPresenter$handleAccident$1(i, this, null), 3);
        }
    }

    @Override // defpackage.p95
    public final void onBackPressed() {
        ((qql0) this.z.b).r(new qu(9));
    }
}
