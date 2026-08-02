package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

/* loaded from: classes6.dex */
public final class l5r {
    public static List a(su30 su30Var, TransportOnSummaryExperiment.LiveTagsSettings.LiveTagsFilterType liveTagsFilterType) {
        int i = liveTagsFilterType == null ? -1 : k5r.a[liveTagsFilterType.ordinal()];
        if (i != -1) {
            List list = null;
            if (i != 1) {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                List list2 = su30Var.a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ycc.r(b((hz30) it.next()), arrayList);
                }
                return arrayList;
            }
            Iterator it2 = su30Var.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                List b = b((hz30) it2.next());
                if (b.isEmpty()) {
                    b = null;
                }
                List list3 = b;
                if (list3 != null) {
                    list = list3;
                    break;
                }
            }
            if (list != null) {
                return list;
            }
        }
        return EmptyList.a;
    }

    public static List b(hz30 hz30Var) {
        if (hz30Var instanceof r440) {
            List<b3v0> list = ((r440) hz30Var).a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (b3v0 b3v0Var : list) {
                String str = b3v0Var.a;
                arrayList.add(new a631(b3v0Var.d.a, null, null, 28));
            }
            return arrayList;
        }
        if (!(hz30Var instanceof jm30)) {
            return EmptyList.a;
        }
        List<w1u> list2 = ((jm30) hz30Var).a;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (w1u w1uVar : list2) {
            String str2 = w1uVar.a;
            arrayList2.add(new a631(w1uVar.f.a, null, null, 28));
        }
        return arrayList2;
    }
}
