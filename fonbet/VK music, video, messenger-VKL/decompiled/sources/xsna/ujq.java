package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FakePaddingDecoration.kt */
/* loaded from: classes2.dex */
public final class ujq extends RecyclerView.n {
    public int b;
    public int c;

    public /* synthetic */ ujq(int i, int i2, int i3) {
        this((i3 & 2) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i = 0;
        if (this.b > 0) {
            rect.top = recyclerView.getChildAdapterPosition(view) == 0 ? this.b : 0;
        }
        if (this.c > 0) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (childAdapterPosition >= 0 && childAdapterPosition == itemCount - 1) {
                i = this.c;
            }
            rect.bottom = i;
        }
    }

    public ujq(int i, int i2) {
        this.b = i;
        this.c = i2;
    }
}
