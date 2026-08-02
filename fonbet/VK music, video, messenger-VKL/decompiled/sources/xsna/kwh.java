package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class kwh implements eig0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ FragmentImpl c;

    public /* synthetic */ kwh(int i, FragmentImpl fragmentImpl) {
        this.b = i;
        this.c = fragmentImpl;
    }

    @Override // xsna.eig0
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) this.c;
                communityRepliesFragment.X.getClass();
                w1g0 h = jcr.h((t2g0) obj);
                if (h != null) {
                    xn50.a.c(communityRepliesFragment, h);
                    break;
                }
                break;
            default:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) this.c;
                marketItemReviewRepliesFragment.N.getClass();
                w1g0 h2 = jcr.h((t2g0) obj);
                if (h2 != null) {
                    marketItemReviewRepliesFragment.eo(h2);
                    break;
                }
                break;
        }
    }
}
