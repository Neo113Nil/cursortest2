package defpackage;

import com.yandex.go.places.map.ui.PinWarHost$observeThemeRedraw$$inlined$safeCollectIn$1;
import com.yandex.go.places.map.ui.PinWarHost$subscribeUpdates$$inlined$safeCollectIn$1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.yandexmaps.multiplatform.pin.war.b;
import ru.yandex.yandexmaps.multiplatform.pin.war.c;

/* loaded from: classes13.dex */
public final class e2c0 {
    public c a;
    public final tzb0 b = new tzb0();

    public static void d(ike ikeVar, n0 n0Var, tls tlsVar) {
        tje.N(ikeVar, null, null, new PinWarHost$subscribeUpdates$$inlined$safeCollectIn$1(new mth(n0Var, 6), tlsVar, null), 3);
    }

    public final void a(ike ikeVar, tpr tprVar) {
        tje.N(ikeVar, null, null, new PinWarHost$observeThemeRedraw$$inlined$safeCollectIn$1(e.t(tprVar), null, this), 3);
    }

    public final void b(List list) {
        c cVar = this.a;
        tzb0 tzb0Var = this.b;
        if (cVar != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(tzb0Var.b((kn00) it.next()));
            }
            b.b(cVar, arrayList);
        }
        tzb0Var.c(list);
    }

    public final void c(List list, Set set) {
        tzb0 tzb0Var;
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((kn00) it.next()).getId());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            tzb0Var = this.b;
            if (!hasNext) {
                break;
            }
            Object next = it2.next();
            kn00 kn00Var = (kn00) next;
            if (!hashSet.contains(kn00Var.getId())) {
                if (!tzb0Var.a.containsKey(kn00Var.getId())) {
                }
            }
            arrayList.add(next);
        }
        c cVar = this.a;
        if (cVar != null) {
            Set set2 = set;
            ArrayList arrayList2 = new ArrayList(tcc.n(set2, 10));
            Iterator it3 = set2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(tzb0Var.a((kn00) it3.next()));
            }
            cVar.n(arrayList2);
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList3.add(tzb0Var.b((kn00) it4.next()));
            }
            b.b(cVar, arrayList3);
        }
        tzb0Var.c(list);
    }
}
