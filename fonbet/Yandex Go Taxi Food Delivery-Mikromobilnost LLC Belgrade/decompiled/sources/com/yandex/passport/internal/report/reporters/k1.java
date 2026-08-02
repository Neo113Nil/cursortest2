package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.tc;
import com.yandex.passport.internal.report.yd;

/* loaded from: classes15.dex */
public final class k1 extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public k1(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.B.getValue(aVar, com.yandex.passport.internal.features.a.J[25])).booleanValue();
    }

    public final void j(WebCardReporter$Source2Fa webCardReporter$Source2Fa) {
        f(tc.w, new yd(webCardReporter$Source2Fa));
    }
}
