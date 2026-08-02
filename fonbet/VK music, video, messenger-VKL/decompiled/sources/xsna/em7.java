package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.bbv0;

/* compiled from: BonusesInfoViewHolder.kt */
/* loaded from: classes6.dex */
public final class em7 extends vfz<cm7> {
    public final a l;
    public final TextView m;
    public cm7 n;

    /* compiled from: BonusesInfoViewHolder.kt */
    public interface a {
        void g(boolean z);
    }

    public em7(ViewGroup viewGroup, a aVar) {
        super(R.layout.vk_pay_checkout_bonuses_info_item, viewGroup);
        this.l = aVar;
        TextView textView = (TextView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_amount_or_hide);
        this.m = textView;
        textView.setOnClickListener(new dm7(this, 0));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(cm7 cm7Var) {
        String str;
        cm7 cm7Var2 = cm7Var;
        this.n = cm7Var2;
        if (cm7Var2.b) {
            str = this.itemView.getContext().getString(R.string.vk_pay_checkout_bonuses_info_collapse);
        } else {
            bbv0.g.getClass();
            str = sua.i(100, ',') + (char) 8201 + bbv0.a.f().a.d.h();
        }
        this.m.setText(str);
    }
}
