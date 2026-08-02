package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class bxc extends RecyclerView.d {
    public final Context a;
    public final Drawable b;
    public final int c;

    public bxc(Context context) {
        this.a = context;
        this.b = context.getDrawable(d3h0.complaints_divider);
        this.c = tje.r(mrg0.go_design_m_space, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        Context context = this.a;
        if (childAdapterPosition == 0) {
            rect.top = tje.r(ztg0.complaint_modal_top_padding, context);
        } else if (childAdapterPosition == kVar.b() - 1) {
            rect.bottom = tje.r(mrg0.go_design_m_space, context);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int width = recyclerView.getWidth();
        int i = this.c;
        int i2 = width - i;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 1; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            int top = childAt.getTop();
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setBounds(i, childAt.getTop() - drawable.getIntrinsicHeight(), i2, top);
                drawable.draw(canvas);
            }
        }
    }
}
