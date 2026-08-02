package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.q5z;
import defpackage.r1m;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexDocumentParserExtensionsModule_ProvideRemoteActionParserExtensionFactory implements v7p {
    private final FlexDocumentParserExtensionsModule module;

    private FlexDocumentParserExtensionsModule_ProvideRemoteActionParserExtensionFactory(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule) {
        this.module = flexDocumentParserExtensionsModule;
    }

    public static FlexDocumentParserExtensionsModule_ProvideRemoteActionParserExtensionFactory create(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule) {
        return new FlexDocumentParserExtensionsModule_ProvideRemoteActionParserExtensionFactory(flexDocumentParserExtensionsModule);
    }

    public static r1m provideRemoteActionParserExtension(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule) {
        r1m provideRemoteActionParserExtension = flexDocumentParserExtensionsModule.provideRemoteActionParserExtension();
        q5z.i(provideRemoteActionParserExtension);
        return provideRemoteActionParserExtension;
    }

    @Override // defpackage.yvf0
    public r1m get() {
        return provideRemoteActionParserExtension(this.module);
    }
}
