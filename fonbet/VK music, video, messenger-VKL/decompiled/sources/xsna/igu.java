package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GridSpacingItemDecoration.kt */
/* loaded from: classes17.dex */
public final class igu extends RecyclerView.n {
    public int b;
    public final int c;
    public final int d;

    /* compiled from: GridSpacingItemDecoration.kt */
    public static final class a {
        public int a;
        public int b;
        public int c;

        public final igu a() {
            return new igu(this.a, this.b, this.c);
        }

        public final void b(int i) {
            this.b = i;
            this.c = i;
        }

        public final void c() {
            this.a = 3;
        }
    }

    public igu(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.b;
        int i2 = childAdapterPosition % i;
        int i3 = this.c;
        rect.left = (i2 * i3) / i;
        rect.right = i3 - (((i2 + 1) * i3) / i);
        if (childAdapterPosition >= i) {
            rect.top = this.d;
        }
    }
}
