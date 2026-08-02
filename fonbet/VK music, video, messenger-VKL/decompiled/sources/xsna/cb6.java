package xsna;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.sr90;
import xsna.y5c;

/* compiled from: BaseCheckoutMethodHolder.kt */
/* loaded from: classes6.dex */
public class cb6<T extends sr90<?>> extends vfz<T> {
    public final y5c.a l;
    public final bpn0 m;
    public final bpn0 n;

    public cb6(View view, y5c.a aVar) {
        super(view);
        this.l = aVar;
        this.m = new bpn0(new ka0(this, 6));
        this.n = new bpn0(new vf0(this, 8));
    }

    @Override // xsna.vfz
    /* renamed from: h6, reason: merged with bridge method [inline-methods] */
    public void W5(T t) {
        bpn0 bpn0Var = this.m;
        ((ImageView) bpn0Var.getValue()).setImageDrawable(vua0.m(this.itemView.getContext(), t));
        SpannableStringBuilder o = t.d() ? xx1.o(this.itemView.getContext(), t, R.attr.vk_legacy_text_secondary) : xx1.o(this.itemView.getContext(), t, R.attr.vk_legacy_destructive);
        bpn0 bpn0Var2 = this.n;
        ((TextView) bpn0Var2.getValue()).setText(new SpannableString(o));
        this.itemView.setEnabled(t.d());
        float f = t.d() ? 1.0f : 0.6f;
        ((ImageView) bpn0Var.getValue()).setAlpha(f);
        ((TextView) bpn0Var2.getValue()).setAlpha(f);
    }

    public cb6(ViewGroup viewGroup, y5c.a aVar) {
        this(tf3.b(viewGroup, R.layout.vk_pay_checkout_item_pay_method, viewGroup, false), aVar);
    }
}
