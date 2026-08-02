package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import defpackage.q5z;
import defpackage.v7p;
import defpackage.wjr;

/* loaded from: classes10.dex */
public final class FlexModule_ProvideLogHandlerFactory implements v7p {
    private final FlexModule module;

    private FlexModule_ProvideLogHandlerFactory(FlexModule flexModule) {
        this.module = flexModule;
    }

    public static FlexModule_ProvideLogHandlerFactory create(FlexModule flexModule) {
        return new FlexModule_ProvideLogHandlerFactory(flexModule);
    }

    public static wjr provideLogHandler(FlexModule flexModule) {
        wjr provideLogHandler = flexModule.provideLogHandler();
        q5z.i(provideLogHandler);
        return provideLogHandler;
    }

    @Override // defpackage.yvf0
    public wjr get() {
        return provideLogHandler(this.module);
    }
}
