package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.fw;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideListActionHandlerModuleFactory implements v7p {
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvideListActionHandlerModuleFactory(FlexActionHandlersModule flexActionHandlersModule) {
        this.module = flexActionHandlersModule;
    }

    public static FlexActionHandlersModule_ProvideListActionHandlerModuleFactory create(FlexActionHandlersModule flexActionHandlersModule) {
        return new FlexActionHandlersModule_ProvideListActionHandlerModuleFactory(flexActionHandlersModule);
    }

    public static fw provideListActionHandlerModule(FlexActionHandlersModule flexActionHandlersModule) {
        fw provideListActionHandlerModule = flexActionHandlersModule.provideListActionHandlerModule();
        q5z.i(provideListActionHandlerModule);
        return provideListActionHandlerModule;
    }

    @Override // defpackage.yvf0
    public fw get() {
        return provideListActionHandlerModule(this.module);
    }
}
