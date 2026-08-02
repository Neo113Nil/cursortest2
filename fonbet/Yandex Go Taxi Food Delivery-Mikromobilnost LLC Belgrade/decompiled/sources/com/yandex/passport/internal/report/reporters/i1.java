package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.qc;

/* loaded from: classes8.dex */
public final class i1 extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public i1(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.F.getValue(aVar, com.yandex.passport.internal.features.a.J[29])).booleanValue();
    }

    public final void j(String str, WebAmReporter$Companion$EventPlace webAmReporter$Companion$EventPlace) {
        f(qc.w, new com.yandex.passport.internal.report.i(str, 1), new md(webAmReporter$Companion$EventPlace.getPlace(), 6));
    }
}
