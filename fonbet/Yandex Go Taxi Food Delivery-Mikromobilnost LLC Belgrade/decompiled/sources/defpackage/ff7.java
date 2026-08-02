package defpackage;

import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class ff7 extends RecyclerView.i {
    public float a;

    @Override // androidx.recyclerview.widget.RecyclerView.i, defpackage.vji0
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a = motionEvent.getY();
            for (ViewParent parent = recyclerView.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 2) {
            float y = motionEvent.getY();
            float f = y - this.a;
            boolean canScrollVertically = recyclerView.canScrollVertically(-1);
            boolean z = !((((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) < 0) && !recyclerView.canScrollVertically(1)) || (((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) > 0) && !canScrollVertically));
            for (ViewParent parent2 = recyclerView.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                parent2.requestDisallowInterceptTouchEvent(z);
            }
            this.a = y;
            return false;
        }
        return false;
    }
}
