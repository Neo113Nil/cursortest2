package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class b6b0 extends RecyclerView.d {
    public final int a;

    public b6b0(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if ((adapter != null ? adapter.getItemCount() : 0) >= 2 && recyclerView.getChildAdapterPosition(view) != -1) {
            int i = this.a / 2;
            rect.top = i;
            rect.bottom = i;
        }
    }
}
