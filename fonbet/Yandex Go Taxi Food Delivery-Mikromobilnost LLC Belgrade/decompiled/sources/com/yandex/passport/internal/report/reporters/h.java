package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.methods.l3;
import defpackage.fd20;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class h extends l3 {
    public final com.yandex.passport.internal.features.a b;
    public String c;
    public String w;
    public String x;

    public h(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
        this.x = "";
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.A.getValue(aVar, com.yandex.passport.internal.features.a.J[24])).booleanValue();
    }

    public final void j(fd20 fd20Var, String str) {
        f(fd20Var, new com.yandex.passport.internal.report.i(this.x, 9, false), new com.yandex.passport.internal.report.f("caller_app_id", String.valueOf(this.c)), new com.yandex.passport.internal.report.f("caller_fingerprint", String.valueOf(this.w)), new com.yandex.passport.internal.report.f(ClidProvider.STATE, str));
    }
}
