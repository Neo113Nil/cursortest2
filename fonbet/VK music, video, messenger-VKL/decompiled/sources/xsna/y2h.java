package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: CommunityFillToBottomItemDecoration.kt */
/* loaded from: classes5.dex */
public final class y2h extends RecyclerView.n implements too0 {
    public final Paint b;
    public boolean c;

    public y2h() {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(krv0.l(R.attr.vk_ui_background_content));
    }

    @Override // xsna.too0
    public final void Ng() {
        this.b.setColor(krv0.l(R.attr.vk_ui_background_content));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        View view;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() == 0 || !this.c) {
            return;
        }
        kxt0 kxt0Var = new kxt0(recyclerView);
        if (kxt0Var.hasNext()) {
            View next = kxt0Var.next();
            if (kxt0Var.hasNext()) {
                int top = next.getTop();
                do {
                    View next2 = kxt0Var.next();
                    int top2 = next2.getTop();
                    if (top < top2) {
                        next = next2;
                        top = top2;
                    }
                } while (kxt0Var.hasNext());
            }
            view = next;
        } else {
            view = null;
        }
        if (view != null) {
            canvas.drawRect(recyclerView.getPaddingLeft(), r10.getBottom(), recyclerView.getWidth() - recyclerView.getPaddingRight(), recyclerView.getBottom(), this.b);
        }
    }
}
