package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import defpackage.ndh;
import defpackage.odh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class h extends b1 {
    public static TimeInterpolator s;
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
    public final ArrayList r = new ArrayList();

    static void u(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((x0) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final boolean g(x0 x0Var, List list) {
        return !list.isEmpty() || f(x0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public void j(x0 x0Var) {
        View view = x0Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((odh) arrayList.get(size)).a == x0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(x0Var);
                arrayList.remove(size);
            }
        }
        w(this.k, x0Var);
        if (this.h.remove(x0Var)) {
            view.setAlpha(1.0f);
            h(x0Var);
        }
        if (this.i.remove(x0Var)) {
            view.setAlpha(1.0f);
            s(x0Var);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            w(arrayList3, x0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((odh) arrayList5.get(size4)).a == x0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(x0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(x0Var)) {
                view.setAlpha(1.0f);
                s(x0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(x0Var);
        this.o.remove(x0Var);
        this.r.remove(x0Var);
        this.p.remove(x0Var);
        v();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public void k() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            odh odhVar = (odh) arrayList.get(size);
            View view = odhVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(odhVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            h((x0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            x0 x0Var = (x0) arrayList3.get(size3);
            x0Var.a.setAlpha(1.0f);
            s(x0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ndh ndhVar = (ndh) arrayList4.get(size4);
            x0 x0Var2 = ndhVar.a;
            if (x0Var2 != null) {
                x(ndhVar, x0Var2);
            }
            x0 x0Var3 = ndhVar.b;
            if (x0Var3 != null) {
                x(ndhVar, x0Var3);
            }
        }
        arrayList4.clear();
        if (m()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    odh odhVar2 = (odh) arrayList6.get(size6);
                    View view2 = odhVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    h(odhVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    x0 x0Var4 = (x0) arrayList8.get(size8);
                    x0Var4.a.setAlpha(1.0f);
                    s(x0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ndh ndhVar2 = (ndh) arrayList10.get(size10);
                    x0 x0Var5 = ndhVar2.a;
                    if (x0Var5 != null) {
                        x(ndhVar2, x0Var5);
                    }
                    x0 x0Var6 = ndhVar2.b;
                    if (x0Var6 != null) {
                        x(ndhVar2, x0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            u(this.q);
            u(this.p);
            u(this.o);
            u(this.r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public boolean m() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public void n() {
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
        while (it.hasNext()) {
            final x0 x0Var = (x0) it.next();
            final View view = x0Var.a;
            final ViewPropertyAnimator animate = view.animate();
            this.q.add(x0Var);
            animate.setDuration(this.d).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator$4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view.setAlpha(1.0f);
                    h.this.h(x0Var);
                    h.this.q.remove(x0Var);
                    h.this.v();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    h.this.getClass();
                }
            }).start();
        }
        arrayList.clear();
        int i = 0;
        if (!isEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.m.add(arrayList5);
            arrayList2.clear();
            g gVar = new g(this, arrayList5, i);
            if (isEmpty) {
                gVar.run();
            } else {
                View view2 = ((odh) arrayList5.get(0)).a.a;
                long j = this.d;
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                view2.postOnAnimationDelayed(gVar, j);
            }
        }
        if (!isEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.n.add(arrayList6);
            arrayList3.clear();
            g gVar2 = new g(this, arrayList6, 1);
            if (isEmpty) {
                gVar2.run();
            } else {
                View view3 = ((ndh) arrayList6.get(0)).a.a;
                long j2 = this.d;
                WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                view3.postOnAnimationDelayed(gVar2, j2);
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.l.add(arrayList7);
        arrayList4.clear();
        g gVar3 = new g(this, arrayList7, 2);
        if (isEmpty && isEmpty2 && isEmpty3) {
            gVar3.run();
            return;
        }
        long max = Math.max(!isEmpty2 ? this.e : 0L, isEmpty3 ? 0L : this.f) + (!isEmpty ? this.d : 0L);
        View view4 = ((x0) arrayList7.get(0)).a;
        WeakHashMap weakHashMap3 = androidx.core.view.b.a;
        view4.postOnAnimationDelayed(gVar3, max);
    }

    @Override // androidx.recyclerview.widget.b1
    public boolean o(x0 x0Var) {
        y(x0Var);
        x0Var.a.setAlpha(0.0f);
        this.i.add(x0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.b1
    public boolean p(x0 x0Var, x0 x0Var2, int i, int i2, int i3, int i4) {
        if (x0Var == x0Var2) {
            return q(x0Var, i, i2, i3, i4);
        }
        View view = x0Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        y(x0Var);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        if (x0Var2 != null) {
            View view2 = x0Var2.a;
            y(x0Var2);
            view2.setTranslationX(-i5);
            view2.setTranslationY(-i6);
            view2.setAlpha(0.0f);
        }
        ndh ndhVar = new ndh();
        ndhVar.a = x0Var;
        ndhVar.b = x0Var2;
        ndhVar.c = i;
        ndhVar.d = i2;
        ndhVar.e = i3;
        ndhVar.f = i4;
        this.k.add(ndhVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.b1
    public boolean q(x0 x0Var, int i, int i2, int i3, int i4) {
        View view = x0Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) view.getTranslationY());
        y(x0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            h(x0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        odh odhVar = new odh();
        odhVar.a = x0Var;
        odhVar.b = translationX;
        odhVar.c = translationY;
        odhVar.d = i3;
        odhVar.e = i4;
        this.j.add(odhVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.b1
    public boolean r(x0 x0Var) {
        y(x0Var);
        this.h.add(x0Var);
        return true;
    }

    final void v() {
        if (m()) {
            return;
        }
        i();
    }

    public final void w(ArrayList arrayList, x0 x0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ndh ndhVar = (ndh) arrayList.get(size);
            if (x(ndhVar, x0Var) && ndhVar.a == null && ndhVar.b == null) {
                arrayList.remove(ndhVar);
            }
        }
    }

    public final boolean x(ndh ndhVar, x0 x0Var) {
        if (ndhVar.b == x0Var) {
            ndhVar.b = null;
        } else {
            if (ndhVar.a != x0Var) {
                return false;
            }
            ndhVar.a = null;
        }
        View view = x0Var.a;
        View view2 = x0Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        h(x0Var);
        return true;
    }

    public final void y(x0 x0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        x0Var.a.animate().setInterpolator(s);
        j(x0Var);
    }
}
