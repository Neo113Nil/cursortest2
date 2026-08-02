package xsna;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: StoryStatisticsViewersAdapter.kt */
/* loaded from: classes6.dex */
public final class thm0 implements RecyclerView.s {
    public float b;

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = motionEvent.getX();
            s3q0 s3q0Var = s3q0.a;
            return false;
        }
        boolean z = true;
        if (action == 1) {
            this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            s3q0 s3q0Var2 = s3q0.a;
            return false;
        }
        if (action != 2) {
            s3q0 s3q0Var3 = s3q0.a;
            return false;
        }
        boolean z2 = motionEvent.getX() < this.b;
        boolean z3 = z2 && recyclerView.canScrollHorizontally(1);
        boolean z4 = !z2 && recyclerView.canScrollHorizontally(-1);
        if (!z3 && !z4) {
            z = false;
        }
        recyclerView.getParent().requestDisallowInterceptTouchEvent(z);
        s3q0 s3q0Var4 = s3q0.a;
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void h(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void f(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
