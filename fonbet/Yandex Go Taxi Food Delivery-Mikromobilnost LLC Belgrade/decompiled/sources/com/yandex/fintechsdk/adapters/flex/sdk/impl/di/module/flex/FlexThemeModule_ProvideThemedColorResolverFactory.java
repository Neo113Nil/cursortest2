package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex;

import defpackage.exy0;
import defpackage.pvy0;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexThemeModule_ProvideThemedColorResolverFactory implements v7p {
    private final FlexThemeModule module;
    private final xvf0 themeControllerProvider;

    private FlexThemeModule_ProvideThemedColorResolverFactory(FlexThemeModule flexThemeModule, xvf0 xvf0Var) {
        this.module = flexThemeModule;
        this.themeControllerProvider = xvf0Var;
    }

    public static FlexThemeModule_ProvideThemedColorResolverFactory create(FlexThemeModule flexThemeModule, xvf0 xvf0Var) {
        return new FlexThemeModule_ProvideThemedColorResolverFactory(flexThemeModule, xvf0Var);
    }

    public static exy0 provideThemedColorResolver(FlexThemeModule flexThemeModule, pvy0 pvy0Var) {
        exy0 provideThemedColorResolver = flexThemeModule.provideThemedColorResolver(pvy0Var);
        q5z.i(provideThemedColorResolver);
        return provideThemedColorResolver;
    }

    @Override // defpackage.yvf0
    public exy0 get() {
        return provideThemedColorResolver(this.module, (pvy0) this.themeControllerProvider.get());
    }
}
