package com.yandex.passport.internal.ui.challenge.logout;

/* loaded from: classes2.dex */
public final class g0 extends com.yandex.passport.internal.ui.challenge.u {
    public LogoutBehaviour c = LogoutBehaviour.DROP_CLIENT_TOKEN;

    @Override // com.yandex.passport.internal.ui.challenge.u
    public final com.yandex.passport.internal.ui.challenge.o W(com.yandex.passport.internal.ui.challenge.l lVar) {
        return (t) com.yandex.passport.internal.di.a.a().createLogoutComponent().challengeData((com.yandex.passport.internal.ui.challenge.k) lVar).behaviour(this.c).viewModel(this).build().getSessionProvider().get();
    }
}
