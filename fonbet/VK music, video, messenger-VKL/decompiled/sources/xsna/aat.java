package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.udt;

/* compiled from: GamesCatalogBadgeable.kt */
/* loaded from: classes17.dex */
public final class aat {
    public static final udt a(udt udtVar, long j, String str) {
        if (!(udtVar instanceof udt.h)) {
            return udtVar;
        }
        udt.h hVar = (udt.h) udtVar;
        if (hVar instanceof udt.h.a) {
            udt.h.a aVar = (udt.h.a) udtVar;
            List list = aVar.g;
            ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(j8t.a((h8t) it.next(), j, str));
            }
            return new udt.h.a(aVar.e, aVar.f, arrayList);
        }
        if (hVar instanceof udt.h.b) {
            return hVar;
        }
        if (hVar instanceof udt.h.c) {
            udt.h.c cVar = (udt.h.c) udtVar;
            List list2 = cVar.g;
            ArrayList arrayList2 = new ArrayList(c5g.u(new wow(list2), 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(j8t.a((h8t) it2.next(), j, str));
            }
            return new udt.h.c(cVar.e, cVar.f, arrayList2, cVar.h, cVar.i);
        }
        if (hVar instanceof udt.h.f) {
            udt.h.f fVar = (udt.h.f) udtVar;
            List list3 = fVar.g;
            ArrayList arrayList3 = new ArrayList(c5g.u(new wow(list3), 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(j8t.a((h8t) it3.next(), j, str));
            }
            return new udt.h.f(fVar.e, fVar.f, arrayList3);
        }
        if (hVar instanceof udt.h.d) {
            udt.h.d dVar = (udt.h.d) udtVar;
            List list4 = dVar.g;
            ArrayList arrayList4 = new ArrayList(c5g.u(new wow(list4), 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(j8t.a((h8t) it4.next(), j, str));
            }
            return new udt.h.d(dVar.e, dVar.f, arrayList4);
        }
        if (!(hVar instanceof udt.h.e)) {
            throw new NoWhenBranchMatchedException();
        }
        udt.h.e eVar = (udt.h.e) udtVar;
        List list5 = eVar.g;
        ArrayList arrayList5 = new ArrayList(c5g.u(new wow(list5), 10));
        Iterator it5 = list5.iterator();
        while (it5.hasNext()) {
            arrayList5.add(j8t.a((h8t) it5.next(), j, str));
        }
        return new udt.h.e(eVar.e, eVar.f, arrayList5);
    }
}
