package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.plc0;

/* compiled from: PostingSettingsItemDecoration.kt */
/* loaded from: classes4.dex */
public final class wlc0 extends RecyclerView.n {
    public final Paint b;
    public final int c;

    public wlc0() {
        Paint paint = new Paint();
        paint.setColor(dhr0.t.c(R.attr.vk_ui_separator_primary_alpha));
        paint.setAntiAlias(false);
        paint.setDither(false);
        paint.setStyle(Paint.Style.FILL);
        this.b = paint;
        this.c = iah0.a(16);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        jsj0 jsj0Var = adapter instanceof jsj0 ? (jsj0) adapter : null;
        if (jsj0Var == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.top = cn70.b(12);
        }
        plc0 plc0Var = (plc0) jsj0Var.c.c(childAdapterPosition);
        if ((plc0Var instanceof plc0.c) || (plc0Var instanceof plc0.d.c) || (plc0Var instanceof plc0.d.b)) {
            rect.bottom = cn70.b(12);
            return;
        }
        if (plc0Var instanceof plc0.a) {
            rect.bottom = cn70.b(8);
            return;
        }
        if (plc0Var instanceof plc0.b.c) {
            rect.top = cn70.b(12);
            rect.bottom = cn70.b(12);
        } else if ((plc0Var instanceof plc0.b.C3517b) || (plc0Var instanceof plc0.b.a)) {
            rect.top = cn70.b(12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        Canvas canvas2;
        int childCount = recyclerView.getChildCount();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        jsj0 jsj0Var = adapter instanceof jsj0 ? (jsj0) adapter : null;
        if (jsj0Var == null) {
            return;
        }
        int i = 0;
        while (i < childCount) {
            View a = mxt0.a(i, recyclerView);
            plc0 plc0Var = (plc0) jsj0Var.c.c(recyclerView.getChildAdapterPosition(a));
            if ((plc0Var instanceof plc0.b.c) || (plc0Var instanceof plc0.b.C3517b) || (plc0Var instanceof plc0.b.a)) {
                int top = a.getTop() - cn70.b(12);
                float left = a.getLeft();
                float f = this.c;
                float f2 = top;
                canvas2 = canvas;
                canvas2.drawLine(left + f, f2, a.getWidth() - f, f2, this.b);
            } else {
                canvas2 = canvas;
            }
            i++;
            canvas = canvas2;
        }
    }
}
