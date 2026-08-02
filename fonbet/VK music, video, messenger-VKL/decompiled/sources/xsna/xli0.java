package xsna;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SequentialPlayDelegate.kt */
/* loaded from: classes2.dex */
public final class xli0 implements bva0 {
    public final RecyclerView a;

    /* compiled from: SequentialPlayDelegate.kt */
    public static final class a extends androidx.recyclerview.widget.v {
        @Override // androidx.recyclerview.widget.v
        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return x9.b(i4, i3, 2, i3) - (((i2 - i) / 2) + i);
        }

        @Override // androidx.recyclerview.widget.v
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public xli0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // xsna.bva0
    public final int a(int i, RecyclerView.Adapter<?> adapter) {
        int itemCount = (i + 1) % adapter.getItemCount();
        RecyclerView recyclerView = this.a;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            recyclerView.smoothScrollToPosition(itemCount);
            return itemCount;
        }
        int v = linearLayoutManager.v();
        int x = linearLayoutManager.x();
        if (v != -1 && x != -1) {
            int i2 = (v + x) / 2;
            boolean z = itemCount < adapter.getItemCount() - 1;
            if (itemCount > i2 && z) {
                a aVar = new a(recyclerView.getContext());
                aVar.setTargetPosition(itemCount);
                linearLayoutManager.startSmoothScroll(aVar);
                return itemCount;
            }
            recyclerView.smoothScrollToPosition(itemCount);
        }
        return itemCount;
    }
}
