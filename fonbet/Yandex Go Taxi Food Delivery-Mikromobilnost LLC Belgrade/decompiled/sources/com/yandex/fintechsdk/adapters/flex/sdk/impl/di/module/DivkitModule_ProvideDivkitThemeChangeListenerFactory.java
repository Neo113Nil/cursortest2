package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import com.yandex.div.core.expression.variables.a;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class DivkitModule_ProvideDivkitThemeChangeListenerFactory implements v7p {
    private final DivkitModule module;
    private final xvf0 variableControllerProvider;

    private DivkitModule_ProvideDivkitThemeChangeListenerFactory(DivkitModule divkitModule, xvf0 xvf0Var) {
        this.module = divkitModule;
        this.variableControllerProvider = xvf0Var;
    }

    public static DivkitModule_ProvideDivkitThemeChangeListenerFactory create(DivkitModule divkitModule, xvf0 xvf0Var) {
        return new DivkitModule_ProvideDivkitThemeChangeListenerFactory(divkitModule, xvf0Var);
    }

    public static DivkitThemeChangeListener provideDivkitThemeChangeListener(DivkitModule divkitModule, a aVar) {
        DivkitThemeChangeListener provideDivkitThemeChangeListener = divkitModule.provideDivkitThemeChangeListener(aVar);
        q5z.i(provideDivkitThemeChangeListener);
        return provideDivkitThemeChangeListener;
    }

    @Override // defpackage.yvf0
    public DivkitThemeChangeListener get() {
        return provideDivkitThemeChangeListener(this.module, (a) this.variableControllerProvider.get());
    }
}
