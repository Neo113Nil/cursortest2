package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: CategoriesAdapter.kt */
/* loaded from: classes6.dex */
public final class hja extends RecyclerView.Adapter<lla> implements vic, jjv0 {
    public final j8r0 c;
    public final ArrayList d = new ArrayList();

    public hja(j8r0 j8r0Var) {
        this.c = j8r0Var;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        this.d.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        return i == 0 ? 4 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(lla llaVar, int i) {
        llaVar.V5(this.d.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final lla onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new lla(viewGroup, this.c);
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }
}
