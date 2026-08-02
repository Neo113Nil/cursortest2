package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lrv0;

/* compiled from: FragmentBackstackSearchDialogStackNavigator.kt */
/* loaded from: classes5.dex */
public final class tas implements nqh0 {
    public final FragmentManager a;
    public final ArrayList b = new ArrayList();
    public final b c = new b();
    public final a d = new a();
    public Integer e;

    /* compiled from: FragmentBackstackSearchDialogStackNavigator.kt */
    public static final /* synthetic */ class a implements lrv0.a, g0t {
        public a() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lrv0.a) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, tas.this, tas.class, "release", "release()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // xsna.lrv0.a
        public final void xb() {
            tas.this.release();
        }
    }

    /* compiled from: FragmentBackstackSearchDialogStackNavigator.kt */
    public final class b extends FragmentManager.m {
        public b() {
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void e(Fragment fragment) {
            tas tasVar = tas.this;
            ArrayList arrayList = tasVar.b;
            if (fragment.isRemoving() && fragment == j5g.k0(arrayList)) {
                g5g.J(arrayList);
                FragmentManager fragmentManager = tasVar.a;
                if (!fragmentManager.T()) {
                    fragmentManager.W();
                }
                if (arrayList.isEmpty()) {
                    fragmentManager.r0(tasVar.c);
                    dhr0.a.d(tasVar.d);
                }
            }
        }
    }

    public tas(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // xsna.nqh0
    public final void a(androidx.fragment.app.d dVar) {
        Object obj;
        ArrayList arrayList = this.b;
        boolean isEmpty = arrayList.isEmpty();
        FragmentManager fragmentManager = this.a;
        if (isEmpty) {
            fragmentManager.c0(this.c, false);
            dhr0.a.a(this.d);
        }
        arrayList.add(dVar);
        androidx.fragment.app.d dVar2 = (androidx.fragment.app.d) j5g.k0(arrayList);
        if (dVar2 == null) {
            return;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((androidx.fragment.app.d) obj) != dVar2) {
                    break;
                }
            }
        }
        androidx.fragment.app.d dVar3 = (androidx.fragment.app.d) obj;
        androidx.fragment.app.a b2 = tk5.b(fragmentManager, fragmentManager);
        if (dVar3 != null) {
            b2.q(dVar3);
        }
        b2.d(null);
        b2.f(0, dVar2, "search_params_view_dialog_" + e43.h(arrayList), 1);
        int k = b2.k(false);
        if (this.e == null) {
            this.e = Integer.valueOf(k);
        }
    }

    @Override // xsna.nqh0
    public final void release() {
        this.b.clear();
        Integer num = this.e;
        FragmentManager fragmentManager = this.a;
        if (num != null) {
            fragmentManager.X(num.intValue(), false);
        }
        this.e = null;
        fragmentManager.r0(this.c);
        dhr0.a.d(this.d);
    }
}
