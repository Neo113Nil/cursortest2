package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class gis0 extends RecyclerView.d {
    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() != 1) {
            return;
        }
        rect.set((recyclerView.getWidth() - view.getMinimumWidth()) / 2, rect.top, 0, rect.bottom);
    }
}
