package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: AddCardViewHolder.kt */
/* loaded from: classes3.dex */
public final class xk0 extends vfz<wk0> {
    public final izs<String, s3q0> l;
    public final TextView m;
    public wk0 n;

    /* JADX WARN: Multi-variable type inference failed */
    public xk0(View view, izs<? super String, s3q0> izsVar) {
        super(view);
        this.l = izsVar;
        this.m = (TextView) view.findViewById(R.id.tv_add_card);
        bwt0.i0(view, new p40(this, 1));
    }

    @Override // xsna.vfz
    public final void W5(wk0 wk0Var) {
        this.n = wk0Var;
        at.d(this.itemView, R.string.money_transfer_add_card, this.m);
    }
}
