package com.vk.webapp.fragments;

import com.vk.movika.sdk.base.presenter.b;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.webapp.fragments.CommunityCreationFragment;
import xsna.e370;
import xsna.nf6;
import xsna.qnx;
import xsna.r6y;
import xsna.wwv0;

/* compiled from: CommunityCreationFragment.kt */
/* loaded from: classes7.dex */
public final class a extends nf6 {
    public final /* synthetic */ wwv0 a;
    public final /* synthetic */ CommunityCreationFragment b;

    public a(wwv0 wwv0Var, CommunityCreationFragment communityCreationFragment) {
        this.a = wwv0Var;
        this.b = communityCreationFragment;
    }

    @Override // xsna.nf6
    public final r6y a() {
        CommunityCreationFragment communityCreationFragment = this.b;
        b bVar = new b(communityCreationFragment, 20);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        qnx qnxVar = new qnx(communityCreationFragment, superappUiRouterBridge);
        CommunityCreationFragment.c cVar = new CommunityCreationFragment.c(this.a, qnxVar);
        cVar.i0 = new CommunityCreationFragment.b(bVar, cVar, qnxVar);
        return cVar;
    }
}
