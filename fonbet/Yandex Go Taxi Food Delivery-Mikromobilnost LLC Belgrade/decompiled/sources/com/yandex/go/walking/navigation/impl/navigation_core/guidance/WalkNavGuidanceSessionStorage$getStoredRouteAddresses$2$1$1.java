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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ln541;", "<anonymous>", "(Ltse;)Ln541;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.navigation_core.guidance.WalkNavGuidanceSessionStorage$getStoredRouteAddresses$2$1$1", f = "WalkNavGuidanceSessionStorage.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceSessionStorage$getStoredRouteAddresses$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $serializedAddresses;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceSessionStorage$getStoredRouteAddresses$2$1$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$serializedAddresses = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavGuidanceSessionStorage$getStoredRouteAddresses$2$1$1(this.this$0, this.$serializedAddresses, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavGuidanceSessionStorage$getStoredRouteAddresses$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        String str = this.$serializedAddresses;
        List list = (List) ((xnt) e41Var.a).c(str, e41Var.b);
        if (list.size() >= 2) {
            return new n541(list);
        }
        return null;
    }
}
