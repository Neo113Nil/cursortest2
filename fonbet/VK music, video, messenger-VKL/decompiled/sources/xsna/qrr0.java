package xsna;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: VhHints.kt */
/* loaded from: classes2.dex */
public final class qrr0 extends vfz<w6v> {
    public static final /* synthetic */ int m = 0;
    public final prr0 l;

    public qrr0(LayoutInflater layoutInflater, View view, RecyclerView.u uVar, int i, mkr0 mkr0Var) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.vkim_hints_recycler);
        prr0 prr0Var = new prr0(layoutInflater, i, mkr0Var);
        this.l = prr0Var;
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setItemAnimator(null);
        recyclerView.setRecycledViewPool(uVar);
        recyclerView.setAdapter(prr0Var);
    }

    @Override // xsna.vfz
    public final void W5(w6v w6vVar) {
        prr0 prr0Var = this.l;
        prr0Var.f = w6vVar;
        prr0Var.notifyDataSetChanged();
    }
}
