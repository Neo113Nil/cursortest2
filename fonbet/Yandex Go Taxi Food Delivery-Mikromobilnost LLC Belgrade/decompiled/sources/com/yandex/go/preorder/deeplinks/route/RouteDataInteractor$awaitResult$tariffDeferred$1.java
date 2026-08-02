package com.yandex.go.preorder.deeplinks.route;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w1l0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lw1l0;", "<anonymous>", "(Ltse;)Lw1l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.deeplinks.route.RouteDataInteractor$awaitResult$tariffDeferred$1", f = "RouteDataInteractor.kt", l = {128}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RouteDataInteractor$awaitResult$tariffDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ noh $awaitTariffsForZoneDeferred;
    final /* synthetic */ IntentData $intentData;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDataInteractor$awaitResult$tariffDeferred$1(c cVar, IntentData intentData, noh nohVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$intentData = intentData;
        this.$awaitTariffsForZoneDeferred = nohVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDataInteractor$awaitResult$tariffDeferred$1(this.this$0, this.$intentData, this.$awaitTariffsForZoneDeferred, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDataInteractor$awaitResult$tariffDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        IntentData intentData = this.$intentData;
        noh nohVar = this.$awaitTariffsForZoneDeferred;
        this.label = 1;
        cVar.getClass();
        boolean z = intentData.t;
        String str = intentData.f;
        String str2 = z ? "multiclass" : intentData.g;
        Object b = ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0)) ? cVar.b(nohVar, this) : new w1l0(str2, str);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
