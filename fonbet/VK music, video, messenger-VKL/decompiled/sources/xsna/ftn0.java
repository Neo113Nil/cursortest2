package xsna;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: TabRecyclerItemAnimator.kt */
/* loaded from: classes6.dex */
public final class ftn0 extends androidx.recyclerview.widget.g {
    public static TimeInterpolator E;
    public final ArrayList<RecyclerView.e0> A;
    public final ArrayList<RecyclerView.e0> B;
    public final ArrayList<RecyclerView.e0> C;
    public final ArrayList<RecyclerView.e0> D;
    public final ArrayList<RecyclerView.e0> t;
    public final ArrayList<RecyclerView.e0> u;
    public final ArrayList<b> v;
    public final ArrayList<a> w;
    public final ArrayList<ArrayList<RecyclerView.e0>> x;
    public final ArrayList<ArrayList<b>> y;
    public final ArrayList<ArrayList<a>> z;

    /* compiled from: TabRecyclerItemAnimator.kt */
    public static final class a {
        public RecyclerView.e0 a;
        public RecyclerView.e0 b;
        public int c;
        public int d;
        public int e;
        public int f;

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.a);
            sb.append(", newHolder=");
            sb.append(this.b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.e);
            sb.append(", toY=");
            return vu5.b(sb, this.f, '}');
        }
    }

    /* compiled from: TabRecyclerItemAnimator.kt */
    public static final class b {
        public RecyclerView.e0 a;
        public int b;
        public int c;
        public int d;
        public int e;
    }

    public ftn0() {
        this.c = 200L;
        this.d = 200L;
        this.f = 200L;
        this.e = 200L;
        this.t = new ArrayList<>();
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        this.w = new ArrayList<>();
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
        this.z = new ArrayList<>();
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
    }

    public static void H(ArrayList arrayList) {
        View view;
        ViewPropertyAnimator animate;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            RecyclerView.e0 e0Var = (RecyclerView.e0) arrayList.get(size);
            if (e0Var != null && (view = e0Var.itemView) != null && (animate = view.animate()) != null) {
                animate.cancel();
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final void I() {
        if (n()) {
            return;
        }
        i();
    }

    public final void J(ArrayList arrayList, RecyclerView.e0 e0Var) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            a aVar = (a) arrayList.get(size);
            if (K(aVar, e0Var) && aVar.a == null && aVar.b == null) {
                arrayList.remove(aVar);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean K(a aVar, RecyclerView.e0 e0Var) {
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
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        e0Var.itemView.animate().setInterpolator(E);
        j(e0Var);
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.l
    public final void j(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        view.animate().cancel();
        ArrayList<b> arrayList = this.v;
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
        J(this.w, e0Var);
        if (this.t.remove(e0Var)) {
            view.setAlpha(1.0f);
            A(e0Var);
        }
        if (this.u.remove(e0Var)) {
            view.setAlpha(1.0f);
            h(e0Var);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.z;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                ArrayList<a> arrayList3 = arrayList2.get(size2);
                J(arrayList3, e0Var);
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
        ArrayList<ArrayList<b>> arrayList4 = this.y;
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
        ArrayList<ArrayList<RecyclerView.e0>> arrayList6 = this.x;
        int size5 = arrayList6.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                ArrayList<RecyclerView.e0> arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(e0Var)) {
                    view.setAlpha(1.0f);
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
        this.C.remove(e0Var);
        this.A.remove(e0Var);
        this.D.remove(e0Var);
        this.B.remove(e0Var);
        I();
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.l
    public final void k() {
        ArrayList<b> arrayList = this.v;
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
        ArrayList<RecyclerView.e0> arrayList2 = this.t;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            A(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.e0> arrayList3 = this.u;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (-1 >= size3) {
                break;
            }
            RecyclerView.e0 e0Var2 = arrayList3.get(size3);
            e0Var2.itemView.setAlpha(1.0f);
            h(e0Var2);
            arrayList3.remove(size3);
        }
        ArrayList<a> arrayList4 = this.w;
        for (int size4 = arrayList4.size() - 1; -1 < size4; size4--) {
            a aVar = arrayList4.get(size4);
            RecyclerView.e0 e0Var3 = aVar.a;
            if (e0Var3 != null) {
                K(aVar, e0Var3);
            }
            RecyclerView.e0 e0Var4 = aVar.b;
            if (e0Var4 != null) {
                K(aVar, e0Var4);
            }
        }
        arrayList4.clear();
        if (n()) {
            ArrayList<ArrayList<b>> arrayList5 = this.y;
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
            ArrayList<ArrayList<RecyclerView.e0>> arrayList7 = this.x;
            for (int size7 = arrayList7.size() - 1; -1 < size7; size7--) {
                ArrayList<RecyclerView.e0> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; -1 < size8; size8--) {
                    RecyclerView.e0 e0Var6 = arrayList8.get(size8);
                    e0Var6.itemView.setAlpha(1.0f);
                    h(e0Var6);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<a>> arrayList9 = this.z;
            for (int size9 = arrayList9.size() - 1; -1 < size9; size9--) {
                ArrayList<a> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; -1 < size10; size10--) {
                    a aVar2 = arrayList10.get(size10);
                    RecyclerView.e0 e0Var7 = aVar2.a;
                    if (e0Var7 != null) {
                        K(aVar2, e0Var7);
                    }
                    RecyclerView.e0 e0Var8 = aVar2.b;
                    if (e0Var8 != null) {
                        K(aVar2, e0Var8);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            H(this.C);
            H(this.B);
            H(this.A);
            H(this.D);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.l
    public final boolean n() {
        return (this.u.isEmpty() && this.w.isEmpty() && this.v.isEmpty() && this.t.isEmpty() && this.B.isEmpty() && this.C.isEmpty() && this.A.isEmpty() && this.D.isEmpty() && this.y.isEmpty() && this.x.isEmpty() && this.z.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.l
    public final void r() {
        ArrayList<RecyclerView.e0> arrayList = this.t;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList<b> arrayList2 = this.v;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList<a> arrayList3 = this.w;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList<RecyclerView.e0> arrayList4 = this.u;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        if (!isEmpty) {
            Iterator<RecyclerView.e0> it = arrayList.iterator();
            while (it.hasNext()) {
                RecyclerView.e0 next = it.next();
                View view = next.itemView;
                ViewPropertyAnimator animate = view.animate();
                this.C.add(next);
                animate.setDuration(this.d).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new ktn0(view, animate, next, this)).start();
            }
            arrayList.clear();
        }
        int i = 9;
        if (!isEmpty2) {
            ArrayList<b> c = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList2);
            this.y.add(c);
            arrayList2.clear();
            xq8 xq8Var = new xq8(i, c, this);
            if (isEmpty) {
                xq8Var.run();
            } else {
                View view2 = c.get(0).a.itemView;
                long j = this.d;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view2.postOnAnimationDelayed(xq8Var, j);
            }
        }
        if (!isEmpty3) {
            ArrayList<a> c2 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList3);
            this.z.add(c2);
            arrayList3.clear();
            zs6 zs6Var = new zs6(7, c2, this);
            if (isEmpty2 || isEmpty) {
                zs6Var.run();
            } else {
                View view3 = c2.get(0).a.itemView;
                long j2 = this.d;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                view3.postOnAnimationDelayed(zs6Var, j2);
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList<RecyclerView.e0> c3 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList4);
        this.x.add(c3);
        arrayList4.clear();
        at6 at6Var = new at6(i, c3, this);
        if (isEmpty2 || (isEmpty && isEmpty2 && isEmpty3)) {
            at6Var.run();
            return;
        }
        long max = Math.max(!isEmpty2 ? this.e : 0L, isEmpty3 ? 0L : this.f) + (!isEmpty ? this.d : 0L);
        View view4 = c3.get(0).itemView;
        WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
        view4.postOnAnimationDelayed(at6Var, max);
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
    public final boolean w(RecyclerView.e0 e0Var) {
        L(e0Var);
        e0Var.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.u.add(e0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
    @SuppressLint({"UnknownNullness"})
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
            e0Var2.itemView.setTranslationX(-i5);
            e0Var2.itemView.setTranslationY(-i6);
            e0Var2.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        a aVar = new a();
        aVar.a = e0Var;
        aVar.b = e0Var2;
        aVar.c = i;
        aVar.d = i2;
        aVar.e = i3;
        aVar.f = i4;
        this.w.add(aVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
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
        b bVar = new b();
        bVar.a = e0Var;
        bVar.b = translationX;
        bVar.c = translationY;
        bVar.d = i3;
        bVar.e = i4;
        this.v.add(bVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
    public final boolean z(RecyclerView.e0 e0Var) {
        L(e0Var);
        this.t.add(e0Var);
        return true;
    }
}
