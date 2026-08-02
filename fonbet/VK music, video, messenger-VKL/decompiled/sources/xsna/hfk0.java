package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ifk0;

/* compiled from: SortingListAdapter.kt */
/* loaded from: classes18.dex */
public final class hfk0 extends RecyclerView.Adapter<ifk0> {
    public final List<ifk0.a> c;
    public final izs<ifk0.a, s3q0> d;

    /* JADX WARN: Multi-variable type inference failed */
    public hfk0(List<ifk0.a> list, izs<? super ifk0.a, s3q0> izsVar) {
        this.c = list;
        this.d = izsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(ifk0 ifk0Var, int i) {
        ifk0 ifk0Var2 = ifk0Var;
        ifk0.a aVar = this.c.get(i);
        ifk0Var2.o = aVar;
        ifk0Var2.p = this.d;
        TextView textView = ifk0Var2.m;
        String str = aVar.c;
        textView.setText(str);
        ifk0Var2.l.setContentDescription(str);
        awt0.v(ifk0Var2.n, aVar.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final ifk0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = ifk0.q;
        return new ifk0((ViewGroup) tf3.b(viewGroup, R.layout.catalog_sort_list_item_view, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(ifk0 ifk0Var) {
        ifk0 ifk0Var2 = ifk0Var;
        ifk0Var2.o = null;
        ifk0Var2.p = null;
    }
}
