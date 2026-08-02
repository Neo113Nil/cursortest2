package xsna;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: ReactionsItemAnimator.kt */
/* loaded from: classes2.dex */
public final class n5f0 extends androidx.recyclerview.widget.n0 {
    public static TimeInterpolator r;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();

    /* compiled from: ReactionsItemAnimator.kt */
    public static final class a {
        public RecyclerView.e0 a;
        public RecyclerView.e0 b;
    }

    /* compiled from: ReactionsItemAnimator.kt */
    public static final class b {
        public RecyclerView.e0 a;
        public int b;
        public int c;
        public int d;
        public int e;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoveInfo(holder=");
            sb.append(this.a);
            sb.append(", fromX=");
            sb.append(this.b);
            sb.append(", fromY=");
            sb.append(this.c);
            sb.append(", toX=");
            sb.append(this.d);
            sb.append(", toY=");
            return vu5.b(sb, this.e, ')');
        }
    }

    public static void C(ArrayList arrayList) {
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

    public final void D(RecyclerView.e0 e0Var, List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            a aVar = (a) list.get(size);
            if (E(aVar, e0Var) && aVar.a == null && aVar.b == null) {
                list.remove(aVar);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean E(a aVar, RecyclerView.e0 e0Var) {
        if (aVar.b == e0Var) {
            aVar.b = null;
        } else {
            if (aVar.a != e0Var) {
                return false;
            }
            aVar.a = null;
        }
        View view = e0Var.itemView;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        e0Var.itemView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        e0Var.itemView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        h(e0Var);
        return true;
    }

    public final void F(RecyclerView.e0 e0Var) {
        if (r == null) {
            r = new ValueAnimator().getInterpolator();
        }
        e0Var.itemView.animate().setInterpolator(r);
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
        View view2 = e0Var.itemView;
        ArrayList arrayList = this.j;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((b) arrayList.get(size)).a == e0Var) {
                    view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
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
        D(e0Var, this.k);
        if (this.h.remove(e0Var)) {
            View view3 = e0Var.itemView;
            view3.setScaleX(1.0f);
            view3.setScaleY(1.0f);
            A(e0Var);
        }
        if (this.i.remove(e0Var)) {
            View view4 = e0Var.itemView;
            view4.setScaleX(1.0f);
            view4.setScaleY(1.0f);
            h(e0Var);
        }
        ArrayList arrayList2 = this.n;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                List list = (List) arrayList2.get(size2);
                D(e0Var, list);
                if (list.isEmpty()) {
                    arrayList2.remove(size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        ArrayList arrayList3 = this.m;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                List list2 = (List) arrayList3.get(size3);
                int size4 = list2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        if (((b) list2.get(size4)).a == e0Var) {
                            View view5 = e0Var.itemView;
                            view5.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            view5.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            h(e0Var);
                            list2.remove(size4);
                            if (list2.isEmpty()) {
                                arrayList3.remove(size3);
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
        ArrayList arrayList4 = this.l;
        int size5 = arrayList4.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                List list3 = (List) arrayList4.get(size5);
                if (list3.remove(e0Var)) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    h(e0Var);
                    if (list3.isEmpty()) {
                        arrayList4.remove(size5);
                    }
                }
                if (i5 < 0) {
                    break;
                } else {
                    size5 = i5;
                }
            }
        }
        if (n()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void k() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            b bVar = (b) arrayList.get(size);
            View view = bVar.a.itemView;
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            h(bVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            A((RecyclerView.e0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (-1 >= size3) {
                break;
            }
            RecyclerView.e0 e0Var = (RecyclerView.e0) arrayList3.get(size3);
            View view2 = e0Var.itemView;
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            h(e0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; -1 < size4; size4--) {
            a aVar = (a) arrayList4.get(size4);
            RecyclerView.e0 e0Var2 = aVar.a;
            if (e0Var2 != null) {
                E(aVar, e0Var2);
            }
            RecyclerView.e0 e0Var3 = aVar.b;
            if (e0Var3 != null) {
                E(aVar, e0Var3);
            }
        }
        arrayList4.clear();
        if (n()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; -1 < size5; size5--) {
                List list = (List) arrayList5.get(size5);
                for (int size6 = list.size() - 1; -1 < size6; size6--) {
                    b bVar2 = (b) list.get(size6);
                    View view3 = bVar2.a.itemView;
                    view3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view3.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    h(bVar2.a);
                    list.remove(size6);
                    if (list.isEmpty()) {
                        arrayList5.remove(list);
                    }
                }
            }
            ArrayList arrayList6 = this.l;
            for (int size7 = arrayList6.size() - 1; -1 < size7; size7--) {
                List list2 = (List) arrayList6.get(size7);
                for (int size8 = list2.size() - 1; -1 < size8; size8--) {
                    RecyclerView.e0 e0Var4 = (RecyclerView.e0) list2.get(size8);
                    View view4 = e0Var4.itemView;
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                    h(e0Var4);
                    list2.remove(size8);
                    if (list2.isEmpty()) {
                        arrayList6.remove(list2);
                    }
                }
            }
            ArrayList arrayList7 = this.n;
            for (int size9 = arrayList7.size() - 1; -1 < size9; size9--) {
                List list3 = (List) arrayList7.get(size9);
                for (int size10 = list3.size() - 1; -1 < size10; size10--) {
                    a aVar2 = (a) list3.get(size10);
                    RecyclerView.e0 e0Var5 = aVar2.a;
                    if (e0Var5 != null) {
                        E(aVar2, e0Var5);
                    }
                    RecyclerView.e0 e0Var6 = aVar2.b;
                    if (e0Var6 != null) {
                        E(aVar2, e0Var6);
                    }
                    if (list3.isEmpty()) {
                        arrayList7.remove(list3);
                    }
                }
            }
            C(this.q);
            C(this.p);
            C(this.o);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean n() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void r() {
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.j;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.k;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.i;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            RecyclerView.e0 e0Var = (RecyclerView.e0) it.next();
            View view = e0Var.itemView;
            ViewPropertyAnimator animate = view.animate();
            this.q.add(e0Var);
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            animate.setDuration(200L).scaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new q5f0(view, animate, e0Var, this)).start();
        }
        arrayList.clear();
        if (!isEmpty2) {
            ArrayList c = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList2);
            this.m.add(c);
            arrayList2.clear();
            f0 f0Var = new f0(5, c, this);
            if (isEmpty) {
                f0Var.run();
            } else {
                View view2 = ((b) c.get(0)).a.itemView;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view2.postOnAnimationDelayed(f0Var, 200L);
            }
        }
        if (!isEmpty3) {
            ArrayList c2 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList3);
            this.n.add(c2);
            arrayList3.clear();
            e0 e0Var2 = new e0(7, c2, this);
            if (isEmpty) {
                e0Var2.run();
            } else {
                View view3 = ((a) c2.get(0)).a.itemView;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                view3.postOnAnimationDelayed(e0Var2, 200L);
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList c3 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList4);
        this.l.add(c3);
        arrayList4.clear();
        u69 u69Var = new u69(4, c3, this);
        if (isEmpty && isEmpty2 && isEmpty3) {
            u69Var.run();
            return;
        }
        long j = isEmpty ? 0L : 200L;
        long j2 = !isEmpty2 ? this.e : 0L;
        long j3 = isEmpty3 ? 0L : this.f;
        if (j2 < j3) {
            j2 = j3;
        }
        View view4 = ((RecyclerView.e0) c3.get(0)).itemView;
        WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
        view4.postOnAnimationDelayed(u69Var, j + j2);
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean w(RecyclerView.e0 e0Var) {
        F(e0Var);
        View view = e0Var.itemView;
        view.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
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
        float scaleX = e0Var.itemView.getScaleX();
        F(e0Var);
        int i5 = (int) ((i3 - i) - translationX);
        e0Var.itemView.setTranslationX(translationX);
        e0Var.itemView.setTranslationY(translationY);
        View view = e0Var.itemView;
        view.setScaleX(scaleX);
        view.setScaleY(scaleX);
        F(e0Var2);
        e0Var2.itemView.setTranslationX(-i5);
        e0Var2.itemView.setTranslationY(-((int) ((i4 - i2) - translationY)));
        View view2 = e0Var2.itemView;
        view2.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view2.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a aVar = new a();
        aVar.a = e0Var;
        aVar.b = e0Var2;
        this.k.add(aVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean y(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
        View view = e0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) e0Var.itemView.getTranslationY());
        F(e0Var);
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
        b bVar = new b();
        bVar.a = e0Var;
        bVar.b = translationX;
        bVar.c = translationY;
        bVar.d = i3;
        bVar.e = i4;
        this.j.add(bVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean z(RecyclerView.e0 e0Var) {
        F(e0Var);
        this.h.add(e0Var);
        return true;
    }
}
