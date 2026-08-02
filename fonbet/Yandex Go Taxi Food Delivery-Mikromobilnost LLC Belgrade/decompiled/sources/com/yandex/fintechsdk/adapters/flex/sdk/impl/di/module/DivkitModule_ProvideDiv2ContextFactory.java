package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import android.content.Context;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.expression.variables.a;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.gallery.GalleryScrollPositionExtensionHandler;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.input.InputSecureExtensionHandler;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.gzr;
import defpackage.mwl;
import defpackage.plk;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.y6k;

/* loaded from: classes10.dex */
public final class DivkitModule_ProvideDiv2ContextFactory implements v7p {
    private final xvf0 actionHandlerProvider;
    private final xvf0 applicationContextProvider;
    private final xvf0 divCustomContainerViewAdapterProvider;
    private final xvf0 divVariableControllerProvider;
    private final xvf0 divkitTypeFaceProvider;
    private final xvf0 flexDependenciesProvider;
    private final xvf0 fontScaleOverrideProvider;
    private final xvf0 galleryScrollPositionExtensionHandlerProvider;
    private final xvf0 inputSecureExtensionHandlerProvider;
    private final DivkitModule module;
    private final xvf0 shimmerDivHandlerProvider;

    private DivkitModule_ProvideDiv2ContextFactory(DivkitModule divkitModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10) {
        this.module = divkitModule;
        this.actionHandlerProvider = xvf0Var;
        this.applicationContextProvider = xvf0Var2;
        this.divCustomContainerViewAdapterProvider = xvf0Var3;
        this.divkitTypeFaceProvider = xvf0Var4;
        this.divVariableControllerProvider = xvf0Var5;
        this.flexDependenciesProvider = xvf0Var6;
        this.fontScaleOverrideProvider = xvf0Var7;
        this.galleryScrollPositionExtensionHandlerProvider = xvf0Var8;
        this.inputSecureExtensionHandlerProvider = xvf0Var9;
        this.shimmerDivHandlerProvider = xvf0Var10;
    }

    public static DivkitModule_ProvideDiv2ContextFactory create(DivkitModule divkitModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10) {
        return new DivkitModule_ProvideDiv2ContextFactory(divkitModule, xvf0Var, xvf0Var2, xvf0Var3, xvf0Var4, xvf0Var5, xvf0Var6, xvf0Var7, xvf0Var8, xvf0Var9, xvf0Var10);
    }

    public static Div2Context provideDiv2Context(DivkitModule divkitModule, y6k y6kVar, Context context, plk plkVar, mwl mwlVar, a aVar, FlexDependencies flexDependencies, gzr gzrVar, GalleryScrollPositionExtensionHandler galleryScrollPositionExtensionHandler, InputSecureExtensionHandler inputSecureExtensionHandler, ShimmerDivHandler shimmerDivHandler) {
        Div2Context provideDiv2Context = divkitModule.provideDiv2Context(y6kVar, context, plkVar, mwlVar, aVar, flexDependencies, gzrVar, galleryScrollPositionExtensionHandler, inputSecureExtensionHandler, shimmerDivHandler);
        q5z.i(provideDiv2Context);
        return provideDiv2Context;
    }

    @Override // defpackage.yvf0
    public Div2Context get() {
        return provideDiv2Context(this.module, (y6k) this.actionHandlerProvider.get(), (Context) this.applicationContextProvider.get(), (plk) this.divCustomContainerViewAdapterProvider.get(), (mwl) this.divkitTypeFaceProvider.get(), (a) this.divVariableControllerProvider.get(), (FlexDependencies) this.flexDependenciesProvider.get(), (gzr) this.fontScaleOverrideProvider.get(), (GalleryScrollPositionExtensionHandler) this.galleryScrollPositionExtensionHandlerProvider.get(), (InputSecureExtensionHandler) this.inputSecureExtensionHandlerProvider.get(), (ShimmerDivHandler) this.shimmerDivHandlerProvider.get());
    }
}
