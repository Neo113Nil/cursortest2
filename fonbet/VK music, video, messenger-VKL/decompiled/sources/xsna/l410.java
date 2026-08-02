package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vkontakte.android.R;

/* compiled from: MarketItemReviewsHeaderItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class l410 extends vfz<k410> {
    public final h780 l;
    public final ComposeView m;

    public l410(ViewGroup viewGroup, i410 i410Var) {
        super(e0n.a(R.layout.market_item_reviews_header_item_view_holder, viewGroup, false));
        this.l = i410Var;
        this.m = (ComposeView) this.itemView;
    }

    @Override // xsna.vfz
    public final void W5(k410 k410Var) {
        k410 k410Var2 = k410Var;
        e0n.b(this.itemView, k410Var2.c);
        this.m.setContent(new jai(1225080817, new pzj(3, k410Var2, this), true));
    }
}
