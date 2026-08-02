package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class i090 extends RecyclerView.d {
    public final int a;

    public i090(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            rect.set(-this.a, 0, 0, 0);
        }
    }
}
