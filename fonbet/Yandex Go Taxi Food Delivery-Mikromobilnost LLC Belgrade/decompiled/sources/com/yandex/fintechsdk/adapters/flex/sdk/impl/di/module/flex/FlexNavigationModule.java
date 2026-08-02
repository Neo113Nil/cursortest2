package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex;

import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.DocumentEngineCreatorHolder;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.RouteHandlerProviderImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.overlay.BottomSheetFlexOverlayControllerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.overlay.DefaultOverlayManager;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet.CustomBottomSheetFragmentFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.preview.PreviewLoader;
import com.yandex.fintechsdk.entities.ui.BottomSheetMode;
import defpackage.c1o;
import defpackage.cjh;
import defpackage.djh;
import defpackage.ejh;
import defpackage.gdr;
import defpackage.h3y;
import defpackage.hh5;
import defpackage.j0g;
import defpackage.l190;
import defpackage.oyl;
import defpackage.p85;
import defpackage.qyl;
import defpackage.r3l0;
import defpackage.ukr;
import defpackage.vkr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0081\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020(2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0007¢\u0006\u0004\b)\u0010*J-\u0010.\u001a\u00020\r2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0015H\u0007¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/FlexNavigationModule;", "", "<init>", "()V", "Lcjh;", "bottomSheetFragmentFactory", "Lp85;", "Landroid/view/ViewGroup;", "containerProvider", "Ldjh;", "dialogFragmentFactory", "Lgdr;", "firstInteractionEventsListener", "Lukr;", "flexOverlayControllerFactory", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivityProvider", "Lejh;", "fragmentFactory", "Landroidx/fragment/app/FragmentManager;", "fragmentManagerProvider", "Ll190;", "overlayManager", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/PreviewLoader;", "previewLoader", "Lcom/yandex/fintechsdk/core/navigation/impl/api/router/a;", "routerProvider", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/navigation/FlexRouteHandler;", "provideFlexRouteHandler", "(Lcjh;Lp85;Ldjh;Lgdr;Lukr;Lp85;Lejh;Lp85;Ll190;Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/PreviewLoader;Lp85;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/navigation/FlexRouteHandler;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreatorHolder;", "documentEngineCreatorHolder", "provideFragmentFactory", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreatorHolder;)Lejh;", "provideBottomSheetFragmentFactory", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreatorHolder;)Lcjh;", "provideDialogFragmentFactory", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreatorHolder;)Ldjh;", "Lh3y;", "routeHandler", "Lr3l0;", "provideRouteHandlerProvider", "(Lh3y;)Lr3l0;", "activityProvider", "Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;", "flexDependencies", "provideFlexOverlayControllerFactory", "(Lp85;Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreatorHolder;Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;)Lukr;", "provideOverlayManager", "()Ll190;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexNavigationModule {
    public final cjh provideBottomSheetFragmentFactory(DocumentEngineCreatorHolder documentEngineCreatorHolder) {
        return new CustomBottomSheetFragmentFactory(documentEngineCreatorHolder);
    }

    public final djh provideDialogFragmentFactory(DocumentEngineCreatorHolder documentEngineCreatorHolder) {
        return new oyl(documentEngineCreatorHolder);
    }

    public final ukr provideFlexOverlayControllerFactory(p85 activityProvider, DocumentEngineCreatorHolder documentEngineCreatorHolder, FlexDependencies flexDependencies) {
        if (((BottomSheetMode) ((hh5) flexDependencies.getOverlayConfigProvider()).i().b) != BottomSheetMode.DISABLED) {
            return new BottomSheetFlexOverlayControllerFactory(activityProvider, documentEngineCreatorHolder, flexDependencies.getOverlayConfigProvider());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityProvider.b();
        return new vkr(new j0g(fragmentActivity, fragmentActivity.getLifecycle()), fragmentActivity, new c1o(29, documentEngineCreatorHolder));
    }

    public final FlexRouteHandler provideFlexRouteHandler(cjh bottomSheetFragmentFactory, p85 containerProvider, djh dialogFragmentFactory, gdr firstInteractionEventsListener, ukr flexOverlayControllerFactory, p85 fragmentActivityProvider, ejh fragmentFactory, p85 fragmentManagerProvider, l190 overlayManager, PreviewLoader previewLoader, p85 routerProvider) {
        return new FlexRouteHandlerImpl(bottomSheetFragmentFactory, containerProvider, dialogFragmentFactory, firstInteractionEventsListener, flexOverlayControllerFactory, fragmentActivityProvider, fragmentFactory, fragmentManagerProvider, overlayManager, previewLoader, routerProvider);
    }

    public final ejh provideFragmentFactory(DocumentEngineCreatorHolder documentEngineCreatorHolder) {
        return new qyl(documentEngineCreatorHolder);
    }

    public final l190 provideOverlayManager() {
        return new DefaultOverlayManager();
    }

    public final r3l0 provideRouteHandlerProvider(h3y routeHandler) {
        return new RouteHandlerProviderImpl(routeHandler);
    }
}
