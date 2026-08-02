package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import defpackage.eng0;
import defpackage.kp50;
import defpackage.mhu;
import defpackage.mj2;
import defpackage.unr0;
import java.util.Iterator;
import java.util.LinkedHashSet;

@Deprecated
/* loaded from: classes11.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.a {
    public static final int H = eng0.motionDurationLong2;
    public static final int I = eng0.motionDurationMedium4;
    public static final int J = eng0.motionEasingEmphasizedInterpolator;
    public mhu A;
    public ViewPropertyAnimator E;
    public int b;
    public int c;
    public TimeInterpolator w;
    public TimeInterpolator x;
    public AccessibilityManager z;
    public final LinkedHashSet a = new LinkedHashSet();
    public int y = 0;
    public final boolean B = true;
    public int C = 2;
    public int D = 0;
    public int F = 0;
    public int G = 0;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$2, reason: invalid class name */
    class AnonymousClass2 extends AnimatorListenerAdapter {
        final /* synthetic */ View val$child;

        public AnonymousClass2(View view) {
            this.val$child = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = HideBottomViewOnScrollBehavior.this;
            hideBottomViewOnScrollBehavior.E = null;
            if (hideBottomViewOnScrollBehavior.C == 1 && this.val$child.getVisibility() == 0) {
                this.val$child.setVisibility(4);
            }
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.y = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = kp50.O(view.getContext(), H, 225);
        this.c = kp50.O(view.getContext(), I, 175);
        Context context = view.getContext();
        LinearOutSlowInInterpolator linearOutSlowInInterpolator = mj2.d;
        int i2 = J;
        this.w = kp50.P(context, i2, linearOutSlowInInterpolator);
        this.x = kp50.P(view.getContext(), i2, mj2.c);
        if (this.z == null) {
            this.z = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.z;
        if (accessibilityManager != null && this.A == null) {
            mhu mhuVar = new mhu(this, view, 0);
            this.A = mhuVar;
            accessibilityManager.addTouchExplorationStateChangeListener(mhuVar);
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    AccessibilityManager accessibilityManager2;
                    HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = HideBottomViewOnScrollBehavior.this;
                    mhu mhuVar2 = hideBottomViewOnScrollBehavior.A;
                    if (mhuVar2 == null || (accessibilityManager2 = hideBottomViewOnScrollBehavior.z) == null) {
                        return;
                    }
                    accessibilityManager2.removeTouchExplorationStateChangeListener(mhuVar2);
                    HideBottomViewOnScrollBehavior.this.A = null;
                }
            });
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            u(view, true);
        } else if (i2 < 0) {
            v(view, true);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void u(View view, boolean z) {
        AccessibilityManager accessibilityManager;
        if (this.C == 1) {
            return;
        }
        if (this.B && (accessibilityManager = this.z) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        w(1, view);
        int i = this.y + this.D;
        if (z) {
            this.E = view.animate().translationY(i).setInterpolator(this.x).setDuration(this.c).setListener(new AnonymousClass2(view));
            return;
        }
        view.setTranslationY(i);
        if (view.getVisibility() == 0) {
            view.setVisibility(4);
        }
    }

    public final void v(View view, boolean z) {
        if (this.C == 2) {
            return;
        }
        w(2, view);
        ViewPropertyAnimator viewPropertyAnimator = this.E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        if (!z) {
            view.setTranslationY(0.0f);
            return;
        }
        this.E = view.animate().translationY(0.0f).setInterpolator(this.w).setDuration(this.b).setListener(new AnonymousClass2(view));
    }

    public final void w(int i, View view) {
        this.C = i;
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
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
