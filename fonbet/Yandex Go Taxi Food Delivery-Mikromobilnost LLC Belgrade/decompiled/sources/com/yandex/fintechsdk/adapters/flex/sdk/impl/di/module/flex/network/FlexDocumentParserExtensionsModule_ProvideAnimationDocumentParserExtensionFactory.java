package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.fj2;
import defpackage.q5z;
import defpackage.r1m;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexDocumentParserExtensionsModule_ProvideAnimationDocumentParserExtensionFactory implements v7p {
    private final xvf0 animationSerializerSelectorProvider;
    private final FlexDocumentParserExtensionsModule module;

    private FlexDocumentParserExtensionsModule_ProvideAnimationDocumentParserExtensionFactory(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, xvf0 xvf0Var) {
        this.module = flexDocumentParserExtensionsModule;
        this.animationSerializerSelectorProvider = xvf0Var;
    }

    public static FlexDocumentParserExtensionsModule_ProvideAnimationDocumentParserExtensionFactory create(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, xvf0 xvf0Var) {
        return new FlexDocumentParserExtensionsModule_ProvideAnimationDocumentParserExtensionFactory(flexDocumentParserExtensionsModule, xvf0Var);
    }

    public static r1m provideAnimationDocumentParserExtension(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, fj2 fj2Var) {
        r1m provideAnimationDocumentParserExtension = flexDocumentParserExtensionsModule.provideAnimationDocumentParserExtension(fj2Var);
        q5z.i(provideAnimationDocumentParserExtension);
        return provideAnimationDocumentParserExtension;
    }

    @Override // defpackage.yvf0
    public r1m get() {
        return provideAnimationDocumentParserExtension(this.module, (fj2) this.animationSerializerSelectorProvider.get());
    }
}
