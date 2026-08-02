package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import defpackage.eng0;
import defpackage.k1b1;
import defpackage.kp50;
import defpackage.mhu;
import defpackage.mj2;
import defpackage.ny61;
import defpackage.ohu;
import defpackage.oyr;
import defpackage.unr0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.a {
    public static final int H = eng0.motionDurationLong2;
    public static final int I = eng0.motionDurationMedium4;
    public static final int J = eng0.motionEasingEmphasizedInterpolator;
    public TimeInterpolator A;
    public TimeInterpolator B;
    public ViewPropertyAnimator E;
    public k1b1 a;
    public AccessibilityManager b;
    public mhu c;
    public int y;
    public int z;
    public final boolean w = true;
    public final LinkedHashSet x = new LinkedHashSet();
    public int C = 0;
    public int D = 2;
    public int F = 0;
    public int G = 0;

    /* renamed from: com.google.android.material.behavior.HideViewOnScrollBehavior$2, reason: invalid class name */
    class AnonymousClass2 extends AnimatorListenerAdapter {
        final /* synthetic */ View val$child;

        public AnonymousClass2(View view) {
            this.val$child = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior hideViewOnScrollBehavior = HideViewOnScrollBehavior.this;
            hideViewOnScrollBehavior.E = null;
            if (hideViewOnScrollBehavior.D == 1 && this.val$child.getVisibility() == 0) {
                this.val$child.setVisibility(4);
            }
        }
    }

    public HideViewOnScrollBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            mhu mhuVar = new mhu(this, view, 1);
            this.c = mhuVar;
            accessibilityManager.addTouchExplorationStateChangeListener(mhuVar);
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.behavior.HideViewOnScrollBehavior.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    AccessibilityManager accessibilityManager2;
                    HideViewOnScrollBehavior hideViewOnScrollBehavior = HideViewOnScrollBehavior.this;
                    mhu mhuVar2 = hideViewOnScrollBehavior.c;
                    if (mhuVar2 == null || (accessibilityManager2 = hideViewOnScrollBehavior.b) == null) {
                        return;
                    }
                    accessibilityManager2.removeTouchExplorationStateChangeListener(mhuVar2);
                    HideViewOnScrollBehavior.this.c = null;
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((CoordinatorLayout.LayoutParams) view.getLayoutParams()).gravity;
        if (i2 == 80 || i2 == 81) {
            u(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            u((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.C = this.a.c(view, marginLayoutParams);
        this.y = kp50.O(view.getContext(), H, 225);
        this.z = kp50.O(view.getContext(), I, 175);
        Context context = view.getContext();
        LinearOutSlowInInterpolator linearOutSlowInInterpolator = mj2.d;
        int i3 = J;
        this.A = kp50.P(context, i3, linearOutSlowInInterpolator);
        this.B = kp50.P(view.getContext(), i3, mj2.c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i2 <= 0) {
            if (i2 < 0) {
                v(view);
            }
        } else {
            if (this.D == 1) {
                return;
            }
            if (this.w && (accessibilityManager = this.b) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.E;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            w(1, view);
            this.E = this.a.e(this.C, view).setInterpolator(this.B).setDuration(this.z).setListener(new AnonymousClass2(view));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void u(int i) {
        k1b1 k1b1Var = this.a;
        if (k1b1Var == null || k1b1Var.d() != i) {
            if (i == 0) {
                this.a = new ohu(2);
                return;
            }
            if (i == 1) {
                this.a = new ohu(0);
            } else if (i == 2) {
                this.a = new ohu(1);
            } else {
                ny61.g(oyr.j(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
            }
        }
    }

    public final void v(View view) {
        if (this.D == 2) {
            return;
        }
        w(2, view);
        ViewPropertyAnimator viewPropertyAnimator = this.E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.a.getClass();
        this.E = this.a.e(0, view).setInterpolator(this.A).setDuration(this.y).setListener(new AnonymousClass2(view));
    }

    public final void w(int i, View view) {
        this.D = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.F = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.G = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.F);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.G);
            }
        }
        Iterator it = this.x.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
