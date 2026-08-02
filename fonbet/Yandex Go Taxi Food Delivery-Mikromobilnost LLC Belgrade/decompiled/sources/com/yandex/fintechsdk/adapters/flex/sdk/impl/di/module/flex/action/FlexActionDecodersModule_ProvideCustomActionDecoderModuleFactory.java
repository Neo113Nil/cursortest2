package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import defpackage.kg5;
import defpackage.lu;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;
import java.util.List;

/* loaded from: classes10.dex */
public final class FlexActionDecodersModule_ProvideCustomActionDecoderModuleFactory implements v7p {
    private final xvf0 actionsInfoProvider;
    private final FlexActionDecodersModule module;

    private FlexActionDecodersModule_ProvideCustomActionDecoderModuleFactory(FlexActionDecodersModule flexActionDecodersModule, xvf0 xvf0Var) {
        this.module = flexActionDecodersModule;
        this.actionsInfoProvider = xvf0Var;
    }

    public static FlexActionDecodersModule_ProvideCustomActionDecoderModuleFactory create(FlexActionDecodersModule flexActionDecodersModule, xvf0 xvf0Var) {
        return new FlexActionDecodersModule_ProvideCustomActionDecoderModuleFactory(flexActionDecodersModule, xvf0Var);
    }

    public static lu provideCustomActionDecoderModule(FlexActionDecodersModule flexActionDecodersModule, List<kg5> list) {
        lu provideCustomActionDecoderModule = flexActionDecodersModule.provideCustomActionDecoderModule(list);
        q5z.i(provideCustomActionDecoderModule);
        return provideCustomActionDecoderModule;
    }

    @Override // defpackage.yvf0
    public lu get() {
        return provideCustomActionDecoderModule(this.module, (List) this.actionsInfoProvider.get());
    }
}
