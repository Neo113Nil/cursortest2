package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.q5z;
import defpackage.r1m;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexDocumentParserExtensionsModule_ProvideJasonStateParserExtensionFactory implements v7p {
    private final FlexDocumentParserExtensionsModule module;

    private FlexDocumentParserExtensionsModule_ProvideJasonStateParserExtensionFactory(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule) {
        this.module = flexDocumentParserExtensionsModule;
    }

    public static FlexDocumentParserExtensionsModule_ProvideJasonStateParserExtensionFactory create(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule) {
        return new FlexDocumentParserExtensionsModule_ProvideJasonStateParserExtensionFactory(flexDocumentParserExtensionsModule);
    }

    public static r1m provideJasonStateParserExtension(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule) {
        r1m provideJasonStateParserExtension = flexDocumentParserExtensionsModule.provideJasonStateParserExtension();
        q5z.i(provideJasonStateParserExtension);
        return provideJasonStateParserExtension;
    }

    @Override // defpackage.yvf0
    public r1m get() {
        return provideJasonStateParserExtension(this.module);
    }
}
