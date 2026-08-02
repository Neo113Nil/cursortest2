package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ModalAddPhotoActionView.kt */
/* loaded from: classes3.dex */
public final class cv20 extends RecyclerView.n {
    public final int b = iah0.a(6);

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            return;
        }
        int i = this.b;
        rect.right = i;
        rect.bottom = i;
        rect.left = i;
        rect.top = i;
    }
}
