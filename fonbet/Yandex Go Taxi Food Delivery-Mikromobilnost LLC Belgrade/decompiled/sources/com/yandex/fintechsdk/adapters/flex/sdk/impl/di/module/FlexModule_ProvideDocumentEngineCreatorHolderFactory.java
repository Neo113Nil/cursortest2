package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.DocumentEngineCreatorHolder;
import defpackage.i3m;
import defpackage.m0m;
import defpackage.p85;
import defpackage.q5z;
import defpackage.ryw;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yu;
import defpackage.yvf0;

/* loaded from: classes10.dex */
public final class FlexModule_ProvideDocumentEngineCreatorHolderFactory implements v7p {
    private final xvf0 actionDispatcherFactoryProvider;
    private final xvf0 contentControllerAdapterProvider;
    private final xvf0 documentLoaderProvider;
    private final xvf0 documentTrackerProvider;
    private final xvf0 flexDependenciesProvider;
    private final xvf0 isEngineErrorViewEnabledProvider;
    private final FlexModule module;
    private final xvf0 routerProvider;
    private final xvf0 scaffoldControllerAdapterProvider;

    private FlexModule_ProvideDocumentEngineCreatorHolderFactory(FlexModule flexModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8) {
        this.module = flexModule;
        this.actionDispatcherFactoryProvider = xvf0Var;
        this.contentControllerAdapterProvider = xvf0Var2;
        this.documentLoaderProvider = xvf0Var3;
        this.documentTrackerProvider = xvf0Var4;
        this.flexDependenciesProvider = xvf0Var5;
        this.isEngineErrorViewEnabledProvider = xvf0Var6;
        this.routerProvider = xvf0Var7;
        this.scaffoldControllerAdapterProvider = xvf0Var8;
    }

    public static FlexModule_ProvideDocumentEngineCreatorHolderFactory create(FlexModule flexModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8) {
        return new FlexModule_ProvideDocumentEngineCreatorHolderFactory(flexModule, xvf0Var, xvf0Var2, xvf0Var3, xvf0Var4, xvf0Var5, xvf0Var6, xvf0Var7, xvf0Var8);
    }

    public static DocumentEngineCreatorHolder provideDocumentEngineCreatorHolder(FlexModule flexModule, yu yuVar, yvf0 yvf0Var, m0m m0mVar, i3m i3mVar, FlexDependencies flexDependencies, ryw rywVar, p85 p85Var, yvf0 yvf0Var2) {
        DocumentEngineCreatorHolder provideDocumentEngineCreatorHolder = flexModule.provideDocumentEngineCreatorHolder(yuVar, yvf0Var, m0mVar, i3mVar, flexDependencies, rywVar, p85Var, yvf0Var2);
        q5z.i(provideDocumentEngineCreatorHolder);
        return provideDocumentEngineCreatorHolder;
    }

    @Override // defpackage.yvf0
    public DocumentEngineCreatorHolder get() {
        return provideDocumentEngineCreatorHolder(this.module, (yu) this.actionDispatcherFactoryProvider.get(), this.contentControllerAdapterProvider, (m0m) this.documentLoaderProvider.get(), (i3m) this.documentTrackerProvider.get(), (FlexDependencies) this.flexDependenciesProvider.get(), (ryw) this.isEngineErrorViewEnabledProvider.get(), (p85) this.routerProvider.get(), this.scaffoldControllerAdapterProvider);
    }
}
