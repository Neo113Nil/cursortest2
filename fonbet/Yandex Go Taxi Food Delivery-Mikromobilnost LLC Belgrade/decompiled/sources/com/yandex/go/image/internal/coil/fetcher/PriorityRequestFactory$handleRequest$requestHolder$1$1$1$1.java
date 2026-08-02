package com.yandex.go.image.internal.coil.fetcher;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00020\u0003H\n"}, d2 = {"Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.internal.coil.fetcher.PriorityRequestFactory$handleRequest$requestHolder$1$1$1$1", f = "PriorityRequestFactory.kt", l = {106}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class PriorityRequestFactory$handleRequest$requestHolder$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $requestFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriorityRequestFactory$handleRequest$requestHolder$1$1$1$1(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$requestFactory = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PriorityRequestFactory$handleRequest$requestHolder$1$1$1$1(this.$requestFactory, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PriorityRequestFactory$handleRequest$requestHolder$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        tls tlsVar = this.$requestFactory;
        this.label = 1;
        Object invoke = tlsVar.invoke(this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
