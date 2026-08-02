package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.yd;
import defpackage.scc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes8.dex */
public final class i extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public i(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    public static void j(ArrayList arrayList, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new com.yandex.passport.internal.report.f((String) entry.getKey(), String.valueOf((String) entry.getValue())));
        }
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.r.getValue(aVar, com.yandex.passport.internal.features.a.J[14])).booleanValue();
    }

    public final void k(long j, Uid uid, String str, Map map) {
        ArrayList i = scc.i(new com.yandex.passport.internal.report.a(str, 26, false), new yd(uid), new ld(Long.valueOf(j), 0));
        j(i, map);
        com.yandex.passport.internal.report.a1 a1Var = com.yandex.passport.internal.report.a1.w;
        pd[] pdVarArr = (pd[]) i.toArray(new pd[0]);
        f(a1Var, (pd[]) Arrays.copyOf(pdVarArr, pdVarArr.length));
    }

    public final void l(long j, Uid uid, String str, Map map) {
        ArrayList i = scc.i(new yd(uid), new yd(str, 12), new ld(Long.valueOf(j), 0));
        j(i, map);
        com.yandex.passport.internal.report.c1 c1Var = com.yandex.passport.internal.report.c1.w;
        pd[] pdVarArr = (pd[]) i.toArray(new pd[0]);
        f(c1Var, (pd[]) Arrays.copyOf(pdVarArr, pdVarArr.length));
    }

    public final void m(Uid uid, long j, Map map) {
        ArrayList i = scc.i(new yd(uid), new ld(Long.valueOf(j), 0));
        j(i, map);
        com.yandex.passport.internal.report.b1 b1Var = com.yandex.passport.internal.report.b1.w;
        pd[] pdVarArr = (pd[]) i.toArray(new pd[0]);
        f(b1Var, (pd[]) Arrays.copyOf(pdVarArr, pdVarArr.length));
    }
}
