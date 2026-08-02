package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: StickerBarVc.kt */
/* loaded from: classes2.dex */
public final class j2l0 extends RecyclerView.n {
    public final /* synthetic */ int b;

    public j2l0(int i) {
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i = this.b;
        rect.left = i;
        rect.top = 0;
        rect.right = i;
        rect.bottom = 0;
    }
}
