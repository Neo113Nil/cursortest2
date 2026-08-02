package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.k9;
import com.yandex.passport.internal.report.yd;

/* loaded from: classes2.dex */
public final class p0 extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public p0(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.E.getValue(aVar, com.yandex.passport.internal.features.a.J[28])).booleanValue();
    }

    public final void j(Uid uid) {
        f(k9.w, new yd(uid));
    }
}
