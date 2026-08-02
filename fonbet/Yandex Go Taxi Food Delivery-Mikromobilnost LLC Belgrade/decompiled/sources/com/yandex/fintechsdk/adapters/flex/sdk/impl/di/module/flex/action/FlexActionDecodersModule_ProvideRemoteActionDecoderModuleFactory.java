package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.lu;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexActionDecodersModule_ProvideRemoteActionDecoderModuleFactory implements v7p {
    private final FlexActionDecodersModule module;

    private FlexActionDecodersModule_ProvideRemoteActionDecoderModuleFactory(FlexActionDecodersModule flexActionDecodersModule) {
        this.module = flexActionDecodersModule;
    }

    public static FlexActionDecodersModule_ProvideRemoteActionDecoderModuleFactory create(FlexActionDecodersModule flexActionDecodersModule) {
        return new FlexActionDecodersModule_ProvideRemoteActionDecoderModuleFactory(flexActionDecodersModule);
    }

    public static lu provideRemoteActionDecoderModule(FlexActionDecodersModule flexActionDecodersModule) {
        lu provideRemoteActionDecoderModule = flexActionDecodersModule.provideRemoteActionDecoderModule();
        q5z.i(provideRemoteActionDecoderModule);
        return provideRemoteActionDecoderModule;
    }

    @Override // defpackage.yvf0
    public lu get() {
        return provideRemoteActionDecoderModule(this.module);
    }
}
