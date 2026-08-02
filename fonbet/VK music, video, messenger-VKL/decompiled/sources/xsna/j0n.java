package xsna;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DisallowParentHorizontalScrollTouchListener.kt */
/* loaded from: classes4.dex */
public final class j0n implements RecyclerView.s {
    public float b;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r0 != 3) goto L14;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = motionEvent.getX();
            return false;
        }
        if (action != 1) {
            if (action == 2) {
                if (Math.abs(motionEvent.getX() - this.b) > 5.0f) {
                    recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            return false;
        }
        recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void h(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void f(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
