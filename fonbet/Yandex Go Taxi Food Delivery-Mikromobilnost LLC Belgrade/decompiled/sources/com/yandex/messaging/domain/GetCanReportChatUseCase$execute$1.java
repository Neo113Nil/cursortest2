package com.yandex.messaging.domain;

import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj3b;", "info", "", "orgId", "", "<anonymous>", "(Lj3b;J)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.GetCanReportChatUseCase$execute$1", f = "GetCanReportChatUseCase.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetCanReportChatUseCase$execute$1 extends SuspendLambda implements zls {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCanReportChatUseCase$execute$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj2).longValue();
        GetCanReportChatUseCase$execute$1 getCanReportChatUseCase$execute$1 = new GetCanReportChatUseCase$execute$1(this.this$0, (Continuation) obj3);
        getCanReportChatUseCase$execute$1.L$0 = (j3b) obj;
        getCanReportChatUseCase$execute$1.J$0 = longValue;
        return getCanReportChatUseCase$execute$1.invokeSuspend(zy11.a);
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
        j3b j3bVar = (j3b) this.L$0;
        long j = this.J$0;
        b bVar = this.this$0;
        this.label = 1;
        Object a = b.a(bVar, j3bVar, j, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
