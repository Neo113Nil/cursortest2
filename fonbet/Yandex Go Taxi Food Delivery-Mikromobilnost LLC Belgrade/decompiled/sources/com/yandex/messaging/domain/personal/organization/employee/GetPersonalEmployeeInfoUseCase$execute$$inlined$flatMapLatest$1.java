package com.yandex.messaging.domain.personal.organization.employee;

import defpackage.gbb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.personal.organization.employee.GetPersonalEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1", f = "GetPersonalEmployeeInfoUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetPersonalEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPersonalEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetPersonalEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1 getPersonalEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1 = new GetPersonalEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        getPersonalEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getPersonalEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1.L$1 = obj2;
        return getPersonalEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            g X = e.X(gbb1.d(this.this$0.b), new GetPersonalEmployeeInfoUseCase$execute$lambda$1$$inlined$flatMapLatest$1((String) this.L$1, null));
            this.label = 1;
            if (e.u(X, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
