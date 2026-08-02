package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import defpackage.k6x;
import defpackage.q5z;
import defpackage.sh5;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexModule_ProvideBduiStateManagerFactory implements v7p {
    private final xvf0 jasonStateStoreProvider;
    private final FlexModule module;

    private FlexModule_ProvideBduiStateManagerFactory(FlexModule flexModule, xvf0 xvf0Var) {
        this.module = flexModule;
        this.jasonStateStoreProvider = xvf0Var;
    }

    public static FlexModule_ProvideBduiStateManagerFactory create(FlexModule flexModule, xvf0 xvf0Var) {
        return new FlexModule_ProvideBduiStateManagerFactory(flexModule, xvf0Var);
    }

    public static sh5 provideBduiStateManager(FlexModule flexModule, k6x k6xVar) {
        sh5 provideBduiStateManager = flexModule.provideBduiStateManager(k6xVar);
        q5z.i(provideBduiStateManager);
        return provideBduiStateManager;
    }

    @Override // defpackage.yvf0
    public sh5 get() {
        return provideBduiStateManager(this.module, (k6x) this.jasonStateStoreProvider.get());
    }
}
