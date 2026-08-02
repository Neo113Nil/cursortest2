package xsna;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MarketFilterItemAnimator.kt */
/* loaded from: classes18.dex */
public final class wy00 extends fp2 {
    public static final AccelerateDecelerateInterpolator t = new AccelerateDecelerateInterpolator();
    public final ArrayList<RecyclerView.e0> i;
    public final ArrayList<RecyclerView.e0> j;
    public final ArrayList<b> k;
    public final ArrayList<a> l;
    public final ArrayList<ArrayList<RecyclerView.e0>> m;
    public final ArrayList<ArrayList<b>> n;
    public final ArrayList<ArrayList<a>> o;
    public final ArrayList<RecyclerView.e0> p;
    public final ArrayList<RecyclerView.e0> q;
    public final ArrayList<RecyclerView.e0> r;
    public final ArrayList<RecyclerView.e0> s;

    /* compiled from: MarketFilterItemAnimator.kt */
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

    /* compiled from: MarketFilterItemAnimator.kt */
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

    public wy00(krh krhVar) {
        super(krhVar);
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.m = new ArrayList<>();
        this.n = new ArrayList<>();
        this.o = new ArrayList<>();
        this.p = new ArrayList<>();
        this.q = new ArrayList<>();
        this.r = new ArrayList<>();
        this.s = new ArrayList<>();
    }

    public final void C(ArrayList arrayList) {
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
            a aVar = (a) arrayList.get(size);
            if (F(aVar, e0Var) && aVar.a == null && aVar.b == null) {
                arrayList.remove(aVar);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean F(a aVar, RecyclerView.e0 e0Var) {
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

    public final void G(RecyclerView.e0 e0Var) {
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
        ArrayList<b> arrayList = this.k;
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
        E(this.l, e0Var);
        if (this.i.remove(e0Var)) {
            view.setAlpha(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            A(e0Var);
        }
        if (this.j.remove(e0Var)) {
            view.setAlpha(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            h(e0Var);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.o;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                ArrayList<a> arrayList3 = arrayList2.get(size2);
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
        ArrayList<ArrayList<b>> arrayList4 = this.n;
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
        ArrayList<ArrayList<RecyclerView.e0>> arrayList6 = this.m;
        int size5 = arrayList6.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                ArrayList<RecyclerView.e0> arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(e0Var)) {
                    view.setAlpha(1.0f);
                    view.setScaleY(1.0f);
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
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
        this.r.remove(e0Var);
        this.p.remove(e0Var);
        this.s.remove(e0Var);
        this.q.remove(e0Var);
        D();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void k() {
        ArrayList<b> arrayList = this.k;
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
        ArrayList<RecyclerView.e0> arrayList2 = this.i;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            A(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.e0> arrayList3 = this.j;
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
        ArrayList<a> arrayList4 = this.l;
        for (int size4 = arrayList4.size() - 1; -1 < size4; size4--) {
            a aVar = arrayList4.get(size4);
            RecyclerView.e0 e0Var3 = aVar.a;
            if (e0Var3 != null) {
                F(aVar, e0Var3);
            }
            RecyclerView.e0 e0Var4 = aVar.b;
            if (e0Var4 != null) {
                F(aVar, e0Var4);
            }
        }
        arrayList4.clear();
        if (n()) {
            ArrayList<ArrayList<b>> arrayList5 = this.n;
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
            ArrayList<ArrayList<RecyclerView.e0>> arrayList7 = this.m;
            for (int size7 = arrayList7.size() - 1; -1 < size7; size7--) {
                ArrayList<RecyclerView.e0> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; -1 < size8; size8--) {
                    RecyclerView.e0 e0Var6 = arrayList8.get(size8);
                    View view3 = e0Var6.itemView;
                    view3.setAlpha(1.0f);
                    view3.setScaleY(1.0f);
                    view3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    h(e0Var6);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<a>> arrayList9 = this.o;
            for (int size9 = arrayList9.size() - 1; -1 < size9; size9--) {
                ArrayList<a> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; -1 < size10; size10--) {
                    a aVar2 = arrayList10.get(size10);
                    RecyclerView.e0 e0Var7 = aVar2.a;
                    if (e0Var7 != null) {
                        F(aVar2, e0Var7);
                    }
                    RecyclerView.e0 e0Var8 = aVar2.b;
                    if (e0Var8 != null) {
                        F(aVar2, e0Var8);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            C(this.r);
            C(this.q);
            C(this.p);
            C(this.s);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean n() {
        return (this.j.isEmpty() && this.l.isEmpty() && this.k.isEmpty() && this.i.isEmpty() && this.q.isEmpty() && this.r.isEmpty() && this.p.isEmpty() && this.s.isEmpty() && this.n.isEmpty() && this.m.isEmpty() && this.o.isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void r() {
        List<MarketBridgeCategory> list;
        List<MarketBridgeCategory> list2;
        o(new ep2(this, 0));
        ArrayList<RecyclerView.e0> arrayList = this.i;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList<b> arrayList2 = this.k;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList<a> arrayList3 = this.l;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList<RecyclerView.e0> arrayList4 = this.j;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator<RecyclerView.e0> it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerView.e0 next = it.next();
            wv00 wv00Var = next instanceof wv00 ? (wv00) next : null;
            if (wv00Var != null) {
                Object obj = wv00Var.l;
                vv00 vv00Var = (vv00) (obj != null ? obj : null);
                if (vv00Var != null) {
                    MarketBridgeCategory marketBridgeCategory = vv00Var.h;
                    MarketBridgeCategory marketBridgeCategory2 = marketBridgeCategory.g;
                    int indexOf = (marketBridgeCategory2 == null || (list2 = marketBridgeCategory2.e) == null) ? -1 : list2.indexOf(marketBridgeCategory);
                    View view = next.itemView;
                    float f = (-view.getHeight()) * indexOf;
                    ViewPropertyAnimator animate = view.animate();
                    this.r.add(next);
                    view.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    animate.setDuration(this.d).scaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(f).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new bz00(view, animate, next, this)).start();
                }
            }
        }
        arrayList.clear();
        if (!isEmpty2) {
            ArrayList<b> arrayList5 = new ArrayList<>();
            arrayList5.addAll(arrayList2);
            ArrayList<ArrayList<b>> arrayList6 = this.n;
            arrayList6.add(arrayList5);
            arrayList2.clear();
            Iterator<b> it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                b next2 = it2.next();
                RecyclerView.e0 e0Var = next2.a;
                int i = next2.b;
                int i2 = next2.c;
                int i3 = next2.d;
                int i4 = next2.e;
                View view2 = e0Var.itemView;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view2.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                if (i6 != 0) {
                    view2.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                ViewPropertyAnimator animate2 = view2.animate();
                this.q.add(e0Var);
                animate2.setDuration(this.e).setListener(new az00(this, e0Var, i5, view2, i6, animate2)).start();
            }
            arrayList5.clear();
            arrayList6.remove(arrayList5);
        }
        if (!isEmpty4) {
            ArrayList<RecyclerView.e0> arrayList7 = new ArrayList<>();
            arrayList7.addAll(arrayList4);
            ArrayList<ArrayList<RecyclerView.e0>> arrayList8 = this.m;
            arrayList8.add(arrayList7);
            arrayList4.clear();
            Iterator<RecyclerView.e0> it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                RecyclerView.e0 next3 = it3.next();
                wv00 wv00Var2 = next3 instanceof wv00 ? (wv00) next3 : null;
                if (wv00Var2 != null) {
                    Object obj2 = wv00Var2.l;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    vv00 vv00Var2 = (vv00) obj2;
                    if (vv00Var2 != null) {
                        MarketBridgeCategory marketBridgeCategory3 = vv00Var2.h;
                        MarketBridgeCategory marketBridgeCategory4 = marketBridgeCategory3.g;
                        int indexOf2 = (marketBridgeCategory4 == null || (list = marketBridgeCategory4.e) == null) ? -1 : list.indexOf(marketBridgeCategory3);
                        View view3 = next3.itemView;
                        float f2 = (-view3.getHeight()) * (indexOf2 + 1);
                        ViewPropertyAnimator animate3 = view3.animate();
                        this.p.add(next3);
                        view3.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        view3.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        view3.setTranslationY(f2);
                        animate3.scaleY(1.0f).setDuration(this.c).alpha(1.0f).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new xy00(view3, animate3, next3, this)).start();
                    }
                }
            }
            arrayList7.clear();
            arrayList8.remove(arrayList7);
        }
        if (isEmpty3) {
            return;
        }
        ArrayList<a> arrayList9 = new ArrayList<>();
        arrayList9.addAll(arrayList3);
        ArrayList<ArrayList<a>> arrayList10 = this.o;
        arrayList10.add(arrayList9);
        arrayList3.clear();
        Iterator<a> it4 = arrayList9.iterator();
        while (it4.hasNext()) {
            a next4 = it4.next();
            RecyclerView.e0 e0Var2 = next4.a;
            RecyclerView.e0 e0Var3 = next4.b;
            ArrayList<RecyclerView.e0> arrayList11 = this.s;
            if (e0Var2 != null) {
                View view4 = e0Var2.itemView;
                ViewPropertyAnimator duration = view4.animate().setDuration(this.f);
                arrayList11.add(e0Var2);
                duration.translationX(next4.e - next4.c);
                duration.translationY(next4.f - next4.d);
                duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new yy00(this, next4, duration, view4)).start();
            }
            if (e0Var3 != null) {
                View view5 = e0Var3.itemView;
                ViewPropertyAnimator animate4 = view5.animate();
                arrayList11.add(e0Var3);
                animate4.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(this.f).alpha(1.0f).setListener(new zy00(this, next4, animate4, view5)).start();
            }
        }
        arrayList9.clear();
        arrayList10.remove(arrayList9);
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
        this.l.add(new a(e0Var, e0Var2, i, i2, i3, i4));
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
        this.k.add(new b(e0Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    public final boolean z(RecyclerView.e0 e0Var) {
        G(e0Var);
        this.i.add(e0Var);
        return true;
    }
}
