package xsna;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.ui.carousel.UserCarouselView;

/* compiled from: UserCarouselDecoration.kt */
/* loaded from: classes15.dex */
public final class ngq0 extends RecyclerView.n {
    public final UserCarouselView b;
    public int c = -1;

    public ngq0(UserCarouselView userCarouselView) {
        this.b = userCarouselView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.left += (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 8);
        } else {
            int i = rect.left;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount2 = adapter != null ? adapter.getItemCount() : 0;
            if (this.c == -1) {
                this.c = view.getWidth();
            }
            float f = 20;
            int ceil = (((int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 8)) * 2) + (((int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * f)) * (itemCount2 - 1)) + (this.c * itemCount2);
            int width = this.b.getWidth();
            rect.left = i + ((int) ((ceil <= width || width == 0) ? Math.ceil(Resources.getSystem().getDisplayMetrics().density * f) : Math.ceil(Resources.getSystem().getDisplayMetrics().density * 12)));
        }
        if (childAdapterPosition == itemCount - 1) {
            rect.right += (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 8);
        }
    }
}
