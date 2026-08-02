package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: PrettyCardsDtoAdapter.kt */
/* loaded from: classes4.dex */
public final class e3d0 extends RecyclerView.Adapter<a3d0> {
    public final ng30 c;
    public int d = -1;
    public List<c3d0> e;
    public s6o f;
    public Integer g;

    public e3d0(ng30 ng30Var) {
        this.c = ng30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<c3d0> list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a3d0 a3d0Var, int i) {
        a3d0 a3d0Var2 = a3d0Var;
        List<c3d0> list = this.e;
        if (list != null) {
            a3d0Var2.V5(list.get(i));
            a3d0Var2.o = this.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a3d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = a3d0.v;
        s6o s6oVar = this.f;
        int i3 = this.d;
        Integer num = this.g;
        int intValue = num != null ? num.intValue() : 0;
        return new a3d0(new lv0(viewGroup.getContext(), intValue), viewGroup, s6oVar, this.c, i3, intValue);
    }
}
