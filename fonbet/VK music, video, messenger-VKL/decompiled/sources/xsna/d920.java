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
import java.util.Map;

/* compiled from: MergedAdapter.java */
/* loaded from: classes3.dex */
public class d920 extends RecyclerView.Adapter implements vic {
    public final ArrayList<RecyclerView.Adapter> c = new ArrayList<>();
    public final SparseArray<RecyclerView.Adapter> d = new SparseArray<>();
    public final HashMap<RecyclerView.Adapter, a> e = new HashMap<>();
    public final HashMap<RecyclerView.Adapter, HashMap<Integer, Integer>> f = new HashMap<>();
    public int g;
    public RecyclerView h;

    /* compiled from: MergedAdapter.java */
    public class a extends RecyclerView.i {
        public final RecyclerView.Adapter a;

        public a(RecyclerView.Adapter adapter) {
            this.a = adapter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            RecyclerView recyclerView = d920.this.h;
            if (recyclerView != null) {
                wjf0.d(recyclerView);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            RecyclerView.Adapter adapter = this.a;
            d920 d920Var = d920.this;
            d920Var.notifyItemRangeChanged(d920Var.B0(adapter) + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            RecyclerView.Adapter adapter = this.a;
            d920 d920Var = d920.this;
            d920Var.notifyItemRangeChanged(d920Var.B0(adapter) + i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            RecyclerView.Adapter adapter = this.a;
            d920 d920Var = d920.this;
            d920Var.notifyItemRangeInserted(d920Var.B0(adapter) + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            RecyclerView.Adapter adapter = this.a;
            d920 d920Var = d920.this;
            int B0 = d920Var.B0(adapter);
            d920Var.notifyItemMoved(i + B0, B0 + i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            RecyclerView.Adapter adapter = this.a;
            d920 d920Var = d920.this;
            d920Var.notifyItemRangeRemoved(d920Var.B0(adapter) + i, i2);
        }
    }

    public static d920 y0(RecyclerView.Adapter... adapterArr) {
        d920 d920Var = new d920();
        for (RecyclerView.Adapter adapter : adapterArr) {
            d920Var.x0(adapter);
        }
        return d920Var;
    }

    public final int A0(int i) {
        Iterator<RecyclerView.Adapter> it = this.c.iterator();
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

    public final int B0(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter next;
        Iterator<RecyclerView.Adapter> it = this.c.iterator();
        int i = 0;
        while (it.hasNext() && (next = it.next()) != adapter) {
            i += next.getItemCount();
        }
        return i;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        int i = 0;
        while (true) {
            ArrayList<RecyclerView.Adapter> arrayList = this.c;
            if (i >= arrayList.size()) {
                return;
            }
            ((vic) arrayList.get(i)).clear();
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Iterator<RecyclerView.Adapter> it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().getItemCount();
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        RecyclerView.Adapter z0 = z0(i);
        if (z0 != null) {
            return z0.getItemId(A0(i));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        RecyclerView.Adapter z0 = z0(i);
        if (z0 == null) {
            return 0;
        }
        int itemViewType = z0.getItemViewType(A0(i));
        HashMap<RecyclerView.Adapter, HashMap<Integer, Integer>> hashMap = this.f;
        HashMap<Integer, Integer> hashMap2 = hashMap.get(z0);
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
            hashMap.put(z0, hashMap2);
        }
        Integer num = hashMap2.get(Integer.valueOf(itemViewType));
        if (num == null) {
            int i2 = this.g;
            this.g = i2 + 1;
            num = Integer.valueOf(i2);
            hashMap2.put(Integer.valueOf(itemViewType), num);
        }
        int intValue = num.intValue();
        this.d.put(intValue, z0);
        return intValue;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        this.h = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.e0 e0Var, int i, @NonNull List list) {
        RecyclerView.Adapter z0 = z0(i);
        if (z0 != null) {
            z0.onBindViewHolder(e0Var, A0(i), list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.Adapter adapter = this.d.get(i);
        HashMap<Integer, Integer> hashMap = this.f.get(adapter);
        int i2 = 0;
        if (hashMap != null) {
            Iterator<Map.Entry<Integer, Integer>> it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Integer, Integer> next = it.next();
                if (next.getValue().intValue() == i) {
                    i2 = next.getKey().intValue();
                    break;
                }
            }
        }
        return adapter.onCreateViewHolder(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        if (this.h == recyclerView) {
            this.h = null;
        }
    }

    public final void x0(RecyclerView.Adapter adapter) {
        ArrayList<RecyclerView.Adapter> arrayList = this.c;
        int size = arrayList.size();
        if (arrayList.contains(adapter)) {
            throw new IllegalArgumentException("Adapter " + adapter + " is already added!");
        }
        arrayList.add(size, adapter);
        a aVar = new a(adapter);
        adapter.registerAdapterDataObserver(aVar);
        this.e.put(adapter, aVar);
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            wjf0.d(recyclerView);
        }
    }

    @Nullable
    public final RecyclerView.Adapter z0(int i) {
        Iterator<RecyclerView.Adapter> it = this.c.iterator();
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

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        RecyclerView.Adapter z0 = z0(i);
        if (z0 != null) {
            z0.onBindViewHolder(e0Var, A0(i));
        }
    }
}
