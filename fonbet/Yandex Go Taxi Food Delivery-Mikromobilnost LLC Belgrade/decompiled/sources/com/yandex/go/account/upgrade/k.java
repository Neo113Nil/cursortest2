package com.yandex.go.account.upgrade;

import defpackage.j20;
import defpackage.jm;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes.dex */
public final class k {
    public final j20 a;
    public final jm b;

    public k(j20 j20Var, jm jmVar) {
        this.a = j20Var;
        this.b = jmVar;
    }

    public final m0 a() {
        return new m0(((f) this.b).a(), ((com.yandex.go.user_profile.settings.profile.data.b) this.a).a(), new UpgradeAccountModalViewUiStateRepositoryImpl$uiStateFlow$1(3, null));
    }
}
