package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ClipsVideoAttachmentPickerFragment.kt */
/* loaded from: classes16.dex */
public final class nmf extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.top = iah0.a(8) + rect.top;
        }
    }
}
