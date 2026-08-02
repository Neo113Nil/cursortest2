package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: ViewAdapter.java */
@Deprecated
/* loaded from: classes3.dex */
public final class utt0 extends UsableRecyclerView.c implements vic {
    public final izs<ViewGroup, View> c;
    public final gzs<Void> d;
    public final int e;
    public boolean f;

    public utt0(@NonNull LayoutInflater layoutInflater, int i, int i2) {
        this(new mqz(layoutInflater, i, 2), (cnh) null, i2);
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        x0(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return -this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        gzs<Void> gzsVar = this.d;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new UsableRecyclerView.x(this.c.invoke(viewGroup));
    }

    public final void x0(boolean z) {
        this.f = z;
        notifyDataSetChanged();
    }

    public utt0(@NonNull izs izsVar, @Nullable cnh cnhVar, int i) {
        this.f = true;
        this.c = izsVar;
        this.d = cnhVar;
        this.e = i;
    }
}
