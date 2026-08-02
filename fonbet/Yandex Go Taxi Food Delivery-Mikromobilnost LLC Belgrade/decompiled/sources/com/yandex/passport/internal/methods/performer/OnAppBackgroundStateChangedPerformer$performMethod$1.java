package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.a2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.OnAppBackgroundStateChangedPerformer$performMethod$1", f = "OnAppBackgroundStateChangedPerformer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class OnAppBackgroundStateChangedPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ a2 $method;
    int label;
    final /* synthetic */ y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnAppBackgroundStateChangedPerformer$performMethod$1(y0 y0Var, a2 a2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y0Var;
        this.$method = a2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnAppBackgroundStateChangedPerformer$performMethod$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OnAppBackgroundStateChangedPerformer$performMethod$1 onAppBackgroundStateChangedPerformer$performMethod$1 = (OnAppBackgroundStateChangedPerformer$performMethod$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        onAppBackgroundStateChangedPerformer$performMethod$1.invokeSuspend(zy11Var);
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
        com.yandex.passport.internal.common.a aVar = this.this$0.a;
        Boolean bool = (Boolean) this.$method.b.c;
        bool.getClass();
        kotlinx.coroutines.flow.r0 r0Var = ((com.yandex.passport.internal.common.b) aVar).a;
        r0Var.getClass();
        r0Var.m(null, bool);
        return zy11.a;
    }
}
