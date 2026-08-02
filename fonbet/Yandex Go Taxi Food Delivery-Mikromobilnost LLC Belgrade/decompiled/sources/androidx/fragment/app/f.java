package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat$Api21Impl;
import defpackage.ees;
import defpackage.eot0;
import defpackage.fes;
import defpackage.ges;
import defpackage.iot0;
import defpackage.ir31;
import defpackage.je4;
import defpackage.oxe;
import defpackage.p7h;
import defpackage.qkh;
import defpackage.rkh;
import defpackage.skh;
import defpackage.sls;
import defpackage.tcc;
import defpackage.u18;
import defpackage.w53;
import defpackage.zvg;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final class f extends eot0 {
    public final ArrayList c;
    public final iot0 d;
    public final iot0 e;
    public final ges f;
    public final Object g;
    public final ArrayList h;
    public final ArrayList i;
    public final w53 j;
    public final ArrayList k;
    public final ArrayList l;
    public final w53 m;
    public final w53 n;
    public final boolean o;
    public final u18 p = new u18();
    public Object q;
    public boolean r;

    public f(ArrayList arrayList, iot0 iot0Var, iot0 iot0Var2, ges gesVar, Object obj, ArrayList arrayList2, ArrayList arrayList3, w53 w53Var, ArrayList arrayList4, ArrayList arrayList5, w53 w53Var2, w53 w53Var3, boolean z) {
        this.c = arrayList;
        this.d = iot0Var;
        this.e = iot0Var2;
        this.f = gesVar;
        this.g = obj;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = w53Var;
        this.k = arrayList4;
        this.l = arrayList5;
        this.m = w53Var2;
        this.n = w53Var3;
        this.o = z;
    }

    public static void h(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        WindowInsets windowInsets = ir31.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                h(childAt, arrayList);
            }
        }
    }

    @Override // defpackage.eot0
    public final boolean b() {
        Object obj;
        ges gesVar = this.f;
        if (!gesVar.l()) {
            return false;
        }
        ArrayList<skh> arrayList = this.c;
        if (arrayList == null || !arrayList.isEmpty()) {
            for (skh skhVar : arrayList) {
                if (Build.VERSION.SDK_INT < 34 || (obj = skhVar.b) == null || !gesVar.m(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.g;
        return obj2 == null || gesVar.m(obj2);
    }

    @Override // defpackage.eot0
    public final void c(ViewGroup viewGroup) {
        this.p.a();
    }

    @Override // defpackage.eot0
    public final void d(final ViewGroup viewGroup) {
        boolean isLaidOut = viewGroup.isLaidOut();
        ArrayList<skh> arrayList = this.c;
        if (!isLaidOut || this.r) {
            for (skh skhVar : arrayList) {
                iot0 iot0Var = skhVar.a;
                if (FragmentManager.O(2)) {
                    if (this.r) {
                        Objects.toString(iot0Var);
                    } else {
                        viewGroup.toString();
                        Objects.toString(iot0Var);
                    }
                }
                skhVar.a.c(this);
            }
            this.r = false;
            return;
        }
        Object obj = this.q;
        ges gesVar = this.f;
        iot0 iot0Var2 = this.e;
        iot0 iot0Var3 = this.d;
        if (obj != null) {
            gesVar.c(obj);
            if (FragmentManager.O(2)) {
                Objects.toString(iot0Var3);
                Objects.toString(iot0Var2);
                return;
            }
            return;
        }
        Pair i = i(viewGroup, iot0Var2, iot0Var3);
        ArrayList arrayList2 = (ArrayList) i.getFirst();
        final Object second = i.getSecond();
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((skh) it.next()).a);
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            iot0 iot0Var4 = (iot0) it2.next();
            gesVar.u(iot0Var4.c, second, this.p, new rkh(iot0Var4, this, 1));
        }
        k(arrayList2, viewGroup, new sls() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                this.f.e(viewGroup, second);
                return zy11.a;
            }
        });
        if (FragmentManager.O(2)) {
            Objects.toString(iot0Var3);
            Objects.toString(iot0Var2);
        }
    }

    @Override // defpackage.eot0
    public final void e(je4 je4Var) {
        Object obj = this.q;
        if (obj != null) {
            this.f.r(je4Var.c, obj);
        }
    }

    @Override // defpackage.eot0
    public final void f(final ViewGroup viewGroup) {
        Object obj;
        boolean isLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.c;
        if (!isLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                iot0 iot0Var = ((skh) it.next()).a;
                if (FragmentManager.O(2)) {
                    viewGroup.toString();
                    Objects.toString(iot0Var);
                }
            }
            return;
        }
        boolean j = j();
        iot0 iot0Var2 = this.e;
        iot0 iot0Var3 = this.d;
        if (j && (obj = this.g) != null && !b()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + iot0Var3 + " and " + iot0Var2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (b() && j()) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Pair i = i(viewGroup, iot0Var2, iot0Var3);
            ArrayList arrayList2 = (ArrayList) i.getFirst();
            final Object second = i.getSecond();
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((skh) it2.next()).a);
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                iot0 iot0Var4 = (iot0) it3.next();
                qkh qkhVar = new qkh(0, ref$ObjectRef);
                Fragment fragment = iot0Var4.c;
                this.f.v(second, this.p, qkhVar, new rkh(iot0Var4, this, 0));
            }
            k(arrayList2, viewGroup, new sls() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1] */
                @Override // defpackage.sls
                public final Object invoke() {
                    FragmentManager.O(2);
                    f fVar = f.this;
                    fVar.q = fVar.f.i(viewGroup, second);
                    final f fVar2 = f.this;
                    if (fVar2.q == null) {
                        FragmentManager.O(2);
                        f.this.r = true;
                    } else {
                        Ref$ObjectRef<sls> ref$ObjectRef2 = ref$ObjectRef;
                        final Object obj2 = second;
                        final ViewGroup viewGroup2 = viewGroup;
                        ref$ObjectRef2.element = new sls() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                ArrayList arrayList4 = fVar2.c;
                                if (arrayList4 == null || !arrayList4.isEmpty()) {
                                    Iterator it4 = arrayList4.iterator();
                                    while (it4.hasNext()) {
                                        if (!((skh) it4.next()).a.g) {
                                            FragmentManager.O(2);
                                            u18 u18Var = new u18();
                                            f fVar3 = fVar2;
                                            fVar3.f.u(((skh) fVar3.c.get(0)).a.c, obj2, u18Var, new oxe(23, fVar2));
                                            u18Var.a();
                                            break;
                                        }
                                    }
                                }
                                FragmentManager.O(2);
                                f fVar4 = fVar2;
                                fVar4.f.d(fVar4.q, new zvg(9, fVar4, viewGroup2));
                                return zy11.a;
                            }
                        };
                        if (FragmentManager.O(2)) {
                            Objects.toString(f.this.d);
                            Objects.toString(f.this.e);
                        }
                    }
                    return zy11.a;
                }
            });
        }
    }

    public final Pair i(ViewGroup viewGroup, iot0 iot0Var, iot0 iot0Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        ges gesVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it;
        View view;
        f fVar = this;
        View view2 = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList5 = fVar.c;
        Iterator it2 = arrayList5.iterator();
        View view3 = null;
        boolean z = false;
        while (true) {
            boolean hasNext = it2.hasNext();
            arrayList = fVar.i;
            arrayList2 = fVar.h;
            obj = fVar.g;
            gesVar = fVar.f;
            if (!hasNext) {
                break;
            }
            if (((skh) it2.next()).d == null || iot0Var2 == null || iot0Var == null || fVar.j.isEmpty() || obj == null) {
                arrayList4 = arrayList5;
                it = it2;
            } else {
                Fragment fragment = iot0Var.c;
                Fragment fragment2 = iot0Var2.c;
                arrayList4 = arrayList5;
                boolean z2 = fVar.o;
                it = it2;
                w53 w53Var = fVar.m;
                ees.a(fragment, fragment2, z2, w53Var);
                OneShotPreDrawListener.add(viewGroup, new p7h(2, iot0Var, iot0Var2, fVar));
                arrayList2.addAll(w53Var.values());
                ArrayList arrayList6 = fVar.l;
                if (!arrayList6.isEmpty()) {
                    View view4 = (View) w53Var.get((String) arrayList6.get(0));
                    gesVar.s(view4, obj);
                    view3 = view4;
                }
                w53 w53Var2 = fVar.n;
                arrayList.addAll(w53Var2.values());
                ArrayList arrayList7 = fVar.k;
                if (!arrayList7.isEmpty() && (view = (View) w53Var2.get((String) arrayList7.get(0))) != null) {
                    OneShotPreDrawListener.add(viewGroup, new zvg(gesVar, view, rect));
                    z = true;
                }
                gesVar.w(view2, obj, arrayList2);
                ges gesVar2 = fVar.f;
                Object obj2 = fVar.g;
                gesVar2.q(obj2, null, null, obj2, arrayList);
            }
            arrayList5 = arrayList4;
            it2 = it;
        }
        ArrayList arrayList8 = arrayList5;
        ArrayList arrayList9 = new ArrayList();
        Iterator it3 = arrayList8.iterator();
        Object obj3 = null;
        Object obj4 = null;
        while (it3.hasNext()) {
            skh skhVar = (skh) it3.next();
            Iterator it4 = it3;
            iot0 iot0Var3 = skhVar.a;
            boolean z3 = z;
            Object h = gesVar.h(skhVar.b);
            if (h != null) {
                ArrayList arrayList10 = arrayList2;
                ArrayList arrayList11 = new ArrayList();
                Object obj5 = obj;
                Fragment fragment3 = iot0Var3.c;
                Object obj6 = obj4;
                h(fragment3.mView, arrayList11);
                if (obj5 != null && (iot0Var3 == iot0Var2 || iot0Var3 == iot0Var)) {
                    if (iot0Var3 == iot0Var2) {
                        arrayList11.removeAll(kotlin.collections.a.N0(arrayList10));
                    } else {
                        arrayList11.removeAll(kotlin.collections.a.N0(arrayList));
                    }
                }
                if (arrayList11.isEmpty()) {
                    gesVar.a(view2, h);
                    arrayList3 = arrayList11;
                } else {
                    gesVar.b(arrayList11, h);
                    fVar.f.q(h, h, arrayList11, null, null);
                    arrayList3 = arrayList11;
                    if (iot0Var3.a == SpecialEffectsController$Operation$State.GONE) {
                        iot0Var3.i = false;
                        ArrayList arrayList12 = new ArrayList(arrayList3);
                        arrayList12.remove(fragment3.mView);
                        gesVar.p(fragment3.mView, h, arrayList12);
                        OneShotPreDrawListener.add(viewGroup, new oxe(22, arrayList3));
                    }
                }
                if (iot0Var3.a == SpecialEffectsController$Operation$State.VISIBLE) {
                    arrayList9.addAll(arrayList3);
                    if (z3) {
                        gesVar.t(h, rect);
                    }
                    if (FragmentManager.O(2)) {
                        h.toString();
                        Iterator it5 = arrayList3.iterator();
                        while (it5.hasNext()) {
                            ((View) it5.next()).toString();
                        }
                    }
                } else {
                    gesVar.s(view3, h);
                    if (FragmentManager.O(2)) {
                        h.toString();
                        Iterator it6 = arrayList3.iterator();
                        while (it6.hasNext()) {
                            ((View) it6.next()).toString();
                        }
                    }
                }
                if (skhVar.c) {
                    obj3 = gesVar.o(obj3, h);
                    fVar = this;
                    it3 = it4;
                    z = z3;
                    arrayList2 = arrayList10;
                    obj = obj5;
                    obj4 = obj6;
                } else {
                    obj4 = gesVar.o(obj6, h);
                    fVar = this;
                    it3 = it4;
                    z = z3;
                    arrayList2 = arrayList10;
                    obj = obj5;
                }
            } else {
                it3 = it4;
                z = z3;
                fVar = this;
            }
        }
        Object n = gesVar.n(obj3, obj4, obj);
        if (FragmentManager.O(2)) {
            Objects.toString(n);
            viewGroup.toString();
        }
        return new Pair(arrayList9, n);
    }

    public final boolean j() {
        ArrayList arrayList = this.c;
        if (arrayList != null && arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((skh) it.next()).a.c.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    public final void k(ArrayList arrayList, ViewGroup viewGroup, sls slsVar) {
        ees.d(4, arrayList);
        ges gesVar = this.f;
        gesVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.i;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            arrayList2.add(ViewCompat$Api21Impl.g(view));
            ViewCompat$Api21Impl.p(view, null);
        }
        boolean O = FragmentManager.O(2);
        ArrayList arrayList4 = this.h;
        if (O) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                view2.toString();
                WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                ViewCompat$Api21Impl.g(view2);
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                View view3 = (View) it2.next();
                view3.toString();
                WeakHashMap weakHashMap3 = androidx.core.view.b.a;
                ViewCompat$Api21Impl.g(view3);
            }
        }
        slsVar.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            WeakHashMap weakHashMap4 = androidx.core.view.b.a;
            String g = ViewCompat$Api21Impl.g(view4);
            arrayList5.add(g);
            if (g != null) {
                ViewCompat$Api21Impl.p(view4, null);
                String str = (String) this.j.get(g);
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i3))) {
                        ViewCompat$Api21Impl.p((View) arrayList3.get(i3), g);
                        break;
                    }
                    i3++;
                }
            }
        }
        OneShotPreDrawListener.add(viewGroup, new fes(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        ees.d(0, arrayList);
        gesVar.x(this.g, arrayList4, arrayList3);
    }
}
