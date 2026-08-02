package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.preview.PreviewLoader;
import defpackage.azw;
import defpackage.d0m;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexModule_ProvidePreviewLoaderFactory implements v7p {
    private final xvf0 contextProvider;
    private final xvf0 documentJsonProvider;
    private final xvf0 isSpinnerPreviewEnabledProvider;
    private final FlexModule module;

    private FlexModule_ProvidePreviewLoaderFactory(FlexModule flexModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.module = flexModule;
        this.contextProvider = xvf0Var;
        this.isSpinnerPreviewEnabledProvider = xvf0Var2;
        this.documentJsonProvider = xvf0Var3;
    }

    public static FlexModule_ProvidePreviewLoaderFactory create(FlexModule flexModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        return new FlexModule_ProvidePreviewLoaderFactory(flexModule, xvf0Var, xvf0Var2, xvf0Var3);
    }

    public static PreviewLoader providePreviewLoader(FlexModule flexModule, Context context, azw azwVar, d0m d0mVar) {
        PreviewLoader providePreviewLoader = flexModule.providePreviewLoader(context, azwVar, d0mVar);
        q5z.i(providePreviewLoader);
        return providePreviewLoader;
    }

    @Override // defpackage.yvf0
    public PreviewLoader get() {
        return providePreviewLoader(this.module, (Context) this.contextProvider.get(), (azw) this.isSpinnerPreviewEnabledProvider.get(), (d0m) this.documentJsonProvider.get());
    }
}
