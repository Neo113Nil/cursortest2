package com.yandex.fintechsdk.core.navigation.impl.api.router;

import defpackage.ht10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xfl0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.core.navigation.impl.api.router.RouterImpl$enqueueNavigationCommand$1", f = "RouterImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RouterImpl$enqueueNavigationCommand$1 extends SuspendLambda implements wls {
    final /* synthetic */ xfl0 $command;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterImpl$enqueueNavigationCommand$1(a aVar, xfl0 xfl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$command = xfl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouterImpl$enqueueNavigationCommand$1(this.this$0, this.$command, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RouterImpl$enqueueNavigationCommand$1 routerImpl$enqueueNavigationCommand$1 = (RouterImpl$enqueueNavigationCommand$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        routerImpl$enqueueNavigationCommand$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        xfl0 xfl0Var = this.$command;
        ht10 ht10Var = aVar.c;
        if (ht10Var == null) {
            aVar.d.addLast(xfl0Var);
        } else {
            a.c(xfl0Var, ht10Var);
        }
        return zy11.a;
    }
}
