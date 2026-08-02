package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MarketItemAdapter.kt */
/* loaded from: classes18.dex */
public final class g010 extends sxm implements g530 {
    public final fhb0 i;
    public final RecyclerView j;
    public final boolean k;
    public final q530 l;
    public final isq m;

    public g010(fhb0 fhb0Var, RecyclerView recyclerView, boolean z, q530 q530Var, isq isqVar) {
        this.i = fhb0Var;
        this.j = recyclerView;
        this.k = z;
        this.l = q530Var;
        this.m = isqVar;
        x0(a210.class, new hs00(this, 2));
    }

    @Override // xsna.g530
    public final void H2() {
        int i = 0;
        for (Object obj : this.h) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            hfz hfzVar = (hfz) obj;
            if ((hfzVar instanceof a210) && ((a210) hfzVar).j) {
                notifyItemChanged(i);
            }
            i = i2;
        }
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        hfz hfzVar = this.h.get(i);
        if (hfzVar instanceof a210) {
            return 0;
        }
        if (hfzVar instanceof z110) {
            return 1;
        }
        return super.getItemViewType(i);
    }

    @Override // xsna.g530
    public final void g3() {
    }
}
