package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s0 extends RecyclerView.a {
    public final /* synthetic */ RecyclerView a;

    public s0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (recyclerView.mAdapterHelper.i()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void c(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a aVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = aVar.b;
        if (i2 < 1) {
            return;
        }
        arrayList.add(aVar.b(4, obj, i, i2));
        aVar.y |= 4;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a aVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = aVar.b;
        if (i2 < 1) {
            return;
        }
        arrayList.add(aVar.b(1, null, i, i2));
        aVar.y |= 1;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void e(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a aVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = aVar.b;
        if (i == i2) {
            return;
        }
        arrayList.add(aVar.b(8, null, i, i2));
        aVar.y |= 8;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void f(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a aVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = aVar.b;
        if (i2 < 1) {
            return;
        }
        arrayList.add(aVar.b(2, null, i, i2));
        aVar.y |= 2;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void g() {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = this.a;
        if (recyclerView.mPendingSavedState == null || (adapter = recyclerView.mAdapter) == null || !adapter.canRestoreState()) {
            return;
        }
        recyclerView.requestLayout();
    }

    public final void h() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            recyclerView.postOnAnimation(runnable);
        }
    }
}
