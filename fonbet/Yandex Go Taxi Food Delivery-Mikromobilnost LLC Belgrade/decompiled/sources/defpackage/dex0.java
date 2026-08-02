package defpackage;

import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.TariffCardUiStateInteractor$special$$inlined$flatMapLatest$1;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.b;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.c;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.b0;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.l;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.m;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.n;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.p0;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.q0;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.u;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class dex0 {
    public final vfx0 a;
    public final b b;
    public final q0 c;
    public final c d;
    public final y7t0 e;
    public final x2u f;
    public final p0 g;
    public final v h;
    public final u i;
    public final b0 j;
    public final ndx0 k;
    public final jz8 l;
    public final ihp0 m;
    public final l n;
    public final owh o;
    public final igj p;
    public final z1f q;
    public final m r;
    public final n s;
    public final wiq0 t;
    public final g u;

    public dex0(ltz0 ltz0Var, vfx0 vfx0Var, b bVar, q0 q0Var, c cVar, y7t0 y7t0Var, x2u x2uVar, p0 p0Var, v vVar, u uVar, b0 b0Var, ndx0 ndx0Var, jz8 jz8Var, viv0 viv0Var, ihp0 ihp0Var, l lVar, owh owhVar, igj igjVar, z1f z1fVar, m mVar, n nVar, wiq0 wiq0Var) {
        this.a = vfx0Var;
        this.b = bVar;
        this.c = q0Var;
        this.d = cVar;
        this.e = y7t0Var;
        this.f = x2uVar;
        this.g = p0Var;
        this.h = vVar;
        this.i = uVar;
        this.j = b0Var;
        this.k = ndx0Var;
        this.l = jz8Var;
        this.m = ihp0Var;
        this.n = lVar;
        this.o = owhVar;
        this.p = igjVar;
        this.q = z1fVar;
        this.r = mVar;
        this.s = nVar;
        this.t = wiq0Var;
        this.u = e.X(viv0Var.j(), new TariffCardUiStateInteractor$special$$inlined$flatMapLatest$1(null, this, ltz0Var));
    }

    public static void b(dex0 dex0Var, ListBuilder listBuilder, String str, ArrayList arrayList) {
        dex0Var.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        d(listBuilder, str, 16);
        listBuilder.addAll(arrayList);
    }

    public static void c(ListBuilder listBuilder, String str, List list) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        e(str, listBuilder);
        listBuilder.addAll(list2);
    }

    public static void d(ListBuilder listBuilder, String str, int i) {
        if (a.b0(listBuilder) instanceof jrl) {
            return;
        }
        listBuilder.add(new jrl(str, i));
    }

    public static void e(String str, ListBuilder listBuilder) {
        rcx0 rcx0Var = (rcx0) a.b0(listBuilder);
        if (!(rcx0Var instanceof prl) || (rcx0Var instanceof jrl)) {
            listBuilder.add(new krl(str, false));
        }
    }

    public static ArrayList f(List list, Set set) {
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            Set c = ((rcx0) obj).c();
            if (!(c instanceof Collection) || !c.isEmpty()) {
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    if (set.contains((String) it.next())) {
                        break;
                    }
                }
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ycc.r(((rcx0) it2.next()).c(), arrayList2);
        }
        set.addAll(arrayList2);
        return arrayList;
    }

    public static ArrayList g(List list, boolean z) {
        List g;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            rcx0 rcx0Var = null;
            if (i < 0) {
                scc.m();
                throw null;
            }
            rcx0 rcx0Var2 = (rcx0) obj;
            if (i == scc.f(list)) {
                g = Collections.singletonList(rcx0Var2);
            } else {
                if (rcx0Var2 instanceof amj0) {
                    amj0 amj0Var = (amj0) rcx0Var2;
                    uij0 uij0Var = amj0Var.g;
                    String str = amj0Var.a;
                    rcx0Var = uij0Var != null ? new nrl(str, z ? 16 : 0) : new orl(str, 0, 0);
                } else if (rcx0Var2 instanceof sn40) {
                    rcx0Var = new orl(((sn40) rcx0Var2).a, 2, 2);
                }
                g = rcx0Var != null ? scc.g(rcx0Var2, rcx0Var) : Collections.singletonList(rcx0Var2);
            }
            arrayList.add(g);
            i = i2;
        }
        return tcc.o(arrayList);
    }

    public static ArrayList h(String str, List list, boolean z) {
        Object krlVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((List) obj).isEmpty()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            ArrayList g = g((List) next, z);
            if (i != scc.f(list)) {
                String h = qv10.h(i, str, "_");
                if (z) {
                    List list2 = (List) a.S(i2, arrayList);
                    krlVar = new jrl(h, (list2 != null ? (rcx0) a.R(list2) : null) instanceof prl ? 8 : 16);
                } else {
                    krlVar = new krl(h, false);
                }
                g = a.o0(g, krlVar);
            }
            arrayList2.add(g);
            i = i2;
        }
        return tcc.o(arrayList2);
    }

    public static List i(dex0 dex0Var, ArrayList arrayList, String str, int i) {
        dex0Var.getClass();
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        jrl jrlVar = i != 0 ? new jrl(str.concat("_top"), i) : null;
        ListBuilder a = rcc.a();
        if (jrlVar != null) {
            a.add(jrlVar);
        }
        a.addAll(arrayList);
        return a.j();
    }

    public final void a(ListBuilder listBuilder, String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        listBuilder.addAll(i(this, arrayList, str, a.R(arrayList) instanceof prl ? 8 : 16));
    }
}
