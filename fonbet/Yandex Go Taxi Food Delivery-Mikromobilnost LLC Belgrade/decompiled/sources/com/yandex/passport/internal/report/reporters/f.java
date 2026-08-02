package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.methods.l3;

/* loaded from: classes8.dex */
public final class f extends l3 {
    public final com.yandex.passport.internal.report.j b;
    public final com.yandex.passport.internal.features.a c;

    public f(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = jVar;
        this.c = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.c;
        return ((Boolean) aVar.f.getValue(aVar, com.yandex.passport.internal.features.a.J[2])).booleanValue();
    }
}
