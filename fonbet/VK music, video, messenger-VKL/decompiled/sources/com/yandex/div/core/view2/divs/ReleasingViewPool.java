package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: ReleasingViewPool.kt */
/* loaded from: classes7.dex */
public final class ReleasingViewPool extends RecyclerView.u {
    private final ReleaseViewVisitor releaseViewVisitor;
    private final Set<RecyclerView.e0> viewsSet = new LinkedHashSet();

    public ReleasingViewPool(ReleaseViewVisitor releaseViewVisitor) {
        this.releaseViewVisitor = releaseViewVisitor;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void clear() {
        super.clear();
        Iterator<T> it = this.viewsSet.iterator();
        while (it.hasNext()) {
            DivViewVisitorKt.visitViewTree(this.releaseViewVisitor, ((RecyclerView.e0) it.next()).itemView);
        }
        this.viewsSet.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public RecyclerView.e0 getRecycledView(int i) {
        RecyclerView.e0 recycledView = super.getRecycledView(i);
        if (recycledView == null) {
            return null;
        }
        this.viewsSet.remove(recycledView);
        return recycledView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void putRecycledView(RecyclerView.e0 e0Var) {
        super.putRecycledView(e0Var);
        if (e0Var != null) {
            this.viewsSet.add(e0Var);
        }
    }
}
