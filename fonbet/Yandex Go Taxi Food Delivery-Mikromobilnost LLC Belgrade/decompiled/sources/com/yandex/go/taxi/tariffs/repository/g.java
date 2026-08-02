package com.yandex.go.taxi.tariffs.repository;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.b8r;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.gw00;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jn40;
import defpackage.mi31;
import defpackage.mth;
import defpackage.pex0;
import defpackage.qhw0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class g {
    public final wiq0 a;
    public final b8r b;
    public final ike c;
    public final r0 d;

    public g(wiq0 wiq0Var, b8r b8rVar, tt2 tt2Var) {
        this.a = wiq0Var;
        this.b = b8rVar;
        qhw0 a = jl40.a();
        tt2Var.getClass();
        this.c = bvf0.a(cvw.U(a, uyj.a));
        this.d = bvf0.c(kotlin.collections.b.f());
    }

    public final Set a(String str) {
        Set set = (Set) c().get(str);
        return set == null ? EmptySet.a : set;
    }

    public final Set b() {
        Set set = (Set) c().get(((k) this.a).h());
        return set == null ? EmptySet.a : set;
    }

    public final LinkedHashMap c() {
        pex0 pex0Var;
        jn40 jn40Var;
        Map map = (Map) this.d.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            Iterable iterable = (Set) entry.getValue();
            mi31 a = this.b.a(str);
            Set set = (a == null || (pex0Var = a.a) == null || (jn40Var = pex0Var.V) == null) ? null : jn40Var.e;
            if (set != null) {
                iterable = kotlin.collections.a.U(set, iterable);
            }
            linkedHashMap.put(key, iterable);
        }
        return linkedHashMap;
    }

    public final mth d() {
        return new mth(new f(this.d), 4);
    }

    public final void e(HashMap hashMap) {
        tje.N(this.c, null, null, new SelectedMultiTariffsRepositoryImpl$updateFromPersonalState$1(this, hashMap, null), 3);
    }
}
