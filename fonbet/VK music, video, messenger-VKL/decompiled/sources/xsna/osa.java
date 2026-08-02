package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vkontakte.android.R;

/* compiled from: ChangePayMethodViewHolder.kt */
/* loaded from: classes6.dex */
public final class osa extends vfz<nsa> {
    public final a l;
    public final ImageView m;
    public final TextView n;
    public final View o;

    /* compiled from: ChangePayMethodViewHolder.kt */
    public interface a {
        void a();
    }

    public osa(ViewGroup viewGroup, a aVar) {
        super(R.layout.vk_pay_checkout_change_pay_method_item, viewGroup);
        this.l = aVar;
        this.m = (ImageView) this.itemView.findViewById(R.id.item_pay_method_logo);
        this.n = (TextView) this.itemView.findViewById(R.id.item_pay_method_title);
        View findViewById = this.itemView.findViewById(R.id.pay_method_confirmation_form_change_method);
        this.o = findViewById;
        findViewById.setOnClickListener(new q3(this, 1));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(nsa nsaVar) {
        nsa nsaVar2 = nsaVar;
        Context context = this.itemView.getContext();
        sr90<? extends PayMethodData> sr90Var = nsaVar2.b;
        this.m.setImageDrawable(vua0.m(context, sr90Var));
        this.n.setText(xx1.o(this.itemView.getContext(), sr90Var, nsaVar2.c));
        if (nsaVar2.d) {
            f4m.j(this.o);
        }
    }
}
