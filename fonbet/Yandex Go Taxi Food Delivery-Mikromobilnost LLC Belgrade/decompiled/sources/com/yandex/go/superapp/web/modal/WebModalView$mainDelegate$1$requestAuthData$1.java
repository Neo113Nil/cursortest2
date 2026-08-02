package com.yandex.go.superapp.web.modal;

import defpackage.go60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.web.modal.WebModalView$mainDelegate$1$requestAuthData$1", f = "WebModalView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WebModalView$mainDelegate$1$requestAuthData$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $callback;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebModalView$mainDelegate$1$requestAuthData$1(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$callback = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebModalView$mainDelegate$1$requestAuthData$1 webModalView$mainDelegate$1$requestAuthData$1 = new WebModalView$mainDelegate$1$requestAuthData$1(this.$callback, continuation);
        webModalView$mainDelegate$1$requestAuthData$1.L$0 = obj;
        return webModalView$mainDelegate$1$requestAuthData$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebModalView$mainDelegate$1$requestAuthData$1 webModalView$mainDelegate$1$requestAuthData$1 = (WebModalView$mainDelegate$1$requestAuthData$1) create((Pair) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webModalView$mainDelegate$1$requestAuthData$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$callback.invoke(new go60((String) pair.getFirst(), (String) pair.getSecond()));
        return zy11.a;
    }
}
