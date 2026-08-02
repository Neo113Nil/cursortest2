package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: SectionDetailsAdapter.kt */
/* loaded from: classes6.dex */
public final class w1i0 extends RecyclerView.Adapter<fc3> implements vic, jjv0 {
    public final d9r0 c;
    public final ArrayList d = new ArrayList();

    public w1i0(d9r0 d9r0Var) {
        this.c = d9r0Var;
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
    public final void onBindViewHolder(fc3 fc3Var, int i) {
        fc3Var.V5(this.d.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final fc3 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new fc3(viewGroup, this.c);
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }
}
