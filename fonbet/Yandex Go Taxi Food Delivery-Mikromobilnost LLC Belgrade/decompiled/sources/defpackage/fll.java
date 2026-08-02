package defpackage;

import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.core.a;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public abstract class fll {
    public static /* synthetic */ Object c(fll fllVar, m3k m3kVar, aw5 aw5Var, b bVar, List list, DivCollectionItemBuilder divCollectionItemBuilder, int i) {
        if ((i & 16) != 0) {
            divCollectionItemBuilder = null;
        }
        fllVar.b(m3kVar, aw5Var, bVar, list, divCollectionItemBuilder, null);
        return zy11.a;
    }

    public abstract void a(m3k m3kVar, aw5 aw5Var, b bVar);

    public final Object b(m3k m3kVar, aw5 aw5Var, b bVar, List list, DivCollectionItemBuilder divCollectionItemBuilder, ArrayList arrayList) {
        b a;
        tvo tvoVar;
        rvo rvoVar = aw5Var.b;
        a(m3kVar, aw5Var, bVar);
        int i = 0;
        if (divCollectionItemBuilder != null) {
            Div2View div2View = aw5Var.a;
            ArrayList a2 = a.a(divCollectionItemBuilder, rvoVar);
            ArrayList i2 = com.yandex.div.core.state.a.i(a2);
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                cxk cxkVar = (cxk) next;
                b a3 = bVar.a((String) i2.get(i));
                ykl0 runtimeStore = div2View.getRuntimeStore();
                m3k m3kVar2 = cxkVar.a;
                rvo rvoVar2 = cxkVar.b;
                com.yandex.div.core.expression.a a4 = runtimeStore.a(a3, m3kVar2, rvoVar2, rvoVar);
                if (a4 != null && (tvoVar = a4.a) != null) {
                    rvoVar2 = tvoVar;
                }
                g(cxkVar.a, new aw5(div2View, rvoVar2), a3);
                i = i3;
            }
        } else if (list != null) {
            ArrayList f = com.yandex.div.core.state.a.f(list);
            for (Object obj : list) {
                int i4 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                m3k m3kVar3 = (m3k) obj;
                if (arrayList == null || (a = (b) arrayList.get(i)) == null) {
                    a = bVar.a((String) f.get(i));
                }
                g(m3kVar3, aw5Var, a);
                i = i4;
            }
        }
        return zy11.a;
    }

    public Object d(j2k j2kVar, aw5 aw5Var, b bVar) {
        c(this, j2kVar, aw5Var, bVar, j2kVar.c.q, null, 48);
        return zy11.a;
    }

    public Object e(u2k u2kVar, aw5 aw5Var, b bVar) {
        dbl dblVar = u2kVar.c;
        List<cbl> list = dblVar.I;
        String str = dblVar.p;
        if (str == null && (str = dblVar.x) == null) {
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        for (cbl cblVar : list) {
            b a = cblVar.c == null ? null : com.yandex.div.core.state.a.a(bVar, str, cblVar, cblVar.d);
            if (a != null) {
                arrayList.add(a);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m3k m3kVar = ((cbl) it.next()).c;
            if (m3kVar != null) {
                arrayList2.add(m3kVar);
            }
        }
        b(u2kVar, aw5Var, bVar, arrayList2, null, arrayList);
        return zy11.a;
    }

    public Object f(y2k y2kVar, aw5 aw5Var, b bVar) {
        a(y2kVar, aw5Var, bVar);
        return zy11.a;
    }

    public final Object g(m3k m3kVar, aw5 aw5Var, b bVar) {
        aw5 a = aw5Var.a(aw5Var.a.getRuntimeStore().e(m3kVar, aw5Var.b, bVar.b()).a);
        boolean z = m3kVar instanceof x2k;
        zy11 zy11Var = zy11.a;
        if (z) {
            a((x2k) m3kVar, a, bVar);
            return zy11Var;
        }
        if (m3kVar instanceof n2k) {
            a((n2k) m3kVar, a, bVar);
            return zy11Var;
        }
        if (m3kVar instanceof l2k) {
            a((l2k) m3kVar, a, bVar);
            return zy11Var;
        }
        if (m3kVar instanceof s2k) {
            a((s2k) m3kVar, a, bVar);
            return zy11Var;
        }
        if (m3kVar instanceof i2k) {
            i2k i2kVar = (i2k) m3kVar;
            DivContainer divContainer = i2kVar.c;
            c(this, i2kVar, a, bVar, divContainer.B, divContainer.z, 32);
            return zy11Var;
        }
        if (m3kVar instanceof m2k) {
            m2k m2kVar = (m2k) m3kVar;
            c(this, m2kVar, a, bVar, m2kVar.c.y, null, 48);
            return zy11Var;
        }
        if (m3kVar instanceof k2k) {
            k2k k2kVar = (k2k) m3kVar;
            DivGallery divGallery = k2kVar.c;
            c(this, k2kVar, a, bVar, divGallery.u, divGallery.s, 32);
            return zy11Var;
        }
        if (m3kVar instanceof q2k) {
            q2k q2kVar = (q2k) m3kVar;
            t1l t1lVar = q2kVar.c;
            c(this, q2kVar, a, bVar, t1lVar.t, t1lVar.r, 32);
            return zy11Var;
        }
        if (m3kVar instanceof w2k) {
            w2k w2kVar = (w2k) m3kVar;
            List list = w2kVar.c.q;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((kdl) it.next()).a);
            }
            c(this, w2kVar, a, bVar, arrayList, null, 48);
            return zy11Var;
        }
        if (m3kVar instanceof u2k) {
            return e((u2k) m3kVar, a, bVar);
        }
        if (m3kVar instanceof j2k) {
            return d((j2k) m3kVar, a, bVar);
        }
        if (m3kVar instanceof o2k) {
            a((o2k) m3kVar, a, bVar);
            return zy11Var;
        }
        if (m3kVar instanceof t2k) {
            a((t2k) m3kVar, a, bVar);
            return zy11Var;
        }
        if (m3kVar instanceof p2k) {
            a((p2k) m3kVar, a, bVar);
            return zy11Var;
        }
        if (m3kVar instanceof r2k) {
            a((r2k) m3kVar, a, bVar);
            return zy11Var;
        }
        if (m3kVar instanceof y2k) {
            return f((y2k) m3kVar, a, bVar);
        }
        if (m3kVar instanceof v2k) {
            a((v2k) m3kVar, a, bVar);
            return zy11Var;
        }
        w511.b();
        return null;
    }

    public final void h(omk omkVar, aw5 aw5Var) {
        String id;
        for (mmk mmkVar : omkVar.c) {
            m3k m3kVar = mmkVar.a;
            long j = mmkVar.b;
            egk d = m3kVar.d();
            if (d instanceof dbl) {
                dbl dblVar = (dbl) d;
                id = dblVar.p;
                if (id == null) {
                    id = dblVar.x;
                }
            } else {
                id = d.getId();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(id != null ? ":".concat(id) : "");
            g(m3kVar, aw5Var, new b(j, EmptyList.a, Collections.singletonList(sb.toString()), 8));
        }
    }
}
