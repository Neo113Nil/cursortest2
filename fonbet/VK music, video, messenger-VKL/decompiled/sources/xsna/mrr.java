package xsna;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.views.avatars.ImAvatarView;

/* compiled from: FloatingAvatarDecoration.kt */
/* loaded from: classes2.dex */
public final class mrr extends RecyclerView.n {
    public final int b = iah0.a(8);
    public final int c = iah0.a(2);
    public int d;

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.onDraw(canvas, recyclerView, a0Var);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            adapter = null;
        }
        if (adapter == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        xtr0 xtr0Var = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b = qk30.b(recyclerView.getChildAdapterPosition(childAt), adapter);
            if (b != null && b.q()) {
                View childAt2 = recyclerView.getChildAt(i + 1);
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b2 = childAt2 != null ? qk30.b(recyclerView.getChildAdapterPosition(childAt2), adapter) : null;
                View childAt3 = recyclerView.getChildAt(i - 1);
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b3 = childAt3 != null ? qk30.b(recyclerView.getChildAdapterPosition(childAt3), adapter) : null;
                Object childViewHolder = recyclerView.getChildViewHolder(childAt);
                xtr0 xtr0Var2 = childViewHolder instanceof xtr0 ? (xtr0) childViewHolder : null;
                if (xtr0Var2 != null) {
                    if (b.R(b3)) {
                        xtr0Var = xtr0Var2;
                    }
                    ImAvatarView d2 = xtr0Var2.d2();
                    int measuredHeight = d2.getMeasuredHeight();
                    if (b.R(b2)) {
                        d2.setVisibility(0);
                    } else {
                        d2.setVisibility(4);
                    }
                    if (xtr0Var != null) {
                        int top = xtr0Var.B().getTop() + xtr0Var.K3().getBubbleDrawablePadding().top;
                        int measuredHeight2 = (((recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom()) - this.d) - this.b) - measuredHeight;
                        int min = Math.min(((xtr0Var2.B().getBottom() - xtr0Var2.K3().getBubbleDrawablePadding().bottom) - measuredHeight) - this.c, measuredHeight2);
                        if (top > measuredHeight2) {
                            d2.setY(top - xtr0Var2.B().getTop());
                        } else {
                            d2.setY(min - xtr0Var2.B().getTop());
                        }
                    }
                }
            }
        }
    }
}
