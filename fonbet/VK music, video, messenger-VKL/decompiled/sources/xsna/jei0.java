package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ldi0;

/* compiled from: SelectionPreviewVhOld.kt */
/* loaded from: classes2.dex */
public final class jei0 extends vfz<hei0> {
    public final RecyclerView l;
    public final TextView m;
    public final ubi0 n;

    public jei0(View view, LayoutInflater layoutInflater, RecyclerView.u uVar, int i, gei0 gei0Var) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.vkim_selection_list);
        this.l = recyclerView;
        this.m = (TextView) view.findViewById(R.id.vkim_empty_selection);
        ubi0 ubi0Var = new ubi0(layoutInflater, i, gei0Var);
        this.n = ubi0Var;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        linearLayoutManager.l = true;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setRecycledViewPool(uVar);
        recyclerView.setAdapter(ubi0Var);
    }

    @Override // xsna.vfz
    public final void W5(hei0 hei0Var) {
        hei0 hei0Var2 = hei0Var;
        List<qtd0> list = hei0Var2.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ldi0.b((qtd0) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (hei0Var2.d) {
            arrayList2.add(0, ldi0.a.a);
        }
        int size = arrayList2.size();
        ubi0 ubi0Var = this.n;
        boolean z = size > ubi0Var.f.size();
        ubi0Var.f = arrayList2;
        ubi0Var.notifyDataSetChanged();
        String str = hei0Var2.c;
        TextView textView = this.m;
        textView.setText(str);
        bwt0.p0(textView, arrayList2.isEmpty());
        if (hei0Var2.e || !z) {
            return;
        }
        this.l.smoothScrollToPosition(ubi0Var.f.size());
    }
}
