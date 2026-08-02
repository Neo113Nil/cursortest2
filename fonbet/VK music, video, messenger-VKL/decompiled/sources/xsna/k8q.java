package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: ExpandableMenuGridItemDecoration.kt */
/* loaded from: classes6.dex */
public final class k8q extends RecyclerView.n {
    public final int b = 4;
    public final int c;
    public final int d;

    public k8q(Context context) {
        this.c = context.getResources().getDimensionPixelSize(R.dimen.vk_expandable_menu_item_edge_top_second_row);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.vk_expandable_menu_item_edge_top_first_row);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.top = recyclerView.getChildAdapterPosition(view) < this.b ? this.d : this.c;
    }
}
