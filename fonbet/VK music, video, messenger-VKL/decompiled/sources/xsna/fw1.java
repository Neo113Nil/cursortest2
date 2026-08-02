package xsna;

import android.text.Html;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: AmountToReplenishViewHolder.kt */
/* loaded from: classes6.dex */
public final class fw1 extends vfz<ew1> {
    public final TextView l;

    public fw1(ViewGroup viewGroup) {
        super(R.layout.vk_pay_checkout_amount_to_replenish_info_item, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_how_much_extra_money_is_needed);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(ew1 ew1Var) {
        ew1 ew1Var2 = ew1Var;
        int i = ew1Var2.b;
        this.l.setText(Html.fromHtml(this.itemView.getContext().getString(R.string.vk_pay_checkout_vkpay_method_card_replenish_to_buy_caption, sua.i(i, ',') + (char) 8201 + ew1Var2.c.h()), 0));
    }
}
