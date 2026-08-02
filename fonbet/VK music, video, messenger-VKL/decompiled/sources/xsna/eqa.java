package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CenteringItemDecoration.kt */
/* loaded from: classes2.dex */
public final class eqa extends RecyclerView.n {
    public final int b;

    public eqa(int i) {
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.left = this.b;
    }
}
