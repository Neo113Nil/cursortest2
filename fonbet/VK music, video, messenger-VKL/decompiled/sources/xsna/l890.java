package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PaddingItemDecoration.kt */
/* loaded from: classes4.dex */
public final class l890 extends RecyclerView.n {
    public final int b;

    public l890(int i) {
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i = this.b;
        rect.top = i;
        rect.left = i;
        rect.right = i;
        rect.bottom = i;
    }
}
