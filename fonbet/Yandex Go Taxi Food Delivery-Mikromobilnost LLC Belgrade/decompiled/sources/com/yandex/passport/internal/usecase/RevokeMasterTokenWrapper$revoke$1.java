package com.yandex.passport.internal.usecase;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.usecase.RevokeMasterTokenWrapper$revoke$1", f = "RevokeMasterTokenWrapper.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RevokeMasterTokenWrapper$revoke$1 extends SuspendLambda implements wls {
    final /* synthetic */ c1 $params;
    int label;
    final /* synthetic */ g1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevokeMasterTokenWrapper$revoke$1(g1 g1Var, c1 c1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = g1Var;
        this.$params = c1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RevokeMasterTokenWrapper$revoke$1(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RevokeMasterTokenWrapper$revoke$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        f1 f1Var = this.this$0.a;
        c1 c1Var = this.$params;
        this.label = 1;
        Object a = f1Var.a(c1Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
