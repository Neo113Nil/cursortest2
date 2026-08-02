package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;

/* compiled from: RecyclerPaginatedTabletDecoration.kt */
/* loaded from: classes3.dex */
public final class cjf0 implements RecyclerPaginatedView.l, too0 {
    public final Paint b;
    public final Rect c;

    public cjf0() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        paint.setColor(krv0.l(R.attr.vk_ui_background));
    }

    @Override // xsna.too0
    public final void Ng() {
        this.b.setColor(krv0.l(R.attr.vk_ui_background));
    }

    @Override // com.vk.lists.RecyclerPaginatedView.l
    public final void a(Canvas canvas, RecyclerPaginatedView recyclerPaginatedView) {
        View emptyView = recyclerPaginatedView.getEmptyView();
        View progressView = recyclerPaginatedView.getProgressView();
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        boolean z = recyclerView.getChildCount() == 0;
        if (emptyView.getVisibility() == 0 || ((progressView != null && progressView.getVisibility() == 0) || z)) {
            int paddingLeft = recyclerView.getPaddingLeft();
            Paint paint = this.b;
            Rect rect = this.c;
            if (paddingLeft > 0) {
                rect.set(0, 0, paddingLeft, recyclerPaginatedView.getHeight());
                canvas.drawRect(rect, paint);
            }
            int paddingRight = recyclerView.getPaddingRight();
            if (paddingRight > 0) {
                rect.set(recyclerPaginatedView.getWidth() - paddingRight, 0, recyclerPaginatedView.getWidth(), recyclerPaginatedView.getHeight());
                canvas.drawRect(rect, paint);
            }
        }
    }
}
