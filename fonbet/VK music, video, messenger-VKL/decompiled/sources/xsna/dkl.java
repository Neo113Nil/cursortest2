package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.zb;

/* compiled from: DefaultPayButtonViewHolder.kt */
/* loaded from: classes6.dex */
public final class dkl extends zb<ckl> {
    public final TextView m;

    public dkl(ViewGroup viewGroup, zb.a aVar) {
        super(R.layout.vk_pay_checkout_ready_to_pay_view, viewGroup, aVar);
        this.m = (TextView) this.itemView.findViewById(R.id.method_confirmation_proceed_to_payment);
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        ckl cklVar = (ckl) hfzVar;
        String str = cklVar.b;
        TextView textView = this.m;
        textView.setText(str);
        textView.setEnabled(cklVar.c);
    }
}
