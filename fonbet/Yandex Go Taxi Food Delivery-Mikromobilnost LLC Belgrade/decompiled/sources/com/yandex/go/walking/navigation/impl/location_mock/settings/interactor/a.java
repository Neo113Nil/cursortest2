package com.yandex.go.walking.navigation.impl.location_mock.settings.interactor;

import defpackage.e441;
import defpackage.tpr;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class a {
    public final e441 a;
    public final com.yandex.go.walking.navigation.impl.location_mock.simulator.a b;

    public a(e441 e441Var, com.yandex.go.walking.navigation.impl.location_mock.simulator.a aVar) {
        this.a = e441Var;
        this.b = aVar;
    }

    public final tpr a() {
        e441 e441Var = this.a;
        return e.t(e.n(e441Var.b, e441Var.d, this.b.e, new WalkNavMockSettingsUiStateInteractor$uiStateFlow$1(4, null)));
    }
}
