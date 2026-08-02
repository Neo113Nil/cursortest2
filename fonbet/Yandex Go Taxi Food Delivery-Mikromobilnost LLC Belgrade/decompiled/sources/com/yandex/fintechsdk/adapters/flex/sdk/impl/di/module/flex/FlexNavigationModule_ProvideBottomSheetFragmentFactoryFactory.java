package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.DocumentEngineCreatorHolder;
import defpackage.cjh;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexNavigationModule_ProvideBottomSheetFragmentFactoryFactory implements v7p {
    private final xvf0 documentEngineCreatorHolderProvider;
    private final FlexNavigationModule module;

    private FlexNavigationModule_ProvideBottomSheetFragmentFactoryFactory(FlexNavigationModule flexNavigationModule, xvf0 xvf0Var) {
        this.module = flexNavigationModule;
        this.documentEngineCreatorHolderProvider = xvf0Var;
    }

    public static FlexNavigationModule_ProvideBottomSheetFragmentFactoryFactory create(FlexNavigationModule flexNavigationModule, xvf0 xvf0Var) {
        return new FlexNavigationModule_ProvideBottomSheetFragmentFactoryFactory(flexNavigationModule, xvf0Var);
    }

    public static cjh provideBottomSheetFragmentFactory(FlexNavigationModule flexNavigationModule, DocumentEngineCreatorHolder documentEngineCreatorHolder) {
        cjh provideBottomSheetFragmentFactory = flexNavigationModule.provideBottomSheetFragmentFactory(documentEngineCreatorHolder);
        q5z.i(provideBottomSheetFragmentFactory);
        return provideBottomSheetFragmentFactory;
    }

    @Override // defpackage.yvf0
    public cjh get() {
        return provideBottomSheetFragmentFactory(this.module, (DocumentEngineCreatorHolder) this.documentEngineCreatorHolderProvider.get());
    }
}
