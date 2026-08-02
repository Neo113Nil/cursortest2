package com.yandex.passport.internal.report;

import defpackage.i3y;
import defpackage.scc;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class g {
    public final com.yandex.passport.internal.e a;
    public final com.yandex.passport.internal.properties.p b;
    public final i3y c = kotlin.a.a(new com.yandex.passport.internal.d(7, this));
    public f d;
    public f e;

    public g(com.yandex.passport.internal.e eVar, com.yandex.passport.internal.properties.p pVar) {
        this.a = eVar;
        this.b = pVar;
    }

    public final ArrayList a() {
        ArrayList i = scc.i(b.a, new c((String) this.c.getValue(), 0));
        f fVar = this.d;
        if (fVar != null) {
            i.add(fVar);
        }
        f fVar2 = this.e;
        if (fVar2 != null) {
            i.add(fVar2);
        }
        for (Map.Entry entry : kotlin.collections.a.A0(this.b.x.entrySet(), 10)) {
            i.add(new f((String) entry.getKey(), (String) entry.getValue()));
        }
        return i;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        f fVar = this.d;
        if (fVar != null) {
            arrayList.add(new Pair(fVar.a, fVar.b));
        }
        f fVar2 = this.e;
        if (fVar2 != null) {
            arrayList.add(new Pair(fVar2.a, fVar2.b));
        }
        return arrayList;
    }
}
