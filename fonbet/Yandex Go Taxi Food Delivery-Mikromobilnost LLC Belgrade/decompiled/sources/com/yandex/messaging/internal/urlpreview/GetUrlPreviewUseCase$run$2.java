package com.yandex.messaging.internal.urlpreview;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.th21;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/messaging/core/net/entities/GetUrlPreviewResponse;", "<anonymous>", "(Ltse;)Lcom/yandex/messaging/core/net/entities/GetUrlPreviewResponse;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.urlpreview.GetUrlPreviewUseCase$run$2", f = "GetUrlPreviewUseCase.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetUrlPreviewUseCase$run$2 extends SuspendLambda implements wls {
    final /* synthetic */ th21 $params;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUrlPreviewUseCase$run$2(a aVar, th21 th21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$params = th21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetUrlPreviewUseCase$run$2(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetUrlPreviewUseCase$run$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        a aVar = this.this$0;
        th21 th21Var = this.$params;
        this.label = 1;
        Object c = a.c(aVar, th21Var, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
