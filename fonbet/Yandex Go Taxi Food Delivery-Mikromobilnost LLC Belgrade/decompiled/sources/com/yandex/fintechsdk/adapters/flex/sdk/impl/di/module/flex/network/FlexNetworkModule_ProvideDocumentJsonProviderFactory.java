package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.d0m;
import defpackage.ekm0;
import defpackage.enr0;
import defpackage.ihe;
import defpackage.q5z;
import defpackage.r1m;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.zw;
import java.util.Set;

/* loaded from: classes10.dex */
public final class FlexNetworkModule_ProvideDocumentJsonProviderFactory implements v7p {
    private final xvf0 actionParserProvider;
    private final xvf0 contentParserProvider;
    private final xvf0 documentParserExtensionsProvider;
    private final FlexNetworkModule module;
    private final xvf0 scaffoldParserProvider;
    private final xvf0 sharedDataParserProvider;

    private FlexNetworkModule_ProvideDocumentJsonProviderFactory(FlexNetworkModule flexNetworkModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.module = flexNetworkModule;
        this.contentParserProvider = xvf0Var;
        this.scaffoldParserProvider = xvf0Var2;
        this.actionParserProvider = xvf0Var3;
        this.sharedDataParserProvider = xvf0Var4;
        this.documentParserExtensionsProvider = xvf0Var5;
    }

    public static FlexNetworkModule_ProvideDocumentJsonProviderFactory create(FlexNetworkModule flexNetworkModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        return new FlexNetworkModule_ProvideDocumentJsonProviderFactory(flexNetworkModule, xvf0Var, xvf0Var2, xvf0Var3, xvf0Var4, xvf0Var5);
    }

    public static d0m provideDocumentJsonProvider(FlexNetworkModule flexNetworkModule, ihe iheVar, ekm0 ekm0Var, zw zwVar, enr0 enr0Var, Set<r1m> set) {
        d0m provideDocumentJsonProvider = flexNetworkModule.provideDocumentJsonProvider(iheVar, ekm0Var, zwVar, enr0Var, set);
        q5z.i(provideDocumentJsonProvider);
        return provideDocumentJsonProvider;
    }

    @Override // defpackage.yvf0
    public d0m get() {
        return provideDocumentJsonProvider(this.module, (ihe) this.contentParserProvider.get(), (ekm0) this.scaffoldParserProvider.get(), (zw) this.actionParserProvider.get(), (enr0) this.sharedDataParserProvider.get(), (Set) this.documentParserExtensionsProvider.get());
    }
}
