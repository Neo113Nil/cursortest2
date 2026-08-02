package androidx.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.u;
import androidx.view.b;
import androidx.view.c;
import androidx.view.f;
import androidx.view.j;
import defpackage.eds;
import defpackage.fds;
import defpackage.h73;
import defpackage.hds;
import defpackage.jl40;
import defpackage.k550;
import defpackage.kf50;
import defpackage.ls31;
import defpackage.ny61;
import defpackage.oa50;
import defpackage.qoi0;
import defpackage.qs31;
import defpackage.scc;
import defpackage.sls;
import defpackage.tls;
import defpackage.w8f;
import defpackage.wj6;
import defpackage.wwg;
import defpackage.xw01;
import defpackage.ycc;
import defpackage.yr31;
import defpackage.yw01;
import defpackage.zwv;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Landroidx/navigation/fragment/b;", "Landroidx/navigation/j;", "Leds;", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@oa50("fragment")
/* loaded from: classes10.dex */
public class b extends j {
    public final Context c;
    public final FragmentManager d;
    public final int e;
    public final LinkedHashSet f = new LinkedHashSet();
    public final ArrayList g = new ArrayList();
    public final wj6 h = new wj6(2, this);
    public final tls i = new FragmentNavigator$fragmentViewObserver$1(this);

    public static final class a extends yr31 {
        public WeakReference b;

        @Override // defpackage.yr31
        public final void V() {
            WeakReference weakReference = this.b;
            if (weakReference == null) {
                weakReference = null;
            }
            sls slsVar = (sls) weakReference.get();
            if (slsVar != null) {
                slsVar.invoke();
            }
        }
    }

    public b(Context context, FragmentManager fragmentManager, int i) {
        this.c = context;
        this.d = fragmentManager;
        this.e = i;
    }

    public static void k(b bVar, final String str, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = bVar.g;
        if (z2) {
            ycc.w(arrayList, new tls() { // from class: androidx.navigation.fragment.FragmentNavigator$addPendingOps$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(jl40.l(((Pair) obj).c(), str));
                }
            }, true);
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // androidx.view.j
    public final f a() {
        return new eds(this);
    }

    @Override // androidx.view.j
    public final void d(List list, k550 k550Var) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.S()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.view.b bVar = (androidx.view.b) it.next();
            boolean isEmpty = ((List) b().e.a.getValue()).isEmpty();
            if (k550Var == null || isEmpty || !k550Var.b || !this.f.remove(bVar.y)) {
                androidx.fragment.app.a m = m(bVar, k550Var);
                String str = bVar.y;
                if (!isEmpty) {
                    androidx.view.b bVar2 = (androidx.view.b) kotlin.collections.a.b0((List) b().e.a.getValue());
                    if (bVar2 != null) {
                        k(this, bVar2.y, 6);
                    }
                    k(this, str, 6);
                    m.c(str);
                }
                m.d();
                if (n()) {
                    bVar.toString();
                }
                b().h(bVar);
            } else {
                fragmentManager.x(new u(fragmentManager, bVar.y, 0), false);
                b().h(bVar);
            }
        }
    }

    @Override // androidx.view.j
    public final void e(final c cVar) {
        super.e(cVar);
        n();
        hds hdsVar = new hds() { // from class: androidx.navigation.fragment.a
            @Override // defpackage.hds
            public final void a(Fragment fragment) {
                Object obj;
                c cVar2 = c.this;
                List list = (List) cVar2.e.a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator.previous();
                        if (jl40.l(((b) obj).y, fragment.getTag())) {
                            break;
                        }
                    }
                }
                b bVar = (b) obj;
                boolean n = b.n();
                b bVar2 = this;
                if (n) {
                    fragment.toString();
                    Objects.toString(bVar);
                    Objects.toString(bVar2.d);
                }
                if (bVar != null) {
                    fragment.getViewLifecycleOwnerLiveData().f(fragment, new c(new FragmentNavigator$attachObservers$1(bVar2, fragment, bVar)));
                    fragment.getLifecycle().a(bVar2.h);
                    bVar2.l(fragment, bVar, cVar2);
                }
            }
        };
        FragmentManager fragmentManager = this.d;
        fragmentManager.q.add(hdsVar);
        fragmentManager.o.add(new fds(cVar, this));
    }

    @Override // androidx.view.j
    public final void f(androidx.view.b bVar) {
        String str = bVar.y;
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.S()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.a m = m(bVar, null);
        List list = (List) b().e.a.getValue();
        if (list.size() > 1) {
            androidx.view.b bVar2 = (androidx.view.b) kotlin.collections.a.S(scc.f(list) - 1, list);
            if (bVar2 != null) {
                k(this, bVar2.y, 6);
            }
            k(this, str, 4);
            fragmentManager.W(1, str);
            k(this, str, 2);
            m.c(str);
        }
        m.d();
        b().c(bVar);
    }

    @Override // androidx.view.j
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.clear();
            ycc.r(stringArrayList, linkedHashSet);
        }
    }

    @Override // androidx.view.j
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return wwg.g(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // androidx.view.j
    public final void i(androidx.view.b bVar, boolean z) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.S()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().e.a.getValue();
        int indexOf = list.indexOf(bVar);
        List subList = list.subList(indexOf, list.size());
        androidx.view.b bVar2 = (androidx.view.b) kotlin.collections.a.P(list);
        int i = 1;
        androidx.view.b bVar3 = (androidx.view.b) kotlin.collections.a.S(indexOf - 1, list);
        if (bVar3 != null) {
            k(this, bVar3.y, 6);
        }
        List list2 = subList;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    k(this, ((androidx.view.b) it2.next()).y, 4);
                }
                if (z) {
                    for (androidx.view.b bVar4 : kotlin.collections.a.q0(list2)) {
                        if (jl40.l(bVar4, bVar2)) {
                            Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + bVar4);
                        } else {
                            fragmentManager.x(new u(fragmentManager, bVar4.y, i), false);
                            this.f.add(bVar4.y);
                        }
                    }
                } else {
                    fragmentManager.W(1, bVar.y);
                }
                if (n()) {
                    bVar.toString();
                }
                b().e(bVar, z);
                return;
            }
            Object next = it.next();
            androidx.view.b bVar5 = (androidx.view.b) next;
            yw01 yw01Var = new yw01(new h73(1, this.g), FragmentNavigator$popBackStack$1$1.w);
            String str = bVar5.y;
            Iterator it3 = yw01Var.iterator();
            while (true) {
                xw01 xw01Var = (xw01) it3;
                if (!xw01Var.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next2 = xw01Var.next();
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                if (jl40.l(str, next2)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0 || !jl40.l(bVar5.y, bVar2.y)) {
                arrayList.add(next);
            }
        }
    }

    public final void l(final Fragment fragment, final androidx.view.b bVar, final c cVar) {
        qs31 viewModelStore = fragment.getViewModelStore();
        zwv zwvVar = new zwv();
        zwvVar.a(qoi0.a(a.class), FragmentNavigator$attachClearViewModel$viewModel$1$1.w);
        ((a) new ls31(viewModelStore, zwvVar.b(), w8f.b).b(a.class)).b = new WeakReference(new sls() { // from class: androidx.navigation.fragment.FragmentNavigator$attachClearViewModel$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                kf50 kf50Var = cVar;
                b bVar2 = this;
                Fragment fragment2 = fragment;
                for (b bVar3 : (Iterable) kf50Var.f.a.getValue()) {
                    bVar2.getClass();
                    if (b.n()) {
                        Objects.toString(bVar3);
                        Objects.toString(fragment2);
                    }
                    kf50Var.b(bVar3);
                }
                return zy11.a;
            }
        });
    }

    public final androidx.fragment.app.a m(androidx.view.b bVar, k550 k550Var) {
        eds edsVar = (eds) bVar.b;
        Bundle a2 = bVar.a();
        String str = edsVar.E;
        if (str == null) {
            ny61.r("Fragment class was not set");
            return null;
        }
        char charAt = str.charAt(0);
        Context context = this.c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        FragmentManager fragmentManager = this.d;
        Fragment a3 = fragmentManager.M().a(context.getClassLoader(), str);
        a3.setArguments(a2);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        int i = k550Var != null ? k550Var.f : -1;
        int i2 = k550Var != null ? k550Var.g : -1;
        int i3 = k550Var != null ? k550Var.h : -1;
        int i4 = k550Var != null ? k550Var.i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            aVar.i(i, i2, i3, i4 != -1 ? i4 : 0);
        }
        aVar.h(this.e, a3, bVar.y);
        aVar.r(a3);
        aVar.p = true;
        return aVar;
    }
}
