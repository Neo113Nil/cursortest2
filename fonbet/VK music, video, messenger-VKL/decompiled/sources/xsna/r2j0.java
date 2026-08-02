package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.themes.VKTheme;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.dhr0;

/* compiled from: SettingsItemDecorator.kt */
/* loaded from: classes4.dex */
public final class r2j0 extends RecyclerView.n implements dhr0.e {
    public final int b = cn70.b(1);
    public final int c = cn70.b(12);
    public final int d = cn70.b(14);
    public final RectF e = new RectF();
    public final Paint f;

    public r2j0() {
        dhr0.f(this);
        Paint paint = new Paint();
        paint.setColor(dhr0.t.c(R.attr.vk_ui_separator_primary));
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.f = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (childAdapterPosition < 0 || childAdapterPosition >= itemCount - 1) {
            return;
        }
        rect.right = (this.c * 2) + this.b + rect.right;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        float a = cn70.a() * 2.0f;
        int i = itemCount - 1;
        Iterator<Integer> it = swe0.q(0, i).iterator();
        while (it.hasNext()) {
            View childAt = layoutManager.getChildAt(((z8x) it).nextInt());
            if (childAt != null && layoutManager.getPosition(childAt) < i) {
                float right = childAt.getRight() + this.c;
                RectF rectF = this.e;
                rectF.left = right;
                rectF.right = rectF.left + this.b;
                int top = childAt.getTop();
                int i2 = this.d;
                rectF.top = top + i2;
                rectF.bottom = childAt.getBottom() - i2;
                canvas.drawRoundRect(rectF, a, a, this.f);
            }
        }
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        this.f.setColor(dhr0.t.c(R.attr.vk_ui_separator_primary));
    }
}
