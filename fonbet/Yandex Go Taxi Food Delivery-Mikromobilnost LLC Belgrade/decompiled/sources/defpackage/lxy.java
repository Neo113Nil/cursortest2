package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.paging.PagedLoader$LoadState;

/* loaded from: classes15.dex */
public abstract class lxy extends RecyclerView.Adapter {
    public PagedLoader$LoadState a = PagedLoader$LoadState.IDLE;

    public abstract utn f(ViewGroup viewGroup);

    public final void g(PagedLoader$LoadState pagedLoader$LoadState) {
        PagedLoader$LoadState pagedLoader$LoadState2 = this.a;
        if (pagedLoader$LoadState2 != pagedLoader$LoadState) {
            PagedLoader$LoadState pagedLoader$LoadState3 = PagedLoader$LoadState.LOADING;
            int i = 1;
            int i2 = (pagedLoader$LoadState2 == pagedLoader$LoadState3 || pagedLoader$LoadState2 == PagedLoader$LoadState.ERROR) ? 1 : 0;
            if (pagedLoader$LoadState != pagedLoader$LoadState3 && pagedLoader$LoadState != PagedLoader$LoadState.ERROR) {
                i = 0;
            }
            this.a = pagedLoader$LoadState;
            if (i2 == i) {
                return;
            }
            if (i2 > 0) {
                notifyItemRangeRemoved(0, i2);
            }
            if (i > 0) {
                notifyItemRangeInserted(0, i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PagedLoader$LoadState pagedLoader$LoadState = this.a;
        return (pagedLoader$LoadState == PagedLoader$LoadState.LOADING || pagedLoader$LoadState == PagedLoader$LoadState.ERROR) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return f(viewGroup);
    }
}
