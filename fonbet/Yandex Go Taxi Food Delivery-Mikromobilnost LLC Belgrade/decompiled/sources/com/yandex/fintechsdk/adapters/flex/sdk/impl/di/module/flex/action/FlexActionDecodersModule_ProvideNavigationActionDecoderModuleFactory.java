package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.lu;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexActionDecodersModule_ProvideNavigationActionDecoderModuleFactory implements v7p {
    private final FlexActionDecodersModule module;

    private FlexActionDecodersModule_ProvideNavigationActionDecoderModuleFactory(FlexActionDecodersModule flexActionDecodersModule) {
        this.module = flexActionDecodersModule;
    }

    public static FlexActionDecodersModule_ProvideNavigationActionDecoderModuleFactory create(FlexActionDecodersModule flexActionDecodersModule) {
        return new FlexActionDecodersModule_ProvideNavigationActionDecoderModuleFactory(flexActionDecodersModule);
    }

    public static lu provideNavigationActionDecoderModule(FlexActionDecodersModule flexActionDecodersModule) {
        lu provideNavigationActionDecoderModule = flexActionDecodersModule.provideNavigationActionDecoderModule();
        q5z.i(provideNavigationActionDecoderModule);
        return provideNavigationActionDecoderModule;
    }

    @Override // defpackage.yvf0
    public lu get() {
        return provideNavigationActionDecoderModule(this.module);
    }
}
