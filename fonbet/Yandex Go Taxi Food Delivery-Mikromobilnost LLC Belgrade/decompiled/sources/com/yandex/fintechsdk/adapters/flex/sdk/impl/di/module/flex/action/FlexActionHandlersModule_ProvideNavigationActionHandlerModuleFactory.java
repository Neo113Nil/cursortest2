package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.fw;
import defpackage.q5z;
import defpackage.r3l0;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideNavigationActionHandlerModuleFactory implements v7p {
    private final FlexActionHandlersModule module;
    private final xvf0 routeHandlerProvider;

    private FlexActionHandlersModule_ProvideNavigationActionHandlerModuleFactory(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var) {
        this.module = flexActionHandlersModule;
        this.routeHandlerProvider = xvf0Var;
    }

    public static FlexActionHandlersModule_ProvideNavigationActionHandlerModuleFactory create(FlexActionHandlersModule flexActionHandlersModule, xvf0 xvf0Var) {
        return new FlexActionHandlersModule_ProvideNavigationActionHandlerModuleFactory(flexActionHandlersModule, xvf0Var);
    }

    public static fw provideNavigationActionHandlerModule(FlexActionHandlersModule flexActionHandlersModule, r3l0 r3l0Var) {
        fw provideNavigationActionHandlerModule = flexActionHandlersModule.provideNavigationActionHandlerModule(r3l0Var);
        q5z.i(provideNavigationActionHandlerModule);
        return provideNavigationActionHandlerModule;
    }

    @Override // defpackage.yvf0
    public fw get() {
        return provideNavigationActionHandlerModule(this.module, (r3l0) this.routeHandlerProvider.get());
    }
}
