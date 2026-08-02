package com.yandex.div.core.view2;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div2.DivVisibilityAction;
import defpackage.aw5;
import defpackage.b7;
import defpackage.f9l;
import defpackage.ffx;
import defpackage.fu11;
import defpackage.gw00;
import defpackage.iql;
import defpackage.j1x0;
import defpackage.jl40;
import defpackage.m3k;
import defpackage.ngd0;
import defpackage.nnk;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pw31;
import defpackage.rvo;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tls;
import defpackage.uml;
import defpackage.unr0;
import defpackage.wfx;
import defpackage.wls;
import defpackage.zmk;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class i {
    public final pw31 a;
    public final g b;
    public boolean l;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final iql d = new iql();
    public final iql e = new iql();
    public final j f = new j(new DivVisibilityActionTracker$isEnabledObserver$1(this), new DivVisibilityActionTracker$isEnabledObserver$2(this));
    public final WeakHashMap g = new WeakHashMap();
    public final WeakHashMap h = new WeakHashMap();
    public final WeakHashMap i = new WeakHashMap();
    public final j1x0 j = new j1x0();
    public final WeakHashMap k = new WeakHashMap();
    public final b7 m = new b7(22, this);

    public i(pw31 pw31Var, g gVar) {
        this.a = pw31Var;
        this.b = gVar;
    }

    public static final void a(i iVar, Div2View div2View, rvo rvoVar, View view, ArrayList arrayList, long j, iql iqlVar) {
        iVar.getClass();
        HashMap hashMap = new HashMap(arrayList.size(), 1.0f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f9l f9lVar = (f9l) it.next();
            b bVar = new b(div2View.getDataTag().a, div2View.getLogId(), (String) f9lVar.b().a(rvoVar));
            int i = wfx.a;
            Pair pair = new Pair(bVar, f9lVar);
            hashMap.put(pair.c(), pair.f());
        }
        Map synchronizedMap = Collections.synchronizedMap(hashMap);
        iqlVar.a.add(synchronizedMap);
        String logId = div2View.getLogId();
        Handler handler = iVar.c;
        h hVar = new h(iVar, view, div2View, logId, rvoVar, synchronizedMap, arrayList);
        if (synchronizedMap == null) {
            handler.postDelayed(hVar, j);
        } else {
            handler.postDelayed(hVar, synchronizedMap, j);
        }
    }

    public static final void b(i iVar, View view, m3k m3kVar, int i) {
        WeakHashMap weakHashMap = iVar.g;
        if (i > 0) {
            weakHashMap.put(view, m3kVar);
        } else {
            weakHashMap.remove(view);
        }
        if (iVar.l) {
            return;
        }
        iVar.l = true;
        iVar.c.post(iVar.m);
    }

    public static ArrayList e(List list, rvo rvoVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) ((f9l) obj).isEnabled().a(rvoVar)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void i(aw5 aw5Var, View view, m3k m3kVar, wls wlsVar) {
        if (!((Boolean) wlsVar.invoke(view, m3kVar)).booleanValue() || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            } else {
                i(aw5Var, childAt, aw5Var.a.takeBindingDiv$div_release(childAt), wlsVar);
                i = i2;
            }
        }
    }

    public static void l(i iVar, Div2View div2View, rvo rvoVar, View view, m3k m3kVar) {
        List d = uml.d(m3kVar.d());
        List l = m3kVar.d().l();
        if (l == null) {
            l = EmptyList.a;
        }
        iVar.k(div2View, rvoVar, view, m3kVar, d, l);
    }

    public final void c(b bVar, View view, f9l f9lVar, iql iqlVar) {
        Object obj;
        int i = wfx.a;
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$cancelTracking$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                i.this.c.removeCallbacksAndMessages((Map) obj2);
                return zy11.a;
            }
        };
        ConcurrentLinkedQueue concurrentLinkedQueue = iqlVar.a;
        Iterator it = concurrentLinkedQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map) obj).remove(bVar) != null) {
                    break;
                }
            }
        }
        Map map = (Map) obj;
        if (map != null && map.isEmpty()) {
            tlsVar.invoke(map);
            concurrentLinkedQueue.remove(map);
        }
        WeakHashMap weakHashMap = this.k;
        Set set = (Set) weakHashMap.get(view);
        if (!(f9lVar instanceof nnk) || view == null || set == null) {
            return;
        }
        set.remove(f9lVar);
        if (set.isEmpty()) {
            weakHashMap.remove(view);
            this.j.remove(view);
        }
    }

    public final void d(final aw5 aw5Var, View view, m3k m3kVar) {
        i(aw5Var, view, m3kVar, new wls() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$cancelTrackingViewsHierarchy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                View view2 = (View) obj;
                m3k m3kVar2 = (m3k) obj2;
                i.this.i.remove(view2);
                if (m3kVar2 != null) {
                    aw5 aw5Var2 = aw5Var;
                    i iVar = i.this;
                    aw5 v = com.yandex.div.core.view2.divs.a.v(view2);
                    if (v == null) {
                        v = aw5Var2;
                    }
                    i.l(iVar, aw5Var2.a, v.b, null, m3kVar2);
                }
                return Boolean.TRUE;
            }
        });
    }

    public final LinkedHashMap f() {
        LinkedHashMap linkedHashMap;
        j1x0 j1x0Var = this.j;
        synchronized (j1x0Var.a) {
            Set<Map.Entry> entrySet = j1x0Var.entrySet();
            int d = gw00.d(tcc.n(entrySet, 10));
            if (d < 16) {
                d = 16;
            }
            linkedHashMap = new LinkedHashMap(d);
            for (Map.Entry entry : entrySet) {
                Pair pair = new Pair(entry.getKey(), entry.getValue());
                linkedHashMap.put(pair.c(), pair.f());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r12 >= ((java.lang.Number) ((com.yandex.div2.DivVisibilityAction) r11).k.a(r9)).longValue()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0046, code lost:
    
        if (r12 <= ((java.lang.Number) ((defpackage.nnk) r11).k.a(r9)).longValue()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r12 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Div2View div2View, rvo rvoVar, View view, f9l f9lVar, int i, iql iqlVar) {
        boolean z;
        Object obj;
        b bVar;
        Set keySet;
        b[] bVarArr;
        if (!(f9lVar instanceof DivVisibilityAction)) {
            if (f9lVar instanceof nnk) {
                Set set = (Set) this.k.get(view);
                if (set != null ? set.contains(f9lVar) : false) {
                }
            }
            z = false;
        }
        b bVar2 = new b(div2View.getDataTag().a, div2View.getLogId(), (String) f9lVar.b().a(rvoVar));
        Iterator it = iqlVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Map) obj).containsKey(bVar2)) {
                break;
            }
        }
        Map map = (Map) obj;
        if (map != null && (keySet = map.keySet()) != null && (bVarArr = (b[]) keySet.toArray(new b[0])) != null) {
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVar = bVarArr[i2];
                if (jl40.l(bVar, bVar2)) {
                    break;
                }
            }
        }
        bVar = null;
        if (view != null && bVar == null && z) {
            return true;
        }
        if ((view == null || bVar != null || z) && (view == null || bVar == null || !z)) {
            if (view != null && bVar != null && !z) {
                c(bVar, view, f9lVar, iqlVar);
                return false;
            }
            if (view == null && bVar != null) {
                c(bVar, null, f9lVar, iqlVar);
            }
        }
        return false;
    }

    public final void h(final aw5 aw5Var, View view, m3k m3kVar) {
        i(aw5Var, view, m3kVar, new wls() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$startTrackingViewsHierarchy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                View view2 = (View) obj;
                m3k m3kVar2 = (m3k) obj2;
                Rect rect = i.this.a.a;
                boolean z = true;
                boolean z2 = view2.isShown() && view2.getGlobalVisibleRect(rect) && view2.getWidth() == rect.width() && view2.getHeight() == rect.height();
                if (z2 && jl40.l(i.this.i.get(view2), Boolean.TRUE)) {
                    z = false;
                } else {
                    i.this.i.put(view2, Boolean.valueOf(z2));
                    if (m3kVar2 != null) {
                        aw5 aw5Var2 = aw5Var;
                        i iVar = i.this;
                        aw5 v = com.yandex.div.core.view2.divs.a.v(view2);
                        if (v == null) {
                            v = aw5Var2;
                        }
                        i.l(iVar, aw5Var2.a, v.b, view2, m3kVar2);
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final void j(final Div2View div2View, final rvo rvoVar, final View view, final m3k m3kVar, final List list, final List list2) {
        int i;
        int i2;
        i iVar = this;
        rvo rvoVar2 = rvoVar;
        View view2 = view;
        ngd0 ngd0Var = ngd0.G;
        ngd0Var.p();
        fu11 fu11Var = fu11.a;
        boolean a = fu11Var.a();
        j1x0 j1x0Var = iVar.j;
        WeakHashMap weakHashMap = iVar.k;
        pw31 pw31Var = iVar.a;
        if (a) {
            int a2 = pw31Var.a(view2);
            b(iVar, view2, m3kVar, a2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                Long valueOf = Long.valueOf(((Number) ooc.p((DivVisibilityAction) obj).a(rvoVar2)).longValue());
                Object obj2 = linkedHashMap.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(valueOf, obj2);
                }
                ((List) obj2).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                List list3 = (List) entry.getValue();
                ArrayList arrayList = new ArrayList(list3.size());
                for (Object obj3 : list3) {
                    if (iVar.g(div2View, rvoVar2, view2, (DivVisibilityAction) obj3, a2, iVar.d)) {
                        arrayList.add(obj3);
                    }
                    rvoVar2 = rvoVar;
                    view2 = view;
                }
                if (arrayList.isEmpty()) {
                    rvoVar2 = rvoVar;
                    view2 = view;
                    i2 = a2;
                } else {
                    rvoVar2 = rvoVar;
                    view2 = view;
                    i2 = a2;
                    a(iVar, div2View, rvoVar2, view2, arrayList, longValue, iVar.d);
                }
                a2 = i2;
            }
            int i3 = a2;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : list2) {
                Long valueOf2 = Long.valueOf(((Number) ooc.p((nnk) obj4).a(rvoVar2)).longValue());
                Object obj5 = linkedHashMap2.get(valueOf2);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap2.put(valueOf2, obj5);
                }
                ((List) obj5).add(obj4);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                long longValue2 = ((Number) entry2.getKey()).longValue();
                List list4 = (List) entry2.getValue();
                List<nnk> list5 = list4;
                boolean z = false;
                for (nnk nnkVar : list5) {
                    List list6 = list4;
                    boolean z2 = ((long) i3) > ((Number) nnkVar.k.a(rvoVar2)).longValue();
                    z = z || z2;
                    if (z2) {
                        Object obj6 = weakHashMap.get(view2);
                        if (obj6 == null) {
                            obj6 = new LinkedHashSet();
                            weakHashMap.put(view2, obj6);
                        }
                        ((Set) obj6).add(nnkVar);
                    }
                    rvoVar2 = rvoVar;
                    list4 = list6;
                }
                List list7 = list4;
                if (z) {
                    j1x0Var.put(view2, m3kVar);
                }
                ArrayList arrayList2 = new ArrayList(list7.size());
                for (Object obj7 : list5) {
                    int i4 = i3;
                    if (iVar.g(div2View, rvoVar, view2, (nnk) obj7, i4, iVar.e)) {
                        arrayList2.add(obj7);
                    }
                    view2 = view;
                    i3 = i4;
                }
                int i5 = i3;
                if (arrayList2.isEmpty()) {
                    rvoVar2 = rvoVar;
                    view2 = view;
                } else {
                    rvoVar2 = rvoVar;
                    view2 = view;
                    a(iVar, div2View, rvoVar2, view2, arrayList2, longValue2, iVar.e);
                }
                i3 = i5;
            }
            return;
        }
        Div2View div2View2 = div2View;
        com.yandex.div.core.util.binding.a g = unr0.g(div2View2, ngd0Var);
        if (!fu11Var.a()) {
            g.c(new sls() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$trackVisibilityActions$$inlined$runMainThreadAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int a3 = this.a.a(view);
                    i.b(this, view, m3kVar, a3);
                    List list8 = list;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Object obj8 : list8) {
                        Long valueOf3 = Long.valueOf(((Number) ooc.p((DivVisibilityAction) obj8).a(rvoVar)).longValue());
                        Object obj9 = linkedHashMap3.get(valueOf3);
                        if (obj9 == null) {
                            obj9 = new ArrayList();
                            linkedHashMap3.put(valueOf3, obj9);
                        }
                        ((List) obj9).add(obj8);
                    }
                    for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                        long longValue3 = ((Number) entry3.getKey()).longValue();
                        List list9 = (List) entry3.getValue();
                        ArrayList arrayList3 = new ArrayList(list9.size());
                        for (Object obj10 : list9) {
                            i iVar2 = this;
                            if (iVar2.g(div2View, rvoVar, view, (DivVisibilityAction) obj10, a3, iVar2.d)) {
                                arrayList3.add(obj10);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            i iVar3 = this;
                            i.a(iVar3, div2View, rvoVar, view, arrayList3, longValue3, iVar3.d);
                        }
                    }
                    List list10 = list2;
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Object obj11 : list10) {
                        Long valueOf4 = Long.valueOf(((Number) ooc.p((nnk) obj11).a(rvoVar)).longValue());
                        Object obj12 = linkedHashMap4.get(valueOf4);
                        if (obj12 == null) {
                            obj12 = new ArrayList();
                            linkedHashMap4.put(valueOf4, obj12);
                        }
                        ((List) obj12).add(obj11);
                    }
                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                        long longValue4 = ((Number) entry4.getKey()).longValue();
                        List list11 = (List) entry4.getValue();
                        List<nnk> list12 = list11;
                        boolean z3 = false;
                        for (nnk nnkVar2 : list12) {
                            boolean z4 = ((long) a3) > ((Number) nnkVar2.k.a(rvoVar)).longValue();
                            z3 = z3 || z4;
                            if (z4) {
                                WeakHashMap weakHashMap2 = this.k;
                                View view3 = view;
                                Object obj13 = weakHashMap2.get(view3);
                                if (obj13 == null) {
                                    obj13 = new LinkedHashSet();
                                    weakHashMap2.put(view3, obj13);
                                }
                                ((Set) obj13).add(nnkVar2);
                            }
                        }
                        if (z3) {
                            this.j.put(view, m3kVar);
                        }
                        ArrayList arrayList4 = new ArrayList(list11.size());
                        for (Object obj14 : list12) {
                            i iVar4 = this;
                            if (iVar4.g(div2View, rvoVar, view, (nnk) obj14, a3, iVar4.e)) {
                                arrayList4.add(obj14);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            i iVar5 = this;
                            i.a(iVar5, div2View, rvoVar, view, arrayList4, longValue4, iVar5.e);
                        }
                    }
                    return zy11.a;
                }
            });
            return;
        }
        int a3 = pw31Var.a(view2);
        b(iVar, view2, m3kVar, a3);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj8 : list) {
            Long valueOf3 = Long.valueOf(((Number) ooc.p((DivVisibilityAction) obj8).a(rvoVar2)).longValue());
            Object obj9 = linkedHashMap3.get(valueOf3);
            if (obj9 == null) {
                obj9 = new ArrayList();
                linkedHashMap3.put(valueOf3, obj9);
            }
            ((List) obj9).add(obj8);
        }
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            long longValue3 = ((Number) entry3.getKey()).longValue();
            List list8 = (List) entry3.getValue();
            ArrayList arrayList3 = new ArrayList(list8.size());
            for (Object obj10 : list8) {
                if (iVar.g(div2View2, rvoVar2, view2, (DivVisibilityAction) obj10, a3, iVar.d)) {
                    arrayList3.add(obj10);
                }
                div2View2 = div2View;
                rvoVar2 = rvoVar;
                view2 = view;
            }
            if (arrayList3.isEmpty()) {
                rvoVar2 = rvoVar;
                view2 = view;
                i = a3;
            } else {
                i = a3;
                rvoVar2 = rvoVar;
                view2 = view;
                a(iVar, div2View, rvoVar2, view2, arrayList3, longValue3, iVar.d);
            }
            div2View2 = div2View;
            a3 = i;
        }
        int i6 = a3;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Object obj11 : list2) {
            Long valueOf4 = Long.valueOf(((Number) ooc.p((nnk) obj11).a(rvoVar2)).longValue());
            Object obj12 = linkedHashMap4.get(valueOf4);
            if (obj12 == null) {
                obj12 = new ArrayList();
                linkedHashMap4.put(valueOf4, obj12);
            }
            ((List) obj12).add(obj11);
        }
        for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
            long longValue4 = ((Number) entry4.getKey()).longValue();
            List list9 = (List) entry4.getValue();
            List<nnk> list10 = list9;
            boolean z3 = false;
            for (nnk nnkVar2 : list10) {
                List list11 = list9;
                boolean z4 = ((long) i6) > ((Number) nnkVar2.k.a(rvoVar2)).longValue();
                z3 = z3 || z4;
                if (z4) {
                    Object obj13 = weakHashMap.get(view2);
                    if (obj13 == null) {
                        obj13 = new LinkedHashSet();
                        weakHashMap.put(view2, obj13);
                    }
                    ((Set) obj13).add(nnkVar2);
                }
                rvoVar2 = rvoVar;
                list9 = list11;
            }
            List list12 = list9;
            if (z3) {
                j1x0Var.put(view2, m3kVar);
            }
            ArrayList arrayList4 = new ArrayList(list12.size());
            for (Object obj14 : list10) {
                int i7 = i6;
                if (iVar.g(div2View, rvoVar, view2, (nnk) obj14, i7, iVar.e)) {
                    arrayList4.add(obj14);
                }
                view2 = view;
                i6 = i7;
            }
            int i8 = i6;
            if (!arrayList4.isEmpty()) {
                a(iVar, div2View, rvoVar, view, arrayList4, longValue4, iVar.e);
            }
            iVar = this;
            rvoVar2 = rvoVar;
            view2 = view;
            i6 = i8;
        }
    }

    public final void k(final Div2View div2View, final rvo rvoVar, final View view, final m3k m3kVar, final List list, final List list2) {
        List list3 = list2;
        final ArrayList m0 = kotlin.collections.a.m0(list3, list);
        if (m0.isEmpty()) {
            return;
        }
        final zmk dataTag = div2View.getDataTag();
        if (view == null) {
            j jVar = this.f;
            jVar.getClass();
            Iterator it = m0.iterator();
            while (it.hasNext()) {
                jVar.a((f9l) it.next());
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                g(div2View, rvoVar, null, (DivVisibilityAction) it2.next(), 0, this.d);
            }
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                g(div2View, rvoVar, null, (nnk) it3.next(), 0, this.e);
            }
            return;
        }
        WeakHashMap weakHashMap = this.h;
        if (weakHashMap.containsKey(view)) {
            return;
        }
        if (ffx.V(view) || (ffx.E(view) == null && !view.isLayoutRequested())) {
            if (jl40.l(div2View.getDataTag(), dataTag)) {
                this.f.b(view, div2View, rvoVar, m3kVar, m0);
                j(div2View, rvoVar, view, m3kVar, e(list, rvoVar), e(list2, rvoVar));
            }
            weakHashMap.remove(view);
            return;
        }
        View E = ffx.E(view);
        if (E != null) {
            E.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$trackVisibilityActionsOf$$inlined$doOnHierarchyLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    if (jl40.l(Div2View.this.getDataTag(), dataTag)) {
                        this.f.b(view, Div2View.this, rvoVar, m3kVar, m0);
                        i iVar = this;
                        Div2View div2View2 = Div2View.this;
                        rvo rvoVar2 = rvoVar;
                        View view3 = view;
                        m3k m3kVar2 = m3kVar;
                        List list4 = list;
                        iVar.getClass();
                        ArrayList e = i.e(list4, rvoVar2);
                        i iVar2 = this;
                        List list5 = list2;
                        rvo rvoVar3 = rvoVar;
                        iVar2.getClass();
                        iVar.j(div2View2, rvoVar2, view3, m3kVar2, e, i.e(list5, rvoVar3));
                    }
                    this.h.remove(view);
                }
            });
        }
        weakHashMap.put(view, m3kVar);
    }
}
