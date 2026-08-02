package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.q5z;
import defpackage.r1m;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.zw;

/* loaded from: classes10.dex */
public final class FlexDocumentParserExtensionsModule_ProvideNestedActionParserExtensionFactory implements v7p {
    private final xvf0 actionParserProvider;
    private final FlexDocumentParserExtensionsModule module;

    private FlexDocumentParserExtensionsModule_ProvideNestedActionParserExtensionFactory(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, xvf0 xvf0Var) {
        this.module = flexDocumentParserExtensionsModule;
        this.actionParserProvider = xvf0Var;
    }

    public static FlexDocumentParserExtensionsModule_ProvideNestedActionParserExtensionFactory create(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, xvf0 xvf0Var) {
        return new FlexDocumentParserExtensionsModule_ProvideNestedActionParserExtensionFactory(flexDocumentParserExtensionsModule, xvf0Var);
    }

    public static r1m provideNestedActionParserExtension(FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, zw zwVar) {
        r1m provideNestedActionParserExtension = flexDocumentParserExtensionsModule.provideNestedActionParserExtension(zwVar);
        q5z.i(provideNestedActionParserExtension);
        return provideNestedActionParserExtension;
    }

    @Override // defpackage.yvf0
    public r1m get() {
        return provideNestedActionParserExtension(this.module, (zw) this.actionParserProvider.get());
    }
}
