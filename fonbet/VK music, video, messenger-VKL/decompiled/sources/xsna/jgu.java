package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GridSpacingItemDecoration.kt */
/* loaded from: classes3.dex */
public final class jgu extends RecyclerView.n {
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;

    public /* synthetic */ jgu(int i, int i2, boolean z) {
        this(i, i2, z, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view) - this.d;
        if (childAdapterPosition < 0) {
            rect.set(0, 0, 0, 0);
            return;
        }
        boolean z = this.c;
        int i = this.b;
        int i2 = this.e;
        if (!z) {
            if (i != 1) {
                int i3 = childAdapterPosition % i;
                if (i3 == 0) {
                    rect.right = (i2 * 2) / 3;
                } else if (i3 == i - 1) {
                    rect.left = (i2 * 2) / 3;
                } else {
                    int i4 = i2 / 3;
                    rect.left = i4;
                    rect.right = i4;
                }
            }
            if (childAdapterPosition >= i) {
                rect.top = i2;
                return;
            }
            return;
        }
        int i5 = childAdapterPosition % i;
        if (i5 == 0) {
            rect.left = i2;
            rect.right = i2 / 3;
        } else if (i5 == i - 1) {
            rect.right = i2;
            rect.left = i2 / 3;
        } else {
            int i6 = (i2 * 2) / 3;
            rect.left = i6;
            rect.right = i6;
        }
        if (childAdapterPosition < i) {
            rect.top = i2;
        }
        rect.bottom = i2;
    }

    public jgu(int i, int i2, boolean z, int i3) {
        this.b = i;
        this.c = z;
        this.d = i3;
        int i4 = i2 % 3;
        this.e = i4 != 0 ? i2 + (3 - i4) : i2;
    }
}
