package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.avo0;

/* loaded from: classes6.dex */
public final class avo0 {
    public final ViewGroup a;
    public final bvo0 b;
    public final yln c;
    public final gk1 d;
    public boolean e;

    public avo0(final ViewGroup viewGroup, bvo0 bvo0Var) {
        this.a = viewGroup;
        this.b = bvo0Var;
        yln ylnVar = new yln(23, this);
        this.c = ylnVar;
        gk1 gk1Var = new gk1(7, this);
        this.d = gk1Var;
        this.e = true;
        if (viewGroup.isAttachedToWindow()) {
            viewGroup.addOnLayoutChangeListener(ylnVar);
            viewGroup.setOnScrollChangeListener(gk1Var);
            a();
        } else {
            viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.common.ui.ScootersShadowOnScrollHandler$special$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    viewGroup.removeOnAttachStateChangeListener(this);
                    avo0 avo0Var = this;
                    ViewGroup viewGroup2 = avo0Var.a;
                    viewGroup2.addOnLayoutChangeListener(avo0Var.c);
                    viewGroup2.setOnScrollChangeListener(avo0Var.d);
                    this.a();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
        if (viewGroup.isAttachedToWindow()) {
            viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.common.ui.ScootersShadowOnScrollHandler$special$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    viewGroup.removeOnAttachStateChangeListener(this);
                    avo0 avo0Var = this;
                    ViewGroup viewGroup2 = avo0Var.a;
                    viewGroup2.removeOnLayoutChangeListener(avo0Var.c);
                    viewGroup2.setOnScrollChangeListener(null);
                }
            });
        } else {
            viewGroup.removeOnLayoutChangeListener(ylnVar);
            viewGroup.setOnScrollChangeListener(null);
        }
    }

    public final void a() {
        boolean canScrollVertically = this.a.canScrollVertically(1);
        boolean z = this.e;
        bvo0 bvo0Var = this.b;
        if (canScrollVertically) {
            if (z) {
                return;
            }
            bvo0Var.a(true);
            this.e = true;
            return;
        }
        if (z) {
            bvo0Var.a(false);
            this.e = false;
        }
    }
}
