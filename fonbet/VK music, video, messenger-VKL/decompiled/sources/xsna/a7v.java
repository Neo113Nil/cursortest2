package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: HintValueDecorator.kt */
/* loaded from: classes5.dex */
public final class a7v extends RecyclerView.n {
    public static final int c = iah0.a(0.5f);
    public final ColorDrawable b = new ColorDrawable(dhr0.t.c(R.attr.vk_ui_separator_primary_alpha));

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.set(0, 0, 0, 0);
        if (recyclerView.getChildAdapterPosition(view) < (recyclerView.getAdapter() != null ? r3.getItemCount() : 0) - 1) {
            rect.bottom += c;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null) {
                if (layoutManager.getPosition(childAt) < (recyclerView.getAdapter() != null ? r5.getItemCount() : 0) - 1) {
                    int left = childAt.getLeft();
                    int bottom = childAt.getBottom();
                    int right = childAt.getRight();
                    int bottom2 = childAt.getBottom() + c;
                    ColorDrawable colorDrawable = this.b;
                    colorDrawable.setBounds(left, bottom, right, bottom2);
                    colorDrawable.draw(canvas);
                }
            }
        }
    }
}
