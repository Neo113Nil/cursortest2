package com.yandex.go.scooters.domain;

import defpackage.l2o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oqm0;
import defpackage.tqm0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lzuo0;", "it", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$1$1$1", f = "ScootersCurrentSessionStateAdapterRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ScootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tqm0 $scootersActiveOrdersStateUpdateInteractor;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$1$1$1(tqm0 tqm0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersActiveOrdersStateUpdateInteractor = tqm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$1$1$1 scootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$1$1$1 = new ScootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$1$1$1(this.$scootersActiveOrdersStateUpdateInteractor, continuation);
        scootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$1$1$1.L$0 = obj;
        return scootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$1$1$1 scootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$1$1$1 = (ScootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$1$1$1) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersCurrentSessionStateAdapterRepositoryImpl$currentSessionsStateFlow$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tqm0 tqm0Var = this.$scootersActiveOrdersStateUpdateInteractor;
        tqm0Var.getClass();
        tqm0Var.a(!list.isEmpty() ? new oqm0(list) : l2o0.a);
        return zy11.a;
    }
}
