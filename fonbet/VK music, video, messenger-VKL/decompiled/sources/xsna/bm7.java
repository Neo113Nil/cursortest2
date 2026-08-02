package xsna;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.vl7;

/* compiled from: BonusesEarnViewHolder.kt */
/* loaded from: classes6.dex */
public final class bm7 extends vfz<vl7.a> {
    public final jbc<hfz> l;
    public final RadioButton m;
    public final TextView n;
    public final TextView o;
    public vl7.a p;

    public bm7(ViewGroup viewGroup, xl7 xl7Var, jtj0 jtj0Var) {
        super(R.layout.vk_pay_checkout_bonuses_action_item, viewGroup);
        this.l = jtj0Var;
        RadioButton radioButton = (RadioButton) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_action_radiobutton);
        this.m = radioButton;
        this.n = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_action_radio_description_textview);
        this.o = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_action_additional_info_textview);
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.am7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                bm7 bm7Var = bm7.this;
                vl7.a aVar = bm7Var.p;
                if (aVar != null) {
                    jbc<hfz> jbcVar = bm7Var.l;
                    bm7Var.getAdapterPosition();
                    jbcVar.a(aVar);
                }
            }
        });
    }

    @Override // xsna.vfz
    public final void W5(vl7.a aVar) {
        vl7.a aVar2 = aVar;
        this.p = aVar2;
        boolean b = this.l.b(aVar2);
        RadioButton radioButton = this.m;
        radioButton.setChecked(b);
        aVar2.getClass();
        this.o.setText("");
        radioButton.setText(this.itemView.getContext().getString(R.string.vk_pay_checkout_bonuses_earn));
        this.n.setText(this.itemView.getContext().getString(R.string.vk_pay_checkout_bonuses_earn_some, 80));
    }
}
