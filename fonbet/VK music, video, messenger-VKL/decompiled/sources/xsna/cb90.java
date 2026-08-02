package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.pagergrid.PagerGridLayoutManager;

/* compiled from: PagerGridSnapHelper.kt */
/* loaded from: classes12.dex */
public final class cb90 extends androidx.recyclerview.widget.o0 {
    public RecyclerView a;

    @Override // androidx.recyclerview.widget.o0
    public final void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        super.attachToRecyclerView(recyclerView);
        this.a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.o0
    public final int[] calculateDistanceToFinalSnap(RecyclerView.o oVar, View view) {
        return oVar instanceof PagerGridLayoutManager ? ((PagerGridLayoutManager) oVar).r(oVar.getPosition(view)) : new int[2];
    }

    @Override // androidx.recyclerview.widget.o0
    public final RecyclerView.z createScroller(RecyclerView.o oVar) {
        RecyclerView recyclerView;
        if ((oVar instanceof RecyclerView.z.b) && (recyclerView = this.a) != null) {
            return new bb90(recyclerView);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o0
    public final View findSnapView(RecyclerView.o oVar) {
        if (!(oVar instanceof PagerGridLayoutManager)) {
            return null;
        }
        PagerGridLayoutManager pagerGridLayoutManager = (PagerGridLayoutManager) oVar;
        if (pagerGridLayoutManager.getFocusedChild() != null) {
            return pagerGridLayoutManager.getFocusedChild();
        }
        if (pagerGridLayoutManager.getChildCount() <= 0) {
            return null;
        }
        int q = pagerGridLayoutManager.q() * pagerGridLayoutManager.f;
        int childCount = pagerGridLayoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (pagerGridLayoutManager.getPosition(pagerGridLayoutManager.getChildAt(i)) == q) {
                return pagerGridLayoutManager.getChildAt(i);
            }
        }
        return pagerGridLayoutManager.getChildAt(0);
    }

    @Override // androidx.recyclerview.widget.o0
    public final int findTargetSnapPosition(RecyclerView.o oVar, int i, int i2) {
        if (oVar instanceof PagerGridLayoutManager) {
            PagerGridLayoutManager pagerGridLayoutManager = (PagerGridLayoutManager) oVar;
            pagerGridLayoutManager.getClass();
            int i3 = pagerGridLayoutManager.f;
            if (i > 1000) {
                int i4 = pagerGridLayoutManager.r + 1;
                if (i4 >= pagerGridLayoutManager.s()) {
                    i4 = pagerGridLayoutManager.s() - 1;
                }
                return i4 * i3;
            }
            if (i < -1000) {
                int i5 = pagerGridLayoutManager.r - 1;
                if (i5 < 0) {
                    i5 = 0;
                }
                return i5 * i3;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.o0, androidx.recyclerview.widget.RecyclerView.r
    public final boolean onFling(int i, int i2) {
        RecyclerView recyclerView;
        RecyclerView.o layoutManager;
        RecyclerView.z createScroller;
        int findTargetSnapPosition;
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == null || recyclerView2.getAdapter() == null || (recyclerView = this.a) == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return false;
        }
        if ((Math.abs(i2) <= 1000 && Math.abs(i) <= 1000) || !(layoutManager instanceof RecyclerView.z.b) || (createScroller = createScroller(layoutManager)) == null || (findTargetSnapPosition = findTargetSnapPosition(layoutManager, i, i2)) == -1) {
            return false;
        }
        createScroller.setTargetPosition(findTargetSnapPosition);
        layoutManager.startSmoothScroll(createScroller);
        return true;
    }
}
