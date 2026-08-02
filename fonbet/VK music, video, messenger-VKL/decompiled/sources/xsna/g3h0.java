package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: SbpViewHolder.kt */
/* loaded from: classes3.dex */
public final class g3h0 extends tai0<x2h0> {
    public final gzs<s3q0> p;
    public final TextView q;

    public g3h0(View view, gzs<s3q0> gzsVar) {
        super(view);
        this.p = gzsVar;
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.q = textView;
        textView.setText(R.string.money_transfer_pay_method_sbp);
        bwt0.i0(view, new xd40(this, 15));
    }

    @Override // xsna.tai0
    public final void i6() {
        this.q.setCompoundDrawables(null, null, null, null);
    }

    @Override // xsna.tai0
    public final void j6() {
        this.q.setCompoundDrawables(null, null, this.l, null);
    }
}
