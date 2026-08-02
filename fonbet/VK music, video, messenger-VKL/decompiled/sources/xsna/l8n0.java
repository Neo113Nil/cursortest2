package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: SuperAppItemAnimatorV2.kt */
/* loaded from: classes6.dex */
public final class l8n0 extends androidx.recyclerview.widget.n0 {
    public static final AccelerateDecelerateInterpolator t = new AccelerateDecelerateInterpolator();
    public final ArrayList<RecyclerView.e0> h = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> i = new ArrayList<>();
    public final ArrayList<b> j = new ArrayList<>();
    public final ArrayList<a> k = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.e0>> l = new ArrayList<>();
    public final ArrayList<ArrayList<b>> m = new ArrayList<>();
    public final ArrayList<ArrayList<a>> n = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> o = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> p = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> q = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> r = new ArrayList<>();
    public final long s = 500;

    /* compiled from: SuperAppItemAnimatorV2.kt */
    public static final class a {
        public RecyclerView.e0 a;
        public RecyclerView.e0 b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public a(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4) {
            this.a = e0Var;
            this.b = e0Var2;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }

    /* compiled from: SuperAppItemAnimatorV2.kt */
    public static final class b {
        public final RecyclerView.e0 a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public b(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
            this.a = e0Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    /* compiled from: SuperAppItemAnimatorV2.kt */
    public static final class c extends AnimatorListenerAdapter {
        public final /* synthetic */ a c;
        public final /* synthetic */ ViewPropertyAnimator d;
        public final /* synthetic */ View e;

        public c(a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.c = aVar;
            this.d = viewPropertyAnimator;
            this.e = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.d.setListener(null);
            View view = this.e;
            view.setAlpha(1.0f);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            a aVar = this.c;
            RecyclerView.e0 e0Var = aVar.a;
            l8n0 l8n0Var = l8n0.this;
            l8n0Var.h(e0Var);
            ArrayList<RecyclerView.e0> arrayList = l8n0Var.r;
            ttp0.a(arrayList).remove(aVar.a);
            l8n0Var.F();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            RecyclerView.e0 e0Var = this.c.a;
            l8n0.this.getClass();
        }
    }

    /* compiled from: SuperAppItemAnimatorV2.kt */
    public static final class d extends AnimatorListenerAdapter {
        public final /* synthetic */ a c;
        public final /* synthetic */ ViewPropertyAnimator d;
        public final /* synthetic */ View e;

        public d(a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.c = aVar;
            this.d = viewPropertyAnimator;
            this.e = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.d.setListener(null);
            View view = this.e;
            view.setAlpha(1.0f);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            a aVar = this.c;
            RecyclerView.e0 e0Var = aVar.b;
            l8n0 l8n0Var = l8n0.this;
            l8n0Var.h(e0Var);
            ArrayList<RecyclerView.e0> arrayList = l8n0Var.r;
            ttp0.a(arrayList).remove(aVar.b);
            l8n0Var.F();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            RecyclerView.e0 e0Var = this.c.b;
            l8n0.this.getClass();
        }
    }

    public static void E(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            ((RecyclerView.e0) arrayList.get(size)).itemView.animate().cancel();
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public static boolean I(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
        return ((float) e0Var.itemView.getMeasuredWidth()) * 0.8f < ((float) Math.abs(i3 - i)) || ((float) e0Var.itemView.getMeasuredHeight()) * 0.8f < ((float) Math.abs(i4 - i2));
    }

    public static boolean J(RecyclerView.e0 e0Var) {
        return (e0Var instanceof nbn0) || (e0Var instanceof pbn0);
    }

    public static boolean K(RecyclerView.e0 e0Var) {
        return (J(e0Var) || (e0Var instanceof gdn0) || (e0Var instanceof tcn0) || (e0Var instanceof ean0) || (e0Var instanceof pbn0) || (e0Var instanceof gan0) || (e0Var instanceof bdn0)) ? false : true;
    }

    public final void C(a aVar) {
        RecyclerView.e0 e0Var = aVar.a;
        RecyclerView.e0 e0Var2 = aVar.b;
        ArrayList<RecyclerView.e0> arrayList = this.r;
        if (e0Var != null) {
            View view = e0Var.itemView;
            ViewPropertyAnimator duration = view.animate().setDuration(this.f);
            arrayList.add(e0Var);
            duration.translationX(aVar.e - aVar.c);
            duration.translationY(aVar.f - aVar.d);
            duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new c(aVar, duration, view)).start();
        }
        if (e0Var2 != null) {
            View view2 = e0Var2.itemView;
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(e0Var2);
            animate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(this.f).alpha(1.0f).setListener(new d(aVar, animate, view2)).start();
        }
    }

    public final void D(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
        View view = e0Var.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (i6 != 0) {
            view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ViewPropertyAnimator animate = view.animate();
        this.p.add(e0Var);
        animate.setDuration(this.e).setListener(new s8n0(this, e0Var, i5, view, i6, animate)).start();
    }

    public final void F() {
        if (n()) {
            return;
        }
        i();
    }

    public final void G(ArrayList arrayList, RecyclerView.e0 e0Var) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            a aVar = (a) arrayList.get(size);
            if (H(aVar, e0Var) && aVar.a == null && aVar.b == null) {
                arrayList.remove(aVar);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean H(a aVar, RecyclerView.e0 e0Var) {
        if (aVar.b == e0Var) {
            aVar.b = null;
        } else {
            if (aVar.a != e0Var) {
                return false;
            }
            aVar.a = null;
        }
        e0Var.itemView.setAlpha(1.0f);
        e0Var.itemView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        e0Var.itemView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        h(e0Var);
        return true;
    }

    public final void L(RecyclerView.e0 e0Var) {
        e0Var.itemView.animate().setInterpolator(t);
        j(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean g(RecyclerView.e0 e0Var, List<? extends Object> list) {
        return !list.isEmpty() || f(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        view.animate().cancel();
        ArrayList<b> arrayList = this.j;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (arrayList.get(size).a == e0Var) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    h(e0Var);
                    arrayList.remove(size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        G(this.k, e0Var);
        if (this.h.remove(e0Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            A(e0Var);
        }
        if (this.i.remove(e0Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            h(e0Var);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.n;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                ArrayList<a> arrayList3 = arrayList2.get(size2);
                G(arrayList3, e0Var);
                if (arrayList3.isEmpty()) {
                    arrayList2.remove(size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        ArrayList<ArrayList<b>> arrayList4 = this.m;
        int size3 = arrayList4.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                ArrayList<b> arrayList5 = arrayList4.get(size3);
                int size4 = arrayList5.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        if (arrayList5.get(size4).a == e0Var) {
                            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            h(e0Var);
                            arrayList5.remove(size4);
                            if (arrayList5.isEmpty()) {
                                arrayList4.remove(size3);
                            }
                        } else if (i4 < 0) {
                            break;
                        } else {
                            size4 = i4;
                        }
                    }
                }
                if (i3 < 0) {
                    break;
                } else {
                    size3 = i3;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.e0>> arrayList6 = this.l;
        int size5 = arrayList6.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                ArrayList<RecyclerView.e0> arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(e0Var)) {
                    view.setAlpha(1.0f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    h(e0Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
                if (i5 < 0) {
                    break;
                } else {
                    size5 = i5;
                }
            }
        }
        this.q.remove(e0Var);
        this.o.remove(e0Var);
        this.r.remove(e0Var);
        this.p.remove(e0Var);
        F();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void k() {
        ArrayList<b> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            RecyclerView.e0 e0Var = arrayList.get(size).a;
            View view = e0Var.itemView;
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            h(e0Var);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.e0> arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            A(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.e0> arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (-1 >= size3) {
                break;
            }
            RecyclerView.e0 e0Var2 = arrayList3.get(size3);
            e0Var2.itemView.setAlpha(1.0f);
            e0Var2.itemView.setScaleX(1.0f);
            e0Var2.itemView.setScaleY(1.0f);
            h(e0Var2);
            arrayList3.remove(size3);
        }
        ArrayList<a> arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; -1 < size4; size4--) {
            a aVar = arrayList4.get(size4);
            RecyclerView.e0 e0Var3 = aVar.a;
            if (e0Var3 != null) {
                H(aVar, e0Var3);
            }
            RecyclerView.e0 e0Var4 = aVar.b;
            if (e0Var4 != null) {
                H(aVar, e0Var4);
            }
        }
        arrayList4.clear();
        if (n()) {
            ArrayList<ArrayList<b>> arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; -1 < size5; size5--) {
                ArrayList<b> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; -1 < size6; size6--) {
                    RecyclerView.e0 e0Var5 = arrayList6.get(size6).a;
                    View view2 = e0Var5.itemView;
                    view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    h(e0Var5);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.e0>> arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; -1 < size7; size7--) {
                ArrayList<RecyclerView.e0> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; -1 < size8; size8--) {
                    RecyclerView.e0 e0Var6 = arrayList8.get(size8);
                    View view3 = e0Var6.itemView;
                    view3.setAlpha(1.0f);
                    view3.setScaleX(1.0f);
                    view3.setScaleY(1.0f);
                    h(e0Var6);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<a>> arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; -1 < size9; size9--) {
                ArrayList<a> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; -1 < size10; size10--) {
                    a aVar2 = arrayList10.get(size10);
                    RecyclerView.e0 e0Var7 = aVar2.a;
                    if (e0Var7 != null) {
                        H(aVar2, e0Var7);
                    }
                    RecyclerView.e0 e0Var8 = aVar2.b;
                    if (e0Var8 != null) {
                        H(aVar2, e0Var8);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            E(this.q);
            E(this.p);
            E(this.o);
            E(this.r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean n() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void r() {
        ArrayList<RecyclerView.e0> arrayList;
        boolean z;
        ArrayList<RecyclerView.e0> arrayList2 = this.h;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList<b> arrayList3 = this.j;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList<a> arrayList4 = this.k;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList<RecyclerView.e0> arrayList5 = this.i;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator<RecyclerView.e0> it = arrayList2.iterator();
        while (it.hasNext()) {
            RecyclerView.e0 next = it.next();
            boolean J = J(next);
            ArrayList<RecyclerView.e0> arrayList6 = this.q;
            if (J) {
                long j = this.s / 2;
                View view = next.itemView;
                ViewPropertyAnimator animate = view.animate();
                arrayList6.add(next);
                arrayList = arrayList2;
                z = isEmpty;
                animate.setDuration(j).setStartDelay(0L).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new r8n0(view, animate, next, this)).start();
            } else {
                arrayList = arrayList2;
                z = isEmpty;
                if (K(next)) {
                    View view2 = next.itemView;
                    ViewPropertyAnimator animate2 = view2.animate();
                    arrayList6.add(next);
                    animate2.setDuration(this.d).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleX(0.7f).scaleY(0.7f).setListener(new v8n0(view2, animate2, next, this)).start();
                } else {
                    View view3 = next.itemView;
                    ViewPropertyAnimator animate3 = view3.animate();
                    arrayList6.add(next);
                    animate3.setDuration(this.d).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new t8n0(view3, animate3, next, this)).start();
                }
            }
            arrayList2 = arrayList;
            isEmpty = z;
        }
        boolean z2 = isEmpty;
        arrayList2.clear();
        if (!isEmpty2) {
            ArrayList<b> c2 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList3);
            this.m.add(c2);
            arrayList3.clear();
            ls2 ls2Var = new ls2(9, c2, this);
            if (z2) {
                ls2Var.run();
            } else {
                View view4 = c2.get(0).a.itemView;
                long j2 = this.d;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view4.postOnAnimationDelayed(ls2Var, j2);
            }
        }
        if (!isEmpty3) {
            ArrayList<a> c3 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList4);
            this.n.add(c3);
            arrayList4.clear();
            ue9 ue9Var = new ue9(c3, this);
            if (z2) {
                ue9Var.run();
            } else {
                View view5 = c3.get(0).a.itemView;
                long j3 = this.d;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                view5.postOnAnimationDelayed(ue9Var, j3);
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList<RecyclerView.e0> c4 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList5);
        this.l.add(c4);
        arrayList5.clear();
        y yVar = new y(6, c4, this);
        if (z2 && isEmpty2 && isEmpty3) {
            yVar.run();
            return;
        }
        long j4 = !z2 ? this.d : 0L;
        long j5 = !isEmpty2 ? this.e : 0L;
        long j6 = isEmpty3 ? 0L : this.f;
        if (j5 < j6) {
            j5 = j6;
        }
        View view6 = c4.get(0).itemView;
        WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
        view6.postOnAnimationDelayed(yVar, j4 + j5);
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean w(RecyclerView.e0 e0Var) {
        L(e0Var);
        e0Var.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (K(e0Var)) {
            e0Var.itemView.setScaleX(0.7f);
            e0Var.itemView.setScaleY(0.7f);
        }
        this.i.add(e0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean x(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4) {
        if (e0Var == e0Var2) {
            return y(e0Var, i, i2, i3, i4);
        }
        float translationX = e0Var.itemView.getTranslationX();
        float translationY = e0Var.itemView.getTranslationY();
        float alpha = e0Var.itemView.getAlpha();
        L(e0Var);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        e0Var.itemView.setTranslationX(translationX);
        e0Var.itemView.setTranslationY(translationY);
        e0Var.itemView.setAlpha(alpha);
        if (e0Var2 != null) {
            L(e0Var2);
            if (J(e0Var2)) {
                e0Var2.itemView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                e0Var2.itemView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                e0Var2.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                e0Var2.itemView.setTranslationX(-i5);
                e0Var2.itemView.setTranslationY(-i6);
                e0Var2.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        this.k.add(new a(e0Var, e0Var2, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean y(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
        View view = e0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) e0Var.itemView.getTranslationY());
        L(e0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            h(e0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.j.add(new b(e0Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean z(RecyclerView.e0 e0Var) {
        L(e0Var);
        this.h.add(e0Var);
        return true;
    }
}
