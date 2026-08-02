package com.yandex.messaging.domain.user;

import defpackage.b6t;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qp21;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isDeletedGuest", "", "currentOrgId", "Lqp21;", "userNameResult", "Lcom/yandex/messaging/domain/user/DeletedShownStatus;", "<anonymous>", "(ZJLqp21;)Lcom/yandex/messaging/domain/user/DeletedShownStatus;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.user.GetDeletedStatusUseCase$run$1", f = "GetDeletedStatusUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetDeletedStatusUseCase$run$1 extends SuspendLambda implements bms {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj).getClass();
        long longValue = ((Number) obj2).longValue();
        GetDeletedStatusUseCase$run$1 getDeletedStatusUseCase$run$1 = new GetDeletedStatusUseCase$run$1(4, (Continuation) obj4);
        getDeletedStatusUseCase$run$1.J$0 = longValue;
        getDeletedStatusUseCase$run$1.L$0 = (qp21) obj3;
        return getDeletedStatusUseCase$run$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        long j = this.J$0;
        qp21 qp21Var = (qp21) this.L$0;
        boolean z = j == 0;
        int i = b6t.a[qp21Var.b.ordinal()];
        if (i == 1) {
            return z ? qp21Var.a != null ? DeletedShownStatus.DeletedAccount : DeletedShownStatus.EmptyStatus : DeletedShownStatus.DeletedInOrg;
        }
        if (i == 2 || i == 3) {
            return DeletedShownStatus.NormalStatus;
        }
        w511.b();
        return null;
    }
}
