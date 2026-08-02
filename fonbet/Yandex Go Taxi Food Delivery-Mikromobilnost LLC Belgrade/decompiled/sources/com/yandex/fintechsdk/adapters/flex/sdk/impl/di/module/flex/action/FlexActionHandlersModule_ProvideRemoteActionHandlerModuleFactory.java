package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.fw;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xv;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideRemoteActionHandlerModuleFactory implements v7p {
    private final xvf0 executorProvider;
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvideRemoteActionHandlerModuleFactory(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var) {
        this.module = flexActionHandlersModule;
        this.executorProvider = xvf0Var;
    }

    public static FlexActionHandlersModule_ProvideRemoteActionHandlerModuleFactory create(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var) {
        return new FlexActionHandlersModule_ProvideRemoteActionHandlerModuleFactory(flexActionHandlersModule, xvf0Var);
    }

    public static fw provideRemoteActionHandlerModule(FlexActionHandlersModule flexActionHandlersModule, xv xvVar) {
        fw provideRemoteActionHandlerModule = flexActionHandlersModule.provideRemoteActionHandlerModule(xvVar);
        q5z.i(provideRemoteActionHandlerModule);
        return provideRemoteActionHandlerModule;
    }

    @Override // defpackage.yvf0
    public fw get() {
        return provideRemoteActionHandlerModule(this.module, (xv) this.executorProvider.get());
    }
}
