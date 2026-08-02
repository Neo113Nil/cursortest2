package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.gv20;

/* compiled from: InfoScopeAdapter.kt */
/* loaded from: classes15.dex */
public final class hww extends RecyclerView.Adapter<as6> {
    public final ArrayList c = new ArrayList();
    public boolean d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        gv20 gv20Var = (gv20) this.c.get(i);
        if (gv20Var instanceof gv20.a) {
            return 1;
        }
        if (gv20Var instanceof gv20.b) {
            return 2;
        }
        if (gv20Var instanceof gv20.c) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(as6 as6Var, int i) {
        as6 as6Var2 = as6Var;
        boolean z = as6Var2 instanceof lww;
        ArrayList arrayList = this.c;
        if (z) {
            lww lwwVar = (lww) as6Var2;
            gv20.a aVar = (gv20.a) arrayList.get(i);
            lwwVar.V5(aVar, this.d);
            TextView textView = lwwVar.o;
            textView.setMaxLines(1);
            textView.setLines(1);
            textView.setText(aVar.d);
            return;
        }
        if (!(as6Var2 instanceof tvn)) {
            if (as6Var2 instanceof cah0) {
                cah0 cah0Var = (cah0) as6Var2;
                gv20.c cVar = (gv20.c) arrayList.get(i);
                cah0Var.V5(cVar, this.d);
                awt0.t(cah0Var.o, new by20(cVar, cah0Var));
                return;
            }
            return;
        }
        tvn tvnVar = (tvn) as6Var2;
        gv20.b bVar = (gv20.b) arrayList.get(i);
        boolean z2 = this.d;
        TextView textView2 = tvnVar.o;
        tvnVar.V5(bVar, z2);
        String str = bVar.e;
        if (str == null || drm0.N(str)) {
            textView2.setText(bVar.d);
        } else {
            awt0.t(textView2, new hc1(9, bVar, tvnVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final as6 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new lww(viewGroup);
        }
        if (i == 2) {
            return new tvn(viewGroup);
        }
        if (i != 3) {
            throw new IllegalStateException("Unsupported cell type");
        }
        cah0 cah0Var = new cah0(viewGroup);
        new bpn0(new ltb0(4));
        return cah0Var;
    }
}
