package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.gallery.ScrollPosition;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div2.DivGallery;
import defpackage.aw5;
import defpackage.cxk;
import defpackage.urk;
import java.util.HashSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/recyclerview/widget/DivLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lurk;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivLinearLayoutManager extends LinearLayoutManager implements urk {
    public final aw5 b0;
    public final RecyclerView c0;
    public final DivGallery d0;
    public final HashSet e0;

    public DivLinearLayoutManager(aw5 aw5Var, DivRecyclerView divRecyclerView, DivGallery divGallery, int i) {
        super(divRecyclerView.getContext(), i, false);
        this.b0 = aw5Var;
        this.c0 = divRecyclerView;
        this.d0 = divGallery;
        this.e0 = new HashSet();
    }

    @Override // defpackage.urk
    public final int B(View view) {
        return RecyclerView.e.r0(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void C0(int i, int i2, int i3, int i4, View view) {
        c(view, i, i2, i3, i4, false);
    }

    @Override // defpackage.urk
    public final int D() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void H0(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            k(recyclerView.getChildAt(i), false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
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

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void V0(RecyclerView.k kVar) {
        n();
        super.V0(kVar);
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
        return this.b0;
    }

    @Override // defpackage.urk
    /* renamed from: getDiv, reason: from getter */
    public final DivGallery getD0() {
        return this.d0;
    }

    @Override // defpackage.urk
    /* renamed from: getView, reason: from getter */
    public final RecyclerView getC0() {
        return this.c0;
    }

    @Override // defpackage.urk
    public final void i(int i, ScrollPosition scrollPosition) {
        q(i, 0, scrollPosition);
    }

    @Override // defpackage.urk
    public final void j(int i, int i2, ScrollPosition scrollPosition) {
        q(i, i2, scrollPosition);
    }

    @Override // defpackage.urk
    /* renamed from: s, reason: from getter */
    public final HashSet getE0() {
        return this.e0;
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
        return (cxk) kotlin.collections.a.S(i, ((com.yandex.div.core.view2.divs.gallery.a) this.c0.getAdapter()).g());
    }
}
