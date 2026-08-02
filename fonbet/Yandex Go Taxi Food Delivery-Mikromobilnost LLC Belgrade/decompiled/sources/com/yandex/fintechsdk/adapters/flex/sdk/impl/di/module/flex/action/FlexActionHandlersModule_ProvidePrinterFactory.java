package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.q5z;
import defpackage.t5x;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexActionHandlersModule_ProvidePrinterFactory implements v7p {
    private final FlexActionHandlersModule module;

    private FlexActionHandlersModule_ProvidePrinterFactory(FlexActionHandlersModule flexActionHandlersModule) {
        this.module = flexActionHandlersModule;
    }

    public static FlexActionHandlersModule_ProvidePrinterFactory create(FlexActionHandlersModule flexActionHandlersModule) {
        return new FlexActionHandlersModule_ProvidePrinterFactory(flexActionHandlersModule);
    }

    public static t5x providePrinter(FlexActionHandlersModule flexActionHandlersModule) {
        t5x providePrinter = flexActionHandlersModule.providePrinter();
        q5z.i(providePrinter);
        return providePrinter;
    }

    @Override // defpackage.yvf0
    public t5x get() {
        return providePrinter(this.module);
    }
}
