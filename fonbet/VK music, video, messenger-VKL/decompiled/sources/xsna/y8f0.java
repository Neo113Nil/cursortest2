package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import com.vkontakte.android.R;
import xsna.bbv0;

/* compiled from: ReceiptViewHolder.kt */
/* loaded from: classes6.dex */
public final class y8f0 extends vfz<z8f0> {
    public final TextView l;
    public final TextView m;
    public final TextView n;

    public y8f0(ViewGroup viewGroup) {
        super(R.layout.vk_pay_checkout_receipt_item, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_receipt_order_amount);
        this.m = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_receipt_bonuses_amount);
        this.n = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_receipt_total_amount);
    }

    @Override // xsna.vfz
    public final void W5(z8f0 z8f0Var) {
        bbv0.g.getClass();
        VkTransactionInfo.Currency currency = bbv0.a.f().a.d;
        z8f0Var.getClass();
        this.l.setText(j730.a(100, currency));
        this.m.setText(j730.a(70, currency));
        this.n.setText(j730.a(400, currency));
    }
}
