package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CarouselDecoration.kt */
/* loaded from: classes2.dex */
public final class nu9 extends RecyclerView.n {
    public int b;
    public int c;
    public int d;
    public boolean e;

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i = this.d;
        rect.setEmpty();
        if (this.e) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = i + this.b;
                return;
            } else {
                rect.left = i;
                return;
            }
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.left = this.c;
        }
        if (childAdapterPosition == a0Var.b() - 1) {
            rect.right = i + this.b;
        } else {
            rect.right = i;
        }
    }
}
