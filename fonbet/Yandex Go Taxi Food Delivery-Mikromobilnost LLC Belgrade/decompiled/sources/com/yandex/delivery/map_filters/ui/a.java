package com.yandex.delivery.map_filters.ui;

import defpackage.lrw;
import defpackage.mrw;
import defpackage.q9i;
import defpackage.w5r;
import defpackage.x5r;
import defpackage.yr31;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class a extends yr31 {
    public final q9i b;
    public final lrw c;
    public final m0 w;

    public a(w5r w5rVar, q9i q9iVar, lrw lrwVar) {
        this.b = q9iVar;
        this.c = lrwVar;
        mrw mrwVar = (mrw) lrwVar;
        r0 r0Var = mrwVar.a;
        this.w = new m0(r0Var, mrwVar.b, new FiltersViewModel$filterStateflow$1(3, null));
        x5r x5rVar = w5rVar.a;
        r0Var.getClass();
        r0Var.m(null, x5rVar);
        Iterator it = w5rVar.b.iterator();
        while (it.hasNext()) {
            mrwVar.a((Map) it.next());
        }
    }
}
