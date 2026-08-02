package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.j8;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.q8;
import com.yandex.passport.internal.report.yd;
import defpackage.gw00;
import defpackage.scc;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class i0 extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public i0(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.z.getValue(aVar, com.yandex.passport.internal.features.a.J[23])).booleanValue();
    }

    public final void j(List list) {
        j8 j8Var = j8.w;
        List<com.yandex.passport.internal.rotation.f> list2 = list;
        int d = gw00.d(tcc.n(list2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (com.yandex.passport.internal.rotation.f fVar : list2) {
            Pair pair = new Pair(String.valueOf(com.yandex.passport.internal.ui.sloth.e.l(fVar.b())), Long.valueOf(fVar.c().getValue()));
            linkedHashMap.put(pair.c(), pair.f());
        }
        b(j8Var, linkedHashMap);
    }

    public final void k(long j, String str, String str2, boolean z, String str3) {
        int i = 26;
        boolean z2 = false;
        ArrayList i2 = scc.i(new jd(Long.valueOf(j)), new com.yandex.passport.internal.report.i(str, 26), new com.yandex.passport.internal.report.i(str2, 27), new yd(z, 6));
        if (str3 != null) {
            i2.add(new com.yandex.passport.internal.report.a(str3, i, z2));
        }
        e(q8.w, i2);
    }
}
