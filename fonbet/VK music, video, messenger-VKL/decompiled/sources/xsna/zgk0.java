package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SpaceItemDecoration.java */
/* loaded from: classes17.dex */
public final class zgk0 extends RecyclerView.n {
    public final int b;
    public final int c;
    public final int d;

    public zgk0(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.left = this.b;
        rect.top = this.c;
        rect.right = 0;
        rect.bottom = this.d;
    }
}
