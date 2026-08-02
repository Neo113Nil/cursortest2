package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex;

import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.DocumentEngineCreatorHolder;
import defpackage.p85;
import defpackage.q5z;
import defpackage.ukr;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexNavigationModule_ProvideFlexOverlayControllerFactoryFactory implements v7p {
    private final xvf0 activityProvider;
    private final xvf0 documentEngineCreatorHolderProvider;
    private final xvf0 flexDependenciesProvider;
    private final FlexNavigationModule module;

    private FlexNavigationModule_ProvideFlexOverlayControllerFactoryFactory(FlexNavigationModule flexNavigationModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.module = flexNavigationModule;
        this.activityProvider = xvf0Var;
        this.documentEngineCreatorHolderProvider = xvf0Var2;
        this.flexDependenciesProvider = xvf0Var3;
    }

    public static FlexNavigationModule_ProvideFlexOverlayControllerFactoryFactory create(FlexNavigationModule flexNavigationModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        return new FlexNavigationModule_ProvideFlexOverlayControllerFactoryFactory(flexNavigationModule, xvf0Var, xvf0Var2, xvf0Var3);
    }

    public static ukr provideFlexOverlayControllerFactory(FlexNavigationModule flexNavigationModule, p85 p85Var, DocumentEngineCreatorHolder documentEngineCreatorHolder, FlexDependencies flexDependencies) {
        ukr provideFlexOverlayControllerFactory = flexNavigationModule.provideFlexOverlayControllerFactory(p85Var, documentEngineCreatorHolder, flexDependencies);
        q5z.i(provideFlexOverlayControllerFactory);
        return provideFlexOverlayControllerFactory;
    }

    @Override // defpackage.yvf0
    public ukr get() {
        return provideFlexOverlayControllerFactory(this.module, (p85) this.activityProvider.get(), (DocumentEngineCreatorHolder) this.documentEngineCreatorHolderProvider.get(), (FlexDependencies) this.flexDependenciesProvider.get());
    }
}
