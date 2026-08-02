package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;

/* compiled from: ProfileDraftListViewHolder.kt */
/* loaded from: classes16.dex */
public final class zvd0 extends RecyclerView.e0 implements View.OnClickListener {
    public static final /* synthetic */ int r = 0;
    public final izs<jdo, s3q0> l;
    public final izs<jdo, s3q0> m;
    public final xod n;
    public final VkCell o;
    public final bpn0 p;
    public jdo q;

    public zvd0(View view, wi3 wi3Var, ae8 ae8Var, xod xodVar) {
        super(view);
        this.l = wi3Var;
        this.m = ae8Var;
        this.n = xodVar;
        this.o = (VkCell) this.itemView;
        this.p = new bpn0(new bu0(26));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jdo jdoVar = this.q;
        if (jdoVar == null || !epx.f(view, this.itemView) || getAdapterPosition() == -1 || ((pxo0) this.p.getValue()).a()) {
            return;
        }
        this.l.invoke(jdoVar);
    }
}
