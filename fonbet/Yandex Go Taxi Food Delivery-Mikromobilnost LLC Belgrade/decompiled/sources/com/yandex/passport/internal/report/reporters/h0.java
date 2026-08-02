package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.a8;
import com.yandex.passport.internal.report.c8;
import com.yandex.passport.internal.report.d8;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.y7;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.report.z7;
import defpackage.scc;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class h0 extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public h0(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.H.getValue(aVar, com.yandex.passport.internal.features.a.J[31])).booleanValue();
    }

    public final void j(Uid uid, String str, String str2, String str3) {
        boolean z = false;
        ArrayList i = scc.i(new jd(uid != null ? Long.valueOf(uid.getValue()) : null), new md(str, 20), new com.yandex.passport.internal.report.a(str2, 11));
        if (str3 != null) {
            i.add(new com.yandex.passport.internal.report.a(str3, 26, z));
        }
        e(c8.w, i);
    }

    public final void k(String str, String str2, Uid uid, Throwable th, String str3) {
        f(y7.w, new jd(Long.valueOf(uid.getValue())), new md(str, 20), new com.yandex.passport.internal.report.a(str2, 11), new com.yandex.passport.internal.report.i(str3, 6, false), new yd(th));
    }

    public final void l(String str, String str2, Uid uid, boolean z, String str3, String str4) {
        boolean z2 = false;
        f(z7.w, new jd(Long.valueOf(uid.getValue())), new md(str, 20), new com.yandex.passport.internal.report.a(str2, 11), new yd(z, 6), new com.yandex.passport.internal.report.i(str3, 6, z2), new md(str4, 15, z2));
    }

    public final void m(Uid uid, String str, String str2, String str3) {
        f(d8.w, new jd(uid != null ? Long.valueOf(uid.getValue()) : null), new com.yandex.passport.internal.report.a(str3, 20, false), new md(str, 20), new com.yandex.passport.internal.report.a(str2, 11));
    }

    public final void n(Uid uid, String str, String str2, String str3) {
        f(a8.w, new jd(Long.valueOf(uid.getValue())), new md(str, 20), new com.yandex.passport.internal.report.a(str2, 11), new com.yandex.passport.internal.report.i(str3, 6, false));
    }
}
