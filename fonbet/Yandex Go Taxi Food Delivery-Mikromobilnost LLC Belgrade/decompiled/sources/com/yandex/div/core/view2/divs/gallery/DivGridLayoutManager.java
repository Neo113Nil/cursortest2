package com.yandex.div.core.view2.divs.gallery;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.g1;
import androidx.recyclerview.widget.r0;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivGallery;
import defpackage.aw5;
import defpackage.cxk;
import defpackage.egk;
import defpackage.h9l;
import defpackage.j73;
import defpackage.urk;
import defpackage.z3k;
import java.util.HashSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGridLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "Lurk;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements urk {
    public final aw5 j0;
    public final RecyclerView k0;
    public final DivGallery l0;
    public final HashSet m0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivGridLayoutManager(aw5 aw5Var, DivRecyclerView divRecyclerView, DivGallery divGallery, int i) {
        super(r0, i);
        int i2;
        Expression expression = divGallery.h;
        if (expression != null) {
            long longValue = ((Number) expression.a(aw5Var.b)).longValue();
            long j = longValue >> 31;
            i2 = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i2 = 1;
        }
        this.j0 = aw5Var;
        this.k0 = divRecyclerView;
        this.l0 = divGallery;
        this.m0 = new HashSet();
    }

    @Override // defpackage.urk
    public final int B(View view) {
        return RecyclerView.e.r0(view);
    }

    @Override // defpackage.urk
    public final int C() {
        int itemCount = getItemCount();
        int i = this.J;
        if (itemCount < i) {
            itemCount = i;
        }
        int[] iArr = new int[itemCount];
        if (itemCount < i) {
            z3k.a(this.J, itemCount);
            return 0;
        }
        for (int i2 = 0; i2 < this.J; i2++) {
            g1 g1Var = this.K[i2];
            iArr[i2] = g1Var.f.Q ? g1Var.h(0, g1Var.a.size(), true, true, false) : g1Var.h(r1.size() - 1, -1, true, true, false);
        }
        return j73.N(iArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void C0(int i, int i2, int i3, int i4, View view) {
        c(view, i, i2, i3, i4, false);
    }

    @Override // defpackage.urk
    public final int D() {
        return this.N;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void H0(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            k(recyclerView.getChildAt(i), false);
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void I0(RecyclerView recyclerView, r0 r0Var) {
        super.I0(recyclerView, r0Var);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            k(recyclerView.getChildAt(i), true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void V(int i) {
        super.V(i);
        View E = E(i);
        if (E == null) {
            return;
        }
        k(E, true);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void V0(RecyclerView.k kVar) {
        n();
        super.V0(kVar);
    }

    @Override // defpackage.urk
    public final int a() {
        int itemCount = getItemCount();
        int i = this.J;
        if (itemCount < i) {
            itemCount = i;
        }
        int[] iArr = new int[itemCount];
        if (itemCount < i) {
            z3k.a(this.J, itemCount);
            return 0;
        }
        for (int i2 = 0; i2 < this.J; i2++) {
            g1 g1Var = this.K[i2];
            iArr[i2] = g1Var.f.Q ? g1Var.h(r1.size() - 1, -1, false, true, false) : g1Var.h(0, g1Var.a.size(), false, true, false);
        }
        return j73.B(iArr);
    }

    @Override // defpackage.urk
    public final int b() {
        int itemCount = getItemCount();
        int i = this.J;
        if (itemCount < i) {
            itemCount = i;
        }
        int[] iArr = new int[itemCount];
        if (itemCount < i) {
            z3k.a(this.J, itemCount);
            return 0;
        }
        for (int i2 = 0; i2 < this.J; i2++) {
            g1 g1Var = this.K[i2];
            iArr[i2] = g1Var.f.Q ? g1Var.h(0, g1Var.a.size(), false, true, false) : g1Var.h(r1.size() - 1, -1, false, true, false);
        }
        return j73.N(iArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void c1(r0 r0Var) {
        RecyclerView c0 = getC0();
        int childCount = c0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            k(c0.getChildAt(i), true);
        }
        super.c1(r0Var);
    }

    public final int c2() {
        DivGallery divGallery = this.l0;
        Expression expression = divGallery.k;
        RecyclerView recyclerView = this.k0;
        aw5 aw5Var = this.j0;
        return expression != null ? com.yandex.div.core.view2.divs.a.o(Long.valueOf(((Number) expression.a(aw5Var.b)).longValue()), recyclerView.getResources().getDisplayMetrics()) : com.yandex.div.core.view2.divs.a.o((Long) divGallery.t.a(aw5Var.b), recyclerView.getResources().getDisplayMetrics());
    }

    public final int d2(int i) {
        return i == this.N ? com.yandex.div.core.view2.divs.a.o((Long) this.l0.t.a(this.j0.b), this.k0.getResources().getDisplayMetrics()) : c2();
    }

    @Override // defpackage.urk
    public final int e() {
        int itemCount = getItemCount();
        int i = this.J;
        if (itemCount < i) {
            itemCount = i;
        }
        int[] iArr = new int[itemCount];
        if (itemCount < i) {
            z3k.a(this.J, itemCount);
            return 0;
        }
        for (int i2 = 0; i2 < this.J; i2++) {
            g1 g1Var = this.K[i2];
            iArr[i2] = g1Var.f.Q ? g1Var.h(r1.size() - 1, -1, true, true, false) : g1Var.h(0, g1Var.a.size(), true, true, false);
        }
        return j73.B(iArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void f1(View view) {
        super.f1(view);
        k(view, true);
    }

    @Override // defpackage.urk
    public final void g(int i, int i2, int i3, int i4, View view) {
        super.C0(i, i2, i3, i4, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g1(int i) {
        super.g1(i);
        View E = E(i);
        if (E == null) {
            return;
        }
        k(E, true);
    }

    @Override // defpackage.urk
    /* renamed from: getBindingContext, reason: from getter */
    public final aw5 getB0() {
        return this.j0;
    }

    @Override // defpackage.urk
    /* renamed from: getDiv, reason: from getter */
    public final DivGallery getD0() {
        return this.l0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int getPaddingBottom() {
        return super.getPaddingBottom() - (d2(1) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int getPaddingLeft() {
        return super.getPaddingLeft() - (d2(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int getPaddingRight() {
        return super.getPaddingRight() - (d2(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int getPaddingTop() {
        return super.getPaddingTop() - (d2(1) / 2);
    }

    @Override // defpackage.urk
    /* renamed from: getView, reason: from getter */
    public final RecyclerView getC0() {
        return this.k0;
    }

    @Override // defpackage.urk
    public final void i(int i, ScrollPosition scrollPosition) {
        q(i, 0, scrollPosition);
    }

    @Override // defpackage.urk
    public final void j(int i, int i2, ScrollPosition scrollPosition) {
        q(i, i2, scrollPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void m(View view, Rect rect) {
        cxk y;
        super.m(view, rect);
        int r0 = RecyclerView.e.r0(view);
        if (r0 == -1 || (y = y(r0)) == null) {
            return;
        }
        egk d = y.a.d();
        boolean z = d.getHeight() instanceof h9l;
        boolean z2 = d.getWidth() instanceof h9l;
        int i = 0;
        boolean z3 = this.J > 1;
        int d2 = (z && z3) ? d2(1) / 2 : 0;
        if (z2 && z3) {
            i = d2(0) / 2;
        }
        rect.set(rect.left - i, rect.top - d2, rect.right - i, rect.bottom - d2);
    }

    @Override // defpackage.urk
    /* renamed from: s, reason: from getter */
    public final HashSet getE0() {
        return this.m0;
    }

    @Override // defpackage.urk
    public final int width() {
        return this.H;
    }

    @Override // defpackage.urk
    public final RecyclerView.e x() {
        return this;
    }

    @Override // defpackage.urk
    public final cxk y(int i) {
        return (cxk) kotlin.collections.a.S(i, ((a) this.k0.getAdapter()).g());
    }
}
