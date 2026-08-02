package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.discover.carousel.Carousel;

/* compiled from: CarouselHolder.kt */
/* loaded from: classes4.dex */
public final class uu9 extends RecyclerView.n {
    public final /* synthetic */ vu9<Carousel<?>> b;

    public uu9(vu9<Carousel<?>> vu9Var) {
        this.b = vu9Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        int i = gridLayoutManager != null ? gridLayoutManager.s : 1;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (childAdapterPosition == 0 || childAdapterPosition < i) {
            rect.left = 0;
            return;
        }
        vu9<Carousel<?>> vu9Var = this.b;
        if (adapter == null || childAdapterPosition != adapter.getItemCount() - 1) {
            rect.left = vu9Var.G;
        } else {
            rect.left = vu9Var.G;
            rect.right = 0;
        }
    }
}
