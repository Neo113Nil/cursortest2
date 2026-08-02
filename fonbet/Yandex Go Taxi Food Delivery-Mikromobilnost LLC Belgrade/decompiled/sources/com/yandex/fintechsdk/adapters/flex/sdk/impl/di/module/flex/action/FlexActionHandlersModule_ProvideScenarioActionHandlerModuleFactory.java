package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.fw;
import defpackage.k6x;
import defpackage.q5z;
import defpackage.u4x;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideScenarioActionHandlerModuleFactory implements v7p {
    private final xvf0 jasonActorProvider;
    private final xvf0 jasonStateStoreProvider;
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvideScenarioActionHandlerModuleFactory(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = flexActionHandlersModule;
        this.jasonStateStoreProvider = xvf0Var;
        this.jasonActorProvider = xvf0Var2;
    }

    public static FlexActionHandlersModule_ProvideScenarioActionHandlerModuleFactory create(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new FlexActionHandlersModule_ProvideScenarioActionHandlerModuleFactory(flexActionHandlersModule, xvf0Var, xvf0Var2);
    }

    public static fw provideScenarioActionHandlerModule(FlexActionHandlersModule flexActionHandlersModule, k6x k6xVar, u4x u4xVar) {
        fw provideScenarioActionHandlerModule = flexActionHandlersModule.provideScenarioActionHandlerModule(k6xVar, u4xVar);
        q5z.i(provideScenarioActionHandlerModule);
        return provideScenarioActionHandlerModule;
    }

    @Override // defpackage.yvf0
    public fw get() {
        return provideScenarioActionHandlerModule(this.module, (k6x) this.jasonStateStoreProvider.get(), (u4x) this.jasonActorProvider.get());
    }
}
