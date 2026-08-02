package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: TopLineDecoration.kt */
/* loaded from: classes7.dex */
public final class x8p0 extends RecyclerView.n {
    public final Drawable b;
    public final int c;

    public x8p0(Drawable drawable, int i) {
        this.b = drawable;
        this.c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && childAdapterPosition == 0) {
            rect.set(0, this.b.getIntrinsicHeight(), 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        View childAt = recyclerView.getChildAt(0);
        int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) childAt.getLayoutParams())).topMargin;
        Drawable drawable = this.b;
        int intrinsicHeight = top - drawable.getIntrinsicHeight();
        int top2 = childAt.getTop();
        int paddingLeft = recyclerView.getPaddingLeft();
        int i = this.c;
        drawable.setBounds(paddingLeft + i, intrinsicHeight, (recyclerView.getWidth() - recyclerView.getPaddingRight()) - i, top2);
        drawable.draw(canvas);
    }
}
