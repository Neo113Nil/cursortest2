package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.preview.PreviewLoader;
import defpackage.cjh;
import defpackage.djh;
import defpackage.ejh;
import defpackage.gdr;
import defpackage.l190;
import defpackage.p85;
import defpackage.q5z;
import defpackage.ukr;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexNavigationModule_ProvideFlexRouteHandlerFactory implements v7p {
    private final xvf0 bottomSheetFragmentFactoryProvider;
    private final xvf0 containerProvider;
    private final xvf0 dialogFragmentFactoryProvider;
    private final xvf0 firstInteractionEventsListenerProvider;
    private final xvf0 flexOverlayControllerFactoryProvider;
    private final xvf0 fragmentActivityProvider;
    private final xvf0 fragmentFactoryProvider;
    private final xvf0 fragmentManagerProvider;
    private final FlexNavigationModule module;
    private final xvf0 overlayManagerProvider;
    private final xvf0 previewLoaderProvider;
    private final xvf0 routerProvider;

    private FlexNavigationModule_ProvideFlexRouteHandlerFactory(FlexNavigationModule flexNavigationModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11) {
        this.module = flexNavigationModule;
        this.bottomSheetFragmentFactoryProvider = xvf0Var;
        this.containerProvider = xvf0Var2;
        this.dialogFragmentFactoryProvider = xvf0Var3;
        this.firstInteractionEventsListenerProvider = xvf0Var4;
        this.flexOverlayControllerFactoryProvider = xvf0Var5;
        this.fragmentActivityProvider = xvf0Var6;
        this.fragmentFactoryProvider = xvf0Var7;
        this.fragmentManagerProvider = xvf0Var8;
        this.overlayManagerProvider = xvf0Var9;
        this.previewLoaderProvider = xvf0Var10;
        this.routerProvider = xvf0Var11;
    }

    public static FlexNavigationModule_ProvideFlexRouteHandlerFactory create(FlexNavigationModule flexNavigationModule, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11) {
        return new FlexNavigationModule_ProvideFlexRouteHandlerFactory(flexNavigationModule, xvf0Var, xvf0Var2, xvf0Var3, xvf0Var4, xvf0Var5, xvf0Var6, xvf0Var7, xvf0Var8, xvf0Var9, xvf0Var10, xvf0Var11);
    }

    public static FlexRouteHandler provideFlexRouteHandler(FlexNavigationModule flexNavigationModule, cjh cjhVar, p85 p85Var, djh djhVar, gdr gdrVar, ukr ukrVar, p85 p85Var2, ejh ejhVar, p85 p85Var3, l190 l190Var, PreviewLoader previewLoader, p85 p85Var4) {
        FlexRouteHandler provideFlexRouteHandler = flexNavigationModule.provideFlexRouteHandler(cjhVar, p85Var, djhVar, gdrVar, ukrVar, p85Var2, ejhVar, p85Var3, l190Var, previewLoader, p85Var4);
        q5z.i(provideFlexRouteHandler);
        return provideFlexRouteHandler;
    }

    @Override // defpackage.yvf0
    public FlexRouteHandler get() {
        return provideFlexRouteHandler(this.module, (cjh) this.bottomSheetFragmentFactoryProvider.get(), (p85) this.containerProvider.get(), (djh) this.dialogFragmentFactoryProvider.get(), (gdr) this.firstInteractionEventsListenerProvider.get(), (ukr) this.flexOverlayControllerFactoryProvider.get(), (p85) this.fragmentActivityProvider.get(), (ejh) this.fragmentFactoryProvider.get(), (p85) this.fragmentManagerProvider.get(), (l190) this.overlayManagerProvider.get(), (PreviewLoader) this.previewLoaderProvider.get(), (p85) this.routerProvider.get());
    }
}
