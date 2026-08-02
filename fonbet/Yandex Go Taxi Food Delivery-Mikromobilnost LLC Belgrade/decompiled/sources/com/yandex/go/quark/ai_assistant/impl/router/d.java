package com.yandex.go.quark.ai_assistant.impl.router;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import defpackage.hm1;
import defpackage.pw;
import defpackage.tje;
import defpackage.vgg0;

/* loaded from: classes13.dex */
public final class d extends BaseRootNavigationRouter {
    public final pw D;
    public final vgg0 E;

    public d(pw pwVar, vgg0 vgg0Var) {
        this.D = pwVar;
        this.E = vgg0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new AiAssistantRootRouter$onLaunch$1(this, (hm1) obj, null), 3);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.NONE, BaseRootNavigationRouter.AnimationType.STAR_WARS, 9);
    }
}
