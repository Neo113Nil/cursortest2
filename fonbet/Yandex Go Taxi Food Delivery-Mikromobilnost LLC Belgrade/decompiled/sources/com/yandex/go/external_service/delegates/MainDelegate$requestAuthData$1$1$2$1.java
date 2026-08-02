package com.yandex.go.external_service.delegates;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.v5o;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lzy11;", "", "e", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.external_service.delegates.MainDelegate$requestAuthData$1$1$2$1", f = "MainDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainDelegate$requestAuthData$1$1$2$1 extends SuspendLambda implements zls {
    final /* synthetic */ tls $callback;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainDelegate$requestAuthData$1$1$2$1(tls tlsVar, Continuation continuation) {
        super(3, continuation);
        this.$callback = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainDelegate$requestAuthData$1$1$2$1 mainDelegate$requestAuthData$1$1$2$1 = new MainDelegate$requestAuthData$1$1$2$1(this.$callback, (Continuation) obj3);
        mainDelegate$requestAuthData$1$1$2$1.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        mainDelegate$requestAuthData$1$1$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        jst.e.k(th, "Failed to pass auth data to eatskit");
        this.$callback.invoke(new v5o(th));
        return zy11.a;
    }
}
