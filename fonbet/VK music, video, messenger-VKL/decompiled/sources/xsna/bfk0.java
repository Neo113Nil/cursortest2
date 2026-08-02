package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: NavigationTabVh.kt */
/* loaded from: classes16.dex */
public final class bfk0 extends RecyclerView.Adapter<cfk0> {
    public final List<dfk0> c;
    public final bp7 d;

    public bfk0(List list, bp7 bp7Var) {
        this.c = list;
        this.d = bp7Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(cfk0 cfk0Var, int i) {
        cfk0 cfk0Var2 = cfk0Var;
        dfk0 dfk0Var = this.c.get(i);
        cfk0Var2.o = dfk0Var;
        cfk0Var2.p = this.d;
        TextView textView = cfk0Var2.m;
        String str = dfk0Var.c;
        textView.setText(str);
        cfk0Var2.l.setContentDescription(str);
        cfk0Var2.n.setVisibility(dfk0Var.a ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final cfk0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = cfk0.q;
        return new cfk0((ViewGroup) tf3.b(viewGroup, R.layout.catalog_sort_list_item_view, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(cfk0 cfk0Var) {
        cfk0 cfk0Var2 = cfk0Var;
        cfk0Var2.o = null;
        cfk0Var2.p = null;
    }
}
