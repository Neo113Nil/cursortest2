package com.yandex.plus.home.feature.webviews.internal.container.modal;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.e;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.jq31;
import defpackage.jx81;
import defpackage.n030;
import defpackage.ny61;
import defpackage.org0;
import defpackage.oyr;
import defpackage.ph;
import defpackage.uk10;
import defpackage.we6;
import defpackage.xz;
import defpackage.z2i0;
import defpackage.z52;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public class ModalViewBehavior<V extends View> extends CoordinatorLayout.a {
    public static final int s0 = g2i0.Widget_Design_BottomSheet_Modal;
    public final boolean A;
    public MaterialShapeDrawable B;
    public final int C;
    public int D;
    public int E;
    public final boolean F;
    public b G;
    public boolean H;
    public z52 I;
    public final ValueAnimator J;
    public final int K;
    public int L;
    public int M;
    public final float N;
    public int O;
    public final float P;
    public boolean Q;
    public float R;
    public float S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public com.yandex.plus.home.feature.webviews.internal.container.modal.a Z;
    public final int a;
    public boolean a0;
    public boolean b;
    public int b0;
    public final float c;
    public boolean c0;
    public int d0;
    public int e0;
    public int f0;
    public WeakReference g0;
    public WeakReference h0;
    public final ArrayList i0;
    public VelocityTracker j0;
    public int k0;
    public int l0;
    public int m0;
    public final int n0;
    public boolean o0;
    public boolean p0;
    public HashMap q0;
    public final n030 r0;
    public int w;
    public boolean x;
    public int y;
    public final int z;

    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract void a(int i);
    }

    public ModalViewBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.a = 0;
        this.b = true;
        this.C = -1;
        this.D = -1;
        this.I = null;
        this.N = 0.5f;
        this.P = -1.0f;
        this.R = 0.0f;
        this.S = 1.0f;
        this.T = -1;
        this.V = true;
        this.W = 4;
        this.i0 = new ArrayList();
        this.n0 = 0;
        this.o0 = false;
        this.r0 = new n030(this);
        this.z = context.getResources().getDimensionPixelSize(org0.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.BottomSheetBehavior_Layout);
        this.A = obtainStyledAttributes.hasValue(z2i0.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(z2i0.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            v(context, attributeSet, hasValue, jx81.o(context, obtainStyledAttributes, z2i0.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            v(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.J = ofFloat;
        ofFloat.setDuration(500L);
        this.J.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MaterialShapeDrawable materialShapeDrawable = ModalViewBehavior.this.B;
                if (materialShapeDrawable != null) {
                    materialShapeDrawable.setInterpolation(floatValue);
                }
            }
        });
        this.P = obtainStyledAttributes.getDimension(z2i0.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(z2i0.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.C = obtainStyledAttributes.getDimensionPixelSize(z2i0.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (obtainStyledAttributes.hasValue(z2i0.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.D = obtainStyledAttributes.getDimensionPixelSize(z2i0.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(z2i0.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || (i = peekValue.data) != -1) {
            B(obtainStyledAttributes.getDimensionPixelSize(z2i0.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            B(i);
        }
        boolean z = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_behavior_hideable, false);
        if (this.Q != z) {
            this.Q = z;
            if (!z && this.W == 5) {
                C(4);
            }
            H();
        }
        this.F = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z2 = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.g0 != null) {
                u();
            }
            D((this.b && this.W == 6) ? 3 : this.W);
            H();
        }
        this.U = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.V = obtainStyledAttributes.getBoolean(z2i0.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.a = obtainStyledAttributes.getInt(z2i0.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = obtainStyledAttributes.getFloat(z2i0.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            ny61.g("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.N = f;
        if (this.g0 != null) {
            this.M = (int) ((1.0f - f) * this.f0);
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(z2i0.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(z2i0.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
            if (dimensionPixelOffset < 0) {
                ny61.g("offset must be greater than or equal to 0");
                throw null;
            }
            this.K = dimensionPixelOffset;
        } else {
            int i2 = peekValue2.data;
            if (i2 < 0) {
                ny61.g("offset must be greater than or equal to 0");
                throw null;
            }
            this.K = i2;
        }
        obtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.n0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static int y(int i, int i2, int i3, int i4) {
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

    public final void A() {
        this.k0 = -1;
        VelocityTracker velocityTracker = this.j0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.j0 = null;
        }
    }

    public final void B(int i) {
        boolean z = this.x;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.x = true;
            }
        } else {
            if (!z && this.w == i) {
                return;
            }
            this.x = false;
            this.w = Math.max(0, i);
        }
        K();
    }

    public final void C(int i) {
        if (i == this.W) {
            return;
        }
        if (this.g0 == null) {
            if (i == 4 || i == 3 || i == 6 || (this.Q && i == 5)) {
                this.W = i;
                return;
            }
            return;
        }
        View view = (View) this.g0.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (view.isAttachedToWindow()) {
                view.post(new xz((CoordinatorLayout.a) this, view, i, 5));
                return;
            }
        }
        E(i, view);
    }

    public final void D(int i) {
        if (this.W == i) {
            return;
        }
        this.W = i;
        WeakReference weakReference = this.g0;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            J(true);
        } else if (i == 6 || i == 5 || i == 4) {
            J(false);
        }
        I(i);
        while (true) {
            ArrayList arrayList = this.i0;
            if (i2 >= arrayList.size()) {
                H();
                return;
            } else {
                ((a) arrayList.get(i2)).a(i);
                i2++;
            }
        }
    }

    public final void E(int i, View view) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.O;
        } else if (i == 6) {
            i2 = this.M;
            if (this.b && i2 <= (i3 = this.L)) {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = z();
        } else {
            if (!this.Q || i != 5) {
                ny61.g(oyr.i(i, "Illegal state argument: "));
                return;
            }
            i2 = this.f0;
        }
        G(view, i, i2, false);
    }

    public final boolean F(float f, View view) {
        if ((f * 0.1f) + view.getTop() > (view.getHeight() * this.R) + this.K) {
            return this.U || view.getTop() > this.O;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        r4.I = new defpackage.z52(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        r7 = r4.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (r7.c != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        r7.b = r6;
        r6 = androidx.core.view.b.a;
        r5.postOnAnimation(r7);
        r4.I.c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r7.b = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r7 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r0.f(r8, r7, (int) r0.m.getXVelocity(r0.d), (int) r0.m.getYVelocity(r0.d)) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        D(2);
        I(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if (r4.I != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(View view, int i, int i2, boolean z) {
        com.yandex.plus.home.feature.webviews.internal.container.modal.a aVar = this.Z;
        if (aVar != null) {
            if (z) {
                int left = view.getLeft();
                if (!aVar.t) {
                    ny61.r("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                    return;
                }
            } else {
                int left2 = view.getLeft();
                aVar.s = view;
                aVar.d = -1;
                boolean f = aVar.f(left2, i2, 0, 0);
                if (!f && aVar.b == 0 && aVar.s != null) {
                    aVar.s = null;
                }
            }
        }
        D(i);
    }

    public final void H() {
        View view;
        WeakReference weakReference = this.g0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        androidx.core.view.b.n(524288, view);
        androidx.core.view.b.j(0, view);
        androidx.core.view.b.n(262144, view);
        androidx.core.view.b.j(0, view);
        androidx.core.view.b.n(1048576, view);
        androidx.core.view.b.j(0, view);
        if (this.Q && this.W != 5) {
            androidx.core.view.b.o(view, ph.o, null, new we6(this, 5, 7));
        }
        int i = this.W;
        if (i == 3) {
            androidx.core.view.b.o(view, ph.n, null, new we6(this, this.b ? 4 : 6, 7));
            return;
        }
        if (i == 4) {
            androidx.core.view.b.o(view, ph.m, null, new we6(this, this.b ? 3 : 6, 7));
        } else {
            if (i != 6) {
                return;
            }
            androidx.core.view.b.o(view, ph.n, null, new we6(this, 4, 7));
            androidx.core.view.b.o(view, ph.m, null, new we6(this, 3, 7));
        }
    }

    public final void I(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.H != z) {
            this.H = z;
            if (this.B == null || (valueAnimator = this.J) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            valueAnimator.setFloatValues(1.0f - f, f);
            valueAnimator.start();
        }
    }

    public final void J(boolean z) {
        WeakReference weakReference = this.g0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.q0 != null) {
                    return;
                } else {
                    this.q0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.g0.get() && z) {
                    this.q0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.q0 = null;
        }
    }

    public final void K() {
        View view;
        if (this.g0 != null) {
            u();
            if (this.W != 4 || (view = (View) this.g0.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void d(CoordinatorLayout.LayoutParams layoutParams) {
        this.g0 = null;
        this.Z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void g() {
        this.g0 = null;
        this.Z = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r3 != 3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d5, code lost:
    
        if (r17.o0 != false) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a3 A[EDGE_INSN: B:81:0x01a3->B:70:0x01a3 BREAK  A[LOOP:0: B:54:0x0133->B:79:0x01a0], SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        com.yandex.plus.home.feature.webviews.internal.container.modal.a aVar;
        boolean z;
        View e;
        if (!view.isShown() || !this.V) {
            this.a0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            A();
        }
        if (this.j0 == null) {
            this.j0 = VelocityTracker.obtain();
        }
        this.j0.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float abs = Math.abs(this.l0 - motionEvent.getX());
                    float abs2 = Math.abs(this.m0 - motionEvent.getY());
                    this.o0 = abs2 > abs && abs2 > ((float) this.n0);
                }
            }
            this.p0 = false;
            this.k0 = -1;
            if (this.a0) {
                this.a0 = false;
                return false;
            }
            this.o0 = false;
        } else {
            this.l0 = (int) motionEvent.getX();
            this.m0 = (int) motionEvent.getY();
            if (this.W != 2) {
                WeakReference weakReference = this.h0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, this.l0, this.m0)) {
                    this.k0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.p0 = true;
                }
            }
            this.a0 = this.k0 == -1 && !coordinatorLayout.isPointInChildBounds(view, this.l0, this.m0);
        }
        if (!this.a0 && (aVar = this.Z) != null) {
            jq31 jq31Var = aVar.r;
            int actionMasked2 = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked2 == 0) {
                aVar.a();
            }
            if (aVar.m == null) {
                aVar.m = VelocityTracker.obtain();
            }
            aVar.m.addMovement(motionEvent);
            if (actionMasked2 != 0) {
                if (actionMasked2 != 1) {
                    if (actionMasked2 != 2) {
                        if (actionMasked2 != 3) {
                            if (actionMasked2 == 5) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                float x = motionEvent.getX(actionIndex);
                                float y = motionEvent.getY(actionIndex);
                                aVar.i(x, y, pointerId);
                                int i = aVar.b;
                                if (i == 0) {
                                    int i2 = aVar.i[pointerId];
                                } else if (i == 2 && (e = aVar.e((int) x, (int) y)) == aVar.s) {
                                    aVar.l(pointerId, e);
                                }
                            } else if (actionMasked2 == 6) {
                                aVar.c(motionEvent.getPointerId(actionIndex));
                            }
                        }
                    } else if (aVar.e != null && aVar.f != null) {
                        int pointerCount = motionEvent.getPointerCount();
                        for (int i3 = 0; i3 < pointerCount; i3++) {
                            int pointerId2 = motionEvent.getPointerId(i3);
                            if (aVar.g(pointerId2)) {
                                float x2 = motionEvent.getX(i3);
                                float y2 = motionEvent.getY(i3);
                                float f = aVar.e[pointerId2];
                                float f2 = y2 - aVar.f[pointerId2];
                                View e2 = aVar.e((int) x2, (int) y2);
                                if (e2 != null) {
                                    jq31Var.getClass();
                                    if (jq31Var.c() > 0 && Math.abs(f2) > aVar.c) {
                                        z = true;
                                        if (z) {
                                            e2.getLeft();
                                            jq31Var.a(e2);
                                            int top = e2.getTop();
                                            int b = jq31Var.b(((int) f2) + top);
                                            int c = jq31Var.c();
                                            if (c == 0) {
                                                break;
                                            }
                                            if (c > 0 && b == top) {
                                                break;
                                            }
                                        }
                                        int i4 = aVar.i[pointerId2];
                                        if (aVar.b == 1) {
                                            break;
                                        }
                                        if (z && aVar.l(pointerId2, e2)) {
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                if (z) {
                                }
                                int i42 = aVar.i[pointerId2];
                                if (aVar.b == 1) {
                                }
                            }
                        }
                        aVar.j(motionEvent);
                    }
                }
                aVar.a();
            } else {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                int pointerId3 = motionEvent.getPointerId(0);
                aVar.i(x3, y3, pointerId3);
                View e3 = aVar.e((int) x3, (int) y3);
                if (e3 == aVar.s && aVar.b == 2) {
                    aVar.l(pointerId3, e3);
                }
                int i5 = aVar.i[pointerId3];
            }
            if (aVar.b == 1) {
            }
        }
        WeakReference weakReference2 = this.h0;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.a0 || this.W == 1 || coordinatorLayout.isPointInChildBounds(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.Z == null || !this.o0 || Math.abs(((float) this.m0) - motionEvent.getY()) <= ((float) this.Z.c)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        MaterialShapeDrawable materialShapeDrawable;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.g0 == null) {
            this.y = coordinatorLayout.getResources().getDimensionPixelSize(org0.design_bottom_sheet_peek_height_min);
            if (!this.F && !this.x) {
                e.c(view, new uk10(this));
            }
            this.g0 = new WeakReference(view);
            if (this.A && (materialShapeDrawable = this.B) != null) {
                view.setBackground(materialShapeDrawable);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.B;
            if (materialShapeDrawable2 != null) {
                float f = this.P;
                if (f == -1.0f) {
                    f = ViewCompat$Api21Impl.f(view);
                }
                materialShapeDrawable2.setElevation(f);
                boolean z = this.W == 3;
                this.H = z;
                this.B.setInterpolation(z ? 0.0f : 1.0f);
            }
            H();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Z == null) {
            this.Z = new com.yandex.plus.home.feature.webviews.internal.container.modal.a(coordinatorLayout.getContext(), coordinatorLayout, this.r0);
        }
        com.yandex.plus.home.feature.webviews.internal.container.modal.a aVar = this.Z;
        int i2 = this.T;
        aVar.getClass();
        if (i2 < 0) {
            i2 = -1;
        }
        aVar.a = i2;
        int top = view.getTop();
        coordinatorLayout.onLayoutChild(view, i);
        this.e0 = coordinatorLayout.getWidth();
        this.f0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.d0 = height;
        int i3 = this.f0;
        if (i3 <= height) {
            int i4 = this.D;
            if (i4 != -1) {
                i3 = Math.min(i3, i4);
            }
            this.d0 = i3;
        }
        this.L = Math.max(0, this.f0 - this.d0);
        this.M = (int) ((1.0f - this.N) * this.f0);
        u();
        int i5 = this.W;
        if (i5 == 3) {
            view.offsetTopAndBottom(z());
        } else if (i5 == 6) {
            view.offsetTopAndBottom(this.M);
        } else if (this.Q && i5 == 5) {
            view.offsetTopAndBottom(this.f0);
        } else if (i5 == 4) {
            view.offsetTopAndBottom(this.O);
        } else if (i5 == 1 || i5 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        this.h0 = new WeakReference(x(view));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(y(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.C, marginLayoutParams.width), y(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.D, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean k(float f, float f2, View view) {
        WeakReference weakReference = this.h0;
        return (weakReference == null || view != weakReference.get() || this.W == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.h0;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < z()) {
                int z = top - z();
                iArr[1] = z;
                int i5 = -z;
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                view.offsetTopAndBottom(i5);
                D(3);
            } else {
                if (!this.V) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                view.offsetTopAndBottom(-i2);
                D(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.O;
            if (i4 > i6 && !this.Q) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = androidx.core.view.b.a;
                view.offsetTopAndBottom(i8);
                D(4);
            } else {
                if (!this.V) {
                    return;
                }
                int round = Math.round(i2 * this.S);
                iArr[1] = round;
                WeakHashMap weakHashMap4 = androidx.core.view.b.a;
                view.offsetTopAndBottom(-round);
                D(1);
            }
        }
        w(view.getTop());
        this.b0 = i2;
        this.c0 = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void p(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        savedState.getSuperState();
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.w = savedState.peekHeight;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = savedState.fitToContents;
            }
            if (i == -1 || (i & 4) == 4) {
                this.Q = savedState.hideable;
            }
            if (i == -1 || (i & 8) == 8) {
                this.U = savedState.skipCollapsed;
            }
        }
        int i2 = savedState.state;
        if (i2 == 1 || i2 == 2) {
            this.W = 4;
        } else {
            this.W = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final Parcelable q(View view) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (ModalViewBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.b0 = 0;
        this.c0 = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == z()) {
            D(3);
            return;
        }
        WeakReference weakReference = this.h0;
        if (weakReference != null && view2 == weakReference.get() && this.c0) {
            int i4 = this.b0;
            int i5 = this.K;
            if (i4 <= 0) {
                if (this.Q) {
                    VelocityTracker velocityTracker = this.j0;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.c);
                        yVelocity = this.j0.getYVelocity(this.k0);
                    }
                    if (F(yVelocity, view)) {
                        i2 = this.f0;
                        i3 = 5;
                    }
                }
                if (this.b0 == 0) {
                    int top = view.getTop();
                    if (!this.b) {
                        int i6 = this.M;
                        int i7 = this.O;
                        if (top < i6) {
                            if (top >= Math.abs(top - i7)) {
                                i5 = this.M;
                            }
                            i2 = i5;
                        } else if (Math.abs(top - i6) < Math.abs(top - i7)) {
                            i5 = this.M;
                        } else {
                            i5 = this.O;
                            i3 = 4;
                            i2 = i5;
                        }
                        i3 = 6;
                        i2 = i5;
                    } else if (Math.abs(top - this.L) < Math.abs(top - this.O)) {
                        i5 = this.L;
                        i2 = i5;
                    } else {
                        i5 = this.O;
                        i3 = 4;
                        i2 = i5;
                    }
                } else {
                    if (this.b) {
                        i2 = this.O;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - this.M) < Math.abs(top2 - this.O)) {
                            i2 = this.M;
                            i3 = 6;
                        } else {
                            i2 = this.O;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.b) {
                i2 = this.L;
            } else {
                int top3 = view.getTop();
                int i8 = this.M;
                if (top3 > i8) {
                    i3 = 6;
                    i5 = i8;
                }
                i2 = i5;
            }
            G(view, i3, i2, false);
            this.c0 = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i3 = this.W;
        if (i3 == 1 && actionMasked == 0) {
            return true;
        }
        com.yandex.plus.home.feature.webviews.internal.container.modal.a aVar = this.Z;
        if (aVar != null && (this.V || i3 == 1)) {
            aVar.getClass();
            jq31 jq31Var = aVar.r;
            int actionMasked2 = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked2 == 0) {
                aVar.a();
            }
            if (aVar.m == null) {
                aVar.m = VelocityTracker.obtain();
            }
            aVar.m.addMovement(motionEvent);
            if (actionMasked2 == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View e = aVar.e((int) x, (int) y);
                aVar.i(x, y, pointerId);
                aVar.l(pointerId, e);
                int i4 = aVar.i[pointerId];
            } else if (actionMasked2 == 1) {
                if (aVar.b == 1) {
                    aVar.h();
                }
                aVar.a();
            } else if (actionMasked2 != 2) {
                if (actionMasked2 == 3) {
                    if (aVar.b == 1) {
                        aVar.t = true;
                        jq31Var.f(aVar.s, 0.0f, 0.0f);
                        aVar.t = false;
                        if (aVar.b == 1) {
                            aVar.k(0);
                        }
                    }
                    aVar.a();
                } else if (actionMasked2 == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x2 = motionEvent.getX(actionIndex);
                    float y2 = motionEvent.getY(actionIndex);
                    aVar.i(x2, y2, pointerId2);
                    if (aVar.b == 0) {
                        aVar.l(pointerId2, aVar.e((int) x2, (int) y2));
                        int i5 = aVar.i[pointerId2];
                    } else {
                        int i6 = (int) x2;
                        int i7 = (int) y2;
                        View view2 = aVar.s;
                        if (view2 != null && i6 >= view2.getLeft() && i6 < view2.getRight() && i7 >= view2.getTop() && i7 < view2.getBottom()) {
                            aVar.l(pointerId2, aVar.s);
                        }
                    }
                } else if (actionMasked2 == 6) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    if (aVar.b == 1 && pointerId3 == aVar.d) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (true) {
                            if (i2 >= pointerCount) {
                                i = -1;
                                break;
                            }
                            int pointerId4 = motionEvent.getPointerId(i2);
                            if (pointerId4 != aVar.d) {
                                View e2 = aVar.e((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                View view3 = aVar.s;
                                if (e2 == view3 && aVar.l(pointerId4, view3)) {
                                    i = aVar.d;
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (i == -1) {
                            aVar.h();
                        }
                    }
                    aVar.c(pointerId3);
                }
            } else if (aVar.b != 1) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (i2 < pointerCount2) {
                    int pointerId5 = motionEvent.getPointerId(i2);
                    if (aVar.g(pointerId5)) {
                        float x3 = motionEvent.getX(i2);
                        float y3 = motionEvent.getY(i2);
                        float f = aVar.e[pointerId5];
                        float f2 = y3 - aVar.f[pointerId5];
                        int i8 = aVar.i[pointerId5];
                        if (aVar.b == 1) {
                            break;
                        }
                        View e3 = aVar.e((int) x3, (int) y3);
                        if (e3 != null) {
                            jq31Var.getClass();
                            if (jq31Var.c() > 0 && Math.abs(f2) > aVar.c && aVar.l(pointerId5, e3)) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2++;
                }
                aVar.j(motionEvent);
            } else if (aVar.g(aVar.d)) {
                int findPointerIndex = motionEvent.findPointerIndex(aVar.d);
                float x4 = motionEvent.getX(findPointerIndex);
                float y4 = motionEvent.getY(findPointerIndex);
                float[] fArr = aVar.g;
                int i9 = aVar.d;
                int i10 = (int) (x4 - fArr[i9]);
                int i11 = (int) (y4 - aVar.h[i9]);
                aVar.s.getLeft();
                int top = aVar.s.getTop() + i11;
                int left = aVar.s.getLeft();
                int top2 = aVar.s.getTop();
                if (i10 != 0) {
                    int a2 = jq31Var.a(aVar.s);
                    View view4 = aVar.s;
                    int i12 = a2 - left;
                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                    view4.offsetLeftAndRight(i12);
                }
                if (i11 != 0) {
                    top = jq31Var.b(top);
                    WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                    aVar.s.offsetTopAndBottom(top - top2);
                }
                if (i10 != 0 || i11 != 0) {
                    jq31Var.e(top);
                }
                aVar.j(motionEvent);
            }
        }
        if (actionMasked == 0) {
            A();
        }
        if (this.j0 == null) {
            this.j0 = VelocityTracker.obtain();
        }
        this.j0.addMovement(motionEvent);
        if (this.Z != null && ((this.V || this.W == 1) && actionMasked == 2 && !this.a0)) {
            float abs = Math.abs(this.m0 - motionEvent.getY());
            com.yandex.plus.home.feature.webviews.internal.container.modal.a aVar2 = this.Z;
            if (abs > aVar2.c) {
                aVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.a0;
    }

    public final void u() {
        int i;
        int min = this.x ? Math.min(Math.max(this.y, this.f0 - ((this.e0 * 9) / 16)), this.d0) : (this.F || (i = this.E) <= 0) ? this.w : Math.max(this.w, i + this.z);
        boolean z = this.b;
        int i2 = this.f0;
        if (z) {
            this.O = Math.max(i2 - min, this.L);
        } else {
            this.O = i2 - min;
        }
    }

    public final void v(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.A) {
            this.G = b.j(context, attributeSet, eng0.bottomSheetStyle, s0).a();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.G);
            this.B = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            if (z && colorStateList != null) {
                this.B.setFillColor(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.B.setTint(typedValue.data);
        }
    }

    public final void w(int i) {
        if (((View) this.g0.get()) != null) {
            ArrayList arrayList = this.i0;
            if (arrayList.isEmpty()) {
                return;
            }
            if (i <= this.O) {
                z();
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((a) arrayList.get(i2)).getClass();
            }
        }
    }

    public final View x(View view) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (ViewCompat$Api21Impl.j(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View x = x(viewGroup.getChildAt(i));
            if (x != null) {
                return x;
            }
        }
        return null;
    }

    public final int z() {
        return this.b ? this.L : this.K;
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior.SavedState.1
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

        public SavedState(Parcelable parcelable, ModalViewBehavior<?> modalViewBehavior) {
            super(parcelable);
            this.state = modalViewBehavior.W;
            this.peekHeight = modalViewBehavior.w;
            this.fitToContents = modalViewBehavior.b;
            this.hideable = modalViewBehavior.Q;
            this.skipCollapsed = modalViewBehavior.U;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    public ModalViewBehavior() {
        this.a = 0;
        this.b = true;
        this.C = -1;
        this.D = -1;
        this.I = null;
        this.N = 0.5f;
        this.P = -1.0f;
        this.R = 0.0f;
        this.S = 1.0f;
        this.T = -1;
        this.V = true;
        this.W = 4;
        this.i0 = new ArrayList();
        this.n0 = 0;
        this.o0 = false;
        this.r0 = new n030(this);
    }
}
