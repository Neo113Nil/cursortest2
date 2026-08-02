package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lrv0;

/* compiled from: FragmentBackstackSearchDialogStackNavigator.kt */
/* loaded from: classes5.dex */
public final class sas implements exh0 {
    public final FragmentManager a;
    public final ArrayList b = new ArrayList();
    public final a c = new a();
    public final b d = new b();
    public Integer e;

    /* compiled from: FragmentBackstackSearchDialogStackNavigator.kt */
    public final class a extends FragmentManager.m {
        public a() {
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void e(Fragment fragment) {
            sas sasVar = sas.this;
            ArrayList arrayList = sasVar.b;
            if (fragment.isRemoving() && fragment == j5g.k0(arrayList)) {
                g5g.J(arrayList);
                FragmentManager fragmentManager = sasVar.a;
                if (!fragmentManager.T()) {
                    fragmentManager.W();
                }
                if (arrayList.isEmpty()) {
                    fragmentManager.r0(sasVar.c);
                    dhr0.a.d(sasVar.d);
                }
            }
        }
    }

    /* compiled from: FragmentBackstackSearchDialogStackNavigator.kt */
    public static final /* synthetic */ class b implements lrv0.a, g0t {
        public b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lrv0.a) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, sas.this, sas.class, "release", "release()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // xsna.lrv0.a
        public final void xb() {
            sas.this.release();
        }
    }

    public sas(FragmentManager fragmentManager) {
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

    @Override // xsna.exh0
    public final FragmentManager b() {
        return this.a;
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
