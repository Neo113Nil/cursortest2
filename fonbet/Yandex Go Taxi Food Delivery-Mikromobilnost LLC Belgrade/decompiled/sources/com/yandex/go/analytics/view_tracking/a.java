package com.yandex.go.analytics.view_tracking;

import android.graphics.Rect;
import android.view.View;
import defpackage.eci0;
import defpackage.fei0;
import defpackage.ffx;
import defpackage.g6v;
import defpackage.hbp0;
import defpackage.hsc;
import defpackage.iq31;
import defpackage.l8x;
import defpackage.tcc;
import defpackage.tt2;
import defpackage.ypf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public abstract class a {
    public final fei0 a;
    public final tt2 b;
    public final hbp0 c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final Enum f;
    public final n0 g;
    public final eci0 h;

    public a(fei0 fei0Var, ViewVisibilityTracker$SingleState viewVisibilityTracker$SingleState, tt2 tt2Var) {
        this.a = fei0Var;
        this.b = tt2Var;
        this.c = new hbp0(new ViewVisibilityTracker$coroutineScope$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
        this.d = b.l(new Pair(viewVisibilityTracker$SingleState, new LinkedHashSet()));
        this.e = b.l(new Pair(viewVisibilityTracker$SingleState, new LinkedHashMap()));
        this.f = viewVisibilityTracker$SingleState;
        new ArrayList();
        n0 c = ffx.c(0, 0, null, 7);
        this.g = c;
        this.h = e.c(c);
    }

    public final void a() {
        Set keySet;
        l8x l8xVar;
        hbp0 hbp0Var = this.c;
        if (hbp0Var.d()) {
            WeakHashMap weakHashMap = ((ypf0) this).j;
            ArrayList arrayList = new ArrayList(weakHashMap.keySet());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                View view = (View) next;
                boolean isShown = view.isShown();
                iq31 iq31Var = iq31.c;
                if (isShown) {
                    if (view.getGlobalVisibleRect(new Rect())) {
                        iq31Var = new iq31(r6.height() / view.getHeight(), r6.width() / view.getWidth());
                    }
                }
                if (iq31Var.b * iq31Var.a >= this.a.a) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                hsc hscVar = (hsc) weakHashMap.get((View) it2.next());
                if (hscVar != null) {
                    arrayList3.add(hscVar);
                }
            }
            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((hsc) ((g6v) it3.next())).b);
            }
            Set N0 = kotlin.collections.a.N0(arrayList4);
            LinkedHashMap linkedHashMap = this.e;
            Enum r4 = this.f;
            Map map = (Map) linkedHashMap.get(r4);
            if (map != null && (keySet = map.keySet()) != null) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj : keySet) {
                    if (!N0.contains((String) obj)) {
                        arrayList5.add(obj);
                    }
                }
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    String str = (String) it4.next();
                    Map map2 = (Map) linkedHashMap.get(r4);
                    if (map2 != null && (l8xVar = (l8x) map2.remove(str)) != null) {
                        l8xVar.a(null);
                    }
                }
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                g6v g6vVar = (g6v) next2;
                Set set = (Set) this.d.get(r4);
                if (!(set != null ? set.contains(((hsc) g6vVar).b) : false)) {
                    Map map3 = (Map) linkedHashMap.get(r4);
                    if (!(map3 != null ? map3.keySet().contains(((hsc) g6vVar).b) : false)) {
                        arrayList6.add(next2);
                    }
                }
            }
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                g6v g6vVar2 = (g6v) it6.next();
                Map map4 = (Map) linkedHashMap.get(r4);
                if (map4 != null) {
                    map4.put(((hsc) g6vVar2).b, hbp0.e(hbp0Var, null, null, new ViewVisibilityTracker$startWaitingForTimeout$1(this, r4, g6vVar2, null), 3));
                }
            }
        }
    }
}
