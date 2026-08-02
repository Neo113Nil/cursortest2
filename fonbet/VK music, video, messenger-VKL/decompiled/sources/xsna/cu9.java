package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.dto.money.MoneyCard;
import com.vkontakte.android.R;

/* compiled from: CardViewHolder.kt */
/* loaded from: classes3.dex */
public final class cu9 extends tai0<it9> {
    public final izs<MoneyCard, s3q0> p;
    public final TextView q;
    public it9 r;

    /* JADX WARN: Multi-variable type inference failed */
    public cu9(View view, izs<? super MoneyCard, s3q0> izsVar) {
        super(view);
        this.p = izsVar;
        this.q = (TextView) view.findViewById(R.id.title);
        bwt0.i0(view, new mz(this, 19));
    }

    @Override // xsna.tai0
    public final void i6() {
        this.q.setCompoundDrawables(null, null, null, null);
    }

    @Override // xsna.tai0
    public final void j6() {
        this.q.setCompoundDrawables(null, null, this.l, null);
    }

    @Override // xsna.tai0
    /* renamed from: l6, reason: merged with bridge method [inline-methods] */
    public final void W5(it9 it9Var) {
        MoneyCard moneyCard = it9Var.c;
        this.r = it9Var;
        super.W5(it9Var);
        String title = moneyCard.getTitle();
        TextView textView = this.q;
        textView.setText(title);
        if (moneyCard.equals(MoneyCard.f)) {
            at.d(this.itemView, R.string.money_transfer_new_card, textView);
        } else {
            textView.setText(moneyCard.getTitle());
        }
    }
}
