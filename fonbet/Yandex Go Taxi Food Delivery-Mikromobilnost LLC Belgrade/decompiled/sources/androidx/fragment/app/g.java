package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.e1;
import androidx.core.view.ViewCompat$Api21Impl;
import defpackage.b8h0;
import defpackage.bsq0;
import defpackage.ees;
import defpackage.eot0;
import defpackage.fot0;
import defpackage.ges;
import defpackage.hzk;
import defpackage.iot0;
import defpackage.iy2;
import defpackage.jl40;
import defpackage.obs;
import defpackage.skh;
import defpackage.tls;
import defpackage.w511;
import defpackage.w53;
import defpackage.x4e;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class g {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;
    public boolean e;
    public boolean f;

    public g(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static void f(w53 w53Var, View view) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        String g = ViewCompat$Api21Impl.g(view);
        if (g != null) {
            w53Var.put(g, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f(w53Var, childAt);
                }
            }
        }
    }

    public static final g j(ViewGroup viewGroup, FragmentManager fragmentManager) {
        fragmentManager.N();
        Object tag = viewGroup.getTag(b8h0.special_effects_controller_view_tag);
        if (tag instanceof g) {
            return (g) tag;
        }
        g gVar = new g(viewGroup);
        viewGroup.setTag(b8h0.special_effects_controller_view_tag, gVar);
        return gVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (it.hasNext()) {
                iot0 iot0Var = (iot0) it.next();
                if (!iot0Var.k.isEmpty()) {
                    ArrayList arrayList2 = iot0Var.k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((eot0) it2.next()).b()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ycc.r(((iot0) it3.next()).k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(iot0 iot0Var) {
        if (iot0Var.i) {
            iot0Var.a.a(iot0Var.c.requireView(), this.a);
            iot0Var.i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        Object obj;
        Object obj2;
        ArrayList arrayList2;
        int i;
        boolean z2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ges gesVar;
        ArrayList arrayList5;
        int i2;
        String b;
        int i3 = 2;
        FragmentManager.O(2);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            iot0 iot0Var = (iot0) obj;
            fot0 fot0Var = SpecialEffectsController$Operation$State.Companion;
            View view = iot0Var.c.mView;
            fot0Var.getClass();
            SpecialEffectsController$Operation$State a = fot0.a(view);
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.VISIBLE;
            if (a == specialEffectsController$Operation$State && iot0Var.a != specialEffectsController$Operation$State) {
                break;
            }
        }
        iot0 iot0Var2 = (iot0) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator.previous();
            iot0 iot0Var3 = (iot0) obj2;
            fot0 fot0Var2 = SpecialEffectsController$Operation$State.Companion;
            View view2 = iot0Var3.c.mView;
            fot0Var2.getClass();
            SpecialEffectsController$Operation$State a2 = fot0.a(view2);
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
            if (a2 != specialEffectsController$Operation$State2 && iot0Var3.a == specialEffectsController$Operation$State2) {
                break;
            }
        }
        iot0 iot0Var4 = (iot0) obj2;
        if (FragmentManager.O(2)) {
            Objects.toString(iot0Var2);
            Objects.toString(iot0Var4);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Fragment fragment = ((iot0) kotlin.collections.a.Z(arrayList)).c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            obs obsVar = ((iot0) it2.next()).c.mAnimationInfo;
            obs obsVar2 = fragment.mAnimationInfo;
            obsVar.b = obsVar2.b;
            obsVar.c = obsVar2.c;
            obsVar.d = obsVar2.d;
            obsVar.e = obsVar2.e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            iot0 iot0Var5 = (iot0) it3.next();
            arrayList6.add(new c(iot0Var5, z));
            arrayList7.add(new skh(iot0Var5, z, !z ? iot0Var5 != iot0Var4 : iot0Var5 != iot0Var2));
            iot0Var5.d.add(new iy2(12, this, iot0Var5));
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it4 = arrayList7.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((skh) next).a()) {
                arrayList8.add(next);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it5 = arrayList8.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            if (((skh) next2).b() != null) {
                arrayList9.add(next2);
            }
        }
        Iterator it6 = arrayList9.iterator();
        ges gesVar2 = null;
        while (it6.hasNext()) {
            skh skhVar = (skh) it6.next();
            ges b2 = skhVar.b();
            if (gesVar2 != null && b2 != gesVar2) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(skhVar.a.c);
                sb.append(" returned Transition ");
                w511.f(x4e.h(sb, skhVar.b, " which uses a different Transition type than other Fragments."));
                return;
            }
            gesVar2 = b2;
        }
        if (gesVar2 == null) {
            arrayList2 = arrayList6;
            i = 2;
            z2 = false;
        } else {
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            w53 w53Var = new w53();
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList<String> arrayList13 = new ArrayList<>();
            w53 w53Var2 = new w53();
            ArrayList<String> arrayList14 = arrayList13;
            w53 w53Var3 = new w53();
            Iterator it7 = arrayList9.iterator();
            Object obj3 = null;
            while (it7.hasNext()) {
                Object obj4 = ((skh) it7.next()).d;
                if (obj4 == null || iot0Var2 == null) {
                    arrayList3 = arrayList6;
                    arrayList4 = arrayList10;
                    gesVar = gesVar2;
                    arrayList5 = arrayList11;
                    i2 = i3;
                } else {
                    i2 = i3;
                    Fragment fragment2 = iot0Var2.c;
                    if (iot0Var4 != null) {
                        Fragment fragment3 = iot0Var4.c;
                        Object y = gesVar2.y(gesVar2.h(obj4));
                        ArrayList<String> sharedElementSourceNames = fragment3.getSharedElementSourceNames();
                        ArrayList<String> sharedElementSourceNames2 = fragment2.getSharedElementSourceNames();
                        ArrayList arrayList15 = arrayList6;
                        ArrayList<String> sharedElementTargetNames = fragment2.getSharedElementTargetNames();
                        ArrayList arrayList16 = arrayList10;
                        int size = sharedElementTargetNames.size();
                        ges gesVar3 = gesVar2;
                        ArrayList arrayList17 = arrayList11;
                        int i4 = 0;
                        while (i4 < size) {
                            int i5 = size;
                            int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i4));
                            if (indexOf != -1) {
                                sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i4));
                            }
                            i4++;
                            size = i5;
                        }
                        ArrayList<String> sharedElementTargetNames2 = fragment3.getSharedElementTargetNames();
                        Pair pair = !z ? new Pair(fragment2.getExitTransitionCallback(), fragment3.getEnterTransitionCallback()) : new Pair(fragment2.getEnterTransitionCallback(), fragment3.getExitTransitionCallback());
                        e1 e1Var = (e1) pair.getFirst();
                        e1 e1Var2 = (e1) pair.getSecond();
                        int size2 = sharedElementSourceNames.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            w53Var.put(sharedElementSourceNames.get(i6), sharedElementTargetNames2.get(i6));
                            i6++;
                            e1Var = e1Var;
                            e1Var2 = e1Var2;
                        }
                        e1 e1Var3 = e1Var;
                        e1 e1Var4 = e1Var2;
                        if (FragmentManager.O(i2)) {
                            Iterator<String> it8 = sharedElementTargetNames2.iterator();
                            while (it8.hasNext()) {
                                it8.next();
                            }
                            Iterator<String> it9 = sharedElementSourceNames.iterator();
                            while (it9.hasNext()) {
                                it9.next();
                            }
                        }
                        f(w53Var2, fragment2.mView);
                        w53Var2.m(sharedElementSourceNames);
                        if (e1Var3 != null) {
                            if (FragmentManager.O(i2)) {
                                iot0Var2.toString();
                            }
                            int size3 = sharedElementSourceNames.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i7 = size3 - 1;
                                    String str = sharedElementSourceNames.get(size3);
                                    View view3 = (View) w53Var2.get(str);
                                    if (view3 == null) {
                                        w53Var.remove(str);
                                    } else {
                                        WeakHashMap weakHashMap = androidx.core.view.b.a;
                                        if (!str.equals(ViewCompat$Api21Impl.g(view3))) {
                                            w53Var.put(ViewCompat$Api21Impl.g(view3), (String) w53Var.remove(str));
                                        }
                                    }
                                    if (i7 < 0) {
                                        break;
                                    } else {
                                        size3 = i7;
                                    }
                                }
                            }
                        } else {
                            w53Var.m(w53Var2.keySet());
                        }
                        f(w53Var3, fragment3.mView);
                        w53Var3.m(sharedElementTargetNames2);
                        w53Var3.m(w53Var.values());
                        if (e1Var4 != null) {
                            if (FragmentManager.O(i2)) {
                                iot0Var4.toString();
                            }
                            int size4 = sharedElementTargetNames2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i8 = size4 - 1;
                                    String str2 = sharedElementTargetNames2.get(size4);
                                    View view4 = (View) w53Var3.get(str2);
                                    if (view4 == null) {
                                        String b3 = ees.b(w53Var, str2);
                                        if (b3 != null) {
                                            w53Var.remove(b3);
                                        }
                                    } else {
                                        WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                                        if (!str2.equals(ViewCompat$Api21Impl.g(view4)) && (b = ees.b(w53Var, str2)) != null) {
                                            w53Var.put(b, ViewCompat$Api21Impl.g(view4));
                                        }
                                    }
                                    if (i8 < 0) {
                                        break;
                                    } else {
                                        size4 = i8;
                                    }
                                }
                            }
                        } else {
                            ees.c(w53Var, w53Var3);
                        }
                        final Set keySet = w53Var.keySet();
                        ycc.v(w53Var2.entrySet(), new tls() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj5) {
                                Collection<String> collection = keySet;
                                View view5 = (View) ((Map.Entry) obj5).getValue();
                                WeakHashMap weakHashMap3 = androidx.core.view.b.a;
                                return Boolean.valueOf(kotlin.collections.a.G(collection, ViewCompat$Api21Impl.g(view5)));
                            }
                        }, false);
                        final Collection values = w53Var.values();
                        ycc.v(w53Var3.entrySet(), new tls() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj5) {
                                Collection<String> collection = values;
                                View view5 = (View) ((Map.Entry) obj5).getValue();
                                WeakHashMap weakHashMap3 = androidx.core.view.b.a;
                                return Boolean.valueOf(kotlin.collections.a.G(collection, ViewCompat$Api21Impl.g(view5)));
                            }
                        }, false);
                        if (w53Var.isEmpty()) {
                            Log.i("FragmentManager", "Ignoring shared elements transition " + y + " between " + iot0Var2 + " and " + iot0Var4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                            arrayList16.clear();
                            arrayList17.clear();
                            arrayList14 = sharedElementSourceNames;
                            i3 = i2;
                            arrayList10 = arrayList16;
                            gesVar2 = gesVar3;
                            arrayList11 = arrayList17;
                            obj3 = null;
                        } else {
                            obj3 = y;
                            arrayList14 = sharedElementSourceNames;
                            i3 = i2;
                            arrayList10 = arrayList16;
                            gesVar2 = gesVar3;
                            arrayList11 = arrayList17;
                        }
                        arrayList12 = sharedElementTargetNames2;
                        arrayList6 = arrayList15;
                    } else {
                        arrayList3 = arrayList6;
                        arrayList4 = arrayList10;
                        gesVar = gesVar2;
                        arrayList5 = arrayList11;
                    }
                }
                i3 = i2;
                arrayList6 = arrayList3;
                arrayList10 = arrayList4;
                gesVar2 = gesVar;
                arrayList11 = arrayList5;
            }
            arrayList2 = arrayList6;
            ArrayList arrayList18 = arrayList10;
            ges gesVar4 = gesVar2;
            ArrayList arrayList19 = arrayList11;
            i = i3;
            if (obj3 == null) {
                if (!arrayList9.isEmpty()) {
                    Iterator it10 = arrayList9.iterator();
                    while (it10.hasNext()) {
                        if (((skh) it10.next()).b == null) {
                        }
                    }
                }
                z2 = false;
            }
            z2 = false;
            f fVar = new f(arrayList9, iot0Var2, iot0Var4, gesVar4, obj3, arrayList18, arrayList19, w53Var, arrayList12, arrayList14, w53Var2, w53Var3, z);
            Iterator it11 = arrayList9.iterator();
            while (it11.hasNext()) {
                ((skh) it11.next()).a.j.add(fVar);
            }
        }
        ArrayList arrayList20 = new ArrayList();
        ArrayList arrayList21 = new ArrayList();
        Iterator it12 = arrayList2.iterator();
        while (it12.hasNext()) {
            ycc.r(((c) it12.next()).a.k, arrayList21);
        }
        boolean isEmpty = arrayList21.isEmpty();
        Iterator it13 = arrayList2.iterator();
        boolean z3 = z2;
        while (it13.hasNext()) {
            c cVar = (c) it13.next();
            Context context = this.a.getContext();
            iot0 iot0Var6 = cVar.a;
            hzk b4 = cVar.b(context);
            if (b4 != null) {
                if (((AnimatorSet) b4.b) == null) {
                    arrayList20.add(cVar);
                } else {
                    Fragment fragment4 = iot0Var6.c;
                    if (iot0Var6.k.isEmpty()) {
                        if (iot0Var6.a == SpecialEffectsController$Operation$State.GONE) {
                            iot0Var6.i = z2;
                        }
                        iot0Var6.j.add(new d(cVar));
                        z3 = true;
                    } else if (FragmentManager.O(i)) {
                        Objects.toString(fragment4);
                    }
                }
            }
        }
        Iterator it14 = arrayList20.iterator();
        while (it14.hasNext()) {
            c cVar2 = (c) it14.next();
            iot0 iot0Var7 = cVar2.a;
            Fragment fragment5 = iot0Var7.c;
            if (isEmpty) {
                if (!z3) {
                    iot0Var7.j.add(new b(cVar2));
                } else if (FragmentManager.O(i)) {
                    Objects.toString(fragment5);
                }
            } else if (FragmentManager.O(i)) {
                Objects.toString(fragment5);
            }
        }
    }

    public final void c(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ycc.r(((iot0) it.next()).k, arrayList);
        }
        List J0 = kotlin.collections.a.J0(kotlin.collections.a.N0(arrayList));
        int size = J0.size();
        for (int i = 0; i < size; i++) {
            ((eot0) J0.get(i)).d(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((iot0) list.get(i2));
        }
        List J02 = kotlin.collections.a.J0(list2);
        int size3 = J02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            iot0 iot0Var = (iot0) J02.get(i3);
            if (iot0Var.k.isEmpty()) {
                iot0Var.b();
            }
        }
    }

    public final void d(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact, w wVar) {
        synchronized (this.b) {
            try {
                iot0 g = g(wVar.c);
                if (g == null) {
                    Fragment fragment = wVar.c;
                    if (!fragment.mTransitioning && !fragment.mRemoving) {
                        g = null;
                    }
                    g = h(fragment);
                }
                if (g != null) {
                    g.d(specialEffectsController$Operation$State, specialEffectsController$Operation$LifecycleImpact);
                    return;
                }
                final d0 d0Var = new d0(specialEffectsController$Operation$State, specialEffectsController$Operation$LifecycleImpact, wVar);
                this.b.add(d0Var);
                d0Var.d.add(new Runnable() { // from class: androidx.fragment.app.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g gVar = g.this;
                        ArrayList arrayList = gVar.b;
                        d0 d0Var2 = d0Var;
                        if (arrayList.contains(d0Var2)) {
                            d0Var2.a.a(d0Var2.c.mView, gVar.a);
                        }
                    }
                });
                d0Var.d.add(new bsq0(1, this, d0Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            i();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList arrayList = new ArrayList(this.c);
                this.c.clear();
                Iterator it = arrayList.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    iot0 iot0Var = (iot0) it.next();
                    if (this.b.isEmpty() || !iot0Var.c.mTransitioning) {
                        z = false;
                    }
                    iot0Var.g = z;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    iot0 iot0Var2 = (iot0) it2.next();
                    if (this.d) {
                        if (FragmentManager.O(2)) {
                            Objects.toString(iot0Var2);
                        }
                        iot0Var2.b();
                    } else {
                        if (FragmentManager.O(2)) {
                            Objects.toString(iot0Var2);
                        }
                        iot0Var2.a(this.a);
                    }
                    this.d = false;
                    if (!iot0Var2.f) {
                        this.c.add(iot0Var2);
                    }
                }
                if (!this.b.isEmpty()) {
                    n();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    FragmentManager.O(2);
                    b(arrayList2, this.e);
                    boolean k = k(arrayList2);
                    Iterator it3 = arrayList2.iterator();
                    boolean z2 = true;
                    while (it3.hasNext()) {
                        if (!((iot0) it3.next()).c.mTransitioning) {
                            z2 = false;
                        }
                    }
                    if (!z2 || k) {
                        z = false;
                    }
                    this.d = z;
                    FragmentManager.O(2);
                    if (!z2) {
                        m(arrayList2);
                        c(arrayList2);
                    } else if (k) {
                        m(arrayList2);
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            a((iot0) arrayList2.get(i));
                        }
                    }
                    this.e = false;
                    FragmentManager.O(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final iot0 g(Fragment fragment) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            iot0 iot0Var = (iot0) obj;
            if (jl40.l(iot0Var.c, fragment) && !iot0Var.e) {
                break;
            }
        }
        return (iot0) obj;
    }

    public final iot0 h(Fragment fragment) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            iot0 iot0Var = (iot0) obj;
            if (jl40.l(iot0Var.c, fragment) && !iot0Var.e) {
                break;
            }
        }
        return (iot0) obj;
    }

    public final void i() {
        FragmentManager.O(2);
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                n();
                m(this.b);
                ArrayList arrayList = new ArrayList(this.c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((iot0) it.next()).g = false;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    iot0 iot0Var = (iot0) it2.next();
                    if (FragmentManager.O(2)) {
                        if (!isAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(iot0Var);
                    }
                    iot0Var.a(this.a);
                }
                ArrayList arrayList2 = new ArrayList(this.b);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((iot0) it3.next()).g = false;
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    iot0 iot0Var2 = (iot0) it4.next();
                    if (FragmentManager.O(2)) {
                        if (!isAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(iot0Var2);
                    }
                    iot0Var2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        Object obj;
        synchronized (this.b) {
            try {
                n();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    iot0 iot0Var = (iot0) obj;
                    fot0 fot0Var = SpecialEffectsController$Operation$State.Companion;
                    View view = iot0Var.c.mView;
                    fot0Var.getClass();
                    SpecialEffectsController$Operation$State a = fot0.a(view);
                    SpecialEffectsController$Operation$State specialEffectsController$Operation$State = iot0Var.a;
                    SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
                    if (specialEffectsController$Operation$State == specialEffectsController$Operation$State2 && a != specialEffectsController$Operation$State2) {
                        break;
                    }
                }
                iot0 iot0Var2 = (iot0) obj;
                Fragment fragment = iot0Var2 != null ? iot0Var2.c : null;
                this.f = fragment != null ? fragment.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d0 d0Var = (d0) ((iot0) list.get(i));
            w wVar = d0Var.l;
            if (!d0Var.h) {
                d0Var.h = true;
                SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = d0Var.b;
                if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.ADDING) {
                    Fragment fragment = wVar.c;
                    View findFocus = fragment.mView.findFocus();
                    if (findFocus != null) {
                        fragment.setFocusedView(findFocus);
                        if (FragmentManager.O(2)) {
                            findFocus.toString();
                            fragment.toString();
                        }
                    }
                    View requireView = d0Var.c.requireView();
                    if (requireView.getParent() == null) {
                        if (FragmentManager.O(2)) {
                            fragment.toString();
                            requireView.toString();
                        }
                        wVar.a();
                        requireView.setAlpha(0.0f);
                    }
                    if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                        if (FragmentManager.O(2)) {
                            requireView.toString();
                        }
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                    if (FragmentManager.O(2)) {
                        fragment.getPostOnViewCreatedAlpha();
                    }
                } else if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.REMOVING) {
                    Fragment fragment2 = wVar.c;
                    View requireView2 = fragment2.requireView();
                    if (FragmentManager.O(2)) {
                        Objects.toString(requireView2.findFocus());
                        requireView2.toString();
                        fragment2.toString();
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ycc.r(((iot0) it.next()).k, arrayList);
        }
        List J0 = kotlin.collections.a.J0(kotlin.collections.a.N0(arrayList));
        int size2 = J0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((eot0) J0.get(i2)).g(this.a);
        }
    }

    public final void n() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            iot0 iot0Var = (iot0) it.next();
            if (iot0Var.b == SpecialEffectsController$Operation$LifecycleImpact.ADDING) {
                View requireView = iot0Var.c.requireView();
                fot0 fot0Var = SpecialEffectsController$Operation$State.Companion;
                int visibility = requireView.getVisibility();
                fot0Var.getClass();
                iot0Var.d(fot0.b(visibility), SpecialEffectsController$Operation$LifecycleImpact.NONE);
            }
        }
    }
}
