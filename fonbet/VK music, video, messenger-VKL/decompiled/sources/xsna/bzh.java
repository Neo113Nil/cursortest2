package xsna;

import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.writebar.WriteBar;
import xsna.xn50;

/* compiled from: CommunityReviewsFragment.kt */
/* loaded from: classes18.dex */
public final class bzh implements s1y0 {
    public final /* synthetic */ CommunityReviewsFragment b;

    public bzh(CommunityReviewsFragment communityReviewsFragment) {
        this.b = communityReviewsFragment;
    }

    @Override // xsna.s1y0
    public final void a(f1y0 f1y0Var) {
        CommunityReviewsFragment communityReviewsFragment = this.b;
        e2g0 e2g0Var = communityReviewsFragment.S;
        if (e2g0Var != null) {
            k5h k5hVar = new k5h(communityReviewsFragment, 2);
            c5f c5fVar = new c5f(communityReviewsFragment, 7);
            WriteBar writeBar = e2g0Var.a;
            if (!writeBar.e()) {
                k5hVar.invoke();
                return;
            }
            xn50.a.c(communityReviewsFragment, new c.y(true));
            s3q0 s3q0Var = s3q0.a;
            writeBar.f(new d2g0(0, k5hVar), new nu4(c5fVar, 7));
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
