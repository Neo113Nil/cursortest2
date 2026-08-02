package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.motion.d;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.c9y;
import defpackage.g2i0;
import defpackage.je4;
import defpackage.jx81;
import defpackage.jy4;
import defpackage.kxh0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.ph;
import defpackage.r52;
import defpackage.rp31;
import defpackage.uas0;
import defpackage.w511;
import defpackage.xe6;
import defpackage.xm2;
import defpackage.z2i0;
import defpackage.zsr0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.a implements zsr0 {
    public static final int Q = kxh0.side_sheet_accessibility_pane_title;
    public static final int R = g2i0.Widget_Material3_SideSheet;
    public int A;
    public androidx.customview.widget.a B;
    public boolean C;
    public final float D;
    public int E;
    public int F;
    public int G;
    public int H;
    public WeakReference I;
    public WeakReference J;
    public final int K;
    public VelocityTracker L;
    public d M;
    public int N;
    public final LinkedHashSet O;
    public final r52 P;
    public c9y a;
    public final MaterialShapeDrawable b;
    public final ColorStateList c;
    public final com.google.android.material.shape.b w;
    public final xe6 x;
    public final float y;
    public final boolean z;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.x = new xe6(this);
        this.z = true;
        this.A = 5;
        this.D = 0.1f;
        this.K = -1;
        this.O = new LinkedHashSet();
        this.P = new r52(5, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.SideSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(z2i0.SideSheetBehavior_Layout_backgroundTint)) {
            this.c = jx81.o(context, obtainStyledAttributes, z2i0.SideSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(z2i0.SideSheetBehavior_Layout_shapeAppearance)) {
            this.w = com.google.android.material.shape.b.j(context, attributeSet, 0, R).a();
        }
        if (obtainStyledAttributes.hasValue(z2i0.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int resourceId = obtainStyledAttributes.getResourceId(z2i0.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);
            this.K = resourceId;
            WeakReference weakReference = this.J;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.J = null;
            WeakReference weakReference2 = this.I;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        com.google.android.material.shape.b bVar = this.w;
        if (bVar != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(bVar);
            this.b = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.setFillColor(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.y = obtainStyledAttributes.getDimension(z2i0.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.z = obtainStyledAttributes.getBoolean(z2i0.SideSheetBehavior_Layout_behavior_draggable, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.b710
    public final void cancelBackProgress() {
        d dVar = this.M;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void d(CoordinatorLayout.LayoutParams layoutParams) {
        this.I = null;
        this.B = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void g() {
        this.I = null;
        this.B = null;
        this.M = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (defpackage.rp31.a(r4) != null) goto L6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        androidx.customview.widget.a aVar;
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
        }
        if (this.z) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.L) != null) {
                velocityTracker.recycle();
                this.L = null;
            }
            if (this.L == null) {
                this.L = VelocityTracker.obtain();
            }
            this.L.addMovement(motionEvent);
            if (actionMasked == 0) {
                this.N = (int) motionEvent.getX();
            } else if ((actionMasked == 1 || actionMasked == 3) && this.C) {
                this.C = false;
                return false;
            }
            return (this.C || (aVar = this.B) == null || !aVar.s(motionEvent)) ? false : true;
        }
        this.C = true;
        return false;
    }

    @Override // defpackage.b710
    public final void handleBackInvoked() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i;
        d dVar = this.M;
        if (dVar == null) {
            return;
        }
        je4 je4Var = dVar.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        dVar.f = null;
        int i2 = 5;
        if (je4Var == null || Build.VERSION.SDK_INT < 34) {
            u(5);
            return;
        }
        c9y c9yVar = this.a;
        if (c9yVar != null && c9yVar.e() != 0) {
            i2 = 3;
        }
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SideSheetBehavior.this.v(5);
                WeakReference weakReference = SideSheetBehavior.this.I;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((View) SideSheetBehavior.this.I.get()).requestLayout();
            }
        };
        WeakReference weakReference = this.J;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            switch (this.a.a) {
                case 0:
                    i = marginLayoutParams.leftMargin;
                    break;
                default:
                    i = marginLayoutParams.rightMargin;
                    break;
            }
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: tas0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.a.i(marginLayoutParams, mj2.c(i, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        dVar.b(je4Var, i2, animatorListenerAdapter, animatorUpdateListener);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int left;
        int i2;
        int i3;
        View findViewById;
        int i4 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.I;
        MaterialShapeDrawable materialShapeDrawable = this.b;
        int i5 = 0;
        if (weakReference == null) {
            this.I = new WeakReference(view);
            this.M = new d(view);
            if (materialShapeDrawable != null) {
                view.setBackground(materialShapeDrawable);
                float f = this.y;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                materialShapeDrawable.setElevation(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                    ViewCompat$Api21Impl.k(view, colorStateList);
                }
            }
            int i6 = this.A == 5 ? 4 : 0;
            if (view.getVisibility() != i6) {
                view.setVisibility(i6);
            }
            y();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            WeakHashMap weakHashMap2 = androidx.core.view.b.a;
            if (rp31.a(view) == null) {
                androidx.core.view.b.r(view, view.getResources().getString(Q));
            }
        }
        int i7 = Gravity.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) view.getLayoutParams()).gravity, i) == 3 ? 1 : 0;
        c9y c9yVar = this.a;
        if (c9yVar == null || c9yVar.e() != i7) {
            CoordinatorLayout.LayoutParams layoutParams = null;
            com.google.android.material.shape.b bVar = this.w;
            if (i7 == 0) {
                this.a = new c9y(this, i4);
                if (bVar != null) {
                    WeakReference weakReference2 = this.I;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view3.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin <= 0) {
                        b.a m = bVar.m();
                        m.l(0.0f);
                        m.h(0.0f);
                        com.google.android.material.shape.b a = m.a();
                        if (materialShapeDrawable != null) {
                            materialShapeDrawable.setShapeAppearanceModel(a);
                        }
                    }
                }
            } else {
                if (i7 != 1) {
                    ny61.g(oyr.j(i7, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.a = new c9y(this, i5);
                if (bVar != null) {
                    WeakReference weakReference3 = this.I;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view2.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin <= 0) {
                        b.a m2 = bVar.m();
                        m2.j(0.0f);
                        m2.f(0.0f);
                        com.google.android.material.shape.b a2 = m2.a();
                        if (materialShapeDrawable != null) {
                            materialShapeDrawable.setShapeAppearanceModel(a2);
                        }
                    }
                }
            }
        }
        if (this.B == null) {
            this.B = new androidx.customview.widget.a(coordinatorLayout.getContext(), coordinatorLayout, this.P);
        }
        int d = this.a.d(view);
        coordinatorLayout.onLayoutChild(view, i);
        this.F = coordinatorLayout.getWidth();
        switch (this.a.a) {
            case 0:
                left = coordinatorLayout.getLeft();
                break;
            default:
                left = coordinatorLayout.getRight();
                break;
        }
        this.G = left;
        this.E = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.a.a) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i2 = 0;
        }
        this.H = i2;
        int i8 = this.A;
        if (i8 == 1 || i8 == 2) {
            i5 = d - this.a.d(view);
        } else if (i8 != 3) {
            if (i8 != 5) {
                w511.d(this.A, "Unexpected value: ");
                return false;
            }
            i5 = this.a.b();
        }
        WeakHashMap weakHashMap3 = androidx.core.view.b.a;
        view.offsetLeftAndRight(i5);
        if (this.J == null && (i3 = this.K) != -1 && (findViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.J = new WeakReference(findViewById);
        }
        for (uas0 uas0Var : this.O) {
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void p(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            savedState.getSuperState();
        }
        int i = savedState.state;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.A = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final Parcelable q(View view) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (SideSheetBehavior<?>) this);
    }

    @Override // defpackage.b710
    public final void startBackProgress(je4 je4Var) {
        d dVar = this.M;
        if (dVar == null) {
            return;
        }
        dVar.f = je4Var;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.A == 1 && actionMasked == 0) {
            return true;
        }
        if (w()) {
            this.B.l(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.L) != null) {
            velocityTracker.recycle();
            this.L = null;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        if (w() && actionMasked == 2 && !this.C && w()) {
            float abs = Math.abs(this.N - motionEvent.getX());
            androidx.customview.widget.a aVar = this.B;
            if (abs > aVar.b) {
                aVar.c(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.C;
    }

    public final void u(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(oyr.t(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.I;
        if (weakReference == null || weakReference.get() == null) {
            v(i);
            return;
        }
        View view = (View) this.I.get();
        xm2 xm2Var = new xm2(this, i, 20);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(xm2Var);
        } else {
            xm2Var.run();
        }
    }

    @Override // defpackage.b710
    public final void updateBackProgress(je4 je4Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        d dVar = this.M;
        if (dVar == null) {
            return;
        }
        c9y c9yVar = this.a;
        int i = (c9yVar == null || c9yVar.e() == 0) ? 5 : 3;
        je4 je4Var2 = dVar.f;
        dVar.f = je4Var;
        if (je4Var2 != null) {
            dVar.c(i, je4Var.c, je4Var.d == 0);
        }
        WeakReference weakReference = this.I;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.I.get();
        WeakReference weakReference2 = this.J;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.a.i(marginLayoutParams, (int) ((view.getScaleX() * this.E) + this.H));
        view2.requestLayout();
    }

    public final void v(int i) {
        View view;
        if (this.A == i) {
            return;
        }
        this.A = i;
        WeakReference weakReference = this.I;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.A == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            ((uas0) it.next()).a(i);
        }
        y();
    }

    public final boolean w() {
        if (this.B != null) {
            return this.z || this.A == 1;
        }
        return false;
    }

    public final void x(int i, View view, boolean z) {
        int a;
        if (i == 3) {
            a = this.a.a();
        } else {
            if (i != 5) {
                ny61.g(oyr.i(i, "Invalid state to get outer edge offset: "));
                return;
            }
            a = this.a.b();
        }
        androidx.customview.widget.a aVar = this.B;
        if (aVar == null || (!z ? aVar.t(a, view.getTop(), view) : aVar.r(a, view.getTop()))) {
            v(i);
        } else {
            v(2);
            this.x.a(i);
        }
    }

    public final void y() {
        View view;
        WeakReference weakReference = this.I;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        androidx.core.view.b.n(262144, view);
        androidx.core.view.b.j(0, view);
        androidx.core.view.b.n(1048576, view);
        androidx.core.view.b.j(0, view);
        int i = 9;
        int i2 = 5;
        if (this.A != 5) {
            androidx.core.view.b.o(view, ph.o, null, new jy4(this, i2, i));
        }
        int i3 = 3;
        if (this.A != 3) {
            androidx.core.view.b.o(view, ph.m, null, new jy4(this, i3, i));
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.1
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
        final int state;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.state = sideSheetBehavior.A;
        }
    }

    public SideSheetBehavior() {
        this.x = new xe6(this);
        this.z = true;
        this.A = 5;
        this.D = 0.1f;
        this.K = -1;
        this.O = new LinkedHashSet();
        this.P = new r52(5, this);
    }
}
