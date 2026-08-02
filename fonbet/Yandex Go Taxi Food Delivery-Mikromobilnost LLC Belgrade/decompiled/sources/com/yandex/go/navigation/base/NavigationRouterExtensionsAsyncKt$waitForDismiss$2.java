package com.yandex.go.navigation.base;

import androidx.lifecycle.Lifecycle;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/lifecycle/Lifecycle$Event;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigation.base.NavigationRouterExtensionsAsyncKt$waitForDismiss$2", f = "NavigationRouterExtensionsAsync.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigationRouterExtensionsAsyncKt$waitForDismiss$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NavigationRouterExtensionsAsyncKt$waitForDismiss$2 navigationRouterExtensionsAsyncKt$waitForDismiss$2 = new NavigationRouterExtensionsAsyncKt$waitForDismiss$2(2, continuation);
        navigationRouterExtensionsAsyncKt$waitForDismiss$2.L$0 = obj;
        return navigationRouterExtensionsAsyncKt$waitForDismiss$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationRouterExtensionsAsyncKt$waitForDismiss$2) create((Lifecycle.Event) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Lifecycle.Event event = (Lifecycle.Event) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(event == Lifecycle.Event.ON_DESTROY);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
