package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.delayed.DelayedActionHandlerModule;
import defpackage.p85;
import defpackage.q5z;
import defpackage.tse;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideDelayedActionHandlerModuleFactory implements v7p {
    private final xvf0 activityProvider;
    private final xvf0 coroutineScopeProvider;
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvideDelayedActionHandlerModuleFactory(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = flexActionHandlersModule;
        this.activityProvider = xvf0Var;
        this.coroutineScopeProvider = xvf0Var2;
    }

    public static FlexActionHandlersModule_ProvideDelayedActionHandlerModuleFactory create(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new FlexActionHandlersModule_ProvideDelayedActionHandlerModuleFactory(flexActionHandlersModule, xvf0Var, xvf0Var2);
    }

    public static DelayedActionHandlerModule provideDelayedActionHandlerModule(FlexActionHandlersModule flexActionHandlersModule, p85 p85Var, tse tseVar) {
        DelayedActionHandlerModule provideDelayedActionHandlerModule = flexActionHandlersModule.provideDelayedActionHandlerModule(p85Var, tseVar);
        q5z.i(provideDelayedActionHandlerModule);
        return provideDelayedActionHandlerModule;
    }

    @Override // defpackage.yvf0
    public DelayedActionHandlerModule get() {
        return provideDelayedActionHandlerModule(this.module, (p85) this.activityProvider.get(), (tse) this.coroutineScopeProvider.get());
    }
}
