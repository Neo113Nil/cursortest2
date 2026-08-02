package com.yandex.go.navigator.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pe50;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lpe50;", "navigatorRoute", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lpe50;)Lpe50;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.ui.NavigatorPinsController$attach$2", f = "NavigatorPinsController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorPinsController$attach$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NavigatorPinsController$attach$2 navigatorPinsController$attach$2 = new NavigatorPinsController$attach$2(3, (Continuation) obj3);
        navigatorPinsController$attach$2.L$0 = (pe50) obj2;
        return navigatorPinsController$attach$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pe50 pe50Var = (pe50) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return pe50Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
