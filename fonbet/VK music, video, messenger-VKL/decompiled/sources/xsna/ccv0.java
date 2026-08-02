package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.money.createtransfer.people.VkPayInfo;
import com.vkontakte.android.R;

/* compiled from: VkPayViewHolder.kt */
/* loaded from: classes3.dex */
public final class ccv0 extends tai0<fcv0> {
    public final izs<VkPayInfo, s3q0> p;
    public final TextView q;
    public fcv0 r;

    /* JADX WARN: Multi-variable type inference failed */
    public ccv0(View view, izs<? super VkPayInfo, s3q0> izsVar) {
        super(view);
        this.p = izsVar;
        this.q = (TextView) view.findViewById(R.id.title);
        bwt0.i0(view, new olt0(this, 3));
    }

    @Override // xsna.tai0, xsna.vfz
    public final void W5(hfz hfzVar) {
        fcv0 fcv0Var = (fcv0) hfzVar;
        this.r = fcv0Var;
        super.W5(fcv0Var);
        throw null;
    }

    @Override // xsna.tai0
    /* renamed from: h6 */
    public final void W5(fcv0 fcv0Var) {
        fcv0 fcv0Var2 = fcv0Var;
        this.r = fcv0Var2;
        super.W5(fcv0Var2);
        throw null;
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
