package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: BonusesProgramTermsViewHolder.kt */
/* loaded from: classes6.dex */
public final class gm7 extends vfz<q1e0> {
    public final TextView l;
    public q1e0 m;

    public gm7(ViewGroup viewGroup) {
        super(R.layout.vk_pay_checkout_bonuses_program_terms_item, viewGroup);
        TextView textView = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_program_terms_textview);
        this.l = textView;
        textView.setOnClickListener(new mo3(this, 2));
    }

    @Override // xsna.vfz
    public final void W5(q1e0 q1e0Var) {
        this.m = q1e0Var;
        at.d(this.itemView, R.string.vk_pay_checkout_bonuses_program_terms, this.l);
    }
}
