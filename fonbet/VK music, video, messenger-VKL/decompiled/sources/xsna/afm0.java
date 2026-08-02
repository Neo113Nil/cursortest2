package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.gfm0;

/* compiled from: StoryStatisticsInfoAdapter.kt */
/* loaded from: classes6.dex */
public final class afm0 extends androidx.recyclerview.widget.x<gfm0, RecyclerView.e0> implements vic {
    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        submitList(EmptyList.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        gfm0 item = getItem(i);
        if (item instanceof gfm0.a) {
            return 102;
        }
        if (item instanceof gfm0.b) {
            return 100;
        }
        if (item instanceof gfm0.c) {
            return 101;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        gfm0 item = getItem(i);
        if (e0Var instanceof pwl0) {
            ((pwl0) e0Var).V5(((gfm0.a) item).a);
        } else if (e0Var instanceof yem0) {
            ((yem0) e0Var).W5(((gfm0.b) item).a);
        } else if (e0Var instanceof ydm0) {
            ((ydm0) e0Var).V5(((gfm0.c) item).a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        vq.b(-1, -2, composeView);
        switch (i) {
            case 100:
                return new yem0(composeView, null);
            case 101:
                return new ydm0(composeView);
            case 102:
                return new pwl0(composeView);
            default:
                throw new IllegalStateException("Unsupported view type in ".concat(afm0.class.getSimpleName()));
        }
    }
}
