package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.lu;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexActionDecodersModule_ProvideListActionDecoderModuleFactory implements v7p {
    private final FlexActionDecodersModule module;

    private FlexActionDecodersModule_ProvideListActionDecoderModuleFactory(FlexActionDecodersModule flexActionDecodersModule) {
        this.module = flexActionDecodersModule;
    }

    public static FlexActionDecodersModule_ProvideListActionDecoderModuleFactory create(FlexActionDecodersModule flexActionDecodersModule) {
        return new FlexActionDecodersModule_ProvideListActionDecoderModuleFactory(flexActionDecodersModule);
    }

    public static lu provideListActionDecoderModule(FlexActionDecodersModule flexActionDecodersModule) {
        lu provideListActionDecoderModule = flexActionDecodersModule.provideListActionDecoderModule();
        q5z.i(provideListActionDecoderModule);
        return provideListActionDecoderModule;
    }

    @Override // defpackage.yvf0
    public lu get() {
        return provideListActionDecoderModule(this.module);
    }
}
