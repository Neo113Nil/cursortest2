package xsna;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ChatClipsBottomBarDecorationView.kt */
/* loaded from: classes2.dex */
public final class aob implements RecyclerView.s {
    public final /* synthetic */ RecyclerView b;

    public aob(RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RecyclerView recyclerView2 = this.b;
        if (action == 0) {
            recyclerView2.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
        if (action != 1) {
            return false;
        }
        recyclerView2.getParent().requestDisallowInterceptTouchEvent(false);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void h(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void f(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
