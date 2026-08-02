package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class dkt0 extends RecyclerView.d {
    public final int a;

    public dkt0(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        rect.top = recyclerView.getChildLayoutPosition(view) > 0 ? this.a : 0;
    }
}
