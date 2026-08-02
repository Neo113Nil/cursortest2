package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ProductCardCommunityMarketInfoHolder.kt */
/* loaded from: classes18.dex */
public final class jkd0 extends vif0<lkd0> {
    public final izs<ejd0, s3q0> n;
    public final ComposeView o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jkd0(ViewGroup viewGroup, frg frgVar) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setTag("product_card_community_market_info_compose_view");
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.n = frgVar;
        this.o = (ComposeView) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(lkd0 lkd0Var) {
        this.o.setContent(new jai(-79377890, new gx(10, lkd0Var, this), true));
    }
}
