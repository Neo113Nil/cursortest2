package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.ifz;

/* compiled from: ListItemAdapterDividerDecoration.kt */
/* loaded from: classes7.dex */
public final class mfz extends RecyclerView.n {
    public final Rect b = new Rect();
    public final Paint c;

    public mfz(Context context) {
        Paint c = x9.c(true);
        c.setColor(e3m.f(R.attr.vk_ui_separator_primary, context));
        this.c = c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        kfz kfzVar = adapter instanceof kfz ? (kfz) adapter : null;
        if (linearLayoutManager == null || kfzVar == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        ifz ifzVar = (ifz) j5g.b0(childAdapterPosition, kfzVar.getCurrentList());
        if (ifzVar != null && (ifzVar instanceof ifz.a) && childAdapterPosition > 0) {
            rect.top = iah0.a(16);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        kfz kfzVar = adapter instanceof kfz ? (kfz) adapter : null;
        if (linearLayoutManager == null || kfzVar == null) {
            return;
        }
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            int position = linearLayoutManager.getPosition(childAt);
            if ((((ifz) j5g.b0(position, kfzVar.getCurrentList())) instanceof ifz.a) && position > 0) {
                Rect rect = this.b;
                recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                float f = 16;
                rect.set(iah0.a(f) + rect.left, iah0.a(11) + rect.top, rect.right - iah0.a(f), iah0.a(11.5f) + rect.top);
                canvas.drawRect(rect, this.c);
            }
        }
    }
}
