package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.g8;
import com.yandex.passport.internal.report.h8;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.n8;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.t8;
import com.yandex.passport.internal.report.yd;
import defpackage.scc;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class b1 extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public b1(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.j.getValue(aVar, com.yandex.passport.internal.features.a.J[6])).booleanValue();
    }

    public final void j(DropPlace dropPlace, Uid uid, String str) {
        String a;
        ArrayList i = scc.i(new md(dropPlace.a(str), 12, false));
        if (uid != null) {
            i.add(new yd(uid));
        }
        g8 g8Var = g8.w;
        pd[] pdVarArr = (pd[]) i.toArray(new pd[0]);
        f(g8Var, (pd[]) Arrays.copyOf(pdVarArr, pdVarArr.length));
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            LogLevel logLevel = LogLevel.DEBUG;
            a = dropPlace.a(null);
            com.yandex.passport.common.logger.a.c(logLevel, null, a, 8);
        }
    }

    public final void k(long j, String str, String str2, String str3) {
        boolean z = false;
        f(h8.w, new com.yandex.passport.internal.report.a(str3, 26, z), new yd(str, 12), new com.yandex.passport.internal.report.i(str2, 6, z), new com.yandex.passport.internal.report.i("false", 5, z), new ld(Long.valueOf(j), 0));
    }

    public final void l(long j, Long l, boolean z, AnalyticsFromValue analyticsFromValue, Long l2) {
        boolean z2 = false;
        f(n8.w, new jd(Long.valueOf(j)), new com.yandex.passport.internal.report.i(l), new com.yandex.passport.internal.report.i(z, 19), new com.yandex.passport.internal.report.i(analyticsFromValue.getFromValue(), 6, z2), new com.yandex.passport.internal.report.i(analyticsFromValue.getFromLoginSdkValue(), 5, z2), new ld(l2, 0));
    }

    public final void m(long j, String str, String str2) {
        boolean z = false;
        f(n8.w, new yd(str, 12), new com.yandex.passport.internal.report.i(str2, 6, z), new com.yandex.passport.internal.report.i("false", 5, z), new ld(Long.valueOf(j), 0));
    }

    public final void n(String str, String str2, Long l) {
        boolean z = false;
        f(t8.w, new yd(str, 12), new com.yandex.passport.internal.report.i(str2, 6, z), new com.yandex.passport.internal.report.i("false", 5, z), new ld(l, 0));
    }
}
