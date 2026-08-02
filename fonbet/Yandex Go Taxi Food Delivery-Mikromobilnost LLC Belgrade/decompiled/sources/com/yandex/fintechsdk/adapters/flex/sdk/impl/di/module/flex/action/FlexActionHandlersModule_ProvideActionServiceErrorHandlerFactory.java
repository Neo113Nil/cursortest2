package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.iy;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideActionServiceErrorHandlerFactory implements v7p {
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvideActionServiceErrorHandlerFactory(FlexActionHandlersModule flexActionHandlersModule) {
        this.module = flexActionHandlersModule;
    }

    public static FlexActionHandlersModule_ProvideActionServiceErrorHandlerFactory create(FlexActionHandlersModule flexActionHandlersModule) {
        return new FlexActionHandlersModule_ProvideActionServiceErrorHandlerFactory(flexActionHandlersModule);
    }

    public static iy provideActionServiceErrorHandler(FlexActionHandlersModule flexActionHandlersModule) {
        iy provideActionServiceErrorHandler = flexActionHandlersModule.provideActionServiceErrorHandler();
        q5z.i(provideActionServiceErrorHandler);
        return provideActionServiceErrorHandler;
    }

    @Override // defpackage.yvf0
    public iy get() {
        return provideActionServiceErrorHandler(this.module);
    }
}
