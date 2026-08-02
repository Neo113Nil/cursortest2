package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import android.util.Log;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.custom.CustomActionHandlerModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.delayed.DelayedActionHandlerModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.errorhandler.ActionServiceErrorHandlerImpl;
import defpackage.b5x;
import defpackage.bvf0;
import defpackage.d0m;
import defpackage.d650;
import defpackage.ew;
import defpackage.fw;
import defpackage.hv90;
import defpackage.hy;
import defpackage.iy;
import defpackage.jqy;
import defpackage.jse;
import defpackage.k6x;
import defpackage.kg5;
import defpackage.kr;
import defpackage.lu00;
import defpackage.lui0;
import defpackage.p85;
import defpackage.r3l0;
import defpackage.rcc;
import defpackage.rid;
import defpackage.t5x;
import defpackage.t8z0;
import defpackage.tse;
import defpackage.u4x;
import defpackage.ux;
import defpackage.wfr;
import defpackage.xfr;
import defpackage.xv;
import defpackage.yu;
import defpackage.zgl;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0017\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0005H\u0007¢\u0006\u0004\b/\u0010 J\u001f\u00104\u001a\u00020#2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000200H\u0007¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u000202H\u0007¢\u0006\u0004\b8\u00109J%\u0010>\u001a\u00020+2\u0006\u0010;\u001a\u00020:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0004H\u0007¢\u0006\u0004\b>\u0010?J/\u0010H\u001a\u00020:2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0007¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020B2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020FH\u0007¢\u0006\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/action/FlexActionHandlersModule;", "", "<init>", "()V", "", "Lfw;", "actionHandlerModules", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/handler/delayed/DelayedActionHandlerModule;", "delayedActionHandlerModule", "Lyu;", "provideActionDispatcherFactory", "(Ljava/util/Set;Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/handler/delayed/DelayedActionHandlerModule;)Lyu;", "Lp85;", "Landroidx/fragment/app/FragmentActivity;", "activityProvider", "Ltse;", "coroutineScope", "provideDelayedActionHandlerModule", "(Lp85;Ltse;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/handler/delayed/DelayedActionHandlerModule;", "", "Lkg5;", "Lig5;", "actionsInfo", "provideCustomActionHandlerModule", "(Ljava/util/List;Lp85;)Lfw;", "provideTimedActionHandlerModule", "(Ltse;)Lfw;", "Ld0m;", "documentJsonProvider", "provideTemplatedActionHandlerModule", "(Ld0m;)Lfw;", "provideListActionHandlerModule", "()Lfw;", "Lk6x;", "jasonStateStore", "Lu4x;", "jasonActor", "provideScenarioActionHandlerModule", "(Lk6x;Lu4x;)Lfw;", "Lr3l0;", "routeHandlerProvider", "provideNavigationActionHandlerModule", "(Lr3l0;)Lfw;", "Lxv;", "executor", "provideRemoteActionHandlerModule", "(Lxv;)Lfw;", "provideDocumentActionHandlerModule", "Lb5x;", "debugger", "Lt5x;", "printer", "provideJasonActor", "(Lb5x;Lt5x;)Lu4x;", "provideDebugger", "()Lb5x;", "providePrinter", "()Lt5x;", "Lhy;", "actionService", "Lhv90;", "payloadExtenders", "provideActionExecutor", "(Lhy;Ljava/util/Set;)Lxv;", "Llu00;", "mapiClient", "Lux;", "parserFactory", "Ljse;", "networkDispatcher", "Liy;", "actionServiceErrorHandler", "provideActionService", "(Llu00;Lux;Ljse;Liy;)Lhy;", "provideActionResponseParserFactory", "(Ld0m;)Lux;", "provideActionServiceErrorHandler", "()Liy;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexActionHandlersModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideActionDispatcherFactory$lambda$1(kr krVar, Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void providePrinter$lambda$3(Object obj) {
        Log.i("JasonStatham", "message [" + obj + "]");
    }

    public final yu provideActionDispatcherFactory(Set<fw> actionHandlerModules, DelayedActionHandlerModule delayedActionHandlerModule) {
        ListBuilder a = rcc.a();
        a.add(delayedActionHandlerModule);
        a.addAll(a.J0(actionHandlerModules));
        return new yu(new rid(a.j()), new zgl(28));
    }

    public final xv provideActionExecutor(hy actionService, Set<hv90> payloadExtenders) {
        return new flex.core.action.remote.executor.a(actionService, a.J0(payloadExtenders));
    }

    public final ux provideActionResponseParserFactory(d0m documentJsonProvider) {
        return new ux(documentJsonProvider);
    }

    public final hy provideActionService(lu00 mapiClient, ux parserFactory, jse networkDispatcher, iy actionServiceErrorHandler) {
        return new hy(mapiClient, parserFactory, networkDispatcher, actionServiceErrorHandler, null, null, null, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
    }

    public final iy provideActionServiceErrorHandler() {
        return new ActionServiceErrorHandlerImpl();
    }

    public final fw provideCustomActionHandlerModule(List<kg5> actionsInfo, p85 activityProvider) {
        return new CustomActionHandlerModule(actionsInfo, activityProvider);
    }

    public final b5x provideDebugger() {
        return new wfr();
    }

    public final DelayedActionHandlerModule provideDelayedActionHandlerModule(p85 activityProvider, tse coroutineScope) {
        return new DelayedActionHandlerModule(activityProvider, coroutineScope);
    }

    public final fw provideDocumentActionHandlerModule() {
        return new jqy(1);
    }

    public final u4x provideJasonActor(b5x debugger, t5x printer) {
        return new u4x(printer, debugger, 12);
    }

    public final fw provideListActionHandlerModule() {
        return jqy.b;
    }

    public final fw provideNavigationActionHandlerModule(r3l0 routeHandlerProvider) {
        return new d650(routeHandlerProvider);
    }

    public final t5x providePrinter() {
        return new xfr();
    }

    public final fw provideRemoteActionHandlerModule(xv executor) {
        return new lui0(executor, bvf0.b());
    }

    public final fw provideScenarioActionHandlerModule(k6x jasonStateStore, u4x jasonActor) {
        return new lui0(jasonStateStore, jasonActor);
    }

    public final fw provideTemplatedActionHandlerModule(d0m documentJsonProvider) {
        return new ew(1, documentJsonProvider);
    }

    public final fw provideTimedActionHandlerModule(tse coroutineScope) {
        return new t8z0(coroutineScope, FlexActionHandlersModule$provideTimedActionHandlerModule$1.INSTANCE);
    }
}
