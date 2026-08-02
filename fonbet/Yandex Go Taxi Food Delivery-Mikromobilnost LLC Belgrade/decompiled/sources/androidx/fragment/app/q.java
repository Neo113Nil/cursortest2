package androidx.fragment.app;

import defpackage.des;
import defpackage.ejp;
import defpackage.eot0;
import defpackage.iot0;
import defpackage.je4;
import defpackage.mx60;
import defpackage.ucs;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q extends mx60 {
    public final /* synthetic */ FragmentManager d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(FragmentManager fragmentManager) {
        super(false);
        this.d = fragmentManager;
    }

    @Override // defpackage.mx60
    public final void c() {
        boolean O = FragmentManager.O(3);
        FragmentManager fragmentManager = this.d;
        if (O) {
            Objects.toString(fragmentManager);
        }
        if (FragmentManager.O(3)) {
            Objects.toString(fragmentManager.h);
        }
        a aVar = fragmentManager.h;
        if (aVar != null) {
            aVar.s = false;
            aVar.k();
            a aVar2 = fragmentManager.h;
            ejp ejpVar = new ejp(10, fragmentManager);
            if (aVar2.q == null) {
                aVar2.q = new ArrayList();
            }
            aVar2.q.add(ejpVar);
            fragmentManager.h.d();
            fragmentManager.i = true;
            fragmentManager.C();
            fragmentManager.i = false;
            fragmentManager.h = null;
        }
    }

    @Override // defpackage.mx60
    public final void d() {
        boolean O = FragmentManager.O(3);
        FragmentManager fragmentManager = this.d;
        if (O) {
            Objects.toString(fragmentManager);
        }
        q qVar = fragmentManager.j;
        ArrayList arrayList = fragmentManager.o;
        fragmentManager.i = true;
        fragmentManager.z(true);
        fragmentManager.i = false;
        if (fragmentManager.h == null) {
            if (qVar.b) {
                FragmentManager.O(3);
                fragmentManager.Z();
                return;
            } else {
                FragmentManager.O(3);
                fragmentManager.g.c();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(FragmentManager.I(fragmentManager.h));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ucs ucsVar = (ucs) it.next();
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    ucsVar.onBackStackChangeCommitted((Fragment) it2.next(), true);
                }
            }
        }
        Iterator it3 = fragmentManager.h.a.iterator();
        while (it3.hasNext()) {
            Fragment fragment = ((des) it3.next()).b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        Iterator it4 = fragmentManager.f(0, 1, new ArrayList(Collections.singletonList(fragmentManager.h))).iterator();
        while (it4.hasNext()) {
            g gVar = (g) it4.next();
            gVar.getClass();
            FragmentManager.O(3);
            ArrayList arrayList2 = gVar.c;
            gVar.m(arrayList2);
            gVar.c(arrayList2);
        }
        Iterator it5 = fragmentManager.h.a.iterator();
        while (it5.hasNext()) {
            Fragment fragment2 = ((des) it5.next()).b;
            if (fragment2 != null && fragment2.mContainer == null) {
                fragmentManager.g(fragment2).i();
            }
        }
        fragmentManager.h = null;
        fragmentManager.s0();
        if (FragmentManager.O(3)) {
            boolean z = qVar.b;
            fragmentManager.toString();
        }
    }

    @Override // defpackage.mx60
    public final void e(je4 je4Var) {
        boolean O = FragmentManager.O(2);
        FragmentManager fragmentManager = this.d;
        if (O) {
            Objects.toString(fragmentManager);
        }
        if (fragmentManager.h != null) {
            Iterator it = fragmentManager.f(0, 1, new ArrayList(Collections.singletonList(fragmentManager.h))).iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                gVar.getClass();
                FragmentManager.O(2);
                ArrayList arrayList = gVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ycc.r(((iot0) it2.next()).k, arrayList2);
                }
                List J0 = kotlin.collections.a.J0(kotlin.collections.a.N0(arrayList2));
                int size = J0.size();
                for (int i = 0; i < size; i++) {
                    ((eot0) J0.get(i)).e(je4Var);
                }
            }
            Iterator it3 = fragmentManager.o.iterator();
            while (it3.hasNext()) {
                ((ucs) it3.next()).onBackStackChangeProgressed(je4Var);
            }
        }
    }

    @Override // defpackage.mx60
    public final void f(je4 je4Var) {
        boolean O = FragmentManager.O(3);
        FragmentManager fragmentManager = this.d;
        if (O) {
            Objects.toString(fragmentManager);
        }
        fragmentManager.w();
        fragmentManager.x(new t(fragmentManager), false);
    }
}
