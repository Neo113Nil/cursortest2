package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.r0;
import androidx.recyclerview.widget.u0;
import androidx.recyclerview.widget.w;
import defpackage.gnr;
import defpackage.jnr;
import defpackage.knr;
import defpackage.oyr;
import defpackage.shr;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class FlexboxLayoutManager extends RecyclerView.e implements shr, u0 {
    public static final Rect j0 = new Rect();
    public int J;
    public final int K;
    public final int L;
    public boolean N;
    public boolean O;
    public r0 R;
    public RecyclerView.k S;
    public knr T;
    public final jnr U;
    public d0 V;
    public d0 W;
    public SavedState Z;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public final SparseArray e0;
    public final Context f0;
    public View g0;
    public int h0;
    public final gnr i0;
    public final int M = -1;
    public List P = new ArrayList();
    public final b Q = new b(this);

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        jnr jnrVar = new jnr(this);
        this.U = jnrVar;
        this.a0 = -1;
        this.b0 = Integer.MIN_VALUE;
        this.c0 = Integer.MIN_VALUE;
        this.d0 = Integer.MIN_VALUE;
        this.e0 = new SparseArray();
        this.h0 = -1;
        this.i0 = new gnr();
        RecyclerView.e.a s0 = RecyclerView.e.s0(context, attributeSet, i, i2);
        int i3 = s0.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (s0.c) {
                    P1(3);
                } else {
                    P1(2);
                }
            }
        } else if (s0.c) {
            P1(1);
        } else {
            P1(0);
        }
        int i4 = this.K;
        if (i4 != 1) {
            if (i4 == 0) {
                b1();
                this.P.clear();
                jnr.b(jnrVar);
                jnrVar.d = 0;
            }
            this.K = 1;
            this.V = null;
            this.W = null;
            i1();
        }
        if (this.L != 4) {
            b1();
            this.P.clear();
            jnr.b(jnrVar);
            jnrVar.d = 0;
            this.L = 4;
            i1();
        }
        this.f0 = context;
    }

    public static boolean z0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public final int A1(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        int b = kVar.b();
        View E1 = E1(b);
        View G1 = G1(b);
        if (kVar.b() == 0 || E1 == null || G1 == null) {
            return 0;
        }
        int viewLayoutPosition = ((RecyclerView.LayoutParams) E1.getLayoutParams()).getViewLayoutPosition();
        int viewLayoutPosition2 = ((RecyclerView.LayoutParams) G1.getLayoutParams()).getViewLayoutPosition();
        int abs = Math.abs(this.V.b(G1) - this.V.e(E1));
        int i = this.Q.c[viewLayoutPosition];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (abs / ((r3[viewLayoutPosition2] - i) + 1))) + (this.V.k() - this.V.e(E1)));
    }

    public final int B1(RecyclerView.k kVar) {
        if (d0() != 0) {
            int b = kVar.b();
            View E1 = E1(b);
            View G1 = G1(b);
            if (kVar.b() != 0 && E1 != null && G1 != null) {
                View I1 = I1(0, d0());
                int viewLayoutPosition = I1 == null ? -1 : ((RecyclerView.LayoutParams) I1.getLayoutParams()).getViewLayoutPosition();
                return (int) ((Math.abs(this.V.b(G1) - this.V.e(E1)) / (((I1(d0() - 1, -1) != null ? ((RecyclerView.LayoutParams) r4.getLayoutParams()).getViewLayoutPosition() : -1) - viewLayoutPosition) + 1)) * kVar.b());
            }
        }
        return 0;
    }

    public final void C1() {
        if (this.V != null) {
            return;
        }
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i = this.K;
        if (isMainAxisDirectionHorizontal) {
            if (i == 0) {
                this.V = new b0(this);
                this.W = new c0(this);
                return;
            } else {
                this.V = new c0(this);
                this.W = new b0(this);
                return;
            }
        }
        if (i == 0) {
            this.V = new c0(this);
            this.W = new b0(this);
        } else {
            this.V = new b0(this);
            this.W = new c0(this);
        }
    }

    public final int D1(r0 r0Var, RecyclerView.k kVar, knr knrVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        b bVar;
        Rect rect;
        int i6;
        int i7;
        Rect rect2;
        int i8;
        boolean z2;
        int i9;
        int i10;
        Rect rect3;
        int i11;
        int i12 = knrVar.f;
        if (i12 != Integer.MIN_VALUE) {
            int i13 = knrVar.a;
            if (i13 < 0) {
                knrVar.f = i12 + i13;
            }
            O1(r0Var, knrVar);
        }
        int i14 = knrVar.a;
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i15 = i14;
        int i16 = 0;
        while (true) {
            if (i15 <= 0 && !this.T.b) {
                break;
            }
            List list = this.P;
            int i17 = knrVar.d;
            if (i17 < 0 || i17 >= kVar.b() || (i = knrVar.c) < 0 || i >= list.size()) {
                break;
            }
            a aVar = (a) this.P.get(knrVar.c);
            knrVar.d = aVar.o;
            boolean isMainAxisDirectionHorizontal2 = isMainAxisDirectionHorizontal();
            jnr jnrVar = this.U;
            Rect rect4 = j0;
            b bVar2 = this.Q;
            if (isMainAxisDirectionHorizontal2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i18 = this.H;
                int i19 = knrVar.e;
                if (knrVar.h == -1) {
                    i19 -= aVar.g;
                }
                int i20 = i19;
                int i21 = knrVar.d;
                float f = jnrVar.d;
                float f2 = paddingLeft - f;
                float f3 = (i18 - paddingRight) - f;
                float max = Math.max(0.0f, 0.0f);
                int i22 = aVar.h;
                i2 = i14;
                int i23 = i21;
                int i24 = 0;
                while (i23 < i21 + i22) {
                    int i25 = i21;
                    View flexItemAt = getFlexItemAt(i23);
                    if (flexItemAt == null) {
                        i11 = i25;
                        z2 = isMainAxisDirectionHorizontal;
                        i9 = i22;
                        i10 = i23;
                        rect3 = rect4;
                    } else {
                        z2 = isMainAxisDirectionHorizontal;
                        if (knrVar.h == 1) {
                            m(flexItemAt, rect4);
                            F(flexItemAt);
                        } else {
                            m(flexItemAt, rect4);
                            G(i24, flexItemAt, false);
                            i24++;
                        }
                        int i26 = i24;
                        float f4 = f3;
                        long j = bVar2.d[i23];
                        int i27 = (int) j;
                        int i28 = (int) (j >> 32);
                        if (Q1(flexItemAt, i27, i28, (LayoutParams) flexItemAt.getLayoutParams())) {
                            flexItemAt.measure(i27, i28);
                        }
                        float o0 = f2 + RecyclerView.e.o0(flexItemAt) + ((ViewGroup.MarginLayoutParams) r6).leftMargin;
                        float t0 = f4 - (RecyclerView.e.t0(flexItemAt) + ((ViewGroup.MarginLayoutParams) r6).rightMargin);
                        int v0 = RecyclerView.e.v0(flexItemAt) + i20;
                        boolean z3 = this.N;
                        i9 = i22;
                        b bVar3 = this.Q;
                        if (z3) {
                            i10 = i23;
                            rect3 = rect4;
                            i11 = i25;
                            bVar3.o(flexItemAt, aVar, Math.round(t0) - flexItemAt.getMeasuredWidth(), v0, Math.round(t0), flexItemAt.getMeasuredHeight() + v0);
                        } else {
                            i10 = i23;
                            rect3 = rect4;
                            i11 = i25;
                            bVar3.o(flexItemAt, aVar, Math.round(o0), v0, flexItemAt.getMeasuredWidth() + Math.round(o0), flexItemAt.getMeasuredHeight() + v0);
                        }
                        float t02 = RecyclerView.e.t0(flexItemAt) + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).rightMargin + max + o0;
                        f3 = t0 - ((RecyclerView.e.o0(flexItemAt) + (flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).leftMargin)) + max);
                        f2 = t02;
                        i24 = i26;
                    }
                    i23 = i10 + 1;
                    isMainAxisDirectionHorizontal = z2;
                    i22 = i9;
                    i21 = i11;
                    rect4 = rect3;
                }
                z = isMainAxisDirectionHorizontal;
                knrVar.c += this.T.h;
                i5 = aVar.g;
            } else {
                i2 = i14;
                z = isMainAxisDirectionHorizontal;
                Rect rect5 = rect4;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i29 = this.I;
                int i30 = knrVar.e;
                if (knrVar.h == -1) {
                    int i31 = aVar.g;
                    i4 = i30 + i31;
                    i3 = i30 - i31;
                } else {
                    i3 = i30;
                    i4 = i3;
                }
                int i32 = knrVar.d;
                float f5 = i29 - paddingBottom;
                float f6 = jnrVar.d;
                float f7 = paddingTop - f6;
                float f8 = f5 - f6;
                float max2 = Math.max(0.0f, 0.0f);
                int i33 = aVar.h;
                float f9 = f8;
                int i34 = i32;
                float f10 = f7;
                int i35 = 0;
                while (i34 < i32 + i33) {
                    int i36 = i32;
                    View flexItemAt2 = getFlexItemAt(i34);
                    if (flexItemAt2 == null) {
                        bVar = bVar2;
                        i6 = i33;
                        i7 = i36;
                        rect2 = rect5;
                        i8 = i34;
                    } else {
                        bVar = bVar2;
                        long j2 = bVar2.d[i34];
                        float f11 = f10;
                        int i37 = (int) j2;
                        int i38 = (int) (j2 >> 32);
                        if (Q1(flexItemAt2, i37, i38, (LayoutParams) flexItemAt2.getLayoutParams())) {
                            flexItemAt2.measure(i37, i38);
                        }
                        float v02 = f11 + RecyclerView.e.v0(flexItemAt2) + ((ViewGroup.MarginLayoutParams) r4).topMargin;
                        float b0 = f9 - (RecyclerView.e.b0(flexItemAt2) + ((ViewGroup.MarginLayoutParams) r4).rightMargin);
                        if (knrVar.h == 1) {
                            rect = rect5;
                            m(flexItemAt2, rect);
                            F(flexItemAt2);
                        } else {
                            rect = rect5;
                            m(flexItemAt2, rect);
                            G(i35, flexItemAt2, false);
                            i35++;
                        }
                        int o02 = RecyclerView.e.o0(flexItemAt2) + i3;
                        int t03 = i4 - RecyclerView.e.t0(flexItemAt2);
                        Rect rect6 = rect;
                        boolean z4 = this.N;
                        boolean z5 = this.O;
                        i6 = i33;
                        b bVar4 = this.Q;
                        if (!z4) {
                            i7 = i36;
                            rect2 = rect6;
                            i8 = i34;
                            if (z5) {
                                bVar4.p(flexItemAt2, aVar, z4, o02, Math.round(b0) - flexItemAt2.getMeasuredHeight(), flexItemAt2.getMeasuredWidth() + o02, Math.round(b0));
                            } else {
                                bVar4.p(flexItemAt2, aVar, z4, o02, Math.round(v02), flexItemAt2.getMeasuredWidth() + o02, flexItemAt2.getMeasuredHeight() + Math.round(v02));
                            }
                        } else if (z5) {
                            i7 = i36;
                            rect2 = rect6;
                            i8 = i34;
                            bVar4.p(flexItemAt2, aVar, z4, t03 - flexItemAt2.getMeasuredWidth(), Math.round(b0) - flexItemAt2.getMeasuredHeight(), t03, Math.round(b0));
                        } else {
                            i7 = i36;
                            rect2 = rect6;
                            i8 = i34;
                            bVar4.p(flexItemAt2, aVar, z4, t03 - flexItemAt2.getMeasuredWidth(), Math.round(v02), t03, flexItemAt2.getMeasuredHeight() + Math.round(v02));
                        }
                        f10 = RecyclerView.e.b0(flexItemAt2) + flexItemAt2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).topMargin + max2 + v02;
                        f9 = b0 - ((RecyclerView.e.v0(flexItemAt2) + (flexItemAt2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).bottomMargin)) + max2);
                    }
                    i34 = i8 + 1;
                    bVar2 = bVar;
                    i33 = i6;
                    i32 = i7;
                    rect5 = rect2;
                }
                knrVar.c += this.T.h;
                i5 = aVar.g;
            }
            i16 += i5;
            if (z || !this.N) {
                knrVar.e += aVar.g * knrVar.h;
            } else {
                knrVar.e -= aVar.g * knrVar.h;
            }
            i15 -= aVar.g;
            i14 = i2;
            isMainAxisDirectionHorizontal = z;
        }
        int i39 = i14;
        int i40 = knrVar.a - i16;
        knrVar.a = i40;
        int i41 = knrVar.f;
        if (i41 != Integer.MIN_VALUE) {
            int i42 = i41 + i16;
            knrVar.f = i42;
            if (i40 < 0) {
                knrVar.f = i42 + i40;
            }
            O1(r0Var, knrVar);
        }
        return i39 - knrVar.a;
    }

    public final View E1(int i) {
        View J1 = J1(0, d0(), i);
        if (J1 == null) {
            return null;
        }
        int i2 = this.Q.c[((RecyclerView.LayoutParams) J1.getLayoutParams()).getViewLayoutPosition()];
        if (i2 == -1) {
            return null;
        }
        return F1(J1, (a) this.P.get(i2));
    }

    public final View F1(View view, a aVar) {
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i = aVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View c0 = c0(i2);
            if (c0 != null && c0.getVisibility() != 8) {
                if (!this.N || isMainAxisDirectionHorizontal) {
                    if (this.V.e(view) <= this.V.e(c0)) {
                    }
                    view = c0;
                } else {
                    if (this.V.b(view) >= this.V.b(c0)) {
                    }
                    view = c0;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void G0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        b1();
    }

    public final View G1(int i) {
        View J1 = J1(d0() - 1, -1, i);
        if (J1 == null) {
            return null;
        }
        return H1(J1, (a) this.P.get(this.Q.c[((RecyclerView.LayoutParams) J1.getLayoutParams()).getViewLayoutPosition()]));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void H0(RecyclerView recyclerView) {
        this.g0 = (View) recyclerView.getParent();
    }

    public final View H1(View view, a aVar) {
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int d0 = (d0() - aVar.h) - 1;
        for (int d02 = d0() - 2; d02 > d0; d02--) {
            View c0 = c0(d02);
            if (c0 != null && c0.getVisibility() != 8) {
                if (!this.N || isMainAxisDirectionHorizontal) {
                    if (this.V.b(view) >= this.V.b(c0)) {
                    }
                    view = c0;
                } else {
                    if (this.V.e(view) <= this.V.e(c0)) {
                    }
                    view = c0;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean I() {
        if (this.K == 0) {
            return isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            return true;
        }
        int i = this.H;
        View view = this.g0;
        return i > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void I0(RecyclerView recyclerView, r0 r0Var) {
    }

    public final View I1(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View c0 = c0(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.H - getPaddingRight();
            int paddingBottom = this.I - getPaddingBottom();
            int j02 = j0(c0) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) c0.getLayoutParams())).leftMargin;
            int n0 = n0(c0) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) c0.getLayoutParams())).topMargin;
            int m0 = m0(c0) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) c0.getLayoutParams())).rightMargin;
            int h0 = h0(c0) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) c0.getLayoutParams())).bottomMargin;
            boolean z = j02 >= paddingRight || m0 >= paddingLeft;
            boolean z2 = n0 >= paddingBottom || h0 >= paddingTop;
            if (z && z2) {
                return c0;
            }
            i += i3;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean J() {
        if (this.K == 0) {
            return !isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            int i = this.I;
            View view = this.g0;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    public final View J1(int i, int i2, int i3) {
        int viewLayoutPosition;
        C1();
        if (this.T == null) {
            knr knrVar = new knr();
            knrVar.h = 1;
            this.T = knrVar;
        }
        int k = this.V.k();
        int g = this.V.g();
        int i4 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View c0 = c0(i);
            if (c0 != null && (viewLayoutPosition = ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition()) >= 0 && viewLayoutPosition < i3) {
                if (((RecyclerView.LayoutParams) c0.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = c0;
                    }
                } else {
                    if (this.V.e(c0) >= k && this.V.b(c0) <= g) {
                        return c0;
                    }
                    if (view == null) {
                        view = c0;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean K(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final int K1(int i, r0 r0Var, RecyclerView.k kVar, boolean z) {
        int i2;
        int g;
        if (isMainAxisDirectionHorizontal() || !this.N) {
            int g2 = this.V.g() - i;
            if (g2 <= 0) {
                return 0;
            }
            i2 = -M1(-g2, r0Var, kVar);
        } else {
            int k = i - this.V.k();
            if (k <= 0) {
                return 0;
            }
            i2 = M1(k, r0Var, kVar);
        }
        int i3 = i + i2;
        if (!z || (g = this.V.g() - i3) <= 0) {
            return i2;
        }
        this.V.p(g);
        return g + i2;
    }

    public final int L1(int i, r0 r0Var, RecyclerView.k kVar, boolean z) {
        int i2;
        int k;
        if (isMainAxisDirectionHorizontal() || !this.N) {
            int k2 = i - this.V.k();
            if (k2 <= 0) {
                return 0;
            }
            i2 = -M1(k2, r0Var, kVar);
        } else {
            int g = this.V.g() - i;
            if (g <= 0) {
                return 0;
            }
            i2 = M1(-g, r0Var, kVar);
        }
        int i3 = i + i2;
        if (!z || (k = i3 - this.V.k()) <= 0) {
            return i2;
        }
        this.V.p(-k);
        return i2 - k;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M1(int i, r0 r0Var, RecyclerView.k kVar) {
        int D1;
        int i2;
        if (d0() != 0 && i != 0) {
            C1();
            this.T.i = true;
            boolean z = !isMainAxisDirectionHorizontal() && this.N;
            int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
            int abs = Math.abs(i);
            this.T.h = i3;
            boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.H, this.F);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.I, this.G);
            boolean z2 = !isMainAxisDirectionHorizontal && this.N;
            b bVar = this.Q;
            if (i3 == 1) {
                View c0 = c0(d0() - 1);
                if (c0 != null) {
                    this.T.e = this.V.b(c0);
                    int viewLayoutPosition = ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition();
                    View H1 = H1(c0, (a) this.P.get(bVar.c[viewLayoutPosition]));
                    knr knrVar = this.T;
                    knrVar.getClass();
                    int i4 = viewLayoutPosition + 1;
                    knrVar.d = i4;
                    int[] iArr = bVar.c;
                    if (iArr.length <= i4) {
                        knrVar.c = -1;
                    } else {
                        knrVar.c = iArr[i4];
                    }
                    d0 d0Var = this.V;
                    if (z2) {
                        knrVar.e = d0Var.e(H1);
                        this.T.f = this.V.k() + (-this.V.e(H1));
                        knr knrVar2 = this.T;
                        knrVar2.f = Math.max(knrVar2.f, 0);
                    } else {
                        knrVar.e = d0Var.b(H1);
                        this.T.f = this.V.b(H1) - this.V.g();
                    }
                    int i5 = this.T.c;
                    if ((i5 == -1 || i5 > this.P.size() - 1) && this.T.d <= this.S.b()) {
                        knr knrVar3 = this.T;
                        int i6 = abs - knrVar3.f;
                        gnr gnrVar = this.i0;
                        gnrVar.a = null;
                        gnrVar.b = 0;
                        if (i6 > 0) {
                            b bVar2 = this.Q;
                            if (isMainAxisDirectionHorizontal) {
                                bVar2.b(gnrVar, makeMeasureSpec, makeMeasureSpec2, i6, knrVar3.d, -1, this.P);
                            } else {
                                bVar2.b(gnrVar, makeMeasureSpec2, makeMeasureSpec, i6, knrVar3.d, -1, this.P);
                                makeMeasureSpec2 = makeMeasureSpec2;
                                makeMeasureSpec = makeMeasureSpec;
                            }
                            bVar.h(makeMeasureSpec, makeMeasureSpec2, this.T.d);
                            bVar.u(this.T.d);
                        }
                    }
                    knr knrVar4 = this.T;
                    knrVar4.a = abs - knrVar4.f;
                }
                knr knrVar5 = this.T;
                D1 = D1(r0Var, kVar, knrVar5) + knrVar5.f;
                if (D1 >= 0) {
                    if (z) {
                        if (abs > D1) {
                            i2 = (-i3) * D1;
                        }
                        i2 = i;
                    } else {
                        if (abs > D1) {
                            i2 = i3 * D1;
                        }
                        i2 = i;
                    }
                    this.V.p(-i2);
                    this.T.g = i2;
                    return i2;
                }
            } else {
                View c02 = c0(0);
                if (c02 != null) {
                    this.T.e = this.V.e(c02);
                    int viewLayoutPosition2 = ((RecyclerView.LayoutParams) c02.getLayoutParams()).getViewLayoutPosition();
                    View F1 = F1(c02, (a) this.P.get(bVar.c[viewLayoutPosition2]));
                    knr knrVar6 = this.T;
                    knrVar6.getClass();
                    int i7 = bVar.c[viewLayoutPosition2];
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        this.T.d = viewLayoutPosition2 - ((a) this.P.get(i7 - 1)).h;
                    } else {
                        knrVar6.d = -1;
                    }
                    knr knrVar7 = this.T;
                    knrVar7.c = i7 > 0 ? i7 - 1 : 0;
                    d0 d0Var2 = this.V;
                    if (z2) {
                        knrVar7.e = d0Var2.b(F1);
                        this.T.f = this.V.b(F1) - this.V.g();
                        knr knrVar8 = this.T;
                        knrVar8.f = Math.max(knrVar8.f, 0);
                    } else {
                        knrVar7.e = d0Var2.e(F1);
                        this.T.f = this.V.k() + (-this.V.e(F1));
                    }
                    knr knrVar42 = this.T;
                    knrVar42.a = abs - knrVar42.f;
                }
                knr knrVar52 = this.T;
                D1 = D1(r0Var, kVar, knrVar52) + knrVar52.f;
                if (D1 >= 0) {
                }
            }
        }
        return 0;
    }

    public final int N1(int i) {
        if (d0() == 0 || i == 0) {
            return 0;
        }
        C1();
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        View view = this.g0;
        int width = isMainAxisDirectionHorizontal ? view.getWidth() : view.getHeight();
        int i2 = isMainAxisDirectionHorizontal ? this.H : this.I;
        int layoutDirection = this.b.getLayoutDirection();
        jnr jnrVar = this.U;
        if (layoutDirection == 1) {
            int abs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + jnrVar.d) - width, abs);
            }
            int i3 = jnrVar.d;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - jnrVar.d) - width, i);
            }
            int i4 = jnrVar.d;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int O(RecyclerView.k kVar) {
        return z1(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void O0(int i, int i2) {
        R1(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O1(r0 r0Var, knr knrVar) {
        int d0;
        int i;
        int d02;
        int i2;
        View c0;
        int i3;
        if (knrVar.i) {
            int i4 = knrVar.h;
            int i5 = knrVar.f;
            b bVar = this.Q;
            int i6 = -1;
            if (i4 == -1) {
                if (i5 < 0 || (d02 = d0()) == 0 || (c0 = c0(d02 - 1)) == null || (i3 = bVar.c[((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition()]) == -1) {
                    return;
                }
                a aVar = (a) this.P.get(i3);
                int i7 = i2;
                while (true) {
                    if (i7 < 0) {
                        break;
                    }
                    View c02 = c0(i7);
                    if (c02 != null) {
                        int i8 = knrVar.f;
                        if (isMainAxisDirectionHorizontal() || !this.N) {
                            if (this.V.e(c02) < this.V.f() - i8) {
                                break;
                            }
                            if (aVar.o != ((RecyclerView.LayoutParams) c02.getLayoutParams()).getViewLayoutPosition()) {
                                continue;
                            } else if (i3 <= 0) {
                                d02 = i7;
                                break;
                            } else {
                                i3 += knrVar.h;
                                aVar = (a) this.P.get(i3);
                                d02 = i7;
                            }
                        } else {
                            if (this.V.b(c02) > i8) {
                                break;
                            }
                            if (aVar.o != ((RecyclerView.LayoutParams) c02.getLayoutParams()).getViewLayoutPosition()) {
                            }
                        }
                    }
                    i7--;
                }
                while (i2 >= d02) {
                    View c03 = c0(i2);
                    g1(i2);
                    r0Var.k(c03);
                    i2--;
                }
                return;
            }
            if (i5 >= 0 && (d0 = d0()) != 0) {
                int i9 = 0;
                View c04 = c0(0);
                if (c04 == null || (i = bVar.c[((RecyclerView.LayoutParams) c04.getLayoutParams()).getViewLayoutPosition()]) == -1) {
                    return;
                }
                a aVar2 = (a) this.P.get(i);
                while (i9 < d0) {
                    View c05 = c0(i9);
                    if (c05 != null) {
                        int i10 = knrVar.f;
                        if (isMainAxisDirectionHorizontal() || !this.N) {
                            if (this.V.b(c05) > i10) {
                                break;
                            }
                            if (aVar2.p != ((RecyclerView.LayoutParams) c05.getLayoutParams()).getViewLayoutPosition()) {
                                continue;
                            } else {
                                if (i >= this.P.size() - 1) {
                                    break;
                                }
                                i += knrVar.h;
                                aVar2 = (a) this.P.get(i);
                                i6 = i9;
                            }
                        } else {
                            if (this.V.f() - this.V.e(c05) > i10) {
                                break;
                            }
                            if (aVar2.p != ((RecyclerView.LayoutParams) c05.getLayoutParams()).getViewLayoutPosition()) {
                            }
                        }
                    }
                    i9++;
                }
                i9 = i6;
                while (i9 >= 0) {
                    View c06 = c0(i9);
                    g1(i9);
                    r0Var.k(c06);
                    i9--;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int P(RecyclerView.k kVar) {
        return A1(kVar);
    }

    public final void P1(int i) {
        if (this.J != i) {
            b1();
            this.J = i;
            this.V = null;
            this.W = null;
            this.P.clear();
            jnr jnrVar = this.U;
            jnr.b(jnrVar);
            jnrVar.d = 0;
            i1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int Q(RecyclerView.k kVar) {
        return B1(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void Q0(int i, int i2) {
        R1(Math.min(i, i2));
    }

    public final boolean Q1(View view, int i, int i2, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this.B && z0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && z0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int R(RecyclerView.k kVar) {
        return z1(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void R0(int i, int i2) {
        R1(i);
    }

    public final void R1(int i) {
        View I1 = I1(d0() - 1, -1);
        if (i >= (I1 != null ? ((RecyclerView.LayoutParams) I1.getLayoutParams()).getViewLayoutPosition() : -1)) {
            return;
        }
        int d0 = d0();
        b bVar = this.Q;
        bVar.j(d0);
        bVar.k(d0);
        bVar.i(d0);
        if (i >= bVar.c.length) {
            return;
        }
        this.h0 = i;
        View c0 = c0(0);
        if (c0 == null) {
            return;
        }
        this.a0 = ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition();
        if (isMainAxisDirectionHorizontal() || !this.N) {
            this.b0 = this.V.e(c0) - this.V.k();
        } else {
            this.b0 = this.V.h() + this.V.b(c0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int S(RecyclerView.k kVar) {
        return A1(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void S0(RecyclerView recyclerView, int i, int i2) {
        R1(i);
    }

    public final void S1(jnr jnrVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = isMainAxisDirectionHorizontal() ? this.G : this.F;
            this.T.b = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.T.b = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.N) {
            this.T.a = this.V.g() - jnrVar.c;
        } else {
            this.T.a = jnrVar.c - getPaddingRight();
        }
        knr knrVar = this.T;
        knrVar.d = jnrVar.a;
        knrVar.h = 1;
        knrVar.e = jnrVar.c;
        knrVar.f = Integer.MIN_VALUE;
        knrVar.c = jnrVar.b;
        if (!z || this.P.size() <= 1 || (i = jnrVar.b) < 0 || i >= this.P.size() - 1) {
            return;
        }
        a aVar = (a) this.P.get(jnrVar.b);
        knr knrVar2 = this.T;
        knrVar2.c++;
        knrVar2.d += aVar.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int T(RecyclerView.k kVar) {
        return B1(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void T0(RecyclerView recyclerView, int i, int i2, Object obj) {
        R1(i);
        R1(i);
    }

    public final void T1(jnr jnrVar, boolean z, boolean z2) {
        if (z2) {
            int i = isMainAxisDirectionHorizontal() ? this.G : this.F;
            this.T.b = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.T.b = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.N) {
            this.T.a = jnrVar.c - this.V.k();
        } else {
            this.T.a = (this.g0.getWidth() - jnrVar.c) - this.V.k();
        }
        knr knrVar = this.T;
        knrVar.d = jnrVar.a;
        knrVar.h = -1;
        knrVar.e = jnrVar.c;
        knrVar.f = Integer.MIN_VALUE;
        int i2 = jnrVar.b;
        knrVar.c = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.P.size();
        int i3 = jnrVar.b;
        if (size > i3) {
            a aVar = (a) this.P.get(i3);
            knr knrVar2 = this.T;
            knrVar2.c--;
            knrVar2.d -= aVar.h;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void U0(r0 r0Var, RecyclerView.k kVar) {
        int i;
        View c0;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        int i4;
        this.R = r0Var;
        this.S = kVar;
        int b = kVar.b();
        if (b == 0 && kVar.g) {
            return;
        }
        int layoutDirection = this.b.getLayoutDirection();
        int i5 = this.J;
        int i6 = this.K;
        if (i5 == 0) {
            this.N = layoutDirection == 1;
            this.O = i6 == 2;
        } else if (i5 == 1) {
            this.N = layoutDirection != 1;
            this.O = i6 == 2;
        } else if (i5 == 2) {
            boolean z3 = layoutDirection == 1;
            this.N = z3;
            if (i6 == 2) {
                this.N = !z3;
            }
            this.O = false;
        } else if (i5 != 3) {
            this.N = false;
            this.O = false;
        } else {
            boolean z4 = layoutDirection == 1;
            this.N = z4;
            if (i6 == 2) {
                this.N = !z4;
            }
            this.O = true;
        }
        C1();
        if (this.T == null) {
            knr knrVar = new knr();
            knrVar.h = 1;
            this.T = knrVar;
        }
        b bVar = this.Q;
        bVar.j(b);
        bVar.k(b);
        bVar.i(b);
        this.T.i = false;
        SavedState savedState = this.Z;
        if (savedState != null && savedState.hasValidAnchor(b)) {
            this.a0 = this.Z.mAnchorPosition;
        }
        jnr jnrVar = this.U;
        if (!jnrVar.f || this.a0 != -1 || this.Z != null) {
            jnr.b(jnrVar);
            SavedState savedState2 = this.Z;
            if (!kVar.g && (i = this.a0) != -1) {
                if (i < 0 || i >= kVar.b()) {
                    this.a0 = -1;
                    this.b0 = Integer.MIN_VALUE;
                } else {
                    int i7 = this.a0;
                    jnrVar.a = i7;
                    jnrVar.b = bVar.c[i7];
                    SavedState savedState3 = this.Z;
                    if (savedState3 != null && savedState3.hasValidAnchor(kVar.b())) {
                        jnrVar.c = this.V.k() + savedState2.mAnchorOffset;
                        jnrVar.g = true;
                        jnrVar.b = -1;
                    } else if (this.b0 == Integer.MIN_VALUE) {
                        View X = X(this.a0);
                        if (X == null) {
                            if (d0() > 0 && (c0 = c0(0)) != null) {
                                jnrVar.e = this.a0 < ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition();
                            }
                            jnr.a(jnrVar);
                        } else if (this.V.c(X) > this.V.l()) {
                            jnr.a(jnrVar);
                        } else {
                            int e = this.V.e(X) - this.V.k();
                            d0 d0Var = this.V;
                            if (e < 0) {
                                jnrVar.c = d0Var.k();
                                jnrVar.e = false;
                            } else if (d0Var.g() - this.V.b(X) < 0) {
                                jnrVar.c = this.V.g();
                                jnrVar.e = true;
                            } else {
                                boolean z5 = jnrVar.e;
                                d0 d0Var2 = this.V;
                                jnrVar.c = z5 ? this.V.m() + d0Var2.b(X) : d0Var2.e(X);
                            }
                        }
                    } else if (isMainAxisDirectionHorizontal() || !this.N) {
                        jnrVar.c = this.V.k() + this.b0;
                    } else {
                        jnrVar.c = this.b0 - this.V.h();
                    }
                    jnrVar.f = true;
                }
            }
            if (d0() != 0) {
                View G1 = jnrVar.e ? G1(kVar.b()) : E1(kVar.b());
                if (G1 != null) {
                    FlexboxLayoutManager flexboxLayoutManager = jnrVar.h;
                    d0 d0Var3 = flexboxLayoutManager.K == 0 ? flexboxLayoutManager.W : flexboxLayoutManager.V;
                    if (flexboxLayoutManager.isMainAxisDirectionHorizontal() || !flexboxLayoutManager.N) {
                        if (jnrVar.e) {
                            jnrVar.c = d0Var3.m() + d0Var3.b(G1);
                        } else {
                            jnrVar.c = d0Var3.e(G1);
                        }
                    } else if (jnrVar.e) {
                        jnrVar.c = d0Var3.m() + d0Var3.e(G1);
                    } else {
                        jnrVar.c = d0Var3.b(G1);
                    }
                    int viewLayoutPosition = ((RecyclerView.LayoutParams) G1.getLayoutParams()).getViewLayoutPosition();
                    jnrVar.a = viewLayoutPosition;
                    jnrVar.g = false;
                    int[] iArr = flexboxLayoutManager.Q.c;
                    if (viewLayoutPosition == -1) {
                        viewLayoutPosition = 0;
                    }
                    int i8 = iArr[viewLayoutPosition];
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    jnrVar.b = i8;
                    int size = flexboxLayoutManager.P.size();
                    int i9 = jnrVar.b;
                    if (size > i9) {
                        jnrVar.a = ((a) flexboxLayoutManager.P.get(i9)).o;
                    }
                    jnrVar.f = true;
                }
            }
            jnr.a(jnrVar);
            jnrVar.a = 0;
            jnrVar.b = 0;
            jnrVar.f = true;
        }
        U(r0Var);
        if (jnrVar.e) {
            T1(jnrVar, false, true);
        } else {
            S1(jnrVar, false, true);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.H, this.F);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.I, this.G);
        int i10 = this.H;
        int i11 = this.I;
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        Context context = this.f0;
        if (isMainAxisDirectionHorizontal) {
            int i12 = this.c0;
            z = (i12 == Integer.MIN_VALUE || i12 == i10) ? false : true;
            knr knrVar2 = this.T;
            i2 = knrVar2.b ? context.getResources().getDisplayMetrics().heightPixels : knrVar2.a;
        } else {
            int i13 = this.d0;
            z = (i13 == Integer.MIN_VALUE || i13 == i11) ? false : true;
            knr knrVar3 = this.T;
            i2 = knrVar3.b ? context.getResources().getDisplayMetrics().widthPixels : knrVar3.a;
        }
        int i14 = i2;
        this.c0 = i10;
        this.d0 = i11;
        int i15 = this.h0;
        gnr gnrVar = this.i0;
        if (i15 != -1 || (this.a0 == -1 && !z)) {
            int i16 = jnrVar.a;
            if (i15 != -1) {
                i16 = Math.min(i15, i16);
            }
            gnrVar.a = null;
            gnrVar.b = 0;
            boolean isMainAxisDirectionHorizontal2 = isMainAxisDirectionHorizontal();
            List list = this.P;
            if (isMainAxisDirectionHorizontal2) {
                if (list.size() > 0) {
                    bVar.d(i16, this.P);
                    this.Q.b(this.i0, makeMeasureSpec, makeMeasureSpec2, i14, i16, jnrVar.a, this.P);
                } else {
                    bVar.i(b);
                    this.Q.b(this.i0, makeMeasureSpec, makeMeasureSpec2, i14, 0, -1, this.P);
                }
            } else if (list.size() > 0) {
                bVar.d(i16, this.P);
                int i17 = i16;
                this.Q.b(this.i0, makeMeasureSpec2, makeMeasureSpec, i14, i17, jnrVar.a, this.P);
                makeMeasureSpec2 = makeMeasureSpec2;
                makeMeasureSpec = makeMeasureSpec;
                i16 = i17;
            } else {
                bVar.i(b);
                this.Q.b(this.i0, makeMeasureSpec2, makeMeasureSpec, i14, 0, -1, this.P);
                makeMeasureSpec2 = makeMeasureSpec2;
                makeMeasureSpec = makeMeasureSpec;
            }
            this.P = gnrVar.a;
            bVar.h(makeMeasureSpec, makeMeasureSpec2, i16);
            bVar.u(i16);
        } else if (!jnrVar.e) {
            this.P.clear();
            gnrVar.a = null;
            gnrVar.b = 0;
            boolean isMainAxisDirectionHorizontal3 = isMainAxisDirectionHorizontal();
            int i18 = jnrVar.a;
            b bVar2 = this.Q;
            gnr gnrVar2 = this.i0;
            if (isMainAxisDirectionHorizontal3) {
                bVar2.b(gnrVar2, makeMeasureSpec, makeMeasureSpec2, i14, 0, i18, this.P);
            } else {
                bVar2.b(gnrVar2, makeMeasureSpec2, makeMeasureSpec, i14, 0, i18, this.P);
                makeMeasureSpec2 = makeMeasureSpec2;
                makeMeasureSpec = makeMeasureSpec;
            }
            this.P = gnrVar.a;
            bVar.h(makeMeasureSpec, makeMeasureSpec2, 0);
            bVar.u(0);
            int i19 = bVar.c[jnrVar.a];
            jnrVar.b = i19;
            this.T.c = i19;
        }
        D1(r0Var, kVar, this.T);
        boolean z6 = jnrVar.e;
        knr knrVar4 = this.T;
        if (z6) {
            i4 = knrVar4.e;
            z2 = true;
            S1(jnrVar, true, false);
            D1(r0Var, kVar, this.T);
            i3 = this.T.e;
        } else {
            z2 = true;
            i3 = knrVar4.e;
            T1(jnrVar, true, false);
            D1(r0Var, kVar, this.T);
            i4 = this.T.e;
        }
        if (d0() > 0) {
            if (jnrVar.e) {
                L1(K1(i3, r0Var, kVar, z2) + i4, r0Var, kVar, false);
            } else {
                K1(L1(i4, r0Var, kVar, z2) + i3, r0Var, kVar, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void V0(RecyclerView.k kVar) {
        this.Z = null;
        this.a0 = -1;
        this.b0 = Integer.MIN_VALUE;
        this.h0 = -1;
        jnr.b(this.U);
        this.e0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void W0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.Z = (SavedState) parcelable;
            i1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final Parcelable X0() {
        if (this.Z != null) {
            return new SavedState(this.Z);
        }
        SavedState savedState = new SavedState();
        if (d0() <= 0) {
            savedState.invalidateAnchor();
            return savedState;
        }
        View c0 = c0(0);
        savedState.mAnchorPosition = RecyclerView.e.r0(c0);
        savedState.mAnchorOffset = this.V.e(c0) - this.V.k();
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Y() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Z(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.u0
    public final PointF d(int i) {
        View c0;
        if (d0() == 0 || (c0 = c0(0)) == null) {
            return null;
        }
        int i2 = i < ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition() ? -1 : 1;
        return isMainAxisDirectionHorizontal() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // defpackage.shr
    public final int getAlignContent() {
        return 5;
    }

    @Override // defpackage.shr
    public final int getAlignItems() {
        return this.L;
    }

    @Override // defpackage.shr
    public final int getChildHeightMeasureSpec(int i, int i2, int i3) {
        return RecyclerView.e.e0(this.I, this.G, i2, i3, J());
    }

    @Override // defpackage.shr
    public final int getChildWidthMeasureSpec(int i, int i2, int i3) {
        return RecyclerView.e.e0(this.H, this.F, i2, i3, I());
    }

    @Override // defpackage.shr
    public final int getDecorationLengthCrossAxis(View view) {
        int o0;
        int t0;
        if (isMainAxisDirectionHorizontal()) {
            o0 = RecyclerView.e.v0(view);
            t0 = RecyclerView.e.b0(view);
        } else {
            o0 = RecyclerView.e.o0(view);
            t0 = RecyclerView.e.t0(view);
        }
        return t0 + o0;
    }

    @Override // defpackage.shr
    public final int getDecorationLengthMainAxis(View view, int i, int i2) {
        int v0;
        int b0;
        if (isMainAxisDirectionHorizontal()) {
            v0 = RecyclerView.e.o0(view);
            b0 = RecyclerView.e.t0(view);
        } else {
            v0 = RecyclerView.e.v0(view);
            b0 = RecyclerView.e.b0(view);
        }
        return b0 + v0;
    }

    @Override // defpackage.shr
    public final int getFlexDirection() {
        return this.J;
    }

    @Override // defpackage.shr
    public final View getFlexItemAt(int i) {
        View view = (View) this.e0.get(i);
        return view != null ? view : this.R.e(i);
    }

    @Override // defpackage.shr
    public final int getFlexItemCount() {
        return this.S.b();
    }

    @Override // defpackage.shr
    public final List getFlexLinesInternal() {
        return this.P;
    }

    @Override // defpackage.shr
    public final int getFlexWrap() {
        return this.K;
    }

    @Override // defpackage.shr
    public final int getLargestMainSize() {
        if (this.P.size() == 0) {
            return 0;
        }
        int size = this.P.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((a) this.P.get(i2)).e);
        }
        return i;
    }

    @Override // defpackage.shr
    public final int getMaxLine() {
        return this.M;
    }

    @Override // defpackage.shr
    public final View getReorderedFlexItemAt(int i) {
        return getFlexItemAt(i);
    }

    @Override // defpackage.shr
    public final int getSumOfCrossSize() {
        int size = this.P.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((a) this.P.get(i2)).g;
        }
        return i;
    }

    @Override // defpackage.shr
    public final boolean isMainAxisDirectionHorizontal() {
        int i = this.J;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int k1(int i, r0 r0Var, RecyclerView.k kVar) {
        if (!isMainAxisDirectionHorizontal() || this.K == 0) {
            int M1 = M1(i, r0Var, kVar);
            this.e0.clear();
            return M1;
        }
        int N1 = N1(i);
        this.U.d += N1;
        this.W.p(-N1);
        return N1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void l1(int i) {
        this.a0 = i;
        this.b0 = Integer.MIN_VALUE;
        SavedState savedState = this.Z;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int m1(int i, r0 r0Var, RecyclerView.k kVar) {
        if (isMainAxisDirectionHorizontal() || (this.K == 0 && !isMainAxisDirectionHorizontal())) {
            int M1 = M1(i, r0Var, kVar);
            this.e0.clear();
            return M1;
        }
        int N1 = N1(i);
        this.U.d += N1;
        this.W.p(-N1);
        return N1;
    }

    @Override // defpackage.shr
    public final void onNewFlexItemAdded(View view, int i, int i2, a aVar) {
        m(view, j0);
        if (isMainAxisDirectionHorizontal()) {
            int t0 = RecyclerView.e.t0(view) + RecyclerView.e.o0(view);
            aVar.e += t0;
            aVar.f += t0;
            return;
        }
        int b0 = RecyclerView.e.b0(view) + RecyclerView.e.v0(view);
        aVar.e += b0;
        aVar.f += b0;
    }

    @Override // defpackage.shr
    public final void onNewFlexLineAdded(a aVar) {
    }

    @Override // defpackage.shr
    public final void setFlexLines(List list) {
        this.P = list;
    }

    @Override // defpackage.shr
    public final void updateViewCache(int i, View view) {
        this.e0.put(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    /* renamed from: x0 */
    public final boolean getK() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void x1(RecyclerView recyclerView, RecyclerView.k kVar, int i) {
        w wVar = new w(recyclerView.getContext());
        wVar.a = i;
        v(wVar);
    }

    public final int z1(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        int b = kVar.b();
        C1();
        View E1 = E1(b);
        View G1 = G1(b);
        if (kVar.b() == 0 || E1 == null || G1 == null) {
            return 0;
        }
        return Math.min(this.V.l(), this.V.b(G1) - this.V.e(E1));
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.SavedState.1
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
        private int mAnchorOffset;
        private int mAnchorPosition;

        private SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasValidAnchor(int i) {
            int i2 = this.mAnchorPosition;
            return i2 >= 0 && i2 < i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.mAnchorPosition);
            sb.append(", mAnchorOffset=");
            return oyr.s(sb, this.mAnchorOffset, '}');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
        }

        public SavedState() {
        }

        private SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.LayoutParams.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        };
        private int mAlignSelf;
        private float mFlexBasisPercent;
        private float mFlexGrow;
        private float mFlexShrink;
        private int mMaxHeight;
        private int mMaxWidth;
        private int mMinHeight;
        private int mMinWidth;
        private boolean mWrapBefore;

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            this.mWrapBefore = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.mAlignSelf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexBasisPercent() {
            return this.mFlexBasisPercent;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.mFlexGrow;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.mFlexShrink;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.mMaxHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.mMaxWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.mMinHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.mMinWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean isWrapBefore() {
            return this.mWrapBefore;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setAlignSelf(int i) {
            this.mAlignSelf = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexBasisPercent(float f) {
            this.mFlexBasisPercent = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexGrow(float f) {
            this.mFlexGrow = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexShrink(float f) {
            this.mFlexShrink = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int i) {
            ((ViewGroup.MarginLayoutParams) this).height = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxHeight(int i) {
            this.mMaxHeight = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxWidth(int i) {
            this.mMaxWidth = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i) {
            this.mMinHeight = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i) {
            this.mMinWidth = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setOrder(int i) {
            throw new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int i) {
            ((ViewGroup.MarginLayoutParams) this).width = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWrapBefore(boolean z) {
            this.mWrapBefore = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((RecyclerView.LayoutParams) layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mFlexGrow = layoutParams.mFlexGrow;
            this.mFlexShrink = layoutParams.mFlexShrink;
            this.mAlignSelf = layoutParams.mAlignSelf;
            this.mFlexBasisPercent = layoutParams.mFlexBasisPercent;
            this.mMinWidth = layoutParams.mMinWidth;
            this.mMinHeight = layoutParams.mMinHeight;
            this.mMaxWidth = layoutParams.mMaxWidth;
            this.mMaxHeight = layoutParams.mMaxHeight;
            this.mWrapBefore = layoutParams.mWrapBefore;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }
    }
}
