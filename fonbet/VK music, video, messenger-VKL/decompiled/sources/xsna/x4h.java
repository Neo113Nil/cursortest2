package xsna;

import com.vk.webapp.fragments.CommunityManageFragment;

/* compiled from: JsInternalProviders.kt */
/* loaded from: classes7.dex */
public final class x4h extends nf6 {
    public final CommunityManageFragment a;
    public final fvv0 b;
    public final qnx c;
    public final CommunityManageFragment.d d;

    public x4h(CommunityManageFragment communityManageFragment, wwv0 wwv0Var, qnx qnxVar, CommunityManageFragment.d dVar) {
        this.a = communityManageFragment;
        this.b = wwv0Var;
        this.c = qnxVar;
        this.d = dVar;
    }

    @Override // xsna.nf6
    public final r6y a() {
        CommunityManageFragment.d dVar = this.d;
        CommunityManageFragment communityManageFragment = this.a;
        fvv0 fvv0Var = this.b;
        qnx qnxVar = this.c;
        u5h u5hVar = new u5h(communityManageFragment, fvv0Var, qnxVar, dVar);
        u5hVar.h0 = new m9h(communityManageFragment, u5hVar, qnxVar);
        return u5hVar;
    }
}
