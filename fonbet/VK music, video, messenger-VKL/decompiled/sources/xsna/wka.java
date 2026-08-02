package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.VkText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: CategoryItemAnimator.kt */
/* loaded from: classes16.dex */
public final class wka extends androidx.recyclerview.widget.n0 {
    public static final ffx B = new ffx();
    public vr2 A;
    public final pkn0 h;
    public final u40 i;
    public final v40 j;
    public final long k;
    public final long l;
    public final ArrayList<hla> m;
    public final ArrayList<hla> n;
    public final ArrayList<c> o;
    public final ArrayList<b> p;
    public final ArrayList<ArrayList<hla>> q;
    public final ArrayList<ArrayList<c>> r;
    public final ArrayList<ArrayList<b>> s;
    public final ArrayList<hla> t;
    public final ArrayList<hla> u;
    public final ArrayList<hla> v;
    public final ArrayList<hla> w;
    public final CopyOnWriteArrayList<d> x;
    public final HashSet<hla> y;
    public a z;

    /* compiled from: CategoryItemAnimator.kt */
    public interface a {

        /* compiled from: CategoryItemAnimator.kt */
        /* renamed from: xsna.wka$a$a, reason: collision with other inner class name */
        public static final class C3938a implements a {
            public final int a;

            public C3938a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3938a) && this.a == ((C3938a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("FlyAnimationRequired(totalAmount="), this.a, ')');
            }
        }

        /* compiled from: CategoryItemAnimator.kt */
        public static final class b implements a {
            public static final b a = new b();
        }
    }

    /* compiled from: CategoryItemAnimator.kt */
    public static final class b {
        public hla a;
        public hla b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(hla hlaVar, hla hlaVar2, int i, int i2, int i3, int i4) {
            this.a = hlaVar;
            this.b = hlaVar2;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }

    /* compiled from: CategoryItemAnimator.kt */
    public static final class c {
        public final hla a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public c(hla hlaVar, int i, int i2, int i3, int i4) {
            this.a = hlaVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    /* compiled from: CategoryItemAnimator.kt */
    public static final class d {
        public final hla a;
        public final long b;
        public final long c;

        public d(hla hlaVar, long j, long j2) {
            this.a = hlaVar;
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoveFlyInfo(holder=");
            sb.append(this.a);
            sb.append(", startDelay=");
            sb.append(this.b);
            sb.append(", animationDuration=");
            return vu5.a(')', this.c, sb);
        }
    }

    public wka(pkn0 pkn0Var, u40 u40Var, v40 v40Var) {
        this.h = pkn0Var;
        this.i = u40Var;
        this.j = v40Var;
        this.g = false;
        this.c = 300L;
        this.d = 600L;
        this.f = 900L;
        this.e = 900L;
        long j = 600 / 4;
        this.k = j;
        this.l = j * 3;
        this.m = new ArrayList<>();
        this.n = new ArrayList<>();
        this.o = new ArrayList<>();
        this.p = new ArrayList<>();
        this.q = new ArrayList<>();
        this.r = new ArrayList<>();
        this.s = new ArrayList<>();
        this.t = new ArrayList<>();
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        this.w = new ArrayList<>();
        this.x = new CopyOnWriteArrayList<>();
        this.y = new HashSet<>();
        this.z = a.b.a;
    }

    public static void C(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            hla hlaVar = (hla) arrayList.get(size);
            fla flaVar = hlaVar.p;
            Animator animator = flaVar.e;
            if (animator != null) {
                animator.cancel();
            }
            flaVar.e = null;
            hlaVar.itemView.animate().cancel();
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final void D() {
        if (n()) {
            return;
        }
        i();
    }

    public final void E(ArrayList arrayList, RecyclerView.e0 e0Var) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            b bVar = (b) arrayList.get(size);
            if (F(bVar, e0Var) && bVar.a == null && bVar.b == null) {
                arrayList.remove(bVar);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean F(b bVar, RecyclerView.e0 e0Var) {
        if (bVar.b == e0Var) {
            bVar.b = null;
        } else {
            if (bVar.a != e0Var) {
                return false;
            }
            bVar.a = null;
        }
        e0Var.itemView.setAlpha(1.0f);
        e0Var.itemView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        e0Var.itemView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        h(e0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean g(RecyclerView.e0 e0Var, List<? extends Object> list) {
        return !list.isEmpty() || f(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j(RecyclerView.e0 e0Var) {
        fla flaVar;
        hla hlaVar = e0Var instanceof hla ? (hla) e0Var : null;
        if (hlaVar != null && (flaVar = hlaVar.p) != null) {
            Animator animator = flaVar.e;
            if (animator != null) {
                animator.cancel();
            }
            flaVar.e = null;
        }
        View view = e0Var.itemView;
        view.animate().cancel();
        ArrayList<c> arrayList = this.o;
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
        E(this.p, e0Var);
        if (ttp0.a(this.m).remove(e0Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            A(e0Var);
        }
        if (ttp0.a(this.n).remove(e0Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            h(e0Var);
        }
        ArrayList<ArrayList<b>> arrayList2 = this.s;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                ArrayList<b> arrayList3 = arrayList2.get(size2);
                E(arrayList3, e0Var);
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
        ArrayList<ArrayList<c>> arrayList4 = this.r;
        int size3 = arrayList4.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                ArrayList<c> arrayList5 = arrayList4.get(size3);
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
        ArrayList<ArrayList<hla>> arrayList6 = this.q;
        int size5 = arrayList6.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                ArrayList<hla> arrayList7 = arrayList6.get(size5);
                if (ttp0.a(arrayList7).remove(e0Var)) {
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
        ttp0.a(this.v).remove(e0Var);
        ttp0.a(this.t).remove(e0Var);
        ttp0.a(this.w).remove(e0Var);
        ttp0.a(this.u).remove(e0Var);
        D();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void k() {
        this.z = a.b.a;
        ArrayList<c> arrayList = this.o;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            hla hlaVar = arrayList.get(size).a;
            View view = hlaVar.itemView;
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            h(hlaVar);
            arrayList.remove(size);
        }
        ArrayList<hla> arrayList2 = this.m;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            A(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<hla> arrayList3 = this.n;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (-1 >= size3) {
                break;
            }
            hla hlaVar2 = arrayList3.get(size3);
            hlaVar2.itemView.setAlpha(1.0f);
            hlaVar2.itemView.setScaleX(1.0f);
            hlaVar2.itemView.setScaleY(1.0f);
            h(hlaVar2);
            fla flaVar = arrayList3.remove(size3).p;
            Animator animator = flaVar.e;
            if (animator != null) {
                animator.cancel();
            }
            flaVar.e = null;
        }
        ArrayList<b> arrayList4 = this.p;
        for (int size4 = arrayList4.size() - 1; -1 < size4; size4--) {
            b bVar = arrayList4.get(size4);
            hla hlaVar3 = bVar.a;
            if (hlaVar3 != null) {
                F(bVar, hlaVar3);
            }
            hla hlaVar4 = bVar.b;
            if (hlaVar4 != null) {
                F(bVar, hlaVar4);
            }
        }
        arrayList4.clear();
        if (n()) {
            ArrayList<ArrayList<c>> arrayList5 = this.r;
            for (int size5 = arrayList5.size() - 1; -1 < size5; size5--) {
                ArrayList<c> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; -1 < size6; size6--) {
                    hla hlaVar5 = arrayList6.get(size6).a;
                    View view2 = hlaVar5.itemView;
                    view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    h(hlaVar5);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<hla>> arrayList7 = this.q;
            for (int size7 = arrayList7.size() - 1; -1 < size7; size7--) {
                ArrayList<hla> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; -1 < size8; size8--) {
                    hla hlaVar6 = arrayList8.get(size8);
                    View view3 = hlaVar6.itemView;
                    view3.setAlpha(1.0f);
                    view3.setScaleX(1.0f);
                    view3.setScaleY(1.0f);
                    h(hlaVar6);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<b>> arrayList9 = this.s;
            for (int size9 = arrayList9.size() - 1; -1 < size9; size9--) {
                ArrayList<b> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; -1 < size10; size10--) {
                    b bVar2 = arrayList10.get(size10);
                    hla hlaVar7 = bVar2.a;
                    if (hlaVar7 != null) {
                        F(bVar2, hlaVar7);
                    }
                    hla hlaVar8 = bVar2.b;
                    if (hlaVar8 != null) {
                        F(bVar2, hlaVar8);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            C(this.v);
            C(this.u);
            C(this.t);
            C(this.w);
            this.y.clear();
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean n() {
        return (this.n.isEmpty() && this.p.isEmpty() && this.o.isEmpty() && this.m.isEmpty() && this.u.isEmpty() && this.v.isEmpty() && this.t.isEmpty() && this.w.isEmpty() && this.r.isEmpty() && this.q.isEmpty() && this.s.isEmpty()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Throwable, xsna.vr2] */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void r() {
        HashSet<hla> hashSet;
        boolean z;
        Iterator<hla> it;
        d dVar;
        ArrayList<c> arrayList;
        boolean z2;
        ArrayList<b> arrayList2;
        boolean z3;
        ArrayList<hla> arrayList3;
        boolean z4;
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        boolean z5;
        AnimatorSet animatorSet;
        ArrayList<hla> arrayList4 = this.m;
        boolean isEmpty = arrayList4.isEmpty();
        ArrayList<c> arrayList5 = this.o;
        boolean isEmpty2 = arrayList5.isEmpty();
        ArrayList<b> arrayList6 = this.p;
        boolean isEmpty3 = arrayList6.isEmpty();
        ArrayList<hla> arrayList7 = this.n;
        boolean isEmpty4 = arrayList7.isEmpty();
        pkn0 pkn0Var = this.h;
        Object obj = null;
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            vr2 vr2Var = this.A;
            if (vr2Var != null) {
                pkn0Var.execute(vr2Var);
            }
            this.A = null;
            return;
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator<hla> it2 = arrayList4.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            hashSet = this.y;
            if (!hasNext) {
                break;
            }
            hla next = it2.next();
            if (hashSet.contains(next)) {
                arrayList8.add(next);
            }
        }
        Iterator it3 = j5g.D0(new t900(1), arrayList8).iterator();
        int i = 0;
        while (true) {
            boolean hasNext2 = it3.hasNext();
            ?? r17 = obj;
            Iterator it4 = it3;
            long j = this.k;
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.x;
            if (!hasNext2) {
                hashSet.clear();
                if (!copyOnWriteArrayList2.isEmpty()) {
                    this.z = new a.C3938a(copyOnWriteArrayList2.size());
                }
                int size = copyOnWriteArrayList2.size();
                long j2 = this.l;
                if (size == 1 && arrayList4.size() == 1) {
                    z = isEmpty;
                } else {
                    z = isEmpty;
                    j2 += copyOnWriteArrayList2.size() * j;
                    long j3 = this.d;
                    if (j2 < j3) {
                        j2 = j3;
                    }
                }
                Iterator<hla> it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    hla next2 = it5.next();
                    fla flaVar = next2.p;
                    this.v.add(next2);
                    Iterator<d> it6 = copyOnWriteArrayList2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            it = it5;
                            dVar = r17;
                            break;
                        } else {
                            dVar = it6.next();
                            it = it5;
                            if (epx.f(dVar.a, next2)) {
                                break;
                            } else {
                                it5 = it;
                            }
                        }
                    }
                    d dVar2 = dVar;
                    if (dVar2 == null) {
                        arrayList = arrayList5;
                        z2 = isEmpty2;
                        long j4 = this.d;
                        flaVar.getClass();
                        long j5 = j4 / 4;
                        arrayList2 = arrayList6;
                        z3 = isEmpty3;
                        long j6 = 2 * j5;
                        arrayList3 = arrayList7;
                        View view = flaVar.a;
                        z4 = isEmpty4;
                        Property property = View.SCALE_X;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 1.2f);
                        ofFloat.setDuration(j5);
                        Property property2 = View.SCALE_Y;
                        z5 = z;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 1.2f);
                        ofFloat2.setDuration(j5);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        ofFloat3.setDuration(j6);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        ofFloat4.setDuration(j6);
                        VkText vkText = flaVar.b;
                        Property property3 = View.ALPHA;
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(vkText, (Property<VkText, Float>) property3, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        ofFloat5.setDuration(j6);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(flaVar.c, (Property<VkText, Float>) property3, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        ofFloat6.setDuration(j5);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(ofFloat, ofFloat2);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        animatorSet3.playTogether(ofFloat3, ofFloat4, ofFloat5);
                        animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(ofFloat6, animatorSet2, animatorSet3);
                    } else {
                        arrayList = arrayList5;
                        z2 = isEmpty2;
                        arrayList2 = arrayList6;
                        z3 = isEmpty3;
                        arrayList3 = arrayList7;
                        z4 = isEmpty4;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        z5 = z;
                        long j7 = this.d / 4;
                        long j8 = dVar2.b;
                        VkText vkText2 = flaVar.c;
                        Property property4 = View.ALPHA;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(vkText2, (Property<VkText, Float>) property4, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        ofFloat7.setDuration(j7);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(vkText2, (Property<VkText, Float>) property4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        ofFloat8.setDuration(j8);
                        animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(ofFloat7, ofFloat8);
                    }
                    animatorSet.setInterpolator(B);
                    animatorSet.addListener(new bla(next2, this, dVar2));
                    animatorSet.start();
                    arrayList5 = arrayList;
                    it5 = it;
                    isEmpty2 = z2;
                    arrayList6 = arrayList2;
                    isEmpty3 = z3;
                    arrayList7 = arrayList3;
                    isEmpty4 = z4;
                    copyOnWriteArrayList2 = copyOnWriteArrayList;
                    z = z5;
                }
                ArrayList<c> arrayList9 = arrayList5;
                boolean z6 = isEmpty2;
                ArrayList<b> arrayList10 = arrayList6;
                boolean z7 = isEmpty3;
                ArrayList<hla> arrayList11 = arrayList7;
                boolean z8 = isEmpty4;
                boolean z9 = z;
                arrayList4.clear();
                if (!z6) {
                    ArrayList<c> c2 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList9);
                    this.r.add(c2);
                    arrayList9.clear();
                    te9 te9Var = new te9(1, c2, this);
                    if (z9) {
                        te9Var.run();
                    } else {
                        View view2 = c2.get(0).a.itemView;
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        view2.postOnAnimationDelayed(te9Var, j2);
                    }
                }
                if (!z7) {
                    ArrayList<b> c3 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList10);
                    this.s.add(c3);
                    arrayList10.clear();
                    gq4 gq4Var = new gq4(2, c3, this);
                    if (z9) {
                        gq4Var.run();
                    } else {
                        View view3 = c3.get(0).a.itemView;
                        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                        view3.postOnAnimationDelayed(gq4Var, j2);
                    }
                }
                if (!z8) {
                    ArrayList<hla> c4 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList11);
                    this.q.add(c4);
                    arrayList11.clear();
                    ew4 ew4Var = new ew4(2, c4, this);
                    if (z9 && z6 && z7) {
                        ew4Var.run();
                    } else {
                        if (z9) {
                            j2 = 0;
                        }
                        long max = Math.max(!z6 ? this.e : 0L, z7 ? 0L : this.f) + j2;
                        View view4 = c4.get(0).itemView;
                        WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                        view4.postOnAnimationDelayed(ew4Var, max);
                    }
                }
                vr2 vr2Var2 = this.A;
                if (vr2Var2 != null) {
                    pkn0Var.execute(vr2Var2);
                }
                this.A = r17;
                return;
            }
            Object next3 = it4.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw r17;
            }
            copyOnWriteArrayList2.add(new d((hla) next3, i * j, this.l));
            hashSet = hashSet;
            obj = r17;
            it3 = it4;
            i = i2;
        }
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean w(RecyclerView.e0 e0Var) {
        boolean z = e0Var instanceof hla;
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        j(e0Var);
        hla hlaVar = z ? (hla) e0Var : null;
        if (hlaVar != null) {
            fla flaVar = hlaVar.p;
            VkText vkText = flaVar.b;
            vkText.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            vkText.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            vkText.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            flaVar.c.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.n.add(e0Var);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // androidx.recyclerview.widget.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4) {
        boolean z;
        if (e0Var instanceof hla) {
            if (e0Var2 == null ? true : e0Var2 instanceof hla) {
                z = true;
                if (z) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (e0Var == e0Var2) {
                    return y(e0Var, i, i2, i3, i4);
                }
                float translationX = e0Var.itemView.getTranslationX();
                float translationY = e0Var.itemView.getTranslationY();
                float alpha = e0Var.itemView.getAlpha();
                j(e0Var);
                int i5 = (int) ((i3 - i) - translationX);
                int i6 = (int) ((i4 - i2) - translationY);
                e0Var.itemView.setTranslationX(translationX);
                e0Var.itemView.setTranslationY(translationY);
                e0Var.itemView.setAlpha(alpha);
                if (e0Var2 != null) {
                    j(e0Var2);
                    hla hlaVar = (hla) e0Var2;
                    hlaVar.itemView.setTranslationX(-i5);
                    hlaVar.itemView.setTranslationY(-i6);
                    hlaVar.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                this.p.add(new b((hla) e0Var, (hla) e0Var2, i, i2, i3, i4));
                return true;
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean y(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
        if (!(e0Var instanceof hla)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        View view = e0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) e0Var.itemView.getTranslationY());
        j(e0Var);
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
        this.o.add(new c((hla) e0Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean z(RecyclerView.e0 e0Var) {
        if (!(e0Var instanceof hla)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        j(e0Var);
        this.m.add(e0Var);
        return true;
    }
}
