package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.lu;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexActionDecodersModule_ProvideTimedActionDecoderModuleFactory implements v7p {
    private final FlexActionDecodersModule module;

    private FlexActionDecodersModule_ProvideTimedActionDecoderModuleFactory(FlexActionDecodersModule flexActionDecodersModule) {
        this.module = flexActionDecodersModule;
    }

    public static FlexActionDecodersModule_ProvideTimedActionDecoderModuleFactory create(FlexActionDecodersModule flexActionDecodersModule) {
        return new FlexActionDecodersModule_ProvideTimedActionDecoderModuleFactory(flexActionDecodersModule);
    }

    public static lu provideTimedActionDecoderModule(FlexActionDecodersModule flexActionDecodersModule) {
        lu provideTimedActionDecoderModule = flexActionDecodersModule.provideTimedActionDecoderModule();
        q5z.i(provideTimedActionDecoderModule);
        return provideTimedActionDecoderModule;
    }

    @Override // defpackage.yvf0
    public lu get() {
        return provideTimedActionDecoderModule(this.module);
    }
}
