package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.o7;
import com.yandex.passport.internal.report.pd;
import defpackage.scc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes8.dex */
public final class c0 extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public c0(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
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
        return ((Boolean) aVar.o.getValue(aVar, com.yandex.passport.internal.features.a.J[11])).booleanValue();
    }

    public final void k(String str, String str2, Map map) {
        ArrayList i = scc.i(new jd(str2, 3), new com.yandex.passport.internal.report.a(str, 26, false));
        j(i, map);
        o7 o7Var = o7.w;
        pd[] pdVarArr = (pd[]) i.toArray(new pd[0]);
        f(o7Var, (pd[]) Arrays.copyOf(pdVarArr, pdVarArr.length));
    }
}
