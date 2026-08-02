package xsna;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MergeRecyclerAdapter.java */
/* loaded from: classes8.dex */
public class a920 extends zoj0<RecyclerView.Adapter, RecyclerView.e0> implements zzc0 {
    public final ArrayList<RecyclerView.Adapter> e = new ArrayList<>();
    public final SparseArray<RecyclerView.Adapter> f = new SparseArray<>();
    public final HashMap<RecyclerView.Adapter, a> g = new HashMap<>();

    /* compiled from: MergeRecyclerAdapter.java */
    public class a extends RecyclerView.i {
        public final RecyclerView.Adapter a;

        public a(RecyclerView.Adapter adapter) {
            this.a = adapter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            a920.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            RecyclerView.Adapter adapter = this.a;
            a920 a920Var = a920.this;
            a920Var.notifyItemRangeChanged(a920Var.O0(adapter) + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            RecyclerView.Adapter adapter = this.a;
            a920 a920Var = a920.this;
            a920Var.notifyItemRangeChanged(a920Var.O0(adapter) + i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            RecyclerView.Adapter adapter = this.a;
            a920 a920Var = a920.this;
            a920Var.notifyItemRangeInserted(a920Var.O0(adapter) + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            RecyclerView.Adapter adapter = this.a;
            a920 a920Var = a920.this;
            int O0 = a920Var.O0(adapter);
            a920Var.notifyItemMoved(i + O0, O0 + i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            RecyclerView.Adapter adapter = this.a;
            a920 a920Var = a920.this;
            a920Var.notifyItemRangeRemoved(a920Var.O0(adapter) + i, i2);
        }
    }

    @Override // xsna.zzc0
    public final String B(int i, int i2) {
        Object L0 = L0(i);
        if (L0 instanceof zzc0) {
            return ((zzc0) L0).B(N0(i), i2);
        }
        return null;
    }

    @Override // xsna.zzc0
    public final int G(int i) {
        Object L0 = L0(i);
        if (L0 instanceof zzc0) {
            return ((zzc0) L0).G(N0(i));
        }
        return 0;
    }

    public final void K0(RecyclerView.Adapter adapter) {
        ArrayList<RecyclerView.Adapter> arrayList = this.e;
        int size = arrayList.size();
        if (arrayList.contains(adapter)) {
            throw new IllegalArgumentException("Adapter " + adapter + " is already added!");
        }
        arrayList.add(size, adapter);
        a aVar = new a(adapter);
        adapter.registerAdapterDataObserver(aVar);
        this.g.put(adapter, aVar);
        notifyDataSetChanged();
    }

    @Nullable
    public final RecyclerView.Adapter L0(int i) {
        Iterator<RecyclerView.Adapter> it = this.e.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            RecyclerView.Adapter next = it.next();
            int itemCount = next.getItemCount();
            if (i >= i2 && i < i2 + itemCount) {
                return next;
            }
            i2 += itemCount;
        }
        return null;
    }

    public final int N0(int i) {
        Iterator<RecyclerView.Adapter> it = this.e.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int itemCount = it.next().getItemCount();
            if (i >= i2 && i < i2 + itemCount) {
                return i - i2;
            }
            i2 += itemCount;
        }
        return i;
    }

    public final int O0(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter next;
        Iterator<RecyclerView.Adapter> it = this.e.iterator();
        int i = 0;
        while (it.hasNext() && (next = it.next()) != adapter) {
            i += next.getItemCount();
        }
        return i;
    }

    public final void P0() {
        ArrayList<RecyclerView.Adapter> arrayList = this.e;
        Iterator<RecyclerView.Adapter> it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerView.Adapter next = it.next();
            HashMap<RecyclerView.Adapter, a> hashMap = this.g;
            next.unregisterAdapterDataObserver(hashMap.get(next));
            hashMap.remove(next);
        }
        arrayList.clear();
        notifyDataSetChanged();
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Iterator<RecyclerView.Adapter> it = this.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().getItemCount();
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return L0(i).getItemId(N0(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        RecyclerView.Adapter L0 = L0(i);
        int itemViewType = L0.getItemViewType(N0(i));
        this.f.put(itemViewType, L0);
        return itemViewType;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        this.d = recyclerView;
        Iterator<RecyclerView.Adapter> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        L0(i).onBindViewHolder(e0Var, N0(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f.get(i).onCreateViewHolder(viewGroup, i);
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        Iterator<RecyclerView.Adapter> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull RecyclerView.e0 e0Var) {
        return this.f.get(e0Var.getItemViewType()).onFailedToRecycleView(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, @NonNull List<Object> list) {
        L0(i).onBindViewHolder(e0Var, N0(i), list);
    }
}
