package xsna;

import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class jjw0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jjw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                mjw0 mjw0Var = (mjw0) obj;
                if (!mjw0Var.x.f.a) {
                    mjw0Var.l();
                }
                break;
            default:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj;
                int i2 = CommunityReviewsFragment.o0;
                c.u.e eVar = c.u.e.b;
                communityReviewsFragment.getClass();
                xn50.a.c(communityReviewsFragment, eVar);
                break;
        }
        return s3q0.a;
    }
}
