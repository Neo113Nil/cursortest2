package com.yandex.messaging.internal.team.gaps;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/messaging/core/net/entities/UserGap;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.team.gaps.GetUserGapsUseCase$execute$2", f = "GetUserGapsUseCase.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetUserGapsUseCase$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserGapsUseCase$execute$2(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetUserGapsUseCase$execute$2(this.this$0, this.$userId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetUserGapsUseCase$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            String str = this.$userId;
            this.label = 1;
            obj = c.a(cVar, str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        List list = (List) obj;
        this.this$0.d.y(this.$userId, list);
        return list;
    }
}
