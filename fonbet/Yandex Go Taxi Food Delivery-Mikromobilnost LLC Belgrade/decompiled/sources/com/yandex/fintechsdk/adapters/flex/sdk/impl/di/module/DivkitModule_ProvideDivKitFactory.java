package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import android.content.Context;
import defpackage.hxk;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class DivkitModule_ProvideDivKitFactory implements v7p {
    private final xvf0 contextProvider;
    private final DivkitModule module;

    private DivkitModule_ProvideDivKitFactory(DivkitModule divkitModule, xvf0 xvf0Var) {
        this.module = divkitModule;
        this.contextProvider = xvf0Var;
    }

    public static DivkitModule_ProvideDivKitFactory create(DivkitModule divkitModule, xvf0 xvf0Var) {
        return new DivkitModule_ProvideDivKitFactory(divkitModule, xvf0Var);
    }

    public static hxk provideDivKit(DivkitModule divkitModule, Context context) {
        hxk provideDivKit = divkitModule.provideDivKit(context);
        q5z.i(provideDivKit);
        return provideDivKit;
    }

    @Override // defpackage.yvf0
    public hxk get() {
        return provideDivKit(this.module, (Context) this.contextProvider.get());
    }
}
