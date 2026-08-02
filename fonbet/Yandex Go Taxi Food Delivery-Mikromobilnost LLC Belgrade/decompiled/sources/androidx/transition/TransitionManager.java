package androidx.transition;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import androidx.transition.Transition;
import defpackage.b7;
import defpackage.rnz;
import defpackage.w53;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class TransitionManager {
    public static final AutoTransition a = new AutoTransition();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static class MultiListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        ViewGroup mSceneRoot;
        Transition mTransition;

        public MultiListener(Transition transition, ViewGroup viewGroup) {
            this.mTransition = transition;
            this.mSceneRoot = viewGroup;
        }

        private void removeListeners() {
            this.mSceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
            this.mSceneRoot.removeOnAttachStateChangeListener(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x01ef A[EDGE_INSN: B:117:0x01ef->B:118:0x01ef BREAK  A[LOOP:1: B:18:0x0090->B:30:0x01e7], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0249  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x02c9  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x02f3  */
        /* JADX WARN: Removed duplicated region for block: B:194:0x02f9  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onPreDraw() {
            ArrayList arrayList;
            int i;
            Transition transition;
            w53 w53Var;
            w53 w53Var2;
            int i2;
            int[] iArr;
            w53 w53Var3;
            int i3;
            int i4;
            ArrayList arrayList2;
            int i5;
            int i6;
            Transition.AnimationInfo animationInfo;
            boolean z;
            w53 w53Var4;
            TransitionValues transitionValues;
            View view;
            View view2;
            boolean z2;
            w53 w53Var5;
            removeListeners();
            boolean z3 = true;
            if (!TransitionManager.c.remove(this.mSceneRoot)) {
                return true;
            }
            final w53 c = TransitionManager.c();
            ArrayList arrayList3 = (ArrayList) c.get(this.mSceneRoot);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                c.put(this.mSceneRoot, arrayList3);
            } else if (arrayList3.size() > 0) {
                arrayList = new ArrayList(arrayList3);
                arrayList3.add(this.mTransition);
                this.mTransition.a(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionManager.MultiListener.1
                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public final void onTransitionEnd(Transition transition2) {
                        ((ArrayList) c.get(MultiListener.this.mSceneRoot)).remove(transition2);
                        transition2.K(this);
                    }
                });
                i = 0;
                this.mTransition.j(this.mSceneRoot, false);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Transition) it.next()).M(this.mSceneRoot);
                    }
                }
                transition = this.mTransition;
                ViewGroup viewGroup = this.mSceneRoot;
                transition.getClass();
                transition.K = new ArrayList();
                transition.L = new ArrayList();
                TransitionValuesMaps transitionValuesMaps = transition.G;
                TransitionValuesMaps transitionValuesMaps2 = transition.H;
                w53Var = new w53(transitionValuesMaps.a);
                w53Var2 = new w53(transitionValuesMaps2.a);
                i2 = 0;
                while (true) {
                    iArr = transition.J;
                    if (i2 < iArr.length) {
                        break;
                    }
                    int i7 = iArr[i2];
                    if (i7 == z3) {
                        z = z3;
                        w53Var4 = w53Var2;
                        for (int i8 = w53Var.c - 1; i8 >= 0; i8--) {
                            View view3 = (View) w53Var.f(i8);
                            if (view3 != null && transition.F(view3) && (transitionValues = (TransitionValues) w53Var4.remove(view3)) != null && transition.F(transitionValues.b)) {
                                transition.K.add((TransitionValues) w53Var.h(i8));
                                transition.L.add(transitionValues);
                            }
                        }
                    } else if (i7 == 2) {
                        z = z3;
                        w53Var4 = w53Var2;
                        w53 w53Var6 = transitionValuesMaps.d;
                        w53 w53Var7 = transitionValuesMaps2.d;
                        int i9 = w53Var6.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            View view4 = (View) w53Var6.j(i10);
                            if (view4 != null && transition.F(view4) && (view = (View) w53Var7.get((String) w53Var6.f(i10))) != null && transition.F(view)) {
                                TransitionValues transitionValues2 = (TransitionValues) w53Var.get(view4);
                                TransitionValues transitionValues3 = (TransitionValues) w53Var4.get(view);
                                if (transitionValues2 != null && transitionValues3 != null) {
                                    transition.K.add(transitionValues2);
                                    transition.L.add(transitionValues3);
                                    w53Var.remove(view4);
                                    w53Var4.remove(view);
                                }
                            }
                        }
                    } else if (i7 != 3) {
                        if (i7 == 4) {
                            rnz rnzVar = transitionValuesMaps.c;
                            rnz rnzVar2 = transitionValuesMaps2.c;
                            int j = rnzVar.j();
                            int i11 = i;
                            while (i11 < j) {
                                View view5 = (View) rnzVar.l(i11);
                                if (view5 == null || !transition.F(view5)) {
                                    z2 = z3;
                                    w53Var5 = w53Var2;
                                } else {
                                    w53 w53Var8 = w53Var2;
                                    View view6 = (View) rnzVar2.c(rnzVar.g(i11));
                                    if (view6 == null || !transition.F(view6)) {
                                        w53Var5 = w53Var8;
                                    } else {
                                        TransitionValues transitionValues4 = (TransitionValues) w53Var.get(view5);
                                        w53Var5 = w53Var8;
                                        TransitionValues transitionValues5 = (TransitionValues) w53Var5.get(view6);
                                        if (transitionValues4 != null && transitionValues5 != null) {
                                            z2 = z3;
                                            transition.K.add(transitionValues4);
                                            transition.L.add(transitionValues5);
                                            w53Var.remove(view5);
                                            w53Var5.remove(view6);
                                        }
                                    }
                                    z2 = z3;
                                }
                                i11++;
                                w53Var2 = w53Var5;
                                z3 = z2;
                            }
                        }
                        z = z3;
                        w53Var4 = w53Var2;
                    } else {
                        z = z3;
                        w53Var4 = w53Var2;
                        SparseArray sparseArray = transitionValuesMaps.b;
                        SparseArray sparseArray2 = transitionValuesMaps2.b;
                        int size = sparseArray.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            View view7 = (View) sparseArray.valueAt(i12);
                            if (view7 != null && transition.F(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && transition.F(view2)) {
                                TransitionValues transitionValues6 = (TransitionValues) w53Var.get(view7);
                                TransitionValues transitionValues7 = (TransitionValues) w53Var4.get(view2);
                                if (transitionValues6 != null && transitionValues7 != null) {
                                    transition.K.add(transitionValues6);
                                    transition.L.add(transitionValues7);
                                    w53Var.remove(view7);
                                    w53Var4.remove(view2);
                                }
                            }
                        }
                    }
                    i2++;
                    w53Var2 = w53Var4;
                    z3 = z;
                    i = 0;
                }
                boolean z4 = z3;
                w53Var3 = w53Var2;
                for (i3 = 0; i3 < w53Var.c; i3++) {
                    TransitionValues transitionValues8 = (TransitionValues) w53Var.j(i3);
                    if (transition.F(transitionValues8.b)) {
                        transition.K.add(transitionValues8);
                        transition.L.add(null);
                    }
                }
                for (i4 = 0; i4 < w53Var3.c; i4++) {
                    TransitionValues transitionValues9 = (TransitionValues) w53Var3.j(i4);
                    if (transition.F(transitionValues9.b)) {
                        transition.L.add(transitionValues9);
                        transition.K.add(null);
                    }
                }
                w53 z5 = Transition.z();
                int i13 = z5.c;
                WindowId windowId = viewGroup.getWindowId();
                arrayList2 = new ArrayList();
                i5 = i13 - 1;
                while (i5 >= 0) {
                    Animator animator = (Animator) z5.f(i5);
                    if (animator != null && (animationInfo = (Transition.AnimationInfo) z5.get(animator)) != null) {
                        Transition transition2 = animationInfo.e;
                        View view8 = animationInfo.a;
                        if (view8 != null && windowId.equals(animationInfo.d)) {
                            TransitionValues transitionValues10 = animationInfo.c;
                            boolean z6 = z4;
                            TransitionValues B = transition.B(view8, z6);
                            TransitionValues x = transition.x(view8, z6);
                            if (B == null && x == null) {
                                x = (TransitionValues) transition.H.a.get(view8);
                            }
                            if ((B != null || x != null) && transition2.E(transitionValues10, x)) {
                                Transition y = transition2.y();
                                ArrayList arrayList4 = transition2.N;
                                if (y.b0 != null) {
                                    animator.cancel();
                                    arrayList4.remove(animator);
                                    z5.h(i5);
                                    if (arrayList4.size() == 0) {
                                        arrayList2.add(transition2);
                                    }
                                } else if (animator.isRunning() || animator.isStarted()) {
                                    animator.cancel();
                                } else {
                                    z5.h(i5);
                                }
                            }
                        }
                    }
                    i5--;
                    z4 = true;
                }
                for (i6 = 0; i6 < arrayList2.size(); i6++) {
                    Transition transition3 = (Transition) arrayList2.get(i6);
                    transition3.G(transition3, Transition.TransitionNotification.c, false);
                    if (!transition3.R) {
                        transition3.R = true;
                        transition3.G(transition3, Transition.TransitionNotification.b, false);
                    }
                }
                transition.p(viewGroup, transition.G, transition.H, transition.K, transition.L);
                if (transition.b0 != null) {
                    transition.N();
                    return true;
                }
                if (Build.VERSION.SDK_INT < 34) {
                    return true;
                }
                transition.J();
                transition.b0.g();
                transition.b0.h();
                return true;
            }
            arrayList = null;
            arrayList3.add(this.mTransition);
            this.mTransition.a(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionManager.MultiListener.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition22) {
                    ((ArrayList) c.get(MultiListener.this.mSceneRoot)).remove(transition22);
                    transition22.K(this);
                }
            });
            i = 0;
            this.mTransition.j(this.mSceneRoot, false);
            if (arrayList != null) {
            }
            transition = this.mTransition;
            ViewGroup viewGroup2 = this.mSceneRoot;
            transition.getClass();
            transition.K = new ArrayList();
            transition.L = new ArrayList();
            TransitionValuesMaps transitionValuesMaps3 = transition.G;
            TransitionValuesMaps transitionValuesMaps22 = transition.H;
            w53Var = new w53(transitionValuesMaps3.a);
            w53Var2 = new w53(transitionValuesMaps22.a);
            i2 = 0;
            while (true) {
                iArr = transition.J;
                if (i2 < iArr.length) {
                }
                i2++;
                w53Var2 = w53Var4;
                z3 = z;
                i = 0;
            }
            boolean z42 = z3;
            w53Var3 = w53Var2;
            while (i3 < w53Var.c) {
            }
            while (i4 < w53Var3.c) {
            }
            w53 z52 = Transition.z();
            int i132 = z52.c;
            WindowId windowId2 = viewGroup2.getWindowId();
            arrayList2 = new ArrayList();
            i5 = i132 - 1;
            while (i5 >= 0) {
            }
            while (i6 < arrayList2.size()) {
            }
            transition.p(viewGroup2, transition.G, transition.H, transition.K, transition.L);
            if (transition.b0 != null) {
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            removeListeners();
            TransitionManager.c.remove(this.mSceneRoot);
            ArrayList arrayList = (ArrayList) TransitionManager.c().get(this.mSceneRoot);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).M(this.mSceneRoot);
                }
            }
            this.mTransition.l(true);
        }
    }

    public TransitionManager() {
        new w53();
        new w53();
    }

    public static void a(Transition transition, ViewGroup viewGroup) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (transition == null) {
            transition = a;
        }
        Transition clone = transition.clone();
        f(clone, viewGroup);
        viewGroup.setTag(R.id.transition_current_scene, null);
        e(clone, viewGroup);
    }

    public static void b(ViewGroup viewGroup) {
        c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((Transition) arrayList2.get(size)).w(viewGroup);
        }
    }

    public static w53 c() {
        w53 w53Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (w53Var = (w53) weakReference.get()) != null) {
            return w53Var;
        }
        w53 w53Var2 = new w53();
        threadLocal.set(new WeakReference(w53Var2));
        return w53Var2;
    }

    public static void d(Scene scene, Transition transition) {
        ViewGroup viewGroup = scene.a;
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        arrayList.add(viewGroup);
        Transition clone = transition.clone();
        f(clone, viewGroup);
        View view = scene.b;
        if (view != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(view);
        }
        viewGroup.setTag(R.id.transition_current_scene, scene);
        e(clone, viewGroup);
    }

    public static void e(Transition transition, ViewGroup viewGroup) {
        if (transition == null || viewGroup == null) {
            return;
        }
        MultiListener multiListener = new MultiListener(transition, viewGroup);
        viewGroup.addOnAttachStateChangeListener(multiListener);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(multiListener);
    }

    public static void f(Transition transition, ViewGroup viewGroup) {
        b7 b7Var;
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).H(viewGroup);
            }
        }
        if (transition != null) {
            transition.j(viewGroup, true);
        }
        Scene scene = (Scene) viewGroup.getTag(R.id.transition_current_scene);
        if (scene == null || ((Scene) scene.a.getTag(R.id.transition_current_scene)) != scene || (b7Var = scene.c) == null) {
            return;
        }
        b7Var.run();
    }
}
