package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.animation;

import defpackage.ch2;
import defpackage.fj2;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexAnimationsModule_ProvideAnimationSerializerSelectorFactory implements v7p {
    private final xvf0 animationDecoderFactoryProvider;
    private final FlexAnimationsModule module;

    private FlexAnimationsModule_ProvideAnimationSerializerSelectorFactory(FlexAnimationsModule flexAnimationsModule, xvf0 xvf0Var) {
        this.module = flexAnimationsModule;
        this.animationDecoderFactoryProvider = xvf0Var;
    }

    public static FlexAnimationsModule_ProvideAnimationSerializerSelectorFactory create(FlexAnimationsModule flexAnimationsModule, xvf0 xvf0Var) {
        return new FlexAnimationsModule_ProvideAnimationSerializerSelectorFactory(flexAnimationsModule, xvf0Var);
    }

    public static fj2 provideAnimationSerializerSelector(FlexAnimationsModule flexAnimationsModule, ch2 ch2Var) {
        fj2 provideAnimationSerializerSelector = flexAnimationsModule.provideAnimationSerializerSelector(ch2Var);
        q5z.i(provideAnimationSerializerSelector);
        return provideAnimationSerializerSelector;
    }

    @Override // defpackage.yvf0
    public fj2 get() {
        return provideAnimationSerializerSelector(this.module, (ch2) this.animationDecoderFactoryProvider.get());
    }
}
