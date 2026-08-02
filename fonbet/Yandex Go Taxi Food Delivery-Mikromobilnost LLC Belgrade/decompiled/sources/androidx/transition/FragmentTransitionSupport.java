package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.transition.Transition;
import defpackage.ges;
import defpackage.ny61;
import defpackage.qkh;
import defpackage.t26;
import defpackage.u18;
import defpackage.zvg;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes10.dex */
public class FragmentTransitionSupport extends ges {
    @Override // defpackage.ges
    public final void a(View view, Object obj) {
        ((Transition) obj).d(view);
    }

    @Override // defpackage.ges
    public final void b(ArrayList arrayList, Object obj) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.h0.size();
            while (i < size) {
                b(arrayList, transitionSet.a0(i));
                i++;
            }
            return;
        }
        if (ges.k(transition.x) && ges.k(transition.z) && ges.k(transition.y)) {
            int size2 = arrayList.size();
            while (i < size2) {
                transition.d((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.ges
    public final void c(Object obj) {
        ((TransitionSeekController) obj).a();
    }

    @Override // defpackage.ges
    public final void d(Object obj, zvg zvgVar) {
        ((TransitionSeekController) obj).c(zvgVar);
    }

    @Override // defpackage.ges
    public final void e(ViewGroup viewGroup, Object obj) {
        TransitionManager.a((Transition) obj, viewGroup);
    }

    @Override // defpackage.ges
    public final boolean g(Object obj) {
        return obj instanceof Transition;
    }

    @Override // defpackage.ges
    public final Object h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.ges
    public final Object i(ViewGroup viewGroup, Object obj) {
        Transition transition = (Transition) obj;
        ArrayList arrayList = TransitionManager.c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (transition.D()) {
                arrayList.add(viewGroup);
                Transition clone = transition.clone();
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.Z(clone);
                TransitionManager.f(transitionSet, viewGroup);
                viewGroup.setTag(R.id.transition_current_scene, null);
                TransitionManager.e(transitionSet, viewGroup);
                viewGroup.invalidate();
                Transition.SeekController seekController = new Transition.SeekController(transitionSet);
                transitionSet.b0 = seekController;
                transitionSet.a(seekController);
                return transitionSet.b0;
            }
            ny61.g("The Transition must support seeking.");
        }
        return null;
    }

    @Override // defpackage.ges
    public final boolean l() {
        return true;
    }

    @Override // defpackage.ges
    public final boolean m(Object obj) {
        boolean D = ((Transition) obj).D();
        if (!D) {
            Objects.toString(obj);
        }
        return D;
    }

    @Override // defpackage.ges
    public final Object n(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.Z(transition);
            transitionSet.Z(transition2);
            transitionSet.d0(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.Z(transition);
        }
        transitionSet2.Z(transition3);
        return transitionSet2;
    }

    @Override // defpackage.ges
    public final Object o(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.Z((Transition) obj);
        }
        transitionSet.Z((Transition) obj2);
        return transitionSet;
    }

    @Override // defpackage.ges
    public final void p(final View view, Object obj, final ArrayList arrayList) {
        ((Transition) obj).a(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.2
            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                transition.K(this);
                view.setVisibility(8);
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList2.get(i)).setVisibility(0);
                }
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                transition.K(this);
                transition.a(this);
            }
        });
    }

    @Override // defpackage.ges
    public final void q(Object obj, final Object obj2, final ArrayList arrayList, final Object obj3, final ArrayList arrayList2) {
        ((Transition) obj).a(new TransitionListenerAdapter() { // from class: androidx.transition.FragmentTransitionSupport.3
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                transition.K(this);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                FragmentTransitionSupport fragmentTransitionSupport = FragmentTransitionSupport.this;
                Object obj4 = obj2;
                if (obj4 != null) {
                    fragmentTransitionSupport.z(obj4, arrayList, null);
                }
                Object obj5 = obj3;
                if (obj5 != null) {
                    fragmentTransitionSupport.z(obj5, arrayList2, null);
                }
            }
        });
    }

    @Override // defpackage.ges
    public final void r(float f, Object obj) {
        TransitionSeekController transitionSeekController = (TransitionSeekController) obj;
        if (transitionSeekController.isReady()) {
            long f2 = (long) (f * transitionSeekController.f());
            if (f2 == 0) {
                f2 = 1;
            }
            if (f2 == transitionSeekController.f()) {
                f2 = transitionSeekController.f() - 1;
            }
            transitionSeekController.b(f2);
        }
    }

    @Override // defpackage.ges
    public final void s(View view, Object obj) {
        if (view != null) {
            final Rect rect = new Rect();
            ges.j(view, rect);
            ((Transition) obj).Q(new Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.1
                @Override // androidx.transition.Transition.EpicenterCallback
                public final Rect a() {
                    return rect;
                }
            });
        }
    }

    @Override // defpackage.ges
    public final void t(Object obj, final Rect rect) {
        ((Transition) obj).Q(new Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.5
            @Override // androidx.transition.Transition.EpicenterCallback
            public final Rect a() {
                Rect rect2 = rect;
                if (rect2.isEmpty()) {
                    return null;
                }
                return rect2;
            }
        });
    }

    @Override // defpackage.ges
    public final void u(Fragment fragment, Object obj, u18 u18Var, Runnable runnable) {
        v(obj, u18Var, null, runnable);
    }

    @Override // defpackage.ges
    public final void v(Object obj, u18 u18Var, qkh qkhVar, final Runnable runnable) {
        Transition transition = (Transition) obj;
        t26 t26Var = new t26(9, qkhVar, transition, runnable);
        synchronized (u18Var) {
            while (u18Var.d) {
                try {
                    try {
                        u18Var.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (u18Var.b != t26Var) {
                u18Var.b = t26Var;
                if (u18Var.a) {
                    Runnable runnable2 = (Runnable) t26Var.b;
                    Transition transition2 = (Transition) t26Var.c;
                    Runnable runnable3 = (Runnable) t26Var.w;
                    if (runnable2 == null) {
                        transition2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        transition.a(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.4
            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition3) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition3) {
                runnable.run();
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition3) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition3) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition3) {
            }
        });
    }

    @Override // defpackage.ges
    public final void w(View view, Object obj, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList arrayList2 = transitionSet.y;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ges.f((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(arrayList, transitionSet);
    }

    @Override // defpackage.ges
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            ArrayList arrayList3 = transitionSet.y;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.ges
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.Z((Transition) obj);
        return transitionSet;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.h0.size();
            while (i < size) {
                z(transitionSet.a0(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (ges.k(transition.x) && ges.k(transition.z)) {
            ArrayList arrayList3 = transition.y;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    transition.d((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    transition.L((View) arrayList.get(size3));
                }
            }
        }
    }
}
