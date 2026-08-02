package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.fw;
import defpackage.q5z;
import defpackage.tse;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideTimedActionHandlerModuleFactory implements v7p {
    private final xvf0 coroutineScopeProvider;
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvideTimedActionHandlerModuleFactory(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var) {
        this.module = flexActionHandlersModule;
        this.coroutineScopeProvider = xvf0Var;
    }

    public static FlexActionHandlersModule_ProvideTimedActionHandlerModuleFactory create(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var) {
        return new FlexActionHandlersModule_ProvideTimedActionHandlerModuleFactory(flexActionHandlersModule, xvf0Var);
    }

    public static fw provideTimedActionHandlerModule(FlexActionHandlersModule flexActionHandlersModule, tse tseVar) {
        fw provideTimedActionHandlerModule = flexActionHandlersModule.provideTimedActionHandlerModule(tseVar);
        q5z.i(provideTimedActionHandlerModule);
        return provideTimedActionHandlerModule;
    }

    @Override // defpackage.yvf0
    public fw get() {
        return provideTimedActionHandlerModule(this.module, (tse) this.coroutineScopeProvider.get());
    }
}
