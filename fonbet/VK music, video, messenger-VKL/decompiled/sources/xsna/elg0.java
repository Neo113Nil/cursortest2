package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: RippleEffectBoundsProvider.kt */
/* loaded from: classes4.dex */
public final class elg0 implements UsableRecyclerView.v {
    public final RecyclerView a;
    public View b;

    public elg0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // me.grishka.appkit.views.UsableRecyclerView.v
    public final void a(Rect rect, View view) {
        NewsEntry t6;
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.a;
        RecyclerView.e0 childViewHolder = (parent == null || parent.equals(recyclerView)) ? recyclerView.getChildViewHolder(view) : null;
        if (!(childViewHolder instanceof qi6)) {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            return;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        NewsEntry t62 = ((qi6) childViewHolder).t6();
        int childCount = recyclerView.getChildCount();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                break;
            }
            ViewParent parent2 = childAt.getParent();
            RecyclerView.e0 childViewHolder2 = (parent2 == null || parent2.equals(recyclerView)) ? recyclerView.getChildViewHolder(childAt) : null;
            qi6 qi6Var = childViewHolder2 instanceof qi6 ? (qi6) childViewHolder2 : null;
            if (qi6Var != null && (t6 = qi6Var.t6()) != null) {
                if (z2 || !epx.f(t62, t6)) {
                    if (z3 && !epx.f(t62, t6)) {
                        rect.bottom = recyclerView.getChildAt(i - 1).getBottom();
                        break;
                    }
                } else {
                    rect.top = childAt.getTop();
                    z2 = true;
                    z3 = true;
                }
                if (z3) {
                    rect.left = Math.min(rect.left, childAt.getLeft());
                    rect.right = Math.max(rect.right, childAt.getRight());
                }
            }
        }
        z = z3;
        if (z) {
            rect.bottom = recyclerView.getHeight();
        }
    }
}
