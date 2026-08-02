package com.yandex.go.navigator.repository;

import defpackage.bms;
import defpackage.hf50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "arrivalTime", "streetName", "currentRouteId", "Lhf50;", "<anonymous>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhf50;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.repository.NavigatorStateRepositoryImpl$navigatorState$1$2", f = "NavigatorStateRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorStateRepositoryImpl$navigatorState$1$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    public NavigatorStateRepositoryImpl$navigatorState$1$2() {
        super(4, null);
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        NavigatorStateRepositoryImpl$navigatorState$1$2 navigatorStateRepositoryImpl$navigatorState$1$2 = new NavigatorStateRepositoryImpl$navigatorState$1$2(4, (Continuation) obj4);
        navigatorStateRepositoryImpl$navigatorState$1$2.L$0 = (String) obj;
        navigatorStateRepositoryImpl$navigatorState$1$2.L$1 = (String) obj2;
        navigatorStateRepositoryImpl$navigatorState$1$2.L$2 = (String) obj3;
        return navigatorStateRepositoryImpl$navigatorState$1$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        String str2 = (String) this.L$1;
        String str3 = (String) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new hf50(str3, str, str2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
