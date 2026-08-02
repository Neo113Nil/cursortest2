package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.cc5;
import defpackage.sr4;

/* loaded from: classes11.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final sr4 C;

    public BaseTransientBottomBar$Behavior() {
        sr4 sr4Var = new sr4();
        this.z = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.A = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.x = 0;
        this.C = sr4Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        sr4 sr4Var = this.C;
        sr4Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                d.b().e((cc5) sr4Var.b);
            }
        } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            d.b().d((cc5) sr4Var.b);
        }
        return super.h(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean u(View view) {
        this.C.getClass();
        return view instanceof BaseTransientBottomBar$SnackbarBaseLayout;
    }
}
