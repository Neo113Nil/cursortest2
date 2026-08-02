package com.yandex.messaging.support.view.timeline;

import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.r0;
import androidx.recyclerview.widget.u0;
import androidx.recyclerview.widget.w;
import com.yandex.messaging.internal.view.timeline.g;
import defpackage.ccz0;
import defpackage.ct21;
import defpackage.dcz0;
import defpackage.dns0;
import defpackage.hab;
import defpackage.iif;
import defpackage.kgx;
import defpackage.ky10;
import defpackage.ny61;
import defpackage.qaz0;
import defpackage.qdz0;
import defpackage.qp3;
import defpackage.r1s;
import defpackage.ry10;
import defpackage.t9x;
import defpackage.u9x;
import defpackage.ui20;
import defpackage.v4a;
import defpackage.vu60;
import defpackage.w511;
import defpackage.x4e;
import defpackage.yab;
import defpackage.z83;
import defpackage.zq60;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes15.dex */
public class TimelineLayoutManager extends RecyclerView.e implements u0 {
    public boolean L;
    public qaz0 M;
    public r1s N;
    public dns0 O;
    public boolean P;
    public t9x R;
    public boolean V;
    public boolean Z;
    public int b0;
    public int c0;
    public v4a e0;
    public PendingPosition K = new PendingPosition();
    public float Q = 0.0f;
    public final zq60 S = new zq60();
    public final zq60 T = new zq60();
    public int U = -1;
    public int W = -1;
    public int a0 = -1;
    public final vu60 d0 = new vu60();
    public final d0 J = d0.a(this, 1);

    public final void A1(r0 r0Var, int i) {
        t9x t9xVar;
        ry10 ry10Var;
        View I1 = I1();
        d0 d0Var = this.J;
        int b = d0Var.b(I1);
        int viewLayoutPosition = ((RecyclerView.LayoutParams) I1.getLayoutParams()).getViewLayoutPosition();
        while (b < i && viewLayoutPosition > 0) {
            if (this.P && (t9xVar = this.R) != null) {
                hab habVar = (hab) t9xVar;
                iif iifVar = habVar.c;
                int f = viewLayoutPosition - habVar.f();
                if (f >= 0 && f < iifVar.a()) {
                    int i2 = f - 1;
                    yab yabVar = iifVar.g;
                    if (yabVar != null) {
                        iifVar.c.getClass();
                        ry10Var = ui20.a(yabVar, i2, f);
                    } else {
                        ry10Var = null;
                    }
                    if (ry10Var != null) {
                        break;
                    }
                }
            }
            viewLayoutPosition--;
            dns0 dns0Var = this.O;
            if (dns0Var != null) {
                ((hab) dns0Var).h(viewLayoutPosition);
            }
            G1(r0Var, viewLayoutPosition, b, I1);
            I1 = I1();
            b = d0Var.b(I1);
        }
        this.Z = b < i;
        this.a0 = viewLayoutPosition;
    }

    public final void B1(int i, r0 r0Var, RecyclerView.k kVar) {
        t9x t9xVar;
        ry10 ry10Var;
        View J1 = J1();
        d0 d0Var = this.J;
        int e = d0Var.e(J1);
        int viewLayoutPosition = ((RecyclerView.LayoutParams) J1.getLayoutParams()).getViewLayoutPosition();
        while (e > i) {
            int i2 = viewLayoutPosition + 1;
            if (i2 >= kVar.b()) {
                break;
            }
            if (this.P && (t9xVar = this.R) != null) {
                hab habVar = (hab) t9xVar;
                iif iifVar = habVar.c;
                int f = viewLayoutPosition - habVar.f();
                if (f >= 0 && f < iifVar.a()) {
                    int i3 = f + 1;
                    yab yabVar = iifVar.g;
                    if (yabVar != null) {
                        iifVar.c.getClass();
                        ry10Var = ui20.a(yabVar, f, i3);
                    } else {
                        ry10Var = null;
                    }
                    if (ry10Var != null) {
                        break;
                    }
                }
            }
            dns0 dns0Var = this.O;
            if (dns0Var != null) {
                ((hab) dns0Var).h(i2);
            }
            H1(r0Var, i2, e, J1);
            J1 = J1();
            e = d0Var.e(J1);
            viewLayoutPosition = i2;
        }
        this.V = e > i;
        this.W = viewLayoutPosition;
    }

    public final View C1(int i) {
        int d0 = d0();
        for (int i2 = 0; i2 < d0; i2++) {
            View c0 = c0(i2);
            d0 d0Var = this.J;
            if (d0Var.b(c0) < i || d0Var.e(c0) <= i) {
                return c0;
            }
        }
        return null;
    }

    public final View D1(int i) {
        for (int d0 = d0() - 1; d0 >= 0; d0--) {
            View c0 = c0(d0);
            d0 d0Var = this.J;
            if (d0Var.e(c0) > i || d0Var.b(c0) >= i) {
                return c0;
            }
        }
        return null;
    }

    public final int E1(View view, View view2) {
        vu60 vu60Var = this.d0;
        F1(view, view2, vu60Var);
        return vu60Var.b;
    }

    public final void F1(View view, View view2, vu60 vu60Var) {
        vu60Var.a = 0;
        vu60Var.b = 0;
        vu60Var.c = 0;
        qaz0 qaz0Var = this.M;
        if (qaz0Var == null) {
            return;
        }
        if (view != null && view2 != null) {
            z83.i();
            qaz0 qaz0Var2 = this.M;
            int g = qaz0Var2.g(view, view2);
            int j = qaz0Var2.j(view2);
            int h = qaz0Var2.h(view, view2, j > 0);
            int i = qaz0Var2.i(view, view2);
            vu60Var.a = 0;
            int i2 = qaz0Var2.E;
            int D = x4e.D(g, h, i, j);
            if (i2 < D) {
                i2 = D;
            }
            vu60Var.b = i2;
            vu60Var.c = g;
            return;
        }
        if (view != null) {
            int g2 = qaz0Var.g(view, null);
            int h2 = qaz0Var.h(view, null, false);
            int i3 = qaz0Var.i(view, null);
            vu60Var.a = 0;
            int i4 = qaz0Var.E;
            int i5 = h2 + g2 + i3;
            if (i4 < i5) {
                i4 = i5;
            }
            vu60Var.b = i4;
            vu60Var.c = g2;
            return;
        }
        if (view2 == null) {
            w511.q();
            return;
        }
        RecyclerView recyclerView = qaz0Var.Z;
        if (recyclerView == null) {
            ny61.g("Required value was null.");
            return;
        }
        qdz0 qdz0Var = (qdz0) recyclerView.getChildViewHolder(view2);
        vu60Var.a = qaz0Var.j(view2) + (view2.getVisibility() == 0 ? qaz0Var.F : 0);
        if (qdz0Var.W()) {
            vu60Var.a += qaz0Var.H;
        }
        vu60Var.b = qaz0Var.i(null, view2) + vu60Var.a;
        vu60Var.c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void G0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.U = -1;
        r1s r1sVar = this.N;
        if (r1sVar != null) {
            r1sVar.m();
            this.N.k();
            this.N = null;
        }
        this.O = null;
        if (adapter2 instanceof t9x) {
            t9x t9xVar = (t9x) adapter2;
            this.R = t9xVar;
            this.N = new r1s(t9xVar);
        }
        if (adapter2 instanceof dns0) {
            this.O = (dns0) adapter2;
        }
    }

    public final void G1(r0 r0Var, int i, int i2, View view) {
        View e = r0Var.e(i);
        int E1 = i2 + (view != null ? E1(e, view) : 0);
        G(0, e, false);
        D0(0, 0, e);
        d0 d0Var = this.J;
        int c = d0Var.c(e);
        int paddingLeft = getPaddingLeft();
        C0(paddingLeft, E1, d0Var.d(e) + paddingLeft, E1 + c, e);
    }

    public final void H1(r0 r0Var, int i, int i2, View view) {
        View e = r0Var.e(i);
        int E1 = i2 - (view != null ? E1(view, e) : 0);
        F(e);
        D0(0, 0, e);
        d0 d0Var = this.J;
        int c = d0Var.c(e);
        int paddingLeft = getPaddingLeft();
        C0(paddingLeft, E1 - c, d0Var.d(e) + paddingLeft, E1, e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void I0(RecyclerView recyclerView, r0 r0Var) {
        if (this.L) {
            c1(r0Var);
            r0Var.b();
        }
        r1s r1sVar = this.N;
        if (r1sVar != null) {
            r1sVar.m();
            this.N.k();
        }
    }

    public final View I1() {
        View c0 = c0(0);
        Objects.requireNonNull(c0);
        return c0;
    }

    public final View J1() {
        View c0 = c0(d0() - 1);
        Objects.requireNonNull(c0);
        return c0;
    }

    public final void K1(RecyclerView.k kVar) {
        ry10 ry10Var;
        u9x u9xVar;
        r1s r1sVar = this.N;
        if (r1sVar == null) {
            return;
        }
        r1sVar.m();
        if (d0() == 0 && (!this.V || !this.Z)) {
            this.N.k();
            return;
        }
        int i = this.W;
        int i2 = -1;
        if (i == -1) {
            i = getItemCount() - 1;
        }
        int i3 = this.a0;
        if (i3 == -1) {
            i3 = 0;
        }
        if (!this.Z) {
            i3 = Math.max(0, ((RecyclerView.LayoutParams) I1().getLayoutParams()).getViewLayoutPosition() - 1);
        }
        if (!this.V) {
            i = ((RecyclerView.LayoutParams) J1().getLayoutParams()).getViewLayoutPosition();
        }
        boolean hasValidPreservePosition = this.K.hasValidPreservePosition(kVar);
        PendingPosition pendingPosition = this.K;
        if (hasValidPreservePosition) {
            i2 = pendingPosition.preservePosition;
        } else {
            boolean hasValidVisiblePosition = pendingPosition.hasValidVisiblePosition(kVar);
            PendingPosition pendingPosition2 = this.K;
            if (hasValidVisiblePosition) {
                i2 = pendingPosition2.visiblePosition;
            } else {
                boolean hasValidBottomPosition = pendingPosition2.hasValidBottomPosition(kVar);
                PendingPosition pendingPosition3 = this.K;
                if (hasValidBottomPosition) {
                    i2 = pendingPosition3.bottomPosition;
                } else if (pendingPosition3.hasValidTopPosition(kVar)) {
                    i2 = this.K.topPosition;
                } else if (d0() != 0) {
                    i2 = ((RecyclerView.LayoutParams) (this.b0 >= 0 ? I1() : J1()).getLayoutParams()).getViewLayoutPosition();
                }
            }
        }
        if (this.P && this.Z && i3 > 0) {
            i3--;
        }
        while (true) {
            r1s r1sVar2 = this.N;
            if (i3 > i) {
                r1sVar2.k();
                return;
            }
            t9x t9xVar = (t9x) r1sVar2.w;
            int i4 = 0;
            while (true) {
                ry10Var = null;
                if (i4 >= ((ArrayList) r1sVar2.c).size()) {
                    u9xVar = null;
                    break;
                }
                u9xVar = (u9x) ((ArrayList) r1sVar2.c).get(i4);
                if (u9xVar.a == i3) {
                    ((ArrayList) r1sVar2.c).remove(i4);
                    break;
                }
                i4++;
            }
            if (u9xVar == null) {
                ((hab) t9xVar).getClass();
                u9xVar = new ccz0();
            }
            ((ArrayList) r1sVar2.b).add(u9xVar);
            if (u9xVar.a != i3) {
                u9xVar.a = i3;
                hab habVar = (hab) t9xVar;
                habVar.getClass();
                qp3 qp3Var = ((ccz0) u9xVar).b;
                kgx[] kgxVarArr = ccz0.c;
                kgx kgxVar = kgxVarArr[0];
                z83.i();
                iif iifVar = habVar.c;
                int f = i3 - habVar.f();
                int f2 = i2 - habVar.f();
                yab yabVar = iifVar.g;
                if (yabVar != null) {
                    iifVar.c.getClass();
                    ry10Var = ui20.a(yabVar, f, f2);
                }
                if (ry10Var != null) {
                    ct21 e = habVar.a.a.e(habVar.y, new ky10(ry10Var));
                    kgx kgxVar2 = kgxVarArr[0];
                    qp3Var.b(e);
                }
            }
            i3++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void M(int i, int i2, RecyclerView.k kVar, o oVar) {
        int r0;
        int k;
        if (d0() == 0 || i2 == 0) {
            return;
        }
        d0 d0Var = this.J;
        if (i2 > 0) {
            View c0 = c0(0);
            r0 = RecyclerView.e.r0(c0) - 1;
            k = d0Var.b(c0) - d0Var.g();
        } else {
            View c02 = c0(d0() - 1);
            r0 = RecyclerView.e.r0(c02) + 1;
            k = (-d0Var.e(c02)) + d0Var.k();
        }
        if (r0 < 0 || r0 >= kVar.b()) {
            return;
        }
        oVar.a(r0, Math.max(0, k));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void O0(int i, int i2) {
        View c0;
        r1s r1sVar = this.N;
        if (r1sVar != null) {
            for (int i3 = 0; i3 < ((ArrayList) r1sVar.b).size(); i3++) {
                u9x u9xVar = (u9x) ((ArrayList) r1sVar.b).get(i3);
                int i4 = u9xVar.a;
                if (i4 >= i) {
                    u9xVar.a = i4 + i2;
                } else if (i4 + 1 == i) {
                    u9xVar.a = -1;
                }
            }
        }
        if (i == 0 && (c0 = c0(0)) != null && ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition() == 0) {
            d0 d0Var = this.J;
            int g = d0Var.g();
            int b = d0Var.b(c0);
            vu60 vu60Var = this.d0;
            F1(null, c0, vu60Var);
            if (g == vu60Var.a + b) {
                this.K.makeAtBottom(0);
                this.b0 = 0;
                return;
            }
        }
        this.K.onItemsAdded(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void P0() {
        r1s r1sVar = this.N;
        if (r1sVar != null) {
            for (int i = 0; i < ((ArrayList) r1sVar.b).size(); i++) {
                ((u9x) ((ArrayList) r1sVar.b).get(i)).a = -1;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void Q0(int i, int i2) {
        this.K.reset();
        r1s r1sVar = this.N;
        if (r1sVar != null) {
            for (int i3 = 0; i3 < ((ArrayList) r1sVar.b).size(); i3++) {
                ((u9x) ((ArrayList) r1sVar.b).get(i3)).a = -1;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int R(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        d0 d0Var = this.J;
        int g = d0Var.g();
        View I1 = I1();
        int i = 3;
        if (((RecyclerView.LayoutParams) I1.getLayoutParams()).getViewLayoutPosition() <= 0) {
            if (E1(null, I1) + I1.getBottom() <= g) {
                i = 5;
            }
        }
        View J1 = J1();
        if (((RecyclerView.LayoutParams) J1.getLayoutParams()).getViewLayoutPosition() + 1 < kVar.b()) {
            return i - 2;
        }
        return J1.getTop() - E1(J1, null) < d0Var.k() ? i - 2 : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void R0(int i, int i2) {
        this.K.onItemsRemoved(i, i2);
        r1s r1sVar = this.N;
        if (r1sVar != null) {
            for (int i3 = 0; i3 < ((ArrayList) r1sVar.b).size(); i3++) {
                u9x u9xVar = (u9x) ((ArrayList) r1sVar.b).get(i3);
                int i4 = u9xVar.a;
                if (i4 >= i + i2) {
                    u9xVar.a = i4 - i2;
                } else if (i4 + 1 >= i) {
                    u9xVar.a = -1;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int S(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        View J1 = J1();
        return (J1.getTop() - E1(J1, null) >= this.J.k() && ((RecyclerView.LayoutParams) J1.getLayoutParams()).getViewLayoutPosition() + 1 >= kVar.b()) ? 0 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void S0(RecyclerView recyclerView, int i, int i2) {
        r1s r1sVar = this.N;
        if (r1sVar != null) {
            for (int i3 = 0; i3 < ((ArrayList) r1sVar.b).size(); i3++) {
                u9x u9xVar = (u9x) ((ArrayList) r1sVar.b).get(i3);
                int i4 = u9xVar.a;
                if (i < i4) {
                    if (i + i2 > i4) {
                        u9xVar.a = -1;
                    }
                } else if (i <= i4 + 1) {
                    u9xVar.a = -1;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int T(RecyclerView.k kVar) {
        return d0() != 0 ? 5 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0315, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019a  */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0(r0 r0Var, RecyclerView.k kVar) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        int e;
        int b;
        int i5;
        boolean z6;
        d0 d0Var = this.J;
        z83.c(null, d0Var.i() == 0 && d0Var.f() == 0);
        z83.c(null, kVar.g);
        int k = d0Var.k();
        int g = d0Var.g();
        int m = d0Var.m();
        int l = (int) (d0Var.l() * this.Q);
        this.Z = false;
        this.a0 = -1;
        this.V = false;
        this.W = -1;
        if (this.K.hasValidPreservePosition(kVar)) {
            PendingPosition pendingPosition = this.K;
            boolean z7 = pendingPosition.preserveOffsetSpecified;
            int i6 = pendingPosition.preservePosition;
            if (z7) {
                i = pendingPosition.preserveOffset;
                pendingPosition.makePreserve(i6);
                z = false;
                i3 = -1;
                i4 = i6;
                z2 = true;
                i2 = 0;
            } else {
                View X = X(i6);
                if (X != null) {
                    int e2 = d0Var.e(X);
                    if (d0Var.b(X) < k || e2 > g) {
                        this.K.reset();
                        i5 = 0;
                        z6 = false;
                        i3 = -1;
                    } else {
                        i3 = this.K.preservePosition;
                        i5 = e2 - k;
                        z6 = true;
                    }
                    z2 = false;
                    i4 = -1;
                    z = z6;
                    i2 = i5;
                    i = 0;
                } else {
                    this.K.reset();
                }
            }
            if (i3 == -1 || i4 != -1) {
                z3 = true;
            } else {
                z3 = true;
                boolean hasValidVisiblePosition = this.K.hasValidVisiblePosition(kVar);
                PendingPosition pendingPosition2 = this.K;
                if (hasValidVisiblePosition) {
                    View X2 = X(pendingPosition2.visiblePosition);
                    if (X2 != null) {
                        int e3 = d0Var.e(X2);
                        int b2 = d0Var.b(X2);
                        if (e3 < k && b2 < k) {
                            i3 = this.K.visiblePosition;
                        } else if (e3 < k && b2 <= g) {
                            i3 = this.K.visiblePosition;
                        } else if (e3 < k && b2 > g) {
                            i3 = this.K.visiblePosition;
                        } else if (e3 <= g && b2 <= g) {
                            i3 = this.K.visiblePosition;
                            i2 = e3 - k;
                            z = true;
                        } else if (e3 <= g && b2 > g) {
                            i3 = this.K.visiblePosition;
                        } else if (e3 > g && b2 > g) {
                            i3 = this.K.visiblePosition;
                        }
                    } else {
                        i3 = this.K.visiblePosition;
                    }
                } else {
                    boolean hasValidBottomPosition = pendingPosition2.hasValidBottomPosition(kVar);
                    PendingPosition pendingPosition3 = this.K;
                    if (hasValidBottomPosition) {
                        i4 = pendingPosition3.bottomPosition;
                        if (pendingPosition3.bottomOffsetSpecified) {
                            i = pendingPosition3.bottomOffset;
                            z2 = true;
                        }
                    } else if (pendingPosition3.hasValidTopPosition(kVar)) {
                        i3 = this.K.topPosition;
                    } else {
                        int i7 = this.c0;
                        int i8 = this.b0;
                        if (i7 != 0) {
                            if (i8 > 0) {
                                View C1 = C1(g - ((k + g) / 4));
                                if (C1 != null) {
                                    i3 = ((RecyclerView.LayoutParams) C1.getLayoutParams()).getViewLayoutPosition();
                                    e = d0Var.e(C1);
                                    i2 = e - k;
                                    z = true;
                                }
                            } else {
                                View D1 = D1((k + g) / 4);
                                if (D1 != null) {
                                    i4 = ((RecyclerView.LayoutParams) D1.getLayoutParams()).getViewLayoutPosition();
                                    b = d0Var.b(D1);
                                    i = b - g;
                                    z2 = true;
                                }
                            }
                        } else if (i8 >= 0) {
                            View C12 = C1(g - m);
                            if (C12 != null) {
                                i4 = ((RecyclerView.LayoutParams) C12.getLayoutParams()).getViewLayoutPosition();
                                b = d0Var.b(C12) + m;
                                i = b - g;
                                z2 = true;
                            }
                        } else {
                            View D12 = D1(k);
                            if (D12 != null) {
                                i3 = ((RecyclerView.LayoutParams) D12.getLayoutParams()).getViewLayoutPosition();
                                e = d0Var.e(D12);
                                i2 = e - k;
                                z = true;
                            }
                        }
                    }
                }
            }
            U(r0Var);
            if (kVar.b() != 0) {
                K1(kVar);
                return;
            }
            if (i3 == -1 && i4 == -1) {
                if (this.O != null && getItemCount() > 0) {
                    ((hab) this.O).h(0);
                }
                if (getItemCount() > 0) {
                    i = 0;
                    i4 = 0;
                    z2 = false;
                }
            }
            if (i4 > kVar.b() - 1) {
                i4 = kVar.b() - 1;
                i = 0;
                z2 = false;
            }
            if (i3 > kVar.b() - 1) {
                i3 = kVar.b() - 1;
                i2 = 0;
                z = false;
            }
            vu60 vu60Var = this.d0;
            if (i4 != -1) {
                H1(r0Var, i4, g, null);
                if (!z2) {
                    A1(r0Var, g + 1);
                    F1(X(i4 - 1), X(i4), vu60Var);
                    i = -vu60Var.a;
                }
                if (i != 0) {
                    d0Var.p(i);
                }
                B1(-l, r0Var, kVar);
                A1(r0Var, d0Var.f() + l);
                View J1 = J1();
                int e4 = (d0Var.e(J1) - E1(null, J1)) - k;
                if (this.W == kVar.b() - 1 && e4 > 0) {
                    d0Var.p(-e4);
                    A1(r0Var, g);
                    View I1 = I1();
                    int b3 = g - d0Var.b(I1);
                    F1(null, I1, vu60Var);
                    int i9 = b3 - vu60Var.a;
                    if (i9 > 0) {
                        d0Var.p(i9);
                        B1(0, r0Var, kVar);
                    }
                }
            } else if (i3 != -1) {
                G1(r0Var, i3, k, null);
                if (!z) {
                    B1(k - 1, r0Var, kVar);
                    F1(X(i3), X(i3 + 1), vu60Var);
                    i2 = vu60Var.c;
                }
                if (i2 != 0) {
                    d0Var.p(i2);
                }
                A1(r0Var, d0Var.f() + l);
                View I12 = I1();
                int b4 = (g - d0Var.b(I12)) - E1(null, I12);
                if (this.a0 == 0 && b4 > 0) {
                    d0Var.p(b4);
                }
                B1(-l, r0Var, kVar);
            } else {
                boolean z8 = z3;
                this.V = z8;
                this.Z = z8;
            }
            K1(kVar);
            zq60 zq60Var = this.S;
            boolean isEmpty = zq60Var.isEmpty();
            ArrayList arrayList = zq60Var.a;
            if (!isEmpty) {
                int k2 = d0Var.k();
                int g2 = d0Var.g();
                for (int i10 = 0; i10 < d0(); i10++) {
                    View c0 = c0(i10);
                    if (c0 != null) {
                        int top = c0.getTop();
                        int bottom = c0.getBottom();
                        if (top < g2 && bottom > k2) {
                            zq60Var.b++;
                            int size = arrayList.size();
                            boolean z9 = false;
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                while (i12 < size && arrayList.get(i12) == null) {
                                    i12++;
                                }
                                if (i12 < size) {
                                    z4 = z9;
                                    z5 = true;
                                } else {
                                    if (!z9) {
                                        zq60.a(zq60Var);
                                        z9 = true;
                                    }
                                    z4 = z9;
                                    z5 = false;
                                }
                                if (z5) {
                                    while (i11 < size && arrayList.get(i11) == null) {
                                        i11++;
                                    }
                                    if (i11 >= size) {
                                        if (!z4) {
                                            zq60.a(zq60Var);
                                        }
                                        ny61.p();
                                        return;
                                    } else {
                                        ((dcz0) arrayList.get(i11)).a(c0);
                                        i11++;
                                        z9 = z4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z1();
            return;
        }
        i = 0;
        i2 = 0;
        z = false;
        z2 = false;
        i3 = -1;
        i4 = -1;
        if (i3 == -1) {
        }
        z3 = true;
        U(r0Var);
        if (kVar.b() != 0) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void V0(RecyclerView.k kVar) {
        d0 d0Var = this.J;
        d0Var.b = d0Var.l();
        v4a v4aVar = this.e0;
        if (v4aVar != null) {
            v4aVar.run();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void W0(Parcelable parcelable) {
        Objects.requireNonNull(parcelable);
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(getClass().getClassLoader());
        Parcelable parcelable2 = bundle.getParcelable("position");
        if (parcelable2 != null) {
            this.K = (PendingPosition) parcelable2;
        }
        this.b0 = bundle.getInt("last_scroll");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final View X(int i) {
        int d0 = d0();
        if (d0 == 0) {
            return null;
        }
        int viewLayoutPosition = i - ((RecyclerView.LayoutParams) I1().getLayoutParams()).getViewLayoutPosition();
        if (viewLayoutPosition >= 0 && viewLayoutPosition < d0) {
            View c0 = c0(viewLayoutPosition);
            Objects.requireNonNull(c0);
            if (((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition() == i) {
                return c0;
            }
        }
        return super.X(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final Parcelable X0() {
        Bundle bundle = new Bundle();
        boolean isEmpty = this.K.isEmpty();
        d0 d0Var = this.J;
        if (isEmpty) {
            int g = d0Var.g();
            View C1 = C1(g);
            if (C1 != null) {
                PendingPosition pendingPosition = new PendingPosition();
                pendingPosition.makeAtBottom(((RecyclerView.LayoutParams) C1.getLayoutParams()).getViewLayoutPosition(), d0Var.b(C1) - g);
                bundle.putParcelable("position", pendingPosition);
            }
        } else {
            PendingPosition pendingPosition2 = this.K;
            if (pendingPosition2.preservePosition == -1 || pendingPosition2.preserveOffsetSpecified) {
                bundle.putParcelable("position", pendingPosition2.copy());
            } else {
                int g2 = d0Var.g();
                View X = X(this.K.preservePosition);
                if (X != null) {
                    PendingPosition pendingPosition3 = new PendingPosition();
                    pendingPosition3.makePreserveWithOffset(this.K.preservePosition, d0Var.b(X) - g2);
                    bundle.putParcelable("position", pendingPosition3);
                }
            }
        }
        bundle.putInt("last_scroll", this.b0);
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Y() {
        return new RecyclerView.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void Y0(int i) {
        this.c0 = i;
    }

    @Override // androidx.recyclerview.widget.u0
    public final PointF d(int i) {
        if (d0() == 0) {
            return null;
        }
        return new PointF(0.0f, i < ((RecyclerView.LayoutParams) I1().getLayoutParams()).getViewLayoutPosition() ? 1 : -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void l1(int i) {
        this.K.makeVisible(i);
        View X = X(i);
        if (X != null) {
            d0 d0Var = this.J;
            int e = d0Var.e(X);
            int b = d0Var.b(X);
            if (e >= d0Var.k() && b <= d0Var.g()) {
                return;
            }
        }
        i1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x022c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c7, code lost:
    
        continue;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m1(int i, r0 r0Var, RecyclerView.k kVar) {
        int min;
        boolean z;
        boolean z2;
        z83.c(null, kVar.i);
        z83.c(null, kVar.g);
        z83.c(null, kVar.f);
        if (this.K.hasValidVisiblePosition(kVar)) {
            PendingPosition pendingPosition = this.K;
            pendingPosition.makePreserve(pendingPosition.visiblePosition);
        }
        if (d0() != 0) {
            this.b0 = i;
            d0 d0Var = this.J;
            int l = (int) (d0Var.l() * this.Q);
            if (i < 0) {
                B1(i - l, r0Var, kVar);
                View J1 = J1();
                int k = d0Var.k();
                int e = d0Var.e(J1);
                if (e > k + i) {
                    int E1 = e - E1(J1, null);
                    if (E1 < k) {
                        min = Math.max(i, E1 - k);
                    }
                    min = 0;
                }
                min = i;
            } else if (i > 0) {
                A1(r0Var, d0Var.f() + i + l);
                View I1 = I1();
                int g = d0Var.g();
                int b = d0Var.b(I1);
                if (b < g + i) {
                    int E12 = E1(null, I1) + b;
                    if (E12 > g) {
                        min = Math.min(i, E12 - g);
                    }
                    min = 0;
                }
                min = i;
            }
            d0Var.p(-min);
            if (i < 0) {
                View c0 = c0(1);
                int l2 = ((int) (d0Var.l() * this.Q)) + d0Var.f();
                while (c0 != null && d0Var.b(c0) > l2) {
                    View I12 = I1();
                    int viewLayoutPosition = ((RecyclerView.LayoutParams) I12.getLayoutParams()).getViewLayoutPosition();
                    if (this.a0 != -1 && viewLayoutPosition < getItemCount() - 1 && this.a0 <= viewLayoutPosition) {
                        this.a0 = viewLayoutPosition + 1;
                    }
                    e1(I12, r0Var);
                    c0 = c0(1);
                }
            } else {
                View c02 = c0(d0() - 2);
                while (c02 != null && d0Var.e(c02) < (-((int) (d0Var.l() * this.Q)))) {
                    View J12 = J1();
                    int viewLayoutPosition2 = ((RecyclerView.LayoutParams) J12.getLayoutParams()).getViewLayoutPosition();
                    int i2 = this.W;
                    if (i2 != -1 && viewLayoutPosition2 > 0 && i2 >= viewLayoutPosition2) {
                        this.W = viewLayoutPosition2 - 1;
                    }
                    e1(J12, r0Var);
                    c02 = c0(d0() - 2);
                }
            }
            if (this.K.hasValidPreservePosition(kVar)) {
                int k2 = d0Var.k();
                int g2 = d0Var.g();
                View X = X(this.K.preservePosition);
                if (X != null) {
                    int e2 = d0Var.e(X);
                    if (d0Var.b(X) < k2 || e2 > g2) {
                        this.K.reset();
                    }
                } else {
                    this.K.reset();
                }
            } else {
                this.K.reset();
            }
            K1(kVar);
            zq60 zq60Var = this.S;
            boolean isEmpty = zq60Var.isEmpty();
            ArrayList arrayList = zq60Var.a;
            if (!isEmpty) {
                int k3 = d0Var.k();
                int g3 = d0Var.g();
                if (min < 0) {
                    for (int d0 = d0() - 1; d0 >= 0; d0--) {
                        View c03 = c0(d0);
                        if (c03 != null) {
                            int bottom = c03.getBottom();
                            if (bottom > k3 - min) {
                                break;
                            }
                            if (bottom > k3 && bottom < g3) {
                                zq60Var.b++;
                                int size = arrayList.size();
                                int i3 = 0;
                                boolean z3 = false;
                                while (true) {
                                    int i4 = i3;
                                    while (i4 < size && arrayList.get(i4) == null) {
                                        i4++;
                                    }
                                    if (i4 < size) {
                                        z2 = true;
                                    } else {
                                        if (!z3) {
                                            zq60.a(zq60Var);
                                            z3 = true;
                                        }
                                        z2 = false;
                                    }
                                    if (z2) {
                                        while (i3 < size && arrayList.get(i3) == null) {
                                            i3++;
                                        }
                                        if (i3 >= size) {
                                            if (!z3) {
                                                zq60.a(zq60Var);
                                            }
                                            ny61.p();
                                            return 0;
                                        }
                                        ((dcz0) arrayList.get(i3)).a(c03);
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int i5 = 0; i5 < d0(); i5++) {
                        View c04 = c0(i5);
                        if (c04 != null) {
                            int top = c04.getTop();
                            if (top < g3 - min) {
                                break;
                            }
                            if (top > k3 && top < g3) {
                                zq60Var.b++;
                                int size2 = arrayList.size();
                                int i6 = 0;
                                boolean z4 = false;
                                while (true) {
                                    int i7 = i6;
                                    while (i7 < size2 && arrayList.get(i7) == null) {
                                        i7++;
                                    }
                                    if (i7 < size2) {
                                        z = true;
                                    } else {
                                        if (!z4) {
                                            zq60.a(zq60Var);
                                            z4 = true;
                                        }
                                        z = false;
                                    }
                                    if (z) {
                                        while (i6 < size2 && arrayList.get(i6) == null) {
                                            i6++;
                                        }
                                        if (i6 >= size2) {
                                            if (!z4) {
                                                zq60.a(zq60Var);
                                            }
                                            ny61.p();
                                            return 0;
                                        }
                                        ((dcz0) arrayList.get(i6)).a(c04);
                                        i6++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z1();
            return min;
        }
        return 0;
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

    public final void z1() {
        View C1;
        boolean z;
        zq60 zq60Var = this.T;
        boolean isEmpty = zq60Var.isEmpty();
        ArrayList arrayList = zq60Var.a;
        if (isEmpty) {
            return;
        }
        if (d0() == 0) {
            C1 = null;
        } else {
            d0 d0Var = this.J;
            C1 = C1((d0Var.g() + d0Var.k()) / 2);
        }
        int viewLayoutPosition = C1 == null ? -1 : ((RecyclerView.LayoutParams) C1.getLayoutParams()).getViewLayoutPosition();
        int i = this.U;
        if (viewLayoutPosition == i) {
            return;
        }
        this.U = viewLayoutPosition;
        zq60Var.b++;
        int size = arrayList.size();
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            int i3 = i2;
            while (i3 < size && arrayList.get(i3) == null) {
                i3++;
            }
            if (i3 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                return;
            }
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            }
            ((g) arrayList.get(i2)).a(i, viewLayoutPosition);
            i2++;
        }
    }
}
