package com.yandex.fintechsdk.adapters.flex.sdk.impl.di;

import android.content.Context;
import com.yandex.div.core.expression.variables.a;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.DivkitModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.DivkitModule_ProvideBduiVariableControllerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.DivkitModule_ProvideDiv2ContextFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.DivkitModule_ProvideDivActionHandlerImplFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.DivkitModule_ProvideDivCustomContainerViewAdapterFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.DivkitModule_ProvideDivKitFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.DivkitModule_ProvideDivVariableControllerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.DivkitModule_ProvideDivkitStateDaemonFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.DivkitModule_ProvideDivkitThemeChangeListenerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.DivkitModule_ProvideDivkitTypefaceProviderFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.DivkitModule_ProvideInputSecureExtensionHandlerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.DivkitModule_ProvideShimmerDivHandlerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.FlexModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.FlexModule_ProvideBduiStateManagerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.FlexModule_ProvideDocumentEngineCreatorHolderFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.FlexModule_ProvideDocumentTrackerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.FlexModule_ProvideJasonStateStoreFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.FlexModule_ProvidePreviewLoaderFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.FlexModule_ProvideShimmerDrawableProviderFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.FlexNavigationModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.FlexNavigationModule_ProvideBottomSheetFragmentFactoryFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.FlexNavigationModule_ProvideDialogFragmentFactoryFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.FlexNavigationModule_ProvideFlexOverlayControllerFactoryFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.FlexNavigationModule_ProvideFlexRouteHandlerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.FlexNavigationModule_ProvideFragmentFactoryFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.FlexNavigationModule_ProvideOverlayManagerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.FlexNavigationModule_ProvideRouteHandlerProviderFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.FlexThemeModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.FlexThemeModule_ProvideThemeControllerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.FlexThemeModule_ProvideThemedColorResolverFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionDecodersModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionDecodersModule_ProvideActionDecoderFactoryFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionDecodersModule_ProvideCustomActionDecoderModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionDecodersModule_ProvideDocumentActionDecoderModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionDecodersModule_ProvideListActionDecoderModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionDecodersModule_ProvideNavigationActionDecoderModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionDecodersModule_ProvideRemoteActionDecoderModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionDecodersModule_ProvideScenarioActionDecoderModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionDecodersModule_ProvideTemplatedActionDecoderModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionDecodersModule_ProvideTimedActionDecoderModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideActionDispatcherFactoryFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideActionExecutorFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideActionResponseParserFactoryFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideActionServiceErrorHandlerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideActionServiceFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideCustomActionHandlerModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideDebuggerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideDelayedActionHandlerModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideDocumentActionHandlerModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideJasonActorFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideListActionHandlerModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideNavigationActionHandlerModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvidePrinterFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideRemoteActionHandlerModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideScenarioActionHandlerModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideTemplatedActionHandlerModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action.FlexActionHandlersModule_ProvideTimedActionHandlerModuleFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.animation.FlexAnimationsModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.animation.FlexAnimationsModule_ProvideAnimationDecoderFactoryFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.animation.FlexAnimationsModule_ProvideAnimationSerializerSelectorFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller.FlexContentControllersModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller.FlexContentControllersModule_ProvideContentControllerAdapterFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller.FlexContentControllersModule_ProvideDivkitContentControllerFactoryFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller.FlexContentControllersModule_ProvideSkeletonContentControllerFactoryFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller.FlexScaffoldControllersModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller.FlexScaffoldControllersModule_ProvideDivkitScaffoldControllerFactoryFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller.FlexScaffoldControllersModule_ProvideScaffoldControllerAdapterFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexDocumentParserExtensionsModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexDocumentParserExtensionsModule_ProvideAnimationDocumentParserExtensionFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexDocumentParserExtensionsModule_ProvideDivkitDocumentParserExtensionFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexDocumentParserExtensionsModule_ProvideJasonStateParserExtensionFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexDocumentParserExtensionsModule_ProvideNestedActionParserExtensionFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexDocumentParserExtensionsModule_ProvideRemoteActionParserExtensionFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexInterceptorsModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexInterceptorsModule_ProvideExtraQueryInterceptorFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexMapiModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexMapiModule_ProvideMapiClientFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexMapiModule_ProvideOkHttpClientFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexNetworkModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexNetworkModule_ProvideCoroutineDispatcherFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexNetworkModule_ProvideCoroutineScopeFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexNetworkModule_ProvideDecodingVelocityMonitoringFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexNetworkModule_ProvideDocumentJsonProviderFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexNetworkModule_ProvideDocumentLoaderFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexNetworkModule_ProvideDocumentResponseParserFactoryFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexNetworkModule_ProvideDocumentServiceErrorHandlerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexNetworkModule_ProvideNetworkCachingFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexNetworkModule_ProvideSharedDataParserFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexParsersModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexParsersModule_ProvideActionParserFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexParsersModule_ProvideActionSerializerSelectorFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexParsersModule_ProvideContentParserFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexParsersModule_ProvideContentSerializerSelectorFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexParsersModule_ProvideScaffoldParserFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexParsersModule_ProvideScaffoldSerializerSelectorFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexPayloadExtendersModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network.FlexPayloadExtendersModule_ProvideJasonStatePayloadExtenderFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action.Div2ViewLocator;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action.Div2ViewLocator_Factory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.gallery.GalleryScrollPositionExtensionHandler_Factory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.utils.DocumentJsonParser;
import defpackage.ah5;
import defpackage.aks0;
import defpackage.azw;
import defpackage.c2r0;
import defpackage.cy;
import defpackage.d0m;
import defpackage.dh5;
import defpackage.ei00;
import defpackage.ekm0;
import defpackage.eqh;
import defpackage.etl;
import defpackage.fj2;
import defpackage.g8e;
import defpackage.gdr;
import defpackage.gtq0;
import defpackage.gzr;
import defpackage.hxk;
import defpackage.i5m;
import defpackage.ihe;
import defpackage.k6x;
import defpackage.kg5;
import defpackage.ku;
import defpackage.lu;
import defpackage.n3w;
import defpackage.osu;
import defpackage.p85;
import defpackage.pvy0;
import defpackage.q5z;
import defpackage.qmf;
import defpackage.r1m;
import defpackage.ryw;
import defpackage.sh5;
import defpackage.tse;
import defpackage.uyi0;
import defpackage.vg5;
import defpackage.vh5;
import defpackage.wul;
import defpackage.xg5;
import defpackage.xvf0;
import defpackage.y2r0;
import defpackage.zw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.OkHttpClient;

/* loaded from: classes10.dex */
public final class DaggerFlexComponent {

    public static final class FlexComponentImpl implements FlexComponent {
        xvf0 div2ViewLocatorProvider;
        private final DivkitModule divkitModule;
        private final FlexActionDecodersModule flexActionDecodersModule;
        private final FlexComponentImpl flexComponentImpl = this;
        private final FlexDependencies flexDependencies;
        xvf0 flexDependenciesProvider;
        private final FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule;
        private final FlexNetworkModule flexNetworkModule;
        private final FlexParsersModule flexParsersModule;
        xvf0 galleryScrollPositionExtensionHandlerProvider;
        xvf0 getActionsInfoProvider;
        xvf0 getActivityProvider;
        xvf0 getApplicationContextProvider;
        xvf0 getContainerProvider;
        xvf0 getCustomViewConfigurationsProvider;
        xvf0 getCustomViewFactoryDelegateCreatorProvider;
        xvf0 getErrorHandlerProvider;
        xvf0 getEventHandlerProvider;
        xvf0 getExtraHeadersProvider;
        xvf0 getExtraQueriesProvider;
        xvf0 getFirstInteractionEventsListenerProvider;
        xvf0 getFontScaleOverrideProvider;
        xvf0 getFragmentManagerProvider;
        xvf0 getHostUrlProvider;
        xvf0 getOkHttpClientBuilderProvider;
        xvf0 getRenderingEventsListenerProvider;
        xvf0 getRouterProvider;
        xvf0 getThemeProvider;
        xvf0 isEngineErrorViewEnabledProvider;
        xvf0 isSpinnerPreviewEnabledProvider;
        xvf0 mapOfClassOfAndContentControllerFactoryProvider;
        xvf0 mapOfClassOfAndScaffoldControllerFactoryProvider;
        xvf0 provideActionDecoderFactoryProvider;
        xvf0 provideActionDispatcherFactoryProvider;
        xvf0 provideActionExecutorProvider;
        xvf0 provideActionParserProvider;
        xvf0 provideActionResponseParserFactoryProvider;
        xvf0 provideActionSerializerSelectorProvider;
        xvf0 provideActionServiceErrorHandlerProvider;
        xvf0 provideActionServiceProvider;
        xvf0 provideAnimationDecoderFactoryProvider;
        xvf0 provideAnimationDocumentParserExtensionProvider;
        xvf0 provideAnimationSerializerSelectorProvider;
        xvf0 provideBduiStateManagerProvider;
        xvf0 provideBduiVariableControllerProvider;
        xvf0 provideBottomSheetFragmentFactoryProvider;
        xvf0 provideContentControllerAdapterProvider;
        xvf0 provideContentParserProvider;
        xvf0 provideContentSerializerSelectorProvider;
        xvf0 provideCoroutineDispatcherProvider;
        xvf0 provideCoroutineScopeProvider;
        xvf0 provideCustomActionDecoderModuleProvider;
        xvf0 provideCustomActionHandlerModuleProvider;
        xvf0 provideDebuggerProvider;
        xvf0 provideDecodingVelocityMonitoringProvider;
        xvf0 provideDelayedActionHandlerModuleProvider;
        xvf0 provideDialogFragmentFactoryProvider;
        xvf0 provideDiv2ContextProvider;
        xvf0 provideDivActionHandlerImplProvider;
        xvf0 provideDivCustomContainerViewAdapterProvider;
        xvf0 provideDivKitProvider;
        xvf0 provideDivVariableControllerProvider;
        xvf0 provideDivkitContentControllerFactoryProvider;
        xvf0 provideDivkitDocumentParserExtensionProvider;
        xvf0 provideDivkitScaffoldControllerFactoryProvider;
        xvf0 provideDivkitStateDaemonProvider;
        xvf0 provideDivkitThemeChangeListenerProvider;
        xvf0 provideDivkitTypefaceProvider;
        xvf0 provideDocumentActionDecoderModuleProvider;
        xvf0 provideDocumentActionHandlerModuleProvider;
        xvf0 provideDocumentEngineCreatorHolderProvider;
        xvf0 provideDocumentJsonProvider;
        xvf0 provideDocumentLoaderProvider;
        xvf0 provideDocumentResponseParserFactoryProvider;
        xvf0 provideDocumentServiceErrorHandlerProvider;
        xvf0 provideDocumentTrackerProvider;
        xvf0 provideExtraQueryInterceptorProvider;
        xvf0 provideFlexOverlayControllerFactoryProvider;
        xvf0 provideFlexRouteHandlerProvider;
        xvf0 provideFragmentFactoryProvider;
        xvf0 provideInputSecureExtensionHandlerProvider;
        xvf0 provideJasonActorProvider;
        xvf0 provideJasonStateParserExtensionProvider;
        xvf0 provideJasonStatePayloadExtenderProvider;
        xvf0 provideJasonStateStoreProvider;
        xvf0 provideListActionDecoderModuleProvider;
        xvf0 provideListActionHandlerModuleProvider;
        xvf0 provideMapiClientProvider;
        xvf0 provideNavigationActionDecoderModuleProvider;
        xvf0 provideNavigationActionHandlerModuleProvider;
        xvf0 provideNestedActionParserExtensionProvider;
        xvf0 provideNetworkCachingProvider;
        xvf0 provideOkHttpClientProvider;
        xvf0 provideOverlayManagerProvider;
        xvf0 providePreviewLoaderProvider;
        xvf0 providePrinterProvider;
        xvf0 provideRemoteActionDecoderModuleProvider;
        xvf0 provideRemoteActionHandlerModuleProvider;
        xvf0 provideRemoteActionParserExtensionProvider;
        xvf0 provideRouteHandlerProvider;
        xvf0 provideScaffoldControllerAdapterProvider;
        xvf0 provideScaffoldParserProvider;
        xvf0 provideScaffoldSerializerSelectorProvider;
        xvf0 provideScenarioActionDecoderModuleProvider;
        xvf0 provideScenarioActionHandlerModuleProvider;
        xvf0 provideSharedDataParserProvider;
        xvf0 provideShimmerDivHandlerProvider;
        xvf0 provideShimmerDrawableProvider;
        xvf0 provideSkeletonContentControllerFactoryProvider;
        xvf0 provideTemplatedActionDecoderModuleProvider;
        xvf0 provideTemplatedActionHandlerModuleProvider;
        xvf0 provideThemeControllerProvider;
        xvf0 provideThemedColorResolverProvider;
        xvf0 provideTimedActionDecoderModuleProvider;
        xvf0 provideTimedActionHandlerModuleProvider;
        xvf0 setOfActionDecoderModuleProvider;
        xvf0 setOfActionHandlerModuleProvider;
        xvf0 setOfDocumentParserExtensionProvider;
        xvf0 setOfInterceptorProvider;
        xvf0 setOfPayloadExtenderProvider;

        public static final class GetActionsInfoProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetActionsInfoProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public List<kg5> get() {
                List<kg5> actionsInfo = this.flexDependencies.getActionsInfo();
                q5z.h(actionsInfo);
                return actionsInfo;
            }
        }

        public static final class GetActivityProviderProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetActivityProviderProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public p85 get() {
                p85 activityProvider = this.flexDependencies.getActivityProvider();
                q5z.h(activityProvider);
                return activityProvider;
            }
        }

        public static final class GetApplicationContextProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetApplicationContextProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public Context get() {
                Context applicationContext = this.flexDependencies.getApplicationContext();
                q5z.h(applicationContext);
                return applicationContext;
            }
        }

        public static final class GetContainerProviderProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetContainerProviderProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public p85 get() {
                p85 containerProvider = this.flexDependencies.getContainerProvider();
                q5z.h(containerProvider);
                return containerProvider;
            }
        }

        public static final class GetCustomViewConfigurationsProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetCustomViewConfigurationsProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public Map<String, Object> get() {
                Map<String, Object> customViewConfigurations = this.flexDependencies.getCustomViewConfigurations();
                q5z.h(customViewConfigurations);
                return customViewConfigurations;
            }
        }

        public static final class GetCustomViewFactoryDelegateCreatorProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetCustomViewFactoryDelegateCreatorProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public qmf get() {
                qmf customViewFactoryDelegateCreator = this.flexDependencies.getCustomViewFactoryDelegateCreator();
                q5z.h(customViewFactoryDelegateCreator);
                return customViewFactoryDelegateCreator;
            }
        }

        public static final class GetErrorHandlerProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetErrorHandlerProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public vg5 get() {
                vg5 errorHandler = this.flexDependencies.getErrorHandler();
                q5z.h(errorHandler);
                return errorHandler;
            }
        }

        public static final class GetEventHandlerProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetEventHandlerProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public xg5 get() {
                xg5 eventHandler = this.flexDependencies.getEventHandler();
                q5z.h(eventHandler);
                return eventHandler;
            }
        }

        public static final class GetExtraHeadersProviderProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetExtraHeadersProviderProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public ah5 get() {
                ah5 extraHeadersProvider = this.flexDependencies.getExtraHeadersProvider();
                q5z.h(extraHeadersProvider);
                return extraHeadersProvider;
            }
        }

        public static final class GetExtraQueriesProviderProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetExtraQueriesProviderProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public dh5 get() {
                dh5 extraQueriesProvider = this.flexDependencies.getExtraQueriesProvider();
                q5z.h(extraQueriesProvider);
                return extraQueriesProvider;
            }
        }

        public static final class GetFirstInteractionEventsListenerProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetFirstInteractionEventsListenerProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public gdr get() {
                return this.flexDependencies.getFirstInteractionEventsListener();
            }
        }

        public static final class GetFontScaleOverrideProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetFontScaleOverrideProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public gzr get() {
                gzr fontScaleOverride = this.flexDependencies.getFontScaleOverride();
                q5z.h(fontScaleOverride);
                return fontScaleOverride;
            }
        }

        public static final class GetFragmentManagerProviderProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetFragmentManagerProviderProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public p85 get() {
                p85 fragmentManagerProvider = this.flexDependencies.getFragmentManagerProvider();
                q5z.h(fragmentManagerProvider);
                return fragmentManagerProvider;
            }
        }

        public static final class GetHostUrlProviderProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetHostUrlProviderProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public osu get() {
                osu hostUrlProvider = this.flexDependencies.getHostUrlProvider();
                q5z.h(hostUrlProvider);
                return hostUrlProvider;
            }
        }

        public static final class GetOkHttpClientBuilderProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetOkHttpClientBuilderProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public OkHttpClient.a get() {
                OkHttpClient.a okHttpClientBuilder = this.flexDependencies.getOkHttpClientBuilder();
                q5z.h(okHttpClientBuilder);
                return okHttpClientBuilder;
            }
        }

        public static final class GetRenderingEventsListenerProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetRenderingEventsListenerProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public uyi0 get() {
                return this.flexDependencies.getRenderingEventsListener();
            }
        }

        public static final class GetRouterProviderProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetRouterProviderProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public p85 get() {
                p85 routerProvider = this.flexDependencies.getRouterProvider();
                q5z.h(routerProvider);
                return routerProvider;
            }
        }

        public static final class GetThemeProviderProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public GetThemeProviderProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public vh5 get() {
                vh5 themeProvider = this.flexDependencies.getThemeProvider();
                q5z.h(themeProvider);
                return themeProvider;
            }
        }

        public static final class IsEngineErrorViewEnabledProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public IsEngineErrorViewEnabledProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public ryw get() {
                ryw isEngineErrorViewEnabled = this.flexDependencies.getIsEngineErrorViewEnabled();
                q5z.h(isEngineErrorViewEnabled);
                return isEngineErrorViewEnabled;
            }
        }

        public static final class IsSpinnerPreviewEnabledProvider implements xvf0 {
            private final FlexDependencies flexDependencies;

            public IsSpinnerPreviewEnabledProvider(FlexDependencies flexDependencies) {
                this.flexDependencies = flexDependencies;
            }

            @Override // defpackage.yvf0
            public azw get() {
                azw isSpinnerPreviewEnabled = this.flexDependencies.getIsSpinnerPreviewEnabled();
                q5z.h(isSpinnerPreviewEnabled);
                return isSpinnerPreviewEnabled;
            }
        }

        public FlexComponentImpl(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            this.flexDependencies = flexDependencies;
            this.flexNetworkModule = flexNetworkModule;
            this.flexParsersModule = flexParsersModule;
            this.flexActionDecodersModule = flexActionDecodersModule;
            this.flexDocumentParserExtensionsModule = flexDocumentParserExtensionsModule;
            this.divkitModule = divkitModule;
            initialize(divkitModule, flexModule, flexActionDecodersModule, flexActionHandlersModule, flexAnimationsModule, flexContentControllersModule, flexNavigationModule, flexNetworkModule, flexDocumentParserExtensionsModule, flexInterceptorsModule, flexMapiModule, flexParsersModule, flexPayloadExtendersModule, flexScaffoldControllersModule, flexThemeModule, flexDependencies);
            initialize2(divkitModule, flexModule, flexActionDecodersModule, flexActionHandlersModule, flexAnimationsModule, flexContentControllersModule, flexNavigationModule, flexNetworkModule, flexDocumentParserExtensionsModule, flexInterceptorsModule, flexMapiModule, flexParsersModule, flexPayloadExtendersModule, flexScaffoldControllersModule, flexThemeModule, flexDependencies);
            initialize3(divkitModule, flexModule, flexActionDecodersModule, flexActionHandlersModule, flexAnimationsModule, flexContentControllersModule, flexNavigationModule, flexNetworkModule, flexDocumentParserExtensionsModule, flexInterceptorsModule, flexMapiModule, flexParsersModule, flexPayloadExtendersModule, flexScaffoldControllersModule, flexThemeModule, flexDependencies);
            initialize4(divkitModule, flexModule, flexActionDecodersModule, flexActionHandlersModule, flexAnimationsModule, flexContentControllersModule, flexNavigationModule, flexNetworkModule, flexDocumentParserExtensionsModule, flexInterceptorsModule, flexMapiModule, flexParsersModule, flexPayloadExtendersModule, flexScaffoldControllersModule, flexThemeModule, flexDependencies);
            initialize5(divkitModule, flexModule, flexActionDecodersModule, flexActionHandlersModule, flexAnimationsModule, flexContentControllersModule, flexNavigationModule, flexNetworkModule, flexDocumentParserExtensionsModule, flexInterceptorsModule, flexMapiModule, flexParsersModule, flexPayloadExtendersModule, flexScaffoldControllersModule, flexThemeModule, flexDependencies);
        }

        private void initialize(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            xvf0 b = i5m.b(FlexModule_ProvideJasonStateStoreFactory.create(flexModule));
            this.provideJasonStateStoreProvider = b;
            this.provideBduiStateManagerProvider = i5m.b(FlexModule_ProvideBduiStateManagerFactory.create(flexModule, b));
            this.provideCoroutineScopeProvider = i5m.b(FlexNetworkModule_ProvideCoroutineScopeFactory.create(flexNetworkModule));
            this.div2ViewLocatorProvider = i5m.b(Div2ViewLocator_Factory.create());
            xvf0 b2 = i5m.b(DivkitModule_ProvideDivVariableControllerFactory.create(divkitModule));
            this.provideDivVariableControllerProvider = b2;
            this.provideDivkitStateDaemonProvider = i5m.b(DivkitModule_ProvideDivkitStateDaemonFactory.create(divkitModule, this.provideJasonStateStoreProvider, b2));
            xvf0 b3 = i5m.b(FlexAnimationsModule_ProvideAnimationDecoderFactoryFactory.create(flexAnimationsModule));
            this.provideAnimationDecoderFactoryProvider = b3;
            this.provideAnimationSerializerSelectorProvider = i5m.b(FlexAnimationsModule_ProvideAnimationSerializerSelectorFactory.create(flexAnimationsModule, b3));
            this.getActionsInfoProvider = new GetActionsInfoProvider(flexDependencies);
            GetActivityProviderProvider getActivityProviderProvider = new GetActivityProviderProvider(flexDependencies);
            this.getActivityProvider = getActivityProviderProvider;
            this.provideCustomActionHandlerModuleProvider = FlexActionHandlersModule_ProvideCustomActionHandlerModuleFactory.create(flexActionHandlersModule, this.getActionsInfoProvider, getActivityProviderProvider);
            this.provideTimedActionHandlerModuleProvider = FlexActionHandlersModule_ProvideTimedActionHandlerModuleFactory.create(flexActionHandlersModule, this.provideCoroutineScopeProvider);
            FlexParsersModule_ProvideContentSerializerSelectorFactory create = FlexParsersModule_ProvideContentSerializerSelectorFactory.create(flexParsersModule);
            this.provideContentSerializerSelectorProvider = create;
            this.provideContentParserProvider = FlexParsersModule_ProvideContentParserFactory.create(flexParsersModule, create);
            FlexParsersModule_ProvideScaffoldSerializerSelectorFactory create2 = FlexParsersModule_ProvideScaffoldSerializerSelectorFactory.create(flexParsersModule);
            this.provideScaffoldSerializerSelectorProvider = create2;
            this.provideScaffoldParserProvider = FlexParsersModule_ProvideScaffoldParserFactory.create(flexParsersModule, create2);
            this.provideRemoteActionDecoderModuleProvider = FlexActionDecodersModule_ProvideRemoteActionDecoderModuleFactory.create(flexActionDecodersModule);
            this.provideScenarioActionDecoderModuleProvider = FlexActionDecodersModule_ProvideScenarioActionDecoderModuleFactory.create(flexActionDecodersModule);
            this.provideListActionDecoderModuleProvider = FlexActionDecodersModule_ProvideListActionDecoderModuleFactory.create(flexActionDecodersModule);
            this.provideNavigationActionDecoderModuleProvider = FlexActionDecodersModule_ProvideNavigationActionDecoderModuleFactory.create(flexActionDecodersModule);
            this.provideTimedActionDecoderModuleProvider = FlexActionDecodersModule_ProvideTimedActionDecoderModuleFactory.create(flexActionDecodersModule);
            this.provideTemplatedActionDecoderModuleProvider = FlexActionDecodersModule_ProvideTemplatedActionDecoderModuleFactory.create(flexActionDecodersModule);
            this.provideCustomActionDecoderModuleProvider = FlexActionDecodersModule_ProvideCustomActionDecoderModuleFactory.create(flexActionDecodersModule, this.getActionsInfoProvider);
            this.provideDocumentActionDecoderModuleProvider = FlexActionDecodersModule_ProvideDocumentActionDecoderModuleFactory.create(flexActionDecodersModule);
            this.setOfActionDecoderModuleProvider = setOfActionDecoderModuleBuilder(divkitModule, flexModule, flexActionDecodersModule, flexActionHandlersModule, flexAnimationsModule, flexContentControllersModule, flexNavigationModule, flexNetworkModule, flexDocumentParserExtensionsModule, flexInterceptorsModule, flexMapiModule, flexParsersModule, flexPayloadExtendersModule, flexScaffoldControllersModule, flexThemeModule, flexDependencies);
        }

        private void initialize2(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            FlexActionDecodersModule_ProvideActionDecoderFactoryFactory create = FlexActionDecodersModule_ProvideActionDecoderFactoryFactory.create(flexActionDecodersModule, this.setOfActionDecoderModuleProvider);
            this.provideActionDecoderFactoryProvider = create;
            FlexParsersModule_ProvideActionSerializerSelectorFactory create2 = FlexParsersModule_ProvideActionSerializerSelectorFactory.create(flexParsersModule, create);
            this.provideActionSerializerSelectorProvider = create2;
            this.provideActionParserProvider = FlexParsersModule_ProvideActionParserFactory.create(flexParsersModule, create2);
            this.provideSharedDataParserProvider = FlexNetworkModule_ProvideSharedDataParserFactory.create(flexNetworkModule);
            GetApplicationContextProvider getApplicationContextProvider = new GetApplicationContextProvider(flexDependencies);
            this.getApplicationContextProvider = getApplicationContextProvider;
            DivkitModule_ProvideDivKitFactory create3 = DivkitModule_ProvideDivKitFactory.create(divkitModule, getApplicationContextProvider);
            this.provideDivKitProvider = create3;
            this.provideDivkitDocumentParserExtensionProvider = FlexDocumentParserExtensionsModule_ProvideDivkitDocumentParserExtensionFactory.create(flexDocumentParserExtensionsModule, create3);
            this.provideJasonStateParserExtensionProvider = FlexDocumentParserExtensionsModule_ProvideJasonStateParserExtensionFactory.create(flexDocumentParserExtensionsModule);
            this.provideRemoteActionParserExtensionProvider = FlexDocumentParserExtensionsModule_ProvideRemoteActionParserExtensionFactory.create(flexDocumentParserExtensionsModule);
            this.provideAnimationDocumentParserExtensionProvider = FlexDocumentParserExtensionsModule_ProvideAnimationDocumentParserExtensionFactory.create(flexDocumentParserExtensionsModule, this.provideAnimationSerializerSelectorProvider);
            this.provideNestedActionParserExtensionProvider = FlexDocumentParserExtensionsModule_ProvideNestedActionParserExtensionFactory.create(flexDocumentParserExtensionsModule, this.provideActionParserProvider);
            y2r0 ofDocumentParserExtensionBuilder = setOfDocumentParserExtensionBuilder(divkitModule, flexModule, flexActionDecodersModule, flexActionHandlersModule, flexAnimationsModule, flexContentControllersModule, flexNavigationModule, flexNetworkModule, flexDocumentParserExtensionsModule, flexInterceptorsModule, flexMapiModule, flexParsersModule, flexPayloadExtendersModule, flexScaffoldControllersModule, flexThemeModule, flexDependencies);
            this.setOfDocumentParserExtensionProvider = ofDocumentParserExtensionBuilder;
            FlexNetworkModule_ProvideDocumentJsonProviderFactory create4 = FlexNetworkModule_ProvideDocumentJsonProviderFactory.create(flexNetworkModule, this.provideContentParserProvider, this.provideScaffoldParserProvider, this.provideActionParserProvider, this.provideSharedDataParserProvider, ofDocumentParserExtensionBuilder);
            this.provideDocumentJsonProvider = create4;
            this.provideTemplatedActionHandlerModuleProvider = FlexActionHandlersModule_ProvideTemplatedActionHandlerModuleFactory.create(flexActionHandlersModule, create4);
            this.provideListActionHandlerModuleProvider = FlexActionHandlersModule_ProvideListActionHandlerModuleFactory.create(flexActionHandlersModule);
            this.provideDebuggerProvider = FlexActionHandlersModule_ProvideDebuggerFactory.create(flexActionHandlersModule);
            FlexActionHandlersModule_ProvidePrinterFactory create5 = FlexActionHandlersModule_ProvidePrinterFactory.create(flexActionHandlersModule);
            this.providePrinterProvider = create5;
            FlexActionHandlersModule_ProvideJasonActorFactory create6 = FlexActionHandlersModule_ProvideJasonActorFactory.create(flexActionHandlersModule, this.provideDebuggerProvider, create5);
            this.provideJasonActorProvider = create6;
            this.provideScenarioActionHandlerModuleProvider = FlexActionHandlersModule_ProvideScenarioActionHandlerModuleFactory.create(flexActionHandlersModule, this.provideJasonStateStoreProvider, create6);
            eqh eqhVar = new eqh();
            this.provideFlexRouteHandlerProvider = eqhVar;
            xvf0 b = i5m.b(FlexNavigationModule_ProvideRouteHandlerProviderFactory.create(flexNavigationModule, eqhVar));
            this.provideRouteHandlerProvider = b;
            this.provideNavigationActionHandlerModuleProvider = FlexActionHandlersModule_ProvideNavigationActionHandlerModuleFactory.create(flexActionHandlersModule, b);
            this.getExtraHeadersProvider = new GetExtraHeadersProviderProvider(flexDependencies);
            this.getHostUrlProvider = new GetHostUrlProviderProvider(flexDependencies);
            this.getExtraQueriesProvider = new GetExtraQueriesProviderProvider(flexDependencies);
        }

        private void initialize3(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            this.provideExtraQueryInterceptorProvider = FlexInterceptorsModule_ProvideExtraQueryInterceptorFactory.create(flexInterceptorsModule, this.getExtraQueriesProvider);
            this.setOfInterceptorProvider = setOfInterceptorBuilder(divkitModule, flexModule, flexActionDecodersModule, flexActionHandlersModule, flexAnimationsModule, flexContentControllersModule, flexNavigationModule, flexNetworkModule, flexDocumentParserExtensionsModule, flexInterceptorsModule, flexMapiModule, flexParsersModule, flexPayloadExtendersModule, flexScaffoldControllersModule, flexThemeModule, flexDependencies);
            GetOkHttpClientBuilderProvider getOkHttpClientBuilderProvider = new GetOkHttpClientBuilderProvider(flexDependencies);
            this.getOkHttpClientBuilderProvider = getOkHttpClientBuilderProvider;
            FlexMapiModule_ProvideOkHttpClientFactory create = FlexMapiModule_ProvideOkHttpClientFactory.create(flexMapiModule, this.setOfInterceptorProvider, getOkHttpClientBuilderProvider);
            this.provideOkHttpClientProvider = create;
            this.provideMapiClientProvider = i5m.b(FlexMapiModule_ProvideMapiClientFactory.create(flexMapiModule, this.getActivityProvider, this.provideCoroutineScopeProvider, this.getExtraHeadersProvider, this.getHostUrlProvider, create));
            this.provideActionResponseParserFactoryProvider = FlexActionHandlersModule_ProvideActionResponseParserFactoryFactory.create(flexActionHandlersModule, this.provideDocumentJsonProvider);
            this.provideCoroutineDispatcherProvider = FlexNetworkModule_ProvideCoroutineDispatcherFactory.create(flexNetworkModule);
            FlexActionHandlersModule_ProvideActionServiceErrorHandlerFactory create2 = FlexActionHandlersModule_ProvideActionServiceErrorHandlerFactory.create(flexActionHandlersModule);
            this.provideActionServiceErrorHandlerProvider = create2;
            this.provideActionServiceProvider = FlexActionHandlersModule_ProvideActionServiceFactory.create(flexActionHandlersModule, this.provideMapiClientProvider, this.provideActionResponseParserFactoryProvider, this.provideCoroutineDispatcherProvider, create2);
            this.provideJasonStatePayloadExtenderProvider = FlexPayloadExtendersModule_ProvideJasonStatePayloadExtenderFactory.create(flexPayloadExtendersModule, this.provideJasonStateStoreProvider);
            y2r0 ofPayloadExtenderBuilder = setOfPayloadExtenderBuilder(divkitModule, flexModule, flexActionDecodersModule, flexActionHandlersModule, flexAnimationsModule, flexContentControllersModule, flexNavigationModule, flexNetworkModule, flexDocumentParserExtensionsModule, flexInterceptorsModule, flexMapiModule, flexParsersModule, flexPayloadExtendersModule, flexScaffoldControllersModule, flexThemeModule, flexDependencies);
            this.setOfPayloadExtenderProvider = ofPayloadExtenderBuilder;
            FlexActionHandlersModule_ProvideActionExecutorFactory create3 = FlexActionHandlersModule_ProvideActionExecutorFactory.create(flexActionHandlersModule, this.provideActionServiceProvider, ofPayloadExtenderBuilder);
            this.provideActionExecutorProvider = create3;
            this.provideRemoteActionHandlerModuleProvider = FlexActionHandlersModule_ProvideRemoteActionHandlerModuleFactory.create(flexActionHandlersModule, create3);
            this.provideDocumentActionHandlerModuleProvider = FlexActionHandlersModule_ProvideDocumentActionHandlerModuleFactory.create(flexActionHandlersModule);
            this.setOfActionHandlerModuleProvider = setOfActionHandlerModuleBuilder(divkitModule, flexModule, flexActionDecodersModule, flexActionHandlersModule, flexAnimationsModule, flexContentControllersModule, flexNavigationModule, flexNetworkModule, flexDocumentParserExtensionsModule, flexInterceptorsModule, flexMapiModule, flexParsersModule, flexPayloadExtendersModule, flexScaffoldControllersModule, flexThemeModule, flexDependencies);
            FlexActionHandlersModule_ProvideDelayedActionHandlerModuleFactory create4 = FlexActionHandlersModule_ProvideDelayedActionHandlerModuleFactory.create(flexActionHandlersModule, this.getActivityProvider, this.provideCoroutineScopeProvider);
            this.provideDelayedActionHandlerModuleProvider = create4;
            this.provideActionDispatcherFactoryProvider = FlexActionHandlersModule_ProvideActionDispatcherFactoryFactory.create(flexActionHandlersModule, this.setOfActionHandlerModuleProvider, create4);
            n3w a = n3w.a(flexDependencies);
            this.flexDependenciesProvider = a;
            this.provideDivActionHandlerImplProvider = i5m.b(DivkitModule_ProvideDivActionHandlerImplFactory.create(divkitModule, this.provideDivVariableControllerProvider, a));
            this.getCustomViewFactoryDelegateCreatorProvider = new GetCustomViewFactoryDelegateCreatorProvider(flexDependencies);
            this.getCustomViewConfigurationsProvider = new GetCustomViewConfigurationsProvider(flexDependencies);
            xvf0 b = i5m.b(DivkitModule_ProvideBduiVariableControllerFactory.create(divkitModule, this.provideDivVariableControllerProvider));
            this.provideBduiVariableControllerProvider = b;
            this.provideDivCustomContainerViewAdapterProvider = i5m.b(DivkitModule_ProvideDivCustomContainerViewAdapterFactory.create(divkitModule, this.getCustomViewFactoryDelegateCreatorProvider, this.getCustomViewConfigurationsProvider, b));
            this.provideDivkitTypefaceProvider = i5m.b(DivkitModule_ProvideDivkitTypefaceProviderFactory.create(divkitModule, this.getApplicationContextProvider));
            this.getFontScaleOverrideProvider = new GetFontScaleOverrideProvider(flexDependencies);
        }

        private void initialize4(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            this.galleryScrollPositionExtensionHandlerProvider = GalleryScrollPositionExtensionHandler_Factory.create(this.getApplicationContextProvider, this.provideDivVariableControllerProvider);
            this.provideInputSecureExtensionHandlerProvider = i5m.b(DivkitModule_ProvideInputSecureExtensionHandlerFactory.create(divkitModule));
            this.provideShimmerDrawableProvider = i5m.b(FlexModule_ProvideShimmerDrawableProviderFactory.create(flexModule));
            GetThemeProviderProvider getThemeProviderProvider = new GetThemeProviderProvider(flexDependencies);
            this.getThemeProvider = getThemeProviderProvider;
            xvf0 b = i5m.b(DivkitModule_ProvideShimmerDivHandlerFactory.create(divkitModule, this.provideShimmerDrawableProvider, getThemeProviderProvider));
            this.provideShimmerDivHandlerProvider = b;
            DivkitModule_ProvideDiv2ContextFactory create = DivkitModule_ProvideDiv2ContextFactory.create(divkitModule, this.provideDivActionHandlerImplProvider, this.getApplicationContextProvider, this.provideDivCustomContainerViewAdapterProvider, this.provideDivkitTypefaceProvider, this.provideDivVariableControllerProvider, this.flexDependenciesProvider, this.getFontScaleOverrideProvider, this.galleryScrollPositionExtensionHandlerProvider, this.provideInputSecureExtensionHandlerProvider, b);
            this.provideDiv2ContextProvider = create;
            this.provideDivkitContentControllerFactoryProvider = FlexContentControllersModule_ProvideDivkitContentControllerFactoryFactory.create(flexContentControllersModule, create);
            this.provideSkeletonContentControllerFactoryProvider = FlexContentControllersModule_ProvideSkeletonContentControllerFactoryFactory.create(flexContentControllersModule, this.getThemeProvider);
            ei00 mapOfClassOfAndContentControllerFactoryBuilder = mapOfClassOfAndContentControllerFactoryBuilder(divkitModule, flexModule, flexActionDecodersModule, flexActionHandlersModule, flexAnimationsModule, flexContentControllersModule, flexNavigationModule, flexNetworkModule, flexDocumentParserExtensionsModule, flexInterceptorsModule, flexMapiModule, flexParsersModule, flexPayloadExtendersModule, flexScaffoldControllersModule, flexThemeModule, flexDependencies);
            this.mapOfClassOfAndContentControllerFactoryProvider = mapOfClassOfAndContentControllerFactoryBuilder;
            this.provideContentControllerAdapterProvider = FlexContentControllersModule_ProvideContentControllerAdapterFactory.create(flexContentControllersModule, mapOfClassOfAndContentControllerFactoryBuilder);
            GetRenderingEventsListenerProvider getRenderingEventsListenerProvider = new GetRenderingEventsListenerProvider(flexDependencies);
            this.getRenderingEventsListenerProvider = getRenderingEventsListenerProvider;
            this.provideDecodingVelocityMonitoringProvider = FlexNetworkModule_ProvideDecodingVelocityMonitoringFactory.create(flexNetworkModule, getRenderingEventsListenerProvider);
            this.provideDocumentResponseParserFactoryProvider = FlexNetworkModule_ProvideDocumentResponseParserFactoryFactory.create(flexNetworkModule, this.provideDocumentJsonProvider);
            GetErrorHandlerProvider getErrorHandlerProvider = new GetErrorHandlerProvider(flexDependencies);
            this.getErrorHandlerProvider = getErrorHandlerProvider;
            this.provideDocumentServiceErrorHandlerProvider = FlexNetworkModule_ProvideDocumentServiceErrorHandlerFactory.create(flexNetworkModule, getErrorHandlerProvider);
            FlexNetworkModule_ProvideNetworkCachingFactory create2 = FlexNetworkModule_ProvideNetworkCachingFactory.create(flexNetworkModule);
            this.provideNetworkCachingProvider = create2;
            this.provideDocumentLoaderProvider = i5m.b(FlexNetworkModule_ProvideDocumentLoaderFactory.create(flexNetworkModule, this.provideCoroutineDispatcherProvider, this.provideDecodingVelocityMonitoringProvider, this.provideDocumentResponseParserFactoryProvider, this.provideDocumentServiceErrorHandlerProvider, this.provideMapiClientProvider, create2, this.setOfPayloadExtenderProvider));
            GetEventHandlerProvider getEventHandlerProvider = new GetEventHandlerProvider(flexDependencies);
            this.getEventHandlerProvider = getEventHandlerProvider;
            this.provideDocumentTrackerProvider = FlexModule_ProvideDocumentTrackerFactory.create(flexModule, getEventHandlerProvider, this.getRenderingEventsListenerProvider);
            this.isEngineErrorViewEnabledProvider = new IsEngineErrorViewEnabledProvider(flexDependencies);
            this.getRouterProvider = new GetRouterProviderProvider(flexDependencies);
            xvf0 b2 = i5m.b(DivkitModule_ProvideDivkitThemeChangeListenerFactory.create(divkitModule, this.provideDivVariableControllerProvider));
            this.provideDivkitThemeChangeListenerProvider = b2;
            xvf0 b3 = i5m.b(FlexThemeModule_ProvideThemeControllerFactory.create(flexThemeModule, this.getThemeProvider, b2));
            this.provideThemeControllerProvider = b3;
            FlexThemeModule_ProvideThemedColorResolverFactory create3 = FlexThemeModule_ProvideThemedColorResolverFactory.create(flexThemeModule, b3);
            this.provideThemedColorResolverProvider = create3;
            this.provideDivkitScaffoldControllerFactoryProvider = FlexScaffoldControllersModule_ProvideDivkitScaffoldControllerFactoryFactory.create(flexScaffoldControllersModule, this.provideDiv2ContextProvider, create3);
        }

        private void initialize5(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            ei00 mapOfClassOfAndScaffoldControllerFactoryBuilder = mapOfClassOfAndScaffoldControllerFactoryBuilder(divkitModule, flexModule, flexActionDecodersModule, flexActionHandlersModule, flexAnimationsModule, flexContentControllersModule, flexNavigationModule, flexNetworkModule, flexDocumentParserExtensionsModule, flexInterceptorsModule, flexMapiModule, flexParsersModule, flexPayloadExtendersModule, flexScaffoldControllersModule, flexThemeModule, flexDependencies);
            this.mapOfClassOfAndScaffoldControllerFactoryProvider = mapOfClassOfAndScaffoldControllerFactoryBuilder;
            FlexScaffoldControllersModule_ProvideScaffoldControllerAdapterFactory create = FlexScaffoldControllersModule_ProvideScaffoldControllerAdapterFactory.create(flexScaffoldControllersModule, mapOfClassOfAndScaffoldControllerFactoryBuilder);
            this.provideScaffoldControllerAdapterProvider = create;
            xvf0 b = i5m.b(FlexModule_ProvideDocumentEngineCreatorHolderFactory.create(flexModule, this.provideActionDispatcherFactoryProvider, this.provideContentControllerAdapterProvider, this.provideDocumentLoaderProvider, this.provideDocumentTrackerProvider, this.flexDependenciesProvider, this.isEngineErrorViewEnabledProvider, this.getRouterProvider, create));
            this.provideDocumentEngineCreatorHolderProvider = b;
            this.provideBottomSheetFragmentFactoryProvider = FlexNavigationModule_ProvideBottomSheetFragmentFactoryFactory.create(flexNavigationModule, b);
            this.getContainerProvider = new GetContainerProviderProvider(flexDependencies);
            this.provideDialogFragmentFactoryProvider = FlexNavigationModule_ProvideDialogFragmentFactoryFactory.create(flexNavigationModule, this.provideDocumentEngineCreatorHolderProvider);
            this.getFirstInteractionEventsListenerProvider = new GetFirstInteractionEventsListenerProvider(flexDependencies);
            this.provideFlexOverlayControllerFactoryProvider = i5m.b(FlexNavigationModule_ProvideFlexOverlayControllerFactoryFactory.create(flexNavigationModule, this.getActivityProvider, this.provideDocumentEngineCreatorHolderProvider, this.flexDependenciesProvider));
            this.provideFragmentFactoryProvider = FlexNavigationModule_ProvideFragmentFactoryFactory.create(flexNavigationModule, this.provideDocumentEngineCreatorHolderProvider);
            this.getFragmentManagerProvider = new GetFragmentManagerProviderProvider(flexDependencies);
            this.provideOverlayManagerProvider = i5m.b(FlexNavigationModule_ProvideOverlayManagerFactory.create(flexNavigationModule));
            IsSpinnerPreviewEnabledProvider isSpinnerPreviewEnabledProvider = new IsSpinnerPreviewEnabledProvider(flexDependencies);
            this.isSpinnerPreviewEnabledProvider = isSpinnerPreviewEnabledProvider;
            xvf0 b2 = i5m.b(FlexModule_ProvidePreviewLoaderFactory.create(flexModule, this.getApplicationContextProvider, isSpinnerPreviewEnabledProvider, this.provideDocumentJsonProvider));
            this.providePreviewLoaderProvider = b2;
            eqh.a(this.provideFlexRouteHandlerProvider, i5m.b(FlexNavigationModule_ProvideFlexRouteHandlerFactory.create(flexNavigationModule, this.provideBottomSheetFragmentFactoryProvider, this.getContainerProvider, this.provideDialogFragmentFactoryProvider, this.getFirstInteractionEventsListenerProvider, this.provideFlexOverlayControllerFactoryProvider, this.getActivityProvider, this.provideFragmentFactoryProvider, this.getFragmentManagerProvider, this.provideOverlayManagerProvider, b2, this.getRouterProvider)));
        }

        public ku actionDecoderFactory() {
            return FlexActionDecodersModule_ProvideActionDecoderFactoryFactory.provideActionDecoderFactory(this.flexActionDecodersModule, setOfActionDecoderModule());
        }

        public zw actionParser() {
            return FlexParsersModule_ProvideActionParserFactory.provideActionParser(this.flexParsersModule, actionSerializerSelector());
        }

        public cy actionSerializerSelector() {
            return FlexParsersModule_ProvideActionSerializerSelectorFactory.provideActionSerializerSelector(this.flexParsersModule, actionDecoderFactory());
        }

        public ihe contentParser() {
            FlexParsersModule flexParsersModule = this.flexParsersModule;
            return FlexParsersModule_ProvideContentParserFactory.provideContentParser(flexParsersModule, FlexParsersModule_ProvideContentSerializerSelectorFactory.provideContentSerializerSelector(flexParsersModule));
        }

        public hxk divKit() {
            DivkitModule divkitModule = this.divkitModule;
            Context applicationContext = this.flexDependencies.getApplicationContext();
            q5z.h(applicationContext);
            return DivkitModule_ProvideDivKitFactory.provideDivKit(divkitModule, applicationContext);
        }

        public d0m documentJsonProvider() {
            return FlexNetworkModule_ProvideDocumentJsonProviderFactory.provideDocumentJsonProvider(this.flexNetworkModule, contentParser(), scaffoldParser(), actionParser(), FlexNetworkModule_ProvideSharedDataParserFactory.provideSharedDataParser(this.flexNetworkModule), setOfDocumentParserExtension());
        }

        @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent
        public p85 getActivityProvider() {
            p85 activityProvider = this.flexDependencies.getActivityProvider();
            q5z.h(activityProvider);
            return activityProvider;
        }

        @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent
        public sh5 getBduiStateManager() {
            return (sh5) this.provideBduiStateManagerProvider.get();
        }

        @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent
        public p85 getContainerProvider() {
            p85 containerProvider = this.flexDependencies.getContainerProvider();
            q5z.h(containerProvider);
            return containerProvider;
        }

        @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent
        public tse getCoroutineScope() {
            return (tse) this.provideCoroutineScopeProvider.get();
        }

        @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent
        public Div2ViewLocator getDiv2ViewLocator() {
            return (Div2ViewLocator) this.div2ViewLocatorProvider.get();
        }

        @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent
        public a getDivVariableController() {
            return (a) this.provideDivVariableControllerProvider.get();
        }

        @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent
        public core.divkit.state.a getDivkitStateDaemon() {
            return (core.divkit.state.a) this.provideDivkitStateDaemonProvider.get();
        }

        @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent
        public DocumentJsonParser getDocumentJsonParser() {
            return new DocumentJsonParser(documentJsonProvider());
        }

        @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent
        public k6x getJasonStateStore() {
            return (k6x) this.provideJasonStateStoreProvider.get();
        }

        @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent
        public FlexRouteHandler getRouteHandler() {
            return (FlexRouteHandler) this.provideFlexRouteHandlerProvider.get();
        }

        @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent
        public pvy0 getThemeController() {
            return (pvy0) this.provideThemeControllerProvider.get();
        }

        public ei00 mapOfClassOfAndContentControllerFactoryBuilder(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            int i = ei00.b;
            LinkedHashMap A = gtq0.A(2);
            xvf0 xvf0Var = this.provideDivkitContentControllerFactoryProvider;
            q5z.g(xvf0Var, "provider");
            A.put(etl.class, xvf0Var);
            xvf0 xvf0Var2 = this.provideSkeletonContentControllerFactoryProvider;
            q5z.g(xvf0Var2, "provider");
            A.put(aks0.class, xvf0Var2);
            return new ei00(A);
        }

        public ei00 mapOfClassOfAndScaffoldControllerFactoryBuilder(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            int i = ei00.b;
            LinkedHashMap A = gtq0.A(1);
            xvf0 xvf0Var = this.provideDivkitScaffoldControllerFactoryProvider;
            q5z.g(xvf0Var, "provider");
            A.put(wul.class, xvf0Var);
            return new ei00(A);
        }

        public r1m provideAnimationDocumentParserExtension() {
            return FlexDocumentParserExtensionsModule_ProvideAnimationDocumentParserExtensionFactory.provideAnimationDocumentParserExtension(this.flexDocumentParserExtensionsModule, (fj2) this.provideAnimationSerializerSelectorProvider.get());
        }

        public lu provideCustomActionDecoderModule() {
            FlexActionDecodersModule flexActionDecodersModule = this.flexActionDecodersModule;
            List<kg5> actionsInfo = this.flexDependencies.getActionsInfo();
            q5z.h(actionsInfo);
            return FlexActionDecodersModule_ProvideCustomActionDecoderModuleFactory.provideCustomActionDecoderModule(flexActionDecodersModule, actionsInfo);
        }

        public r1m provideDivkitDocumentParserExtension() {
            return FlexDocumentParserExtensionsModule_ProvideDivkitDocumentParserExtensionFactory.provideDivkitDocumentParserExtension(this.flexDocumentParserExtensionsModule, divKit());
        }

        public r1m provideNestedActionParserExtension() {
            return FlexDocumentParserExtensionsModule_ProvideNestedActionParserExtensionFactory.provideNestedActionParserExtension(this.flexDocumentParserExtensionsModule, actionParser());
        }

        public ekm0 scaffoldParser() {
            FlexParsersModule flexParsersModule = this.flexParsersModule;
            return FlexParsersModule_ProvideScaffoldParserFactory.provideScaffoldParser(flexParsersModule, FlexParsersModule_ProvideScaffoldSerializerSelectorFactory.provideScaffoldSerializerSelector(flexParsersModule));
        }

        public Set<lu> setOfActionDecoderModule() {
            c2r0 c2r0Var = new c2r0(8, 0);
            c2r0Var.a(FlexActionDecodersModule_ProvideRemoteActionDecoderModuleFactory.provideRemoteActionDecoderModule(this.flexActionDecodersModule));
            c2r0Var.a(FlexActionDecodersModule_ProvideScenarioActionDecoderModuleFactory.provideScenarioActionDecoderModule(this.flexActionDecodersModule));
            c2r0Var.a(FlexActionDecodersModule_ProvideListActionDecoderModuleFactory.provideListActionDecoderModule(this.flexActionDecodersModule));
            c2r0Var.a(FlexActionDecodersModule_ProvideNavigationActionDecoderModuleFactory.provideNavigationActionDecoderModule(this.flexActionDecodersModule));
            c2r0Var.a(FlexActionDecodersModule_ProvideTimedActionDecoderModuleFactory.provideTimedActionDecoderModule(this.flexActionDecodersModule));
            c2r0Var.a(FlexActionDecodersModule_ProvideTemplatedActionDecoderModuleFactory.provideTemplatedActionDecoderModule(this.flexActionDecodersModule));
            c2r0Var.a(provideCustomActionDecoderModule());
            c2r0Var.a(FlexActionDecodersModule_ProvideDocumentActionDecoderModuleFactory.provideDocumentActionDecoderModule(this.flexActionDecodersModule));
            return c2r0Var.c();
        }

        public y2r0 setOfActionDecoderModuleBuilder(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            n3w n3wVar = y2r0.c;
            ArrayList arrayList = new ArrayList(8);
            List list = Collections.EMPTY_LIST;
            arrayList.add(this.provideRemoteActionDecoderModuleProvider);
            arrayList.add(this.provideScenarioActionDecoderModuleProvider);
            arrayList.add(this.provideListActionDecoderModuleProvider);
            arrayList.add(this.provideNavigationActionDecoderModuleProvider);
            arrayList.add(this.provideTimedActionDecoderModuleProvider);
            arrayList.add(this.provideTemplatedActionDecoderModuleProvider);
            arrayList.add(this.provideCustomActionDecoderModuleProvider);
            return g8e.g(arrayList, this.provideDocumentActionDecoderModuleProvider, arrayList, list);
        }

        public y2r0 setOfActionHandlerModuleBuilder(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            n3w n3wVar = y2r0.c;
            ArrayList arrayList = new ArrayList(8);
            List list = Collections.EMPTY_LIST;
            arrayList.add(this.provideCustomActionHandlerModuleProvider);
            arrayList.add(this.provideTimedActionHandlerModuleProvider);
            arrayList.add(this.provideTemplatedActionHandlerModuleProvider);
            arrayList.add(this.provideListActionHandlerModuleProvider);
            arrayList.add(this.provideScenarioActionHandlerModuleProvider);
            arrayList.add(this.provideNavigationActionHandlerModuleProvider);
            arrayList.add(this.provideRemoteActionHandlerModuleProvider);
            return g8e.g(arrayList, this.provideDocumentActionHandlerModuleProvider, arrayList, list);
        }

        public Set<r1m> setOfDocumentParserExtension() {
            c2r0 c2r0Var = new c2r0(5, 0);
            c2r0Var.a(provideDivkitDocumentParserExtension());
            c2r0Var.a(FlexDocumentParserExtensionsModule_ProvideJasonStateParserExtensionFactory.provideJasonStateParserExtension(this.flexDocumentParserExtensionsModule));
            c2r0Var.a(FlexDocumentParserExtensionsModule_ProvideRemoteActionParserExtensionFactory.provideRemoteActionParserExtension(this.flexDocumentParserExtensionsModule));
            c2r0Var.a(provideAnimationDocumentParserExtension());
            c2r0Var.a(provideNestedActionParserExtension());
            return c2r0Var.c();
        }

        public y2r0 setOfDocumentParserExtensionBuilder(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            n3w n3wVar = y2r0.c;
            ArrayList arrayList = new ArrayList(5);
            List list = Collections.EMPTY_LIST;
            arrayList.add(this.provideDivkitDocumentParserExtensionProvider);
            arrayList.add(this.provideJasonStateParserExtensionProvider);
            arrayList.add(this.provideRemoteActionParserExtensionProvider);
            arrayList.add(this.provideAnimationDocumentParserExtensionProvider);
            return g8e.g(arrayList, this.provideNestedActionParserExtensionProvider, arrayList, list);
        }

        public y2r0 setOfInterceptorBuilder(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            n3w n3wVar = y2r0.c;
            ArrayList arrayList = new ArrayList(1);
            return g8e.g(arrayList, this.provideExtraQueryInterceptorProvider, arrayList, Collections.EMPTY_LIST);
        }

        public y2r0 setOfPayloadExtenderBuilder(DivkitModule divkitModule, FlexModule flexModule, FlexActionDecodersModule flexActionDecodersModule, FlexActionHandlersModule flexActionHandlersModule, FlexAnimationsModule flexAnimationsModule, FlexContentControllersModule flexContentControllersModule, FlexNavigationModule flexNavigationModule, FlexNetworkModule flexNetworkModule, FlexDocumentParserExtensionsModule flexDocumentParserExtensionsModule, FlexInterceptorsModule flexInterceptorsModule, FlexMapiModule flexMapiModule, FlexParsersModule flexParsersModule, FlexPayloadExtendersModule flexPayloadExtendersModule, FlexScaffoldControllersModule flexScaffoldControllersModule, FlexThemeModule flexThemeModule, FlexDependencies flexDependencies) {
            n3w n3wVar = y2r0.c;
            ArrayList arrayList = new ArrayList(1);
            return g8e.g(arrayList, this.provideJasonStatePayloadExtenderProvider, arrayList, Collections.EMPTY_LIST);
        }
    }

    private DaggerFlexComponent() {
    }

    public static FlexComponent.Factory factory() {
        return new Factory(0);
    }

    public static final class Factory implements FlexComponent.Factory {
        public /* synthetic */ Factory(int i) {
            this();
        }

        @Override // com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent.Factory
        public FlexComponent create(FlexDependencies flexDependencies) {
            flexDependencies.getClass();
            return new FlexComponentImpl(new DivkitModule(), new FlexModule(), new FlexActionDecodersModule(), new FlexActionHandlersModule(), new FlexAnimationsModule(), new FlexContentControllersModule(), new FlexNavigationModule(), new FlexNetworkModule(), new FlexDocumentParserExtensionsModule(), new FlexInterceptorsModule(), new FlexMapiModule(), new FlexParsersModule(), new FlexPayloadExtendersModule(), new FlexScaffoldControllersModule(), new FlexThemeModule(), flexDependencies);
        }

        private Factory() {
        }
    }
}
