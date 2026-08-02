package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import android.content.Context;
import android.util.Log;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.FlexModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawableImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawableProvider;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.DocumentEngineCreator;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.DocumentEngineCreatorHolder;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.DocumentEngineCreatorRegistry;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.error.CustomErrorViewController;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.preview.PreviewLoader;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.tracker.DocumentTrackerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.state.BduiStateManagerImpl;
import com.yandex.fintechsdk.core.navigation.impl.api.router.a;
import com.yandex.fintechsdk.entities.ui.BottomSheetMode;
import defpackage.azw;
import defpackage.c190;
import defpackage.c1o;
import defpackage.d0m;
import defpackage.gkr;
import defpackage.hh5;
import defpackage.i3m;
import defpackage.k6x;
import defpackage.l1o;
import defpackage.m0m;
import defpackage.mao;
import defpackage.oao;
import defpackage.p85;
import defpackage.pao;
import defpackage.rjr;
import defpackage.ryw;
import defpackage.sh5;
import defpackage.u6o;
import defpackage.ujr;
import defpackage.uyi0;
import defpackage.wjr;
import defpackage.xg5;
import defpackage.yu;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJa\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J)\u0010+\u001a\u00020*2\b\b\u0001\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/J!\u00104\u001a\u00020\u00152\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u00020\u001eH\u0007¢\u0006\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/FlexModule;", "", "<init>", "()V", "Lpao;", "errorViewFactory", "Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;", "flexDependencies", "Lp85;", "Lcom/yandex/fintechsdk/core/navigation/impl/api/router/a;", "routerProvider", "Lu6o;", "provideErrorControllerProvider", "(Lpao;Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;Lp85;)Lu6o;", "Lyu;", "actionDispatcherFactory", "Lyvf0;", "Ljfe;", "contentControllerAdapterProvider", "Lm0m;", "documentLoader", "Li3m;", "documentTracker", "Lryw;", "isEngineErrorViewEnabled", "Lsjm0;", "scaffoldControllerAdapterProvider", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreatorHolder;", "provideDocumentEngineCreatorHolder", "(Lyu;Lyvf0;Lm0m;Li3m;Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;Lryw;Lp85;Lyvf0;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreatorHolder;", "Lk6x;", "provideJasonStateStore", "()Lk6x;", "Lwjr;", "provideLogHandler", "()Lwjr;", "Landroid/content/Context;", "context", "Lazw;", "isSpinnerPreviewEnabled", "Ld0m;", "documentJsonProvider", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/PreviewLoader;", "providePreviewLoader", "(Landroid/content/Context;Lazw;Ld0m;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/PreviewLoader;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawableProvider;", "provideShimmerDrawableProvider", "()Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawableProvider;", "Lxg5;", "bduiEventHandler", "Luyi0;", "renderingEventsListener", "provideDocumentTracker", "(Lxg5;Luyi0;)Li3m;", "jasonStateStore", "Lsh5;", "provideBduiStateManager", "(Lk6x;)Lsh5;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexModule {
    private final u6o provideErrorControllerProvider(final pao errorViewFactory, FlexDependencies flexDependencies, final p85 routerProvider) {
        final c190 overlayConfigProvider = flexDependencies.getOverlayConfigProvider();
        return new oao() { // from class: hkr
            @Override // defpackage.oao
            public final mao a(l1o l1oVar) {
                mao provideErrorControllerProvider$lambda$3;
                provideErrorControllerProvider$lambda$3 = FlexModule.provideErrorControllerProvider$lambda$3(pao.this, routerProvider, overlayConfigProvider, l1oVar);
                return provideErrorControllerProvider$lambda$3;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mao provideErrorControllerProvider$lambda$3(pao paoVar, p85 p85Var, c190 c190Var, l1o l1oVar) {
        return new CustomErrorViewController(l1oVar, paoVar, new c1o(27, p85Var), new c1o(28, c190Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 provideErrorControllerProvider$lambda$3$lambda$1(p85 p85Var) {
        a aVar = (a) p85Var.a();
        if (aVar != null) {
            aVar.a();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideErrorControllerProvider$lambda$3$lambda$2(c190 c190Var) {
        return ((BottomSheetMode) ((hh5) c190Var).i().b) == BottomSheetMode.REGULAR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShimmerDrawable provideShimmerDrawableProvider$lambda$4(Context context) {
        return new ShimmerDrawableImpl(context);
    }

    public final sh5 provideBduiStateManager(k6x jasonStateStore) {
        return new BduiStateManagerImpl(jasonStateStore);
    }

    public final DocumentEngineCreatorHolder provideDocumentEngineCreatorHolder(yu actionDispatcherFactory, yvf0 contentControllerAdapterProvider, m0m documentLoader, i3m documentTracker, FlexDependencies flexDependencies, ryw isEngineErrorViewEnabled, p85 routerProvider, yvf0 scaffoldControllerAdapterProvider) {
        pao errorViewFactory = flexDependencies.getErrorViewFactory();
        if (!isEngineErrorViewEnabled.a) {
            errorViewFactory = null;
        }
        DocumentEngineCreatorRegistry.INSTANCE.register(new DocumentEngineCreator(actionDispatcherFactory, contentControllerAdapterProvider, documentLoader, Collections.singletonList(documentTracker), errorViewFactory != null ? provideErrorControllerProvider(errorViewFactory, flexDependencies, routerProvider) : null, scaffoldControllerAdapterProvider));
        return new DocumentEngineCreatorHolder();
    }

    public final i3m provideDocumentTracker(xg5 bduiEventHandler, uyi0 renderingEventsListener) {
        return new DocumentTrackerImpl(bduiEventHandler, renderingEventsListener);
    }

    public final k6x provideJasonStateStore() {
        return new k6x();
    }

    public final wjr provideLogHandler() {
        return new wjr() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.FlexModule$provideLogHandler$1
            @Override // defpackage.wjr
            public /* bridge */ /* synthetic */ rjr createLogConfiguration() {
                return rjr.b;
            }

            @Override // defpackage.wjr
            public void log(ujr entry) {
                Log.e("FLEX", entry.b);
            }
        };
    }

    public final PreviewLoader providePreviewLoader(Context context, azw isSpinnerPreviewEnabled, d0m documentJsonProvider) {
        return new PreviewLoader(context, documentJsonProvider, isSpinnerPreviewEnabled.a);
    }

    public final ShimmerDrawableProvider provideShimmerDrawableProvider() {
        return new gkr();
    }
}
