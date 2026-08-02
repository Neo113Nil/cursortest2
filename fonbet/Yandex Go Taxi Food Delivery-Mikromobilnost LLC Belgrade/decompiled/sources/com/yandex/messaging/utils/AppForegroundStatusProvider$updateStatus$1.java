package com.yandex.messaging.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.utils.AppForegroundStatusProvider$updateStatus$1", f = "AppForegroundStatusProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AppForegroundStatusProvider$updateStatus$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppForegroundStatusProvider$updateStatus$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AppForegroundStatusProvider$updateStatus$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AppForegroundStatusProvider$updateStatus$1 appForegroundStatusProvider$updateStatus$1 = (AppForegroundStatusProvider$updateStatus$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        appForegroundStatusProvider$updateStatus$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        r0 r0Var = bVar.d;
        Boolean valueOf = Boolean.valueOf(bVar.a());
        r0Var.getClass();
        r0Var.m(null, valueOf);
        return zy11.a;
    }
}
