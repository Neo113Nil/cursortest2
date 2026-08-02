package xsna;

import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.writebar.WriteBar;
import xsna.w1g0;
import xsna.xn50;

/* compiled from: CommunityRepliesFragment.kt */
/* loaded from: classes18.dex */
public final class nwh implements s1y0 {
    public final /* synthetic */ CommunityRepliesFragment b;

    public nwh(CommunityRepliesFragment communityRepliesFragment) {
        this.b = communityRepliesFragment;
    }

    @Override // xsna.s1y0
    public final void a(f1y0 f1y0Var) {
        CommunityRepliesFragment communityRepliesFragment = this.b;
        e2g0 e2g0Var = communityRepliesFragment.Z;
        if (e2g0Var != null) {
            qzg qzgVar = new qzg(communityRepliesFragment, 2);
            ozf ozfVar = new ozf(communityRepliesFragment, 8);
            WriteBar writeBar = e2g0Var.a;
            if (!writeBar.e()) {
                qzgVar.invoke();
                return;
            }
            xn50.a.c(communityRepliesFragment, new w1g0.p(true));
            s3q0 s3q0Var = s3q0.a;
            writeBar.f(new d2g0(0, qzgVar), new nu4(ozfVar, 7));
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
