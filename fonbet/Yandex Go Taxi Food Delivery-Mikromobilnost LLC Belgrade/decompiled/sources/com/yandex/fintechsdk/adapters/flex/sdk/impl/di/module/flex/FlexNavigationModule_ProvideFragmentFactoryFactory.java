package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.DocumentEngineCreatorHolder;
import defpackage.ejh;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexNavigationModule_ProvideFragmentFactoryFactory implements v7p {
    private final xvf0 documentEngineCreatorHolderProvider;
    private final FlexNavigationModule module;

    private FlexNavigationModule_ProvideFragmentFactoryFactory(FlexNavigationModule flexNavigationModule, xvf0 xvf0Var) {
        this.module = flexNavigationModule;
        this.documentEngineCreatorHolderProvider = xvf0Var;
    }

    public static FlexNavigationModule_ProvideFragmentFactoryFactory create(FlexNavigationModule flexNavigationModule, xvf0 xvf0Var) {
        return new FlexNavigationModule_ProvideFragmentFactoryFactory(flexNavigationModule, xvf0Var);
    }

    public static ejh provideFragmentFactory(FlexNavigationModule flexNavigationModule, DocumentEngineCreatorHolder documentEngineCreatorHolder) {
        ejh provideFragmentFactory = flexNavigationModule.provideFragmentFactory(documentEngineCreatorHolder);
        q5z.i(provideFragmentFactory);
        return provideFragmentFactory;
    }

    @Override // defpackage.yvf0
    public ejh get() {
        return provideFragmentFactory(this.module, (DocumentEngineCreatorHolder) this.documentEngineCreatorHolderProvider.get());
    }
}
