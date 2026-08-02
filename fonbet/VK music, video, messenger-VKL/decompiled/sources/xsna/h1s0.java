package xsna;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: VideoAlbumsController.kt */
/* loaded from: classes7.dex */
public final class h1s0 extends RecyclerView.y {
    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || recyclerView.getScrollState() == 0) {
            return false;
        }
        recyclerView.stopScroll();
        return false;
    }
}
