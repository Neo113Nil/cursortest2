package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class j86 extends RecyclerView.d {
    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition;
        ob31 ob31Var;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount >= 2 && (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) != -1) {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            i86 i86Var = adapter2 instanceof i86 ? (i86) adapter2 : null;
            if (i86Var == null || (ob31Var = (ob31) i86Var.getItem(childAdapterPosition)) == null) {
                return;
            }
            vl4 vl4Var = ob31Var.e;
            int u = tje.u((vl4Var != null ? vl4Var.f : null) != null ? 12 : 16, view.getContext());
            if (childAdapterPosition < itemCount - 1) {
                if (xw31.k(recyclerView.getContext())) {
                    rect.right = u;
                } else {
                    rect.left = u;
                }
            }
        }
    }
}
