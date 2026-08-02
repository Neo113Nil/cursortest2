package com.yandex.passport.data.network;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/data/network/ba;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.data.network.GetUserInfoRequest$run$2$1", f = "GetUserInfoRequest.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetUserInfoRequest$run$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ v9 $params;
    int label;
    final /* synthetic */ da this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserInfoRequest$run$2$1(da daVar, v9 v9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = daVar;
        this.$params = v9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetUserInfoRequest$run$2$1(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetUserInfoRequest$run$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        da daVar = this.this$0;
        v9 v9Var = this.$params;
        this.label = 1;
        daVar.getClass();
        Serializable e = com.yandex.passport.data.network.core.a.e(daVar, v9Var, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
