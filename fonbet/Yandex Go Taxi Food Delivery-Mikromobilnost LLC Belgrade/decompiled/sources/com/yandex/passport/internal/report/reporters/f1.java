package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.methods.l3;

/* loaded from: classes8.dex */
public final class f1 extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public f1(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.m.getValue(aVar, com.yandex.passport.internal.features.a.J[9])).booleanValue();
    }
}
