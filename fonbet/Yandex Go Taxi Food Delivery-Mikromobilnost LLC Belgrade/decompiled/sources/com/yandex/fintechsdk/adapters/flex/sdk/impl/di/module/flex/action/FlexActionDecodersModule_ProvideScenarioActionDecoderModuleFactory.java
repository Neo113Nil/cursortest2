package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.lu;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexActionDecodersModule_ProvideScenarioActionDecoderModuleFactory implements v7p {
    private final FlexActionDecodersModule module;

    private FlexActionDecodersModule_ProvideScenarioActionDecoderModuleFactory(FlexActionDecodersModule flexActionDecodersModule) {
        this.module = flexActionDecodersModule;
    }

    public static FlexActionDecodersModule_ProvideScenarioActionDecoderModuleFactory create(FlexActionDecodersModule flexActionDecodersModule) {
        return new FlexActionDecodersModule_ProvideScenarioActionDecoderModuleFactory(flexActionDecodersModule);
    }

    public static lu provideScenarioActionDecoderModule(FlexActionDecodersModule flexActionDecodersModule) {
        lu provideScenarioActionDecoderModule = flexActionDecodersModule.provideScenarioActionDecoderModule();
        q5z.i(provideScenarioActionDecoderModule);
        return provideScenarioActionDecoderModule;
    }

    @Override // defpackage.yvf0
    public lu get() {
        return provideScenarioActionDecoderModule(this.module);
    }
}
