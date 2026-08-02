package com.yandex.messaging.domain.chat;

import defpackage.bms;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lw4b0;", "organizations", "", "currentOrgId", "Lj3b;", "chatInfo", "", "<anonymous>", "(Ljava/util/List;JLj3b;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.chat.IsOrganizationUpdateAvailableUseCase$run$1", f = "IsOrganizationUpdateAvailableUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class IsOrganizationUpdateAvailableUseCase$run$1 extends SuspendLambda implements bms {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj2).longValue();
        IsOrganizationUpdateAvailableUseCase$run$1 isOrganizationUpdateAvailableUseCase$run$1 = new IsOrganizationUpdateAvailableUseCase$run$1(4, (Continuation) obj4);
        isOrganizationUpdateAvailableUseCase$run$1.L$0 = (List) obj;
        isOrganizationUpdateAvailableUseCase$run$1.J$0 = longValue;
        isOrganizationUpdateAvailableUseCase$run$1.L$1 = (j3b) obj3;
        return isOrganizationUpdateAvailableUseCase$run$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = (List) this.L$0;
        long j = this.J$0;
        j3b j3bVar = (j3b) this.L$1;
        return (!j3bVar.q || j3bVar.C) ? Boolean.FALSE : j != 0 ? Boolean.FALSE : Boolean.valueOf(!list.isEmpty());
    }
}
