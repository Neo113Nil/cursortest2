package xsna;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.common.recycler.animators.ItemAnimationType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FeedCarouselItemAnimator.kt */
/* loaded from: classes4.dex */
public final class jxq extends androidx.recyclerview.widget.n0 {
    public final nbf0 h;
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final Object u;
    public final Object v;

    /* compiled from: FeedCarouselItemAnimator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ItemAnimationType.values().length];
            try {
                iArr[ItemAnimationType.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemAnimationType.Change.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ItemAnimationType.Move.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ItemAnimationType.Remove.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public jxq(nbf0 nbf0Var) {
        this.h = nbf0Var;
        vv0 vv0Var = new vv0(17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.u = msy.a(lazyThreadSafetyMode, vv0Var);
        this.v = msy.a(lazyThreadSafetyMode, new zqf(this, 21));
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

    @Override // androidx.recyclerview.widget.n0
    public final void B(RecyclerView.e0 e0Var) {
        gzs<s3q0> gzsVar = this.h.c;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    public final void D() {
        if (n()) {
            return;
        }
        i();
    }

    public final void E(RecyclerView.e0 e0Var, List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            bsa bsaVar = (bsa) list.get(size);
            if (F(bsaVar, e0Var) && bsaVar.a == null && bsaVar.b == null) {
                list.remove(bsaVar);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean F(bsa bsaVar, RecyclerView.e0 e0Var) {
        if (bsaVar.b == e0Var) {
            bsaVar.b = null;
        } else {
            if (bsaVar.a != e0Var) {
                return false;
            }
            bsaVar.a = null;
        }
        e0Var.itemView.setAlpha(1.0f);
        e0Var.itemView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        e0Var.itemView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        h(e0Var);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void G(RecyclerView.e0 e0Var) {
        e0Var.itemView.animate().setInterpolator((TimeInterpolator) this.u.getValue());
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
        ArrayList arrayList = this.k;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((oc30) arrayList.get(size)).a == e0Var) {
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
        E(e0Var, this.l);
        if (this.i.remove(e0Var)) {
            view.setAlpha(1.0f);
            A(e0Var);
        }
        if (this.j.remove(e0Var)) {
            view.setAlpha(1.0f);
            h(e0Var);
        }
        ArrayList arrayList2 = this.p;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                List list = (List) arrayList2.get(size2);
                E(e0Var, list);
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
        ArrayList arrayList3 = this.o;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                List list2 = (List) arrayList3.get(size3);
                int size4 = list2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        if (((oc30) list2.get(size4)).a == e0Var) {
                            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
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
        ArrayList arrayList4 = this.n;
        int size5 = arrayList4.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                List list3 = (List) arrayList4.get(size5);
                if (list3.remove(e0Var)) {
                    view.setAlpha(1.0f);
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
        ArrayList arrayList5 = this.m;
        int size6 = arrayList5.size() - 1;
        if (size6 >= 0) {
            while (true) {
                int i6 = size6 - 1;
                List list4 = (List) arrayList5.get(size6);
                if (list4.remove(e0Var)) {
                    view.setAlpha(1.0f);
                    h(e0Var);
                    if (list4.isEmpty()) {
                        arrayList5.remove(size6);
                    }
                }
                if (i6 < 0) {
                    break;
                } else {
                    size6 = i6;
                }
            }
        }
        D();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            oc30 oc30Var = (oc30) arrayList.get(size);
            View view = oc30Var.a.itemView;
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            h(oc30Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.i;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            A((RecyclerView.e0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.j;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (-1 >= size3) {
                break;
            }
            RecyclerView.e0 e0Var = (RecyclerView.e0) arrayList3.get(size3);
            e0Var.itemView.setAlpha(1.0f);
            h(e0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.l;
        for (int size4 = arrayList4.size() - 1; -1 < size4; size4--) {
            bsa bsaVar = (bsa) arrayList4.get(size4);
            RecyclerView.e0 e0Var2 = bsaVar.a;
            if (e0Var2 != null) {
                F(bsaVar, e0Var2);
            }
            RecyclerView.e0 e0Var3 = bsaVar.b;
            if (e0Var3 != null) {
                F(bsaVar, e0Var3);
            }
        }
        arrayList4.clear();
        if (n()) {
            ArrayList arrayList5 = this.o;
            for (int size5 = arrayList5.size() - 1; -1 < size5; size5--) {
                List list = (List) arrayList5.get(size5);
                for (int size6 = list.size() - 1; -1 < size6; size6--) {
                    oc30 oc30Var2 = (oc30) list.get(size6);
                    View view2 = oc30Var2.a.itemView;
                    view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    h(oc30Var2.a);
                    list.remove(size6);
                    if (list.isEmpty()) {
                        arrayList5.remove(list);
                    }
                }
            }
            ArrayList arrayList6 = this.n;
            for (int size7 = arrayList6.size() - 1; -1 < size7; size7--) {
                List list2 = (List) arrayList6.get(size7);
                for (int size8 = list2.size() - 1; -1 < size8; size8--) {
                    RecyclerView.e0 e0Var4 = (RecyclerView.e0) list2.get(size8);
                    e0Var4.itemView.setAlpha(1.0f);
                    h(e0Var4);
                    list2.remove(size8);
                    if (list2.isEmpty()) {
                        arrayList6.remove(list2);
                    }
                }
            }
            ArrayList arrayList7 = this.p;
            for (int size9 = arrayList7.size() - 1; -1 < size9; size9--) {
                List list3 = (List) arrayList7.get(size9);
                for (int size10 = list3.size() - 1; -1 < size10; size10--) {
                    bsa bsaVar2 = (bsa) list3.get(size10);
                    RecyclerView.e0 e0Var5 = bsaVar2.a;
                    if (e0Var5 != null) {
                        F(bsaVar2, e0Var5);
                    }
                    RecyclerView.e0 e0Var6 = bsaVar2.b;
                    if (e0Var6 != null) {
                        F(bsaVar2, e0Var6);
                    }
                    if (list3.isEmpty()) {
                        arrayList7.remove(list3);
                    }
                }
            }
            ArrayList arrayList8 = this.m;
            for (int size11 = arrayList8.size() - 1; -1 < size11; size11--) {
                List list4 = (List) arrayList8.get(size11);
                for (int size12 = list4.size() - 1; -1 < size12; size12--) {
                    RecyclerView.e0 e0Var7 = (RecyclerView.e0) list4.get(size12);
                    e0Var7.itemView.setAlpha(1.0f);
                    A(e0Var7);
                    list4.remove(size12);
                    if (list4.isEmpty()) {
                        arrayList8.remove(list4);
                    }
                }
            }
            C(this.s);
            C(this.r);
            C(this.q);
            C(this.t);
            i();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final long l() {
        aux auxVar = (aux) ((Map) this.v.getValue()).get(ItemAnimationType.Move);
        return auxVar != null ? auxVar.a : this.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final long m() {
        aux auxVar = (aux) ((Map) this.v.getValue()).get(ItemAnimationType.Remove);
        return auxVar != null ? auxVar.a : this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean n() {
        return (this.j.isEmpty() && this.l.isEmpty() && this.k.isEmpty() && this.i.isEmpty() && this.r.isEmpty() && this.s.isEmpty() && this.q.isEmpty() && this.t.isEmpty() && this.o.isEmpty() && this.n.isEmpty() && this.m.isEmpty() && this.p.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void r() {
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2 = this.i;
        boolean isEmpty = arrayList2.isEmpty();
        boolean z2 = !isEmpty;
        ArrayList arrayList3 = this.k;
        boolean isEmpty2 = arrayList3.isEmpty();
        boolean z3 = !isEmpty2;
        ArrayList arrayList4 = this.l;
        boolean isEmpty3 = arrayList4.isEmpty();
        boolean z4 = !isEmpty3;
        ArrayList arrayList5 = this.j;
        boolean isEmpty4 = arrayList5.isEmpty();
        boolean z5 = !isEmpty4;
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        nbf0 nbf0Var = this.h;
        Iterator<List<aux>> it = nbf0Var.b.iterator();
        while (it.hasNext()) {
            for (aux auxVar : it.next()) {
                ArrayList arrayList6 = arrayList2;
                boolean z6 = isEmpty;
                Iterator<List<aux>> it2 = nbf0Var.b.iterator();
                boolean z7 = z2;
                long j = 0;
                while (true) {
                    arrayList = arrayList3;
                    if (!it2.hasNext()) {
                        break;
                    }
                    List<aux> next = it2.next();
                    if (next.contains(auxVar)) {
                        break;
                    }
                    boolean z8 = isEmpty2;
                    long j2 = 0;
                    for (aux auxVar2 : next) {
                        boolean z9 = z3;
                        ArrayList arrayList7 = arrayList4;
                        int i = a.$EnumSwitchMapping$0[auxVar2.b.ordinal()];
                        boolean z10 = isEmpty3;
                        if (i == 1) {
                            z = z5;
                        } else if (i == 2) {
                            z = z4;
                        } else if (i == 3) {
                            z = z9;
                        } else {
                            if (i != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = z7;
                        }
                        if (z) {
                            j2 = Math.max(auxVar2.a, j2);
                        }
                        arrayList4 = arrayList7;
                        z3 = z9;
                        isEmpty3 = z10;
                    }
                    j += j2;
                    isEmpty2 = z8;
                    arrayList3 = arrayList;
                }
                boolean z11 = isEmpty2;
                boolean z12 = z3;
                ArrayList arrayList8 = arrayList4;
                boolean z13 = isEmpty3;
                ItemAnimationType itemAnimationType = auxVar.b;
                if (itemAnimationType == ItemAnimationType.Add && !isEmpty4) {
                    ArrayList c = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList5);
                    this.n.add(c);
                    arrayList5.clear();
                    h12 h12Var = new h12(3, c, this);
                    if (j > 0) {
                        View view = ((RecyclerView.e0) c.get(0)).itemView;
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        view.postOnAnimationDelayed(h12Var, j);
                    } else {
                        h12Var.run();
                    }
                } else if (itemAnimationType == ItemAnimationType.Change && !z13) {
                    ArrayList c2 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList8);
                    this.p.add(c2);
                    arrayList8.clear();
                    h0 h0Var = new h0(2, c2, this);
                    if (j > 0) {
                        View view2 = ((bsa) c2.get(0)).a.itemView;
                        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                        view2.postOnAnimationDelayed(h0Var, j);
                    } else {
                        h0Var.run();
                    }
                } else if (itemAnimationType == ItemAnimationType.Move && !z11) {
                    ArrayList c3 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList);
                    this.o.add(c3);
                    arrayList.clear();
                    si0 si0Var = new si0(3, c3, this);
                    if (j > 0) {
                        View view3 = ((oc30) c3.get(0)).a.itemView;
                        WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                        view3.postOnAnimationDelayed(si0Var, j);
                    } else {
                        si0Var.run();
                    }
                } else if (itemAnimationType == ItemAnimationType.Remove && !z6) {
                    ArrayList c4 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList6);
                    this.m.add(c4);
                    arrayList6.clear();
                    i0 i0Var = new i0(4, c4, this);
                    if (j > 0) {
                        View view4 = ((RecyclerView.e0) c4.get(0)).itemView;
                        WeakHashMap<View, b0u0> weakHashMap4 = iut0.a;
                        view4.postOnAnimationDelayed(i0Var, j);
                    } else {
                        i0Var.run();
                    }
                }
                isEmpty = z6;
                arrayList2 = arrayList6;
                z2 = z7;
                isEmpty2 = z11;
                arrayList3 = arrayList;
                arrayList4 = arrayList8;
                z3 = z12;
                isEmpty3 = z13;
            }
        }
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean w(RecyclerView.e0 e0Var) {
        G(e0Var);
        e0Var.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.j.add(e0Var);
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
        G(e0Var);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        e0Var.itemView.setTranslationX(translationX);
        e0Var.itemView.setTranslationY(translationY);
        e0Var.itemView.setAlpha(alpha);
        if (e0Var2 != null) {
            G(e0Var2);
            e0Var2.itemView.setTranslationX(-i5);
            e0Var2.itemView.setTranslationY(-i6);
            e0Var2.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.l.add(new bsa(e0Var, e0Var2, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean y(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
        View view = e0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) e0Var.itemView.getTranslationY());
        G(e0Var);
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
        this.k.add(new oc30(e0Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean z(RecyclerView.e0 e0Var) {
        G(e0Var);
        this.i.add(e0Var);
        return true;
    }
}
