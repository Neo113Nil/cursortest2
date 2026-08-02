package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AppPickerDialog.kt */
/* loaded from: classes15.dex */
public final class y73 extends RecyclerView.n {
    public final int b = cn70.b(8);
    public final /* synthetic */ GridLayoutManager c;

    public y73(GridLayoutManager gridLayoutManager) {
        this.c = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.getChildAdapterPosition(view) / this.c.s > 0) {
            rect.top = this.b;
        } else {
            rect.setEmpty();
        }
    }
}
