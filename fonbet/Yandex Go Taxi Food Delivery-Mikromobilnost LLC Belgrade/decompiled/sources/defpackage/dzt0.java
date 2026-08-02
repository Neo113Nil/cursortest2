package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.dzt0;
import java.util.Collections;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.transition.c;
import ru.yandex.taxi.widget.InsetsAwareFrameLayout;

/* loaded from: classes6.dex */
public abstract class dzt0 {
    public final Activity a;
    public final InsetsAwareFrameLayout b;
    public final c c;
    public boolean d;

    public dzt0(Activity activity, a850 a850Var) {
        this.a = activity;
        InsetsAwareFrameLayout insetsAwareFrameLayout = new InsetsAwareFrameLayout(activity, null, 0, 6, null);
        this.b = insetsAwareFrameLayout;
        this.c = new c(insetsAwareFrameLayout, a850Var, this);
    }

    public final void a() {
        c cVar = this.c;
        x43 x43Var = cVar.c;
        b bVar = cVar.e;
        boolean z = false;
        if (bVar != null) {
            int size = x43Var.size();
            if (size != 0) {
                z = true;
                if (size != 1) {
                    cVar.i = bVar;
                    bVar.M1(new AttachableViewHolder.b(7, null));
                    av31 av31Var = (av31) x43Var.removeLast();
                    cVar.d(((qor0) cVar.b).e((av31) x43Var.last()), new AttachableViewHolder.a(), cVar.g);
                    cVar.a.k(Collections.singletonList(av31Var.screenName()));
                } else {
                    cVar.a(null);
                }
            } else {
                bVar.M1(new AttachableViewHolder.b(6, null));
                cVar.e = null;
                yu31 yu31Var = cVar.k;
                int i = yu31Var.d - 1;
                yu31Var.d = i;
                if (i == 0) {
                    yu31Var.a.c(yu31Var.b);
                }
            }
        }
        b();
        if (z) {
            return;
        }
        this.a.onBackPressed();
    }

    public final void b() {
        if (this.d && this.c.c.isEmpty()) {
            InsetsAwareFrameLayout insetsAwareFrameLayout = this.b;
            if (insetsAwareFrameLayout.getChildCount() != 0) {
                insetsAwareFrameLayout.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: ru.yandex.taxi.transition.StackedViewHolder$onGoBack$1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View parent, View child) {
                        dzt0.this.b.setOnHierarchyChangeListener(null);
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View parent, View child) {
                        dzt0.this.b.setOnHierarchyChangeListener(null);
                        InsetsAwareFrameLayout insetsAwareFrameLayout2 = dzt0.this.b;
                        ViewParent parent2 = insetsAwareFrameLayout2.getParent();
                        if (parent2 instanceof ViewGroup) {
                            ((ViewGroup) parent2).removeView(insetsAwareFrameLayout2);
                        }
                    }
                });
                return;
            }
            ViewParent parent = insetsAwareFrameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(insetsAwareFrameLayout);
            }
        }
    }

    public final void c(av31 av31Var) {
        this.c.b(av31Var, 0);
    }

    public final void d(av31 av31Var) {
        c cVar = this.c;
        cVar.b(av31Var, cVar.c.size());
    }
}
