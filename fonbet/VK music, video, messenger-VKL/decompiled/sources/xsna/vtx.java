package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedList;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.lvx;

/* compiled from: ItemAdapter.java */
@Deprecated
/* loaded from: classes3.dex */
public final class vtx<Item> extends UsableRecyclerView.c<lvx<Item>> {
    public final LayoutInflater d;
    public final lvx.b<Item> e;
    public final ArrayList c = new ArrayList();
    public final int f = 1;

    public vtx(LayoutInflater layoutInflater, lvx.b bVar) {
        this.d = layoutInflater;
        this.e = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        lvx lvxVar = (lvx) e0Var;
        Item item = (Item) this.c.get(i);
        lvxVar.n = item;
        lvx.a<Item> aVar = lvxVar.l;
        j0u0 j0u0Var = lvxVar.o;
        j0u0Var.c = ((LinkedList) j0u0Var.b).iterator();
        aVar.a(j0u0Var, item, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        lvx.b<Item> bVar = this.e;
        int i2 = bVar.a;
        if (i2 == 0) {
            throw new NullPointerException("layout must not be 0");
        }
        if (bVar.b != null) {
            return new lvx(this.d.inflate(i2, viewGroup, false), bVar.b, bVar.c);
        }
        throw new NullPointerException("binder must not be null");
    }
}
