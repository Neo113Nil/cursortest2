package com.yandex.go.explorer.impl.ui.map;

import android.animation.ValueAnimator;
import com.uber.h3core.util.LatLng;
import com.yandex.go.explorer.impl.ui.map.c;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import defpackage.ah00;
import defpackage.auo;
import defpackage.cvo;
import defpackage.dzm;
import defpackage.el00;
import defpackage.gh00;
import defpackage.guo;
import defpackage.hto;
import defpackage.i3y;
import defpackage.jc0;
import defpackage.jl40;
import defpackage.luo;
import defpackage.n3e0;
import defpackage.pzt0;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.xm00;
import defpackage.xto;
import defpackage.yga1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class a implements guo {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.guo
    public final void F9(List list) {
        c cVar = this.a;
        if (jl40.l(cVar.D, list)) {
            return;
        }
        pzt0 pzt0Var = cVar.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        cVar.Ig();
        cVar.D = list;
        if (list.isEmpty()) {
            return;
        }
        xm00 p = ((gh00) ((ah00) cVar.b)).i.p();
        p.k(2.0f);
        p.i(false);
        cVar.B = p;
        cVar.G = tje.N(cVar.E, null, null, new ExplorerOverlay$prepareUnviewedHexes$1(list, cVar, p, null), 3);
    }

    @Override // defpackage.guo
    public final void J7(e eVar) {
        c cVar = this.a;
        pzt0 pzt0Var = cVar.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 N = tje.N(cVar.E, null, null, new ExplorerOverlay$fadeOutUnviewedHexes$1(cVar, null), 3);
        N.w(new dzm(12, eVar));
        cVar.F = N;
    }

    @Override // defpackage.guo
    public final void X7() {
        c cVar = this.a;
        cVar.A.clear();
        xm00 xm00Var = cVar.z;
        if (xm00Var != null) {
            xm00Var.m();
        }
        cVar.z = null;
    }

    @Override // defpackage.guo
    public final void ee(cvo cvoVar, d dVar) {
        boolean z = cvoVar.a;
        final c cVar = this.a;
        auo auoVar = cVar.R;
        auo auoVar2 = cVar.Q;
        b bVar = cVar.J;
        ah00 ah00Var = (ah00) cVar.b;
        final int i = 1;
        if (!z) {
            pzt0 pzt0Var = cVar.F;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            com.yandex.go.explorer.impl.ui.map.animation.a aVar = cVar.S;
            aVar.b = true;
            ArrayList arrayList = aVar.a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ValueAnimator) it.next()).cancel();
            }
            arrayList.clear();
            final int i2 = 0;
            auoVar2.a(0.0f, new sls() { // from class: iuo
                @Override // defpackage.sls
                public final Object invoke() {
                    int i3 = i2;
                    zy11 zy11Var = zy11.a;
                    c cVar2 = cVar;
                    switch (i3) {
                        case 0:
                            xm00 xm00Var = cVar2.x;
                            if (xm00Var != null) {
                                xm00Var.i(false);
                            }
                            cVar2.Ig();
                            break;
                        default:
                            xm00 xm00Var2 = cVar2.z;
                            if (xm00Var2 != null) {
                                xm00Var2.i(false);
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            });
            auoVar.a(0.0f, new sls() { // from class: iuo
                @Override // defpackage.sls
                public final Object invoke() {
                    int i3 = i;
                    zy11 zy11Var = zy11.a;
                    c cVar2 = cVar;
                    switch (i3) {
                        case 0:
                            xm00 xm00Var = cVar2.x;
                            if (xm00Var != null) {
                                xm00Var.i(false);
                            }
                            cVar2.Ig();
                            break;
                        default:
                            xm00 xm00Var2 = cVar2.z;
                            if (xm00Var2 != null) {
                                xm00Var2.i(false);
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            });
            ((gh00) ah00Var).t(bVar);
            return;
        }
        xm00 xm00Var = cVar.x;
        if (xm00Var == null) {
            return;
        }
        xm00Var.i(true);
        xm00 xm00Var2 = cVar.z;
        if (xm00Var2 != null) {
            xm00Var2.i(true);
        }
        xm00 xm00Var3 = cVar.B;
        if (xm00Var3 != null) {
            xm00Var3.i(true);
        }
        ((gh00) ah00Var).d(bVar);
        cVar.w.c();
        auoVar2.a(1.0f, new jc0(28, dVar));
        if (cVar.A.isEmpty()) {
            return;
        }
        auoVar.a(1.0f, null);
    }

    @Override // defpackage.guo
    public final void n3(List list) {
        c cVar = this.a;
        auo auoVar = cVar.R;
        X7();
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        cVar.z = ((gh00) ((ah00) cVar.b)).i.p();
        float f = auoVar.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Polygon polygon = (Polygon) it.next();
            xm00 xm00Var = cVar.z;
            if (xm00Var != null) {
                n3e0 n3e0Var = new n3e0(polygon);
                n3e0Var.b(xm00Var);
                n3e0Var.u(yga1.b(f, cVar.M));
                n3e0Var.p(2.0f);
                n3e0Var.r(cVar.N);
                n3e0Var.k(100.0f);
                cVar.A.add(n3e0Var);
            }
        }
        auoVar.a(1.0f, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0309  */
    @Override // defpackage.eyi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void render(Object obj) {
        EmptyList emptyList;
        EmptyList emptyList2;
        ArrayList arrayList;
        luo luoVar;
        EmptyList emptyList3;
        ArrayList arrayList2;
        Iterator it;
        LinearRing h;
        EmptyList emptyList4;
        Iterator it2;
        c cVar = this.a;
        Set set = ((cvo) obj).b;
        EmptyList emptyList5 = EmptyList.a;
        ArrayList arrayList3 = cVar.y;
        xm00 xm00Var = cVar.x;
        if (xm00Var == null) {
            return;
        }
        if (!set.isEmpty()) {
            i3y i3yVar = xto.a;
            if (!set.isEmpty()) {
                ArrayList c = xto.c().c(kotlin.collections.a.J0(set));
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = c.iterator();
                while (it3.hasNext()) {
                    List list = (List) it3.next();
                    List list2 = (List) kotlin.collections.a.R(list);
                    if (list2 == null) {
                        list2 = emptyList5;
                    }
                    if (list2.size() < 4) {
                        emptyList2 = emptyList5;
                        arrayList = arrayList3;
                        luoVar = null;
                    } else {
                        List<LatLng> list3 = list2;
                        ArrayList arrayList5 = new ArrayList(tcc.n(list3, 10));
                        for (LatLng latLng : list3) {
                            arrayList5.add(new Point(latLng.a, latLng.b));
                            list = list;
                        }
                        List<List> J = kotlin.collections.a.J(list, 1);
                        ArrayList arrayList6 = new ArrayList(tcc.n(J, 10));
                        for (List<LatLng> list4 : J) {
                            ArrayList arrayList7 = new ArrayList(tcc.n(list4, 10));
                            for (LatLng latLng2 : list4) {
                                arrayList7.add(new Point(latLng2.a, latLng2.b));
                                emptyList5 = emptyList5;
                                arrayList3 = arrayList3;
                            }
                            arrayList6.add(arrayList7);
                        }
                        emptyList2 = emptyList5;
                        arrayList = arrayList3;
                        luoVar = new luo(arrayList5, arrayList6);
                    }
                    if (luoVar != null) {
                        arrayList4.add(luoVar);
                    }
                    emptyList5 = emptyList2;
                    arrayList3 = arrayList;
                }
                emptyList = emptyList5;
                emptyList3 = arrayList4;
                arrayList2 = arrayList3;
                ArrayList arrayList8 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                it = emptyList3.iterator();
                int i = 0;
                while (it.hasNext()) {
                    luo luoVar2 = (luo) it.next();
                    Iterator it4 = luoVar2.b.iterator();
                    while (it4.hasNext()) {
                        List list5 = (List) it4.next();
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj2 : emptyList3) {
                            luo luoVar3 = (luo) obj2;
                            if (luoVar3 != luoVar2) {
                                i3y i3yVar2 = xto.a;
                                if (xto.d((Point) kotlin.collections.a.P(luoVar3.a), list5)) {
                                    arrayList9.add(obj2);
                                }
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it5 = arrayList9.iterator();
                        while (it5.hasNext()) {
                            Object next = it5.next();
                            luo luoVar4 = (luo) next;
                            if (!arrayList9.isEmpty()) {
                                Iterator it6 = arrayList9.iterator();
                                while (it6.hasNext()) {
                                    luo luoVar5 = (luo) it6.next();
                                    if (luoVar5 != luoVar4) {
                                        i3y i3yVar3 = xto.a;
                                        it2 = it;
                                        if (xto.d((Point) kotlin.collections.a.P(luoVar4.a), luoVar5.a)) {
                                            break;
                                        }
                                    } else {
                                        it2 = it;
                                    }
                                    it = it2;
                                }
                            }
                            it2 = it;
                            arrayList10.add(next);
                            it = it2;
                        }
                        linkedHashMap.put(Integer.valueOf(i), arrayList10);
                        i++;
                        it = it;
                    }
                }
                EmptyList<luo> emptyList6 = emptyList3;
                ArrayList arrayList11 = new ArrayList();
                for (Object obj3 : emptyList6) {
                    luo luoVar6 = (luo) obj3;
                    if (!(emptyList6 instanceof Collection) || !emptyList6.isEmpty()) {
                        for (luo luoVar7 : emptyList6) {
                            if (luoVar7 != luoVar6) {
                                ArrayList<List> arrayList12 = luoVar7.b;
                                if (!arrayList12.isEmpty()) {
                                    for (List list6 : arrayList12) {
                                        i3y i3yVar4 = xto.a;
                                        if (xto.d((Point) kotlin.collections.a.P(luoVar6.a), list6)) {
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    arrayList11.add(obj3);
                }
                i3y i3yVar5 = xto.a;
                h = ru.yandex.taxi.map_common.map.k.h(xto.a(scc.g(hto.a, hto.b, hto.d, hto.c)));
                if (h != null) {
                    emptyList4 = emptyList;
                } else {
                    ArrayList arrayList13 = new ArrayList();
                    Iterator it7 = arrayList11.iterator();
                    while (it7.hasNext()) {
                        LinearRing h2 = ru.yandex.taxi.map_common.map.k.h(((luo) it7.next()).a);
                        if (h2 != null) {
                            arrayList13.add(h2);
                        }
                    }
                    Polygon polygon = !el00.a ? null : new Polygon(h, arrayList13);
                    if (polygon != null) {
                        arrayList8.add(polygon);
                    }
                    Iterator it8 = emptyList3.iterator();
                    int i2 = 0;
                    while (it8.hasNext()) {
                        Iterator it9 = ((luo) it8.next()).b.iterator();
                        while (it9.hasNext()) {
                            List list7 = (List) it9.next();
                            List list8 = (List) linkedHashMap.get(Integer.valueOf(i2));
                            if (list8 == null) {
                                list8 = emptyList;
                            }
                            ArrayList arrayList14 = new ArrayList();
                            Iterator it10 = list8.iterator();
                            while (it10.hasNext()) {
                                LinearRing h3 = ru.yandex.taxi.map_common.map.k.h(((luo) it10.next()).a);
                                if (h3 != null) {
                                    arrayList14.add(h3);
                                }
                            }
                            LinearRing h4 = ru.yandex.taxi.map_common.map.k.h(list7);
                            if (h4 != null) {
                                Polygon polygon2 = !el00.a ? null : new Polygon(h4, arrayList14);
                                if (polygon2 != null) {
                                    arrayList8.add(polygon2);
                                }
                            }
                            i2++;
                        }
                    }
                    emptyList4 = arrayList8;
                }
                float f = cVar.Q.a;
                if (arrayList2.size() == emptyList4.size()) {
                    Iterator it11 = arrayList2.iterator();
                    while (it11.hasNext()) {
                        ((n3e0) it11.next()).d();
                    }
                    arrayList2.clear();
                    Iterator<E> it12 = emptyList4.iterator();
                    while (it12.hasNext()) {
                        n3e0 n3e0Var = new n3e0((Polygon) it12.next());
                        n3e0Var.b(xm00Var);
                        n3e0Var.r(yga1.b(f, cVar.K));
                        n3e0Var.p(1.0f);
                        n3e0Var.u(yga1.b(f, cVar.L));
                        arrayList2.add(n3e0Var);
                    }
                    return;
                }
                Iterator it13 = arrayList2.iterator();
                int i3 = 0;
                while (it13.hasNext()) {
                    Object next2 = it13.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        scc.m();
                        throw null;
                    }
                    n3e0 n3e0Var2 = (n3e0) next2;
                    n3e0Var2.o(emptyList4.get(i3));
                    n3e0Var2.r(yga1.b(f, cVar.K));
                    n3e0Var2.p(1.0f);
                    n3e0Var2.u(yga1.b(f, cVar.L));
                    i3 = i4;
                }
                return;
            }
        }
        emptyList = emptyList5;
        emptyList3 = emptyList;
        arrayList2 = arrayList3;
        ArrayList arrayList82 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        it = emptyList3.iterator();
        int i5 = 0;
        while (it.hasNext()) {
        }
        EmptyList<luo> emptyList62 = emptyList3;
        ArrayList arrayList112 = new ArrayList();
        while (r7.hasNext()) {
        }
        i3y i3yVar52 = xto.a;
        h = ru.yandex.taxi.map_common.map.k.h(xto.a(scc.g(hto.a, hto.b, hto.d, hto.c)));
        if (h != null) {
        }
        float f2 = cVar.Q.a;
        if (arrayList2.size() == emptyList4.size()) {
        }
    }
}
