package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawableProvider;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexModule_ProvideShimmerDrawableProviderFactory implements v7p {
    private final FlexModule module;

    private FlexModule_ProvideShimmerDrawableProviderFactory(FlexModule flexModule) {
        this.module = flexModule;
    }

    public static FlexModule_ProvideShimmerDrawableProviderFactory create(FlexModule flexModule) {
        return new FlexModule_ProvideShimmerDrawableProviderFactory(flexModule);
    }

    public static ShimmerDrawableProvider provideShimmerDrawableProvider(FlexModule flexModule) {
        ShimmerDrawableProvider provideShimmerDrawableProvider = flexModule.provideShimmerDrawableProvider();
        q5z.i(provideShimmerDrawableProvider);
        return provideShimmerDrawableProvider;
    }

    @Override // defpackage.yvf0
    public ShimmerDrawableProvider get() {
        return provideShimmerDrawableProvider(this.module);
    }
}
