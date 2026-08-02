package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.model.communities.ReviewSourceType;
import com.vkontakte.android.R;

/* compiled from: MarketItemReviewItemComposeViewHolder.kt */
/* loaded from: classes18.dex */
public final class j210 extends vfz<h210> {
    public final h780 l;
    public final ComposeView m;
    public h210 n;

    public j210(ViewGroup viewGroup, i410 i410Var) {
        super(e0n.a(R.layout.market_item_review_item_compose_view_holder, viewGroup, false));
        this.l = i410Var;
        this.m = (ComposeView) this.itemView.findViewById(R.id.market_item_review_item_compose_view);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(h210 h210Var) {
        h210 h210Var2 = h210Var;
        this.n = h210Var2;
        e0n.b(this.itemView, h210Var2.l);
        this.m.setContent(new jai(-749808556, new pg(this, 4), true));
    }

    public final void h6() {
        UserId userId;
        h210 h210Var = this.n;
        if (h210Var == null || (userId = h210Var.d) == null) {
            return;
        }
        vhg0 vhg0Var = h210Var.f;
        if (fkq0.c(userId) && vhg0Var.e == ReviewSourceType.Vk) {
            this.l.a(userId);
        }
    }
}
