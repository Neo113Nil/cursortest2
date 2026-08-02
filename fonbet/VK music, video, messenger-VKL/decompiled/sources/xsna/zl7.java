package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: BonusesAlertViewHolder.kt */
/* loaded from: classes6.dex */
public final class zl7 extends vfz<yl7> {
    public final TextView l;
    public final TextView m;

    public zl7(ViewGroup viewGroup) {
        super(R.layout.vk_pay_checkout_bonuses_alert_item, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_alert_title);
        this.m = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_alert_subtitle);
    }

    @Override // xsna.vfz
    public final void W5(yl7 yl7Var) {
        yl7 yl7Var2 = yl7Var;
        String str = yl7Var2.c;
        String str2 = yl7Var2.b;
        boolean z = str2 != null;
        TextView textView = this.l;
        awt0.v(textView, z);
        boolean z2 = str != null;
        TextView textView2 = this.m;
        awt0.v(textView2, z2);
        if (str2 != null) {
            textView.setText(str2);
        }
        if (str != null) {
            textView2.setText(str);
        }
    }
}
