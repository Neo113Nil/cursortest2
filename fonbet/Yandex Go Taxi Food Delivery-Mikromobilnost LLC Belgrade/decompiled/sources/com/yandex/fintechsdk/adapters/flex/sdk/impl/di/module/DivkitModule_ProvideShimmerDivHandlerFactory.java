package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawableProvider;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.vh5;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class DivkitModule_ProvideShimmerDivHandlerFactory implements v7p {
    private final DivkitModule module;
    private final xvf0 shimmerDrawableProvider;
    private final xvf0 themeProvider;

    private DivkitModule_ProvideShimmerDivHandlerFactory(DivkitModule divkitModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = divkitModule;
        this.shimmerDrawableProvider = xvf0Var;
        this.themeProvider = xvf0Var2;
    }

    public static DivkitModule_ProvideShimmerDivHandlerFactory create(DivkitModule divkitModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new DivkitModule_ProvideShimmerDivHandlerFactory(divkitModule, xvf0Var, xvf0Var2);
    }

    public static ShimmerDivHandler provideShimmerDivHandler(DivkitModule divkitModule, ShimmerDrawableProvider shimmerDrawableProvider, vh5 vh5Var) {
        ShimmerDivHandler provideShimmerDivHandler = divkitModule.provideShimmerDivHandler(shimmerDrawableProvider, vh5Var);
        q5z.i(provideShimmerDivHandler);
        return provideShimmerDivHandler;
    }

    @Override // defpackage.yvf0
    public ShimmerDivHandler get() {
        return provideShimmerDivHandler(this.module, (ShimmerDrawableProvider) this.shimmerDrawableProvider.get(), (vh5) this.themeProvider.get());
    }
}
