package defpackage;

import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.go.zone.model.Zone;
import defpackage.t8i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;
import ru.yandex.taxi.delivery.experiments.e;
import ru.yandex.taxi.delivery.impl.paid_insurance.d;
import ru.yandex.taxi.orderforanother.repository.a;
import ru.yandex.taxi.requirements.models.domain.BubbleAvailability;
import ru.yandex.taxi.requirements.models.domain.PreorderBubbleAvailability;
import ru.yandex.taxi.requirements.models.net.experiment.c;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class cjj0 {
    public final dqe0 a;
    public final xl10 b;
    public final aq80 c;
    public final a9w d;
    public final ynj0 e;
    public final g f;
    public final ijj0 g;
    public final mso h;
    public final oy80 i;
    public final j0g j;
    public final yzh k;
    public final zp40 l;
    public final j0g m;

    public cjj0(dqe0 dqe0Var, xl10 xl10Var, aq80 aq80Var, a9w a9wVar, ynj0 ynj0Var, g gVar, ijj0 ijj0Var, mso msoVar, oy80 oy80Var, j0g j0gVar, yzh yzhVar, zp40 zp40Var, j0g j0gVar2) {
        this.a = dqe0Var;
        this.b = xl10Var;
        this.c = aq80Var;
        this.d = a9wVar;
        this.e = ynj0Var;
        this.f = gVar;
        this.g = ijj0Var;
        this.h = msoVar;
        this.i = oy80Var;
        this.j = j0gVar;
        this.k = yzhVar;
        this.l = zp40Var;
        this.m = j0gVar2;
    }

    public static void a(b580 b580Var, ArrayList arrayList) {
        boolean c = b580Var.c();
        String str = b580Var.a;
        if (c) {
            arrayList.add(new Pair(str, b580Var.e));
        } else {
            arrayList.add(new Pair(str, EmptyList.a));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    public final int b(bdj0 bdj0Var, boolean z) {
        ?? b = bdj0Var.b();
        int i = b;
        if (bdj0Var.a()) {
            i = b + 1;
        }
        int i2 = i;
        for (Pair pair : bdj0Var.b) {
            i2 += (!z || ((List) pair.f()).isEmpty()) ? 1 : ((List) pair.f()).size();
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final bdj0 c(pex0 pex0Var, String str, List list, c cVar, edj0 edj0Var) {
        Zone c = this.a.c();
        if (!pex0Var.K0) {
            return e(pex0Var, list, c, cVar, edj0Var);
        }
        jn40 jn40Var = pex0Var.V;
        if (jn40Var != null && jn40Var.i) {
            return e(pex0Var, list, c, cVar, cdj0.a);
        }
        ?? r8 = list;
        Set a = this.f.a(str);
        Iterable iterable = pex0Var.U;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        this.l.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (a.contains(((pex0) obj).b)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != a.size()) {
            g8e.C("Not all tariffs are found", jst.e);
            arrayList = null;
        }
        if (arrayList != null) {
            Iterable iterable2 = (Iterable) r8;
            r8 = new ArrayList();
            for (Object obj2 : iterable2) {
                b580 b580Var = (b580) obj2;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            List f = ((pex0) it.next()).f();
                            if (!(f instanceof Collection) || !f.isEmpty()) {
                                Iterator it2 = f.iterator();
                                while (it2.hasNext()) {
                                    if (jl40.l(((lmw0) it2.next()).getName(), b580Var.a)) {
                                        r8.add(obj2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Iterable iterable3 = r8;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = iterable3.iterator();
        while (it3.hasNext()) {
            a((b580) it3.next(), arrayList2);
        }
        PreorderBubbleAvailability A = this.c.A(pex0Var);
        a aVar = (a) this.b.a;
        return new bdj0(arrayList2, A, aVar.h(pex0Var) ? BubbleAvailability.UNAVAILABLE : aVar.g() == null ? BubbleAvailability.HIDDEN : BubbleAvailability.AVAILABLE, 1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.util.ArrayList] */
    public final bdj0 e(pex0 pex0Var, List list, Zone zone, c cVar, edj0 edj0Var) {
        ?? f;
        boolean z;
        BubbleAvailability bubbleAvailability;
        TariffOrderFlow tariffOrderFlow;
        boolean z2;
        Iterator it;
        EmptyList emptyList;
        jn40 jn40Var;
        List list2;
        boolean z3;
        EmptyList emptyList2 = EmptyList.a;
        List<String> list3 = cVar.m;
        ijx0 ijx0Var = TariffOrderFlow.Companion;
        ArrayList arrayList = new ArrayList();
        for (String str : list3) {
            ijx0Var.getClass();
            TariffOrderFlow a = ijx0.a(str);
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.contains(pex0Var.u0)) {
            return bdj0.k;
        }
        List list4 = (List) cVar.k.a.get(pex0Var.b);
        List list5 = (List) cVar.k.b.get(pex0Var.b);
        if (list5 == null) {
            list5 = emptyList2;
        }
        if (edj0Var instanceof ddj0) {
            List list6 = pex0Var.c;
            f = new ArrayList();
            for (Object obj : list6) {
                if (((lmw0) obj).k(((ddj0) edj0Var).a)) {
                    f.add(obj);
                }
            }
        } else {
            f = pex0Var.f();
        }
        Iterable iterable = (Iterable) f;
        int d = gw00.d(tcc.n(iterable, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj2 : iterable) {
            linkedHashMap.put(((lmw0) obj2).getName(), obj2);
        }
        boolean z4 = true;
        t5r g = b.g(new h73(1 == true ? 1 : 0, list), new bjj0(list4, list5, 0));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        s5r s5rVar = new s5r(g);
        while (s5rVar.hasNext()) {
            Object next = s5rVar.next();
            b580 b580Var = (b580) next;
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!pex0Var.L.contains(b580Var.a)) {
                        lmw0 lmw0Var = (lmw0) entry.getValue();
                        if (jl40.l(lmw0Var.getName(), b580Var.a) && (z3 = lmw0Var instanceof jmw0) == b580Var.c() && (!z3 || ijj0.d(this.g, b580Var, (jmw0) lmw0Var).size() == b580Var.e.size())) {
                            arrayList2.add(next);
                            break;
                        }
                    }
                }
            }
            arrayList3.add(next);
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list7 = (List) pair.getFirst();
        List list8 = (List) pair.getSecond();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = list8.iterator();
        while (it2.hasNext()) {
            b580 b580Var2 = (b580) it2.next();
            lmw0 lmw0Var2 = (lmw0) linkedHashMap.get(b580Var2.a);
            if (lmw0Var2 == null || !(lmw0Var2 instanceof jmw0) || !b580Var2.c() || pex0Var.L.contains(b580Var2.a)) {
                it = it2;
                emptyList = emptyList2;
                if ((edj0Var instanceof cdj0) && ((jn40Var = pex0Var.V) == null || !jn40Var.i)) {
                    if (zone == null || (list2 = zone.k) == null) {
                        list2 = emptyList;
                    }
                    ru.yandex.taxi.requirements.models.net.c cVar2 = (ru.yandex.taxi.requirements.models.net.c) b.j(b.o(new h73(1, list2), new odf0(21, b580Var2)));
                    if (cVar2 != null) {
                        if (!this.e.a.contains(b580Var2.a) && cVar2.e.length() > 0) {
                        }
                    }
                }
                a(b580Var2, arrayList4);
            } else {
                this.g.getClass();
                ArrayList c = ijj0.c(b580Var2.e, (jmw0) lmw0Var2, z4);
                ArrayList arrayList6 = new ArrayList(tcc.n(c, 10));
                Iterator it3 = c.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(((ejj0) it3.next()).a);
                }
                List list9 = b580Var2.e;
                ArrayList arrayList7 = new ArrayList(arrayList6);
                ArrayList arrayList8 = new ArrayList();
                int size = list9.size() - 1;
                it = it2;
                while (-1 < size) {
                    Object obj3 = list9.get(size);
                    EmptyList emptyList3 = emptyList2;
                    int indexOf = arrayList7.indexOf(obj3);
                    if (indexOf >= 0) {
                        arrayList7.remove(indexOf);
                    } else {
                        arrayList8.add(0, obj3);
                    }
                    size--;
                    emptyList2 = emptyList3;
                }
                emptyList = emptyList2;
                if (!arrayList6.isEmpty()) {
                    arrayList5.add(new Pair(b580Var2.a, arrayList6));
                }
                if (arrayList8.isEmpty()) {
                    jst.e.j(new IllegalStateException(oyr.p("Requirement ", b580Var2.a, " mark as unavailable, but unavailable options is empty")));
                } else {
                    arrayList4.add(new Pair(b580Var2.a, arrayList8));
                }
            }
            it2 = it;
            emptyList2 = emptyList;
            z4 = true;
        }
        Iterator it4 = list7.iterator();
        while (it4.hasNext()) {
            a((b580) it4.next(), arrayList5);
        }
        PreorderBubbleAvailability A = this.c.A(pex0Var);
        e9w e9wVar = (e9w) this.d.a;
        BubbleAvailability bubbleAvailability2 = e9wVar.b() == null ? BubbleAvailability.HIDDEN : e9wVar.a((ylw) e9wVar.b.b(), pex0Var.b) != null ? BubbleAvailability.AVAILABLE : BubbleAvailability.HIDDEN;
        a aVar = (a) this.b.a;
        BubbleAvailability bubbleAvailability3 = aVar.h(pex0Var) ? BubbleAvailability.UNAVAILABLE : aVar.g() == null ? BubbleAvailability.HIDDEN : BubbleAvailability.AVAILABLE;
        mso msoVar = this.h;
        String str2 = pex0Var.b;
        TariffOrderFlow tariffOrderFlow2 = pex0Var.u0;
        boolean z5 = msoVar.b.e(str2) != null;
        if (((t8i.a) msoVar.a.b.a.getValue()).a == null || !z5) {
            z = false;
            bubbleAvailability = BubbleAvailability.HIDDEN;
        } else {
            boolean z6 = msoVar.b.e(str2) != null;
            if (tariffOrderFlow2 == TariffOrderFlow.DELIVERY_FLOW && z6) {
                e4a0 h = msoVar.d.a.h();
                lv90 e = msoVar.d.a.e();
                z = false;
                z2 = msoVar.c.d(new die0(j73.A(new e4a0[]{h, e != null ? e.a : null}), str2));
            } else {
                z = false;
                z2 = true;
            }
            bubbleAvailability = z2 ? BubbleAvailability.UNAVAILABLE : BubbleAvailability.AVAILABLE;
        }
        BubbleAvailability bubbleAvailability4 = bubbleAvailability;
        oy80 oy80Var = this.i;
        TariffOrderFlow tariffOrderFlow3 = pex0Var.u0;
        e eVar = (e) oy80Var.c;
        BubbleAvailability bubbleAvailability5 = (((Boolean) ((wt90) oy80Var.b).b.getValue()).booleanValue() && eVar.b() && tariffOrderFlow3 == (tariffOrderFlow = TariffOrderFlow.DELIVERY_FLOW)) ? (tariffOrderFlow3 == tariffOrderFlow && eVar.b()) ? BubbleAvailability.AVAILABLE : BubbleAvailability.UNAVAILABLE : BubbleAvailability.HIDDEN;
        j0g j0gVar = this.j;
        BubbleAvailability bubbleAvailability6 = (((czi0) j0gVar.a).b.getValue() == null || !((yli) j0gVar.b).a(pex0Var)) ? BubbleAvailability.HIDDEN : BubbleAvailability.AVAILABLE;
        j0g j0gVar2 = this.m;
        zgi a2 = ((chi) j0gVar2.a).a.a();
        BubbleAvailability bubbleAvailability7 = (((Boolean) ((d) j0gVar2.b).c.getValue()).booleanValue() && (a2 != null ? a2.a : z)) ? BubbleAvailability.AVAILABLE : BubbleAvailability.HIDDEN;
        k3i k3iVar = (k3i) this.k.a;
        k3iVar.getClass();
        return new bdj0(arrayList5, arrayList4, A, bubbleAvailability2, bubbleAvailability3, bubbleAvailability4, bubbleAvailability5, bubbleAvailability6, bubbleAvailability7, (k3iVar.b() && k3i.a(pex0Var)) ? BubbleAvailability.AVAILABLE : BubbleAvailability.HIDDEN);
    }
}
