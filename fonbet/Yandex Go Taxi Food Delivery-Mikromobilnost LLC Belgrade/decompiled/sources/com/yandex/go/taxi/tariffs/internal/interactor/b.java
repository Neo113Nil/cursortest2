package com.yandex.go.taxi.tariffs.internal.interactor;

import com.yandex.go.taxi.tariffs.models.TariffChangeReason;
import defpackage.dai0;
import defpackage.dk31;
import defpackage.en40;
import defpackage.jn40;
import defpackage.mi31;
import defpackage.pex0;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.za31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Iterator it;
        jn40 jn40Var;
        c cVar = this.a;
        dk31 j = cVar.c.j();
        List list = j.a;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            za31 za31Var = (za31) it2.next();
            List<mi31> list2 = za31Var.b;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            for (mi31 mi31Var : list2) {
                pex0 pex0Var = mi31Var.a;
                if (pex0Var.K0 && (jn40Var = pex0Var.V) != null) {
                    en40 en40Var = jn40Var.b;
                    Set set = jn40Var.e;
                    Set a = cVar.b.a(mi31Var.b);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : a) {
                        if (set.contains((String) obj2)) {
                            arrayList3.add(obj2);
                        }
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList3);
                    it = it2;
                    mi31Var = mi31.a(mi31Var, pex0.a(pex0Var, null, null, null, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, new jn40(jn40Var.a, new en40(en40Var.a, en40Var.b, en40Var.c, dai0.k(en40Var.d, jn40Var.h, N0), en40Var.e, en40Var.f, en40Var.g), jn40Var.c, jn40Var.d, jn40Var.e, N0, jn40Var.g, jn40Var.h, jn40Var.i, jn40Var.j, jn40Var.k), null, null, null, null, null, null, false, null, null, null, null, null, null, null, -1, -32769, 8388607), null, 30);
                } else {
                    it = it2;
                }
                arrayList2.add(mi31Var);
                it2 = it;
            }
            arrayList.add(za31.a(za31Var, arrayList2, null, 5));
            it2 = it2;
        }
        cVar.c.a(TariffChangeReason.DEFAULT, new UpdateMulticlassTariffInteractor$onResume$1$1$1(dk31.a(j, arrayList), null));
        return zy11.a;
    }
}
