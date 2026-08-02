package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.bc5;
import defpackage.cc5;
import defpackage.d1t0;
import defpackage.dc5;
import defpackage.ddf;
import defpackage.eng0;
import defpackage.jvh0;
import defpackage.kp50;
import defpackage.mg;
import defpackage.mj2;
import defpackage.ny61;
import defpackage.sr4;
import defpackage.yvy0;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public abstract class b {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final BaseTransientBottomBar$SnackbarBaseLayout i;
    public final SnackbarContentLayout j;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final AccessibilityManager r;
    public static final FastOutSlowInInterpolator t = mj2.b;
    public static final LinearInterpolator u = mj2.a;
    public static final LinearOutSlowInInterpolator v = mj2.d;
    public static final int[] x = {eng0.snackbarStyle};
    public static final Handler w = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i = message.what;
            if (i == 0) {
                b bVar = (b) message.obj;
                BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = bVar.i;
                if (baseTransientBottomBar$SnackbarBaseLayout.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar$SnackbarBaseLayout.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                        BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                        sr4 sr4Var = baseTransientBottomBar$Behavior.C;
                        sr4Var.getClass();
                        sr4Var.b = bVar.s;
                        baseTransientBottomBar$Behavior.b = new dc5(bVar);
                        layoutParams2.setBehavior(baseTransientBottomBar$Behavior);
                        layoutParams2.insetEdge = 80;
                    }
                    baseTransientBottomBar$SnackbarBaseLayout.addToTargetParent(bVar.g);
                    bVar.e();
                    baseTransientBottomBar$SnackbarBaseLayout.setVisibility(4);
                }
                if (baseTransientBottomBar$SnackbarBaseLayout.isLaidOut()) {
                    bVar.d();
                    return true;
                }
                bVar.q = true;
                return true;
            }
            if (i != 1) {
                return false;
            }
            final b bVar2 = (b) message.obj;
            final int i2 = message.arg1;
            BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout2 = bVar2.i;
            AccessibilityManager accessibilityManager = bVar2.r;
            if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || baseTransientBottomBar$SnackbarBaseLayout2.getVisibility() != 0) {
                bVar2.b();
                return true;
            }
            if (baseTransientBottomBar$SnackbarBaseLayout2.getAnimationMode() == 1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.setInterpolator(bVar2.d);
                ofFloat.addUpdateListener(new BaseTransientBottomBar$11(bVar2));
                ofFloat.setDuration(bVar2.b);
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$10
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        b.this.b();
                    }
                });
                ofFloat.start();
                return true;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout3 = bVar2.i;
            int height = baseTransientBottomBar$SnackbarBaseLayout3.getHeight();
            ViewGroup.LayoutParams layoutParams3 = baseTransientBottomBar$SnackbarBaseLayout3.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                height += ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
            }
            valueAnimator.setIntValues(0, height);
            valueAnimator.setInterpolator(bVar2.e);
            valueAnimator.setDuration(bVar2.c);
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$15
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    b.this.b();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    b bVar3 = b.this;
                    bVar3.j.animateContentOut(0, bVar3.b);
                }
            });
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$16
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    b.this.i.setTranslationY(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                }
            });
            valueAnimator.start();
            return true;
        }
    });
    public final bc5 k = new bc5(this, 0);
    public final cc5 s = new cc5(this);

    public b(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            ny61.g("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            ny61.g("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.g = viewGroup;
        this.j = snackbarContentLayout;
        this.h = context;
        yvy0.c(context, yvy0.a, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = (BaseTransientBottomBar$SnackbarBaseLayout) from.inflate(resourceId != -1 ? jvh0.mtrl_layout_snackbar : jvh0.design_layout_snackbar, viewGroup, false);
        this.i = baseTransientBottomBar$SnackbarBaseLayout;
        baseTransientBottomBar$SnackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            snackbarContentLayout2.updateActionTextColorAlphaIfNeeded(baseTransientBottomBar$SnackbarBaseLayout.getActionTextColorAlpha());
            snackbarContentLayout2.setMaxInlineActionWidth(baseTransientBottomBar$SnackbarBaseLayout.getMaxInlineActionWidth());
        }
        baseTransientBottomBar$SnackbarBaseLayout.addView(view);
        baseTransientBottomBar$SnackbarBaseLayout.setAccessibilityLiveRegion(1);
        baseTransientBottomBar$SnackbarBaseLayout.setImportantForAccessibility(1);
        baseTransientBottomBar$SnackbarBaseLayout.setFitsSystemWindows(true);
        ddf ddfVar = new ddf(29, this);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(baseTransientBottomBar$SnackbarBaseLayout, ddfVar);
        androidx.core.view.b.p(baseTransientBottomBar$SnackbarBaseLayout, new mg(6, this));
        this.r = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = kp50.O(context, eng0.motionDurationLong2, 250);
        this.a = kp50.O(context, eng0.motionDurationLong2, 150);
        this.b = kp50.O(context, eng0.motionDurationMedium1, 75);
        this.d = kp50.P(context, eng0.motionEasingEmphasizedInterpolator, u);
        this.f = kp50.P(context, eng0.motionEasingEmphasizedInterpolator, v);
        this.e = kp50.P(context, eng0.motionEasingEmphasizedInterpolator, t);
    }

    public final void a(int i) {
        d b = d.b();
        cc5 cc5Var = this.s;
        synchronized (b.a) {
            try {
                if (b.c(cc5Var)) {
                    b.a(b.c, i);
                } else {
                    d1t0 d1t0Var = b.d;
                    if (d1t0Var != null && d1t0Var.a.get() == cc5Var) {
                        b.a(b.d, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        d b = d.b();
        cc5 cc5Var = this.s;
        synchronized (b.a) {
            try {
                if (b.c(cc5Var)) {
                    b.c = null;
                    if (b.d != null) {
                        b.g();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void c() {
        d b = d.b();
        cc5 cc5Var = this.s;
        synchronized (b.a) {
            try {
                if (b.c(cc5Var)) {
                    b.f(b.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.r;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = this.i;
        if (z) {
            baseTransientBottomBar$SnackbarBaseLayout.post(new a(this));
            return;
        }
        if (baseTransientBottomBar$SnackbarBaseLayout.getParent() != null) {
            baseTransientBottomBar$SnackbarBaseLayout.setVisibility(0);
        }
        c();
    }

    public final void e() {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = this.i;
        ViewGroup.LayoutParams layoutParams = baseTransientBottomBar$SnackbarBaseLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            rect = baseTransientBottomBar$SnackbarBaseLayout.originalMargins;
            if (rect == null || baseTransientBottomBar$SnackbarBaseLayout.getParent() == null) {
                return;
            }
            int i = this.l;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            rect2 = baseTransientBottomBar$SnackbarBaseLayout.originalMargins;
            int i2 = rect2.bottom + i;
            rect3 = baseTransientBottomBar$SnackbarBaseLayout.originalMargins;
            int i3 = rect3.left + this.m;
            rect4 = baseTransientBottomBar$SnackbarBaseLayout.originalMargins;
            int i4 = rect4.right + this.n;
            rect5 = baseTransientBottomBar$SnackbarBaseLayout.originalMargins;
            int i5 = rect5.top;
            boolean z = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
            if (z) {
                marginLayoutParams.bottomMargin = i2;
                marginLayoutParams.leftMargin = i3;
                marginLayoutParams.rightMargin = i4;
                marginLayoutParams.topMargin = i5;
                baseTransientBottomBar$SnackbarBaseLayout.requestLayout();
            }
            if ((z || this.p != this.o) && this.o > 0) {
                ViewGroup.LayoutParams layoutParams2 = baseTransientBottomBar$SnackbarBaseLayout.getLayoutParams();
                if ((layoutParams2 instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams2).getBehavior() instanceof SwipeDismissBehavior)) {
                    bc5 bc5Var = this.k;
                    baseTransientBottomBar$SnackbarBaseLayout.removeCallbacks(bc5Var);
                    baseTransientBottomBar$SnackbarBaseLayout.post(bc5Var);
                }
            }
        }
    }
}
