package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.t9;
import com.yandex.passport.internal.report.u9;
import com.yandex.passport.internal.report.yd;

/* loaded from: classes8.dex */
public final class s0 extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public s0(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.i.getValue(aVar, com.yandex.passport.internal.features.a.J[5])).booleanValue();
    }

    public final void j(Uid uid, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        f(t9.w, new yd(uid), new md(str, 9), new md(str2, 10), new com.yandex.passport.internal.report.i(str3, 1), new com.yandex.passport.internal.report.a(str4, 20, false), new com.yandex.passport.internal.report.a(str5, 1, false), new md(str6, 4), new md(str7, 7), new yd(str8, 12), new md(str9, 9));
    }

    public final void k(Uid uid, String str, String str2, String str3, String str4, String str5, String str6) {
        f(u9.w, new yd(uid), new com.yandex.passport.internal.report.a(str, 20, false), new com.yandex.passport.internal.report.a(str2, 1, false), new md(str3, 4), new md(str4, 7), new yd(str5, 12), new md(str6, 9));
    }
}
