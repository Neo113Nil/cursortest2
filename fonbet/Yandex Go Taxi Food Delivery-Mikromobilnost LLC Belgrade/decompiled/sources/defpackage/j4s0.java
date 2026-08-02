package defpackage;

import com.yandex.go.shortcuts.dto.response.Mode;
import com.yandex.go.shortcuts.impl.analytic.a;
import com.yandex.go.shortcuts.perf.ShortcutsPerfMetrics$GridType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.perf.Milestone;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.shortcuts.ui.shortcutview.f;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes6.dex */
public final class j4s0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ j4s0(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        switch (this.a) {
            case 0:
                this.b.Ng(true, true);
                break;
            default:
                Pair pair = (Pair) obj;
                d4s0 d4s0Var = (d4s0) pair.getFirst();
                List list = (List) pair.getSecond();
                f fVar = this.b;
                o4s0 o4s0Var = fVar.S;
                if (o4s0Var != null) {
                    o4s0Var.a = list;
                }
                if (jl40.l(d4s0Var.b, d1z.a)) {
                    String str2 = d4s0Var.a.c;
                    a aVar = (a) fVar.D;
                    aVar.k = d4s0Var.g;
                    List list2 = d4s0Var.d;
                    int size = list2.size();
                    List list3 = d4s0Var.h;
                    ArrayList arrayList = new ArrayList(list3.size() + size);
                    arrayList.addAll(list2);
                    arrayList.addAll(list3);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e6v e6vVar = (e6v) it.next();
                        ycc.r(e6vVar instanceof zj11 ? kotlin.collections.a.A0(((zj11) e6vVar).b, 5) : e6vVar instanceof kx00 ? ((kx00) e6vVar).c() : e6vVar instanceof n3q0 ? ((n3q0) e6vVar).c : e6vVar instanceof x5b0 ? ((x5b0) e6vVar).d : Collections.singletonList(e6vVar), arrayList2);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof yyr0) {
                            arrayList3.add(next);
                        }
                    }
                    aVar.o = arrayList3;
                    fVar.G.k = str2;
                    List list4 = d4s0Var.c;
                    ArrayList arrayList4 = aVar.j;
                    List list5 = list4;
                    ArrayList arrayList5 = new ArrayList(tcc.n(list5, 10));
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(((sa4) it3.next()).a);
                    }
                    TreeSet treeSet = new TreeSet(arrayList4);
                    Iterator it4 = Mode.b().iterator();
                    boolean z = false;
                    while (it4.hasNext()) {
                        String lowerCase = ((Mode) it4.next()).name().toLowerCase(Locale.US);
                        z |= arrayList5.contains(lowerCase) ? treeSet.add(lowerCase) : treeSet.remove(lowerCase);
                    }
                    if (z && !treeSet.isEmpty()) {
                        int d = gw00.d(tcc.n(list5, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                        Iterator it5 = list5.iterator();
                        while (it5.hasNext()) {
                            linkedHashMap.put(((sa4) it5.next()).a, gw00.e(new Pair("is_disabled", String.valueOf(false))));
                        }
                        i d2 = ((j) aVar.a).d("Superapp.Showcase.Available");
                        LinkedHashMap linkedHashMap2 = d2.a;
                        linkedHashMap2.put("originScreen", "AddressSelection");
                        linkedHashMap2.put("services", linkedHashMap);
                        d2.m();
                        arrayList4.clear();
                        arrayList4.addAll(treeSet);
                    }
                    fVar.E.a(Milestone.MainScreenData);
                    yaf0 yaf0Var = d4s0Var.f;
                    if (yaf0Var != null) {
                        o3s0 o3s0Var = fVar.H;
                        ShortcutsPerfMetrics$GridType shortcutsPerfMetrics$GridType = ShortcutsPerfMetrics$GridType.TaxiShortcuts;
                        fva0 fva0Var = o3s0Var.a;
                        String p = qje.p(yaf0Var);
                        int i = n3s0.a[shortcutsPerfMetrics$GridType.ordinal()];
                        if (i == 1) {
                            str = "NavigationSection";
                        } else if (i != 2) {
                            w511.b();
                            break;
                        } else {
                            str = "TaxiSection";
                        }
                        fva0.b(fva0Var, unr0.o(p, Extension.DOT_CHAR, str, ".ResponseRendered"), PerformanceAnalytics$Type.Loading, null, 4);
                    }
                }
                ((c3s0) fVar.Dg()).Sd(d4s0Var);
                if (!d4s0Var.j) {
                    fVar.I.b((ike) fVar.Jg(), d4s0Var.h, new i4s0(fVar, 1));
                }
                if (!d4s0Var.j) {
                    fVar.M.b((ike) fVar.Jg(), d4s0Var.i, new i4s0(fVar, 0));
                }
                if (d4s0Var.k) {
                    r330 d3 = fVar.C.d();
                    SlideableModalView slideableModalView = d3 instanceof SlideableModalView ? (SlideableModalView) d3 : null;
                    if (slideableModalView != null) {
                        slideableModalView.expand();
                    }
                }
                break;
        }
        return zy11.a;
    }
}
