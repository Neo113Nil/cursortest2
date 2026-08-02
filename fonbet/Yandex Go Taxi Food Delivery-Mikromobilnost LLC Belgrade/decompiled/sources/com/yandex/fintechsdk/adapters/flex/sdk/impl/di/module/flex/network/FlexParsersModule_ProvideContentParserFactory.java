package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.ihe;
import defpackage.phe;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexParsersModule_ProvideContentParserFactory implements v7p {
    private final FlexParsersModule module;
    private final xvf0 serializerSelectorProvider;

    private FlexParsersModule_ProvideContentParserFactory(FlexParsersModule flexParsersModule, xvf0 xvf0Var) {
        this.module = flexParsersModule;
        this.serializerSelectorProvider = xvf0Var;
    }

    public static FlexParsersModule_ProvideContentParserFactory create(FlexParsersModule flexParsersModule, xvf0 xvf0Var) {
        return new FlexParsersModule_ProvideContentParserFactory(flexParsersModule, xvf0Var);
    }

    public static ihe provideContentParser(FlexParsersModule flexParsersModule, phe pheVar) {
        ihe provideContentParser = flexParsersModule.provideContentParser(pheVar);
        q5z.i(provideContentParser);
        return provideContentParser;
    }

    @Override // defpackage.yvf0
    public ihe get() {
        return provideContentParser(this.module, (phe) this.serializerSelectorProvider.get());
    }
}
