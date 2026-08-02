package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class f57 extends RecyclerView.d {
    public final int a;
    public final int b;

    public f57(Resources resources) {
        this.a = resources.getDimensionPixelSize(atg0.div_horizontal_padding);
        this.b = resources.getDimensionPixelSize(atg0.div_button_text_vertical_padding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        recyclerView.getLayoutManager().getClass();
        int viewLayoutPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        int i = this.a;
        int i2 = viewLayoutPosition == 0 ? i : 0;
        int i3 = this.b;
        rect.set(i2, i3, i, i3);
    }
}
