package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;

/* compiled from: SingleAdapter.java */
/* loaded from: classes3.dex */
public abstract class etj0<T, VH extends RecyclerView.e0> extends RecyclerView.Adapter<VH> implements vic {
    public T c;

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        x0(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.c == null ? 0 : 1;
    }

    public final void x0(T t) {
        this.c = t;
        notifyDataSetChanged();
    }
}
