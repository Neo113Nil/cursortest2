package defpackage;

import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.requirements.models.net.c;

/* loaded from: classes6.dex */
public final class jjx0 {
    public final dqe0 a;
    public final ijj0 b;

    public jjx0(dqe0 dqe0Var, ijj0 ijj0Var) {
        this.a = dqe0Var;
        this.b = ijj0Var;
    }

    public final List a(String str, Zone zone, List list) {
        ZoneTariffInfo r;
        if (zone != null && !list.isEmpty() && (r = uh6.r(zone, str)) != null) {
            ArrayList arrayList = new ArrayList(list);
            Set set = (Set) zone.F.getValue();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b580 b580Var = (b580) it.next();
                if (!set.contains(b580Var.a)) {
                    c cVar = (c) ((Map) r.J.getValue()).get(b580Var.a);
                    if (cVar == null) {
                        it.remove();
                    } else if (b580Var.c()) {
                        List list2 = b580Var.e;
                        this.b.getClass();
                        ArrayList b = ijj0.b(b580Var, cVar);
                        ArrayList arrayList2 = new ArrayList(tcc.n(b, 10));
                        Iterator it2 = b.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((je70) it2.next()).c);
                        }
                        if (list2.isEmpty() || list2.size() != arrayList2.size() || !list2.containsAll(arrayList2)) {
                            it.remove();
                        }
                    } else if (cVar.c()) {
                        it.remove();
                    }
                }
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
        }
        return EmptyList.a;
    }
}
