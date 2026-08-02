package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.DocumentEngineCreatorHolder;
import defpackage.djh;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexNavigationModule_ProvideDialogFragmentFactoryFactory implements v7p {
    private final xvf0 documentEngineCreatorHolderProvider;
    private final FlexNavigationModule module;

    private FlexNavigationModule_ProvideDialogFragmentFactoryFactory(FlexNavigationModule flexNavigationModule, xvf0 xvf0Var) {
        this.module = flexNavigationModule;
        this.documentEngineCreatorHolderProvider = xvf0Var;
    }

    public static FlexNavigationModule_ProvideDialogFragmentFactoryFactory create(FlexNavigationModule flexNavigationModule, xvf0 xvf0Var) {
        return new FlexNavigationModule_ProvideDialogFragmentFactoryFactory(flexNavigationModule, xvf0Var);
    }

    public static djh provideDialogFragmentFactory(FlexNavigationModule flexNavigationModule, DocumentEngineCreatorHolder documentEngineCreatorHolder) {
        djh provideDialogFragmentFactory = flexNavigationModule.provideDialogFragmentFactory(documentEngineCreatorHolder);
        q5z.i(provideDialogFragmentFactory);
        return provideDialogFragmentFactory;
    }

    @Override // defpackage.yvf0
    public djh get() {
        return provideDialogFragmentFactory(this.module, (DocumentEngineCreatorHolder) this.documentEngineCreatorHolderProvider.get());
    }
}
