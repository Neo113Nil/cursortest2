package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyTargetInternalNativeAdCardsCarouselAdapter.kt */
/* loaded from: classes4.dex */
public final class rq50 extends RecyclerView.Adapter<vif0<lp50>> {
    public final ArrayList c = new ArrayList();
    public int d;
    public wzs<? super View, ? super wix, s3q0> e;
    public wzs<? super View, ? super wix, s3q0> f;
    public xix g;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(vif0<lp50> vif0Var, int i) {
        xix xixVar;
        vif0<lp50> vif0Var2 = vif0Var;
        if (!(vif0Var2 instanceof sq50) || (xixVar = this.g) == null) {
            return;
        }
        sq50 sq50Var = (sq50) vif0Var2;
        lp50 lp50Var = (lp50) this.c.get(i);
        wzs<? super View, ? super wix, s3q0> wzsVar = this.e;
        wzs<? super View, ? super wix, s3q0> wzsVar2 = this.f;
        sq50Var.s = wzsVar;
        sq50Var.t = wzsVar2;
        sq50Var.u = xixVar;
        sq50Var.V5(lp50Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final vif0<lp50> onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = sq50.x;
        return new sq50(new lv0(viewGroup.getContext(), this.d));
    }

    public final void x0(List list, wzs wzsVar, wzs wzsVar2, int i, cjx cjxVar) {
        ArrayList arrayList = this.c;
        if (list.equals(arrayList)) {
            return;
        }
        arrayList.clear();
        List list2 = list;
        if (!list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        this.d = i;
        this.e = wzsVar;
        this.f = wzsVar2;
        this.g = cjxVar;
        notifyDataSetChanged();
    }
}
