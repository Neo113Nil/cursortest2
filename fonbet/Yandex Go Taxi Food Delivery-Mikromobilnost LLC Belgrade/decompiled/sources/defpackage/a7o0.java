package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class a7o0 extends lf31 {
    public final int c;

    public a7o0(Context context) {
        super(tje.r(mrg0.go_design_s_space, context));
        this.c = tje.u(12, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount >= 2 && (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) != -1 && (this.b || childAdapterPosition < itemCount - 1)) {
            rect.bottom = this.a;
        }
        if (jl40.l(view.getTag(), qoi0.a(b7o0.class))) {
            return;
        }
        int i = this.c;
        rect.left = i;
        rect.right = i;
    }
}
