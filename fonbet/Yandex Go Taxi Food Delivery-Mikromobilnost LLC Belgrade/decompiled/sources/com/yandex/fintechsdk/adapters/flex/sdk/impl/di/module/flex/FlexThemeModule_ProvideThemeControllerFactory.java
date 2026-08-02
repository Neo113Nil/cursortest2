package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.pvy0;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.vh5;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexThemeModule_ProvideThemeControllerFactory implements v7p {
    private final FlexThemeModule module;
    private final xvf0 themeChangeListenerProvider;
    private final xvf0 themeProvider;

    private FlexThemeModule_ProvideThemeControllerFactory(FlexThemeModule flexThemeModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = flexThemeModule;
        this.themeProvider = xvf0Var;
        this.themeChangeListenerProvider = xvf0Var2;
    }

    public static FlexThemeModule_ProvideThemeControllerFactory create(FlexThemeModule flexThemeModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new FlexThemeModule_ProvideThemeControllerFactory(flexThemeModule, xvf0Var, xvf0Var2);
    }

    public static pvy0 provideThemeController(FlexThemeModule flexThemeModule, vh5 vh5Var, DivkitThemeChangeListener divkitThemeChangeListener) {
        pvy0 provideThemeController = flexThemeModule.provideThemeController(vh5Var, divkitThemeChangeListener);
        q5z.i(provideThemeController);
        return provideThemeController;
    }

    @Override // defpackage.yvf0
    public pvy0 get() {
        return provideThemeController(this.module, (vh5) this.themeProvider.get(), (DivkitThemeChangeListener) this.themeChangeListenerProvider.get());
    }
}
