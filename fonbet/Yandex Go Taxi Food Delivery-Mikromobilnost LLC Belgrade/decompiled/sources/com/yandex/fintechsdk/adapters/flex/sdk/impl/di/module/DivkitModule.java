package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.expression.variables.a;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.BduiVariableControllerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action.DivActionHandlerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.customview.DivCustomContainerViewAdapterImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.gallery.GalleryScrollPositionExtensionHandler;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.image.CustomDivImageLoader;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.input.InputSecureExtensionHandler;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDrawableProvider;
import defpackage.gzr;
import defpackage.hxk;
import defpackage.k6x;
import defpackage.mwl;
import defpackage.plk;
import defpackage.qmf;
import defpackage.tjk;
import defpackage.vh5;
import defpackage.y6k;
import defpackage.zh5;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012Ja\u0010&\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0019H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010*\u001a\u00020\u0019H\u0007¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0019H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u0002052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b6\u00107J\u001f\u0010<\u001a\u00020#2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020!H\u0007¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u00020\u00172\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/DivkitModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lhxk;", "provideDivKit", "(Landroid/content/Context;)Lhxk;", "Lqmf;", "customViewFactoryDelegateCreator", "", "", "customViewConfigurations", "Lzh5;", "bduiVariableController", "Lplk;", "provideDivCustomContainerViewAdapter", "(Lqmf;Ljava/util/Map;Lzh5;)Lplk;", "Ly6k;", "actionHandler", "applicationContext", "divCustomContainerViewAdapter", "Lmwl;", "divkitTypeFaceProvider", "Lcom/yandex/div/core/expression/variables/a;", "divVariableController", "Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;", "flexDependencies", "Lgzr;", "fontScaleOverride", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/gallery/GalleryScrollPositionExtensionHandler;", "galleryScrollPositionExtensionHandler", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/input/InputSecureExtensionHandler;", "inputSecureExtensionHandler", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDivHandler;", "shimmerDivHandler", "Lcom/yandex/div/core/Div2Context;", "provideDiv2Context", "(Ly6k;Landroid/content/Context;Lplk;Lmwl;Lcom/yandex/div/core/expression/variables/a;Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;Lgzr;Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/gallery/GalleryScrollPositionExtensionHandler;Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/input/InputSecureExtensionHandler;Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDivHandler;)Lcom/yandex/div/core/Div2Context;", "Lk6x;", "jasonStateStore", "variableController", "Lcore/divkit/state/a;", "provideDivkitStateDaemon", "(Lk6x;Lcom/yandex/div/core/expression/variables/a;)Lcore/divkit/state/a;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/DivkitThemeChangeListener;", "provideDivkitThemeChangeListener", "(Lcom/yandex/div/core/expression/variables/a;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/DivkitThemeChangeListener;", "provideDivVariableController", "()Lcom/yandex/div/core/expression/variables/a;", "provideBduiVariableController", "(Lcom/yandex/div/core/expression/variables/a;)Lzh5;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/action/DivActionHandlerImpl;", "provideDivActionHandlerImpl", "(Lcom/yandex/div/core/expression/variables/a;Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/action/DivActionHandlerImpl;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawableProvider;", "shimmerDrawableProvider", "Lvh5;", "themeProvider", "provideShimmerDivHandler", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawableProvider;Lvh5;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDivHandler;", "provideInputSecureExtensionHandler", "()Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/input/InputSecureExtensionHandler;", "provideDivkitTypefaceProvider", "(Landroid/content/Context;)Lmwl;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DivkitModule {
    public final zh5 provideBduiVariableController(a divVariableController) {
        return new BduiVariableControllerImpl(divVariableController);
    }

    public final Div2Context provideDiv2Context(y6k actionHandler, Context applicationContext, plk divCustomContainerViewAdapter, mwl divkitTypeFaceProvider, a divVariableController, FlexDependencies flexDependencies, gzr fontScaleOverride, GalleryScrollPositionExtensionHandler galleryScrollPositionExtensionHandler, InputSecureExtensionHandler inputSecureExtensionHandler, ShimmerDivHandler shimmerDivHandler) {
        Resources.Theme theme;
        FragmentActivity fragmentActivity = (FragmentActivity) flexDependencies.getActivityProvider().a();
        if (fragmentActivity != null) {
            applicationContext = fragmentActivity;
        }
        Integer divKitThemeResId = flexDependencies.getDivKitThemeResId();
        if (divKitThemeResId != null) {
            theme = applicationContext.getResources().newTheme();
            theme.applyStyle(divKitThemeResId.intValue(), true);
        } else {
            theme = applicationContext.getTheme();
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(applicationContext, theme);
        tjk tjkVar = new tjk(new CustomDivImageLoader(contextThemeWrapper));
        tjkVar.e = divCustomContainerViewAdapter;
        tjkVar.j = divVariableController;
        tjkVar.b = actionHandler;
        tjkVar.b(shimmerDivHandler);
        tjkVar.b(inputSecureExtensionHandler);
        tjkVar.b(galleryScrollPositionExtensionHandler);
        tjkVar.q = false;
        tjkVar.h = divkitTypeFaceProvider;
        return new Div2Context(contextThemeWrapper, tjkVar.a(), 0, null, 12, null);
    }

    public final DivActionHandlerImpl provideDivActionHandlerImpl(a divVariableController, FlexDependencies flexDependencies) {
        return new DivActionHandlerImpl(flexDependencies.getDivActionHandlers(), divVariableController);
    }

    public final plk provideDivCustomContainerViewAdapter(qmf customViewFactoryDelegateCreator, Map<String, Object> customViewConfigurations, zh5 bduiVariableController) {
        return new DivCustomContainerViewAdapterImpl(customViewFactoryDelegateCreator, customViewConfigurations, bduiVariableController);
    }

    public final hxk provideDivKit(Context context) {
        return hxk.b.m(context);
    }

    public final a provideDivVariableController() {
        return new a(null);
    }

    public final core.divkit.state.a provideDivkitStateDaemon(k6x jasonStateStore, a variableController) {
        return new core.divkit.state.a(jasonStateStore, variableController);
    }

    public final DivkitThemeChangeListener provideDivkitThemeChangeListener(a variableController) {
        return new DivkitThemeChangeListener(variableController);
    }

    public final mwl provideDivkitTypefaceProvider(Context context) {
        return new mwl(context);
    }

    public final InputSecureExtensionHandler provideInputSecureExtensionHandler() {
        return new InputSecureExtensionHandler();
    }

    public final ShimmerDivHandler provideShimmerDivHandler(ShimmerDrawableProvider shimmerDrawableProvider, vh5 themeProvider) {
        return new ShimmerDivHandler(shimmerDrawableProvider, themeProvider);
    }
}
