package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: MarketItemCommentsHeaderItemViewHolder.kt */
/* loaded from: classes17.dex */
public final class y010 extends vif0<x010> {
    public final TextView n;

    public y010(ViewGroup viewGroup) {
        super(e0n.a(R.layout.market_item_comments_header_view_holder, viewGroup, true));
        this.n = (TextView) this.itemView.findViewById(R.id.review_count_text_view);
    }

    @Override // xsna.vif0
    public final void i6(x010 x010Var) {
        x010 x010Var2 = x010Var;
        e0n.b(this.itemView, x010Var2.b);
        ey2.h(this.n, x010Var2.a);
    }
}
