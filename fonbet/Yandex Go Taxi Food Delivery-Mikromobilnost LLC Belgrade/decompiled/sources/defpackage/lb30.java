package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.x0;
import defpackage.lb30;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class lb30 extends h {
    public final ArrayList t = new ArrayList();
    public final ArrayList u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();

    public static void A(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            ((x0) arrayList.get(size)).a.animate().cancel();
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public static float z(View view) {
        int width;
        if (xw31.n(view.getContext())) {
            width = view.getWidth() + (((View) view.getParent()).getWidth() - view.getRight());
        } else {
            width = (-view.getLeft()) - view.getWidth();
        }
        return width;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public final void j(x0 x0Var) {
        View view = x0Var.a;
        view.animate().cancel();
        if (this.t.remove(x0Var)) {
            h(x0Var);
        }
        if (this.u.remove(x0Var)) {
            s(x0Var);
        }
        view.setTranslationX(0.0f);
        ArrayList arrayList = this.v;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ArrayList arrayList2 = (ArrayList) arrayList.get(size);
                if (arrayList2.remove(x0Var)) {
                    s(x0Var);
                    if (arrayList2.isEmpty()) {
                        arrayList.remove(size);
                    }
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (!m()) {
            i();
        }
        super.j(x0Var);
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public final void k() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            h((x0) arrayList.get(size));
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.u;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            x0 x0Var = (x0) arrayList2.get(size2);
            x0Var.a.setTranslationX(0.0f);
            s(x0Var);
            arrayList2.remove(size2);
        }
        A(this.x);
        A(this.w);
        super.k();
        i();
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public final boolean m() {
        return (!super.m() && this.u.isEmpty() && this.t.isEmpty() && this.x.isEmpty() && this.w.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public final void n() {
        super.n();
        ArrayList arrayList = this.t;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.u;
        boolean isEmpty2 = arrayList2.isEmpty();
        if (isEmpty && isEmpty2) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final x0 x0Var = (x0) it.next();
            final View view = x0Var.a;
            final ViewPropertyAnimator animate = view.animate();
            this.x.add(x0Var);
            animate.setDuration(this.e).translationX(z(view)).setListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.widget.anim.MoveAwayItemAnimatorV2$animateRemoveImpl$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    lb30 lb30Var = lb30.this;
                    View view2 = view;
                    lb30Var.getClass();
                    view2.setTranslationX(lb30.z(view2));
                    lb30.this.h(x0Var);
                    lb30.this.x.remove(x0Var);
                    lb30 lb30Var2 = lb30.this;
                    if (lb30Var2.m()) {
                        return;
                    }
                    lb30Var2.i();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    lb30.this.getClass();
                }
            }).start();
        }
        arrayList.clear();
        if (isEmpty2) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList2);
        this.v.add(arrayList3);
        arrayList2.clear();
        p500 p500Var = new p500(29, arrayList3, this);
        if (isEmpty) {
            p500Var.run();
        } else {
            ((x0) arrayList3.get(0)).a.postOnAnimationDelayed(p500Var, 150L);
        }
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean o(x0 x0Var) {
        j(x0Var);
        View view = x0Var.a;
        view.setTranslationX(z(view));
        this.u.add(x0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean r(x0 x0Var) {
        j(x0Var);
        this.t.add(x0Var);
        return true;
    }
}
