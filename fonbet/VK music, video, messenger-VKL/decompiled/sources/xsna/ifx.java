package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InterestsItemsDecorator.kt */
/* loaded from: classes16.dex */
public final class ifx extends RecyclerView.n {
    public final we0 c;
    public final int b = 3;
    public final int d = iah0.a(16.0f);
    public final int e = iah0.a(32.0f);

    public ifx(we0 we0Var) {
        this.c = we0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int i = this.b;
        int i2 = childLayoutPosition / i;
        int b = (a0Var.b() <= i || a0Var.b() % i != 0) ? a0Var.b() / i : (a0Var.b() / i) - 1;
        rect.top = this.d;
        if (i2 == b) {
            rect.bottom = ((Number) this.c.invoke()).intValue() + this.e;
        }
    }
}
