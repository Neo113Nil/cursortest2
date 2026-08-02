package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class m2w0 extends RecyclerView.d {
    public static final m2w0 a = new m2w0();
    public static final int b = (int) uh6.o(4.0f);
    public static final int c = (int) uh6.o(4.0f);

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.top = b;
        }
        rect.bottom = c;
    }
}
