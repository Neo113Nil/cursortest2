package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AlbumsItem.kt */
/* loaded from: classes4.dex */
public final class in1 extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1;
        if (itemCount < 0) {
            itemCount = 0;
        }
        boolean z = childAdapterPosition == 0;
        boolean z2 = childAdapterPosition == itemCount;
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new f20(1));
        if (z) {
            rect.left = ((Number) a.getValue()).intValue();
        } else if (z2) {
            rect.right = ((Number) a.getValue()).intValue();
        }
    }
}
