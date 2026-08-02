package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.reactions.impl.set_reaction.list.ReactionListController;
import java.util.List;

/* compiled from: ReactionListController.kt */
/* loaded from: classes2.dex */
public final class g1f0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ReactionListController b;
    public final /* synthetic */ boolean c;

    /* compiled from: ReactionListController.kt */
    public static final class a extends RecyclerView.n {
        public final /* synthetic */ ReactionListController b;

        public a(ReactionListController reactionListController) {
            this.b = reactionListController;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            rect.bottom = this.b.c() + rect.bottom;
        }
    }

    public g1f0(ReactionListController reactionListController, boolean z) {
        this.b = reactionListController;
        this.c = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ReactionListController reactionListController = this.b;
        List<yaw> list = reactionListController.j;
        f1f0 f1f0Var = reactionListController.k;
        RecyclerView recyclerView = reactionListController.a;
        int measuredWidth = recyclerView.getMeasuredWidth() / reactionListController.d();
        if (measuredWidth == 0) {
            return;
        }
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (((recyclerView.getMeasuredWidth() - reactionListController.e()) - (reactionListController.d() * measuredWidth)) / measuredWidth < reactionListController.c()) {
            measuredWidth--;
        }
        ((GridLayoutManager) recyclerView.getLayoutManager()).setSpanCount(measuredWidth);
        reactionListController.l = measuredWidth;
        if (!this.c) {
            if (list.size() > reactionListController.l && f1f0Var.j != null) {
                f1f0Var.c.setNestedScrollingEnabled(false);
                f1f0Var.j = Integer.valueOf(measuredWidth);
                f1f0Var.notifyDataSetChanged();
            }
            if (list.size() < reactionListController.l) {
                recyclerView.addItemDecoration(new eqa(((recyclerView.getMeasuredWidth() - (list.size() * reactionListController.d())) / 2) - (reactionListController.e() * 2)));
                return;
            }
            return;
        }
        recyclerView.post(new vb(reactionListController, 17));
        recyclerView.addItemDecoration(new a(reactionListController));
        izs<Integer, s3q0> izsVar = reactionListController.g.c;
        if (reactionListController.f.g == ReactionListController.StaticSize.AlwaysExpanded) {
            int a2 = reactionListController.a();
            f4m.n(a2, recyclerView);
            f1f0Var.c.setNestedScrollingEnabled(true);
            f1f0Var.j = null;
            f1f0Var.notifyDataSetChanged();
            izsVar.invoke(Integer.valueOf(a2));
            return;
        }
        if (list.size() > reactionListController.l) {
            f1f0Var.c.setNestedScrollingEnabled(false);
            f1f0Var.j = Integer.valueOf(measuredWidth);
            f1f0Var.notifyDataSetChanged();
        }
        if (list.size() < reactionListController.l) {
            recyclerView.addItemDecoration(new eqa(((recyclerView.getMeasuredWidth() - (list.size() * reactionListController.d())) / 2) - (reactionListController.e() * 2)));
        }
        izsVar.invoke(Integer.valueOf((reactionListController.e() * 2) + reactionListController.d()));
    }
}
