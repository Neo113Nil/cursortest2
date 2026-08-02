package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: BottomDividerDecoration.java */
/* loaded from: classes7.dex */
public final class x48 extends RecyclerView.n implements too0 {
    public final int c;
    public final a d;
    public int e;
    public int f;
    public final Paint b = new Paint();
    public final int g = R.attr.vk_ui_separator_primary_alpha;

    /* compiled from: BottomDividerDecoration.java */
    public interface a {
        boolean u0(int i);
    }

    public x48(@Nullable a aVar, int i) {
        this.c = i;
        this.d = aVar;
        Ng();
    }

    @Override // xsna.too0
    public final void Ng() {
        this.b.setColor(dhr0.t.c(this.g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        a aVar = this.d;
        if (aVar == null || (childAdapterPosition != -1 && aVar.u0(childAdapterPosition))) {
            rect.bottom = rect.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        Canvas canvas2;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i < recyclerView.getChildCount()) {
            View childAt = recyclerView.getChildAt(i);
            Paint paint = this.b;
            int i3 = this.c;
            a aVar = this.d;
            if (aVar != null) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition == -1 || !aVar.u0(childAdapterPosition)) {
                    if (z) {
                        canvas.drawRect(recyclerView.getLeft() + this.e, i2, recyclerView.getRight() - this.f, i3 + i2, paint);
                        z = false;
                    }
                } else if (!z) {
                    i2 = childAt.getBottom();
                    z = true;
                }
            } else if (recyclerView.getChildAdapterPosition(childAt) < recyclerView.getAdapter().getItemCount() - 1) {
                i2 = childAt.getBottom();
                float f = i3 + i2;
                canvas2 = canvas;
                canvas2.drawRect(recyclerView.getLeft() + this.e, i2, recyclerView.getRight() - this.f, f, paint);
                i++;
                canvas = canvas2;
            }
            canvas2 = canvas;
            i++;
            canvas = canvas2;
        }
    }
}
