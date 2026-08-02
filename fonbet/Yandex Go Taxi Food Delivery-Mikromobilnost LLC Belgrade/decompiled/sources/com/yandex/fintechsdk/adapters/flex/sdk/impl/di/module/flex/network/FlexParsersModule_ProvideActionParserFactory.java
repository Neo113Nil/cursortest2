package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.cy;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.zw;

/* loaded from: classes10.dex */
public final class FlexParsersModule_ProvideActionParserFactory implements v7p {
    private final xvf0 actionSerializerSelectorProvider;
    private final FlexParsersModule module;

    private FlexParsersModule_ProvideActionParserFactory(FlexParsersModule flexParsersModule, xvf0 xvf0Var) {
        this.module = flexParsersModule;
        this.actionSerializerSelectorProvider = xvf0Var;
    }

    public static FlexParsersModule_ProvideActionParserFactory create(FlexParsersModule flexParsersModule, xvf0 xvf0Var) {
        return new FlexParsersModule_ProvideActionParserFactory(flexParsersModule, xvf0Var);
    }

    public static zw provideActionParser(FlexParsersModule flexParsersModule, cy cyVar) {
        zw provideActionParser = flexParsersModule.provideActionParser(cyVar);
        q5z.i(provideActionParser);
        return provideActionParser;
    }

    @Override // defpackage.yvf0
    public zw get() {
        return provideActionParser(this.module, (cy) this.actionSerializerSelectorProvider.get());
    }
}
