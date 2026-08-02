package com.yandex.go.walking.navigation.impl.navigation_core.guidance;

import defpackage.e41;
import defpackage.mvg;
import defpackage.n541;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.navigation_core.guidance.WalkNavGuidanceSessionStorage$storeRouteAddresses$serializedAddresses$1", f = "WalkNavGuidanceSessionStorage.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceSessionStorage$storeRouteAddresses$serializedAddresses$1 extends SuspendLambda implements wls {
    final /* synthetic */ n541 $routeAddresses;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceSessionStorage$storeRouteAddresses$serializedAddresses$1(c cVar, n541 n541Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$routeAddresses = n541Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavGuidanceSessionStorage$storeRouteAddresses$serializedAddresses$1(this.this$0, this.$routeAddresses, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavGuidanceSessionStorage$storeRouteAddresses$serializedAddresses$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e41 e41Var = this.this$0.b;
        List list = this.$routeAddresses.a;
        return ((xnt) e41Var.a).e(list, e41Var.b);
    }
}
