package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.yd;
import defpackage.scc;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class g extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public g(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.v.getValue(aVar, com.yandex.passport.internal.features.a.J[18])).booleanValue();
    }

    public final void j(com.yandex.passport.internal.core.announcing.e eVar) {
        ArrayList i = scc.i(new com.yandex.passport.internal.report.a(eVar.a(), 0, false));
        String c = eVar.c();
        if (c != null) {
            i.add(new md(c, 18, false));
        }
        String d = eVar.d();
        if (d != null) {
            i.add(new com.yandex.passport.internal.report.a(d, 20, false));
        }
        String b = eVar.b();
        if (b != null) {
            i.add(new md(b, 12, false));
        }
        i.add(new yd(eVar.e()));
        e(com.yandex.passport.internal.report.m0.w, i);
    }
}
