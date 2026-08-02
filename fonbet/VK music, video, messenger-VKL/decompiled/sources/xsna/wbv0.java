package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: VkPayNoBalanceViewHolder.kt */
/* loaded from: classes3.dex */
public final class wbv0 extends tai0<vbv0> {
    public final gzs<s3q0> p;
    public final TextView q;

    public wbv0(View view, gzs<s3q0> gzsVar) {
        super(view);
        this.p = gzsVar;
        this.q = (TextView) view.findViewById(R.id.title);
        view.setOnClickListener(new yg1(this, 12));
    }

    @Override // xsna.tai0, xsna.vfz
    public final void W5(hfz hfzVar) {
        super.W5((vbv0) hfzVar);
        at.d(this.itemView, R.string.vk_pay, this.q);
    }

    @Override // xsna.tai0
    /* renamed from: h6 */
    public final void W5(vbv0 vbv0Var) {
        super.W5(vbv0Var);
        at.d(this.itemView, R.string.vk_pay, this.q);
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
