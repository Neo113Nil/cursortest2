package xsna;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: RecyclerViewAdapterWrapper.java */
/* loaded from: classes8.dex */
public class njf0 extends RecyclerView.Adapter<RecyclerView.e0> implements zzc0 {

    @NonNull
    public final RecyclerView.Adapter<RecyclerView.e0> c;

    public njf0(@NonNull RecyclerView.Adapter<RecyclerView.e0> adapter) {
        this.c = adapter;
        setHasStableIds(adapter.hasStableIds());
    }

    @Override // xsna.zzc0
    public final String B(int i, int i2) {
        Object obj = this.c;
        if (obj instanceof zzc0) {
            return ((zzc0) obj).B(i, i2);
        }
        return null;
    }

    @Override // xsna.zzc0
    public final int G(int i) {
        Object obj = this.c;
        if (obj instanceof zzc0) {
            return ((zzc0) obj).G(i);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.c.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.c.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.c.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.c.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        this.c.onBindViewHolder(e0Var, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.c.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.c.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.e0 e0Var) {
        return this.c.onFailedToRecycleView(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
        this.c.onViewAttachedToWindow(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        this.c.onViewDetachedFromWindow(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.e0 e0Var) {
        this.c.onViewRecycled(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void registerAdapterDataObserver(RecyclerView.i iVar) {
        super.registerAdapterDataObserver(iVar);
        this.c.registerAdapterDataObserver(iVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void unregisterAdapterDataObserver(RecyclerView.i iVar) {
        super.unregisterAdapterDataObserver(iVar);
        this.c.unregisterAdapterDataObserver(iVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i, @NonNull List<Object> list) {
        this.c.onBindViewHolder(e0Var, i, list);
    }
}
