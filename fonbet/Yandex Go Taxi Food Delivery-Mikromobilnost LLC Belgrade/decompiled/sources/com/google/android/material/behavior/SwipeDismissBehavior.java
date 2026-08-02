package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b;
import androidx.customview.widget.a;
import defpackage.dc5;
import defpackage.l7s0;
import defpackage.ph;
import defpackage.vxw0;

/* loaded from: classes11.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.a {
    public a a;
    public dc5 b;
    public boolean c;
    public boolean w;
    public int x = 2;
    public final float y = 0.5f;
    public float z = 0.0f;
    public float A = 0.5f;
    public final vxw0 B = new vxw0(this);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = new a(coordinatorLayout.getContext(), coordinatorLayout, this.B);
            }
            if (!this.w && this.a.s(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            b.n(1048576, view);
            b.j(0, view);
            if (u(view)) {
                b.o(view, ph.o, null, new l7s0(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.w && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.l(motionEvent);
        return true;
    }

    public boolean u(View view) {
        return true;
    }
}
