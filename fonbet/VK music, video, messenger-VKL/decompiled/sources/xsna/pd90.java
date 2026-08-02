package xsna;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import xsna.n6s;
import xsna.vic;

/* compiled from: PaginatedRecyclerAdapter.java */
/* loaded from: classes3.dex */
public final class pd90<T extends RecyclerView.Adapter & vic> extends RecyclerView.Adapter<RecyclerView.e0> {
    public final T c;
    public final n6s d;
    public final x6s e;
    public final h6s f;
    public final xa80 g;
    public c7t0 i;
    public int h = 0;
    public final HashMap j = new HashMap();

    /* compiled from: PaginatedRecyclerAdapter.java */
    public class a extends RecyclerView.i {
        public final /* synthetic */ WeakReference a;

        public a(WeakReference weakReference) {
            this.a = weakReference;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            RecyclerView recyclerView = (RecyclerView) this.a.get();
            if (recyclerView != null) {
                recyclerView.invalidateItemDecorations();
            }
        }
    }

    /* compiled from: PaginatedRecyclerAdapter.java */
    public class b extends RecyclerView.i {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            pd90.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            pd90.this.notifyItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, @Nullable Object obj) {
            pd90.this.notifyItemRangeChanged(i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            pd90.this.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            pd90.this.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            pd90.this.notifyItemRangeRemoved(i, i2);
        }
    }

    public pd90(T t, n6s n6sVar, x6s x6sVar, h6s h6sVar, xa80 xa80Var) {
        b bVar = new b();
        this.g = xa80Var;
        this.c = t;
        super.setHasStableIds(t.hasStableIds());
        t.registerAdapterDataObserver(bVar);
        this.d = n6sVar;
        this.e = x6sVar;
        this.f = h6sVar;
    }

    public static boolean D0(@NonNull RecyclerView.e0 e0Var) {
        int itemViewType = e0Var.getItemViewType();
        return (itemViewType == 2147483597 || itemViewType == 2147483594 || itemViewType == 2147483596 || itemViewType == 2147483593 || itemViewType == 2147483595) ? false : true;
    }

    public final void A0() {
        if (this.h != 0) {
            this.h = 0;
            c7t0 c7t0Var = this.i;
            if (c7t0Var != null) {
                c7t0Var.a(this);
            }
            notifyItemRemoved(this.c.getItemCount());
        }
    }

    public final boolean B0(int i) {
        if (C0()) {
            return i == (C0() ? getItemCount() - 1 : -1);
        }
        return false;
    }

    public final boolean C0() {
        int i = this.h;
        return i == 2 || i == 1 || i == 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        boolean C0 = C0();
        T t = this.c;
        return C0 ? t.getItemCount() + 1 : t.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (B0(i)) {
            return -1L;
        }
        return this.c.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (!B0(i)) {
            return this.c.getItemViewType(i);
        }
        int i2 = this.h;
        if (i2 == 1) {
            return this.e.c();
        }
        if (i2 == 3) {
            return 2147483595;
        }
        return this.d.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        a aVar = new a(new WeakReference(recyclerView));
        this.j.put(recyclerView, aVar);
        T t = this.c;
        t.registerAdapterDataObserver(aVar);
        t.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        x0(e0Var, i, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 2147483597 || i == 2147483594) {
            return this.e.b(viewGroup.getContext(), viewGroup);
        }
        if (i == 2147483595) {
            return this.f.b(viewGroup.getContext(), viewGroup);
        }
        if (i != 2147483596 && i != 2147483593) {
            return this.c.onCreateViewHolder(viewGroup, i);
        }
        return this.d.b(viewGroup.getContext(), viewGroup, this.g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        RecyclerView.i iVar = (RecyclerView.i) this.j.remove(recyclerView);
        T t = this.c;
        if (iVar != null) {
            t.unregisterAdapterDataObserver(iVar);
        }
        t.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull RecyclerView.e0 e0Var) {
        return D0(e0Var) ? this.c.onFailedToRecycleView(e0Var) : super.onFailedToRecycleView(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull RecyclerView.e0 e0Var) {
        if (D0(e0Var)) {
            this.c.onViewAttachedToWindow(e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@NonNull RecyclerView.e0 e0Var) {
        if (D0(e0Var)) {
            this.c.onViewDetachedFromWindow(e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        if (D0(e0Var)) {
            this.c.onViewRecycled(e0Var);
        } else {
            super.onViewRecycled(e0Var);
        }
    }

    public final void x0(@NonNull RecyclerView.e0 e0Var, int i, @Nullable List<Object> list) {
        boolean z = list == null || list.isEmpty();
        boolean B0 = B0(i);
        T t = this.c;
        if (!B0) {
            if (z) {
                t.onBindViewHolder(e0Var, i);
                return;
            } else {
                t.onBindViewHolder(e0Var, i, list);
                return;
            }
        }
        int itemViewType = getItemViewType(i);
        if (e0Var instanceof n6s.c) {
            ((ee) ((n6s.c) e0Var).itemView).setRetryClickListener(this.g);
        }
        if (itemViewType == 2147483595) {
            try {
                if (z) {
                    t.onBindViewHolder(e0Var, i);
                } else {
                    t.onBindViewHolder(e0Var, i, list);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void y0() {
        if (this.h == 2 || this.d == null) {
            return;
        }
        boolean C0 = C0();
        this.h = 2;
        c7t0 c7t0Var = this.i;
        if (c7t0Var != null) {
            c7t0Var.a(this);
        }
        T t = this.c;
        if (C0) {
            notifyItemChanged(t.getItemCount());
        } else {
            notifyItemInserted(t.getItemCount());
        }
    }

    public final void z0() {
        if (this.h == 1 || this.e == null) {
            return;
        }
        boolean C0 = C0();
        this.h = 1;
        c7t0 c7t0Var = this.i;
        if (c7t0Var != null) {
            c7t0Var.a(this);
        }
        T t = this.c;
        if (C0) {
            notifyItemChanged(t.getItemCount());
        } else {
            notifyItemInserted(t.getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.e0 e0Var, int i, @NonNull List<Object> list) {
        x0(e0Var, i, list);
    }
}
