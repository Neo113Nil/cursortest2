package com.yandex.go.safety.center.car.crash.share;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import defpackage.fkr0;
import defpackage.hrl0;
import defpackage.ia5;
import defpackage.k7x0;
import defpackage.kk5;
import defpackage.mo21;
import defpackage.pgk0;
import defpackage.po21;
import defpackage.pwy0;
import defpackage.q3u0;
import defpackage.qu;
import defpackage.tje;
import defpackage.zpl0;

/* loaded from: classes13.dex */
public final class a extends ia5 {
    public final j A;
    public final po21 B;
    public final com.yandex.go.safety.center.analytics.a C;
    public final fkr0 D;
    public final k7x0 E;
    public final SafetyCenterExperiment F;
    public final pwy0 G;
    public mo21 H;
    public final pgk0 z;

    public a(hrl0 hrl0Var, pgk0 pgk0Var, j jVar, po21 po21Var, com.yandex.go.safety.center.analytics.a aVar, fkr0 fkr0Var, k7x0 k7x0Var, SafetyCenterExperiment safetyCenterExperiment, pwy0 pwy0Var, q3u0 q3u0Var) {
        super(zpl0.class, q3u0Var, hrl0Var);
        this.z = pgk0Var;
        this.A = jVar;
        this.B = po21Var;
        this.C = aVar;
        this.D = fkr0Var;
        this.E = k7x0Var;
        this.F = safetyCenterExperiment;
        this.G = pwy0Var;
    }

    @Override // defpackage.ia5, defpackage.ad5, defpackage.zc5
    /* renamed from: Kg, reason: merged with bridge method [inline-methods] */
    public final void Bg(zpl0 zpl0Var) {
        super.Bg(zpl0Var);
        tje.N(Jg(), null, null, new SafetyCenterCarCrashSharePresenter$renderModalContent$1(this, null), 3);
        tje.N(Jg(), null, null, new SafetyCenterCarCrashSharePresenter$updateLocation$1(this, null), 3);
    }

    @Override // defpackage.p95
    public final void onBackPressed() {
        ((kk5) this.z.b).r(new qu(9));
    }
}
