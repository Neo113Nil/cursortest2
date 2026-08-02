package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import xsna.zif0;

/* compiled from: BaseItemAdapter.kt */
/* loaded from: classes17.dex */
public abstract class gf6<Item extends zif0> extends zoj0<Item, hf6<Item>> {
    public /* synthetic */ gf6(com.vk.lists.a aVar, int i) {
        this((i & 1) != 0 ? new ListDataSet() : aVar, false);
    }

    public abstract hf6 K0(int i, View view);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(hf6<Item> hf6Var, int i) {
        hf6Var.V5((zif0) this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public hf6 onCreateViewHolder(int i, ViewGroup viewGroup) {
        return K0(i, tf3.b(viewGroup, i, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (hasStableIds()) {
            return ((zif0) this.c.c(i)).a();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((zif0) this.c.c(i)).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
    }

    public gf6(hg6<Item> hg6Var, boolean z) {
        super(hg6Var);
        setHasStableIds(z);
    }

    public gf6(boolean z) {
        this(new ListDataSet(), z);
    }
}
