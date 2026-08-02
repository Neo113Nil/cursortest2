package com.yandex.messaging.domain.personal.organization.employee;

import defpackage.a7t;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.uun;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.personal.organization.employee.GetEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1", f = "GetEmployeeInfoUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ a7t $params$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1(Continuation continuation, a7t a7tVar) {
        super(3, continuation);
        this.$params$inlined = a7tVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1 getEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1 = new GetEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1((Continuation) obj3, this.$params$inlined);
        getEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1.L$1 = obj2;
        return getEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            uun uunVar = (uun) ((d9g) ((cl21) this.L$1)).O0.get();
            String str = this.$params$inlined.a;
            uunVar.getClass();
            tpr t = e.t(new rol0(new EmployeeController$getCurrentEmployeeFlow$1(uunVar, str, false, null)));
            this.label = 1;
            if (e.u(t, vprVar, this) == coroutineSingletons) {
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
