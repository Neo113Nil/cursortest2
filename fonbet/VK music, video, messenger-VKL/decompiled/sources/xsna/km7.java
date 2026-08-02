package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.vl7;

/* compiled from: BonusesSpendViewHolder.kt */
/* loaded from: classes6.dex */
public final class km7 extends vfz<vl7.b> {
    public final jbc<hfz> l;
    public final RadioButton m;
    public final TextView n;
    public final TextView o;
    public vl7.b p;

    public km7(ViewGroup viewGroup, xl7 xl7Var, jtj0 jtj0Var) {
        super(R.layout.vk_pay_checkout_bonuses_action_item, viewGroup);
        this.l = jtj0Var;
        RadioButton radioButton = (RadioButton) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_action_radiobutton);
        this.m = radioButton;
        this.n = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_action_radio_description_textview);
        this.o = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_action_additional_info_textview);
        radioButton.setOnCheckedChangeListener(new im7(this, 0));
    }

    @Override // xsna.vfz
    public final void W5(vl7.b bVar) {
        vl7.b bVar2 = bVar;
        this.p = bVar2;
        jbc<hfz> jbcVar = this.l;
        boolean b = jbcVar.b(bVar2);
        RadioButton radioButton = this.m;
        radioButton.setChecked(b);
        bVar2.getClass();
        TextView textView = this.o;
        textView.setText("А стоит ли?");
        radioButton.setText(this.itemView.getContext().getString(R.string.vk_pay_checkout_bonuses_spend));
        this.n.setText(this.itemView.getContext().getString(R.string.vk_pay_checkout_bonuses_spend_some_but_total_is, 80, 10000));
        boolean b2 = jbcVar.b(bVar2);
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(iah0.z(textView.getContext()), 1073741823)), 1073741824), tr.a(0, 1073741823, 0, 0));
        ValueAnimator ofInt = ValueAnimator.ofInt(textView.getHeight(), b2 ? textView.getMeasuredHeight() : 0);
        ofInt.addUpdateListener(new hm7(this, 0));
        ofInt.addListener(new jm7(b2, this));
        ofInt.start();
    }
}
