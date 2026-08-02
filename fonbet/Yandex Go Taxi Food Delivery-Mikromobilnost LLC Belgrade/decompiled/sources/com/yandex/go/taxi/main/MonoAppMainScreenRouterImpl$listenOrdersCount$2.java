package com.yandex.go.taxi.main;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzy11;", "<unused var>", "Lcom/yandex/go/navigation/screen/api/Screen;", "currentScreen", "Lwl40;", "", "<anonymous>", "(VLcom/yandex/go/navigation/screen/api/Screen;Lru/yandex/taxi/multiorder/multi/MultiOrderHolder;Z)Lcom/yandex/go/navigation/screen/api/Screen;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.main.MonoAppMainScreenRouterImpl$listenOrdersCount$2", f = "MonoAppMainScreenRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MonoAppMainScreenRouterImpl$listenOrdersCount$2 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj4).getClass();
        MonoAppMainScreenRouterImpl$listenOrdersCount$2 monoAppMainScreenRouterImpl$listenOrdersCount$2 = new MonoAppMainScreenRouterImpl$listenOrdersCount$2(5, (Continuation) obj5);
        monoAppMainScreenRouterImpl$listenOrdersCount$2.L$0 = (Screen) obj2;
        return monoAppMainScreenRouterImpl$listenOrdersCount$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Screen screen = (Screen) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return screen;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
