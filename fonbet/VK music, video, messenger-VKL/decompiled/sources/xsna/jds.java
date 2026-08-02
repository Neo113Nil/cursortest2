package xsna;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import xsna.rq9;
import xsna.vlp0;

/* compiled from: FragmentTransitionSupport.java */
/* loaded from: classes12.dex */
public class jds extends gds {

    /* compiled from: FragmentTransitionSupport.java */
    public class a extends vlp0.f {
        public final /* synthetic */ Rect a;

        public a(Rect rect) {
            this.a = rect;
        }

        @Override // xsna.vlp0.f
        public final Rect a() {
            return this.a;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    public class c extends vlp0.f {
        public final /* synthetic */ Rect a;

        public c(Rect rect) {
            this.a = rect;
        }

        @Override // xsna.vlp0.f
        public final Rect a() {
            Rect rect = this.a;
            if (rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    public static boolean z(vlp0 vlp0Var) {
        return (gds.k(vlp0Var.getTargetIds()) && gds.k(vlp0Var.getTargetNames()) && gds.k(vlp0Var.getTargetTypes())) ? false : true;
    }

    public final void A(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        vlp0 vlp0Var = (vlp0) obj;
        int i = 0;
        if (vlp0Var instanceof dnp0) {
            dnp0 dnp0Var = (dnp0) vlp0Var;
            int size = dnp0Var.b.size();
            while (i < size) {
                A(dnp0Var.d(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (z(vlp0Var)) {
            return;
        }
        List<View> targets = vlp0Var.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size2) {
                vlp0Var.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                vlp0Var.removeTarget(arrayList.get(size3));
            }
        }
    }

    @Override // xsna.gds
    public final void a(View view, Object obj) {
        ((vlp0) obj).addTarget(view);
    }

    @Override // xsna.gds
    public final void b(Object obj, ArrayList<View> arrayList) {
        vlp0 vlp0Var = (vlp0) obj;
        if (vlp0Var == null) {
            return;
        }
        int i = 0;
        if (vlp0Var instanceof dnp0) {
            dnp0 dnp0Var = (dnp0) vlp0Var;
            int size = dnp0Var.b.size();
            while (i < size) {
                b(dnp0Var.d(i), arrayList);
                i++;
            }
            return;
        }
        if (z(vlp0Var) || !gds.k(vlp0Var.getTargets())) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            vlp0Var.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // xsna.gds
    public final void c(Object obj) {
        ((cnp0) obj).c();
    }

    @Override // xsna.gds
    public final void d(Object obj, at6 at6Var) {
        ((cnp0) obj).e(at6Var);
    }

    @Override // xsna.gds
    public final void e(ViewGroup viewGroup, Object obj) {
        zmp0.a(viewGroup, (vlp0) obj);
    }

    @Override // xsna.gds
    public final boolean g(Object obj) {
        return obj instanceof vlp0;
    }

    @Override // xsna.gds
    public final Object h(Object obj) {
        if (obj != null) {
            return ((vlp0) obj).clone();
        }
        return null;
    }

    @Override // xsna.gds
    public final Object i(ViewGroup viewGroup, Object obj) {
        vlp0 vlp0Var = (vlp0) obj;
        ArrayList<ViewGroup> arrayList = zmp0.c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!vlp0Var.isSeekingSupported()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        vlp0 clone = vlp0Var.clone();
        dnp0 dnp0Var = new dnp0();
        dnp0Var.c(clone);
        zmp0.f(viewGroup, dnp0Var);
        viewGroup.setTag(R.id.transition_current_scene, null);
        zmp0.e(viewGroup, dnp0Var);
        viewGroup.invalidate();
        return dnp0Var.createSeekController();
    }

    @Override // xsna.gds
    public final boolean l() {
        return true;
    }

    @Override // xsna.gds
    public final boolean m(Object obj) {
        boolean isSeekingSupported = ((vlp0) obj).isSeekingSupported();
        if (!isSeekingSupported) {
            Objects.toString(obj);
        }
        return isSeekingSupported;
    }

    @Override // xsna.gds
    public final Object n(Object obj, Object obj2, Object obj3) {
        vlp0 vlp0Var = (vlp0) obj;
        vlp0 vlp0Var2 = (vlp0) obj2;
        vlp0 vlp0Var3 = (vlp0) obj3;
        if (vlp0Var != null && vlp0Var2 != null) {
            dnp0 dnp0Var = new dnp0();
            dnp0Var.c(vlp0Var);
            dnp0Var.c(vlp0Var2);
            dnp0Var.g(1);
            vlp0Var = dnp0Var;
        } else if (vlp0Var == null) {
            vlp0Var = vlp0Var2 != null ? vlp0Var2 : null;
        }
        if (vlp0Var3 == null) {
            return vlp0Var;
        }
        dnp0 dnp0Var2 = new dnp0();
        if (vlp0Var != null) {
            dnp0Var2.c(vlp0Var);
        }
        dnp0Var2.c(vlp0Var3);
        return dnp0Var2;
    }

    @Override // xsna.gds
    public final Object o(Object obj, Object obj2) {
        dnp0 dnp0Var = new dnp0();
        if (obj != null) {
            dnp0Var.c((vlp0) obj);
        }
        dnp0Var.c((vlp0) obj2);
        return dnp0Var;
    }

    @Override // xsna.gds
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        ((vlp0) obj).addListener(new b(view, arrayList));
    }

    @Override // xsna.gds
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((vlp0) obj).addListener(new kds(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // xsna.gds
    public final void r(Object obj, float f) {
        cnp0 cnp0Var = (cnp0) obj;
        if (cnp0Var.isReady()) {
            long b2 = (long) (f * cnp0Var.b());
            if (b2 == 0) {
                b2 = 1;
            }
            if (b2 == cnp0Var.b()) {
                b2 = cnp0Var.b() - 1;
            }
            cnp0Var.d(b2);
        }
    }

    @Override // xsna.gds
    public final void s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            gds.j(rect, view);
            ((vlp0) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // xsna.gds
    public final void t(Object obj, Rect rect) {
        ((vlp0) obj).setEpicenterCallback(new c(rect));
    }

    @Override // xsna.gds
    public final void u(Fragment fragment, Object obj, rq9 rq9Var, wq8 wq8Var) {
        v(obj, rq9Var, null, wq8Var);
    }

    @Override // xsna.gds
    public final void v(Object obj, rq9 rq9Var, final qo4 qo4Var, final Runnable runnable) {
        final vlp0 vlp0Var = (vlp0) obj;
        rq9Var.b(new rq9.a() { // from class: xsna.ids
            @Override // xsna.rq9.a
            public final void onCancel() {
                Runnable runnable2 = qo4Var;
                if (runnable2 != null) {
                    runnable2.run();
                } else {
                    vlp0Var.cancel();
                    runnable.run();
                }
            }
        });
        vlp0Var.addListener(new lds(runnable));
    }

    @Override // xsna.gds
    public final void w(Object obj, View view, ArrayList<View> arrayList) {
        dnp0 dnp0Var = (dnp0) obj;
        List<View> targets = dnp0Var.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gds.f(arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(dnp0Var, arrayList);
    }

    @Override // xsna.gds
    public final void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        dnp0 dnp0Var = (dnp0) obj;
        if (dnp0Var != null) {
            dnp0Var.getTargets().clear();
            dnp0Var.getTargets().addAll(arrayList2);
            A(dnp0Var, arrayList, arrayList2);
        }
    }

    @Override // xsna.gds
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        dnp0 dnp0Var = new dnp0();
        dnp0Var.c((vlp0) obj);
        return dnp0Var;
    }

    /* compiled from: FragmentTransitionSupport.java */
    public class b implements vlp0.i {
        public final /* synthetic */ View b;
        public final /* synthetic */ ArrayList c;

        public b(View view, ArrayList arrayList) {
            this.b = view;
            this.c = arrayList;
        }

        @Override // xsna.vlp0.i
        public final void onTransitionEnd(vlp0 vlp0Var) {
            vlp0Var.removeListener(this);
            this.b.setVisibility(8);
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // xsna.vlp0.i
        public final void onTransitionStart(vlp0 vlp0Var) {
            vlp0Var.removeListener(this);
            vlp0Var.addListener(this);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionCancel(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionPause(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionResume(vlp0 vlp0Var) {
        }
    }
}
