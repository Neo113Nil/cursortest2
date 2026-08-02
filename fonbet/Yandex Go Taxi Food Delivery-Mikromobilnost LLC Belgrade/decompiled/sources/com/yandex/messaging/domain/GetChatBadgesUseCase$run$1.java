package com.yandex.messaging.domain;

import defpackage.bn4;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vun;
import defpackage.xm4;
import defpackage.ym4;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvun;", "employeeInfo", "Lj3b;", "chatInfo", "", "Lcn4;", "<anonymous>", "(Lvun;Lj3b;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.GetChatBadgesUseCase$run$1", f = "GetChatBadgesUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetChatBadgesUseCase$run$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetChatBadgesUseCase$run$1 getChatBadgesUseCase$run$1 = new GetChatBadgesUseCase$run$1(3, (Continuation) obj3);
        getChatBadgesUseCase$run$1.L$0 = (vun) obj;
        getChatBadgesUseCase$run$1.L$1 = (j3b) obj2;
        return getChatBadgesUseCase$run$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        vun vunVar = (vun) this.L$0;
        j3b j3bVar = (j3b) this.L$1;
        ArrayList arrayList = new ArrayList();
        boolean z = j3bVar.B;
        boolean z2 = j3bVar.C;
        if (z) {
            if (!z2) {
                arrayList.add(new xm4(0));
            }
            if (z2 && (vunVar == null || !vunVar.j)) {
                arrayList.add(new bn4(0));
            }
        }
        if (j3bVar.F) {
            arrayList.add(new ym4());
        }
        return arrayList;
    }
}
