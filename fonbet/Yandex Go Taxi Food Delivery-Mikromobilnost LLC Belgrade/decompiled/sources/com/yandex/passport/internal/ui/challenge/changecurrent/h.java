package com.yandex.passport.internal.ui.challenge.changecurrent;

/* loaded from: classes2.dex */
public final class h extends com.yandex.passport.internal.ui.challenge.u {
    @Override // com.yandex.passport.internal.ui.challenge.u
    public final com.yandex.passport.internal.ui.challenge.o W(com.yandex.passport.internal.ui.challenge.l lVar) {
        return (f) com.yandex.passport.internal.di.a.a().createSetCurrentAccountComponent().challengeData((com.yandex.passport.internal.ui.challenge.j) lVar).viewModel(this).build().getSessionProvider().get();
    }
}
