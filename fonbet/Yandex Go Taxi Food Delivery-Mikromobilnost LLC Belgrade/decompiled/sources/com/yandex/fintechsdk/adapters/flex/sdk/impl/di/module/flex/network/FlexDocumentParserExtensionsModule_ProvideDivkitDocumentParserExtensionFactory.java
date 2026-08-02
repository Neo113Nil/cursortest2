package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.hxk;
import defpackage.q5z;
import defpackage.r1m;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexDocumentParserExtensionsModule_ProvideDivkitDocumentParserExtensionFactory implements v7p {
    private final xvf0 divKitProvider;
    private final FlexDocumentParserExtensionsModule module;

    private FlexDocumentParserExtensionsModule_ProvideDivkitDocumentParserExtensionFactory(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, xvf0 xvf0Var) {
        this.module = flexDocumentParserExtensionsModule;
        this.divKitProvider = xvf0Var;
    }

    public static FlexDocumentParserExtensionsModule_ProvideDivkitDocumentParserExtensionFactory create(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, xvf0 xvf0Var) {
        return new FlexDocumentParserExtensionsModule_ProvideDivkitDocumentParserExtensionFactory(flexDocumentParserExtensionsModule, xvf0Var);
    }

    public static r1m provideDivkitDocumentParserExtension(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, hxk hxkVar) {
        r1m provideDivkitDocumentParserExtension = flexDocumentParserExtensionsModule.provideDivkitDocumentParserExtension(hxkVar);
        q5z.i(provideDivkitDocumentParserExtension);
        return provideDivkitDocumentParserExtension;
    }

    @Override // defpackage.yvf0
    public r1m get() {
        return provideDivkitDocumentParserExtension(this.module, (hxk) this.divKitProvider.get());
    }
}
