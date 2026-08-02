package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.lu;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexActionDecodersModule_ProvideDocumentActionDecoderModuleFactory implements v7p {
    private final FlexActionDecodersModule module;

    private FlexActionDecodersModule_ProvideDocumentActionDecoderModuleFactory(FlexActionDecodersModule flexActionDecodersModule) {
        this.module = flexActionDecodersModule;
    }

    public static FlexActionDecodersModule_ProvideDocumentActionDecoderModuleFactory create(FlexActionDecodersModule flexActionDecodersModule) {
        return new FlexActionDecodersModule_ProvideDocumentActionDecoderModuleFactory(flexActionDecodersModule);
    }

    public static lu provideDocumentActionDecoderModule(FlexActionDecodersModule flexActionDecodersModule) {
        lu provideDocumentActionDecoderModule = flexActionDecodersModule.provideDocumentActionDecoderModule();
        q5z.i(provideDocumentActionDecoderModule);
        return provideDocumentActionDecoderModule;
    }

    @Override // defpackage.yvf0
    public lu get() {
        return provideDocumentActionDecoderModule(this.module);
    }
}
