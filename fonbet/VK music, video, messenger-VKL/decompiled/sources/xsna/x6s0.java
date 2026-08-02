package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: VideoBottomSheetSeparatorsDecoration.kt */
/* loaded from: classes2.dex */
public final class x6s0 extends RecyclerView.n {
    public final mmm0 b;
    public final Paint c;

    public x6s0(Context context, boolean z, mmm0 mmm0Var) {
        this.b = mmm0Var;
        Paint paint = new Paint();
        if (z) {
            lpj lpjVar = context instanceof lpj ? (lpj) context : null;
            Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
            dhr0.a.getClass();
            int i = dhr0.u().c;
            if (valueOf == null || valueOf.intValue() != i) {
                context = new l7s(context, dhr0.u().c);
            }
        }
        paint.setColor(dhr0.Y(R.attr.vk_ui_separator_primary, context));
        this.c = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (childAdapterPosition == -1 || itemCount == 0 || childAdapterPosition < 0 || childAdapterPosition >= itemCount) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
        } else if (l(childAdapterPosition)) {
            rect.top = iah0.a(4);
        }
    }

    public final boolean l(int i) {
        mmm0 mmm0Var = this.b;
        return i > 0 && !epx.f(i > 0 ? (String) mmm0Var.invoke(Integer.valueOf(i + (-1))) : null, (String) mmm0Var.invoke(Integer.valueOf(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        Canvas canvas2;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int childCount = layoutManager.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null && l(layoutManager.getPosition(childAt))) {
                int top = childAt.getTop();
                int width = recyclerView.getWidth();
                float a = iah0.a(16);
                float a2 = top - iah0.a(4);
                canvas2 = canvas;
                canvas2.drawRect(a, a2, width - a, a2 + iah0.a(1), this.c);
            } else {
                canvas2 = canvas;
            }
            i++;
            canvas = canvas2;
        }
    }
}
