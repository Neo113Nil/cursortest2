package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.lu;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexActionDecodersModule_ProvideTemplatedActionDecoderModuleFactory implements v7p {
    private final FlexActionDecodersModule module;

    private FlexActionDecodersModule_ProvideTemplatedActionDecoderModuleFactory(FlexActionDecodersModule flexActionDecodersModule) {
        this.module = flexActionDecodersModule;
    }

    public static FlexActionDecodersModule_ProvideTemplatedActionDecoderModuleFactory create(FlexActionDecodersModule flexActionDecodersModule) {
        return new FlexActionDecodersModule_ProvideTemplatedActionDecoderModuleFactory(flexActionDecodersModule);
    }

    public static lu provideTemplatedActionDecoderModule(FlexActionDecodersModule flexActionDecodersModule) {
        lu provideTemplatedActionDecoderModule = flexActionDecodersModule.provideTemplatedActionDecoderModule();
        q5z.i(provideTemplatedActionDecoderModule);
        return provideTemplatedActionDecoderModule;
    }

    @Override // defpackage.yvf0
    public lu get() {
        return provideTemplatedActionDecoderModule(this.module);
    }
}
