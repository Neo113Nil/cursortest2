package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.b5x;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvideDebuggerFactory implements v7p {
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvideDebuggerFactory(FlexActionHandlersModule flexActionHandlersModule) {
        this.module = flexActionHandlersModule;
    }

    public static FlexActionHandlersModule_ProvideDebuggerFactory create(FlexActionHandlersModule flexActionHandlersModule) {
        return new FlexActionHandlersModule_ProvideDebuggerFactory(flexActionHandlersModule);
    }

    public static b5x provideDebugger(FlexActionHandlersModule flexActionHandlersModule) {
        b5x provideDebugger = flexActionHandlersModule.provideDebugger();
        q5z.i(provideDebugger);
        return provideDebugger;
    }

    @Override // defpackage.yvf0
    public b5x get() {
        return provideDebugger(this.module);
    }
}
