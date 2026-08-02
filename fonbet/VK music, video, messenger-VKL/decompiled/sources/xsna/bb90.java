package xsna;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.pagergrid.PagerGridLayoutManager;

/* compiled from: PagerGridSmoothScroller.kt */
/* loaded from: classes12.dex */
public final class bb90 extends androidx.recyclerview.widget.v {
    public final RecyclerView a;

    public bb90(RecyclerView recyclerView) {
        super(recyclerView.getContext());
        this.a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.v
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
    public final void onTargetFound(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        RecyclerView recyclerView = this.a;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof PagerGridLayoutManager)) {
            int[] r = ((PagerGridLayoutManager) layoutManager).r(recyclerView.getChildAdapterPosition(view));
            int i = r[0];
            int i2 = r[1];
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs < abs2) {
                abs = abs2;
            }
            int calculateTimeForScrolling = calculateTimeForScrolling(abs);
            if (calculateTimeForScrolling > 0) {
                aVar.b(i, i2, this.mDecelerateInterpolator, calculateTimeForScrolling);
            }
        }
    }
}
