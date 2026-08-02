package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.d3x;
import defpackage.ejy;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.ph;
import defpackage.wh;
import java.util.List;
import ru.cprocsp.ACSPTLSProxy.tools.Constants;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.e implements d3x, u0 {
    public int J;
    public v K;
    public d0 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public boolean T;
    public SavedState U;
    public final u V;
    public final ejy W;
    public int Z;
    public final int[] a0;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.J = 1;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = -1;
        this.S = Integer.MIN_VALUE;
        this.U = null;
        this.V = new u();
        this.W = new ejy();
        this.Z = 2;
        this.a0 = new int[2];
        RecyclerView.e.a s0 = RecyclerView.e.s0(context, attributeSet, i, i2);
        b2(s0.a);
        c2(s0.c);
        d2(s0.d);
    }

    public void A1(RecyclerView.k kVar, v vVar, o oVar) {
        int i = vVar.d;
        if (i < 0 || i >= kVar.b()) {
            return;
        }
        oVar.a(i, Math.max(0, vVar.g));
    }

    public final int B1(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        F1();
        return a1.a(kVar, this.L, J1(!this.Q), I1(!this.Q), this, this.Q);
    }

    public int C() {
        return L1();
    }

    public final int C1(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        F1();
        return a1.b(kVar, this.L, J1(!this.Q), I1(!this.Q), this, this.Q, this.O);
    }

    public final int D1(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        F1();
        return a1.c(kVar, this.L, J1(!this.Q), I1(!this.Q), this, this.Q);
    }

    public final int E1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.J == 1) ? 1 : Integer.MIN_VALUE : this.J == 0 ? 1 : Integer.MIN_VALUE : this.J == 1 ? -1 : Integer.MIN_VALUE : this.J == 0 ? -1 : Integer.MIN_VALUE : (this.J != 1 && U1()) ? -1 : 1 : (this.J != 1 && U1()) ? 1 : -1;
    }

    public final void F1() {
        if (this.K == null) {
            v vVar = new v();
            vVar.a = true;
            vVar.h = 0;
            vVar.i = 0;
            vVar.k = null;
            this.K = vVar;
        }
    }

    public final int G1(r0 r0Var, v vVar, RecyclerView.k kVar, boolean z) {
        int i;
        int i2 = vVar.c;
        int i3 = vVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                vVar.g = i3 + i2;
            }
            X1(r0Var, vVar);
        }
        int i4 = vVar.c + vVar.h;
        while (true) {
            if ((!vVar.l && i4 <= 0) || (i = vVar.d) < 0 || i >= kVar.b()) {
                break;
            }
            ejy ejyVar = this.W;
            ejyVar.a = 0;
            ejyVar.b = false;
            ejyVar.c = false;
            ejyVar.d = false;
            V1(r0Var, kVar, vVar, ejyVar);
            if (!ejyVar.b) {
                int i5 = vVar.b;
                int i6 = ejyVar.a;
                vVar.b = (vVar.f * i6) + i5;
                if (!ejyVar.c || vVar.k != null || !kVar.g) {
                    vVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = vVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    vVar.g = i8;
                    int i9 = vVar.c;
                    if (i9 < 0) {
                        vVar.g = i8 + i9;
                    }
                    X1(r0Var, vVar);
                }
                if (z && ejyVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - vVar.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void H(String str) {
        if (this.U == null) {
            super.H(str);
        }
    }

    public final int H1() {
        View O1 = O1(0, d0(), true, false);
        if (O1 == null) {
            return -1;
        }
        return ((RecyclerView.LayoutParams) O1.getLayoutParams()).getViewLayoutPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public boolean I() {
        return this.J == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void I0(RecyclerView recyclerView, r0 r0Var) {
        if (this.T) {
            c1(r0Var);
            r0Var.b();
        }
    }

    public final View I1(boolean z) {
        return this.O ? O1(0, d0(), z, true) : O1(d0() - 1, -1, z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public boolean J() {
        return this.J == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public View J0(View view, int i, r0 r0Var, RecyclerView.k kVar) {
        int E1;
        Z1();
        if (d0() != 0 && (E1 = E1(i)) != Integer.MIN_VALUE) {
            F1();
            e2(E1, (int) (this.L.l() * 0.33333334f), false, kVar);
            v vVar = this.K;
            vVar.g = Integer.MIN_VALUE;
            vVar.a = false;
            G1(r0Var, vVar, kVar, true);
            boolean z = this.O;
            View N1 = E1 == -1 ? z ? N1(d0() - 1, -1) : N1(0, d0()) : z ? N1(0, d0()) : N1(d0() - 1, -1);
            View T1 = E1 == -1 ? T1() : S1();
            if (!T1.hasFocusable()) {
                return N1;
            }
            if (N1 != null) {
                return T1;
            }
        }
        return null;
    }

    public final View J1(boolean z) {
        return this.O ? O1(d0() - 1, -1, z, true) : O1(0, d0(), z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (d0() > 0) {
            accessibilityEvent.setFromIndex(K1());
            accessibilityEvent.setToIndex(M1());
        }
    }

    public final int K1() {
        View O1 = O1(0, d0(), false, true);
        if (O1 == null) {
            return -1;
        }
        return ((RecyclerView.LayoutParams) O1.getLayoutParams()).getViewLayoutPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void L0(r0 r0Var, RecyclerView.k kVar, wh whVar) {
        super.L0(r0Var, kVar, whVar);
        RecyclerView.Adapter adapter = this.b.mAdapter;
        if (adapter == null || adapter.getItemCount() <= 0) {
            return;
        }
        whVar.b(ph.p);
    }

    public final int L1() {
        View O1 = O1(d0() - 1, -1, true, false);
        if (O1 == null) {
            return -1;
        }
        return ((RecyclerView.LayoutParams) O1.getLayoutParams()).getViewLayoutPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void M(int i, int i2, RecyclerView.k kVar, o oVar) {
        if (this.J != 0) {
            i = i2;
        }
        if (d0() == 0 || i == 0) {
            return;
        }
        F1();
        e2(i > 0 ? 1 : -1, Math.abs(i), true, kVar);
        A1(kVar, this.K, oVar);
    }

    public final int M1() {
        View O1 = O1(d0() - 1, -1, false, true);
        if (O1 == null) {
            return -1;
        }
        return ((RecyclerView.LayoutParams) O1.getLayoutParams()).getViewLayoutPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void N(int i, o oVar) {
        boolean z;
        int i2;
        SavedState savedState = this.U;
        if (savedState == null || !savedState.hasValidAnchor()) {
            Z1();
            z = this.O;
            i2 = this.R;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.U;
            z = savedState2.mAnchorLayoutFromEnd;
            i2 = savedState2.mAnchorPosition;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.Z && i2 >= 0 && i2 < i; i4++) {
            oVar.a(i2, 0);
            i2 += i3;
        }
    }

    public final View N1(int i, int i2) {
        int i3;
        int i4;
        F1();
        if (i2 <= i && i2 >= i) {
            return c0(i);
        }
        if (this.L.e(c0(i)) < this.L.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = Constants.INTENT_ADDRESS_ID;
        }
        return this.J == 0 ? this.c.f(i, i2, i3, i4) : this.w.f(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int O(RecyclerView.k kVar) {
        return B1(kVar);
    }

    public final View O1(int i, int i2, boolean z, boolean z2) {
        F1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.J == 0 ? this.c.f(i, i2, i3, i4) : this.w.f(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int P(RecyclerView.k kVar) {
        return C1(kVar);
    }

    public View P1(r0 r0Var, RecyclerView.k kVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        F1();
        int d0 = d0();
        if (z2) {
            i2 = d0() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = d0;
            i2 = 0;
            i3 = 1;
        }
        int b = kVar.b();
        int k = this.L.k();
        int g = this.L.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View c0 = c0(i2);
            int r0 = RecyclerView.e.r0(c0);
            int e = this.L.e(c0);
            int b2 = this.L.b(c0);
            if (r0 >= 0 && r0 < b) {
                if (!((RecyclerView.LayoutParams) c0.getLayoutParams()).isItemRemoved()) {
                    boolean z3 = b2 <= k && e < k;
                    boolean z4 = e >= g && b2 > g;
                    if (!z3 && !z4) {
                        return c0;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = c0;
                        }
                        view2 = c0;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = c0;
                        }
                        view2 = c0;
                    }
                } else if (view3 == null) {
                    view3 = c0;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int Q(RecyclerView.k kVar) {
        return D1(kVar);
    }

    public final int Q1(int i, r0 r0Var, RecyclerView.k kVar, boolean z) {
        int g;
        int g2 = this.L.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -a2(-g2, r0Var, kVar);
        int i3 = i + i2;
        if (!z || (g = this.L.g() - i3) <= 0) {
            return i2;
        }
        this.L.p(g);
        return g + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int R(RecyclerView.k kVar) {
        return B1(kVar);
    }

    public final int R1(int i, r0 r0Var, RecyclerView.k kVar, boolean z) {
        int k;
        int k2 = i - this.L.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -a2(k2, r0Var, kVar);
        int i3 = i + i2;
        if (!z || (k = i3 - this.L.k()) <= 0) {
            return i2;
        }
        this.L.p(-k);
        return i2 - k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int S(RecyclerView.k kVar) {
        return C1(kVar);
    }

    public final View S1() {
        return c0(this.O ? 0 : d0() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int T(RecyclerView.k kVar) {
        return D1(kVar);
    }

    public final View T1() {
        return c0(this.O ? d0() - 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void U0(r0 r0Var, RecyclerView.k kVar) {
        View view;
        View view2;
        View P1;
        int i;
        int i2;
        int i3;
        ?? r4;
        List list;
        int i4;
        int i5;
        int Q1;
        int i6;
        View X;
        int e;
        int i7;
        int i8 = -1;
        if (!(this.U == null && this.R == -1) && kVar.b() == 0) {
            c1(r0Var);
            return;
        }
        SavedState savedState = this.U;
        if (savedState != null && savedState.hasValidAnchor()) {
            this.R = this.U.mAnchorPosition;
        }
        F1();
        boolean z = false;
        this.K.a = false;
        Z1();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || this.a.c.contains(view)) {
            view = null;
        }
        u uVar = this.V;
        if (!uVar.e || this.R != -1 || this.U != null) {
            uVar.c();
            uVar.d = this.O ^ this.P;
            if (!kVar.g && (i = this.R) != -1) {
                if (i < 0 || i >= kVar.b()) {
                    this.R = -1;
                    this.S = Integer.MIN_VALUE;
                } else {
                    uVar.b = this.R;
                    SavedState savedState2 = this.U;
                    if (savedState2 != null && savedState2.hasValidAnchor()) {
                        boolean z2 = this.U.mAnchorLayoutFromEnd;
                        uVar.d = z2;
                        d0 d0Var = this.L;
                        if (z2) {
                            uVar.c = d0Var.g() - this.U.mAnchorOffset;
                        } else {
                            uVar.c = d0Var.k() + this.U.mAnchorOffset;
                        }
                    } else if (this.S == Integer.MIN_VALUE) {
                        View X2 = X(this.R);
                        if (X2 == null) {
                            if (d0() > 0) {
                                uVar.d = (this.R < RecyclerView.e.r0(c0(0))) == this.O;
                            }
                            uVar.a();
                        } else if (this.L.c(X2) > this.L.l()) {
                            uVar.a();
                        } else {
                            int e2 = this.L.e(X2) - this.L.k();
                            d0 d0Var2 = this.L;
                            if (e2 < 0) {
                                uVar.c = d0Var2.k();
                                uVar.d = false;
                            } else if (d0Var2.g() - this.L.b(X2) < 0) {
                                uVar.c = this.L.g();
                                uVar.d = true;
                            } else {
                                boolean z3 = uVar.d;
                                d0 d0Var3 = this.L;
                                uVar.c = z3 ? this.L.m() + d0Var3.b(X2) : d0Var3.e(X2);
                            }
                        }
                    } else {
                        boolean z4 = this.O;
                        uVar.d = z4;
                        d0 d0Var4 = this.L;
                        if (z4) {
                            uVar.c = d0Var4.g() - this.S;
                        } else {
                            uVar.c = d0Var4.k() + this.S;
                        }
                    }
                    uVar.e = true;
                }
            }
            if (d0() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || this.a.c.contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view2.getLayoutParams();
                    if (!layoutParams.isItemRemoved() && layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < kVar.b()) {
                        uVar.b(((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition(), view2);
                        uVar.e = true;
                    }
                }
                boolean z5 = this.M;
                boolean z6 = this.P;
                if (z5 == z6 && (P1 = P1(r0Var, kVar, uVar.d, z6)) != null) {
                    int viewLayoutPosition = ((RecyclerView.LayoutParams) P1.getLayoutParams()).getViewLayoutPosition();
                    boolean z7 = uVar.d;
                    d0 d0Var5 = uVar.a;
                    if (z7) {
                        uVar.c = uVar.a.m() + d0Var5.b(P1);
                    } else {
                        uVar.c = d0Var5.e(P1);
                    }
                    uVar.b = viewLayoutPosition;
                    if (!kVar.g && y1()) {
                        int e3 = this.L.e(P1);
                        int b = this.L.b(P1);
                        int k = this.L.k();
                        int g = this.L.g();
                        boolean z8 = b <= k && e3 < k;
                        boolean z9 = e3 >= g && b > g;
                        if (z8 || z9) {
                            if (uVar.d) {
                                k = g;
                            }
                            uVar.c = k;
                        }
                    }
                    uVar.e = true;
                }
            }
            uVar.a();
            uVar.b = this.P ? kVar.b() - 1 : 0;
            uVar.e = true;
        } else if (view != null && (this.L.e(view) >= this.L.g() || this.L.b(view) <= this.L.k())) {
            uVar.b(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), view);
        }
        v vVar = this.K;
        vVar.f = vVar.j >= 0 ? 1 : -1;
        int[] iArr = this.a0;
        iArr[0] = 0;
        iArr[1] = 0;
        z1(kVar, iArr);
        int k2 = this.L.k() + Math.max(0, iArr[0]);
        int h = this.L.h() + Math.max(0, iArr[1]);
        if (kVar.g && (i6 = this.R) != -1 && this.S != Integer.MIN_VALUE && (X = X(i6)) != null) {
            boolean z10 = this.O;
            d0 d0Var6 = this.L;
            if (z10) {
                i7 = d0Var6.g() - this.L.b(X);
                e = this.S;
            } else {
                e = d0Var6.e(X) - this.L.k();
                i7 = this.S;
            }
            int i9 = i7 - e;
            if (i9 > 0) {
                k2 += i9;
            } else {
                h -= i9;
            }
        }
        boolean z11 = uVar.d;
        boolean z12 = this.O;
        if (!z11 ? !z12 : z12) {
            i8 = 1;
        }
        W1(r0Var, kVar, uVar, i8);
        U(r0Var);
        this.K.l = this.L.i() == 0 && this.L.f() == 0;
        this.K.getClass();
        this.K.i = 0;
        boolean z13 = uVar.d;
        int i10 = uVar.b;
        if (z13) {
            g2(i10, uVar.c);
            v vVar2 = this.K;
            vVar2.h = k2;
            G1(r0Var, vVar2, kVar, false);
            v vVar3 = this.K;
            i3 = vVar3.b;
            int i11 = vVar3.d;
            int i12 = vVar3.c;
            if (i12 > 0) {
                h += i12;
            }
            f2(uVar.b, uVar.c);
            v vVar4 = this.K;
            vVar4.h = h;
            vVar4.d += vVar4.e;
            G1(r0Var, vVar4, kVar, false);
            v vVar5 = this.K;
            i2 = vVar5.b;
            int i13 = vVar5.c;
            if (i13 > 0) {
                g2(i11, i3);
                v vVar6 = this.K;
                vVar6.h = i13;
                G1(r0Var, vVar6, kVar, false);
                i3 = this.K.b;
            }
        } else {
            f2(i10, uVar.c);
            v vVar7 = this.K;
            vVar7.h = h;
            G1(r0Var, vVar7, kVar, false);
            v vVar8 = this.K;
            i2 = vVar8.b;
            int i14 = vVar8.d;
            int i15 = vVar8.c;
            if (i15 > 0) {
                k2 += i15;
            }
            g2(uVar.b, uVar.c);
            v vVar9 = this.K;
            vVar9.h = k2;
            vVar9.d += vVar9.e;
            G1(r0Var, vVar9, kVar, false);
            v vVar10 = this.K;
            int i16 = vVar10.b;
            int i17 = vVar10.c;
            if (i17 > 0) {
                f2(i14, i2);
                v vVar11 = this.K;
                vVar11.h = i17;
                G1(r0Var, vVar11, kVar, false);
                i2 = this.K.b;
            }
            i3 = i16;
        }
        if (d0() > 0) {
            if (this.O ^ this.P) {
                int Q12 = Q1(i2, r0Var, kVar, true);
                i4 = i3 + Q12;
                i5 = i2 + Q12;
                Q1 = R1(i4, r0Var, kVar, false);
            } else {
                int R1 = R1(i3, r0Var, kVar, true);
                i4 = i3 + R1;
                i5 = i2 + R1;
                Q1 = Q1(i5, r0Var, kVar, false);
            }
            i3 = i4 + Q1;
            i2 = i5 + Q1;
        }
        if (kVar.k && d0() != 0 && !kVar.g && y1()) {
            List list2 = r0Var.d;
            int size = list2.size();
            int r0 = RecyclerView.e.r0(c0(0));
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i18 < size) {
                x0 x0Var = (x0) list2.get(i18);
                boolean N = x0Var.N();
                View view3 = x0Var.a;
                if (!N) {
                    boolean z14 = x0Var.G() < r0 ? true : z;
                    boolean z15 = this.O;
                    d0 d0Var7 = this.L;
                    if (z14 != z15) {
                        i19 += d0Var7.c(view3);
                    } else {
                        i20 += d0Var7.c(view3);
                    }
                }
                i18++;
                z = false;
            }
            this.K.k = list2;
            if (i19 > 0) {
                g2(RecyclerView.e.r0(T1()), i3);
                v vVar12 = this.K;
                vVar12.h = i19;
                r4 = 0;
                vVar12.c = 0;
                vVar12.a(null);
                G1(r0Var, this.K, kVar, false);
            } else {
                r4 = 0;
            }
            if (i20 > 0) {
                f2(RecyclerView.e.r0(S1()), i2);
                v vVar13 = this.K;
                vVar13.h = i20;
                vVar13.c = r4;
                list = null;
                vVar13.a(null);
                G1(r0Var, this.K, kVar, r4);
            } else {
                list = null;
            }
            this.K.k = list;
        }
        if (kVar.g) {
            uVar.c();
        } else {
            d0 d0Var8 = this.L;
            d0Var8.b = d0Var8.l();
        }
        this.M = this.P;
    }

    public final boolean U1() {
        return this.b.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void V0(RecyclerView.k kVar) {
        this.U = null;
        this.R = -1;
        this.S = Integer.MIN_VALUE;
        this.V.c();
    }

    public void V1(r0 r0Var, RecyclerView.k kVar, v vVar, ejy ejyVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int d;
        View b = vVar.b(r0Var);
        if (b == null) {
            ejyVar.b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) b.getLayoutParams();
        List list = vVar.k;
        boolean z = this.O;
        int i5 = vVar.f;
        if (list == null) {
            if (z == (i5 == -1)) {
                F(b);
            } else {
                G(0, b, false);
            }
        } else {
            if (z == (i5 == -1)) {
                G(-1, b, true);
            } else {
                G(0, b, true);
            }
        }
        D0(0, 0, b);
        ejyVar.a = this.L.c(b);
        if (this.J == 1) {
            if (U1()) {
                d = this.H - getPaddingRight();
                i3 = d - this.L.d(b);
            } else {
                i3 = getPaddingLeft();
                d = this.L.d(b) + i3;
            }
            int i6 = vVar.f;
            int i7 = vVar.b;
            int i8 = ejyVar.a;
            if (i6 == -1) {
                i4 = i7 - i8;
                i = i7;
            } else {
                i = i8 + i7;
                i4 = i7;
            }
            i2 = d;
        } else {
            int paddingTop = getPaddingTop();
            int d2 = this.L.d(b) + paddingTop;
            int i9 = vVar.f;
            int i10 = vVar.b;
            int i11 = ejyVar.a;
            if (i9 == -1) {
                int i12 = i10 - i11;
                i2 = i10;
                i = d2;
                i3 = i12;
            } else {
                int i13 = i10 + i11;
                i = d2;
                i2 = i13;
                i3 = i10;
            }
            i4 = paddingTop;
        }
        C0(i3, i4, i2, i, b);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            ejyVar.c = true;
        }
        ejyVar.d = b.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void W0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.U = savedState;
            if (this.R != -1) {
                savedState.invalidateAnchor();
            }
            i1();
        }
    }

    public void W1(r0 r0Var, RecyclerView.k kVar, u uVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final View X(int i) {
        int d0 = d0();
        if (d0 == 0) {
            return null;
        }
        int r0 = i - RecyclerView.e.r0(c0(0));
        if (r0 >= 0 && r0 < d0) {
            View c0 = c0(r0);
            if (RecyclerView.e.r0(c0) == i) {
                return c0;
            }
        }
        return super.X(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public Parcelable X0() {
        if (this.U != null) {
            return new SavedState(this.U);
        }
        SavedState savedState = new SavedState();
        if (d0() <= 0) {
            savedState.invalidateAnchor();
            return savedState;
        }
        F1();
        boolean z = this.M ^ this.O;
        savedState.mAnchorLayoutFromEnd = z;
        if (z) {
            View S1 = S1();
            savedState.mAnchorOffset = this.L.g() - this.L.b(S1);
            savedState.mAnchorPosition = ((RecyclerView.LayoutParams) S1.getLayoutParams()).getViewLayoutPosition();
            return savedState;
        }
        View T1 = T1();
        savedState.mAnchorPosition = RecyclerView.e.r0(T1);
        savedState.mAnchorOffset = this.L.e(T1) - this.L.k();
        return savedState;
    }

    public final void X1(r0 r0Var, v vVar) {
        if (!vVar.a || vVar.l) {
            return;
        }
        int i = vVar.g;
        int i2 = vVar.i;
        if (vVar.f == -1) {
            int d0 = d0();
            if (i < 0) {
                return;
            }
            int f = (this.L.f() - i) + i2;
            if (this.O) {
                for (int i3 = 0; i3 < d0; i3++) {
                    View c0 = c0(i3);
                    if (this.L.e(c0) < f || this.L.o(c0) < f) {
                        Y1(r0Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = d0 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View c02 = c0(i5);
                if (this.L.e(c02) < f || this.L.o(c02) < f) {
                    Y1(r0Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int d02 = d0();
        if (!this.O) {
            for (int i7 = 0; i7 < d02; i7++) {
                View c03 = c0(i7);
                if (this.L.b(c03) > i6 || this.L.n(c03) > i6) {
                    Y1(r0Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = d02 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View c04 = c0(i9);
            if (this.L.b(c04) > i6 || this.L.n(c04) > i6) {
                Y1(r0Var, i8, i9);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.LayoutParams Y() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final void Y1(r0 r0Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View c0 = c0(i);
                g1(i);
                r0Var.k(c0);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View c02 = c0(i3);
            g1(i3);
            r0Var.k(c02);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public boolean Z0(int i, Bundle bundle) {
        int min;
        if (super.Z0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.J == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.b;
                min = Math.min(i2, u0(recyclerView.mRecycler, recyclerView.mState) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.b;
                min = Math.min(i3, g0(recyclerView2.mRecycler, recyclerView2.mState) - 1);
            }
            if (min >= 0) {
                r(min, 0);
                return true;
            }
        }
        return false;
    }

    public final void Z1() {
        if (this.J == 1 || !U1()) {
            this.O = this.N;
        } else {
            this.O = !this.N;
        }
    }

    public int a() {
        return K1();
    }

    int a2(int i, r0 r0Var, RecyclerView.k kVar) {
        if (d0() == 0 || i == 0) {
            return 0;
        }
        F1();
        this.K.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        e2(i2, abs, true, kVar);
        v vVar = this.K;
        int G1 = G1(r0Var, vVar, kVar, false) + vVar.g;
        if (G1 < 0) {
            return 0;
        }
        if (abs > G1) {
            i = i2 * G1;
        }
        this.L.p(-i);
        this.K.j = i;
        return i;
    }

    public int b() {
        return M1();
    }

    public final void b2(int i) {
        if (i != 0 && i != 1) {
            ny61.g(oyr.i(i, "invalid orientation:"));
            return;
        }
        H(null);
        if (i != this.J || this.L == null) {
            d0 a = d0.a(this, i);
            this.L = a;
            this.V.a = a;
            this.J = i;
            i1();
        }
    }

    public void c2(boolean z) {
        H(null);
        if (z == this.N) {
            return;
        }
        this.N = z;
        i1();
    }

    @Override // androidx.recyclerview.widget.u0
    public PointF d(int i) {
        if (d0() == 0) {
            return null;
        }
        int i2 = (i < RecyclerView.e.r0(c0(0))) != this.O ? -1 : 1;
        return this.J == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public void d2(boolean z) {
        H(null);
        if (this.P == z) {
            return;
        }
        this.P = z;
        i1();
    }

    public int e() {
        return H1();
    }

    public final void e2(int i, int i2, boolean z, RecyclerView.k kVar) {
        int k;
        this.K.l = this.L.i() == 0 && this.L.f() == 0;
        this.K.f = i;
        int[] iArr = this.a0;
        iArr[0] = 0;
        iArr[1] = 0;
        z1(kVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        v vVar = this.K;
        int i3 = z2 ? max2 : max;
        vVar.h = i3;
        if (!z2) {
            max = max2;
        }
        vVar.i = max;
        if (z2) {
            vVar.h = this.L.h() + i3;
            View S1 = S1();
            v vVar2 = this.K;
            vVar2.e = this.O ? -1 : 1;
            int r0 = RecyclerView.e.r0(S1);
            v vVar3 = this.K;
            vVar2.d = r0 + vVar3.e;
            vVar3.b = this.L.b(S1);
            k = this.L.b(S1) - this.L.g();
        } else {
            View T1 = T1();
            v vVar4 = this.K;
            vVar4.h = this.L.k() + vVar4.h;
            v vVar5 = this.K;
            vVar5.e = this.O ? 1 : -1;
            int r02 = RecyclerView.e.r0(T1);
            v vVar6 = this.K;
            vVar5.d = r02 + vVar6.e;
            vVar6.b = this.L.e(T1);
            k = (-this.L.e(T1)) + this.L.k();
        }
        v vVar7 = this.K;
        vVar7.c = i2;
        if (z) {
            vVar7.c = i2 - k;
        }
        vVar7.g = k;
    }

    public final void f2(int i, int i2) {
        this.K.c = this.L.g() - i2;
        v vVar = this.K;
        vVar.e = this.O ? -1 : 1;
        vVar.d = i;
        vVar.f = 1;
        vVar.b = i2;
        vVar.g = Integer.MIN_VALUE;
    }

    public final void g2(int i, int i2) {
        this.K.c = i2 - this.L.k();
        v vVar = this.K;
        vVar.d = i;
        vVar.e = this.O ? 1 : -1;
        vVar.f = -1;
        vVar.b = i2;
        vVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int k1(int i, r0 r0Var, RecyclerView.k kVar) {
        if (this.J == 1) {
            return 0;
        }
        return a2(i, r0Var, kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void l1(int i) {
        this.R = i;
        this.S = Integer.MIN_VALUE;
        SavedState savedState = this.U;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int m1(int i, r0 r0Var, RecyclerView.k kVar) {
        if (this.J == 0) {
            return 0;
        }
        return a2(i, r0Var, kVar);
    }

    public void r(int i, int i2) {
        this.R = i;
        this.S = i2;
        SavedState savedState = this.U;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean v1() {
        if (this.G != 1073741824 && this.F != 1073741824) {
            int d0 = d0();
            for (int i = 0; i < d0; i++) {
                ViewGroup.LayoutParams layoutParams = c0(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public boolean x0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void x1(RecyclerView recyclerView, RecyclerView.k kVar, int i) {
        w wVar = new w(recyclerView.getContext());
        wVar.a = i;
        v(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean y0() {
        return this.N;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public boolean y1() {
        return this.U == null && this.M == this.P;
    }

    public void z1(RecyclerView.k kVar, int[] iArr) {
        int i;
        int l = kVar.a != -1 ? this.L.l() : 0;
        if (this.K.f == -1) {
            i = 0;
        } else {
            i = l;
            l = 0;
        }
        iArr[0] = l;
        iArr[1] = i;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.LinearLayoutManager.SavedState.1
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
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean hasValidAnchor() {
            return this.mAnchorPosition >= 0;
        }

        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
        }

        public SavedState() {
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.J = 1;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = -1;
        this.S = Integer.MIN_VALUE;
        this.U = null;
        this.V = new u();
        this.W = new ejy();
        this.Z = 2;
        this.a0 = new int[2];
        b2(i);
        c2(z);
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }
}
