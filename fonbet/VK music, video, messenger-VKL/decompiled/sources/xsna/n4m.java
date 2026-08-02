package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: DetailsGiftsItem.kt */
/* loaded from: classes5.dex */
public final class n4m extends RecyclerView.n {
    public final /* synthetic */ RecyclerView b;

    public n4m(RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.left = this.b.getResources().getDimensionPixelOffset(R.dimen.post_side_padding);
        }
        rect.right = iah0.a(6);
    }
}
