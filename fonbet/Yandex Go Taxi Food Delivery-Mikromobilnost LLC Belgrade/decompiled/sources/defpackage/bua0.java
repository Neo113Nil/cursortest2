package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class bua0 extends RecyclerView.d {
    public final int A;
    public int a;
    public int b;
    public int c;
    public int w;
    public final int x;
    public final int y;
    public float z = 0.0f;

    public bua0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.w = i4;
        this.x = i5;
        this.y = i6;
        this.A = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int i;
        int i2 = this.a;
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            r3 = adapter != null ? adapter.getItemCount() : 0;
            int i3 = this.A;
            if (r3 <= 1) {
                r3 = i3;
            } else {
                r3 = this.c;
                float f = this.z;
                if (i3 != r3) {
                    r3 = (int) (((r3 - i3) * f) + i3);
                }
            }
        }
        int i4 = this.b;
        if (recyclerView.getChildAdapterPosition(view) + 1 < kVar.b()) {
            float f2 = this.z;
            int i5 = this.y;
            i = this.x;
            if (i5 != i) {
                i = (int) (((i - i5) * f2) + i5);
            }
        } else {
            i = this.w;
        }
        rect.set(i2, r3, i4, i);
    }

    public final boolean f(int i, int i2, int i3, int i4) {
        boolean z = (i == this.a && i2 == this.b && i3 == this.c && i4 == this.w) ? false : true;
        if (z) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.w = i4;
        }
        return z;
    }
}
