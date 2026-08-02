package com.yandex.fintechsdk.adapters.flex.sdk.impl.di;

import com.yandex.div.core.expression.variables.a;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action.Div2ViewLocator;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandler;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.utils.DocumentJsonParser;
import defpackage.fbr;
import defpackage.k6x;
import defpackage.p85;
import defpackage.pvy0;
import defpackage.sh5;
import defpackage.tse;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0001.R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponent;", "Lfbr;", "Lp85;", "Landroidx/fragment/app/FragmentActivity;", "getActivityProvider", "()Lp85;", "activityProvider", "Lsh5;", "getBduiStateManager", "()Lsh5;", "bduiStateManager", "Landroid/view/ViewGroup;", "getContainerProvider", "containerProvider", "Ltse;", "getCoroutineScope", "()Ltse;", "coroutineScope", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/action/Div2ViewLocator;", "getDiv2ViewLocator", "()Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/action/Div2ViewLocator;", "div2ViewLocator", "Lcore/divkit/state/a;", "getDivkitStateDaemon", "()Lcore/divkit/state/a;", "divkitStateDaemon", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/utils/DocumentJsonParser;", "getDocumentJsonParser", "()Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/utils/DocumentJsonParser;", "documentJsonParser", "Lcom/yandex/div/core/expression/variables/a;", "getDivVariableController", "()Lcom/yandex/div/core/expression/variables/a;", "divVariableController", "Lk6x;", "getJasonStateStore", "()Lk6x;", "jasonStateStore", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/navigation/FlexRouteHandler;", "getRouteHandler", "()Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/navigation/FlexRouteHandler;", "routeHandler", "Lpvy0;", "getThemeController", "()Lpvy0;", "themeController", "Factory", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface FlexComponent extends fbr {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponent$Factory;", "", "create", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponent;", "dependencies", "Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        FlexComponent create(FlexDependencies dependencies);
    }

    p85 getActivityProvider();

    sh5 getBduiStateManager();

    p85 getContainerProvider();

    tse getCoroutineScope();

    Div2ViewLocator getDiv2ViewLocator();

    a getDivVariableController();

    core.divkit.state.a getDivkitStateDaemon();

    DocumentJsonParser getDocumentJsonParser();

    k6x getJasonStateStore();

    FlexRouteHandler getRouteHandler();

    pvy0 getThemeController();
}
