package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.d0m;
import defpackage.fw;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideTemplatedActionHandlerModuleFactory implements v7p {
    private final xvf0 documentJsonProvider;
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvideTemplatedActionHandlerModuleFactory(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var) {
        this.module = flexActionHandlersModule;
        this.documentJsonProvider = xvf0Var;
    }

    public static FlexActionHandlersModule_ProvideTemplatedActionHandlerModuleFactory create(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var) {
        return new FlexActionHandlersModule_ProvideTemplatedActionHandlerModuleFactory(flexActionHandlersModule, xvf0Var);
    }

    public static fw provideTemplatedActionHandlerModule(FlexActionHandlersModule flexActionHandlersModule, d0m d0mVar) {
        fw provideTemplatedActionHandlerModule = flexActionHandlersModule.provideTemplatedActionHandlerModule(d0mVar);
        q5z.i(provideTemplatedActionHandlerModule);
        return provideTemplatedActionHandlerModule;
    }

    @Override // defpackage.yvf0
    public fw get() {
        return provideTemplatedActionHandlerModule(this.module, (d0m) this.documentJsonProvider.get());
    }
}
