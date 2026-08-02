package com.google.android.material.bottomsheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.MaterialShapeDrawable;
import defpackage.b710;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.je4;
import defpackage.jx81;
import defpackage.kxh0;
import defpackage.mj2;
import defpackage.n751;
import defpackage.ny61;
import defpackage.op31;
import defpackage.org0;
import defpackage.oyr;
import defpackage.ph;
import defpackage.r52;
import defpackage.v1w;
import defpackage.we6;
import defpackage.wvb1;
import defpackage.xe6;
import defpackage.xz;
import defpackage.z2i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.a implements b710 {
    public static final int K0 = g2i0.Widget_Design_BottomSheet_Modal;
    public int A;
    public int A0;
    public final int B;
    public int B0;
    public final MaterialShapeDrawable C;
    public WeakReference C0;
    public final ColorStateList D;
    public boolean D0;
    public int E;
    public HashMap E0;
    public int F;
    public final SparseIntArray F0;
    public int G;
    public final SparseIntArray G0;
    public boolean H;
    public final SparseIntArray H0;
    public final boolean I;
    public final Rect I0;
    public final boolean J;
    public final r52 J0;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public int P;
    public int Q;
    public final boolean R;
    public final com.google.android.material.shape.b S;
    public boolean T;
    public final xe6 U;
    public final ValueAnimator V;
    public int W;
    public int Z;
    public final int a;
    public int a0;
    public boolean b;
    public float b0;
    public final float c;
    public int c0;
    public final float d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public final boolean h0;
    public boolean i0;
    public final boolean j0;
    public int k0;
    public androidx.customview.widget.a l0;
    public boolean m0;
    public int n0;
    public boolean o0;
    public final float p0;
    public int q0;
    public int r0;
    public int s0;
    public WeakReference t0;
    public WeakReference u0;
    public WeakReference v0;
    public final int w;
    public final ArrayList w0;
    public final boolean x;
    public final ArrayList x0;
    public int y;
    public VelocityTracker y0;
    public boolean z;
    public com.google.android.material.motion.b z0;

    public static abstract class a {
        public void onLayout(View view) {
        }

        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.a = 0;
        this.b = true;
        this.E = -1;
        this.F = -1;
        this.U = new xe6(this);
        this.b0 = 0.5f;
        this.d0 = -1.0f;
        this.g0 = true;
        this.h0 = true;
        this.j0 = true;
        this.k0 = 4;
        this.p0 = 0.1f;
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.B0 = -1;
        this.F0 = new SparseIntArray();
        this.G0 = new SparseIntArray();
        this.H0 = new SparseIntArray();
        this.I0 = new Rect();
        this.J0 = new r52(1, this);
        this.B = context.getResources().getDimensionPixelSize(org0.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.BottomSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(z2i0.BottomSheetBehavior_Layout_backgroundTint)) {
            this.D = jx81.o(context, obtainStyledAttributes, z2i0.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(z2i0.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.S = com.google.android.material.shape.b.j(context, attributeSet, eng0.bottomSheetStyle, K0).a();
        }
        com.google.android.material.shape.b bVar = this.S;
        if (bVar != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(bVar);
            this.C = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                this.C.setFillColor(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.C.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.V = ofFloat;
        ofFloat.setDuration(500L);
        this.V.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MaterialShapeDrawable materialShapeDrawable2 = BottomSheetBehavior.this.C;
                if (materialShapeDrawable2 != null) {
                    materialShapeDrawable2.setInterpolation(floatValue);
                }
            }
        });
        this.d0 = obtainStyledAttributes.getDimension(z2i0.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(z2i0.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.E = obtainStyledAttributes.getDimensionPixelSize(z2i0.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (obtainStyledAttributes.hasValue(z2i0.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.F = obtainStyledAttributes.getDimensionPixelSize(z2i0.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(z2i0.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || (i = peekValue.data) != -1) {
            V(obtainStyledAttributes.getDimensionPixelSize(z2i0.BottomSheetBehavior_Layout_behavior_peekHeight, -1), false);
        } else {
            V(i, false);
        }
        T(obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.H = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        Q(obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.f0 = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.g0 = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.h0 = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_behavior_draggableOnNestedScroll, true);
        this.a = obtainStyledAttributes.getInt(z2i0.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        S(obtainStyledAttributes.getFloat(z2i0.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(z2i0.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 == null || peekValue2.type != 16) {
            P(obtainStyledAttributes.getDimensionPixelOffset(z2i0.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        } else {
            P(peekValue2.data);
        }
        this.w = obtainStyledAttributes.getInt(z2i0.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
        this.x = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_behavior_multipleScrollingChildrenSupported, false);
        this.j0 = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_behavior_autoExpandOnRequestChildRectangleOffscreen, true);
        this.I = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.J = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.K = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.L = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.M = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.N = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.O = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.R = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static BottomSheetBehavior D(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            ny61.g("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        ny61.g("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public static int E(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void A(int i, View view) {
        if (view == null) {
            return;
        }
        androidx.core.view.b.n(1048576, view);
        androidx.core.view.b.j(0, view);
        androidx.core.view.b.n(524288, view);
        androidx.core.view.b.j(0, view);
        androidx.core.view.b.n(262144, view);
        androidx.core.view.b.j(0, view);
        SparseIntArray sparseIntArray = this.G0;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 != -1) {
            androidx.core.view.b.n(i2, view);
            androidx.core.view.b.j(0, view);
            sparseIntArray.delete(i);
        }
        SparseIntArray sparseIntArray2 = this.F0;
        int i3 = sparseIntArray2.get(i, -1);
        if (i3 != -1) {
            androidx.core.view.b.n(i3, view);
            androidx.core.view.b.j(0, view);
            sparseIntArray2.delete(i);
        }
        SparseIntArray sparseIntArray3 = this.H0;
        int i4 = sparseIntArray3.get(i, -1);
        if (i4 != -1) {
            androidx.core.view.b.n(i4, view);
            androidx.core.view.b.j(0, view);
            sparseIntArray3.delete(i);
        }
    }

    public final void B(int i) {
        float f;
        float f2;
        View view = (View) this.t0.get();
        if (view != null) {
            ArrayList arrayList = this.x0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.c0;
            if (i > i2 || i2 == F()) {
                int i3 = this.c0;
                f = i3 - i;
                f2 = this.s0 - i3;
            } else {
                int i4 = this.c0;
                f = i4 - i;
                f2 = i4 - F();
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((a) arrayList.get(i5)).onSlide(view, f3);
            }
        }
    }

    public final View C(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View C = C(viewGroup.getChildAt(i));
                if (C != null) {
                    return C;
                }
            }
        }
        return null;
    }

    public final int F() {
        if (this.b) {
            return this.Z;
        }
        return Math.max(this.W, this.L ? 0 : this.Q);
    }

    public final int G() {
        if (this.z) {
            return -1;
        }
        return this.y;
    }

    public final int H() {
        return this.k0;
    }

    public final int I(int i) {
        if (i == 3) {
            return F();
        }
        if (i == 4) {
            return this.c0;
        }
        if (i == 5) {
            return this.s0;
        }
        if (i == 6) {
            return this.a0;
        }
        ny61.g(oyr.i(i, "Invalid state to get top offset: "));
        return 0;
    }

    public final boolean J() {
        WeakReference weakReference = this.t0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.t0.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean K(View view) {
        Iterator it = this.w0.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    public final void L(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.w0.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                L(viewGroup.getChildAt(i));
            }
        }
    }

    public final void M(a aVar) {
        this.x0.remove(aVar);
    }

    public final void N() {
        this.A0 = -1;
        this.B0 = -1;
        this.C0 = null;
        VelocityTracker velocityTracker = this.y0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.y0 = null;
        }
    }

    public final void O(BottomSheetDragHandleView bottomSheetDragHandleView) {
        WeakReference weakReference;
        if (bottomSheetDragHandleView != null || (weakReference = this.u0) == null) {
            this.u0 = new WeakReference(bottomSheetDragHandleView);
            b0(1, bottomSheetDragHandleView);
        } else {
            A(1, (View) weakReference.get());
            this.u0 = null;
        }
    }

    public final void P(int i) {
        if (i < 0) {
            ny61.g("offset must be greater than or equal to 0");
        } else {
            this.W = i;
            c0(this.k0, true);
        }
    }

    public final void Q(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.t0 != null) {
            w();
        }
        X((this.b && this.k0 == 6) ? 3 : this.k0);
        c0(this.k0, true);
        a0();
    }

    public final void R() {
        this.H = true;
    }

    public final void S(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            ny61.g("ratio must be a float value between 0 and 1");
            return;
        }
        this.b0 = f;
        if (this.t0 != null) {
            this.a0 = (int) ((1.0f - f) * this.s0);
        }
    }

    public final void T(boolean z) {
        if (this.e0 != z) {
            this.e0 = z;
            if (!z && this.k0 == 5) {
                W(4);
            }
            a0();
        }
    }

    public final void U(int i) {
        V(i, false);
    }

    public final void V(int i, boolean z) {
        boolean z2 = this.z;
        if (i == -1) {
            if (z2) {
                return;
            } else {
                this.z = true;
            }
        } else {
            if (!z2 && this.y == i) {
                return;
            }
            this.z = false;
            this.y = Math.max(0, i);
        }
        e0();
    }

    public final void W(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(oyr.t(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.e0 || i != 5) {
            int i2 = 3;
            int i3 = (i == 6 && this.b && I(i) <= this.Z) ? 3 : i;
            WeakReference weakReference = this.t0;
            if (weakReference == null || weakReference.get() == null) {
                X(i);
                return;
            }
            View view = (View) this.t0.get();
            xz xzVar = new xz((CoordinatorLayout.a) this, view, i3, i2);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                view.post(xzVar);
            } else {
                xzVar.run();
            }
        }
    }

    public final void X(int i) {
        View view;
        if (this.k0 == i) {
            return;
        }
        this.k0 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.e0;
        }
        WeakReference weakReference = this.t0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            d0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            d0(false);
        }
        c0(i, true);
        while (true) {
            ArrayList arrayList = this.x0;
            if (i2 >= arrayList.size()) {
                a0();
                return;
            } else {
                ((a) arrayList.get(i2)).onStateChanged(view, i);
                i2++;
            }
        }
    }

    public final boolean Y(float f, View view) {
        if (this.f0) {
            return true;
        }
        if (view.getTop() < this.c0) {
            return false;
        }
        return Math.abs(((f * this.p0) + ((float) view.getTop())) - ((float) this.c0)) / ((float) y()) > 0.5f;
    }

    public final void Z(int i, View view, boolean z) {
        int I = I(i);
        androidx.customview.widget.a aVar = this.l0;
        if (aVar == null || (!z ? aVar.t(view.getLeft(), I, view) : aVar.r(view.getLeft(), I))) {
            X(i);
            return;
        }
        X(2);
        c0(i, true);
        this.U.a(i);
    }

    public final void a0() {
        WeakReference weakReference = this.t0;
        if (weakReference != null) {
            b0(0, (View) weakReference.get());
        }
        WeakReference weakReference2 = this.u0;
        if (weakReference2 != null) {
            b0(1, (View) weakReference2.get());
        }
    }

    public final void b0(int i, View view) {
        if (view == null) {
            return;
        }
        A(i, view);
        if (!this.b && this.k0 != 6) {
            this.F0.put(i, u(kxh0.bottomsheet_action_expand_halfway, 6, view));
        }
        if (this.e0) {
            int i2 = 5;
            if (this.k0 != 5) {
                androidx.core.view.b.o(view, ph.o, null, new we6(this, i2, 0));
            }
        }
        int i3 = this.k0;
        SparseIntArray sparseIntArray = this.H0;
        if (i3 == 3) {
            if (z()) {
                sparseIntArray.put(i, u(kxh0.bottomsheet_action_collapse, 4, view));
                return;
            }
            return;
        }
        SparseIntArray sparseIntArray2 = this.G0;
        if (i3 == 4) {
            sparseIntArray2.put(i, u(kxh0.bottomsheet_action_expand, 3, view));
        } else {
            if (i3 != 6) {
                return;
            }
            if (z()) {
                sparseIntArray.put(i, u(kxh0.bottomsheet_action_collapse, 4, view));
            }
            sparseIntArray2.put(i, u(kxh0.bottomsheet_action_expand, 3, view));
        }
    }

    public final void c0(int i, boolean z) {
        MaterialShapeDrawable materialShapeDrawable;
        if (i == 2) {
            return;
        }
        boolean z2 = this.k0 == 3 && (this.R || J());
        if (this.T == z2 || (materialShapeDrawable = this.C) == null) {
            return;
        }
        this.T = z2;
        ValueAnimator valueAnimator = this.V;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            materialShapeDrawable.setInterpolation(this.T ? x() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(materialShapeDrawable.getInterpolation(), z2 ? x() : 1.0f);
            valueAnimator.start();
        }
    }

    @Override // defpackage.b710
    public final void cancelBackProgress() {
        com.google.android.material.motion.b bVar = this.z0;
        if (bVar == null) {
            return;
        }
        je4 je4Var = bVar.f;
        bVar.f = null;
        if (je4Var == null) {
            return;
        }
        AnimatorSet a2 = bVar.a();
        a2.setDuration(bVar.e);
        a2.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void d(CoordinatorLayout.LayoutParams layoutParams) {
        this.t0 = null;
        this.l0 = null;
        this.z0 = null;
    }

    public final void d0(boolean z) {
        WeakReference weakReference = this.t0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.E0 != null) {
                    return;
                } else {
                    this.E0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.t0.get() && z) {
                    this.E0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.E0 = null;
        }
    }

    public final void e0() {
        View view;
        if (this.t0 != null) {
            w();
            if (this.k0 != 4 || (view = (View) this.t0.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void g() {
        this.t0 = null;
        this.l0 = null;
        this.z0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        if (r1.get() != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
    
        if (r18.isPointInChildBounds(r9, (int) r20.getX(), (int) r20.getY()) != false) goto L91;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int i;
        androidx.customview.widget.a aVar;
        if (!view.isShown() || !this.g0) {
            this.m0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            N();
        }
        if (this.y0 == null) {
            this.y0 = VelocityTracker.obtain();
        }
        this.y0.addMovement(motionEvent);
        ArrayList arrayList = this.w0;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.B0 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) it.next()).get();
                    if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x2, y)) {
                        break;
                    }
                }
            }
            view2 = null;
            WeakReference weakReference = new WeakReference(view2);
            this.C0 = weakReference;
            if (this.k0 != 2 && weakReference.get() != null) {
                this.A0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                int i2 = this.B0;
                WeakReference weakReference2 = this.v0;
                View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
                if (view3 == null || !coordinatorLayout.isPointInChildBounds(view3, x, i2)) {
                    this.D0 = true;
                }
            }
            this.m0 = this.A0 == -1 && !coordinatorLayout.isPointInChildBounds(view, x, this.B0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.D0 = false;
            this.C0 = null;
            this.A0 = -1;
            if (this.m0) {
                this.m0 = false;
                return false;
            }
        }
        if (this.m0 || (aVar = this.l0) == null || !aVar.s(motionEvent)) {
            if (actionMasked == 2) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((WeakReference) it2.next()).get() != null) {
                        if (!this.m0 && this.k0 != 1) {
                            if (this.x) {
                                WeakReference weakReference3 = this.C0;
                                if (weakReference3 != null) {
                                }
                                if (this.l0 != null || (i = this.B0) == -1 || Math.abs(i - motionEvent.getY()) <= this.l0.b) {
                                    break;
                                }
                            } else {
                                View view4 = arrayList.isEmpty() ? null : (View) ((WeakReference) arrayList.get(0)).get();
                                if (view4 != null) {
                                }
                                if (this.l0 != null) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.b710
    public final void handleBackInvoked() {
        com.google.android.material.motion.b bVar = this.z0;
        if (bVar == null) {
            return;
        }
        je4 je4Var = bVar.f;
        bVar.f = null;
        if (je4Var == null || Build.VERSION.SDK_INT < 34) {
            W(this.e0 ? 5 : 4);
            return;
        }
        if (this.e0) {
            bVar.b(je4Var, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    BottomSheetBehavior.this.X(5);
                    WeakReference weakReference = BottomSheetBehavior.this.t0;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    ((View) BottomSheetBehavior.this.t0.get()).requestLayout();
                }
            });
            return;
        }
        AnimatorSet a2 = bVar.a();
        a2.setDuration(mj2.c(bVar.c, bVar.d, je4Var.c));
        a2.start();
        W(4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.t0 == null) {
            this.A = coordinatorLayout.getResources().getDimensionPixelSize(org0.design_bottom_sheet_peek_height_min);
            boolean z = (this.H || this.z) ? false : true;
            if (this.I || this.J || this.K || this.M || this.N || this.O || z) {
                com.google.android.material.internal.e.c(view, new wvb1(this, z));
            }
            androidx.core.view.b.u(view, new v1w(view));
            this.t0 = new WeakReference(view);
            this.z0 = new com.google.android.material.motion.b(view);
            MaterialShapeDrawable materialShapeDrawable = this.C;
            if (materialShapeDrawable != null) {
                view.setBackground(materialShapeDrawable);
                float f = this.d0;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                materialShapeDrawable.setElevation(f);
            } else {
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    ViewCompat$Api21Impl.k(view, colorStateList);
                }
            }
            a0();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.l0 == null) {
            this.l0 = new androidx.customview.widget.a(coordinatorLayout.getContext(), coordinatorLayout, this.J0);
        }
        int top = view.getTop();
        coordinatorLayout.onLayoutChild(view, i);
        this.r0 = coordinatorLayout.getWidth();
        this.s0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.q0 = height;
        int i3 = this.s0;
        int i4 = i3 - height;
        int i5 = this.Q;
        if (i4 < i5) {
            int i6 = this.F;
            if (this.L) {
                if (i6 != -1) {
                    i3 = Math.min(i3, i6);
                }
                this.q0 = i3;
            } else {
                int i7 = i3 - i5;
                if (i6 != -1) {
                    i7 = Math.min(i7, i6);
                }
                this.q0 = i7;
            }
        }
        this.Z = Math.max(0, this.s0 - this.q0);
        this.a0 = (int) ((1.0f - this.b0) * this.s0);
        w();
        int i8 = this.k0;
        if (i8 == 3) {
            int F = F();
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            view.offsetTopAndBottom(F);
        } else if (i8 == 6) {
            int i9 = this.a0;
            WeakHashMap weakHashMap2 = androidx.core.view.b.a;
            view.offsetTopAndBottom(i9);
        } else if (this.e0 && i8 == 5) {
            int i10 = this.s0;
            WeakHashMap weakHashMap3 = androidx.core.view.b.a;
            view.offsetTopAndBottom(i10);
        } else if (i8 == 4) {
            int i11 = this.c0;
            WeakHashMap weakHashMap4 = androidx.core.view.b.a;
            view.offsetTopAndBottom(i11);
        } else if (i8 == 1 || i8 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap5 = androidx.core.view.b.a;
            view.offsetTopAndBottom(top2);
        }
        c0(this.k0, false);
        ArrayList arrayList = this.w0;
        arrayList.clear();
        if (this.x) {
            L(view);
        } else {
            arrayList.add(new WeakReference(C(view)));
        }
        while (true) {
            ArrayList arrayList2 = this.x0;
            if (i2 >= arrayList2.size()) {
                return true;
            }
            ((a) arrayList2.get(i2)).onLayout(view);
            i2++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(E(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.E, marginLayoutParams.width), E(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.F, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean k(float f, float f2, View view) {
        Iterator it = this.w0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((WeakReference) it.next()).get() != null) {
                if (!K(view) || this.k0 == 3 || this.i0) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean K;
        if (i3 != 1 && (K = K(view2))) {
            int top = view.getTop();
            int i4 = top - i2;
            boolean z = this.h0;
            if (i2 > 0) {
                if (!this.o0 && !z && K && view2.canScrollVertically(1)) {
                    this.i0 = true;
                    return;
                }
                if (i4 < F()) {
                    int F = top - F();
                    iArr[1] = F;
                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                    view.offsetTopAndBottom(-F);
                    X(3);
                } else {
                    if (!this.g0) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                    view.offsetTopAndBottom(-i2);
                    X(1);
                }
            } else if (i2 < 0) {
                boolean canScrollVertically = view2.canScrollVertically(-1);
                if (!this.o0 && !z && K && canScrollVertically) {
                    this.i0 = true;
                    return;
                }
                if (!canScrollVertically) {
                    int i5 = this.c0;
                    if (i4 > i5 && !this.e0) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        WeakHashMap weakHashMap3 = androidx.core.view.b.a;
                        view.offsetTopAndBottom(-i6);
                        X(4);
                    } else {
                        if (!this.g0) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = androidx.core.view.b.a;
                        view.offsetTopAndBottom(-i2);
                        X(1);
                    }
                }
            }
            B(view.getTop());
            this.n0 = i2;
            this.o0 = true;
            this.i0 = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean o(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        if (!this.j0 || view.isInTouchMode()) {
            return false;
        }
        int i = this.k0;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.I0;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            n751 a2 = op31.a(view);
            if (a2 != null) {
                rect2.bottom -= a2.a.g(519).d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        W(3);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void p(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        savedState.getSuperState();
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.y = savedState.peekHeight;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = savedState.fitToContents;
            }
            if (i == -1 || (i & 4) == 4) {
                this.e0 = savedState.hideable;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f0 = savedState.skipCollapsed;
            }
        }
        int i2 = savedState.state;
        if (i2 == 1 || i2 == 2) {
            this.k0 = 4;
        } else {
            this.k0 = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final Parcelable q(View view) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.n0 = 0;
        this.o0 = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r5.getTop() <= r3.a0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (java.lang.Math.abs(r4 - r3.Z) < java.lang.Math.abs(r4 - r3.c0)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        if (r4 < java.lang.Math.abs(r4 - r2)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r2)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        if (java.lang.Math.abs(r4 - r3.a0) < java.lang.Math.abs(r4 - r3.c0)) goto L48;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == F()) {
            X(3);
            return;
        }
        if (K(view2) && this.o0) {
            if (this.n0 > 0) {
                if (!this.b) {
                }
                Z(i2, view, false);
                this.o0 = false;
            }
            if (this.e0) {
                VelocityTracker velocityTracker = this.y0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.y0.getYVelocity(this.A0);
                }
                if (Y(yVelocity, view)) {
                    i2 = 5;
                    Z(i2, view, false);
                    this.o0 = false;
                }
            }
            if (this.n0 == 0) {
                int top = view.getTop();
                if (!this.b) {
                    int i3 = this.a0;
                    int i4 = this.c0;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            Z(i2, view, false);
            this.o0 = false;
        }
    }

    @Override // defpackage.b710
    public final void startBackProgress(je4 je4Var) {
        com.google.android.material.motion.b bVar = this.z0;
        if (bVar == null) {
            return;
        }
        bVar.f = je4Var;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean t(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.k0;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        androidx.customview.widget.a aVar = this.l0;
        if (aVar != null && (this.g0 || i == 1)) {
            aVar.l(motionEvent);
        }
        if (actionMasked == 0) {
            N();
        }
        if (this.y0 == null) {
            this.y0 = VelocityTracker.obtain();
        }
        this.y0.addMovement(motionEvent);
        if (this.l0 != null && ((this.g0 || this.k0 == 1) && actionMasked == 2 && !this.m0)) {
            float abs = Math.abs(this.B0 - motionEvent.getY());
            androidx.customview.widget.a aVar2 = this.l0;
            if (abs > aVar2.b) {
                aVar2.c(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.m0;
    }

    public final int u(int i, int i2, View view) {
        return androidx.core.view.b.a(view, view.getResources().getString(i), new we6(this, i2, 0));
    }

    @Override // defpackage.b710
    public final void updateBackProgress(je4 je4Var) {
        com.google.android.material.motion.b bVar = this.z0;
        if (bVar == null) {
            return;
        }
        je4 je4Var2 = bVar.f;
        bVar.f = je4Var;
        if (je4Var2 == null) {
            return;
        }
        bVar.c(je4Var.c);
    }

    public final void v(a aVar) {
        ArrayList arrayList = this.x0;
        if (arrayList.contains(aVar)) {
            return;
        }
        arrayList.add(aVar);
    }

    public final void w() {
        int y = y();
        boolean z = this.b;
        int i = this.s0;
        if (z) {
            this.c0 = Math.max(i - y, this.Z);
        } else {
            this.c0 = i - y;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float x() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f2 = 0.0f;
        MaterialShapeDrawable materialShapeDrawable = this.C;
        if (materialShapeDrawable != null && (weakReference = this.t0) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.t0.get();
            if (J() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float topLeftCornerResolvedSize = materialShapeDrawable.getTopLeftCornerResolvedSize();
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f3 = radius2;
                    if (f3 > 0.0f && topLeftCornerResolvedSize > 0.0f) {
                        f = f3 / topLeftCornerResolvedSize;
                        float topRightCornerResolvedSize = materialShapeDrawable.getTopRightCornerResolvedSize();
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f4 = radius;
                            if (f4 > 0.0f && topRightCornerResolvedSize > 0.0f) {
                                f2 = f4 / topRightCornerResolvedSize;
                            }
                        }
                        return Math.max(f, f2);
                    }
                }
                f = 0.0f;
                float topRightCornerResolvedSize2 = materialShapeDrawable.getTopRightCornerResolvedSize();
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int y() {
        int i;
        int i2;
        int i3;
        if (this.z) {
            i = Math.min(Math.max(this.A, this.s0 - ((this.r0 * 9) / 16)), this.q0);
            i2 = this.P;
        } else {
            if (!this.H && !this.I && (i3 = this.G) > 0) {
                return Math.max(this.y, i3 + this.B);
            }
            i = this.y;
            i2 = this.P;
        }
        return i + i2;
    }

    public final boolean z() {
        return (this.f0 && this.e0) ? false : true;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.k0;
            this.peekHeight = bottomSheetBehavior.y;
            this.fitToContents = bottomSheetBehavior.b;
            this.hideable = bottomSheetBehavior.e0;
            this.skipCollapsed = bottomSheetBehavior.f0;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.E = -1;
        this.F = -1;
        this.U = new xe6(this);
        this.b0 = 0.5f;
        this.d0 = -1.0f;
        this.g0 = true;
        this.h0 = true;
        this.j0 = true;
        this.k0 = 4;
        this.p0 = 0.1f;
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.B0 = -1;
        this.F0 = new SparseIntArray();
        this.G0 = new SparseIntArray();
        this.H0 = new SparseIntArray();
        this.I0 = new Rect();
        this.J0 = new r52(1, this);
    }
}
