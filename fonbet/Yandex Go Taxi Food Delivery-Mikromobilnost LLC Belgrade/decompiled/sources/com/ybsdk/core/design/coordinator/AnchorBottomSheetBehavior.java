package com.ybsdk.core.design.coordinator;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.customview.widget.a;
import com.ybsdk.core.design.widget.SlideableModalView;
import defpackage.b62;
import defpackage.d62;
import defpackage.ddf;
import defpackage.nwt0;
import defpackage.ny61;
import defpackage.o290;
import defpackage.owt0;
import defpackage.oyr;
import defpackage.qgn0;
import defpackage.r52;
import defpackage.s52;
import defpackage.sor;
import defpackage.t3i0;
import defpackage.u52;
import defpackage.unr0;
import defpackage.vvg0;
import defpackage.x52;
import defpackage.z52;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class AnchorBottomSheetBehavior<V extends View> extends CoordinatorLayout.a {
    public int A;
    public int B;
    public boolean C;
    public final boolean D;
    public int E;
    public a F;
    public boolean G;
    public boolean H;
    public int I;
    public WeakReference J;
    public WeakReference K;
    public u52 L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public z52 Q;
    public boolean R;
    public boolean S;
    public final boolean T;
    public final boolean U;
    public s52 V;
    public boolean W;
    public b62 Z;
    public final sor a;
    public boolean a0;
    public final nwt0 b;
    public boolean b0;
    public int c;
    public int c0;
    public final r52 d0;
    public boolean w;
    public int x;
    public int[] y;
    public int z;

    public AnchorBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        sor sorVar = new sor();
        this.a = sorVar;
        this.b = new nwt0(sorVar);
        this.y = new int[]{0};
        this.E = 6;
        this.S = true;
        this.T = true;
        this.U = true;
        this.W = true;
        this.a0 = false;
        this.b0 = false;
        this.d0 = new r52(0, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t3i0.YbSdkAnchorBottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(t3i0.YbSdkAnchorBottomSheetBehavior_Layout_ybsdk_bottomSheetPeekHeight);
        if (peekValue == null || (i = peekValue.data) != -1) {
            D(obtainStyledAttributes.getDimensionPixelSize(t3i0.YbSdkAnchorBottomSheetBehavior_Layout_ybsdk_bottomSheetPeekHeight, -1), false);
        } else {
            D(i, false);
        }
        this.C = obtainStyledAttributes.getBoolean(t3i0.YbSdkAnchorBottomSheetBehavior_Layout_ybsdk_bottomSheetHideable, false);
        this.D = obtainStyledAttributes.getBoolean(t3i0.YbSdkAnchorBottomSheetBehavior_Layout_ybsdk_bottomSheetSkipCollapsed, false);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t3i0.YbSdkAnchorBottomSheetBehavior_Layout);
        try {
            this.y[0] = (int) obtainStyledAttributes2.getDimension(t3i0.YbSdkAnchorBottomSheetBehavior_Layout_ybsdk_bottomSheetAnchorOffset, 0.0f);
        } catch (Exception unused) {
            this.y[0] = 0;
        }
        this.E = obtainStyledAttributes2.getInt(t3i0.YbSdkAnchorBottomSheetBehavior_Layout_ybsdk_bottomSheetDefaultState, this.E);
        obtainStyledAttributes2.recycle();
        ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.b.u = new owt0();
    }

    public static void A(int i, View view) {
        WeakHashMap weakHashMap = b.a;
        view.offsetTopAndBottom(i);
    }

    public static AnchorBottomSheetBehavior x(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            ny61.g("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof AnchorBottomSheetBehavior) {
            return (AnchorBottomSheetBehavior) behavior;
        }
        ny61.g("The view is not associated with AnchorBottomSheetBehavior");
        return null;
    }

    public final int B(int i, boolean z, int... iArr) {
        int i2 = iArr[0];
        Arrays.sort(iArr);
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (!Arrays.equals(this.y, iArr) || this.z != binarySearch) {
            this.y = iArr;
            this.z = binarySearch;
            if (z) {
                WeakReference weakReference = this.J;
                E(6, weakReference == null ? null : (View) weakReference.get(), true);
                G(6, true, true);
            }
        }
        return this.z;
    }

    public final void C(View view) {
        if (view == null) {
            return;
        }
        WeakReference weakReference = this.K;
        if (weakReference == null || ((View) weakReference.get()) != view) {
            WeakHashMap weakHashMap = b.a;
            if (!ViewCompat$Api21Impl.j(view)) {
                if (view instanceof ViewGroup) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(view);
                    while (!linkedList.isEmpty()) {
                        ViewGroup viewGroup = (ViewGroup) linkedList.removeFirst();
                        int childCount = viewGroup.getChildCount();
                        int i = 0;
                        while (true) {
                            if (i >= childCount) {
                                view = null;
                                break;
                            }
                            View childAt = viewGroup.getChildAt(i);
                            if (childAt != null) {
                                WeakHashMap weakHashMap2 = b.a;
                                if (ViewCompat$Api21Impl.j(childAt)) {
                                    view = childAt;
                                    break;
                                }
                            }
                            if (childAt instanceof ViewGroup) {
                                linkedList.add(childAt);
                            }
                            i++;
                        }
                        if (view != null) {
                            break;
                        }
                    }
                }
                view = null;
            }
            this.K = new WeakReference(view);
        }
    }

    public final void D(int i, boolean z) {
        int i2;
        b62 b62Var;
        View view;
        boolean z2 = this.w;
        if (i == -1) {
            if (z2) {
                return;
            } else {
                this.w = true;
            }
        } else {
            if (!z2 && this.c == i) {
                return;
            }
            this.w = false;
            this.c = Math.max(0, i);
            this.B = this.I - i;
        }
        WeakReference weakReference = this.J;
        if (weakReference != null) {
            z52 z52Var = this.Q;
            if (z52Var != null) {
                i2 = z52Var.b;
            } else {
                i2 = this.E;
                if (i2 == 2 && (b62Var = this.Z) != null) {
                    i2 = b62Var.b;
                }
            }
            if (i2 == 4 && (view = (View) weakReference.get()) != null && z) {
                E(4, view, true);
                G(4, true, true);
            }
        }
    }

    public final void E(int i, View view, boolean z) {
        b62 b62Var = this.Z;
        if (b62Var != null && view != null) {
            view.removeCallbacks(b62Var);
        }
        if (this.a0) {
            this.Z = new d62(this, view, i, 0);
        } else {
            this.Z = new d62(this, view, i, 1);
        }
        H(2, z);
    }

    public final void F(int i) {
        G(i, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(int i, boolean z, boolean z2) {
        boolean z3;
        if (i != 3 && i != 4) {
            if (i == 5) {
                z3 = this.C;
            } else if (i != 6 && i != 7) {
                z3 = false;
            }
            if (z3) {
                return;
            }
            this.P = false;
            WeakReference weakReference = this.J;
            if (weakReference == null) {
                this.E = i;
                return;
            }
            View view = (View) weakReference.get();
            if (view == null) {
                return;
            }
            z52 z52Var = this.Q;
            if (z52Var != null) {
                view.removeCallbacks(z52Var);
                this.Q = null;
            }
            if (i == this.E) {
                return;
            }
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = b.a;
                if (view.isAttachedToWindow()) {
                    z52 z52Var2 = new z52(this, view, i, z2, 0);
                    this.Q = z52Var2;
                    view.post(z52Var2);
                    return;
                }
            }
            I(i, view, z2);
            return;
        }
        z3 = true;
        if (z3) {
        }
    }

    public final void H(int i, boolean z) {
        u52 u52Var;
        View view;
        this.R = z;
        b62 b62Var = this.Z;
        if (b62Var != null && i != 2 && (view = b62Var.a) != null) {
            view.removeCallbacks(b62Var);
            Thread.currentThread().getStackTrace();
            this.Z = null;
        }
        if (this.E == i) {
            return;
        }
        this.E = i;
        WeakReference weakReference = this.J;
        if ((weakReference != null ? (View) weakReference.get() : null) == null || (u52Var = this.L) == null) {
            return;
        }
        boolean z2 = this.P;
        SlideableModalView slideableModalView = (SlideableModalView) ((qgn0) u52Var).b;
        if (i == 4) {
            slideableModalView.onCollapsedStateInternal();
        }
        slideableModalView.onBehaviorStateChanged(i, z2);
    }

    public final void I(int i, View view, boolean z) {
        int i2;
        if (i == 4) {
            i2 = this.B;
        } else if (i == 3 || i == 7) {
            i2 = this.A;
        } else if (i == 6) {
            i2 = this.y[this.z];
        } else {
            if (!this.C || i != 5) {
                ny61.g(oyr.i(i, "Illegal state argument: "));
                return;
            }
            i2 = this.I;
        }
        if (this.a0) {
            nwt0 nwt0Var = this.b;
            nwt0Var.c();
            nwt0Var.a = 0.0f;
            nwt0Var.u.i = i2;
        }
        if (this.a0 || this.F.t(view.getLeft(), i2, view)) {
            u(view, i, i2, z);
        } else {
            H(i, false);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.F != null && v()) {
            if (!view.isShown()) {
                this.G = true;
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (this.G && (actionMasked == 1 || actionMasked == 3)) {
                this.G = false;
                return false;
            }
            if (actionMasked == 0) {
                this.M = -1;
            }
            WeakReference weakReference = this.K;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (actionMasked == 1 || actionMasked == 3) {
                this.O = false;
                this.M = -1;
            } else if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                this.N = y;
                if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x, y)) {
                    this.M = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.O = true;
                }
                this.G = this.M == -1 && !coordinatorLayout.isPointInChildBounds(view, x, this.N);
            }
            float abs = Math.abs(this.N - motionEvent.getY());
            a aVar = this.F;
            boolean z = abs > ((float) aVar.b);
            if ((!this.G && aVar.s(motionEvent)) || (actionMasked == 2 && view2 != null && !this.G && this.E != 1 && !coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && z)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        if (coordinatorLayout.getHeight() == 0 || coordinatorLayout.getWidth() == 0) {
            return false;
        }
        WeakHashMap weakHashMap = b.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        coordinatorLayout.onLayoutChild(view, i);
        this.I = coordinatorLayout.getHeight();
        int width = coordinatorLayout.getWidth();
        if (this.w) {
            if (this.x == 0) {
                this.x = coordinatorLayout.getResources().getDimensionPixelSize(vvg0.ybsdk_bottom_sheet_peek_height_min);
            }
            int i3 = this.x;
            int i4 = this.I;
            i2 = Math.max(i3, i4 - ((width * width) / i4));
        } else {
            i2 = this.c;
        }
        int max = Math.max(0, this.I - view.getHeight());
        this.A = max;
        int max2 = Math.max(this.I - i2, max);
        this.B = max2;
        int i5 = this.E;
        if (i5 == 3 || i5 == 7) {
            A(this.A, view);
        } else if (this.C && i5 == 5) {
            A(this.I, view);
        } else if (i5 == 4) {
            A(max2, view);
        } else if (i5 == 1 || i5 == 2) {
            A(top - view.getTop(), view);
        } else if (i5 == 6) {
            A(this.y[this.z], view);
        }
        if (this.F == null) {
            this.F = new a(coordinatorLayout.getContext(), coordinatorLayout, this.d0);
        }
        this.J = new WeakReference(view);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean k(float f, float f2, View view) {
        WeakReference weakReference = this.K;
        return (weakReference == null || view != weakReference.get() || this.E == 3) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        if (r9 < r5[r5.length - 1]) goto L36;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        this.P = true;
        WeakReference weakReference = this.K;
        if (view2 == (weakReference != null ? (View) weakReference.get() : null) && i3 != 1) {
            int top = view.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                int i5 = this.A;
                if (i4 < i5) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    A(-i6, view);
                    H(3, false);
                } else {
                    iArr[1] = i2;
                    if (this.S || i4 > this.y[0]) {
                        A(-i2, view);
                    }
                    H(1, false);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                int i7 = this.B;
                if (i4 <= i7 || (this.C && this.U)) {
                    iArr[1] = i2;
                    if (!this.T) {
                        int[] iArr2 = this.y;
                    }
                    A(-i2, view);
                    H(1, false);
                } else {
                    int i8 = top - i7;
                    iArr[1] = i8;
                    A(-i8, view);
                    H(4, false);
                }
            }
            w(view.getTop());
            this.H = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        WeakReference weakReference = this.K;
        if (view2 == (weakReference != null ? (View) weakReference.get() : null) && i5 == 1) {
            return;
        }
        super.n(coordinatorLayout, view, view2, i, i2, i3, i4, i5, iArr);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void p(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() == null) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        }
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.E = 4;
        } else {
            this.E = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final Parcelable q(View view) {
        return new SavedState(AbsSavedState.EMPTY_STATE, this.E);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.H = false;
        return v() && (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (view.getTop() == this.A) {
            H(3, false);
            return;
        }
        WeakReference weakReference = this.K;
        if (weakReference != null && view2 == weakReference.get() && this.H) {
            z(-0.0f, view);
            this.H = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        if (!v() || !view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.E == 1 && actionMasked == 0) {
            return true;
        }
        if (actionMasked == 2 && !this.S) {
            float y = motionEvent.getY();
            int i2 = this.y[0];
            if (y <= i2) {
                A(i2 - view.getTop(), view);
                return true;
            }
        }
        a aVar = this.F;
        if (aVar != null && ((i = aVar.c) == -1 || motionEvent.findPointerIndex(i) != -1)) {
            this.F.l(motionEvent);
        }
        if (actionMasked == 0) {
            this.M = -1;
        }
        if (actionMasked == 2 && !this.G && this.F != null) {
            this.P = true;
            float abs = Math.abs(this.N - motionEvent.getY());
            a aVar2 = this.F;
            if (abs > aVar2.b) {
                aVar2.c(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.G;
    }

    public final void u(View view, int i, int i2, boolean z) {
        View view2;
        if (this.a0) {
            int max = Math.max(this.I, this.A);
            int min = Math.min(this.A, this.I);
            int min2 = Math.min(Math.max(view.getTop(), min), max);
            nwt0 nwt0Var = this.b;
            nwt0Var.g = max;
            nwt0Var.h = min;
            nwt0Var.g(min2);
            nwt0Var.h();
        }
        if (!this.b0 || this.c0 == 0) {
            view2 = view;
            E(i, view2, z);
        } else {
            b62 b62Var = this.Z;
            if (b62Var != null && view != null) {
                view.removeCallbacks(b62Var);
            }
            view2 = view;
            this.Z = new o290(view2, i, i2, Math.max(this.A, i2 - this.c0), new ddf(15, this));
            H(2, z);
        }
        b62 b62Var2 = this.Z;
        if (b62Var2 == null) {
            return;
        }
        WeakHashMap weakHashMap = b.a;
        view2.postOnAnimation(b62Var2);
    }

    public final boolean v() {
        WeakReference weakReference = this.J;
        return (weakReference == null || !this.W || ((View) weakReference.get()) == null || this.E == 7) ? false : true;
    }

    public final void w(int i) {
        WeakReference weakReference = this.J;
        if (weakReference == null || ((View) weakReference.get()) == null || this.L == null) {
            return;
        }
        float y = y(i);
        u52 u52Var = this.L;
        boolean z = this.R;
        SlideableModalView slideableModalView = (SlideableModalView) ((qgn0) u52Var).b;
        if ((!z || y == 1.0f) && !slideableModalView.isTransiting()) {
            slideableModalView.updateBottomSheetBackground();
            slideableModalView.onDialogSlide(y);
        }
    }

    public final float y(int i) {
        int i2 = this.B;
        int i3 = i > i2 ? this.I - i2 : i2 - this.A;
        return i3 == 0 ? (i == this.I || i == i2) ? 1.0f : 0.0f : (i2 - i) / i3;
    }

    public final void z(float f, View view) {
        int top = view.getTop();
        ArrayList arrayList = new ArrayList(this.y.length + 3);
        if (this.S) {
            arrayList.add(new x52(3, 0, this.A));
        }
        int i = 0;
        while (true) {
            int[] iArr = this.y;
            if (i >= iArr.length) {
                break;
            }
            arrayList.add(new x52(6, i, iArr[i]));
            i++;
        }
        if (this.T) {
            arrayList.add(new x52(4, 0, this.B));
        }
        if (this.C && (this.U || this.D)) {
            arrayList.add(new x52(5, 0, this.I));
        }
        x52 x52Var = (x52) arrayList.get(0);
        x52 x52Var2 = (x52) unr0.k(1, arrayList);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            x52 x52Var3 = (x52) it.next();
            int i2 = x52Var3.c;
            if (top >= i2) {
                x52Var = x52Var3;
            }
            if (top <= i2) {
                x52Var2 = x52Var3;
                break;
            }
        }
        if (x52Var != x52Var2 && top - x52Var.c > x52Var2.c - top) {
            x52Var = x52Var2;
        }
        int i3 = x52Var.c;
        int i4 = x52Var.a;
        if (i4 == 6) {
            int i5 = x52Var.b;
            this.z = i5;
            int i6 = this.y[i5];
        }
        if (this.a0) {
            nwt0 nwt0Var = this.b;
            nwt0Var.c();
            nwt0Var.a = f;
            nwt0Var.u.i = i3;
        }
        if (this.a0 || this.F.t(view.getLeft(), i3, view)) {
            u(view, i4, i3, false);
        } else {
            H(i4, false);
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.ybsdk.core.design.coordinator.AnchorBottomSheetBehavior.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
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

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    public AnchorBottomSheetBehavior() {
        sor sorVar = new sor();
        this.a = sorVar;
        this.b = new nwt0(sorVar);
        this.y = new int[]{0};
        this.E = 6;
        this.S = true;
        this.T = true;
        this.U = true;
        this.W = true;
        this.a0 = false;
        this.b0 = false;
        this.d0 = new r52(0, this);
    }
}
