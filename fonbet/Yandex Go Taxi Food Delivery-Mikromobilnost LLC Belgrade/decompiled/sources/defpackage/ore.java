package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.orderforanother.repository.a;
import ru.yandex.taxi.requirements.models.net.experiment.c;

/* loaded from: classes6.dex */
public final class ore {
    public final dqe0 a;
    public final wiq0 b;
    public final a c;
    public final ynm0 d;
    public final hqj0 e;
    public final cjj0 f;
    public final jjx0 g;

    public ore(dqe0 dqe0Var, wiq0 wiq0Var, a aVar, ynm0 ynm0Var, hqj0 hqj0Var, cjj0 cjj0Var, jjx0 jjx0Var) {
        this.a = dqe0Var;
        this.b = wiq0Var;
        this.c = aVar;
        this.d = ynm0Var;
        this.e = hqj0Var;
        this.f = cjj0Var;
        this.g = jjx0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [jjx0] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v13, types: [kotlin.collections.EmptyList] */
    public final boolean a(pex0 pex0Var) {
        Collection arrayList;
        c b = this.e.b();
        if (b.b) {
            return false;
        }
        Zone c = this.a.c();
        if (pex0Var == null || c == null) {
            return false;
        }
        if (!this.d.d(pex0Var) && !this.c.h(pex0Var)) {
            if (pex0Var.K0) {
                if (this.f.b(this.f.c(pex0Var, ((k) this.b).h(), this.a.a.x, b, cdj0.a), true) <= 0) {
                    return false;
                }
            } else {
                Zone c2 = this.a.c();
                if (c2 == null) {
                    arrayList = EmptyList.a;
                } else {
                    List list = this.a.a.x;
                    HashSet hashSet = new HashSet((Set) c2.F.getValue());
                    List f = pex0Var.f();
                    HashSet hashSet2 = new HashSet();
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        hashSet2.add(((lmw0) it.next()).getName());
                    }
                    hashSet.removeAll(hashSet2);
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!hashSet.contains(((b580) obj).a)) {
                            arrayList.add(obj);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return false;
                }
                List a = this.g.a(pex0Var.b, c, arrayList);
                if (!a.isEmpty()) {
                    Set set = pex0Var.L;
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            if (arrayList.size() != a.size()) {
                                break;
                            }
                            return false;
                        }
                        if (set.contains(((b580) it2.next()).a)) {
                            break;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final int b(pex0 pex0Var) {
        c b = this.e.b();
        int i = 0;
        if (b.b) {
            return 0;
        }
        Zone c = this.a.c();
        if (c != null && pex0Var != null) {
            if (pex0Var.K0) {
                return this.f.b(this.f.c(pex0Var, ((k) this.b).h(), this.a.a.x, b, cdj0.a), true);
            }
            boolean d = this.d.d(pex0Var);
            boolean h = this.c.h(pex0Var);
            i = (h ? 1 : 0) + (d ? 1 : 0);
            List list = this.a.a.x;
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                return (list.size() - this.g.a(pex0Var.b, c, list).size()) + i;
            }
        }
        return i;
    }
}
