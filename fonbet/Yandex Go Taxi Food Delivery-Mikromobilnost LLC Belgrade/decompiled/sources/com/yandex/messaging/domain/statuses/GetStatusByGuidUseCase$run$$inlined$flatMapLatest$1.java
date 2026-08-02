package com.yandex.messaging.domain.statuses;

import defpackage.cl21;
import defpackage.d9g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.statuses.GetStatusByGuidUseCase$run$$inlined$flatMapLatest$1", f = "GetStatusByGuidUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetStatusByGuidUseCase$run$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $userGuid$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStatusByGuidUseCase$run$$inlined$flatMapLatest$1(String str, Continuation continuation) {
        super(3, continuation);
        this.$userGuid$inlined = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetStatusByGuidUseCase$run$$inlined$flatMapLatest$1 getStatusByGuidUseCase$run$$inlined$flatMapLatest$1 = new GetStatusByGuidUseCase$run$$inlined$flatMapLatest$1(this.$userGuid$inlined, (Continuation) obj3);
        getStatusByGuidUseCase$run$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getStatusByGuidUseCase$run$$inlined$flatMapLatest$1.L$1 = obj2;
        return getStatusByGuidUseCase$run$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        vpr vprVar = (vpr) this.L$0;
        tpr a = ((j) ((d9g) ((cl21) this.L$1)).t0.get()).a(this.$userGuid$inlined);
        this.label = 1;
        kotlinx.coroutines.flow.e.w(vprVar);
        Object collect = a.collect(new g(vprVar), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
