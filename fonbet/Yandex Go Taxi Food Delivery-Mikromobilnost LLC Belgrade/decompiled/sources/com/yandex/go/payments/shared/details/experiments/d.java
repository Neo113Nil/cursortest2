package com.yandex.go.payments.shared.details.experiments;

import com.yandex.go.payments.shared.details.experiments.ForceZaloginForFamilyExperiment;
import defpackage.d6z;
import defpackage.jbh;
import defpackage.m2s;
import defpackage.mbp;
import defpackage.qqo;
import defpackage.rqo;

/* loaded from: classes13.dex */
public final class d implements m2s {
    public final qqo a;

    public d(rqo rqoVar) {
        this.a = ((jbh) rqoVar).c(ForceZaloginForFamilyExperiment.f);
    }

    public final ForceZaloginForFamilyExperiment a() {
        return (ForceZaloginForFamilyExperiment) this.a.b();
    }

    public final mbp b(ForceZaloginForFamilyExperiment.Screen screen) {
        return new mbp(d6z.Y(a(), screen.a), d6z.Y(a(), screen.b), screen.c, d6z.Y(a(), screen.d));
    }
}
