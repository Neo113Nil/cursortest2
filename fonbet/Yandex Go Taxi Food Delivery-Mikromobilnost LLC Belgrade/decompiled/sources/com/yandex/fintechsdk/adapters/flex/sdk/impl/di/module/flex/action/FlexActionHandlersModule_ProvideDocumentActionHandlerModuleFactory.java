package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.fw;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideDocumentActionHandlerModuleFactory implements v7p {
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvideDocumentActionHandlerModuleFactory(FlexActionHandlersModule flexActionHandlersModule) {
        this.module = flexActionHandlersModule;
    }

    public static FlexActionHandlersModule_ProvideDocumentActionHandlerModuleFactory create(FlexActionHandlersModule flexActionHandlersModule) {
        return new FlexActionHandlersModule_ProvideDocumentActionHandlerModuleFactory(flexActionHandlersModule);
    }

    public static fw provideDocumentActionHandlerModule(FlexActionHandlersModule flexActionHandlersModule) {
        fw provideDocumentActionHandlerModule = flexActionHandlersModule.provideDocumentActionHandlerModule();
        q5z.i(provideDocumentActionHandlerModule);
        return provideDocumentActionHandlerModule;
    }

    @Override // defpackage.yvf0
    public fw get() {
        return provideDocumentActionHandlerModule(this.module);
    }
}
