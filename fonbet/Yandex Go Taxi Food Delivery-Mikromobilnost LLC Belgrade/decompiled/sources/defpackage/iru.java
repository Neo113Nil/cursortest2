package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class iru extends RecyclerView.d {
    public final int a;

    public iru(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int i = rect.top;
        int i2 = rect.bottom;
        int i3 = this.a;
        rect.set(i3, i, i3, i2);
    }
}
