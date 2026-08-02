package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.animation;

import defpackage.ch2;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexAnimationsModule_ProvideAnimationDecoderFactoryFactory implements v7p {
    private final FlexAnimationsModule module;

    private FlexAnimationsModule_ProvideAnimationDecoderFactoryFactory(FlexAnimationsModule flexAnimationsModule) {
        this.module = flexAnimationsModule;
    }

    public static FlexAnimationsModule_ProvideAnimationDecoderFactoryFactory create(FlexAnimationsModule flexAnimationsModule) {
        return new FlexAnimationsModule_ProvideAnimationDecoderFactoryFactory(flexAnimationsModule);
    }

    public static ch2 provideAnimationDecoderFactory(FlexAnimationsModule flexAnimationsModule) {
        ch2 provideAnimationDecoderFactory = flexAnimationsModule.provideAnimationDecoderFactory();
        q5z.i(provideAnimationDecoderFactory);
        return provideAnimationDecoderFactory;
    }

    @Override // defpackage.yvf0
    public ch2 get() {
        return provideAnimationDecoderFactory(this.module);
    }
}
