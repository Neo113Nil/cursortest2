package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import android.content.Context;
import defpackage.mwl;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class DivkitModule_ProvideDivkitTypefaceProviderFactory implements v7p {
    private final xvf0 contextProvider;
    private final DivkitModule module;

    private DivkitModule_ProvideDivkitTypefaceProviderFactory(DivkitModule divkitModule, xvf0 xvf0Var) {
        this.module = divkitModule;
        this.contextProvider = xvf0Var;
    }

    public static DivkitModule_ProvideDivkitTypefaceProviderFactory create(DivkitModule divkitModule, xvf0 xvf0Var) {
        return new DivkitModule_ProvideDivkitTypefaceProviderFactory(divkitModule, xvf0Var);
    }

    public static mwl provideDivkitTypefaceProvider(DivkitModule divkitModule, Context context) {
        mwl provideDivkitTypefaceProvider = divkitModule.provideDivkitTypefaceProvider(context);
        q5z.i(provideDivkitTypefaceProvider);
        return provideDivkitTypefaceProvider;
    }

    @Override // defpackage.yvf0
    public mwl get() {
        return provideDivkitTypefaceProvider(this.module, (Context) this.contextProvider.get());
    }
}
