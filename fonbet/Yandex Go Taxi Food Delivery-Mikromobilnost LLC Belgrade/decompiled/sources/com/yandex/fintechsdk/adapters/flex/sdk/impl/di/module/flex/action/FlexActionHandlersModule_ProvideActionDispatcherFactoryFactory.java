package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.delayed.DelayedActionHandlerModule;
import defpackage.fw;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yu;
import java.util.Set;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideActionDispatcherFactoryFactory implements v7p {
    private final xvf0 actionHandlerModulesProvider;
    private final xvf0 delayedActionHandlerModuleProvider;
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvideActionDispatcherFactoryFactory(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = flexActionHandlersModule;
        this.actionHandlerModulesProvider = xvf0Var;
        this.delayedActionHandlerModuleProvider = xvf0Var2;
    }

    public static FlexActionHandlersModule_ProvideActionDispatcherFactoryFactory create(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new FlexActionHandlersModule_ProvideActionDispatcherFactoryFactory(flexActionHandlersModule, xvf0Var, xvf0Var2);
    }

    public static yu provideActionDispatcherFactory(FlexActionHandlersModule flexActionHandlersModule, Set<fw> set, DelayedActionHandlerModule delayedActionHandlerModule) {
        yu provideActionDispatcherFactory = flexActionHandlersModule.provideActionDispatcherFactory(set, delayedActionHandlerModule);
        q5z.i(provideActionDispatcherFactory);
        return provideActionDispatcherFactory;
    }

    @Override // defpackage.yvf0
    public yu get() {
        return provideActionDispatcherFactory(this.module, (Set) this.actionHandlerModulesProvider.get(), (DelayedActionHandlerModule) this.delayedActionHandlerModuleProvider.get());
    }
}
