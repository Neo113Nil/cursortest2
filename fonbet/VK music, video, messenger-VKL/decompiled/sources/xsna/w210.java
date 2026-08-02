package xsna;

import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.writebar.WriteBar;
import xsna.w1g0;

/* compiled from: MarketItemReviewRepliesFragment.kt */
/* loaded from: classes18.dex */
public final class w210 implements s1y0 {
    public final /* synthetic */ MarketItemReviewRepliesFragment b;

    public w210(MarketItemReviewRepliesFragment marketItemReviewRepliesFragment) {
        this.b = marketItemReviewRepliesFragment;
    }

    @Override // xsna.s1y0
    public final void a(f1y0 f1y0Var) {
        MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = this.b;
        WriteBar writeBar = marketItemReviewRepliesFragment.S;
        if (writeBar != null) {
            e2g0 e2g0Var = marketItemReviewRepliesFragment.Y;
            String a = e2g0Var != null ? e2g0Var.a() : null;
            if (a == null) {
                a = "";
            }
            marketItemReviewRepliesFragment.eo(new w1g0.j(a, writeBar.getAttachments()));
        }
    }

    @Override // xsna.s1y0
    public final void b(f1y0 f1y0Var) {
        a(f1y0Var);
    }

    @Override // xsna.s1y0
    public final boolean c() {
        return false;
    }
}
